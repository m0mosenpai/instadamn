package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.HFj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39007HFj extends C1P1 {
    public final C38321qM A00;
    public final /* synthetic */ C79543h1 A01;

    public C39007HFj(C79543h1 c79543h1, C38321qM c38321qM) {
        this.A01 = c79543h1;
        this.A00 = c38321qM;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(2089540675);
        int A032 = C0f9.A03(755544324);
        C38321qM c38321qM = this.A00;
        int i = 1;
        if (c38321qM.A5g()) {
            i = 3;
        }
        c38321qM.A00 = i;
        UserSession userSession = this.A01.A00;
        c38321qM.AEH(userSession);
        User A2E = c38321qM.A2E(userSession);
        if (A2E != null) {
            if (!c38321qM.A5P()) {
                A2E.A0W();
            }
            A2E.A0c(userSession);
            C0f9.A0A(2125789696, A032);
            C0f9.A0A(1055761553, A03);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A0A(-1076022082, A032);
        throw A0g;
    }
}
