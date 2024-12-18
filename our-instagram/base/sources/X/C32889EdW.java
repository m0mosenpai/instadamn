package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.EdW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32889EdW extends VKF {
    public final int A00;
    public final Object A01;

    public C32889EdW(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.VKF
    public final void A03() {
        UserSession userSession;
        EnumC33510Erj enumC33510Erj;
        boolean z;
        FragmentActivity requireActivity;
        switch (this.A00) {
            case 0:
                EVU evu = ((G28) this.A01).A00;
                userSession = evu.A0g;
                enumC33510Erj = EnumC33510Erj.DIRECT_MESSAGE_OMNIPICKER;
                z = true;
                AbstractC35249Fgi.A06(enumC33510Erj, userSession, true);
                requireActivity = evu.A0m.requireActivity();
                break;
            case 1:
                C36684GFe c36684GFe = (C36684GFe) this.A01;
                userSession = c36684GFe.A0Q;
                enumC33510Erj = EnumC33510Erj.DIRECT_MESSAGE_SEARCH;
                z = true;
                AbstractC35249Fgi.A06(enumC33510Erj, userSession, true);
                requireActivity = c36684GFe.A0N.requireActivity();
                break;
            default:
                Fragment fragment = (Fragment) this.A01;
                C193328hC A0O = AbstractC31175DnJ.A0O(fragment);
                A0O.A0A(2131964440);
                A0O.A09(2131964439);
                DialogInterfaceOnClickListenerC35452Fk9.A02(A0O, fragment, 68, 2131955188);
                AbstractC31176DnK.A16(null, A0O, 2131968687);
                return;
        }
        CJA.A00(requireActivity, enumC33510Erj, userSession, z, false);
    }
}
