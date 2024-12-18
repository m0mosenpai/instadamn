package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* renamed from: X.Gcp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37347Gcp implements C3GY {
    public static final C1P1 A0O = new C37360Gd2(1);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public C1P1 A07;
    public C40741uh A08;
    public AbstractC70903Gc A09;
    public Integer A0A;
    public final int A0B;
    public final Context A0C;
    public final UserSession A0D;
    public final AnonymousClass318 A0E;
    public final InterfaceC60442pS A0F;
    public final C3G2 A0G;
    public final InterfaceC62242sP A0H;
    public final C1M1 A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final InterfaceC41501vz A0M;
    public final String A0N;

    @Override // X.C3GY
    public final C1P1 AMt(EnumC37671p4 enumC37671p4, UUID uuid, boolean z) {
        return new C37351Gct(0, this, enumC37671p4, uuid, false, z);
    }

    public static final C101484hA A00(C40741uh c40741uh, C37347Gcp c37347Gcp, boolean z, boolean z2) {
        Collection<C37771pE> emptyList;
        HashMap A1G;
        List A0K;
        if (z) {
            AbstractC70903Gc abstractC70903Gc = c37347Gcp.A09;
            if (abstractC70903Gc != null) {
                InterfaceC670130s interfaceC670130s = abstractC70903Gc.A02;
                if (interfaceC670130s != null) {
                    interfaceC670130s.D7Y();
                    C16930sl c16930sl = C16930sl.A00;
                    return new C101484hA(c16930sl, c16930sl);
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        UserSession userSession = c37347Gcp.A0D;
        if (c40741uh.A03(userSession) != null) {
            emptyList = c40741uh.A03(userSession).values();
        } else {
            emptyList = Collections.emptyList();
        }
        C14360o3.A07(emptyList);
        HashMap hashMap = c40741uh.A07;
        if (hashMap != null) {
            A1G = new HashMap(hashMap);
        } else {
            A1G = AbstractC166987dD.A1G();
        }
        Iterable values = A1G.values();
        if (values == null) {
            values = C16930sl.A00;
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        for (C37771pE c37771pE : emptyList) {
            if (c37771pE != null && AbstractC37741pB.A08(userSession, c37771pE)) {
                AbstractC37741pB.A04(c37771pE);
                Iterator it = AbstractC37741pB.A05(c37771pE).iterator();
                while (it.hasNext()) {
                    C38321qM A0i = AbstractC31172DnG.A0i(it);
                    if (!A1E.contains(AbstractC41071vF.A07(userSession, A0i))) {
                        A1E.add(AbstractC41071vF.A07(userSession, A0i));
                    }
                    C38321qM BQN = A0i.BQN();
                    if (BQN.CdW() && AbstractC41071vF.A0K(userSession, BQN) == null && (A0K = AbstractC41071vF.A0K(userSession, BQN)) != null) {
                        C114995Hs A00 = AbstractC114985Hr.A00(userSession);
                        if (!A0K.isEmpty()) {
                            A00.A00 = A0K;
                        }
                    }
                }
            }
        }
        A01(c37347Gcp, AbstractC001800i.A0X(A1E), c40741uh.mStatusCode);
        int i = c40741uh.mStatusCode;
        AnonymousClass318 anonymousClass318 = c37347Gcp.A0E;
        anonymousClass318.A0Z = String.valueOf(c40741uh.mResponseId);
        anonymousClass318.A0b = AbstractC31180DnO.A0k(c40741uh.A09);
        anonymousClass318.A0J = AbstractC31171DnF.A0V(c40741uh.A03(userSession).size());
        AbstractC70903Gc abstractC70903Gc2 = c37347Gcp.A09;
        if (abstractC70903Gc2 != null) {
            return abstractC70903Gc2.A01(String.valueOf(c40741uh.mResponseId), AbstractC001800i.A0X(emptyList), AbstractC001800i.A0X(values), c40741uh.A09, i, System.currentTimeMillis() - c37347Gcp.A06, z2);
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.C3GY
    public final void A7R(AnonymousClass320 anonymousClass320) {
        this.A04 = anonymousClass320.A01;
    }

    @Override // X.C3GY
    public final C1P1 AMB() {
        return new C37351Gct(0, this, EnumC37671p4.A04, null, true, false);
    }

    @Override // X.C3GY
    public final int AaC() {
        return this.A00;
    }

    @Override // X.C3GY
    public final int B0B() {
        return this.A01;
    }

    @Override // X.C3GY
    public final C40741uh B6g() {
        return this.A08;
    }

    @Override // X.C3GY
    public final int BWp() {
        return this.A02;
    }

    @Override // X.C3GY
    public final int Bg1() {
        return this.A03;
    }

    @Override // X.C3GY
    public final boolean Cbb() {
        return AbstractC167007dF.A1X(this.A0A, C05F.A0C);
    }

    public C37347Gcp(Context context, UserSession userSession, AnonymousClass318 anonymousClass318, InterfaceC60442pS interfaceC60442pS, C3G2 c3g2, InterfaceC62242sP interfaceC62242sP, C1M1 c1m1, String str) {
        this.A0C = context;
        this.A0G = c3g2;
        this.A0D = userSession;
        this.A0F = interfaceC60442pS;
        this.A0I = c1m1;
        this.A0N = str;
        this.A0E = anonymousClass318;
        this.A0H = interfaceC62242sP;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A0J = C18U.A06(c06090Tz, userSession, 36310538284761220L);
        boolean A06 = C18U.A06(c06090Tz, userSession, 36310538285023368L);
        this.A0L = A06;
        this.A07 = A0O;
        this.A0A = C05F.A00;
        this.A0M = C37816GkW.A00(this, 12);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = -1;
        this.A00 = A06 ? 0 : -1;
        this.A0K = C18U.A06(c06090Tz, userSession, 36310538285088905L);
        this.A0B = AbstractC25225BEi.A07(c06090Tz, userSession, 36592013263831167L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r13.A01 != (-1)) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C37347Gcp r13, java.util.List r14, int r15) {
        /*
            long r10 = java.lang.System.currentTimeMillis()
            com.instagram.common.session.UserSession r2 = r13.A0D
            X.2pS r3 = r13.A0F
            java.lang.String r4 = r13.A0N
            X.1M1 r0 = r13.A0I
            java.lang.String r5 = r0.getSessionId()
            int r0 = r13.A02
            r1 = -1
            if (r0 != r1) goto L1a
            int r0 = r13.A01
            r12 = 1
            if (r0 == r1) goto L1b
        L1a:
            r12 = 0
        L1b:
            long r0 = r13.A06
            long r8 = r10 - r0
            long r0 = r13.A05
            long r10 = r10 - r0
            r6 = r14
            r7 = r15
            X.C32U.A0U(r2, r3, r4, r5, r6, r7, r8, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37347Gcp.A01(X.Gcp, java.util.List, int):void");
    }

    @Override // X.C3GY
    public final void EPL(C1P1 c1p1) {
        this.A07 = c1p1;
    }

    @Override // X.C3GY
    public final void EQm(AbstractC70903Gc abstractC70903Gc) {
        this.A09 = abstractC70903Gc;
    }
}
