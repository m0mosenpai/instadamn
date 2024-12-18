package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class BKH {
    public C2Z5 A00;
    public final Activity A01;
    public final C4FC A02;
    public final AbstractC37552Gg8 A03;
    public final C9I8 A04;
    public final BKI A05;
    public final C65835Tus A06;
    public final InterfaceC16820sZ A07;
    public final boolean A08;
    public final C07X A09;
    public final C2XE A0A;
    public final UserSession A0B;
    public final C1337362e A0C;
    public final BK8 A0D;

    public BKH(Activity activity, Context context, C07X c07x, ClipsViewerConfig clipsViewerConfig, BKG bkg, InterfaceC66382zF interfaceC66382zF, UserSession userSession, AbstractC37552Gg8 abstractC37552Gg8, C37550Gg6 c37550Gg6, MVE mve, C37548Gg4 c37548Gg4, C37549Gg5 c37549Gg5, C65835Tus c65835Tus, C1337362e c1337362e, C37547Gg3 c37547Gg3, C25359BKc c25359BKc, BK8 bk8, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        C2Z5 c2z5;
        this.A01 = activity;
        this.A09 = c07x;
        this.A0B = userSession;
        this.A0C = c1337362e;
        this.A03 = abstractC37552Gg8;
        this.A07 = interfaceC16820sZ;
        this.A0D = bk8;
        this.A06 = c65835Tus;
        this.A0A = new C2XE(context);
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36312861864756555L);
        this.A08 = A06;
        C9I8 c9i8 = new C9I8(context, this);
        this.A04 = c9i8;
        if (A06) {
            c2z5 = A00(c9i8, this);
        } else {
            c2z5 = null;
        }
        this.A00 = c2z5;
        this.A05 = new BKI(context, c2z5, clipsViewerConfig, bkg, interfaceC66382zF, userSession, abstractC37552Gg8, c65835Tus, c1337362e, c25359BKc, AbstractC06930Yk.A06(AbstractC166987dD.A1L(EnumC129395t1.A0L, c37547Gg3), AbstractC166987dD.A1L(EnumC129395t1.A0D, c37548Gg4), AbstractC166987dD.A1L(EnumC129395t1.A0E, c37549Gg5), AbstractC166987dD.A1L(EnumC129395t1.A0K, c37549Gg5), AbstractC166987dD.A1L(EnumC129395t1.A07, mve), AbstractC166987dD.A1L(EnumC129395t1.A06, c37550Gg6)), interfaceC16660sJ, !A06);
        this.A02 = new BKK(this);
    }

    public static final C2Z5 A00(InterfaceC170457iy interfaceC170457iy, BKH bkh) {
        C2V6 c2v6;
        C2V3 A00;
        C170937jk c170937jk;
        C2V3 c2v3 = C2V3.defaultInstance;
        C170437iw c170437iw = new C170437iw();
        C2VF c2vf = C2VF.A00;
        UserSession userSession = bkh.A0B;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36312861866067286L)) {
            c2v6 = C77603dk.A00;
        } else {
            c2v6 = c2v3.A03;
        }
        A00 = C2V3.A00(null, c2v3, c2vf, c2v6, null, null, null, null, -289, 31, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
        int A07 = AbstractC25225BEi.A07(c06090Tz, userSession, 36608737864455963L);
        if (!bkh.A08) {
            c170937jk = bkh.A05.A03;
        } else {
            c170937jk = null;
        }
        c170437iw.A07 = new C170417iu(A00, c170937jk, null, 1, 1.0f, 2, A07, false, false, true, true, false, false);
        c170437iw.A03 = new C89273yT(bkh.A09);
        c170437iw.A04 = interfaceC170457iy;
        c170437iw.A00 = 10;
        c170437iw.A06 = new BKW(userSession, bkh.A03, new BKV(bkh), bkh.A0C, bkh.A0D);
        return c170437iw.A00(bkh.A0A);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r0 == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.BKH r8) {
        /*
            X.2Z5 r4 = r8.A00
            if (r4 == 0) goto L52
            X.Tus r0 = r8.A06
            int r7 = r0.A01
            int r6 = r0.A00
            monitor-enter(r4)
            int r0 = r4.A06     // Catch: java.lang.Throwable -> L4e
            int r8 = X.InterfaceC79363gi.A00     // Catch: java.lang.Throwable -> L4e
            if (r0 == r8) goto L3c
            r0 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r0)     // Catch: java.lang.Throwable -> L4e
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r0)     // Catch: java.lang.Throwable -> L4e
            X.2Vj r2 = r4.A0A     // Catch: java.lang.Throwable -> L4e
            if (r2 == 0) goto L3c
            X.7iy r0 = r4.A0T     // Catch: java.lang.Throwable -> L4e
            int r0 = r0.Bqz()     // Catch: java.lang.Throwable -> L4e
            int r1 = r4.A06     // Catch: java.lang.Throwable -> L4e
            if (r1 == r8) goto L3c
            if (r0 == 0) goto L32
            int r0 = r2.A01     // Catch: java.lang.Throwable -> L4e
            boolean r0 = X.C51312Xe.A00(r1, r5, r0)     // Catch: java.lang.Throwable -> L4e
            goto L3a
        L32:
            int r1 = r4.A05     // Catch: java.lang.Throwable -> L4e
            int r0 = r2.A00     // Catch: java.lang.Throwable -> L4e
            boolean r0 = X.C51312Xe.A00(r1, r3, r0)     // Catch: java.lang.Throwable -> L4e
        L3a:
            if (r0 != 0) goto L51
        L3c:
            X.2Vj r3 = X.C2Z5.A1A     // Catch: java.lang.Throwable -> L4e
            r0 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r0)     // Catch: java.lang.Throwable -> L4e
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r0)     // Catch: java.lang.Throwable -> L4e
            X.2V9 r0 = r4.A09     // Catch: java.lang.Throwable -> L4e
            r4.CpB(r0, r3, r2, r1)     // Catch: java.lang.Throwable -> L4e
            goto L51
        L4e:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L51:
            monitor-exit(r4)
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BKH.A01(X.BKH):void");
    }
}
