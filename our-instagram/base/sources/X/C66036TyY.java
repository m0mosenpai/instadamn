package X;

import android.media.MediaFormat;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;

/* renamed from: X.TyY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66036TyY implements InterfaceC72004XEs {
    public InterfaceC72002XEq A00;
    public WDI A01;
    public C65831Tuo A02;
    public final /* synthetic */ WZU A03;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r16.A0H() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(android.content.Context r12, android.view.Surface r13, X.WDI r14, X.ACM r15, X.U7W r16) {
        /*
            r11 = this;
            r3 = 0
            X.WZU r0 = r11.A03
            X.VeN r7 = r0.A00
            X.XD9 r6 = r0.A03
            com.facebook.videolite.transcoder.base.composition.MediaComposition r5 = r0.A01
            boolean r0 = r6.CLF()
            r10 = r16
            if (r0 == 0) goto L18
            boolean r1 = r10.A0H()
            r0 = 1
            if (r1 != 0) goto L19
        L18:
            r0 = 0
        L19:
            r7.A01 = r0
            r1 = r12
            r2 = r13
            r4 = r14
            r8 = r15
            if (r0 == 0) goto L2c
            X.WZE r0 = new X.WZE
            r9 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L27:
            r11.A00 = r0
            r11.A01 = r14
            return
        L2c:
            X.U7Z r0 = new X.U7Z
            r9 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66036TyY.A00(android.content.Context, android.view.Surface, X.WDI, X.ACM, X.U7W):void");
    }

    public C66036TyY(WZU wzu) {
        this.A03 = wzu;
    }

    @Override // X.InterfaceC72004XEs
    public final void A8L(MediaEffect mediaEffect, int i) {
        InterfaceC72002XEq interfaceC72002XEq = this.A00;
        interfaceC72002XEq.getClass();
        interfaceC72002XEq.A8L(mediaEffect, i);
    }

    @Override // X.InterfaceC72004XEs
    public final void AAf(int i) {
        InterfaceC72002XEq interfaceC72002XEq = this.A00;
        interfaceC72002XEq.getClass();
        interfaceC72002XEq.AAf(i);
    }

    @Override // X.InterfaceC72004XEs
    public final void APt(long j) {
        InterfaceC72002XEq interfaceC72002XEq = this.A00;
        interfaceC72002XEq.getClass();
        interfaceC72002XEq.APt(j * 1000);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.Tyj, java.lang.Object] */
    @Override // X.InterfaceC72004XEs
    public final void AVe() {
        ?? obj = new Object();
        new C67628Uti((C66046Tyj) obj, this.A02).A00();
        InterfaceC72002XEq interfaceC72002XEq = this.A00;
        if (interfaceC72002XEq != null) {
            interfaceC72002XEq.release();
        }
        obj.A01();
    }

    @Override // X.InterfaceC72004XEs
    public final String B1p() {
        C65831Tuo c65831Tuo = this.A02;
        c65831Tuo.getClass();
        try {
            return c65831Tuo.A05.getName();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // X.InterfaceC72004XEs
    public final int BaL() {
        WDI wdi = this.A01;
        wdi.getClass();
        return (wdi.A0B + wdi.A05) % 360;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x013a, code lost:
    
        if (r38.A0H() == false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0161  */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, X.VJO] */
    @Override // X.InterfaceC72004XEs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E5g(android.content.Context r34, X.MYB r35, X.WDI r36, X.VN4 r37, X.U7W r38, int r39) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66036TyY.E5g(android.content.Context, X.MYB, X.WDI, X.VN4, X.U7W, int):void");
    }

    @Override // X.InterfaceC72004XEs
    public final void EEO(C66029TyR c66029TyR) {
        C65831Tuo c65831Tuo = this.A02;
        c65831Tuo.getClass();
        c65831Tuo.A08.append("releaseOutputBuffer,");
        c65831Tuo.A04(c66029TyR, c65831Tuo.A0A);
    }

    @Override // X.InterfaceC72004XEs
    public final void EFF(MediaEffect mediaEffect, int i) {
        InterfaceC72002XEq interfaceC72002XEq = this.A00;
        interfaceC72002XEq.getClass();
        interfaceC72002XEq.EFF(mediaEffect, i);
    }

    @Override // X.InterfaceC72004XEs
    public final void EGU(int i) {
        this.A00.getClass();
    }

    @Override // X.InterfaceC72004XEs
    public final void EGl(long j) {
        InterfaceC72002XEq interfaceC72002XEq = this.A00;
        interfaceC72002XEq.getClass();
        interfaceC72002XEq.AQh(j * 1000);
    }

    @Override // X.InterfaceC72004XEs
    public final void Elz() {
        C65831Tuo c65831Tuo = this.A02;
        c65831Tuo.getClass();
        AbstractC1126356r.A07(AbstractC167007dF.A1X(c65831Tuo.A07, C05F.A01), null);
        c65831Tuo.A05.signalEndOfInputStream();
    }

    @Override // X.InterfaceC72004XEs
    public final void flush() {
        InterfaceC72002XEq interfaceC72002XEq = this.A00;
        interfaceC72002XEq.getClass();
        interfaceC72002XEq.flush();
    }

    @Override // X.InterfaceC72004XEs
    public final MediaFormat getOutputFormat() {
        C65831Tuo c65831Tuo = this.A02;
        c65831Tuo.getClass();
        return c65831Tuo.A00;
    }

    @Override // X.InterfaceC72004XEs
    public final C66029TyR AOt(long j) {
        try {
            C65831Tuo c65831Tuo = this.A02;
            c65831Tuo.getClass();
            return c65831Tuo.A01(250000L);
        } catch (Throwable th) {
            WDI wdi = this.A01;
            wdi.getClass();
            throw new IllegalStateException(AnonymousClass001.A0R("mMediaTranscodeParams.mDebugStats: ", wdi.A0I), th);
        }
    }
}
