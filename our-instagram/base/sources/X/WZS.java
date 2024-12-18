package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.HandlerThread;
import android.view.Surface;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public final class WZS implements InterfaceC72004XEs {
    public final /* synthetic */ WZW A00;

    @Override // X.InterfaceC72004XEs
    public final void A8L(MediaEffect mediaEffect, int i) {
    }

    @Override // X.InterfaceC72004XEs
    public final void AAf(int i) {
    }

    @Override // X.InterfaceC72004XEs
    public final void APt(long j) {
    }

    @Override // X.InterfaceC72004XEs
    public final void EFF(MediaEffect mediaEffect, int i) {
    }

    @Override // X.InterfaceC72004XEs
    public final void EGU(int i) {
    }

    @Override // X.InterfaceC72004XEs
    public final void flush() {
    }

    public WZS(WZW wzw) {
        this.A00 = wzw;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.Tyj, java.lang.Object] */
    @Override // X.InterfaceC72004XEs
    public final void AVe() {
        ?? obj = new Object();
        WZW wzw = this.A00;
        new C67628Uti((C66046Tyj) obj, wzw.A06).A00();
        C66048Tyl c66048Tyl = wzw.A07.A0A;
        c66048Tyl.getClass();
        synchronized (c66048Tyl) {
        }
        C69463Vnm c69463Vnm = wzw.A07;
        C68238VJa c68238VJa = c69463Vnm.A09;
        c68238VJa.getClass();
        EGLDisplay eGLDisplay = c68238VJa.A02;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        }
        C68238VJa c68238VJa2 = c69463Vnm.A09;
        c68238VJa2.getClass();
        EGLDisplay eGLDisplay2 = c68238VJa2.A02;
        if (eGLDisplay2 != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroySurface(c68238VJa2.A02, c68238VJa2.A03);
            EGL14.eglDestroyContext(c68238VJa2.A02, c68238VJa2.A01);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(c68238VJa2.A02);
        }
        c68238VJa2.A02 = EGL14.EGL_NO_DISPLAY;
        c68238VJa2.A01 = EGL14.EGL_NO_CONTEXT;
        c68238VJa2.A00 = null;
        c69463Vnm.A09 = null;
        GLES20.glDeleteTextures(1, new int[]{c69463Vnm.A00}, 0);
        c69463Vnm.A00 = -1;
        SurfaceTexture surfaceTexture = c69463Vnm.A02;
        surfaceTexture.getClass();
        surfaceTexture.release();
        c69463Vnm.A02 = null;
        Surface surface = c69463Vnm.A04;
        surface.getClass();
        surface.release();
        c69463Vnm.A04 = null;
        C69331Vld c69331Vld = c69463Vnm.A07;
        c69331Vld.getClass();
        c69331Vld.A00.A02();
        c69463Vnm.A07 = null;
        C69408Vms c69408Vms = c69463Vnm.A08;
        c69408Vms.getClass();
        c69408Vms.A01.A02();
        c69463Vnm.A08 = null;
        List list = c69463Vnm.A0B;
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C200688uB) it.next()).A01();
        }
        List list2 = c69463Vnm.A0B;
        list2.getClass();
        list2.clear();
        c69463Vnm.A0B = null;
        c69463Vnm.A0A = null;
        HandlerThread handlerThread = c69463Vnm.A03;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            c69463Vnm.A03 = null;
        }
        obj.A01();
    }

    @Override // X.InterfaceC72004XEs
    public final String B1p() {
        try {
            return this.A00.A06.A05.getName();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // X.InterfaceC72004XEs
    public final int BaL() {
        WDI wdi = this.A00.A03;
        return (wdi.A0B + wdi.A05) % 360;
    }

    @Override // X.InterfaceC72004XEs
    public final void E5g(Context context, MYB myb, WDI wdi, VN4 vn4, U7W u7w, int i) {
        VE8 ve8 = VE8.CODEC_VIDEO_H264;
        C70124W5f c70124W5f = wdi.A0G;
        if (c70124W5f != null) {
            ve8 = c70124W5f.A04;
        }
        int i2 = wdi.A0C;
        int i3 = wdi.A0A;
        boolean z = false;
        int i4 = 1;
        int i5 = 256;
        int i6 = -1;
        int A01 = wdi.A01();
        int i7 = wdi.A03;
        int i8 = wdi.A02;
        if (c70124W5f != null) {
            i4 = c70124W5f.A03;
            i5 = c70124W5f.A02;
            z = true;
        }
        int i9 = wdi.A0D;
        if (i9 != -1) {
            i6 = i9;
        }
        MediaFormat A00 = VN2.A00(ve8, null, 0, i6, i3, i7, i5, i4, A01, i8, i2, false, z);
        Map map = wdi.A0K;
        if (map != null) {
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                Map.Entry entry = (Map.Entry) A15.next();
                A00.setInteger((String) entry.getKey(), AbstractC43593JPy.A04(entry));
            }
        }
        WZW wzw = this.A00;
        C65831Tuo A02 = U7T.A02(A00, VCV.SURFACE, u7w, ve8.A00, wdi.A0I);
        wzw.A06 = A02;
        A02.A02();
        C179877yd c179877yd = new C179877yd(context.getResources());
        C65831Tuo c65831Tuo = wzw.A06;
        AbstractC1126356r.A07(AbstractC167007dF.A1X(c65831Tuo.A07, C05F.A01), null);
        wzw.A07 = new C69463Vnm(c65831Tuo.A06, c179877yd, wdi);
        wzw.A03 = wdi;
        wzw.A02 = wdi.A0F;
        wzw.A01 = -71000L;
    }

    @Override // X.InterfaceC72004XEs
    public final void EEO(C66029TyR c66029TyR) {
        C65831Tuo c65831Tuo = this.A00.A06;
        c65831Tuo.A08.append("releaseOutputBuffer,");
        c65831Tuo.A04(c66029TyR, c65831Tuo.A0A);
    }

    @Override // X.InterfaceC72004XEs
    public final void EGl(long j) {
        WZW wzw = this.A00;
        boolean z = wzw.A08;
        wzw.A01 = j;
        C69463Vnm c69463Vnm = wzw.A07;
        SurfaceTexture surfaceTexture = c69463Vnm.A02;
        surfaceTexture.getClass();
        float[] fArr = c69463Vnm.A0D;
        surfaceTexture.getTransformMatrix(fArr);
        WDI wdi = c69463Vnm.A06;
        int i = wdi.A08;
        int i2 = wdi.A06;
        C200688uB c200688uB = new C200688uB(i, i2);
        List list = c69463Vnm.A0B;
        list.getClass();
        list.add(c200688uB);
        c69463Vnm.A0C.add(Long.valueOf(j));
        GLES20.glBindFramebuffer(36160, c200688uB.A00);
        GLES20.glViewport(0, 0, i, i2);
        C69331Vld c69331Vld = c69463Vnm.A07;
        c69331Vld.getClass();
        int i3 = c69463Vnm.A00;
        GLES20.glClearColor(1.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i3);
        C9K4 A01 = c69331Vld.A00.A01();
        A01.A04("uSTMatrix", fArr);
        A01.A04("uConstMatrix", c69331Vld.A03);
        A01.A04("uSceneMatrix", c69331Vld.A05);
        A01.A04("uContentTransform", c69331Vld.A04);
        A01.A01(c69331Vld.A01);
        GLES20.glFinish();
        GLES20.glBindFramebuffer(36160, 0);
        c69463Vnm.A05.getClass();
    }

    @Override // X.InterfaceC72004XEs
    public final void Elz() {
        WZW wzw = this.A00;
        if (!wzw.A08) {
            wzw.A08 = true;
            C69463Vnm c69463Vnm = wzw.A07;
            List list = c69463Vnm.A0B;
            list.getClass();
            List list2 = c69463Vnm.A0C;
            AbstractC1126356r.A07(AbstractC167007dF.A1P(list2.size(), list.size()), "Presentation time list and FrameBufferTexture time list should be the same");
            c69463Vnm.A05.getClass();
            for (int size = list.size() - 1; size >= 0; size--) {
                long A0A = AbstractC58320PtC.A0A(list2, (list2.size() - 1) - size);
                int i = ((C200688uB) list.get(size)).A03.A00;
                C69408Vms c69408Vms = c69463Vnm.A08;
                c69408Vms.getClass();
                AbstractC180237zD.A02("onDrawFrame start", new Object[0]);
                WDI wdi = c69408Vms.A02;
                GLES20.glViewport(0, 0, wdi.A0C, wdi.A0A);
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                GLES20.glClear(16640);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, i);
                C9K4 A01 = c69408Vms.A01.A01();
                A01.A04("uSTMatrix", c69408Vms.A05);
                A01.A04("uConstMatrix", c69408Vms.A03);
                A01.A04("uContentTransform", c69408Vms.A04);
                A01.A01(c69408Vms.A00);
                AbstractC180237zD.A02("drawFrame here", new Object[0]);
                GLES20.glBindTexture(3553, -1);
                GLES20.glFinish();
                c69463Vnm.A05.getClass();
                long nanos = TimeUnit.MICROSECONDS.toNanos(A0A);
                C68238VJa c68238VJa = c69463Vnm.A09;
                c68238VJa.getClass();
                EGLExt.eglPresentationTimeANDROID(c68238VJa.A02, c68238VJa.A03, nanos);
                C68238VJa c68238VJa2 = c69463Vnm.A09;
                c68238VJa2.getClass();
                EGL14.eglSwapBuffers(c68238VJa2.A02, c68238VJa2.A03);
            }
        }
        C65831Tuo c65831Tuo = wzw.A06;
        AbstractC1126356r.A07(AbstractC167007dF.A1X(c65831Tuo.A07, C05F.A01), null);
        c65831Tuo.A05.signalEndOfInputStream();
    }

    @Override // X.InterfaceC72004XEs
    public final MediaFormat getOutputFormat() {
        return this.A00.A06.A00;
    }

    @Override // X.InterfaceC72004XEs
    public final C66029TyR AOt(long j) {
        return this.A00.A06.A01(250000L);
    }
}
