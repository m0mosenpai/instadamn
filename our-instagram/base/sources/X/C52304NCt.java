package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.NCt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52304NCt extends AbstractC61132qb {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final AbstractC147826l7 A02;

    public C52304NCt(InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC142806cg enumC142806cg) {
        C14360o3.A0B(enumC142806cg, 3);
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A02 = AbstractC147826l7.A0K.A00(userSession, enumC142806cg);
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        InterfaceC11380iw interfaceC11380iw = this.A00;
        AbstractC147826l7 abstractC147826l7 = this.A02;
        OLC A02 = abstractC147826l7.A02();
        abstractC147826l7.A03();
        return new C50939Mf8(interfaceC11380iw, userSession, new C190458c3(interfaceC11380iw, userSession), A02);
    }
}
