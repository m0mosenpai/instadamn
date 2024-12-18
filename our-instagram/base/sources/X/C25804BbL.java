package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

/* renamed from: X.BbL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25804BbL extends C193578hc {
    public final JSW A00;
    public final C41761wQ A01;
    public final UserSession A02;
    public final LAF A03;
    public final String A04;
    public final C05A A05;
    public final C05A A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25804BbL(Application application, JSW jsw, UserSession userSession, LAF laf) {
        super(application);
        AbstractC167007dF.A1F(application, 1, userSession);
        this.A03 = laf;
        this.A00 = jsw;
        this.A02 = userSession;
        this.A01 = new C41761wQ(null);
        this.A04 = userSession.userId;
        this.A06 = C10E.A00(C27203BzM.A00);
        this.A05 = C10E.A00(C27197BzG.A00);
    }

    public final C008002u A0E() {
        C008002u A00 = C10E.A00(C27193BzC.A00);
        C41761wQ c41761wQ = this.A01;
        c41761wQ.A02(this.A03.A01(c41761wQ), new C29536Czo(A00, 2));
        return A00;
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        this.A01.A01();
    }
}
