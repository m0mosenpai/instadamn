package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.MBd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50117MBd extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;
    public final String A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50117MBd(UserSession userSession, C8BH c8bh, String str, String str2, String str3, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A02 = 0;
        this.A04 = c8bh;
        this.A03 = userSession;
        this.A05 = str;
        this.A06 = str2;
        this.A07 = str3;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        String str;
        String str2;
        String str3;
        Object obj4;
        int i;
        switch (this.A02) {
            case 0:
                C50117MBd c50117MBd = new C50117MBd((UserSession) this.A03, (C8BH) this.A04, this.A05, this.A06, this.A07, interfaceC23621Ds);
                c50117MBd.A01 = obj;
                return c50117MBd;
            case 1:
                obj2 = this.A04;
                str = this.A07;
                str3 = this.A06;
                obj4 = this.A03;
                obj3 = this.A01;
                str2 = this.A05;
                i = 1;
                return new C50117MBd(obj2, obj4, obj3, str, str3, str2, interfaceC23621Ds, i);
            case 2:
                obj2 = this.A04;
                obj3 = this.A01;
                str = this.A07;
                str2 = this.A05;
                str3 = this.A06;
                obj4 = this.A03;
                i = 2;
                return new C50117MBd(obj2, obj4, obj3, str, str3, str2, interfaceC23621Ds, i);
            default:
                obj2 = this.A04;
                str2 = this.A05;
                obj4 = this.A03;
                str = this.A07;
                str3 = this.A06;
                obj3 = this.A01;
                i = 3;
                return new C50117MBd(obj2, obj4, obj3, str, str3, str2, interfaceC23621Ds, i);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01d2 A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50117MBd.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C50117MBd) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50117MBd(Object obj, Object obj2, Object obj3, String str, String str2, String str3, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A02 = i;
        this.A04 = obj;
        this.A07 = str;
        this.A06 = str2;
        this.A03 = obj2;
        this.A01 = obj3;
        this.A05 = str3;
    }
}
