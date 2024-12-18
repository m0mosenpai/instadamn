package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.IxD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42837IxD implements JGR {
    public final /* synthetic */ HCO A00;

    public C42837IxD(HCO hco) {
        this.A00 = hco;
    }

    @Override // X.JGR
    public final void DVd() {
        C1XJ c1xj = C1XJ.A00;
        HCO hco = this.A00;
        FragmentActivity requireActivity = hco.requireActivity();
        UserSession A0r = AbstractC166987dD.A0r(hco.A0M);
        String str = hco.A08;
        if (str == null) {
            C14360o3.A0F("waterfallId");
            throw C00O.createAndThrow();
        }
        c1xj.A1D(requireActivity, A0r, str, "multi_product_search", null, null, false, false, false);
    }
}
