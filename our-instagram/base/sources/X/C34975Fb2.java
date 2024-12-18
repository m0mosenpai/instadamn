package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.Fb2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34975Fb2 {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if ((!X.AbstractC31174DnI.A1X(X.C1AT.A01(r7).A03(X.C1AV.A0a), "BROADCAST_CHAT_CREATION_KEY", r2)) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0073, code lost:
    
        if (r3 != null) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A00(com.instagram.common.session.UserSession r7, X.C2EC r8, X.C2DS r9, com.instagram.model.direct.DirectThreadKey r10, java.lang.String r11) {
        /*
            r1 = 1
            r0 = 4
            X.C14360o3.A0B(r9, r0)
            r5 = 0
            r0 = 875(0x36b, float:1.226E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            boolean r6 = X.C14360o3.A0K(r11, r0)
            if (r8 == 0) goto L50
            X.3kP r0 = X.AbstractC31172DnG.A0g(r8)
            if (r0 == 0) goto L50
            boolean r0 = r0.A0H
            if (r0 != r1) goto L50
        L1c:
            java.lang.String r2 = r10.A00
            if (r2 == 0) goto L35
            X.1AU r1 = X.C1AT.A01(r7)
            X.1AV r0 = X.C1AV.A0a
            X.0xq r1 = r1.A03(r0)
            java.lang.String r0 = "BROADCAST_CHAT_CREATION_KEY"
            boolean r0 = X.AbstractC31174DnI.A1X(r1, r0, r2)
            r1 = r0 ^ 1
            r0 = 1
            if (r1 != 0) goto L36
        L35:
            r0 = 0
        L36:
            if (r6 != 0) goto L3a
            if (r0 == 0) goto L4f
        L3a:
            X.98R r2 = X.C98Q.A00(r7)
            java.lang.String r0 = r10.A00
            if (r0 == 0) goto L76
            X.3oE r1 = X.AbstractC31171DnF.A0N(r0)
            r0 = 49
            boolean r0 = r2.A00(r1, r0)
            if (r0 == 0) goto L4f
            r5 = 1
        L4f:
            return r5
        L50:
            java.util.ArrayList r0 = r9.Ab7(r10, r5)
            java.util.Iterator r4 = r0.iterator()
        L58:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r3 = r4.next()
            r2 = r3
            X.3nh r2 = (X.C83403nh) r2
            X.2EY r1 = r2.A10
            X.2EY r0 = X.C2EY.A0G
            if (r1 == r0) goto L58
            java.lang.String r0 = r2.A1u
            boolean r0 = X.AbstractC31171DnF.A1W(r7, r0)
            if (r0 == 0) goto L58
            if (r3 == 0) goto L35
            goto L1c
        L76:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34975Fb2.A00(com.instagram.common.session.UserSession, X.2EC, X.2DS, com.instagram.model.direct.DirectThreadKey, java.lang.String):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean A01(FragmentActivity fragmentActivity, UserSession userSession, Capabilities capabilities, GXN gxn, C2EC c2ec, DirectThreadKey directThreadKey, String str) {
        EKW ekw;
        AbstractC167007dF.A1G(userSession, 1, capabilities);
        if (!A00(userSession, c2ec, C2JD.A00(userSession), directThreadKey, str)) {
            return false;
        }
        AbstractC2056298m.A00(userSession).A07(true);
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        A0y.A16 = false;
        A0y.A0t = true;
        A0y.A0y = false;
        A0y.A0k = false;
        A0y.A1S = true;
        C189478aR A00 = A0y.A00();
        if (C18U.A06(C06090Tz.A06, userSession, 36320232024842389L)) {
            EKU eku = new EKU();
            Bundle A0b = AbstractC166987dD.A0b();
            AbstractC60492pY.A03(A0b, userSession);
            A0b.putParcelable("DirectFragment.DIRECT_FRAGMENT_THREAD_CAPABILITIES", capabilities);
            A0b.putParcelable("channel_thread_key", directThreadKey);
            A0b.putString("DirectFragment.ENTRY_POINT", str);
            eku.setArguments(A0b);
            eku.A02 = gxn;
            ekw = eku;
        } else {
            EKW ekw2 = new EKW();
            Bundle A0b2 = AbstractC166987dD.A0b();
            AbstractC60492pY.A03(A0b2, userSession);
            A0b2.putParcelable("DirectFragment.DIRECT_FRAGMENT_THREAD_CAPABILITIES", capabilities);
            A0b2.putParcelable("channel_thread_key", directThreadKey);
            A0b2.putString("DirectFragment.ENTRY_POINT", str);
            ekw2.setArguments(A0b2);
            ekw2.A02 = gxn;
            ekw = ekw2;
        }
        A00.A02(fragmentActivity, ekw);
        return true;
    }
}
