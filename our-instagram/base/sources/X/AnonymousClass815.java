package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.815, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass815 {
    public C80Q A00;
    public final boolean A01;

    public final void A02(Canvas canvas, C6RD c6rd, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, int i, int i2, long j) {
        APK B3e;
        A00(this, 0);
        C80Q c80q = this.A00;
        if (c80q != null && (B3e = c80q.B3e()) != null) {
            boolean z = this.A01;
            C23081AFn c23081AFn = C23081AFn.A00;
            synchronized (c23081AFn) {
            }
            if (c6rd != null) {
                A01(this, c6rd, 0);
            }
            C22984ABj c22984ABj = B3e.A04;
            c22984ABj.A04.addAndGet(i * i2);
            c22984ABj.A05[0].A00.incrementAndGet();
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            C14360o3.A07(createBitmap);
            Canvas canvas2 = new Canvas(createBitmap);
            canvas2.drawARGB(0, 0, 0, 0);
            interfaceC16660sJ2.invoke(canvas2);
            B3e.A05(createBitmap, 0, j);
            if (!z) {
                B3e.onDrawFrame(null);
            }
            Bitmap A02 = B3e.A02(0);
            if (A02 != null) {
                if (interfaceC16660sJ != null) {
                    interfaceC16660sJ.invoke(A02);
                } else {
                    canvas.drawBitmap(A02, 0.0f, 0.0f, (Paint) null);
                }
                B3e.A04(A02);
            }
            synchronized (c23081AFn) {
            }
        }
    }

    public static final void A00(AnonymousClass815 anonymousClass815, int i) {
        APK apk;
        Integer valueOf;
        int i2;
        C22946A9q c22946A9q;
        C80Q c80q = anonymousClass815.A00;
        if (c80q != null) {
            apk = c80q.B3e();
        } else {
            apk = null;
        }
        if (anonymousClass815.A01) {
            i2 = 5;
            if (apk != null) {
                valueOf = Integer.valueOf(i);
            } else {
                return;
            }
        } else if (apk != null) {
            valueOf = Integer.valueOf(i);
            i2 = -1;
        } else {
            return;
        }
        Map map = apk.A05;
        if (map.containsKey(valueOf) && (c22946A9q = (C22946A9q) map.get(valueOf)) != null) {
            synchronized (c22946A9q) {
                AtomicInteger atomicInteger = c22946A9q.A02;
                int max = Math.max(i2, -1);
                atomicInteger.set(max);
                c22946A9q.A03.set(max);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0012. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.AnonymousClass815 r4, X.C6RD r5, java.lang.Object r6) {
        /*
            X.80Q r0 = r4.A00
            if (r0 == 0) goto Lc7
            X.APK r0 = r0.B3e()
            if (r0 == 0) goto Lc7
            X.AMk r4 = r0.A02
            X.6RC r0 = r5.A07
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L59;
                case 1: goto L30;
                case 2: goto L29;
                case 3: goto L22;
                case 4: goto L89;
                case 5: goto L1b;
                default: goto L15;
            }
        L15:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L1b:
            java.lang.Integer r1 = r4.A07(r6)
            java.lang.Integer r0 = X.C05F.A0Y
            goto L36
        L22:
            java.lang.Integer r1 = r4.A07(r6)
            java.lang.Integer r0 = X.C05F.A0N
            goto L36
        L29:
            java.lang.Integer r1 = r4.A07(r6)
            java.lang.Integer r0 = X.C05F.A0C
            goto L36
        L30:
            java.lang.Integer r1 = r4.A07(r6)
            java.lang.Integer r0 = X.C05F.A01
        L36:
            if (r1 == r0) goto L89
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            int r0 = r0.intValue()
            switch(r0) {
                case 1: goto L50;
                case 2: goto L53;
                case 3: goto L56;
                default: goto L44;
            }
        L44:
            java.lang.String r0 = "text_haunted"
        L46:
            X.8s4 r1 = X.AMk.A02(r4, r0, r1)
            java.util.Map r0 = r4.A00
            r0.put(r6, r1)
            goto L89
        L50:
            java.lang.String r0 = "text_neon"
            goto L46
        L53:
            java.lang.String r0 = "text_shimmer"
            goto L46
        L56:
            java.lang.String r0 = "text_pixel"
            goto L46
        L59:
            java.lang.Integer r1 = r4.A07(r6)
            java.lang.Integer r0 = X.C05F.A00
            if (r1 == r0) goto L71
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r0 = "sparkle"
            X.8s4 r1 = X.AMk.A02(r4, r0, r1)
            java.util.Map r0 = r4.A00
            r0.put(r6, r1)
        L71:
            X.9ZQ r0 = r5.A08
            if (r0 == 0) goto L79
            java.util.List r3 = r0.A00
            if (r3 != 0) goto L7b
        L79:
            X.0sl r3 = X.C16930sl.A00
        L7b:
            java.lang.String r2 = " "
            r1 = 0
            java.lang.String r0 = ""
            java.lang.String r1 = X.AbstractC001800i.A0P(r2, r0, r0, r3, r1)
            java.lang.String r0 = "sparkle_positions_and_alphas"
            r4.A08(r0, r6, r1)
        L89:
            float r0 = r5.A00
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "fontSize"
            r4.A08(r0, r6, r1)
            float r0 = r5.A01
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "fontThickness"
            r4.A08(r0, r6, r1)
            int r0 = r5.A05
            java.lang.String r1 = X.AbstractC13950nL.A0E(r0)
            java.lang.String r0 = "textColor"
            r4.A08(r0, r6, r1)
            boolean r0 = r5.A0A
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "hasOutline"
            r4.A08(r0, r6, r1)
            java.util.List r3 = r5.A09
            if (r3 == 0) goto Lc8
            java.lang.String r2 = " "
            r1 = 0
            java.lang.String r0 = ""
            java.lang.String r1 = X.AbstractC001800i.A0P(r2, r0, r0, r3, r1)
        Lc2:
            java.lang.String r0 = "timeOffsets"
            r4.A08(r0, r6, r1)
        Lc7:
            return
        Lc8:
            java.lang.String r1 = ""
            goto Lc2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass815.A01(X.815, X.6RD, java.lang.Object):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (X.C18U.A06(r3, r5, 36323075294636981L) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AnonymousClass815(com.instagram.common.session.UserSession r5, android.content.Context r6, boolean r7) {
        /*
            r4 = this;
            r4.<init>()
            r4.A01 = r7
            X.0Tz r3 = X.C06090Tz.A06
            r0 = 36323075294440370(0x810ba500132bb2, double:3.034197305263998E-306)
            boolean r0 = X.C18U.A06(r3, r5, r0)
            if (r0 != 0) goto L1e
            r0 = 36323075294636981(0x810ba500162bb5, double:3.034197305388335E-306)
            boolean r0 = X.C18U.A06(r3, r5, r0)
            r2 = 0
            if (r0 == 0) goto L1f
        L1e:
            r2 = 1
        L1f:
            r0 = 36323075294374833(0x810ba500122bb1, double:3.034197305222552E-306)
            boolean r0 = X.C18U.A06(r3, r5, r0)
            if (r0 != 0) goto L3f
            r0 = 36323075294571444(0x810ba500152bb4, double:3.0341973053468894E-306)
            boolean r0 = X.C18U.A06(r3, r5, r0)
            if (r0 != 0) goto L3f
            X.WiS r0 = new X.WiS
            r0.<init>(r6, r7, r2)
        L3a:
            X.80Q r0 = (X.C80Q) r0
            r4.A00 = r0
            return
        L3f:
            X.80P r0 = new X.80P
            r0.<init>(r6, r7, r2)
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass815.<init>(com.instagram.common.session.UserSession, android.content.Context, boolean):void");
    }
}
