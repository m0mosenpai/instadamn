package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7Hj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC160497Hj {
    public static final InterfaceC160517Hl A01(UserSession userSession, C7TT c7tt, boolean z) {
        C14360o3.A0B(userSession, 0);
        if (c7tt == null) {
            return C160507Hk.A00;
        }
        boolean z2 = c7tt.A0r;
        boolean z3 = c7tt.A0y;
        boolean z4 = c7tt.A0o;
        return A02(userSession, c7tt.A0G, c7tt.A0b, z, z2, z3, z4, c7tt.A1G);
    }

    public static final InterfaceC160517Hl A02(UserSession userSession, C81613kW c81613kW, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        InterfaceC160517Hl interfaceC160517Hl;
        C14360o3.A0B(list, 5);
        if (z) {
            if (C6X6.A0W(list, z2, z3, z4, z5) && C6X6.A0G(userSession, c81613kW)) {
                interfaceC160517Hl = G1Z.A00;
            } else if (C6X6.A0W(list, z2, z3, z4, z5) && C6X6.A0H(userSession, c81613kW)) {
                interfaceC160517Hl = C43688JTx.A00;
            }
            return interfaceC160517Hl;
        }
        interfaceC160517Hl = C160507Hk.A00;
        return interfaceC160517Hl;
    }

    public static final InterfaceC160517Hl A03(UserSession userSession, C2EC c2ec) {
        C14360o3.A0B(userSession, 0);
        boolean A04 = AbstractC31224Do7.A04(c2ec.BSH(), c2ec.isPending(), c2ec.CVQ());
        boolean CVQ = c2ec.CVQ();
        boolean CX1 = c2ec.CX1();
        boolean CPl = c2ec.CPl();
        List BSH = c2ec.BSH();
        ArrayList arrayList = new ArrayList();
        for (Object obj : BSH) {
            if (!C14360o3.A0K(AbstractC76433bn.A00((User) obj), userSession.userId)) {
                arrayList.add(obj);
            }
        }
        return A02(userSession, c2ec.Aic(), arrayList, true, CVQ, CX1, CPl, A04);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x001a, code lost:
    
        if (r3 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.InterfaceC160517Hl A00(com.instagram.common.session.UserSession r2, X.C7TT r3, boolean r4) {
        /*
            if (r3 == 0) goto L30
            X.3kW r0 = r3.A0G
        L4:
            boolean r0 = X.C6X6.A0I(r2, r0)
            r1 = 1
            if (r0 == 0) goto L1a
            if (r3 == 0) goto L2d
            X.52z r0 = r3.A0N
            if (r0 == 0) goto L1c
            boolean r0 = r0.A08
            if (r0 != r1) goto L1c
            X.G1Z r0 = X.G1Z.A00
        L17:
            X.7Hl r0 = (X.InterfaceC160517Hl) r0
            return r0
        L1a:
            if (r3 == 0) goto L2d
        L1c:
            boolean r0 = X.C6X6.A0D(r2, r3, r4)
            if (r0 == 0) goto L2d
            X.52z r0 = r3.A0N
            if (r0 == 0) goto L2d
            boolean r0 = r0.A08
            if (r0 != r1) goto L2d
            X.JTx r0 = X.C43688JTx.A00
            goto L17
        L2d:
            X.7Hk r0 = X.C160507Hk.A00
            goto L17
        L30:
            r0 = 0
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC160497Hj.A00(com.instagram.common.session.UserSession, X.7TT, boolean):X.7Hl");
    }
}
