package X;

import android.content.Context;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;

/* renamed from: X.AbY, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23518AbY implements XD9 {
    public EGLContext A00;
    public Object A01;
    public C9P2 A02;
    public final C225369wz A03;
    public final AK4 A04;

    @Override // X.XD9
    public final boolean CLF() {
        return true;
    }

    @Override // X.XD9
    public final InterfaceC72007XEv ALV(Context context, EGLContext eGLContext, EGLDisplay eGLDisplay, EGLSurface eGLSurface, InterfaceC178897x1 interfaceC178897x1, C179877yd c179877yd, MYB myb, WDI wdi, MediaComposition mediaComposition, U7W u7w, Integer num) {
        mediaComposition.getClass();
        C9P2 c9p2 = new C9P2(context, eGLContext, interfaceC178897x1, c179877yd, wdi, mediaComposition, this.A04, u7w, this.A01);
        this.A02 = c9p2;
        if (this.A03 != null) {
            c9p2.A0G.BQq();
        }
        return this.A02;
    }

    @Override // X.XD9
    public final EGLContext BuP() {
        return this.A00;
    }

    public C23518AbY(AK4 ak4) {
        this.A01 = null;
        this.A00 = null;
        this.A04 = ak4;
        this.A03 = null;
    }

    public C23518AbY(C225369wz c225369wz, AK4 ak4) {
        this.A01 = null;
        this.A00 = null;
        this.A04 = ak4;
        this.A03 = c225369wz;
    }
}
