package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2q6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60822q6 extends AbstractC52922bZ implements InterfaceC60832q7 {
    public final UserSession A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final C61212qj A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;

    public C60822q6(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = C1XM.A00(new C9EA(this, 4));
        this.A02 = C1XM.A00(new C9EA(this, 5));
        this.A05 = C61212qj.A00;
        EnumC09460dv enumC09460dv = EnumC09460dv.A04;
        this.A03 = AbstractC09440dt.A00(enumC09460dv, new C9EA(this, 6));
        this.A06 = C1XM.A00(new C9EA(this, 7));
        this.A04 = AbstractC09440dt.A00(enumC09460dv, new C9EA(this, 9));
        this.A07 = C1XM.A00(new C9EA(this, 8));
    }

    @Override // X.InterfaceC60832q7
    public final C61212qj BIs() {
        return this.A05;
    }

    @Override // X.InterfaceC60832q7
    public final C63262u4 BP0() {
        return (C63262u4) this.A06.getValue();
    }

    @Override // X.InterfaceC60832q7
    public final C3CS BcY() {
        return (C3CS) this.A07.getValue();
    }
}
