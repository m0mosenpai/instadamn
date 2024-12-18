package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.N8p, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52200N8p extends C2US implements InterfaceC65242xM {
    public C4NL A00;
    public List A01;
    public final V3H A02;
    public final C66132yp A03;

    public C52200N8p(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC58311Pt3 interfaceC58311Pt3, InterfaceC55362gb interfaceC55362gb) {
        C14360o3.A0B(userSession, 2);
        V3H v3h = new V3H(context, interfaceC11380iw, userSession, interfaceC58311Pt3, new C31251DoZ(userSession));
        this.A02 = v3h;
        AbstractC54912fq.A00();
        C66132yp c66132yp = new C66132yp(userSession, interfaceC55362gb, new C66072yj(interfaceC11380iw, userSession), null);
        this.A03 = c66132yp;
        init(c66132yp, v3h);
    }

    @Override // X.InterfaceC65242xM
    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    public static final void A00(C52200N8p c52200N8p) {
        c52200N8p.clear();
        C4NL c4nl = c52200N8p.A00;
        if (c4nl != null) {
            c52200N8p.addModel(c4nl, c52200N8p.A03);
        }
        List list = c52200N8p.A01;
        if (list != null && AbstractC166987dD.A1b(list)) {
            HashSet A1H = AbstractC166987dD.A1H();
            int count = c52200N8p.getCount();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj = list.get(i);
                if (!A1H.contains(obj)) {
                    c52200N8p.addModel(obj, Integer.valueOf(i + count), c52200N8p.A02);
                    A1H.add(obj);
                }
            }
        }
        c52200N8p.notifyDataSetChanged();
    }
}
