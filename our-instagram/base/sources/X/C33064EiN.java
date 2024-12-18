package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.EiN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33064EiN extends AbstractC151906sa {
    @Override // X.AbstractC151906sa
    public final void A02() {
        C70D c70d = this.A01;
        FragmentActivity requireActivity = c70d.A07.requireActivity();
        UserSession userSession = c70d.A09;
        String moduleName = c70d.A0A.getModuleName();
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("event_source", "settings_menu");
        if (moduleName != null) {
            A1G.put("container_module", moduleName);
        }
        C66277U6x A01 = C66277U6x.A01(AbstractC111324zv.A00(2148), A1G);
        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
        AbstractC31171DnF.A10(requireActivity, A0C, 2131966009);
        A0C.A0l = true;
        A01.A04(requireActivity, A0C);
    }
}
