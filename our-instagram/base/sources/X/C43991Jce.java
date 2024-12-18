package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Jce, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43991Jce {
    public final Fragment A00;
    public final UserSession A01;
    public final C31615Duh A02;

    public C43991Jce(Fragment fragment, UserSession userSession, C31263Dol c31263Dol, C31256Doe c31256Doe) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = fragment;
        this.A02 = new C31615Duh(userSession, c31263Dol, c31256Doe);
    }
}
