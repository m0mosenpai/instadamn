package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.X2c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71766X2c extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public final int A02;
    public final Object A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71766X2c(Object obj, Object obj2, String str, String str2, String str3, String str4, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A02 = i;
        this.A03 = obj;
        this.A01 = obj2;
        this.A06 = str;
        this.A07 = str2;
        this.A04 = str3;
        this.A05 = str4;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        switch (this.A02) {
            case 0:
                str2 = this.A07;
                str4 = this.A05;
                str = this.A06;
                str3 = this.A04;
                obj2 = this.A03;
                obj3 = this.A01;
                i = 0;
                return new C71766X2c(obj2, obj3, str, str2, str3, str4, interfaceC23621Ds, i);
            case 1:
                C71766X2c c71766X2c = new C71766X2c((UserSession) this.A03, this.A04, this.A06, this.A07, this.A05, interfaceC23621Ds);
                c71766X2c.A01 = obj;
                return c71766X2c;
            case 2:
                obj2 = this.A03;
                obj3 = this.A01;
                str = this.A06;
                str2 = this.A07;
                str3 = this.A04;
                str4 = this.A05;
                i = 2;
                return new C71766X2c(obj2, obj3, str, str2, str3, str4, interfaceC23621Ds, i);
            default:
                obj3 = this.A01;
                str3 = this.A04;
                str = this.A06;
                str2 = this.A07;
                str4 = this.A05;
                obj2 = this.A03;
                i = 3;
                return new C71766X2c(obj2, obj3, str, str2, str3, str4, interfaceC23621Ds, i);
        }
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C71766X2c) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ba A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r53) {
        /*
            Method dump skipped, instructions count: 1346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71766X2c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71766X2c(UserSession userSession, String str, String str2, String str3, String str4, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A02 = 1;
        this.A03 = userSession;
        this.A04 = str;
        this.A06 = str2;
        this.A07 = str3;
        this.A05 = str4;
    }
}
