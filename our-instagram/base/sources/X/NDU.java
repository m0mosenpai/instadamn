package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NDU extends AbstractC61132qb {
    public final UserSession A00;
    public final EnumC53251Ngp A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public NDU(UserSession userSession, EnumC53251Ngp enumC53251Ngp, String str, String str2, String str3) {
        C14360o3.A0B(enumC53251Ngp, 5);
        this.A00 = userSession;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A01 = enumC53251Ngp;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C50876Me7(this.A00, this.A01, this.A03, this.A04, this.A02);
    }
}
