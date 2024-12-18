package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.L4p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47708L4p {
    public boolean A00;
    public final UserSession A01;
    public final C6CF A02;
    public final LGY A03;
    public final C44100JeP A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;

    public /* synthetic */ C47708L4p(UserSession userSession) {
        LGY A00 = AbstractC46741Kly.A00(userSession);
        C44100JeP c44100JeP = new C44100JeP(userSession);
        C6CF A002 = C6CE.A00(userSession);
        AbstractC25234BEr.A1P(userSession, A00, A002);
        this.A01 = userSession;
        this.A03 = A00;
        this.A04 = c44100JeP;
        this.A02 = A002;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A06 = MHK.A00(this, enumC09460dv, 15);
        this.A05 = MHK.A00(this, enumC09460dv, 14);
        this.A07 = AbstractC09440dt.A00(enumC09460dv, MFX.A00);
    }
}
