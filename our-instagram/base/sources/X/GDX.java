package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GDX implements GYB {
    public final Fragment A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C14360o3.A0B(uri, 0);
        AbstractC35275FhA.A0C(AbstractC167017dG.A0T("media_id", uri.getQueryParameter("media_id"), AbstractC166987dD.A1L("entryPoint", AbstractC31172DnG.A12(uri))), this.A00.requireActivity(), this.A01);
    }

    public GDX(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
