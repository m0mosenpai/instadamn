package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7PP, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7PP implements C7P8 {
    @Override // X.C7P8
    public final boolean ABK() {
        return false;
    }

    @Override // X.C7P8
    public final boolean AFT(UserSession userSession, C83403nh c83403nh) {
        C14360o3.A0B(c83403nh, 0);
        return c83403nh.A1S();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        if (r0.A00() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r1 == X.EnumC109104va.A08) goto L17;
     */
    @Override // X.C7P8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AFc(com.instagram.common.session.UserSession r6, X.C83403nh r7, int r8) {
        /*
            r5 = this;
            r0 = 0
            X.C14360o3.A0B(r6, r0)
            r0 = 1
            r4 = 32
            X.C14360o3.A0B(r7, r0)
            X.2EY r3 = r7.A10
            X.F4p r0 = X.AbstractC34139F4p.$redex_init_class
            int r1 = r3.ordinal()
            r2 = 0
            if (r1 == r4) goto L30
            r0 = 33
            if (r1 == r0) goto L63
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Invalid type: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L30:
            java.lang.Object r1 = r7.A1T
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.model.DirectLiveViewerInvite"
            X.C14360o3.A0C(r1, r0)
            X.IKN r1 = (X.IKN) r1
            X.4pt r1 = r1.A01
            if (r1 == 0) goto L63
            java.lang.String r0 = r1.A05(r6)
            if (r0 == 0) goto L58
            X.4va r0 = r1.A06
            if (r0 != 0) goto L49
            X.4va r0 = X.EnumC109104va.A0E
        L49:
            boolean r0 = r0.A00()
            if (r0 != 0) goto L58
        L4f:
            r1 = 1
        L50:
            boolean r0 = r7.A2P
            if (r0 != 0) goto L57
            if (r1 == 0) goto L57
            r2 = 1
        L57:
            return r2
        L58:
            X.4va r1 = r1.A06
            if (r1 != 0) goto L5e
            X.4va r1 = X.EnumC109104va.A0E
        L5e:
            X.4va r0 = X.EnumC109104va.A08
            if (r1 != r0) goto L63
            goto L4f
        L63:
            r1 = 0
            goto L50
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7PP.AFc(com.instagram.common.session.UserSession, X.3nh, int):boolean");
    }

    @Override // X.C7P8
    public final boolean AFi(C83403nh c83403nh) {
        return true;
    }

    @Override // X.C7P8
    public final boolean AFu(UserSession userSession, C83403nh c83403nh) {
        return false;
    }

    @Override // X.C7P8
    public final boolean AFv(UserSession userSession, C83403nh c83403nh) {
        C14360o3.A0B(c83403nh, 1);
        C2EY c2ey = c83403nh.A10;
        AbstractC34139F4p abstractC34139F4p = AbstractC34139F4p.$redex_init_class;
        int ordinal = c2ey.ordinal();
        if (ordinal != 32) {
            if (ordinal == 33) {
                return false;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid type: ");
            sb.append(c2ey);
            throw new IllegalStateException(sb.toString());
        }
        Object obj = c83403nh.A1T;
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.model.DirectLiveViewerInvite");
        if (((IKN) obj).A08.length() == 0) {
            return false;
        }
        return true;
    }

    @Override // X.C7P8
    public final boolean AFw(UserSession userSession, C83403nh c83403nh) {
        return false;
    }

    @Override // X.C7P8
    public final boolean AFx(UserSession userSession, C83403nh c83403nh) {
        return false;
    }

    @Override // X.C7P8
    public final boolean AGC(UserSession userSession, C83403nh c83403nh, int i) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c83403nh, 1);
        return AbstractC163297So.A00(c83403nh, userSession.userId);
    }

    @Override // X.C7P8
    public final String C2p(UserSession userSession, C83403nh c83403nh) {
        C14360o3.A0B(c83403nh, 1);
        C2EY c2ey = c83403nh.A10;
        AbstractC34139F4p abstractC34139F4p = AbstractC34139F4p.$redex_init_class;
        int ordinal = c2ey.ordinal();
        if (ordinal != 32) {
            if (ordinal == 33) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid type: ");
            sb.append(c2ey);
            throw new IllegalStateException(sb.toString());
        }
        Object obj = c83403nh.A1T;
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.model.DirectLiveViewerInvite");
        return ((IKN) obj).A08;
    }

    @Override // X.C7P8
    public final String CGv() {
        return null;
    }

    @Override // X.C7P8
    public final boolean CQP() {
        return true;
    }

    @Override // X.C7P8
    public final boolean CT9(UserSession userSession) {
        return false;
    }

    @Override // X.C7P8
    public final boolean CTC(UserSession userSession, C83403nh c83403nh) {
        C14360o3.A0B(userSession, 0);
        return AbstractC1576275w.A00(AbstractC23021Ah.A00(userSession));
    }

    @Override // X.C7P8
    public final boolean CTE(UserSession userSession, C83403nh c83403nh) {
        C14360o3.A0B(userSession, 0);
        return AbstractC1576275w.A01(AbstractC23021Ah.A00(userSession));
    }

    @Override // X.C7P8
    public final boolean CTQ(UserSession userSession, C83403nh c83403nh) {
        C14360o3.A0B(userSession, 0);
        return AbstractC1576275w.A02(AbstractC23021Ah.A00(userSession));
    }

    @Override // X.C7P8
    public final boolean CWd(UserSession userSession, C83403nh c83403nh) {
        return true;
    }

    @Override // X.C7P8
    public final boolean Cea() {
        return true;
    }

    @Override // X.C7P8
    public final boolean CfJ(InterfaceC83433nk interfaceC83433nk) {
        return false;
    }

    @Override // X.C7P8
    public final /* synthetic */ boolean AFY(C83403nh c83403nh) {
        return false;
    }

    @Override // X.C7P8
    public final /* synthetic */ boolean AFz(C83403nh c83403nh) {
        return false;
    }

    @Override // X.C7P8
    public final /* synthetic */ boolean AGD(C83403nh c83403nh) {
        return false;
    }

    @Override // X.C7P8
    public final /* synthetic */ boolean AG0(UserSession userSession, C83403nh c83403nh) {
        return false;
    }
}
