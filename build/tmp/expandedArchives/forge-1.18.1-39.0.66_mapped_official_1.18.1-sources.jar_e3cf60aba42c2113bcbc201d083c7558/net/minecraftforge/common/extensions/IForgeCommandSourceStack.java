/*
 * Minecraft Forge
 * Copyright (c) 2016-2021.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation version 2.1
 * of the License.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */

package net.minecraftforge.common.extensions;

import net.minecraft.advancements.Advancement;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.level.Level;
import net.minecraft.world.scores.Scoreboard;

/**
 * Additional methods for {@link CommandSourceStack} so that commands and arguments can access various things without directly referencing using server specific classes
 */
public interface IForgeCommandSourceStack
{

    private CommandSourceStack self()
    {
        return (CommandSourceStack) this;
    }

    /**
     * @return the scoreboard
     */
    default Scoreboard getScoreboard()
    {
        return self().getServer().getScoreboard();
    }

    /**
     * @return the advancement from the id
     */
    default Advancement getAdvancement(ResourceLocation id)
    {
        return self().getServer().getAdvancements().getAdvancement(id);
    }

    /**
     * @return the recipe manager
     */
    default RecipeManager getRecipeManager()
    {
        return self().getServer().getRecipeManager();
    }

    /**
     * @return the level but without being specifically the server side level
     */
    default Level getUnsidedLevel()
    {
        return self().getLevel();
    }

}
