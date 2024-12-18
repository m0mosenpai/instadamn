package X;

import com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter;

/* renamed from: X.9RG, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9RG implements InterfaceC179087xK, InterfaceC1809480w {
    public BBP A00;
    public InterfaceC197718oi A01;
    public final C197328o3 A04;
    public final SurfaceCropFilter A05;
    public final InterfaceC197178nn A06;
    public final boolean A07;
    public final AZO A03 = new AZO(this);
    public final AZO A02 = new AZO(this);

    @Override // X.InterfaceC179087xK
    public final void ACv(InterfaceC180227zC interfaceC180227zC) {
    }

    @Override // X.InterfaceC179087xK
    public final void CNk(C178907x2 c178907x2) {
    }

    @Override // X.InterfaceC179087xK
    public final void release() {
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(X.C9RG r6) {
        /*
            X.8oi r0 = r6.A01
            if (r0 != 0) goto L95
            X.8o3 r2 = r6.A04     // Catch: java.lang.RuntimeException -> L14
            if (r2 == 0) goto L14
            boolean r0 = r6.A07     // Catch: java.lang.RuntimeException -> L14
            r2.A04 = r0     // Catch: java.lang.RuntimeException -> L14
            com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter r1 = r6.A05     // Catch: java.lang.RuntimeException -> L14
            r0 = 0
            X.8oi r1 = r2.A05(r1, r0)     // Catch: java.lang.RuntimeException -> L14
            goto L15
        L14:
            r1 = 0
        L15:
            r6.A01 = r1
            if (r1 != 0) goto L7c
            X.8nn r5 = r6.A06
            java.lang.String r2 = r5.Avl()
            r1 = 0
            if (r2 == 0) goto L32
            boolean r0 = r5.CXA()
            if (r0 == 0) goto L32
            boolean r0 = r6.A07
            if (r0 == 0) goto L61
            boolean r0 = r5.Cev()
            if (r0 == 0) goto L61
        L32:
            r6.A01 = r1
            if (r1 != 0) goto L7c
            java.lang.String r0 = r5.Avl()
            r1 = 0
            if (r0 == 0) goto L54
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeFile(r0)
        L41:
            if (r2 == 0) goto L49
            boolean r0 = r6.A07
            X.8oi r1 = X.C209089Mq.A03(r2, r0)
        L49:
            r6.A01 = r1
            if (r1 != 0) goto L7c
            java.lang.String r0 = "Failed to create input surface"
            java.lang.RuntimeException r0 = X.AbstractC166987dD.A18(r0)
            throw r0
        L54:
            byte[] r3 = r5.BGb()
            if (r3 == 0) goto L49
            r2 = 0
            int r0 = r3.length
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeByteArray(r3, r2, r0)
            goto L41
        L61:
            com.instagram.util.jpeg.NativeImage r4 = X.C197568oS.A00(r1, r1, r2)     // Catch: java.io.IOException -> L32
            r4.getClass()     // Catch: java.io.IOException -> L32
            r0 = 6408(0x1908, float:8.98E-42)
            int r3 = com.instagram.util.jpeg.JpegBridge.uploadTexture(r4, r0)
            int r2 = r4.width
            int r0 = r4.height
            X.8oh r1 = X.AbstractC197698og.A01(r1, r3, r2, r0)
            int r0 = r4.bufferId
            com.instagram.util.jpeg.JpegBridge.releaseNativeBuffer(r0)
            goto L32
        L7c:
            X.AZO r0 = r6.A03
            r0.A00(r1)
            X.AZO r1 = r6.A02
            X.8oi r0 = r6.A01
            X.8oj r0 = r0.B9M()
            r1.A00(r0)
            X.BBP r1 = r6.A00
            if (r1 == 0) goto L95
            X.8oi r0 = r6.A01
            r1.DLU(r0)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9RG.A00(X.9RG):void");
    }

    @Override // X.InterfaceC179087xK
    public final void detach() {
        InterfaceC197718oi interfaceC197718oi = this.A01;
        if (interfaceC197718oi != null) {
            interfaceC197718oi.cleanup();
            this.A01 = null;
        }
        this.A03.A00.A04 = null;
        this.A02.A00.A04 = null;
    }

    public C9RG(C197328o3 c197328o3, SurfaceCropFilter surfaceCropFilter, InterfaceC197178nn interfaceC197178nn, boolean z) {
        this.A06 = interfaceC197178nn;
        this.A07 = z;
        this.A04 = c197328o3;
        this.A05 = surfaceCropFilter;
    }

    @Override // X.InterfaceC1809480w
    public final /* bridge */ /* synthetic */ Object BHx() {
        A00(this);
        AZO azo = this.A03;
        A00(azo.A01);
        return azo.A00;
    }
}
