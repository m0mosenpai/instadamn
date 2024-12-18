package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.2qE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC60902qE {
    public static final void A00(Fragment fragment, UserSession userSession) {
        Bundle bundle = fragment.mArguments;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
        fragment.setArguments(bundle);
    }
}
