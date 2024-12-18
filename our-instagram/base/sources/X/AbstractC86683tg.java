package X;

import android.view.View;

/* renamed from: X.3tg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC86683tg {
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
    
        if (r5 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r1 == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(android.app.Activity r6, final X.C9C3 r7, com.instagram.common.session.UserSession r8, X.InterfaceC60442pS r9, final X.C3W8 r10, final X.InterfaceC86673tf r11, X.C75113Zb r12) {
        /*
            r4 = 0
            r3 = 1
            X.C14360o3.A0B(r7, r3)
            r0 = 4
            X.C14360o3.A0B(r11, r0)
            X.9C3 r0 = r10.A04
            r5 = 1
            r2 = 0
            if (r0 == 0) goto L1a
            java.lang.String r1 = r0.A01
            java.lang.String r0 = r7.A01
            boolean r1 = X.C14360o3.A0K(r1, r0)
            r0 = 1
            if (r1 != 0) goto L1b
        L1a:
            r0 = 0
        L1b:
            X.3Zb r1 = r10.A08
            if (r1 == 0) goto L77
            if (r1 == r12) goto L77
        L21:
            if (r0 == 0) goto L74
            if (r5 == 0) goto L47
            android.view.View r1 = r10.A03
            if (r1 == 0) goto L32
            X.2hf r0 = X.C150956qv.A02
            X.5le r0 = X.AbstractC125325le.A01(r1, r4)
            r0.A0G()
        L32:
            java.lang.Runnable r1 = r10.A09
            if (r1 == 0) goto L3b
            android.os.Handler r0 = r10.A0B
            r0.removeCallbacks(r1)
        L3b:
            X.3Zb r1 = r10.A08
            if (r1 == 0) goto L41
            r1.A2X = r4
        L41:
            if (r1 == 0) goto L47
            r0 = 0
            r1.A0M(r10, r0, r3)
        L47:
            r10.A05 = r8
            r10.A00 = r6
            r10.A06 = r9
            r10.A04 = r7
            r0 = 0
            r12.A0L(r10, r0, r3)
            X.3th r0 = new X.3th
            r0.<init>()
            r10.A01 = r0
            X.3ti r0 = new X.3ti
            r0.<init>()
            r10.A02 = r0
            r10.A08 = r12
            X.3tj r0 = new X.3tj
            r0.<init>()
            r10.A09 = r0
            boolean r0 = r12.A2X
            if (r0 != 0) goto L70
            r2 = 8
        L70:
            r10.A01(r2)
            return
        L74:
            if (r5 == 0) goto L47
            goto L41
        L77:
            r5 = 0
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC86683tg.A00(android.app.Activity, X.9C3, com.instagram.common.session.UserSession, X.2pS, X.3W8, X.3tf, X.3Zb):void");
    }

    public static final void A01(C3W8 c3w8) {
        Runnable runnable = c3w8.A09;
        if (runnable != null) {
            c3w8.A0B.removeCallbacks(runnable);
        }
        View view = c3w8.A03;
        if (view != null) {
            C55942hf c55942hf = C150956qv.A02;
            AbstractC125325le A0F = AbstractC125325le.A01(view, 0).A0F(true);
            A0F.A0T(0.0f, c3w8.A0A);
            A0F.A05 = new J0H(c3w8);
            A0F.A0H();
        }
    }
}
