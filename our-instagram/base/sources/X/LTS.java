package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LTS implements InterfaceC82483mC {
    public final EnumC63542ub A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;
    public final Integer A03;
    public final String A04;
    public final C63512uY A05;
    public final boolean A06;

    public LTS(UserSession userSession, InterfaceC60442pS interfaceC60442pS, C63512uY c63512uY, Integer num, String str, boolean z) {
        C14360o3.A0B(c63512uY, 1);
        this.A05 = c63512uY;
        this.A01 = userSession;
        this.A02 = interfaceC60442pS;
        this.A04 = str;
        this.A03 = num;
        this.A06 = z;
        this.A00 = EnumC63542ub.IG_GENERIC;
    }

    @Override // X.InterfaceC82483mC
    public final void E11(C82543mI c82543mI, Boolean bool, String str) {
        boolean z;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = this.A06;
        }
        if (z) {
            C14120nc.A00().ATO(new C124625kQ(new RunnableC49961M4c(c82543mI, this)));
        }
    }
}
