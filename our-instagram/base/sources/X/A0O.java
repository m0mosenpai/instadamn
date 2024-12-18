package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.ml.VisualFeatureStore;

/* loaded from: classes4.dex */
public abstract class A0O {
    public static final VisualFeatureStore A00(Context context, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        VisualFeatureStore visualFeatureStore = VisualFeatureStore.A04;
        if (visualFeatureStore == null) {
            VisualFeatureStore visualFeatureStore2 = new VisualFeatureStore(AbstractC166987dD.A0O(context), userSession);
            VisualFeatureStore.A04 = visualFeatureStore2;
            return visualFeatureStore2;
        }
        return visualFeatureStore;
    }
}
