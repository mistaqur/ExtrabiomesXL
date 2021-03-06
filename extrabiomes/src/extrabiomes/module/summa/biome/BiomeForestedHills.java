/**
 * This work is licensed under the Creative Commons
 * Attribution-ShareAlike 3.0 Unported License. To view a copy of this
 * license, visit http://creativecommons.org/licenses/by-sa/3.0/.
 */

package extrabiomes.module.summa.biome;

import net.minecraft.src.BiomeDecorator;
import net.minecraft.src.BiomeGenBase;
import net.minecraft.src.EntityWolf;
import net.minecraft.src.SpawnListEntry;

class BiomeForestedHills extends ExtrabiomeGenBase {

	public BiomeForestedHills() {
		super(Biome.FORESTEDHILLS.getBiomeID());

		setBiomeName("Forested Hills");

		temperature = BiomeGenBase.forest.temperature - 0.1F;
		rainfall = BiomeGenBase.forest.rainfall;

		spawnableCreatureList.add(new SpawnListEntry(EntityWolf.class,
				5, 4, 4));
	}

	@Override
	protected BiomeDecorator createBiomeDecorator() {
		return new CustomBiomeDecorator.Builder(this).treesPerChunk(7)
				.flowersPerChunk(1).grassPerChunk(5).build();
	}

}
