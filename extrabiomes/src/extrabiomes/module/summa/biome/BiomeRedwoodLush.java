/**
 * This work is licensed under the Creative Commons
 * Attribution-ShareAlike 3.0 Unported License. To view a copy of this
 * license, visit http://creativecommons.org/licenses/by-sa/3.0/.
 */

package extrabiomes.module.summa.biome;

import net.minecraft.src.BiomeDecorator;

class BiomeRedwoodLush extends ExtrabiomeGenBase {
	public BiomeRedwoodLush() {
		super(Biome.REDWOODLUSH.getBiomeID());

		setColor(0x4AC758);
		setBiomeName("Lush Redwoods");
		temperature = 1.1F;
		rainfall = 1.4F;
		minHeight = 0.9F;
		maxHeight = 1.5F;
	}

	@Override
	protected BiomeDecorator createBiomeDecorator() {
		return new CustomBiomeDecorator.Builder(this).treesPerChunk(17)
				.build();
	}
}
