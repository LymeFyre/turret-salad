package mindustry.content;

import arc.graphics.*;
import arc.math.*;
import arc.struct.*;
import mindustry.*;
import mindustry.entities.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.DrawPart.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.type.unit.*;
import mindustry.world.*;
import mindustry.world.blocks.*;
import mindustry.world.blocks.campaign.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.heat.*;
import mindustry.world.blocks.legacy.*;
import mindustry.world.blocks.liquid.*;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.payloads.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.sandbox.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.blocks.units.*;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;

import static mindustry.Vars.*;
import static mindustry.type.ItemStack.*;

public class Blocks{
    public static Block
    
    //turret
    blast
    
    ;
    
    public static void load(){
    	//turret
    	
    	blast = new ItemTurret("blast"){{
    		requirements(Category.turret, with(Items.silicon, 60, Items.plastanium, 70));
    		ammo( //swarmer blast compound
    			Items.blastCompound, new MissileBulletType(3.7f, 10){{
    				width = 8f;
                    height = 8f;
                    shrinkY = 0f;
                    splashDamageRadius = 30f;
                    splashDamage = 30f * 1.5f;
                    ammoMultiplier = 5f;
                    hitEffect = Fx.blastExplosion;
                    despawnEffect = Fx.blastExplosion;
                    
                    status = StatusEffects.blasted;
                    statusDuration = 60f;
    			}}
    		)
    		
    		shoot = new shootPattern()
    		reload = 30f;
            inaccuracy = 10f;
            range = 240f;
            consumeAmmoOnce = false;
            size = 2;
            scaledHealth = 300;
            shootSound = Sounds.missile;
            envEnabled |= Env.space;

            limitRange(5f);
            coolant = consumeCoolant(0.3f);
    	}};
    }