package com.facebook.onecamera.components.mediapipeline.gl.context.igl;

import X.AnonymousClass810;
import X.C09170dP;
import X.C225269wp;
import X.InterfaceC200678uA;
import com.facebook.jni.HybridData;
import com.facebook.onecamera.components.mediapipeline.gl.context.igl.IglTexture;

/* loaded from: classes4.dex */
public final class IglFrameBuffer implements InterfaceC200678uA {
    public static final C225269wp Companion = new Object();
    public static final String TEXTURE_DESCRIPTION = "IglFrameBufferTexture";
    public final boolean is10Bit;
    public final HybridData mHybridData;
    public final AnonymousClass810 texture;
    public final int frameBufferId = getFrameBufferIdNative();
    public final int width = getWidthNative();
    public final int height = getHeightNative();

    private final native void bindNative();

    private final native int getFrameBufferIdNative();

    private final native int getHeightNative();

    private final native IglTexture getIglTexture();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native int getWidthNative();

    private final native void releaseNative();

    private final native void unbindNative();

    public void lock() {
    }

    public void unlock() {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.9wp, java.lang.Object] */
    static {
        C09170dP.A0C("mediapipeline-igl-context");
    }

    public int getFrameBufferId() {
        return this.frameBufferId;
    }

    @Override // X.InterfaceC200678uA
    public int getHeight() {
        return this.height;
    }

    @Override // X.InterfaceC200678uA
    public AnonymousClass810 getTexture() {
        return this.texture;
    }

    @Override // X.InterfaceC200678uA
    public int getWidth() {
        return this.width;
    }

    @Override // X.InterfaceC200678uA
    public boolean is10Bit() {
        return this.is10Bit;
    }

    @Override // X.InterfaceC200678uA
    public void release() {
        this.texture.A01();
        releaseNative();
    }

    public IglFrameBuffer(HybridData hybridData) {
        this.mHybridData = hybridData;
        final IglTexture iglTexture = getIglTexture();
        this.texture = new AnonymousClass810(iglTexture) { // from class: X.9YP
            public final IglTexture A00;

            /* JADX WARN: Illegal instructions before constructor call */
            {
                /*
                    r5 = this;
                    java.lang.String r1 = "IglFrameBufferTexture"
                    r0 = 1
                    X.C14360o3.A0B(r6, r0)
                    X.811 r4 = new X.811
                    r4.<init>(r1)
                    r4.A08 = r0
                    int r0 = r6.getTarget()
                    r4.A03 = r0
                    int r0 = r6.getHandle()
                    r4.A01 = r0
                    int r0 = r6.getWidth()
                    r4.A04 = r0
                    int r0 = r6.getHeight()
                    r4.A02 = r0
                    java.util.Map r0 = r6.getParams()
                    java.util.Iterator r3 = X.AbstractC166997dE.A15(r0)
                L2d:
                    boolean r0 = r3.hasNext()
                    if (r0 == 0) goto L4d
                    java.util.Map$Entry r1 = X.AbstractC166987dD.A1K(r3)
                    java.lang.Object r0 = r1.getKey()
                    int r2 = X.AbstractC166987dD.A0H(r0)
                    java.lang.Object r0 = r1.getValue()
                    int r1 = X.AbstractC166987dD.A0H(r0)
                    android.util.SparseIntArray r0 = r4.A0B
                    r0.put(r2, r1)
                    goto L2d
                L4d:
                    r5.<init>(r4)
                    r5.A00 = r6
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C9YP.<init>(com.facebook.onecamera.components.mediapipeline.gl.context.igl.IglTexture):void");
            }

            @Override // X.AnonymousClass810
            public final boolean A01() {
                this.A00.release();
                return super.A01();
            }
        };
    }

    @Override // X.InterfaceC200678uA
    public void bind() {
        bindNative();
    }

    @Override // X.InterfaceC200678uA
    public void unbind() {
        unbindNative();
    }
}
