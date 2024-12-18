package X;

import android.os.Handler;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.3AO, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3AO extends AbstractC60592pi {
    public final Fragment A00;
    public final UserSession A01;
    public final InterfaceC690438q A02;
    public final InterfaceC65282xQ A03;

    public C3AO(Fragment fragment, UserSession userSession, InterfaceC690438q interfaceC690438q, InterfaceC65282xQ interfaceC65282xQ) {
        C14360o3.A0B(interfaceC690438q, 4);
        this.A00 = fragment;
        this.A03 = interfaceC65282xQ;
        this.A02 = interfaceC690438q;
        this.A01 = userSession;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        UserSession userSession = this.A01;
        if (!C72213Lu.A00(userSession).A00) {
            C72213Lu.A00(userSession).A01();
            return;
        }
        C1DX A00 = C1DW.A00(userSession);
        C72213Lu.A00(userSession);
        C38321qM A02 = A00.A02(null);
        if (A02 == null) {
            return;
        }
        C75113Zb BRZ = this.A03.BRZ(A02);
        new Handler().postDelayed(new RunnableC43144J5h(A02, new C42592ItB(A02, BRZ), BRZ, this), 100L);
    }
}
