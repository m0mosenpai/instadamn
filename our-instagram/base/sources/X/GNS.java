package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.fragment.CategorySearchFragment;
import java.util.Map;

/* loaded from: classes6.dex */
public final class GNS implements Runnable {
    public final /* synthetic */ CategorySearchFragment A00;
    public final /* synthetic */ Map A01;

    public GNS(CategorySearchFragment categorySearchFragment, Map map) {
        this.A00 = categorySearchFragment;
        this.A01 = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CategorySearchFragment categorySearchFragment = this.A00;
        CallerContext callerContext = CategorySearchFragment.A0U;
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = categorySearchFragment.A05;
        if (businessFlowAnalyticsLogger != null) {
            String A0g = AbstractC31180DnO.A0g(categorySearchFragment);
            String str = categorySearchFragment.A0C;
            if (str == null) {
                AbstractC31171DnF.A0x();
                throw C00O.createAndThrow();
            }
            businessFlowAnalyticsLogger.Clu(new Y7A(A0g, str, "save_info", null, null, null, this.A01, null));
        }
        AbstractC31177DnL.A12(categorySearchFragment);
    }
}
