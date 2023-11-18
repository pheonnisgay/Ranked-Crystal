package de.cooltechno.rankedcrystal.RankedAlgorithm;

import de.cooltechno.rankedcrystal.RankedCrystal;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;
import java.io.IOException;

public class EloUtil {

    public void saveELO(Player playerA, double ELOA,Player playerB,double ELOB) throws IOException {

        File directory = new File(RankedCrystal.plugin.getDataFolder().getAbsolutePath());
        File fa = new File(directory, playerA.getName() + "-" + "ELO" + ".yml");
        File fb = new File(directory, playerA.getName() + "-" + "ELO" + ".yml");
        FileConfiguration a = YamlConfiguration.loadConfiguration(fa);
        FileConfiguration b = YamlConfiguration.loadConfiguration(fb);


        //doesn't need to be checked if it exists because getElO gets called before which already checks it
        a.set("Ranked.Crystal.ELO", ELOA);
        a.save(fa);

        b.set("Ranked.Crystal.ELO", ELOB);;
        b.save(fb);

    }

    public double getELOa(Player player) throws IOException {
        File f = new File(RankedCrystal.plugin.getDataFolder().getAbsolutePath(), player.getName()+ "-" + "ELO" + ".yml");
        FileConfiguration c = YamlConfiguration.loadConfiguration(f);
        if (!f.exists()){
            f.createNewFile();
            c.set("Ranked.Crystal.ELO", 1000);
            double ELO = 1000;
        }

        double ELO = (int) c.get("Ranked.Crystal.ELO");

        return ELO;

    }

    public double getELOb(Player player) throws IOException {
        File f = new File(RankedCrystal.plugin.getDataFolder().getAbsolutePath(), player.getName()+ "-" + "ELO" + ".yml");
        FileConfiguration c = YamlConfiguration.loadConfiguration(f);
        if (!f.exists()){
            f.createNewFile();
            c.set("Ranked.Crystal.ELO", 1000);
            double ELO = 1000;
        }

        double ELO = (int) c.get("Ranked.Crystal.ELO");
        return ELO;
    }


}
