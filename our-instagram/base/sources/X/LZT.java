package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LZT implements InterfaceC66482zP {
    public final UserSession A00;
    public final EnumC46220Kcw A01;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return "sort_option";
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return AbstractC167007dF.A1X(this.A01, ((LZT) obj).A01);
    }

    public LZT(UserSession userSession, EnumC46220Kcw enumC46220Kcw) {
        this.A01 = enumC46220Kcw;
        this.A00 = userSession;
    }
}
