package X;

import android.view.View;

/* loaded from: classes11.dex */
public final class V8G extends C33H {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public V8G(View view, C65867TvU c65867TvU, int i) {
        this.A00 = i;
        this.A02 = c65867TvU;
        this.A01 = view;
    }

    @Override // X.C33H, X.C33I
    public final boolean Dtk(C5SW c5sw) {
        int i = this.A00;
        C14360o3.A0B(c5sw, 0);
        Object obj = this.A02;
        if (i != 0) {
            C65867TvU c65867TvU = (C65867TvU) obj;
            if (c65867TvU.A03 != null) {
                new ViewOnClickListenerC42032Ik1(c65867TvU, 15).onClick((View) this.A01);
                C18920wW c18920wW = c65867TvU.A0T.A00;
                AbstractC37304Gc5.A16(c18920wW.A00(c18920wW.A00, AbstractC111324zv.A00(395)), "ig_explore_controls_upsell_tapped");
                return true;
            }
            return true;
        }
        new WNU(obj, 25).onClick((View) this.A01);
        return true;
    }

    @Override // X.C33H, X.C33I
    public final void Dtt(C5SW c5sw) {
        int i = this.A00;
        Object obj = this.A02;
        if (i != 0) {
            C65867TvU c65867TvU = (C65867TvU) obj;
            InterfaceC19610xo ARD = AbstractC23021Ah.A00(c65867TvU.A0R).A01.ARD();
            ARD.E77("explore_controls_upsell_tooltip_shown", true);
            ARD.apply();
            C18920wW c18920wW = c65867TvU.A0T.A00;
            AbstractC37304Gc5.A16(c18920wW.A00(c18920wW.A00, AbstractC111324zv.A00(395)), "ig_explore_controls_upsell_shown");
            return;
        }
        AbstractC167017dG.A0g(C48b.A00(((C65867TvU) obj).A0R).A00, "explore_search_bar_entry_point_tooltip_display_count").apply();
    }
}
