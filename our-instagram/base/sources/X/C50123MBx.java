package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.MBx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50123MBx extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public long A01;
    public Object A02;
    public final int A03;
    public final long A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50123MBx(UserSession userSession, InterfaceC23621Ds interfaceC23621Ds, long j) {
        super(2, interfaceC23621Ds);
        this.A03 = 5;
        this.A05 = userSession;
        this.A04 = j;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        long j;
        long j2;
        Object obj2;
        Object obj3;
        int i;
        switch (this.A03) {
            case 0:
                j2 = this.A04;
                obj3 = this.A02;
                j = this.A01;
                obj2 = this.A05;
                i = 0;
                break;
            case 1:
                j2 = this.A04;
                obj2 = this.A05;
                obj3 = this.A02;
                j = this.A01;
                i = 1;
                break;
            case 2:
                j = this.A01;
                j2 = this.A04;
                obj2 = this.A05;
                obj3 = this.A02;
                i = 2;
                break;
            case 3:
                j = this.A01;
                j2 = this.A04;
                obj2 = this.A05;
                obj3 = this.A02;
                i = 3;
                break;
            case 4:
                C50123MBx c50123MBx = new C50123MBx(interfaceC23621Ds, (InterfaceC16820sZ) this.A05, this.A04, this.A01);
                c50123MBx.A02 = obj;
                return c50123MBx;
            default:
                return new C50123MBx((UserSession) this.A05, interfaceC23621Ds, this.A04);
        }
        return new C50123MBx(obj2, obj3, interfaceC23621Ds, i, j, j2);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0169 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0198 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x008a -> B:19:0x006c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x012d -> B:64:0x0133). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x0167 -> B:78:0x016d). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50123MBx.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C50123MBx) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50123MBx(InterfaceC23621Ds interfaceC23621Ds, InterfaceC16820sZ interfaceC16820sZ, long j, long j2) {
        super(2, interfaceC23621Ds);
        this.A03 = 4;
        this.A05 = interfaceC16820sZ;
        this.A04 = j;
        this.A01 = j2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50123MBx(Object obj, Object obj2, InterfaceC23621Ds interfaceC23621Ds, int i, long j, long j2) {
        super(2, interfaceC23621Ds);
        this.A03 = i;
        this.A01 = j;
        this.A04 = j2;
        this.A05 = obj;
        this.A02 = obj2;
    }
}
