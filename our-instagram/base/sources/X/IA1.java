package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class IA1 {
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.fragment.app.Fragment, X.HCq, X.2oe, X.51D] */
    public static void A00(FragmentActivity fragmentActivity, AbstractC12990ll abstractC12990ll, InterfaceC86363t8 interfaceC86363t8, InterfaceC43425JGp interfaceC43425JGp, String str, List list, int i) {
        ?? abstractC59962oe = new AbstractC59962oe();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("IgSessionManager.SESSION_TOKEN_KEY", abstractC12990ll.getToken());
        A0b.putStringArrayList("arg_values", AbstractC166987dD.A1F(list));
        A0b.putInt("arg_selected_index", i);
        A0b.putBoolean("arg_is_modal", false);
        abstractC59962oe.setArguments(A0b);
        abstractC59962oe.A01 = interfaceC43425JGp;
        C189448aO A0y = AbstractC25225BEi.A0y(abstractC12990ll);
        A0y.A0d = str;
        A0y.A0T = abstractC59962oe;
        A0y.A0X = interfaceC86363t8;
        AbstractC31173DnH.A0w(fragmentActivity, abstractC59962oe, A0y);
    }
}
