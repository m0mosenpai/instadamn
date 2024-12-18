package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.Deprecated;

/* renamed from: X.DwY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31727DwY {
    public int A00;
    public View A01;
    public C189478aR A02;
    public final C50674MYs A03;
    public final C32245EIe A04;

    public C31727DwY(C50674MYs c50674MYs) {
        C14360o3.A0B(c50674MYs, 1);
        this.A00 = -2;
        C32245EIe c32245EIe = new C32245EIe();
        this.A04 = c32245EIe;
        this.A03 = c50674MYs;
        C189448aO A0y = AbstractC25225BEi.A0y(c50674MYs.A08);
        A0y.A17 = c50674MYs.A05;
        A0y.A0T = c50674MYs.A03;
        A0y.A06 = 0;
        A0y.A1C = c50674MYs.A06;
        A0y.A0O = c50674MYs.A02;
        A0y.A1O = c50674MYs.A07;
        A0y.A0X = new C56772PHp(c50674MYs, 3);
        A0y.A0U = new C36727GGw(1, c50674MYs, this);
        this.A02 = A0y.A00();
        c32245EIe.A05.A00 = new G83(this);
        c32245EIe.setDayNightMode(c50674MYs.A02);
    }

    public final void A05(Activity activity) {
        C14360o3.A0B(activity, 0);
        C189478aR c189478aR = this.A02;
        Context context = this.A03.A00;
        C32245EIe c32245EIe = this.A04;
        C14360o3.A0B(c32245EIe, 2);
        C189478aR.A00(activity, context, c32245EIe, c189478aR, null);
        A03(this);
    }

    @Deprecated(message = "")
    public final void A07(Context context) {
        C14360o3.A0B(context, 0);
        this.A02.A03(context, this.A04);
        A03(this);
    }

    public static void A00(Activity activity, C50674MYs c50674MYs) {
        new C31727DwY(c50674MYs).A05(activity);
    }

    public static void A01(Context context, C50674MYs c50674MYs) {
        new C31727DwY(c50674MYs).A07(context);
    }

    public static void A02(Fragment fragment, C50674MYs c50674MYs) {
        new C31727DwY(c50674MYs).A05(fragment.requireActivity());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0080, code lost:
    
        if (r1 == 0) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.C31727DwY r9) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31727DwY.A03(X.DwY):void");
    }

    public final void A04() {
        this.A02.A0L(null);
    }

    public final void A06(Context context) {
        C3DN A01 = C3DN.A00.A01(context);
        if (A01 != null) {
            C3DP c3dp = (C3DP) A01;
            c3dp.A0H = new GH9(5, context, this, c3dp.A0H);
            A01.A0B();
        }
    }

    public final void A08(C189448aO c189448aO) {
        this.A02.A0F(this.A04, c189448aO);
        A03(this);
    }

    public C31727DwY(C50674MYs c50674MYs, C189478aR c189478aR) {
        this.A00 = -2;
        this.A02 = c189478aR;
        C32245EIe c32245EIe = new C32245EIe();
        this.A04 = c32245EIe;
        c32245EIe.A05.A00 = new G84(this);
        c32245EIe.setDayNightMode(c50674MYs.A02);
        this.A03 = c50674MYs;
    }
}
