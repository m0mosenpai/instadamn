package X;

import android.content.Intent;
import com.facebook.browser.lite.BrowserLiteFragment;

/* renamed from: X.TGw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64508TGw implements InterfaceC86363t8 {
    public final /* synthetic */ C172707mf A00;
    public final /* synthetic */ C63397SjR A01;
    public final /* synthetic */ C3DN A02;

    @Override // X.InterfaceC86363t8
    public final void CwR(Integer num, float f) {
        C14360o3.A0B(num, 1);
        C63397SjR c63397SjR = this.A01;
        InterfaceC86363t8 interfaceC86363t8 = c63397SjR.A0J;
        if (interfaceC86363t8 != null) {
            interfaceC86363t8.CwR(num, f);
        }
        if (c63397SjR.A0x && !C63397SjR.A08(c63397SjR)) {
            this.A00.FD0(VD2.A04, AbstractC68583VWk.A00(num));
        }
        C63397SjR.A04(this.A00, c63397SjR, 3);
    }

    @Override // X.InterfaceC86363t8
    public final void D5p(Integer num) {
        String str;
        C14360o3.A0B(num, 0);
        C63397SjR c63397SjR = this.A01;
        InterfaceC86363t8 interfaceC86363t8 = c63397SjR.A0J;
        if (interfaceC86363t8 != null) {
            interfaceC86363t8.D5p(num);
        }
        if (c63397SjR.A0x && !C63397SjR.A08(c63397SjR)) {
            this.A00.FD0(VD2.A05, AbstractC68583VWk.A00(num));
        }
        SPM spm = c63397SjR.A0K;
        if (spm != null) {
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue == 11) {
                    str = "back_tap";
                }
            } else {
                str = "tap";
            }
            spm.A02("collapsed", "dismiss", str);
        }
        C63397SjR.A04(this.A00, c63397SjR, 4);
    }

    @Override // X.InterfaceC86363t8
    public final void DId(Integer num) {
        RiS riS;
        Intent intent;
        C14360o3.A0B(num, 0);
        C172707mf c172707mf = this.A00;
        C63397SjR c63397SjR = this.A01;
        int i = 8;
        int i2 = 0;
        if (!c63397SjR.A1A) {
            i = 0;
            i2 = 8;
        }
        InterfaceC65594Tnc interfaceC65594Tnc = c172707mf.A0V;
        if (interfaceC65594Tnc != null) {
            interfaceC65594Tnc.AJL(true, 0, i, i2, 8);
            if (((BrowserLiteFragment) c172707mf).A02 == 11 && (intent = ((BrowserLiteFragment) c172707mf).A07) != null && intent.getBooleanExtra("BrowserLiteIntent.InstagramExtras.EXTRA_KEEP_BROWSER_OPEN_ON_BACK_PRESSED", false)) {
                ((BrowserLiteFragment) c172707mf).A02 = 0;
            }
        }
        InterfaceC65594Tnc interfaceC65594Tnc2 = c172707mf.A0V;
        if (interfaceC65594Tnc2 != null) {
            interfaceC65594Tnc2.Coq();
        }
        if (c63397SjR.A0n) {
            C3KL.A00(c63397SjR.A1K).A06("webview");
        }
        if (!c63397SjR.A0h) {
            if (C18U.A06(C06090Tz.A06, c63397SjR.A1K, 36320545558045349L)) {
                RiS riS2 = c63397SjR.A09;
                if (riS2 != null) {
                    c172707mf.A0Z(riS2);
                }
                c63397SjR.A0h = true;
            }
        }
        InterfaceC86363t8 interfaceC86363t8 = c63397SjR.A0J;
        if (interfaceC86363t8 != null) {
            interfaceC86363t8.DId(num);
        }
        if (c63397SjR.A05 != 2 && (riS = c63397SjR.A09) != null) {
            c172707mf.A0Z(riS);
        }
        if (c63397SjR.A0k) {
            c63397SjR.A05 = 2;
        }
        C63397SjR.A04(c172707mf, c63397SjR, 2);
        if (c63397SjR.A0x && !C63397SjR.A08(c63397SjR)) {
            c172707mf.FD0(VD2.A02, AbstractC68583VWk.A00(num));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC86363t8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dyj(X.C51752Mtb r12) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64508TGw.Dyj(X.Mtb):void");
    }

    public C64508TGw(C172707mf c172707mf, C63397SjR c63397SjR, C3DN c3dn) {
        this.A01 = c63397SjR;
        this.A00 = c172707mf;
        this.A02 = c3dn;
    }

    @Override // X.InterfaceC86363t8
    public final void CwQ(float f) {
        InterfaceC86363t8 interfaceC86363t8 = this.A01.A0J;
        if (interfaceC86363t8 != null) {
            interfaceC86363t8.CwQ(f);
        }
    }

    @Override // X.InterfaceC86363t8
    public final void D5o() {
        InterfaceC86363t8 interfaceC86363t8 = this.A01.A0J;
        if (interfaceC86363t8 != null) {
            interfaceC86363t8.D5o();
        }
    }

    @Override // X.InterfaceC86363t8
    public final void DB6() {
        InterfaceC86363t8 interfaceC86363t8 = this.A01.A0J;
        if (interfaceC86363t8 != null) {
            interfaceC86363t8.DB6();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r3 != null) goto L6;
     */
    @Override // X.InterfaceC86363t8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DZk(int r10, int r11) {
        /*
            r9 = this;
            X.SjR r2 = r9.A01
            boolean r0 = r2.A0y
            X.7mf r1 = r9.A00
            if (r0 != 0) goto L22
            boolean r0 = r2.A1E
            int r5 = X.AbstractC31175DnJ.A01(r0)
            r6 = 8
            r4 = 0
            X.Tnc r3 = r1.A0V
            if (r3 == 0) goto L1a
        L15:
            r7 = r6
            r8 = r6
            r3.AJL(r4, r5, r6, r7, r8)
        L1a:
            X.3t8 r0 = r2.A0J
            if (r0 == 0) goto L21
            r0.DZk(r10, r11)
        L21:
            return
        L22:
            r6 = 8
            r4 = 0
            X.Tnc r3 = r1.A0V
            if (r3 == 0) goto L1a
            r5 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64508TGw.DZk(int, int):void");
    }
}
