package com.facebook.graphservice.interfaces;

import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public interface TreeSerializer {
    Tree deserializeTreeFromByteBuffer(ByteBuffer byteBuffer, Class cls, int i);

    ByteBuffer serializeTreeToByteBuffer(Tree tree);
}
