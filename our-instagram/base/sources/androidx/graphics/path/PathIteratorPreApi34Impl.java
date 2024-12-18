package androidx.graphics.path;

import android.graphics.Path;

/* loaded from: classes10.dex */
public abstract class PathIteratorPreApi34Impl {
    private final native long createInternalPathIterator(Path path, int i, float f);

    private final native void destroyInternalPathIterator(long j);

    private final native boolean internalPathIteratorHasNext(long j);

    private final native int internalPathIteratorNext(long j, float[] fArr, int i);

    private final native int internalPathIteratorPeek(long j);

    private final native int internalPathIteratorRawSize(long j);

    private final native int internalPathIteratorSize(long j);

    static {
        System.loadLibrary("androidx.graphics.path");
    }
}
