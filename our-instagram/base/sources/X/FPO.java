package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class FPO {
    public final /* synthetic */ EIO A00;

    public FPO(EIO eio) {
        this.A00 = eio;
    }

    public final void A00(User user) {
        InterfaceC53892dT interfaceC53892dT;
        EIO eio = this.A00;
        InterfaceC09390do interfaceC09390do = eio.A03;
        C31368DqX A01 = AbstractC31402Dr6.A01(AbstractC166987dD.A0r(interfaceC09390do), user.getId(), "events_user_search", "clickable_profile_category");
        C70C c70c = null;
        if (eio.getRootActivity() instanceof InterfaceC53892dT) {
            interfaceC53892dT = (InterfaceC53892dT) eio.getRootActivity();
        } else {
            interfaceC53892dT = null;
        }
        FragmentActivity activity = eio.getActivity();
        if (activity != null) {
            c70c = new C70C(activity, AbstractC166987dD.A0r(interfaceC09390do), interfaceC53892dT);
        }
        Fragment A00 = C31368DqX.A00(AbstractC166987dD.A0r(interfaceC09390do), AbstractC31364DqT.A02(), A01);
        if (c70c != null) {
            c70c.A03(A00, "profile", true);
            c70c.A00();
        }
        C25531Mh c25531Mh = eio.A00;
        if (c25531Mh != null) {
            c25531Mh.A0R("container_module", "clickable_profile_category");
            c25531Mh.A0R("entry_module", "recommended_user_click");
            c25531Mh.A0R("target_id", user.getId());
            c25531Mh.Cht();
        }
    }
}
