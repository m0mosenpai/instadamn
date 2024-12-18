package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;

/* renamed from: X.7QQ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7QQ {
    public static final C7QQ A00 = new Object();

    public static final boolean A02(UserSession userSession, C81613kW c81613kW, C83403nh c83403nh, Integer num, int i) {
        if (i != 29 && c83403nh.A13 == null && c83403nh.A1F == C05F.A0j && AbstractC162497Pm.A01(userSession, c83403nh, i) && !c83403nh.A1Z()) {
            if (num == C05F.A00 || num == C05F.A0N) {
                return (c81613kW == null || !c81613kW.A01()) && !C4GR.A07(Integer.valueOf(i)) && C18U.A06(C06090Tz.A05, userSession, 36328087520033958L);
            }
            return false;
        }
        return false;
    }

    public static final boolean A03(UserSession userSession, C83403nh c83403nh, C7P8 c7p8, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        C14360o3.A0B(c7p8, 0);
        if (c7p8.AGC(userSession, c83403nh, i) && c83403nh.A13 == null && !z && !z2 && ((z3 || (i == 29 && i2 != 8)) && ((!z4 || !z5) && (!z6 || !C18U.A06(C06090Tz.A05, userSession, 36316392324338019L))))) {
            ImmutableList of = ImmutableList.of((Object) 6, (Object) 8);
            C14360o3.A07(of);
            if (!of.contains(Integer.valueOf(i2))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0017. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A00(com.instagram.common.session.UserSession r4, X.AnonymousClass988 r5, X.C83403nh r6, java.lang.Integer r7) {
        /*
            X.0cb r0 = X.C17060sy.A01
            com.instagram.user.model.User r1 = r0.A01(r4)
            boolean r0 = r6.A1S()
            r3 = 1
            if (r0 != 0) goto L1a
            boolean r0 = r6.A1T()
            if (r0 != 0) goto L1a
            int r0 = r7.intValue()
            switch(r0) {
                case 0: goto L57;
                case 1: goto L2d;
                case 2: goto L47;
                case 3: goto L1c;
                case 4: goto L30;
                case 5: goto L4a;
                default: goto L1a;
            }
        L1a:
            r3 = 0
            return r3
        L1c:
            r0 = 0
            X.C14360o3.A0B(r4, r0)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36317706584069609(0x8106c3000015e9, double:3.030802111207467E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 == 0) goto L1a
        L2d:
            X.0do r0 = r5.A0h
            goto L4c
        L30:
            boolean r0 = r6.A1j(r1)
            if (r0 == 0) goto L1a
            X.0do r0 = r5.A0h
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1a
            X.0do r0 = r5.A0f
            goto L4c
        L47:
            X.0do r0 = r5.A0i
            goto L4c
        L4a:
            X.0do r0 = r5.A0g
        L4c:
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L59
        L57:
            boolean r0 = r5.A1Q
        L59:
            if (r0 == 0) goto L1a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7QQ.A00(com.instagram.common.session.UserSession, X.988, X.3nh, java.lang.Integer):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r0.A02 != 8) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A01(com.instagram.common.session.UserSession r4, X.C81613kW r5, X.C83403nh r6, X.C2EC r7, int r8, boolean r9, boolean r10) {
        /*
            com.google.common.collect.ImmutableList r1 = r6.A0H()
            r3 = 1
            r0 = 0
            if (r1 == 0) goto L17
            java.lang.Object r0 = X.AbstractC001800i.A0O(r1, r0)
            X.43t r0 = (X.C910143t) r0
            if (r0 == 0) goto L17
            int r1 = r0.A02
            r0 = 8
            r2 = 1
            if (r1 == r0) goto L18
        L17:
            r2 = 0
        L18:
            if (r7 == 0) goto L66
            boolean r1 = X.AbstractC31224Do7.A01(r7)
        L1e:
            boolean r0 = X.C4GR.A06(r8)
            if (r0 == 0) goto L68
            if (r9 == 0) goto L68
            if (r1 != 0) goto L68
            if (r10 != 0) goto L68
            boolean r0 = r6.A2P
            if (r0 != 0) goto L68
            boolean r0 = r6.A1T()
            if (r0 != 0) goto L68
            com.instagram.model.direct.messageid.DirectMessageIdentifier r0 = r6.A13
            if (r0 != 0) goto L68
            boolean r0 = r6.A1S()
            if (r0 != 0) goto L68
            boolean r0 = r6.A1b()
            if (r0 != 0) goto L68
            if (r5 == 0) goto L68
            boolean r0 = r5.A03(r4)
            if (r0 != 0) goto L68
            if (r2 != 0) goto L68
            X.2EY r1 = r6.A10
            com.google.common.collect.ImmutableSet r0 = X.C2EY.A09
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L68
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36329603643490729(0x811195000041a9, double:3.0383258594909964E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 == 0) goto L68
            return r3
        L66:
            r1 = 0
            goto L1e
        L68:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7QQ.A01(com.instagram.common.session.UserSession, X.3kW, X.3nh, X.2EC, int, boolean, boolean):boolean");
    }

    public static final boolean A04(UserSession userSession, C83403nh c83403nh, Integer num, String str) {
        boolean contains;
        boolean z;
        boolean contains2;
        switch (num.intValue()) {
            case 0:
                C44164JfT A002 = AbstractC44152JfH.A00(userSession);
                synchronized (A002) {
                    contains = A002.A02.contains(str);
                }
                if (contains) {
                    return A002.A02(str);
                }
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                C14360o3.A0B(userSession, 0);
                Object A01 = userSession.A01(C48505Lcw.class, C50202MFj.A00);
                C48505Lcw c48505Lcw = (C48505Lcw) A01;
                synchronized (A01) {
                    z = c48505Lcw.A00;
                }
                if (z) {
                    synchronized (A01) {
                        contains2 = c48505Lcw.A01.contains(str);
                    }
                    return contains2;
                }
                break;
            default:
                return false;
        }
        return c83403nh.A2M;
    }

    public final boolean A05(UserSession userSession, AnonymousClass988 anonymousClass988, C81613kW c81613kW, C83403nh c83403nh, InterfaceC83733oI interfaceC83733oI, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        C2EY c2ey;
        C910143t c910143t;
        if (!c83403nh.A1T() && c81613kW != null && !c81613kW.A03(userSession) && !c83403nh.A1S() && c83403nh.A13 == null && !z && !z2 && !z3 && !z4 && (c2ey = c83403nh.A10) != C2EY.A0k && c2ey != C2EY.A0h && c83403nh.A1F == C05F.A0j && i != 29 && !C4GR.A01(i) && !C4GR.A02(i) && ((Boolean) anonymousClass988.A0b.getValue()).booleanValue()) {
            ImmutableList A0H = c83403nh.A0H();
            if ((A0H == null || (c910143t = (C910143t) AbstractC001800i.A0J(A0H)) == null || c910143t.A02 != 8 || !C18U.A06(C06090Tz.A05, userSession, 36324071726198652L)) && C98Q.A00(userSession).A00(interfaceC83733oI, 54)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
