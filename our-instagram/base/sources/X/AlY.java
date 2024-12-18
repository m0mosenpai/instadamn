package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class AlY implements InterfaceC169327h6 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ String A01;

    public AlY(UserSession userSession, String str) {
        this.A00 = userSession;
        this.A01 = str;
    }

    @Override // X.InterfaceC169327h6
    public final C1ON AN3(String str) {
        return AbstractC35238FgX.A03(this.A00, "users/search/", str, this.A01);
    }
}
