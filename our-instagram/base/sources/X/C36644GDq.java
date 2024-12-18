package X;

import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.GDq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36644GDq implements GYB {
    public final Fragment A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C14360o3.A0B(uri, 0);
        String queryParameter = uri.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        FragmentActivity requireActivity = this.A00.requireActivity();
        UserSession userSession = this.A01;
        C140966Yy A0r = AbstractC25225BEi.A0r(requireActivity, userSession);
        A0r.A0D(AbstractC31175DnJ.A0R().A00(userSession, queryParameter));
        A0r.A04();
    }

    public C36644GDq(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
