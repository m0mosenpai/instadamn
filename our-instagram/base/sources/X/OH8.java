package X;

import java.util.HashMap;

/* loaded from: classes9.dex */
public final class OH8 {
    public final /* synthetic */ N6U A00;

    public OH8(N6U n6u) {
        this.A00 = n6u;
    }

    public final void A00() {
        Ng0 ng0;
        N6U n6u = this.A00;
        Integer num = C05F.A0W;
        HashMap A1G = AbstractC166987dD.A1G();
        EnumC53120NeX enumC53120NeX = (EnumC53120NeX) MSW.A0l(n6u.A0O).A0H.getValue();
        C14360o3.A0B(enumC53120NeX, 0);
        if (AbstractC167007dF.A1X(enumC53120NeX, EnumC53120NeX.A02)) {
            ng0 = Ng0.A03;
        } else {
            ng0 = Ng0.A04;
        }
        A1G.put("current_mode", ng0.A00);
        AbstractC55033OXz.A02(n6u, num, A1G);
        n6u.onBackPressed();
    }
}
