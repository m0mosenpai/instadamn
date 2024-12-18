package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.CRg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27895CRg {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final Fragment A02;

    public C27895CRg(Fragment fragment, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A02 = fragment;
        this.A01 = userSession;
        this.A00 = fragment.requireActivity();
    }
}
