package X;

import androidx.viewpager2.widget.ViewPager2;

/* renamed from: X.TvO, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65861TvO extends AbstractC65852TvD {
    public final int A00;
    public final Object A01;

    public C65861TvO(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.AbstractC65852TvD
    public final void A01(int i) {
        String str;
        int i2 = this.A00;
        Object obj = this.A01;
        if (i2 != 0) {
            V0I v0i = (V0I) obj;
            if (v0i.A01) {
                v0i.A01 = false;
                return;
            }
            C70399WUb c70399WUb = v0i.A00;
            if (c70399WUb == null) {
                return;
            }
            VG4 vg4 = VG4.A08;
            if (1 - JQ0.A04(2, i) != 0) {
                str = "add_preview_instagram_tab";
            } else {
                str = "add_preview_facebook_tab";
            }
            c70399WUb.A0G(vg4, str);
            return;
        }
        ViewPager2 viewPager2 = (ViewPager2) obj;
        viewPager2.clearFocus();
        if (!viewPager2.hasFocus()) {
            return;
        }
        viewPager2.A04.requestFocus(2);
    }
}
