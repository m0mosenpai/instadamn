package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.J0s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43027J0s implements C7XU {
    public final /* synthetic */ C38321qM A00;
    public final /* synthetic */ C37952Gmu A01;
    public final /* synthetic */ String A02;

    @Override // X.C7XU
    public final void DB3() {
    }

    public C43027J0s(C38321qM c38321qM, C37952Gmu c37952Gmu, String str) {
        this.A01 = c37952Gmu;
        this.A00 = c38321qM;
        this.A02 = str;
    }

    @Override // X.C7XU
    public final void DAy() {
        C34991FbO c34991FbO = C34991FbO.A00;
        C37952Gmu c37952Gmu = this.A01;
        UserSession userSession = c37952Gmu.A11;
        c34991FbO.A00(c37952Gmu.A10, userSession, this.A00, c37952Gmu.A0W, this.A02, c37952Gmu.A13.getModuleName());
    }
}
