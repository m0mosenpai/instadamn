package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Ffn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35195Ffn {
    public static final AtomicBoolean A00 = AbstractC166997dE.A17();

    public static final void A00(FragmentActivity fragmentActivity, C6FQ c6fq, UserSession userSession, String str, boolean z) {
        AbstractC167017dG.A1N(userSession, fragmentActivity);
        C14360o3.A0B(str, 3);
        String A0j = AbstractC167017dG.A0j();
        C62832tM A002 = AbstractC62822tL.A00(userSession);
        C14360o3.A07(A002);
        C1ON A04 = AbstractC2044893h.A04(userSession, str);
        C1GL A0C = C6BQ.A0C(c6fq);
        A04.A00 = new C32501ETb(fragmentActivity, c6fq, userSession, A002, A0j, str, 1, z);
        A0C.schedule(A04);
    }

    public static final void A01(C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, EnumC114765Gh enumC114765Gh, String str, boolean z) {
        C14360o3.A0B(str, 1);
        UserSession A002 = AbstractC03270Dk.A00(C6BQ.A0B(c6fq));
        String A0j = AbstractC167017dG.A0j();
        C62832tM A003 = AbstractC62822tL.A00(A002);
        C14360o3.A07(A003);
        if (!A00.getAndSet(true)) {
            C1ON A03 = AbstractC2044893h.A03(A002, str);
            C1GL A0C = C6BQ.A0C(c6fq);
            A03.A00 = new C32504ETe(c6fq, interfaceC103384lE, A002, enumC114765Gh, A003, A0j, str, z);
            A0C.schedule(A03);
        }
    }

    public static final void A02(C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, String str, boolean z) {
        C14360o3.A0B(str, 1);
        UserSession A0K = AbstractC31179DnN.A0K(c6fq);
        String A0j = AbstractC167017dG.A0j();
        C62832tM A002 = AbstractC62822tL.A00(A0K);
        C14360o3.A07(A002);
        if (!A00.getAndSet(true)) {
            C1ON A03 = AbstractC2044893h.A03(A0K, str);
            C1GL A0C = C6BQ.A0C(c6fq);
            A03.A00 = new C32501ETb(interfaceC103384lE, c6fq, A0K, A002, A0j, str, 0, z);
            A0C.schedule(A03);
        }
    }
}
