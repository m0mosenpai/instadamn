package X;

import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.Bna, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26515Bna extends AbstractC51572Yf {
    public final UserSession A00;
    public final EnumC85043qs A01;
    public final C85233rE A02;
    public final InterfaceC60442pS A03;
    public final WeakReference A04;
    public final InterfaceC16660sJ A05;
    public final InterfaceC16660sJ A06;
    public final long A07;
    public final C51722Yv A08;
    public final C39H A09;
    public final C85183r9 A0A;

    public C26515Bna(C51722Yv c51722Yv, UserSession userSession, EnumC85043qs enumC85043qs, C39H c39h, C85183r9 c85183r9, C85233rE c85233rE, InterfaceC60442pS interfaceC60442pS, WeakReference weakReference, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, long j) {
        C14360o3.A0B(c85183r9, 5);
        AbstractC167017dG.A1U(userSession, interfaceC60442pS);
        AbstractC25229BEm.A1K(enumC85043qs, 8, c39h);
        this.A07 = j;
        this.A08 = c51722Yv;
        this.A04 = weakReference;
        this.A02 = c85233rE;
        this.A0A = c85183r9;
        this.A00 = userSession;
        this.A03 = interfaceC60442pS;
        this.A01 = enumC85043qs;
        this.A06 = interfaceC16660sJ;
        this.A05 = interfaceC16660sJ2;
        this.A09 = c39h;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C51722Yv c51722Yv = this.A08;
        UserSession userSession = this.A00;
        InterfaceC60442pS interfaceC60442pS = this.A03;
        WeakReference weakReference = this.A04;
        long j = this.A07;
        return new C26619BpG(c51722Yv, userSession, new C29211CuG(this), this.A09, this.A0A, interfaceC60442pS, weakReference, new DGY(this, 26), new DRQ(this, 46), j);
    }
}
