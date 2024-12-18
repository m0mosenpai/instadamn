package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bugreporter.source.BugReportSource;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class P7L implements GYB {
    public final Fragment A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        Fragment fragment = this.A00;
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            AbstractC35237FgW.A01(activity, BugReportSource.A04, this.A01, AbstractC25227BEk.A0v(fragment, 2131973286), AbstractC25227BEk.A0v(fragment, 2131964353));
        }
    }

    public P7L(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
