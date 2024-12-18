package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.feed.intf.ContextualFeedNetworkConfig;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.ExO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33860ExO {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, AbstractC111324zv.A00(12));
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : (List) A03) {
            if (obj instanceof String) {
                A1E.add(obj);
            }
        }
        Object A032 = c6fw.A03(1);
        String A0o = AbstractC31176DnK.A0o(c6fw, AbstractC31171DnF.A0f(A032), 2);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        AbstractC12990ll A0J = AbstractC31175DnJ.A0J(c6fq);
        C1M0 A00 = C1M3.A00();
        AbstractC31177DnL.A0o(A04, AbstractC61636Rr0.A00(AbstractC166987dD.A1L("ContextualFeedFragment.ARGUMENT_MEDIA_INITIAL_POSITION", AbstractC001800i.A0I(A1E)), AbstractC166987dD.A1L("ContextualFeedFragment.ARGUMENT_MEDIA_ID_LIST", AbstractC166987dD.A1F(A1E)), AbstractC166987dD.A1L("ContextualFeedFragment.ARGUMENT_FEED_TITLE", A04.getString(2131969869)), AbstractC166987dD.A1L("ContextualFeedFragment.ARGUMENT_SESSION_ID", A00.A00), AbstractC166987dD.A1L("ContextualFeedFragment.ARGUMENT_CONTEXTUAL_FEED_MODE", "Static"), AbstractC166987dD.A1L("ContextualFeedFragment.ARGUMENT_MODULE_NAME", AbstractC111324zv.A00(2359)), AbstractC166987dD.A1L("ContextualFeedFragment.ARGUMENT_ELIGIBLE_FOR_SUBSCRIPTIONS_NUX", true), AbstractC166987dD.A1L("ContextualFeedFragment.ARGUMENT_NETWORK_CONFIG", new ContextualFeedNetworkConfig((String) AbstractC001800i.A0L(A1E), (String) A032, A0o, null, null, 0))), A0J, "contextual_feed");
        A04.finish();
        return null;
    }
}
