package com.facebook.onecamera.components.mediapipeline.gl.context.igl;

import X.AbstractC166987dD;
import X.AnonymousClass810;
import X.C09170dP;
import X.C14360o3;
import X.C225289wr;
import X.InterfaceC200678uA;

/* loaded from: classes4.dex */
public final class IglTextureCreator {
    public static final C225289wr Companion = new Object();
    public final IglContext iglContext;

    public IglTextureCreator(IglContext iglContext) {
        C14360o3.A0B(iglContext, 1);
        this.iglContext = iglContext;
    }

    private final native IglFrameBuffer createFrameBufferNative(IglContext iglContext, boolean z, int i, int i2, int i3, int i4);

    private final native IglTexture createOesTextureNative(IglContext iglContext, int i, int i2);

    public final InterfaceC200678uA createFrameBuffer(int i, int i2, AnonymousClass810 anonymousClass810, boolean z) {
        int i3;
        int i4;
        if (anonymousClass810 != null) {
            i3 = anonymousClass810.A00;
            i4 = anonymousClass810.A01;
            anonymousClass810.A00(i, i2);
        } else {
            i3 = -1;
            i4 = -1;
        }
        IglFrameBuffer createFrameBufferNative = createFrameBufferNative(this.iglContext, z, i, i2, i3, i4);
        if (createFrameBufferNative != null) {
            return createFrameBufferNative;
        }
        throw AbstractC166987dD.A18("failed to create framebuffer natively");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.9wr, java.lang.Object] */
    static {
        C09170dP.A0C("mediapipeline-igl-context");
    }

    public static /* synthetic */ IglTexture createOesTexture$default(IglTextureCreator iglTextureCreator, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return iglTextureCreator.createOesTexture(i, i2);
    }

    public final IglTexture createOesTexture(int i, int i2) {
        IglTexture createOesTextureNative = createOesTextureNative(this.iglContext, i, i2);
        if (createOesTextureNative != null) {
            return createOesTextureNative;
        }
        throw AbstractC166987dD.A18("failed to create oes texture natively");
    }
}
