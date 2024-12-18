package X;

import android.R;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.KkR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46650KkR {
    public static final Object A00(C6FQ c6fq) {
        UserSession userSession = (UserSession) AbstractC31175DnJ.A0J(c6fq);
        Fragment A01 = C6BQ.A01(c6fq);
        C14360o3.A0C(A01, "null cannot be cast to non-null type com.instagram.base.fragment.IgFragment");
        AbstractC59962oe abstractC59962oe = (AbstractC59962oe) A01;
        C43804JYr c43804JYr = new C43804JYr(AbstractC23021Ah.A00(userSession), userSession);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        AbstractC25230BEn.A15(1, A04, abstractC59962oe);
        C193328hC A0I = AbstractC31171DnF.A0I(A04);
        A0I.A0A(2131963514);
        A0I.A09(2131963513);
        A0I.A0L(new DialogInterfaceOnClickListenerC48022LMr(A04, abstractC59962oe, c43804JYr, 10), 2131963510);
        AbstractC31176DnK.A16(new DialogInterfaceOnClickListenerC48022LMr(A04, abstractC59962oe, c43804JYr, 11), A0I, R.string.cancel);
        return null;
    }
}
