package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.I4p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40761I4p {
    public static final Bundle A00(IJ2 ij2) {
        Bundle A0b = AbstractC166987dD.A0b();
        UserSession userSession = ij2.A01;
        if (userSession != null) {
            AbstractC31173DnH.A1C(A0b, userSession);
        }
        A0b.putString("PBIAProxyProfileFragment.AD_ID", ij2.A02);
        A0b.putParcelable("PBIAProxyProfileFragment.SOURCE_MODEL_INFO_PARAMS", ij2.A00);
        A0b.putBoolean("PBIAProxyProfileFragment.SHOULD_DISABLE_UNIVERSAL_CTA", false);
        A0b.putString("PBIAProxyProfileFragment.AD_RETRIEVAL_KEY", ij2.A03);
        A0b.putBoolean("PBIAProxyProfileFragment.ENABLE_PROFILE_AND_BROWSE", ij2.A04);
        return A0b;
    }
}
