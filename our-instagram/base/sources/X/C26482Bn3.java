package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.Bn3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26482Bn3 extends AbstractC51572Yf {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final InterfaceC31025DkO A02;
    public final InterfaceC31056Dkw A03;
    public final BWM A04;
    public final HashMap A05;
    public final HashMap A06;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        BWM bwm = this.A04;
        if (bwm.A0C) {
            return new BVL(this.A00, this.A01, this.A02, bwm, this.A03, this.A05, this.A06);
        }
        return null;
    }

    public C26482Bn3(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC31025DkO interfaceC31025DkO, InterfaceC31056Dkw interfaceC31056Dkw, BWM bwm, HashMap hashMap, HashMap hashMap2) {
        AbstractC25234BEr.A1P(interfaceC11380iw, userSession, hashMap);
        AbstractC167007dF.A1H(hashMap2, 5, interfaceC31056Dkw);
        this.A00 = interfaceC11380iw;
        this.A01 = userSession;
        this.A04 = bwm;
        this.A06 = hashMap;
        this.A05 = hashMap2;
        this.A02 = interfaceC31025DkO;
        this.A03 = interfaceC31056Dkw;
    }
}
