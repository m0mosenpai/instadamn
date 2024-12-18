package X;

import androidx.viewpager2.widget.ViewPager2;

/* renamed from: X.Gfg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37524Gfg {
    public final C59952od A00;

    public final void A00() {
        C37556GgC A0N = this.A00.A0N();
        ViewPager2 viewPager2 = A0N.A00;
        if (viewPager2 != null && viewPager2.A04.canScrollVertically(-1)) {
            C120985dq A01 = C37556GgC.A01(A0N);
            A0N.A0I(true);
            AbstractC167007dF.A0J().postDelayed(new J58(A01, A0N), 500L);
        }
    }

    public C37524Gfg(C59952od c59952od) {
        this.A00 = c59952od;
    }
}
