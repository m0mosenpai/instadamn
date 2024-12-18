package X;

import com.instagram.user.model.User;
import com.meta.metaai.imagine.service.ImagineNetworkService;

/* loaded from: classes5.dex */
public final class D4t extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public final int A02 = 0;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D4t(C27259C1c c27259C1c, User user, String str, String str2, String str3, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(2, interfaceC23621Ds);
        this.A04 = c27259C1c;
        this.A03 = user;
        this.A08 = z;
        this.A05 = str;
        this.A07 = str2;
        this.A06 = str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008f A[PHI: r0
      0x008f: PHI (r0v3 X.1JX) = (r0v1 X.1JX), (r0v4 X.1JX) binds: [B:23:0x006d, B:12:0x008d] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r8 = r15
            r3 = r16
            int r0 = r15.A02
            if (r0 == 0) goto L14
            X.1JX r0 = X.C1JX.A02
            int r2 = r15.A00
            r1 = 1
            if (r2 == 0) goto L70
            if (r2 != r1) goto L90
            X.AbstractC09560e7.A00(r3)
        L13:
            return r3
        L14:
            X.1JX r0 = X.C1JX.A02
            int r1 = r15.A00
            r2 = 2
            r4 = 1
            if (r1 == 0) goto L24
            if (r1 == r4) goto L4d
            java.lang.Object r0 = r15.A01
            X.AbstractC09560e7.A00(r3)
            return r0
        L24:
            X.AbstractC09560e7.A00(r3)
            java.lang.Object r1 = r15.A04
            X.C1c r1 = (X.C27259C1c) r1
            com.instagram.common.session.UserSession r9 = r1.A00
            java.lang.Object r1 = r15.A03
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            java.lang.String r10 = r1.getId()
            boolean r14 = r15.A08
            java.lang.String r11 = r15.A05
            java.lang.String r12 = r15.A07
            java.lang.String r13 = r15.A06
            X.1ON r3 = X.FCH.A00(r9, r10, r11, r12, r13, r14)
            r15.A00 = r4
            r1 = 1387110682(0x52ada11a, float:3.728661E11)
            java.lang.Object r3 = r3.A00(r1, r15)
            if (r3 != r0) goto L50
            return r0
        L4d:
            X.AbstractC09560e7.A00(r3)
        L50:
            boolean r1 = r3 instanceof X.C3NX
            if (r1 == 0) goto L13
            X.12L r1 = X.C12L.A00
            X.12T r1 = r1.A04
            java.lang.Object r11 = r15.A03
            boolean r14 = r15.A08
            java.lang.Object r10 = r15.A04
            r12 = 0
            r13 = 3
            X.JQE r9 = new X.JQE
            r9.<init>(r10, r11, r12, r13, r14)
            r15.A01 = r3
            r15.A00 = r2
            java.lang.Object r1 = X.AbstractC23641Du.A00(r15, r1, r9)
            if (r1 == r0) goto L8f
            return r3
        L70:
            X.AbstractC09560e7.A00(r3)
            java.lang.Object r3 = r15.A04
            com.meta.metaai.imagine.service.ImagineNetworkService r3 = (com.meta.metaai.imagine.service.ImagineNetworkService) r3
            java.lang.String r5 = r15.A06
            java.lang.String r6 = r15.A05
            java.lang.Object r2 = r15.A03
            X.C7N r2 = (X.C7N) r2
            boolean r9 = r15.A08
            java.lang.Object r4 = r15.A01
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.String r7 = r15.A07
            r15.A00 = r1
            java.lang.Object r3 = com.meta.metaai.imagine.service.ImagineNetworkService.A03(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r3 != r0) goto L13
        L8f:
            return r0
        L90:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D4t.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        if (this.A02 != 0) {
            ImagineNetworkService imagineNetworkService = (ImagineNetworkService) this.A04;
            String str = this.A06;
            String str2 = this.A05;
            return new D4t((C7N) this.A03, imagineNetworkService, (Integer) this.A01, str, str2, this.A07, interfaceC23621Ds, this.A08);
        }
        return new D4t((C27259C1c) this.A04, (User) this.A03, this.A05, this.A07, this.A06, interfaceC23621Ds, this.A08);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((D4t) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D4t(C7N c7n, ImagineNetworkService imagineNetworkService, Integer num, String str, String str2, String str3, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(2, interfaceC23621Ds);
        this.A04 = imagineNetworkService;
        this.A06 = str;
        this.A05 = str2;
        this.A03 = c7n;
        this.A08 = z;
        this.A01 = num;
        this.A07 = str3;
    }
}
