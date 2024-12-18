package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.GDd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36631GDd implements GYB {
    public final Fragment A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            AbstractC35094Fd5.A02(activity, C22P.A4C, this.A01, null, true, true);
        }
    }

    public C36631GDd(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
