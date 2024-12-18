package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.OQe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54907OQe {
    public static final void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2) {
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put(AbstractC50532MSl.A00(), str);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "ig_cg_composer_show_new_fundraiser");
        A0f.A9M("attributes", A1G);
        A0f.AAP("source_name", str2);
        A0f.A8R(EnumC72419XdP.IG_STANDALONE_FOR_CHARITY, "fundraiser_type");
        A0f.Cht();
    }

    public static final void A01(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2) {
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put(AbstractC50532MSl.A00(), str);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "ig_cg_composer_tap_on_new_fundraiser");
        A0f.A9M("attributes", A1G);
        A0f.AAP("source_name", str2);
        A0f.A8R(EnumC72419XdP.IG_STANDALONE_FOR_CHARITY, "fundraiser_type");
        A0f.Cht();
    }
}
