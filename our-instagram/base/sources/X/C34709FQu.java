package X;

import com.instagram.user.model.User;

/* renamed from: X.FQu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34709FQu {
    public final C18920wW A00;

    public C34709FQu(C18920wW c18920wW) {
        C14360o3.A0B(c18920wW, 1);
        this.A00 = c18920wW;
    }

    public final void A00(C38266GsB c38266GsB, boolean z) {
        C38321qM c38321qM;
        C25531Mh A09;
        User user = c38266GsB.A0L;
        if (user != null) {
            C41181vS c41181vS = c38266GsB.A0K;
            if (c41181vS != null && (c38321qM = c41181vS.A0b) != null) {
                C18920wW c18920wW = this.A00;
                if (z) {
                    A09 = AbstractC31180DnO.A09(AbstractC166987dD.A0f(c18920wW, "unblock_dialog_confirmed"), user, 383);
                    A09.A0Q("entity_user_type", AbstractC31171DnF.A0V(user.BJ8()));
                } else {
                    A09 = AbstractC31180DnO.A09(AbstractC166987dD.A0f(c18920wW, "block_dialog_confirmed"), user, 7);
                    A09.A0Q("entity_user_type", AbstractC31171DnF.A0V(user.BJ8()));
                    A09.A0l(c38321qM.getId());
                    AbstractC31180DnO.A1K(A09);
                }
                A09.Cht();
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public final void A01(User user) {
        C25531Mh A09;
        String valueOf;
        String str;
        boolean CQf = user.CQf();
        C18920wW c18920wW = this.A00;
        if (CQf) {
            A09 = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(c18920wW, "unblock_button_tapped"), 382);
            valueOf = user.getId();
            str = "target_id";
        } else {
            A09 = AbstractC31180DnO.A09(AbstractC166987dD.A0f(c18920wW, "block_button_tapped"), user, 6);
            AbstractC31180DnO.A1K(A09);
            valueOf = String.valueOf(user.BJ8());
            str = "entity_user_type";
        }
        A09.A0R(str, valueOf);
        A09.Cht();
    }
}
