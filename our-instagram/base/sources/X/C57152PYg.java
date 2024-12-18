package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.PYg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57152PYg extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public final int A02;
    public final int A03;
    public final Object A04;
    public final String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57152PYg(UserSession userSession, String str, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A02 = 0;
        this.A04 = userSession;
        this.A05 = str;
        this.A03 = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        String str;
        int i;
        Object obj3;
        int i2;
        switch (this.A02) {
            case 0:
                C57152PYg c57152PYg = new C57152PYg((UserSession) this.A04, this.A05, interfaceC23621Ds, this.A03);
                c57152PYg.A01 = obj;
                return c57152PYg;
            case 1:
                obj2 = this.A01;
                str = this.A05;
                i = this.A03;
                obj3 = this.A04;
                i2 = 1;
                return new C57152PYg(obj2, obj3, str, interfaceC23621Ds, i, i2);
            default:
                obj2 = this.A01;
                str = this.A05;
                i = this.A03;
                obj3 = this.A04;
                i2 = 2;
                return new C57152PYg(obj2, obj3, str, interfaceC23621Ds, i, i2);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011d  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57152PYg.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C57152PYg) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57152PYg(Object obj, Object obj2, String str, InterfaceC23621Ds interfaceC23621Ds, int i, int i2) {
        super(2, interfaceC23621Ds);
        this.A02 = i2;
        this.A01 = obj;
        this.A05 = str;
        this.A03 = i;
        this.A04 = obj2;
    }
}
