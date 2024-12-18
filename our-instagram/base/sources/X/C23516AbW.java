package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filter.BaseFilter;
import com.instagram.filterkit.filter.VideoFilter;
import com.instagram.util.creation.ShaderBridge;
import java.util.concurrent.TimeUnit;

/* renamed from: X.AbW, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23516AbW implements InterfaceC72007XEv {
    public SurfaceTexture A00;
    public C9NA A01;
    public final int A02;
    public final int A03;
    public final Context A04;
    public final EGLContext A05;
    public final EGLDisplay A06;
    public final EGLSurface A07;
    public final UserSession A08;
    public final BaseFilter A09;
    public final VideoFilter A0A;
    public final XOT A0B;
    public final C9N6 A0C;

    @Override // X.InterfaceC72007XEv
    public final void A8L(MediaEffect mediaEffect, int i) {
    }

    @Override // X.InterfaceC72007XEv
    public final void AAf(int i) {
    }

    @Override // X.InterfaceC72007XEv
    public final /* synthetic */ void DMH(int i) {
    }

    @Override // X.InterfaceC72007XEv
    public final void DXA() {
    }

    @Override // X.InterfaceC72007XEv
    public final void DXB() {
    }

    @Override // X.InterfaceC72007XEv
    public final void EFF(MediaEffect mediaEffect, int i) {
    }

    @Override // X.InterfaceC72007XEv
    public final /* synthetic */ void EZt(InterfaceC25162BBi interfaceC25162BBi) {
    }

    @Override // X.InterfaceC72007XEv
    public final void EaP(Surface surface, VN4 vn4, int i) {
    }

    @Override // X.InterfaceC72007XEv
    public final void FAM(int i, Bitmap bitmap) {
    }

    @Override // X.InterfaceC72007XEv
    public final void FB9(C68685VaL c68685VaL, int i) {
    }

    @Override // X.InterfaceC72007XEv
    public final /* synthetic */ void cancel() {
    }

    @Override // X.InterfaceC72007XEv
    public final void flush() {
    }

    @Override // X.InterfaceC72007XEv
    public final void APs(int i, long j) {
        EGLDisplay eGLDisplay = this.A06;
        EGLSurface eGLSurface = this.A07;
        EGLExt.eglPresentationTimeANDROID(eGLDisplay, eGLSurface, j);
        EGL14.eglSwapBuffers(eGLDisplay, eGLSurface);
    }

    @Override // X.InterfaceC72007XEv
    public final void AQh(long j) {
        C9NA c9na = this.A01;
        if (c9na == null) {
            C14360o3.A0F("transcodeTextureRenderer");
            throw C00O.createAndThrow();
        }
        long micros = TimeUnit.NANOSECONDS.toMicros(j);
        c9na.A05(this.A09, this.A0A, micros);
    }

    @Override // X.InterfaceC72007XEv
    public final SurfaceTexture BI8(int i, boolean z) {
        SurfaceTexture surfaceTexture = this.A00;
        if (surfaceTexture == null) {
            C14360o3.A0F("surfaceTexture");
            throw C00O.createAndThrow();
        }
        return surfaceTexture;
    }

    @Override // X.InterfaceC72007XEv
    public final Bitmap ELi(int i) {
        return AbstractC209679Pd.A00(this.A03, this.A02);
    }

    @Override // X.InterfaceC72007XEv
    public final void release() {
        C9NA c9na = this.A01;
        if (c9na == null) {
            C14360o3.A0F("transcodeTextureRenderer");
            throw C00O.createAndThrow();
        }
        c9na.A04();
    }

    public C23516AbW(Context context, EGLContext eGLContext, EGLDisplay eGLDisplay, EGLSurface eGLSurface, UserSession userSession, BaseFilter baseFilter, VideoFilter videoFilter, XOT xot, C9N6 c9n6, int i, int i2) {
        this.A0A = videoFilter;
        this.A09 = baseFilter;
        this.A0B = xot;
        this.A04 = context;
        this.A08 = userSession;
        this.A05 = eGLContext;
        this.A06 = eGLDisplay;
        this.A07 = eGLSurface;
        this.A0C = c9n6;
        this.A03 = i;
        this.A02 = i2;
    }

    @Override // X.InterfaceC72007XEv
    public final void CNZ() {
        ShaderBridge.ensureShaderBridgeLoaded();
        Context context = this.A04;
        EGLContext eGLContext = this.A05;
        UserSession userSession = this.A08;
        C9NA c9na = new C9NA(context, eGLContext, userSession, this.A0B, this.A0C, this.A03, this.A02, false);
        this.A01 = c9na;
        this.A00 = c9na.A03(userSession, this.A09, this.A0A);
    }
}
