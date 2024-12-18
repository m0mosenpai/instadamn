package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class F7F {
    public static final void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, List list, int i, int i2, boolean z) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), AbstractC111324zv.A00(4290));
        A0f.A9K("folder", AbstractC31171DnF.A0V(i));
        if (str != null) {
            A0f.AAP("origin_filter", str);
        }
        AbstractC31180DnO.A1J(A0f, z);
        if (AbstractC166987dD.A1b(list)) {
            A0f.AAP("labels", list.toString());
        }
        A0f.A7v("is_unread", false);
        A0f.A9K("trigger", AbstractC31171DnF.A0V(i2));
        A0f.Cht();
    }
}
