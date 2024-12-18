package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Deprecated;

@Deprecated(message = "Keep in sync with ReelAdsAndNetegoResponseHandlerKt which is the Kotlin equivalent of this class, which is being AB tested. If adding a usage of this class, you should also use ReelAdsAndNetegoResponseHandlerKt depending on A/B test state.")
/* renamed from: X.3GX, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3GX implements C3GY {
    public static final C1P1 A0O = new C1P1() { // from class: X.3GZ
    };
    public int A00;
    public int A04;
    public long A05;
    public long A06;
    public C40741uh A08;
    public AbstractC70903Gc A09;
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
    public final String A0N;
    public C1P1 A07 = A0O;
    public Integer A0A = C05F.A00;
    public final InterfaceC41501vz A0M = new InterfaceC41501vz() { // from class: X.3Ga
        @Override // X.InterfaceC41501vz
        public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
            int A03 = C0f9.A03(1731674976);
            String A00 = AbstractC111324zv.A00(3589);
            int A032 = C0f9.A03(64241761);
            try {
                throw new NullPointerException(AbstractC111324zv.A00(4507));
            } catch (IOException e) {
                C0K8.A0F(A00, AbstractC111324zv.A00(665), e);
                C0f9.A0A(-1465806041, A032);
                C0f9.A0A(1215641589, A03);
            }
        }
    };
    public int A03 = -1;
    public int A02 = -1;
    public int A01 = -1;

    @Override // X.C3GY
    public final C1P1 AMt(EnumC37671p4 enumC37671p4, UUID uuid, boolean z) {
        return new C71033Gp(this, enumC37671p4, uuid, false, z);
    }

    public static C101484hA A00(C40741uh c40741uh, C3GX c3gx, boolean z, boolean z2) {
        Collection<C37771pE> emptyList;
        HashMap hashMap;
        String obj;
        List A0K;
        if (z) {
            InterfaceC670130s interfaceC670130s = c3gx.A09.A02;
            if (interfaceC670130s != null) {
                interfaceC670130s.D7Y();
                C16930sl c16930sl = C16930sl.A00;
                return new C101484hA(c16930sl, c16930sl);
            }
            throw new IllegalStateException("Required value was null.");
        }
        UserSession userSession = c3gx.A0D;
        if (c40741uh.A03(userSession) != null) {
            emptyList = c40741uh.A03(userSession).values();
        } else {
            emptyList = Collections.emptyList();
        }
        HashMap hashMap2 = c40741uh.A07;
        if (hashMap2 != null) {
            new HashMap(hashMap2);
        }
        HashMap hashMap3 = c40741uh.A07;
        if (hashMap3 != null) {
            hashMap = new HashMap(hashMap3);
        } else {
            hashMap = new HashMap();
        }
        Collection values = hashMap.values();
        ArrayList arrayList = new ArrayList();
        for (C37771pE c37771pE : emptyList) {
            if (c37771pE != null && AbstractC37741pB.A08(userSession, c37771pE)) {
                AbstractC37741pB.A04(c37771pE);
                for (C38321qM c38321qM : AbstractC37741pB.A05(c37771pE)) {
                    if (!arrayList.contains(AbstractC41071vF.A07(userSession, c38321qM))) {
                        arrayList.add(AbstractC41071vF.A07(userSession, c38321qM));
                    }
                    C38321qM BQN = c38321qM.BQN();
                    if (BQN.CdW() && AbstractC41071vF.A0K(userSession, BQN) == null && (A0K = AbstractC41071vF.A0K(userSession, BQN)) != null) {
                        C114995Hs A00 = AbstractC114985Hr.A00(userSession);
                        if (!A0K.isEmpty()) {
                            A00.A00 = A0K;
                        }
                    }
                }
            }
        }
        A01(c3gx, arrayList, c40741uh.mStatusCode);
        int i = c40741uh.mStatusCode;
        AnonymousClass318 anonymousClass318 = c3gx.A0E;
        anonymousClass318.A0Z = Integer.toString(c40741uh.mResponseId);
        UUID uuid = c40741uh.A09;
        if (uuid == null) {
            obj = null;
        } else {
            obj = uuid.toString();
        }
        anonymousClass318.A0b = obj;
        anonymousClass318.A0J = Long.valueOf(c40741uh.A03(userSession).size());
        return c3gx.A09.A01(Integer.toString(c40741uh.mResponseId), emptyList, values, c40741uh.A09, i, System.currentTimeMillis() - c3gx.A06, z2);
    }

    @Override // X.C3GY
    public final void A7R(AnonymousClass320 anonymousClass320) {
        this.A04 = anonymousClass320.A01;
    }

    @Override // X.C3GY
    public final C1P1 AMB() {
        return new C71033Gp(this, EnumC37671p4.A04, null, true, false);
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
        if (this.A0A != C05F.A0C) {
            return false;
        }
        return true;
    }

    public C3GX(Context context, UserSession userSession, AnonymousClass318 anonymousClass318, InterfaceC60442pS interfaceC60442pS, C3G2 c3g2, InterfaceC62242sP interfaceC62242sP, C1M1 c1m1, String str) {
        this.A0C = context;
        this.A0D = userSession;
        this.A0N = str;
        this.A0F = interfaceC60442pS;
        this.A0I = c1m1;
        this.A0G = c3g2;
        this.A0E = anonymousClass318;
        this.A0H = interfaceC62242sP;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A0J = C18U.A06(c06090Tz, userSession, 36310538284761220L);
        boolean A06 = C18U.A06(c06090Tz, userSession, 36310538285023368L);
        this.A0L = A06;
        this.A00 = A06 ? 0 : -1;
        this.A0K = C18U.A06(c06090Tz, userSession, 36310538285088905L);
        Long valueOf = Long.valueOf(C18U.A01(c06090Tz, userSession, 36592013263831167L));
        this.A0B = valueOf != null ? valueOf.intValue() : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r13.A01 != (-1)) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(X.C3GX r13, java.util.List r14, int r15) {
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
        throw new UnsupportedOperationException("Method not decompiled: X.C3GX.A01(X.3GX, java.util.List, int):void");
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
