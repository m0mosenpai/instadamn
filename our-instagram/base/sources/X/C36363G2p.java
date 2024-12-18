package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.G2p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36363G2p implements InterfaceC37156GYt {
    public final Context A00;
    public final UserSession A01;
    public final E70 A02;

    public C36363G2p(Context context, UserSession userSession, E70 e70) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = e70;
        this.A00 = context;
    }

    @Override // X.InterfaceC37156GYt
    public final boolean isEnabled() {
        C32107E9f A07;
        E70 e70 = this.A02;
        if ((!AbstractC31171DnF.A0n(e70.A0b).isEmpty()) || ((A07 = e70.A07()) != null && A07.A0D)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r0.A0D == false) goto L8;
     */
    @Override // X.InterfaceC37156GYt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List getItems() {
        /*
            r5 = this;
            java.util.ArrayList r3 = X.AbstractC166987dD.A1E()
            com.instagram.common.session.UserSession r4 = r5.A01
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36326807619778683(0x810f0a0000387b, double:3.0365576428368147E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 == 0) goto L66
            X.E70 r2 = r5.A02
            X.E9f r0 = r2.A07()
            if (r0 == 0) goto L20
            boolean r0 = r0.A0D
            r1 = 1
            if (r0 != 0) goto L21
        L20:
            r1 = 0
        L21:
            X.0do r0 = r2.A0b
            java.util.List r0 = X.AbstractC31171DnF.A0n(r0)
            int r2 = r0.size()
            if (r1 == 0) goto L2f
            int r2 = r2 + 1
        L2f:
            android.content.Context r1 = r5.A00
            r0 = 2131959734(0x7f131fb6, float:1.9556117E38)
            java.lang.String r1 = X.AbstractC31177DnL.A0a(r1, r2, r0)
            X.Dq0 r0 = new X.Dq0
            r0.<init>(r1)
        L3d:
            r3.add(r0)
            X.E70 r2 = r5.A02
            X.E9f r1 = r2.A07()
            if (r1 == 0) goto L4f
            boolean r0 = r1.A0D
            if (r0 == 0) goto L4f
            r3.add(r1)
        L4f:
            X.0do r0 = r2.A0b
            java.lang.Object r0 = r0.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            r3.addAll(r0)
            X.0do r0 = r2.A0Z
            java.lang.Object r0 = r0.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            r3.addAll(r0)
            return r3
        L66:
            r0 = 2131959733(0x7f131fb5, float:1.9556115E38)
            X.Dq0 r0 = X.C31335Dq0.A00(r0)
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36363G2p.getItems():java.util.List");
    }
}
