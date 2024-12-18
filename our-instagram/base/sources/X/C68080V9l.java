package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.V9l, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68080V9l extends C4A7 {
    public final C25671My A00;
    public final UserSession A01;
    public final C1DX A02;

    public static final void A00(C68080V9l c68080V9l, String str, String str2, boolean z) {
        c68080V9l.A01(str, z, C18U.A06(C06090Tz.A05, c68080V9l.A01, 36327593599253200L));
        if (str2 != null) {
            c68080V9l.A01(str2, z, false);
        }
    }

    private final void A01(String str, boolean z, boolean z2) {
        InterfaceC99334d2 C6Y;
        User A2E;
        C1DX c1dx = this.A02;
        C38321qM A02 = c1dx.A02(str);
        if (A02 != null && (C6Y = A02.A0C.C6Y()) != null) {
            C68047V7z A00 = InterfaceC99334d2.A00.A00();
            A00.A0Q = Boolean.valueOf(z);
            if (AbstractC72892XqR.A00(C6Y, A00.A01()) != null) {
                if (z2 && (A2E = A02.A2E(this.A01)) != null) {
                    A2E.A14(z);
                }
                c1dx.A03(A02);
                UserSession userSession = this.A01;
                C14360o3.A0B(userSession, 0);
                if (C18U.A06(C06090Tz.A05, userSession, 36327593598794444L)) {
                    C3YS.A00(userSession).A02(A02, z);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C68080V9l(UserSession userSession) {
        super("barcelona_algo_tune", C4A8.A00(1721950311));
        C25671My A00 = AbstractC25651Mw.A00(userSession);
        C1DX A002 = C1DW.A00(userSession);
        this.A01 = userSession;
        this.A00 = A00;
        this.A02 = A002;
    }
}
