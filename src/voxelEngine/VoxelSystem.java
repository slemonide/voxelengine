package voxelEngine;

import com.jme3.app.state.AppState;
import com.jme3.bullet.control.RigidBodyControl;
import com.jme3.export.Savable;
import com.jme3.material.Material;
import com.jme3.math.Vector3f;
import com.jme3.scene.Node;

/**
 *
 * @author francois
 */
public interface VoxelSystem extends AppState, Savable {
    
    Node getNode();
    int getSystemHeight();
    void putBlock(Vector3f location, int type);
    void removeBlock(Vector3f location);
    int getHeight(int x, int z);
    void setPlayerLocation(Vector3f location);
    Integer getBlock(Vector3f location);
    Vector3f getPointedBlockLocation(Vector3f collisionContactPoint, boolean getNeighborLocation);
    
    
    void notifyUpdate(Vector3f translation, int side, boolean refreshDisplay);
    void refreshDisplay(Vector3f translation, int side);
    void externalPropagation(Vector3f translation, int chunkSide,
                             int x, int y, int z, int pValue, int voxelSide);
    void updatePropagation(Vector3f translation);
    int getLightVal(Vector3f translation, int side, int x, int y, int z);
    VoxelFace getVoxel(Vector3f translation, int side, int x, int y, int z);

    void addPhysicsSpace(RigidBodyControl rigidBodyControl);
    void removePhysicsSpace(RigidBodyControl rigidBodyControl);
    int getVoxelFaces(int voxelType, int side);
    Material getMaterial(int type, int light);

    void destroy();
}
