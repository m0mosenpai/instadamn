package com.facebook.graphservice.serialization;

import X.AbstractC166987dD;
import X.C09270dc;
import X.C18C;
import com.facebook.graphservice.interfaces.Tree;
import com.facebook.graphservice.interfaces.TreeSerializer;
import com.facebook.graphservice.tree.TreeJNI;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public class TreeSerializerJNI implements TreeSerializer {
    public final HybridData mHybridData;

    private native TreeJNI deserializeTreeFromByteBufferNative(ByteBuffer byteBuffer, Class cls, int i, boolean z, boolean z2);

    private native TreeJNI deserializeTreeNative(String str, Class cls, int i, int i2, int i3, boolean z, boolean z2);

    private native int serializeTreeNative(TreeJNI treeJNI, String str, boolean z, boolean z2);

    private native ByteBuffer serializeTreeToByteBufferNative(TreeJNI treeJNI, boolean z);

    @Override // com.facebook.graphservice.interfaces.TreeSerializer
    public Tree deserializeTreeFromByteBuffer(ByteBuffer byteBuffer, Class cls, int i) {
        ByteBuffer byteBuffer2 = byteBuffer;
        if (!byteBuffer.isDirect()) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteBuffer.capacity());
            if (allocateDirect.isDirect()) {
                allocateDirect.put(byteBuffer.duplicate());
                allocateDirect.position(0);
                byteBuffer2 = allocateDirect;
            } else {
                throw AbstractC166987dD.A1D("Direct ByteBuffer is not supported on this platform");
            }
        }
        return deserializeTreeFromByteBufferNative(byteBuffer2, cls, i, false, false);
    }

    static {
        C09270dc.A01("graphservice-jni-serialization");
    }

    public TreeSerializerJNI(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // com.facebook.graphservice.interfaces.TreeSerializer
    public ByteBuffer serializeTreeToByteBuffer(Tree tree) {
        tree.getClass();
        C18C.A0E(tree.isValidGraphServicesJNIModelWithLogging());
        return serializeTreeToByteBufferNative((TreeJNI) tree, false);
    }
}
