package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.FWi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34827FWi {
    public static final void A00(Fragment fragment, UserSession userSession, String str, String str2, boolean z) {
        if (AbstractC167007dF.A1W(C37001nx.A02)) {
            EK6 A00 = AbstractC35067Fce.A00().A00().A00(true, str, fragment.getString(2131960982), str2, null, null, null);
            if (z) {
                AbstractC31171DnF.A0L(fragment.getActivity(), A00.mArguments, userSession, ModalActivity.class, AbstractC111324zv.A00(4324)).A0C(fragment.getActivity());
            } else {
                AbstractC31177DnL.A0w(null, A00, fragment.requireActivity(), userSession);
            }
        }
    }

    public static final void A01(FragmentActivity fragmentActivity, UserSession userSession, String str, boolean z) {
        if (AbstractC167007dF.A1W(C37001nx.A02)) {
            AbstractC35067Fce.A01();
            Bundle A08 = AbstractC31176DnK.A08(str);
            C32354ENb c32354ENb = new C32354ENb();
            c32354ENb.setArguments(A08);
            if (z) {
                AbstractC25228BEl.A1G(fragmentActivity, c32354ENb.mArguments, userSession, ModalActivity.class, "account_discovery");
            } else {
                if (fragmentActivity != null) {
                    AbstractC31177DnL.A16(c32354ENb, fragmentActivity, userSession);
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
        }
    }
}
