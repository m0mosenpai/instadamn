package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6uW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C153026uW {
    public final UserSession A00;
    public final C155896zJ A01;
    public final InterfaceC62602sz A02;

    public final EnumC153216up A00(EnumC125775mS enumC125775mS) {
        InterfaceC62602sz interfaceC62602sz = this.A02;
        if (interfaceC62602sz.isLoading()) {
            return EnumC153216up.A06;
        }
        if (interfaceC62602sz.CUG() && !AbstractC154816xW.A02(this.A00, this.A01.A02.A0O.A0J)) {
            return EnumC153216up.A04;
        }
        if (!((AbstractC155926zM) this.A01.A03.get(enumC125775mS)).A01) {
            return EnumC153216up.A07;
        }
        return EnumC153216up.A02;
    }

    public C153026uW(UserSession userSession, C155896zJ c155896zJ, InterfaceC62602sz interfaceC62602sz) {
        this.A00 = userSession;
        this.A01 = c155896zJ;
        this.A02 = interfaceC62602sz;
    }
}
