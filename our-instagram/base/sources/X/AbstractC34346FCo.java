package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.FCo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34346FCo {
    public static final void A00(android.net.Uri uri, Fragment fragment, UserSession userSession) {
        FragmentActivity requireActivity = fragment.requireActivity();
        Bundle A0b = AbstractC166987dD.A0b();
        if (uri != null) {
            A0b.putString(AbstractC111324zv.A00(643), uri.getQueryParameter("audience_type"));
            A0b.putBoolean(AbstractC111324zv.A00(1660), uri.getBooleanQueryParameter("show_audience_type_selector", false));
        }
        AbstractC31176DnK.A0w(requireActivity, A0b, userSession, "universal_creation_live_camera");
    }
}
