package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LEo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47919LEo {
    public boolean A00;
    public boolean A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;

    public C47919LEo(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A02 = C50255MHk.A01(userSession, enumC09460dv, 49);
        this.A03 = AbstractC09440dt.A00(enumC09460dv, new C37051GUh(userSession, 0));
        this.A04 = AbstractC09440dt.A00(enumC09460dv, new C37051GUh(userSession, 1));
    }

    public static final boolean A00(C47919LEo c47919LEo) {
        InterfaceC09390do interfaceC09390do = c47919LEo.A02;
        if (!((C6CF) interfaceC09390do.getValue()).A00() || !C6CB.A02(AbstractC43593JPy.A0P(interfaceC09390do), 36326549921806293L)) {
            return false;
        }
        InterfaceC09390do interfaceC09390do2 = c47919LEo.A04;
        if (((C44100JeP) interfaceC09390do2.getValue()).A05() == 0 || ((C44100JeP) interfaceC09390do2.getValue()).A05() - System.currentTimeMillis() > 0) {
            return false;
        }
        return true;
    }
}
