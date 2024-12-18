package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.IqP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42422IqP implements InterfaceC43405JFv {
    public final /* synthetic */ C38P A00;

    public C42422IqP(C38P c38p) {
        this.A00 = c38p;
    }

    @Override // X.InterfaceC43405JFv
    public final void DCe(List list, String str) {
        C38P c38p = this.A00;
        UserSession session = c38p.getSession();
        ArrayList A12 = AbstractC166997dE.A12(session, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A0g = AbstractC37302Gc3.A0g(it);
            if (A0g != null) {
                A12.add(A0g);
            }
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(c38p, session), "explore_grid_trimmed");
        A0f.A9K("num_trimmed", AbstractC31171DnF.A0V(A12.size()));
        A0f.AAk("duplicate_media_ids", A12);
        A0f.AAP("explore_page", str);
        A0f.Cht();
    }
}
