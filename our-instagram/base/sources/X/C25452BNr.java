package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.BNr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25452BNr extends AbstractC51572Yf {
    public final float A00;
    public final long A01;
    public final long A02;
    public final C37644Ghd A03;
    public final UserSession A04;
    public final InterfaceC60442pS A05;
    public final InterfaceC31159Dn3 A06;
    public final InterfaceC30881Dhu A07;
    public final InterfaceC31046Dkk A08;
    public final InterfaceC16660sJ A09;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        InterfaceC30881Dhu interfaceC30881Dhu = this.A07;
        if (interfaceC30881Dhu instanceof D0K) {
            return null;
        }
        if (interfaceC30881Dhu instanceof BL9) {
            C75113Zb c75113Zb = this.A03.A0E;
            if (c75113Zb == null) {
                return null;
            }
            InterfaceC31046Dkk interfaceC31046Dkk = this.A08;
            UserSession userSession = this.A04;
            InterfaceC60442pS interfaceC60442pS = this.A05;
            InterfaceC31159Dn3 interfaceC31159Dn3 = this.A06;
            long j = this.A01;
            long j2 = this.A02;
            return new C25454BNt(userSession, interfaceC60442pS, c75113Zb, interfaceC31159Dn3, (BL9) interfaceC30881Dhu, interfaceC31046Dkk, this.A09, this.A00, j, j2);
        }
        throw B4Z.A00();
    }

    public C25452BNr(C37644Ghd c37644Ghd, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC31159Dn3 interfaceC31159Dn3, InterfaceC30881Dhu interfaceC30881Dhu, InterfaceC31046Dkk interfaceC31046Dkk, InterfaceC16660sJ interfaceC16660sJ, float f, long j, long j2) {
        AbstractC25234BEr.A1P(interfaceC30881Dhu, interfaceC31046Dkk, interfaceC60442pS);
        AbstractC167017dG.A1T(c37644Ghd, interfaceC31159Dn3);
        C14360o3.A0B(interfaceC16660sJ, 9);
        this.A07 = interfaceC30881Dhu;
        this.A08 = interfaceC31046Dkk;
        this.A04 = userSession;
        this.A05 = interfaceC60442pS;
        this.A03 = c37644Ghd;
        this.A06 = interfaceC31159Dn3;
        this.A01 = j;
        this.A02 = j2;
        this.A09 = interfaceC16660sJ;
        this.A00 = f;
    }
}
