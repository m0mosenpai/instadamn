package com.instagram.moments.data;

import X.AbstractC09440dt;
import X.AbstractC24771Iv;
import X.C19L;
import X.C57526Pg0;
import X.InterfaceC09390do;
import X.InterfaceC50122Sb;
import X.InterfaceC73153Pq;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class StandaloneMomentsDataSource implements InterfaceC73153Pq {
    public final UserSession A00;
    public final C19L A01 = AbstractC24771Iv.A01(1383647090, 3);
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(new C57526Pg0(this, 6));

    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.moments.data.StandaloneMomentsDataSource r6, X.InterfaceC23621Ds r7) {
        /*
            r3 = 6
            boolean r0 = X.C57145PWx.A02(r7, r3)
            if (r0 == 0) goto L5c
            r5 = r7
            X.PWx r5 = (X.C57145PWx) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5c
            int r2 = r2 - r1
            r5.A00 = r2
        L15:
            java.lang.Object r2 = r5.A02
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L38
            if (r0 != r3) goto L61
            X.AbstractC09560e7.A00(r2)
        L23:
            X.3NY r2 = (X.C3NY) r2
            X.Phw r1 = X.C57646Phw.A00
            boolean r0 = r2 instanceof X.C3NX
            if (r0 == 0) goto L35
            X.3NX r2 = (X.C3NX) r2
            java.lang.Object r0 = r2.A00
            java.lang.Object r0 = r1.invoke(r0)
            if (r0 != 0) goto L37
        L35:
            X.0sl r0 = X.C16930sl.A00
        L37:
            return r0
        L38:
            X.AbstractC09560e7.A00(r2)
            com.instagram.common.session.UserSession r0 = r6.A00
            X.1Ms r2 = X.AbstractC31177DnL.A0M(r0)
            java.lang.String r0 = "archive/reel/get_story_archive_memories/"
            r2.A0B(r0)
            java.lang.Class<X.N2J> r1 = X.N2J.class
            java.lang.Class<X.ONa> r0 = X.C54849ONa.class
            X.1ON r1 = X.AbstractC25227BEk.A0e(r2, r1, r0)
            r5.A01 = r6
            r5.A00 = r3
            r0 = 1383647090(0x5278c772, float:2.671245E11)
            java.lang.Object r2 = r1.A00(r0, r5)
            if (r2 != r4) goto L23
            return r4
        L5c:
            X.PWx r5 = X.C57145PWx.A00(r6, r7, r3)
            goto L15
        L61:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.moments.data.StandaloneMomentsDataSource.A00(com.instagram.moments.data.StandaloneMomentsDataSource, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.instagram.moments.data.StandaloneMomentsDataSource r16, X.InterfaceC23621Ds r17) {
        /*
            r2 = r16
            r4 = 6
            r6 = r17
            boolean r0 = X.PXA.A03(r6, r4)
            if (r0 == 0) goto L89
            r5 = r6
            X.PXA r5 = (X.PXA) r5
            int r3 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L89
            int r3 = r3 - r1
            r5.A00 = r3
        L19:
            java.lang.Object r6 = r5.A03
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L3e
            if (r0 != r3) goto L90
            java.lang.Object r2 = r5.A01
            X.AbstractC09560e7.A00(r6)
        L29:
            X.3NY r6 = (X.C3NY) r6
            r0 = 25
            X.PjY r1 = X.C57745PjY.A00(r2, r0)
            boolean r0 = r6 instanceof X.C3NX
            if (r0 == 0) goto L8e
            X.3NX r6 = (X.C3NX) r6
            java.lang.Object r0 = r6.A00
            java.lang.Object r4 = r1.invoke(r0)
            return r4
        L3e:
            X.AbstractC09560e7.A00(r6)
            com.instagram.common.session.UserSession r0 = r2.A00
            X.1ud r1 = X.AbstractC40691uc.A01(r0)
            X.2JM r9 = X.AbstractC25225BEi.A0b()
            X.2JM r8 = X.AbstractC25225BEi.A0b()
            X.0Jx r7 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r13 = 0
            r12 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)
            java.lang.String r0 = "user_id"
            X.0CA r6 = X.AbstractC25227BEk.A0T(r7, r6, r0)
            java.lang.String r0 = "request"
            X.1uJ r7 = X.AbstractC25233BEq.A0H(r6, r9, r0)
            java.util.Map r9 = r9.getParamsCopy()
            java.util.Map r10 = r8.getParamsCopy()
            java.lang.Class<com.instagram.reels.api.MemoriesPogQueryResponseImpl> r11 = com.instagram.reels.api.MemoriesPogQueryResponseImpl.class
            java.util.ArrayList r17 = X.AbstractC166987dD.A1E()
            java.lang.String r8 = "MemoriesPogQuery"
            java.lang.String r16 = "xdt_get_story_memories_pog"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r5.A01 = r2
            r5.A02 = r2
            r5.A00 = r3
            java.lang.Object r6 = r1.A04(r6, r5)
            if (r6 != r4) goto L29
            return r4
        L89:
            X.PXA r5 = X.PXA.A00(r2, r6, r4)
            goto L19
        L8e:
            r4 = 0
            return r4
        L90:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.moments.data.StandaloneMomentsDataSource.A01(com.instagram.moments.data.StandaloneMomentsDataSource, X.1Ds):java.lang.Object");
    }

    @Override // X.InterfaceC73153Pq
    public final InterfaceC50122Sb Avd() {
        return (InterfaceC50122Sb) this.A02.getValue();
    }

    public StandaloneMomentsDataSource(UserSession userSession) {
        this.A00 = userSession;
    }
}
