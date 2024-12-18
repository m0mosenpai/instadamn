package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class PZR extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;
    public final Object A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PZR(Object obj, Object obj2, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A05 = i;
        this.A04 = obj;
        this.A06 = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int i;
        switch (this.A05) {
            case 0:
                obj4 = this.A04;
                obj2 = this.A02;
                obj3 = this.A03;
                obj5 = this.A01;
                obj6 = this.A06;
                i = 0;
                return new PZR(obj5, obj3, obj4, obj2, obj6, interfaceC23621Ds, i);
            case 1:
                obj5 = this.A01;
                obj3 = this.A03;
                obj4 = this.A04;
                obj2 = this.A02;
                obj6 = this.A06;
                i = 1;
                return new PZR(obj5, obj3, obj4, obj2, obj6, interfaceC23621Ds, i);
            case 2:
                obj3 = this.A03;
                obj2 = this.A02;
                obj4 = this.A04;
                obj5 = this.A01;
                obj6 = this.A06;
                i = 2;
                return new PZR(obj5, obj3, obj4, obj2, obj6, interfaceC23621Ds, i);
            case 3:
                obj6 = this.A06;
                obj4 = this.A04;
                obj3 = this.A03;
                obj2 = this.A02;
                obj5 = this.A01;
                i = 3;
                return new PZR(obj5, obj3, obj4, obj2, obj6, interfaceC23621Ds, i);
            case 4:
                obj4 = this.A04;
                obj2 = this.A02;
                obj6 = this.A06;
                obj3 = this.A03;
                obj5 = this.A01;
                i = 4;
                return new PZR(obj5, obj3, obj4, obj2, obj6, interfaceC23621Ds, i);
            case 5:
                return new PZR(this.A04, this.A06, interfaceC23621Ds, 5);
            case 6:
                obj3 = this.A03;
                obj4 = this.A04;
                obj2 = this.A02;
                obj5 = this.A01;
                obj6 = this.A06;
                i = 6;
                return new PZR(obj5, obj3, obj4, obj2, obj6, interfaceC23621Ds, i);
            case 7:
                PZR pzr = new PZR(this.A04, this.A06, interfaceC23621Ds, 7);
                pzr.A01 = obj;
                return pzr;
            case 8:
                AbstractC51174MjI abstractC51174MjI = (AbstractC51174MjI) this.A04;
                return new PZR((C128175qm) this.A06, (DialogC50731MaZ) this.A02, (C47Z) this.A01, abstractC51174MjI, interfaceC23621Ds);
            case 9:
                UserSession userSession = (UserSession) this.A03;
                PZR pzr2 = new PZR((FragmentActivity) this.A06, (C25660BVw) this.A01, userSession, interfaceC23621Ds, (C5Hc) this.A02);
                pzr2.A04 = obj;
                return pzr2;
            case 10:
                obj2 = this.A02;
                obj3 = this.A03;
                obj4 = this.A04;
                obj5 = this.A01;
                obj6 = this.A06;
                i = 10;
                return new PZR(obj5, obj3, obj4, obj2, obj6, interfaceC23621Ds, i);
            default:
                obj2 = this.A02;
                obj3 = this.A03;
                obj4 = this.A04;
                obj5 = this.A01;
                obj6 = this.A06;
                i = 11;
                return new PZR(obj5, obj3, obj4, obj2, obj6, interfaceC23621Ds, i);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0476 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01da A[Catch: all -> 0x0216, TryCatch #1 {all -> 0x0216, blocks: (B:54:0x01ac, B:55:0x01af, B:57:0x01b5, B:63:0x01d6, B:65:0x01da, B:66:0x01e8, B:68:0x01ee, B:69:0x01f4, B:72:0x0200, B:73:0x0201, B:76:0x0206, B:77:0x0207, B:79:0x0208, B:80:0x0213, B:86:0x01bc, B:87:0x01c0, B:89:0x01c6, B:98:0x0173, B:99:0x0181, B:101:0x0187, B:103:0x019d, B:71:0x01f5), top: B:50:0x014d, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0221  */
    /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.Object, X.OzS] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 1284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PZR.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PZR) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PZR(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A05 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
        this.A02 = obj4;
        this.A06 = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PZR(FragmentActivity fragmentActivity, C25660BVw c25660BVw, UserSession userSession, InterfaceC23621Ds interfaceC23621Ds, C5Hc c5Hc) {
        super(2, interfaceC23621Ds);
        this.A05 = 9;
        this.A03 = userSession;
        this.A06 = fragmentActivity;
        this.A02 = c5Hc;
        this.A01 = c25660BVw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PZR(C128175qm c128175qm, DialogC50731MaZ dialogC50731MaZ, C47Z c47z, AbstractC51174MjI abstractC51174MjI, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A05 = 8;
        this.A04 = abstractC51174MjI;
        this.A06 = c128175qm;
        this.A01 = c47z;
        this.A02 = dialogC50731MaZ;
    }
}
