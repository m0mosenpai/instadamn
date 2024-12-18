package X;

import instagram.features.feed.fragment.ContextualFeedFragment;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.Eww, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33832Eww {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, AbstractC111324zv.A00(8));
        Object A02 = c6fw.A02();
        String A0f = AbstractC31171DnF.A0f(A02);
        Object A00 = c6fw.A00();
        C14360o3.A0C(A00, A0f);
        String str = (String) A00;
        String A0i = AbstractC31180DnO.A0i(c6fw, 3);
        boolean A01 = C6DZ.A01(c6fw.A03(4));
        C140966Yy A0F = AbstractC31180DnO.A0F(c6fq);
        C14360o3.A0B(str, 0);
        ArrayList A1F = AbstractC166987dD.A1F((Collection) A03);
        ContextualFeedFragment contextualFeedFragment = new ContextualFeedFragment();
        contextualFeedFragment.setArguments(C31569Dtv.A05(null, "Static", A0i, (String) A02, str, null, null, A1F, false, false, false, A01));
        AbstractC31175DnJ.A0s(null, contextualFeedFragment, A0F);
        return null;
    }
}
