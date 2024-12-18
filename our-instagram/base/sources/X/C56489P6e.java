package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.P6e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56489P6e implements InterfaceC53852dP {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C47Z A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ C14510oO A03;
    public final /* synthetic */ C15370ps A04;

    @Override // X.InterfaceC53852dP
    public final void DHI(C47Z c47z) {
        String str;
        String str2;
        C14360o3.A0B(c47z, 0);
        if (AbstractC50102Ry.A00(c47z.A3t, this.A01.A3t)) {
            EnumC915447k enumC915447k = c47z.A1f;
            EnumC915447k enumC915447k2 = c47z.A6J;
            C14510oO c14510oO = this.A03;
            boolean z = c14510oO.A00;
            if (enumC915447k == enumC915447k2) {
                if (!z) {
                    UserSession userSession = this.A00;
                    OP6.A01((EnumC53347Nix) this.A04.A00, OZM.A00, userSession, this.A02, null, true);
                } else {
                    return;
                }
            } else {
                if (z) {
                    return;
                }
                UserSession userSession2 = this.A00;
                C55891Orf c55891Orf = OZM.A00;
                String str3 = this.A02;
                EnumC53347Nix enumC53347Nix = (EnumC53347Nix) this.A04.A00;
                C115435Kd c115435Kd = c47z.A6I;
                if (c115435Kd != null) {
                    str = c115435Kd.A07;
                } else {
                    str = null;
                }
                C115435Kd c115435Kd2 = c47z.A6I;
                if (c115435Kd2 != null) {
                    str2 = c115435Kd2.A02;
                } else {
                    str2 = null;
                }
                OP6.A01(enumC53347Nix, c55891Orf, userSession2, str3, AnonymousClass001.A0T(str, str2, ' '), false);
            }
            c14510oO.A00 = true;
        }
    }

    @Override // X.InterfaceC53852dP
    public final /* synthetic */ void DSR(C47Z c47z) {
    }

    public C56489P6e(UserSession userSession, C47Z c47z, String str, C14510oO c14510oO, C15370ps c15370ps) {
        this.A01 = c47z;
        this.A03 = c14510oO;
        this.A00 = userSession;
        this.A02 = str;
        this.A04 = c15370ps;
    }
}
