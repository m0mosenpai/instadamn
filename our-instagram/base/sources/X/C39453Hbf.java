package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Hbf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39453Hbf extends PJX {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ InterfaceC60442pS A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public C39453Hbf(UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, String str2) {
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = interfaceC60442pS;
        this.A03 = str2;
    }

    @Override // X.PJX, X.MRA
    public final void Dfe() {
        UserSession userSession = this.A00;
        ((C25462BOb) userSession.A01(C25462BOb.class, new DGY(userSession, 49))).A00(this.A02);
    }

    @Override // X.PJX, X.MRA
    public final void DpY(String str, String str2, String str3) {
        AbstractC40920IAs.A00(this.A00, this.A01, this.A02, this.A03, str);
    }

    @Override // X.PJX, X.MRA
    public final void DpZ(String str) {
        AbstractC40920IAs.A00(this.A00, this.A01, this.A02, this.A03, str);
    }
}
