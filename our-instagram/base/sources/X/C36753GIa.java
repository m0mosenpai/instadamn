package X;

import com.instagram.user.model.User;

/* renamed from: X.GIa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36753GIa implements InterfaceC37204GaF {
    public final /* synthetic */ C32282EJt A00;

    @Override // X.InterfaceC37204GaF
    public final boolean Caq(User user) {
        return false;
    }

    @Override // X.InterfaceC37204GaF
    public final boolean Ccd(User user) {
        return true;
    }

    public C36753GIa(C32282EJt c32282EJt) {
        this.A00 = c32282EJt;
    }

    @Override // X.InterfaceC37204GaF
    public final void Cub(User user) {
        C32282EJt c32282EJt = this.A00;
        C193328hC A0O = AbstractC31175DnJ.A0O(c32282EJt);
        A0O.A05 = user.getUsername();
        A0O.A09(2131972291);
        A0O.A0t(true);
        A0O.A0Z(DialogInterfaceOnClickListenerC35455FkC.A00(this, user, 17), EnumC193348hE.A05, c32282EJt.getString(2131972236), true);
        AbstractC31176DnK.A14(new DialogInterfaceOnClickListenerC35301Fha(6), A0O);
    }

    @Override // X.InterfaceC37204GaF
    public final boolean Dxg(User user, boolean z) {
        C32282EJt c32282EJt = this.A00;
        if (z) {
            java.util.Set set = c32282EJt.A0C;
            int size = set.size();
            C35003Fba c35003Fba = c32282EJt.A02;
            c35003Fba.getClass();
            if (size + c35003Fba.A01 >= 250) {
                C193328hC A0O = AbstractC31175DnJ.A0O(c32282EJt);
                int i = 2131960423;
                if (c32282EJt.A07) {
                    i = 2131960424;
                }
                A0O.A05 = AbstractC31174DnI.A0w(c32282EJt, Integer.valueOf(C8S8.DEFAULT_SWIPE_ANIMATION_DURATION), i);
                int i2 = 2131960421;
                if (c32282EJt.A07) {
                    i2 = 2131960422;
                }
                AbstractC31179DnN.A11(c32282EJt, A0O, i2);
                A0O.A0t(true);
                AbstractC31176DnK.A15(new DialogInterfaceOnClickListenerC35301Fha(5), A0O);
                String str = c32282EJt.A03;
                if (str != null) {
                    AbstractC40677I1j.A00(c32282EJt.A00).A00(c32282EJt.A04, str);
                    return false;
                }
                return false;
            }
            if (c32282EJt.A03 != null) {
                C36283Fza A00 = AbstractC40677I1j.A00(c32282EJt.A00);
                String str2 = c32282EJt.A04;
                String str3 = c32282EJt.A03;
                AbstractC167017dG.A1N(str2, str3);
                C25531Mh A0F = C25531Mh.A0F(A00.A00);
                if (AbstractC25226BEj.A1Z(A0F)) {
                    AbstractC31178DnM.A1F(A0F, A00.A01);
                    AbstractC31174DnI.A1I(A0F, "jcs_select_recipient");
                    AbstractC31179DnN.A1E(A0F, "jcs_recipient_selection", str2, str3);
                }
            }
            set.add(user);
        } else {
            c32282EJt.A0C.remove(user);
        }
        if (c32282EJt.getActivity() != null) {
            AbstractC31178DnM.A0v(c32282EJt);
        }
        C32282EJt.A00(c32282EJt);
        return true;
    }
}
