package voxelEngine;

import voxelEngine.noise.VoxelNoise;
import com.jme3.math.Vector3f;

/**
 *
 * @author francois
 */
public interface Chunk {
    
    void addBlock(int x, int y, int z, int type);
    void removeBlock(int x, int y, int z);
    int getBlock(int x, int y, int z);
    void init(VoxelNoise noise);
    void detach();
    void attach();
    boolean modified();
    Vector3f getTranslation();
    void setTranslation(Vector3f translation);
    void externalUpdate(int side, boolean refreshDisplay);
    void updatePropagation(boolean refreshDisplayInCheckInsideOutPropagation);
    void refreshDisplay();
    void refreshDisplayNoAttach();
    void propagate(int x, int y, int z, int pValue, int side);
    void lightOff();
    int getLightVal(int x, int y, int z);
    VoxelFace getVoxel(int x, int y, int z);
    boolean lightTurnedOff(boolean reset);
    boolean isAttached();
    int getHeight(int x, int z);

}
