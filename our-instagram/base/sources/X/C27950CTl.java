package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.CTl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27950CTl {
    public final UserSession A00;
    public final CUp A01;

    public final C26058Bfl A00(C45127Jxw c45127Jxw, C26077Bg6 c26077Bg6, String str, List list) {
        InterfaceC30817Dgs c26197BiN;
        String str2;
        Integer num;
        InterfaceC30815Dgq interfaceC30815Dgq;
        InterfaceC30815Dgq interfaceC30815Dgq2;
        Integer num2;
        C51760Mtj c51760Mtj;
        InterfaceC30815Dgq interfaceC30815Dgq3;
        int A06 = AbstractC167007dF.A06(0, c26077Bg6, list);
        C77 c77 = c26077Bg6.A06;
        boolean z = true;
        if (c77 != C77.A03 || !AbstractC166987dD.A1b(c26077Bg6.A08)) {
            z = false;
        }
        UserSession userSession = this.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36325244251681701L) && (c77 == C77.A05 || c77 == C77.A04)) {
            c26197BiN = new C26195BiL(c26077Bg6.A08);
        } else if (c77 == C77.A05) {
            C28224CcU c28224CcU = c26077Bg6.A04;
            if (c28224CcU != null) {
                str2 = c28224CcU.A05;
            } else {
                str2 = null;
            }
            c26197BiN = new C26196BiM(c26077Bg6.A07, str2, c26077Bg6.A00, c26077Bg6.A0G);
        } else {
            c26197BiN = new C26197BiN(this.A01.A00(c45127Jxw, list), c26077Bg6.A05, c77, z, c26077Bg6.A0E, c26077Bg6.A0F, c26077Bg6.A0B, c26077Bg6.A0A);
        }
        InterfaceC30817Dgs interfaceC30817Dgs = c26197BiN;
        int ordinal = c77.ordinal();
        if (ordinal != 5) {
            if (ordinal != 6) {
                if (ordinal != 4) {
                    if (ordinal != 3) {
                        if (ordinal == A06 && c26077Bg6.A0E && c26077Bg6.A09) {
                            c51760Mtj = new C51760Mtj((InterfaceC30815Dgq) null, (Integer) null, C05F.A0C, 3);
                        }
                        c51760Mtj = new C51760Mtj((InterfaceC30815Dgq) null, C05F.A00, (Integer) null, 6);
                    } else {
                        boolean z2 = c26077Bg6.A0C;
                        if (str != null && str.length() != 0) {
                            num = C05F.A01;
                            interfaceC30815Dgq2 = C29232Cub.A00;
                            num2 = C05F.A0N;
                        } else {
                            if (z && !z2) {
                                c51760Mtj = new C51760Mtj((InterfaceC30815Dgq) null, (Integer) null, C05F.A0C, 3);
                            }
                            c51760Mtj = new C51760Mtj((InterfaceC30815Dgq) null, C05F.A00, (Integer) null, 6);
                        }
                    }
                } else {
                    c51760Mtj = new C51760Mtj((InterfaceC30815Dgq) null, (Integer) null, (Integer) null, 7);
                }
            } else {
                if (str != null) {
                    interfaceC30815Dgq3 = new C26193BiJ(new BQO(str), BHS.A00(new Object[0], 2131965918));
                } else {
                    interfaceC30815Dgq3 = C29232Cub.A00;
                }
                c51760Mtj = new C51760Mtj(interfaceC30815Dgq3, C05F.A01, (Integer) null, 4);
            }
            C28224CcU c28224CcU2 = c26077Bg6.A04;
            return new C26058Bfl(c26077Bg6.A01, c51760Mtj, c26077Bg6.A03, c28224CcU2, interfaceC30817Dgs, str, c26077Bg6.A08, C18U.A06(c06090Tz, userSession, 36319888431062803L));
        }
        if (!C18U.A06(c06090Tz, userSession, 36319888431062803L) && (str == null || str.length() == 0)) {
            num = C05F.A00;
        } else {
            num = C05F.A01;
        }
        if (str != null && str.length() != 0) {
            interfaceC30815Dgq = new C26193BiJ(new BQO(str), BHS.A00(new Object[0], 2131965918));
        } else {
            interfaceC30815Dgq = C29232Cub.A00;
        }
        interfaceC30815Dgq2 = interfaceC30815Dgq;
        num2 = C05F.A00;
        c51760Mtj = new C51760Mtj(interfaceC30815Dgq2, num, num2);
        C28224CcU c28224CcU22 = c26077Bg6.A04;
        return new C26058Bfl(c26077Bg6.A01, c51760Mtj, c26077Bg6.A03, c28224CcU22, interfaceC30817Dgs, str, c26077Bg6.A08, C18U.A06(c06090Tz, userSession, 36319888431062803L));
    }

    public C27950CTl(UserSession userSession, CUp cUp) {
        this.A00 = userSession;
        this.A01 = cUp;
    }
}
