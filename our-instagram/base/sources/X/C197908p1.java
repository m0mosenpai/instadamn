package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* renamed from: X.8p1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197908p1 extends AbstractC185778Lx implements InterfaceC197918p2, InterfaceC197928p3 {
    public int A00;
    public int A01;
    public SurfaceTexture A03;
    public AnonymousClass810 A04;
    public Surface A05;
    public C179877yd A06;
    public final C22821A4q A07;
    public final float[] A0A = new float[16];
    public final C201278vB A08 = new C201278vB();
    public long A02 = 0;
    public final C201608vp A09 = new C201608vp(false);

    @Override // X.InterfaceC185788Ly
    public final EnumC197888oz BI3() {
        return null;
    }

    @Override // X.InterfaceC185788Ly
    public final String BOj() {
        return AbstractC111324zv.A00(597);
    }

    @Override // X.InterfaceC197918p2
    public final int BqV() {
        return 1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.7xa, java.lang.Object] */
    @Override // X.InterfaceC197928p3
    public final InterfaceC179247xa Bml() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.7xa, java.lang.Object] */
    @Override // X.InterfaceC197928p3
    public final InterfaceC179247xa Bmm() {
        return new Object();
    }

    @Override // X.InterfaceC185788Ly
    public final EnumC185798Lz CFJ() {
        return EnumC185798Lz.CAPTURE;
    }

    @Override // X.InterfaceC185788Ly
    public final void CNg(InterfaceC197958p6 interfaceC197958p6, InterfaceC197978p8 interfaceC197978p8) {
        AnonymousClass811 anonymousClass811 = new AnonymousClass811(AbstractC111324zv.A00(597));
        anonymousClass811.A03 = 36197;
        AnonymousClass810 anonymousClass810 = new AnonymousClass810(anonymousClass811);
        this.A04 = anonymousClass810;
        SurfaceTexture surfaceTexture = new SurfaceTexture(anonymousClass810.A00);
        this.A03 = surfaceTexture;
        int i = this.A01;
        int i2 = this.A00;
        surfaceTexture.setDefaultBufferSize(i, i2);
        this.A05 = new Surface(this.A03);
        C201608vp c201608vp = this.A09;
        C179877yd c179877yd = this.A06;
        c201608vp.A00 = c179877yd;
        C22821A4q c22821A4q = this.A07;
        c22821A4q.A00.A0K.post(new RunnableC24859AzK(interfaceC197978p8, c179877yd, c22821A4q, i, i2));
        interfaceC197958p6.EpX(this.A05, this);
    }

    @Override // X.AbstractC185778Lx, X.InterfaceC185788Ly
    public final int getHeight() {
        return this.A00;
    }

    @Override // X.AbstractC185778Lx, X.InterfaceC185788Ly
    public final int getWidth() {
        return this.A01;
    }

    @Override // X.AbstractC185778Lx, X.InterfaceC185788Ly
    public final void release() {
        Surface surface = this.A05;
        if (surface != null) {
            surface.release();
            this.A05 = null;
        }
        SurfaceTexture surfaceTexture = this.A03;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.A03 = null;
        }
        AnonymousClass810 anonymousClass810 = this.A04;
        if (anonymousClass810 != null) {
            anonymousClass810.A01();
            this.A04 = null;
        }
        C23128AMg c23128AMg = this.A07.A00;
        c23128AMg.A0K.post(new RunnableC24270Apb(c23128AMg));
        super.release();
        this.A09.DrA();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:
    
        if (r6.A0I != false) goto L8;
     */
    @Override // X.AbstractC185778Lx, X.InterfaceC185788Ly
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void swapBuffers() {
        /*
            r18 = this;
            r8 = r18
            super.swapBuffers()
            android.graphics.SurfaceTexture r0 = r8.A03
            r0.updateTexImage()
            android.graphics.SurfaceTexture r0 = r8.A03
            float[] r13 = r8.A0A
            r0.getTransformMatrix(r13)
            X.A4q r7 = r8.A07
            long r4 = r8.A02
            X.AMg r6 = r7.A00
            long r0 = r6.A05
            r3 = 1
            r9 = -1
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 == 0) goto L57
            boolean r0 = r6.A0Y
            if (r0 != 0) goto L29
            boolean r0 = r6.A0I
            r11 = 0
            if (r0 == 0) goto L2a
        L29:
            r11 = 1
        L2a:
            long r0 = r6.A05
            long r9 = r4 - r0
            java.util.List r0 = r6.A0T
            int r1 = r0.size()
            r0 = 35
            if (r1 > r0) goto L3f
            r1 = 1800000000(0x6b49d200, double:8.893181625E-315)
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 <= 0) goto L41
        L3f:
            r6.A0I = r3
        L41:
            if (r11 == 0) goto L57
            r1 = 200000000(0xbebc200, double:9.8813129E-316)
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 >= 0) goto L4c
            r6.A0Y = r3
        L4c:
            android.os.Handler r3 = r6.A0K
            X.AuC r2 = new X.AuC
            r2.<init>(r6, r4)
        L53:
            r3.post(r2)
        L56:
            return
        L57:
            java.util.concurrent.atomic.AtomicInteger r0 = r6.A0V
            int r0 = r0.get()
            if (r0 != r3) goto L56
            X.810 r12 = r8.A04
            long r0 = r8.A02
            java.util.concurrent.atomic.AtomicBoolean r10 = r6.A0U
            boolean r2 = r10.get()
            if (r2 != 0) goto L56
            int r4 = r6.A03
            int r2 = r6.A02
            X.8uB r5 = new X.8uB
            r5.<init>(r4, r2)
            int r2 = r5.A00
            r9 = 36160(0x8d40, float:5.0671E-41)
            android.opengl.GLES20.glBindFramebuffer(r9, r2)
            int r8 = r5.A02
            int r2 = r5.A01
            r4 = 0
            android.opengl.GLES20.glViewport(r4, r4, r8, r2)
            X.AKR r2 = r6.A0F     // Catch: X.C9Yj -> La8
            r2.getClass()     // Catch: X.C9Yj -> La8
            X.8vB r11 = r6.A0O     // Catch: X.C9Yj -> La8
            r14 = 0
            r15 = r14
            r16 = r0
            r11.A02(r12, r13, r14, r15, r16)     // Catch: X.C9Yj -> La8
            r2.A04(r11)     // Catch: X.C9Yj -> La8
            android.opengl.GLES20.glBindFramebuffer(r9, r4)
            r2 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glBindTexture(r2, r4)
            android.opengl.GLES20.glFlush()
            android.os.Handler r3 = r6.A0K
            X.AxF r2 = new X.AxF
            r2.<init>(r5, r7, r0)
            goto L53
        La8:
            r6.A0Y = r3
            r10.set(r3)
            X.C23128AMg.A03(r6, r4)
            java.lang.String r1 = "BoomerangFramesHandlerImplOOM"
            java.lang.String r0 = "onTextureSwapped() GlOutOfMemoryException"
            X.C0K8.A0C(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C197908p1.swapBuffers():void");
    }

    public C197908p1(C179877yd c179877yd, C22821A4q c22821A4q, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A07 = c22821A4q;
        this.A06 = c179877yd;
    }

    @Override // X.InterfaceC185788Ly
    public final void destroy() {
        release();
    }
}
