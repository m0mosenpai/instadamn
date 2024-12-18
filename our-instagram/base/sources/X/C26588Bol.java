package X;

import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Bol, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26588Bol extends AbstractC51572Yf {
    public static final InterfaceC89793zL A0C;
    public final int A00;
    public final int A01;
    public final ClipsViewerConfig A02;
    public final C120985dq A03;
    public final C25437BNc A04;
    public final C37644Ghd A05;
    public final UserSession A06;
    public final C38321qM A07;
    public final InterfaceC60442pS A08;
    public final C75113Zb A09;
    public final InterfaceC31137Dmc A0A;
    public final List A0B;

    public C26588Bol(ClipsViewerConfig clipsViewerConfig, C120985dq c120985dq, C25437BNc c25437BNc, C37644Ghd c37644Ghd, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, InterfaceC31137Dmc interfaceC31137Dmc, List list, int i) {
        AbstractC25229BEm.A1J(c37644Ghd, 8, interfaceC31137Dmc);
        this.A04 = c25437BNc;
        this.A07 = c38321qM;
        this.A09 = c75113Zb;
        this.A06 = userSession;
        this.A08 = interfaceC60442pS;
        this.A02 = clipsViewerConfig;
        this.A03 = c120985dq;
        this.A05 = c37644Ghd;
        this.A0B = list;
        this.A0A = interfaceC31137Dmc;
        this.A01 = 3;
        this.A00 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012d  */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, X.2Vj] */
    @Override // X.AbstractC51572Yf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC50812Vc A0Y(X.C76223bS r34) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26588Bol.A0Y(X.3bS):X.2Vc");
    }

    static {
        EnumC76913cd enumC76913cd = AbstractC51432Xq.A04;
        A0C = new C89803zM(500);
    }

    private final C26584Boh A04(JLM jlm, JMS jms, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, boolean z, boolean z2, boolean z3) {
        UserSession userSession = this.A06;
        C38321qM c38321qM = this.A07;
        return new C26584Boh(jlm, jms, this.A02, this.A03, this.A05, userSession, c38321qM, this.A08, this.A0A, str, str2, interfaceC16820sZ, z, z2, z3);
    }

    private final AbstractC51572Yf A03(JLM jlm, JMS jms, Integer num, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue == 3) {
                        if (jms != null) {
                            return A04(null, jms, str, null, interfaceC16820sZ, z, true, C18U.A06(C06090Tz.A06, this.A06, 36326996598995189L));
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    throw B4Z.A00();
                }
                if (jms != null) {
                    return A04(null, jms, str, str2, interfaceC16820sZ, z, false, C18U.A06(C06090Tz.A06, this.A06, 36326996598995189L));
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            if (jlm != null) {
                return A04(jlm, null, str, null, C29872DFm.A00, z, false, false);
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        C25437BNc c25437BNc = this.A04;
        C38321qM c38321qM = this.A07;
        C75113Zb c75113Zb = this.A09;
        return new BQF(this.A02, this.A03, c25437BNc, this.A05, this.A06, c38321qM, c75113Zb, this.A0A, this.A08.getModuleName(), str, this.A01);
    }
}
