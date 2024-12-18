package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class L1T {
    public final C48978LlS A00;
    public final InterfaceC09390do A01;
    public final boolean A02;

    public L1T(UserSession userSession, C7WA c7wa, C98K c98k, C47649L2i c47649L2i, C7IM c7im, InterfaceC85403rV interfaceC85403rV, String str, boolean z) {
        InterfaceC09390do c28111Xp;
        C14360o3.A0B(c7wa, 4);
        this.A02 = z;
        MHZ mhz = new MHZ(c7im, interfaceC85403rV, c7wa, c98k, c47649L2i, str, 3);
        EnumC09460dv enumC09460dv = EnumC09460dv.A03;
        if (C7W0.A00(userSession)) {
            c28111Xp = AbstractC09440dt.A00(enumC09460dv, mhz);
        } else {
            c28111Xp = new C28111Xp(mhz.invoke());
        }
        this.A01 = c28111Xp;
        this.A00 = new C48978LlS(c7im);
    }
}
