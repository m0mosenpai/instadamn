package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.view.Surface;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public final class WZC implements InterfaceC72007XEv {
    public SurfaceTexture A02;
    public C81H A03;
    public AnonymousClass810 A04;
    public MYB A05;
    public WDI A06;
    public U7W A07;
    public boolean A08;
    public final C179877yd A09;
    public final List A0B;
    public final float[] A0C;
    public final float[] A0D;
    public final float[] A0E;
    public final float[] A0F;
    public final EGLContext A0G;
    public final EGLDisplay A0H;
    public final EGLSurface A0I;
    public final C180337zN A0J = AbstractC69834VwK.A00();
    public final C201278vB A0A = new C201278vB();
    public int A01 = -12345;
    public int A00 = 0;

    @Override // X.InterfaceC72007XEv
    public final void A8L(MediaEffect mediaEffect, int i) {
    }

    @Override // X.InterfaceC72007XEv
    public final void AAf(int i) {
    }

    @Override // X.InterfaceC72007XEv
    public final void AQh(long j) {
        AbstractC180237zD.A02("onDrawFrame start", new Object[0]);
        List<C81A> list = this.A0B;
        if (!list.isEmpty()) {
            AbstractC1126356r.A07(AbstractC167007dF.A1W(this.A04), null);
            SurfaceTexture surfaceTexture = this.A02;
            float[] fArr = this.A0E;
            surfaceTexture.getTransformMatrix(fArr);
            if (this.A08) {
                AbstractC197988p9.A01(fArr);
            }
            for (C81A c81a : list) {
                long micros = TimeUnit.NANOSECONDS.toMicros(j);
                C201278vB c201278vB = this.A0A;
                c201278vB.A03(this.A04, fArr, this.A0C, this.A0F, this.A0D, j);
                c81a.DCH(c201278vB, micros);
            }
            return;
        }
        SurfaceTexture surfaceTexture2 = this.A02;
        float[] fArr2 = this.A0E;
        surfaceTexture2.getTransformMatrix(fArr2);
        GLES20.glClear(16640);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.A01);
        C9K4 A01 = this.A03.A01();
        A01.A04("uSTMatrix", fArr2);
        A01.A04("uConstMatrix", this.A0C);
        A01.A04("uSceneMatrix", this.A0F);
        A01.A04("uContentTransform", this.A0D);
        A01.A01(this.A0J);
        GLES20.glFinish();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f0  */
    @Override // X.InterfaceC72007XEv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CNZ() {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WZC.CNZ():void");
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
        EGLDisplay eGLDisplay = this.A0H;
        EGLSurface eGLSurface = this.A0I;
        EGLExt.eglPresentationTimeANDROID(eGLDisplay, eGLSurface, j);
        EGL14.eglSwapBuffers(eGLDisplay, eGLSurface);
    }

    @Override // X.InterfaceC72007XEv
    public final Bitmap ELi(int i) {
        WDI wdi = this.A06;
        return AbstractC209679Pd.A00(wdi.A0C, wdi.A0A);
    }

    @Override // X.InterfaceC72007XEv
    public final void FAM(int i, Bitmap bitmap) {
        int i2;
        AbstractC197988p9.A02(this.A0C, this.A06.A07);
        if (!this.A0B.isEmpty()) {
            AnonymousClass810 anonymousClass810 = this.A04;
            AbstractC1126356r.A07(AbstractC167007dF.A1W(anonymousClass810), null);
            i2 = anonymousClass810.A00;
        } else {
            i2 = this.A01;
        }
        GLES20.glBindTexture(3553, i2);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
    }

    @Override // X.InterfaceC72007XEv
    public final void release() {
        Iterator it = this.A0B.iterator();
        while (it.hasNext()) {
            ((C81A) it.next()).DrA();
        }
    }

    public WZC(Context context, EGLContext eGLContext, EGLDisplay eGLDisplay, EGLSurface eGLSurface, C179877yd c179877yd, MYB myb, WDI wdi, MediaComposition mediaComposition, U7W u7w) {
        float[] fArr = new float[16];
        this.A0E = fArr;
        float[] fArr2 = new float[16];
        this.A0C = fArr2;
        float[] fArr3 = new float[16];
        this.A0F = fArr3;
        float[] fArr4 = new float[16];
        this.A0D = fArr4;
        c179877yd.getClass();
        this.A09 = c179877yd;
        this.A06 = wdi;
        this.A0G = eGLContext;
        this.A0H = eGLDisplay;
        this.A0I = eGLSurface;
        boolean z = wdi.A0N;
        this.A08 = z;
        if (z) {
            List list = wdi.A0J;
            if (list == null) {
                list = new ArrayList();
                wdi.A0J = list;
            }
            if (list.isEmpty()) {
                wdi.A0J.add(new C70473WYe(false));
            }
        }
        List list2 = this.A06.A0J;
        this.A0B = list2 == null ? Collections.emptyList() : list2;
        this.A07 = u7w;
        this.A05 = myb;
        if (myb == null && mediaComposition != null) {
            HashMap A07 = mediaComposition.A07(EnumC1125356h.VIDEO);
            A07.getClass();
            File file = ((C1125756l) new ArrayList(((C1125956n) AbstractC31176DnK.A0j(AbstractC166997dE.A14(A07))).A04).get(0)).A04;
            AbstractC1126356r.A06(file);
            this.A05 = AbstractC55147OdA.A02(context, android.net.Uri.fromFile(file).toString(), false);
        }
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr3, 0);
        AbstractC69834VwK.A01(wdi, fArr2, fArr4);
    }

    @Override // X.InterfaceC72007XEv
    public final SurfaceTexture BI8(int i, boolean z) {
        return this.A02;
    }
}
