package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.94C, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C94C {
    public final C0JM A00;
    public final C94F A01;
    public final InterfaceC09390do A02;
    public final Context A03;
    public final InterfaceC40711ue A04;
    public final C94D A05;
    public final C94E A06;
    public final UserSession A07;

    public C94C(UserSession userSession, Context context) {
        this.A07 = userSession;
        this.A03 = context;
        C03250Di c03250Di = C03250Di.A00;
        C14360o3.A07(c03250Di);
        this.A00 = c03250Di;
        this.A02 = AbstractC09440dt.A01(new C206859Dq(this, 26));
        C40701ud A01 = AbstractC40691uc.A01(userSession);
        this.A04 = A01;
        C94D c94d = new C94D(A01);
        this.A05 = c94d;
        C94E c94e = new C94E(c94d);
        this.A06 = c94e;
        this.A01 = new C94F(c03250Di, (InterfaceC73603Rm) this.A02.getValue(), c94e);
    }
}
