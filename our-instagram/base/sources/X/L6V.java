package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* loaded from: classes8.dex */
public final /* synthetic */ class L6V {
    public final /* synthetic */ LLk A00;

    public /* synthetic */ L6V(LLk lLk) {
        this.A00 = lLk;
    }

    public final void A00() {
        LLk lLk = this.A00;
        KXD kxd = lLk.A0o;
        kxd.A01 = true;
        kxd.A04("enter_reachability_settings", null);
        Bundle A0b = AbstractC166987dD.A0b();
        UserSession userSession = lLk.A0h;
        AbstractC03240Dh.A00(A0b, userSession);
        InterfaceC11380iw interfaceC11380iw = lLk.A0c;
        new C55174Odd(interfaceC11380iw, userSession, null).A05(3, AbstractC31175DnJ.A1T(1, userSession, interfaceC11380iw) ? 1 : 0);
        AbstractC59962oe abstractC59962oe = lLk.A0b;
        FragmentActivity activity = abstractC59962oe.getActivity();
        activity.getClass();
        Bundle requireArguments = abstractC59962oe.requireArguments();
        requireArguments.putSerializable("reachability_settings_upsell", EnumC33470Er5.UPSELL);
        AbstractC31174DnI.A0a(activity, requireArguments, userSession, ModalActivity.class, "direct_message_options").A0C(activity);
    }
}
