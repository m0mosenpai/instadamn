package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes9.dex */
public final class NLK extends CAY {
    @Override // X.CAY
    public final C3OO A00(ViewGroup viewGroup) {
        LayoutInflater A0E = AbstractC31177DnL.A0E(viewGroup, 0);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C51297MlK(AbstractC25226BEj.A0R(A0E, viewGroup, R.layout.value_props_inspiration_section, false));
    }

    @Override // X.CAY
    public final void A01(C3OO c3oo, InterfaceC11380iw interfaceC11380iw, UserSession userSession, List list, int i) {
        String str;
        AbstractC167017dG.A1N(c3oo, list);
        C14360o3.A0B(interfaceC11380iw, 4);
        C51297MlK c51297MlK = (C51297MlK) c3oo;
        Object obj = list.get(i);
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.creatortools.api.schemas.InspirationComponent");
        C51746MtV c51746MtV = (C51746MtV) obj;
        C14360o3.A0B(c51746MtV, 0);
        c51297MlK.A01.setText(c51746MtV.A04);
        c51297MlK.A00.setText(c51746MtV.A02);
        boolean A00 = AbstractC72723Nt.A00(AbstractC31172DnG.A05(c51297MlK));
        List list2 = (List) c51746MtV.A01;
        if (list2.isEmpty()) {
            c51297MlK.A02.setVisibility(8);
            return;
        }
        C50679MYx c50679MYx = (C50679MYx) list2.get(0);
        if (A00) {
            str = c50679MYx.A00;
        } else {
            str = c50679MYx.A01;
        }
        AbstractC25235BEs.A1I(interfaceC11380iw, c51297MlK.A02, str);
    }
}
