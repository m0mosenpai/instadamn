package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.HashMap;

/* loaded from: classes6.dex */
public abstract class FDZ {
    public static final void A00(FragmentActivity fragmentActivity, AbstractC12990ll abstractC12990ll, String str) {
        boolean A1R = AbstractC167007dF.A1R(0, abstractC12990ll, fragmentActivity);
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("timestamp", str);
        C66277U6x A01 = C66277U6x.A01("com.instagram.equity.sev_transparency.landing_page.screen", A1G);
        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(abstractC12990ll);
        A0C.A0U = "";
        A0C.A0l = A1R;
        AbstractC31180DnO.A1C(W6d.A02(A0C, A01), fragmentActivity, abstractC12990ll);
    }
}
