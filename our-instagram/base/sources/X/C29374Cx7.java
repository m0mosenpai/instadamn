package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Cx7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29374Cx7 implements InterfaceC95284Qo {
    public final long A00;
    public final C18920wW A01;

    @Override // X.InterfaceC95284Qo
    public final boolean CTq() {
        return true;
    }

    @Override // X.InterfaceC95284Qo
    public final void CmN(String str, boolean z) {
        Integer num;
        C14360o3.A0B(str, 0);
        C18920wW c18920wW = this.A01;
        if (z) {
            num = C05F.A01;
        } else {
            num = C05F.A00;
        }
        CKN.A00(c18920wW, str, num.intValue(), false, true);
    }

    @Override // X.InterfaceC95284Qo
    public final void CmO(String str, boolean z) {
        Integer num;
        C14360o3.A0B(str, 0);
        C18920wW c18920wW = this.A01;
        if (z) {
            num = C05F.A01;
        } else {
            num = C05F.A00;
        }
        CKN.A00(c18920wW, str, num.intValue(), true, false);
    }

    public C29374Cx7(UserSession userSession, long j) {
        this.A00 = j;
        C12210kP c12210kP = new C12210kP(userSession);
        c12210kP.A01 = "ig_blank_screen_module";
        this.A01 = c12210kP.A00();
    }

    @Override // X.InterfaceC95284Qo
    public final long AxE() {
        return this.A00;
    }
}
