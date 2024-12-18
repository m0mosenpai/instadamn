package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.38W, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C38W {
    public final Fragment A00;
    public final C38X A01;
    public final C1M1 A02;

    public C38W(Fragment fragment, FragmentActivity fragmentActivity, UserSession userSession, C1GL c1gl, InterfaceC60442pS interfaceC60442pS, C1M1 c1m1) {
        C14360o3.A0B(c1m1, 2);
        C14360o3.A0B(c1gl, 4);
        this.A00 = fragment;
        this.A02 = c1m1;
        this.A01 = new C38X(fragmentActivity, userSession, c1gl, interfaceC60442pS);
    }
}
