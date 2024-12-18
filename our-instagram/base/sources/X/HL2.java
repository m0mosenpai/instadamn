package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.feed.intf.ContextualFeedNetworkConfig;

/* loaded from: classes7.dex */
public final class HL2 extends AbstractC37439GeJ {
    public C154796xU A00;
    public final Context A01;
    public final AbstractC018607g A02;
    public final UserSession A03;
    public final JIJ A04;
    public final ContextualFeedNetworkConfig A05;
    public final String A06;

    public HL2(Context context, AbstractC018607g abstractC018607g, UserSession userSession, JIJ jij, ContextualFeedNetworkConfig contextualFeedNetworkConfig, String str) {
        C14360o3.A0B(contextualFeedNetworkConfig, 5);
        this.A03 = userSession;
        this.A04 = jij;
        this.A01 = context;
        this.A02 = abstractC018607g;
        this.A05 = contextualFeedNetworkConfig;
        this.A06 = str;
    }
}
