package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* loaded from: classes6.dex */
public abstract class FUC {
    public static final boolean A01(UserSession userSession, E70 e70) {
        int i;
        C47162Ei c47162Ei;
        if (!e70.A0m && e70.A0v && (i = e70.A09) != 29 && i != 1012) {
            InterfaceC83733oI interfaceC83733oI = e70.A0L;
            C14360o3.A0B(interfaceC83733oI, 0);
            if (!(interfaceC83733oI instanceof MsysThreadId)) {
                boolean A0C = e70.A0C();
                boolean A04 = E70.A04(e70);
                if (!AbstractC31224Do7.A04(AbstractC31171DnF.A0n(e70.A0c), A0C, A04) && !e70.A0n) {
                    if ((AbstractC166987dD.A1b(AbstractC31171DnF.A0n(e70.A0a)) || AbstractC166987dD.A1a(AbstractC47132Ef.A00(userSession).A0E.A00())) && !AbstractC137186Ix.A01(userSession)) {
                        if (A04) {
                            if (e70.A0E(userSession.userId)) {
                                c47162Ei = AbstractC47132Ef.A00(userSession).A0U;
                            } else {
                                return false;
                            }
                        } else {
                            c47162Ei = AbstractC47132Ef.A00(userSession).A0V;
                        }
                        if (AbstractC31177DnL.A1Z(c47162Ei) && AbstractC166987dD.A1a(AbstractC31172DnG.A0y(AbstractC47132Ef.A00(userSession).A1H))) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0056, code lost:
    
        if (r1 != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(androidx.fragment.app.FragmentActivity r12, X.InterfaceC11380iw r13, com.instagram.common.session.UserSession r14, X.E70 r15, boolean r16) {
        /*
            boolean r11 = X.E70.A04(r15)
            if (r11 == 0) goto L72
            java.lang.String r6 = r15.A0P
        L8:
            X.2Eg r2 = X.AbstractC47132Ef.A00(r14)
            X.2Ei r0 = r2.A03
            boolean r10 = X.AbstractC31177DnL.A1Z(r0)
            X.0do r0 = r15.A0c
            java.util.List r1 = X.AbstractC31171DnF.A0n(r0)
            X.2Ei r0 = r2.A09
            boolean r9 = X.AbstractC31177DnL.A1Z(r0)
            r7 = 0
            java.util.ArrayList r2 = X.AbstractC166997dE.A12(r1, r7)
            java.util.Iterator r8 = r1.iterator()
        L27:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L74
            java.lang.Object r3 = r8.next()
            r0 = r3
            X.E9f r0 = (X.C32107E9f) r0
            com.instagram.user.model.User r5 = r0.A00
            int r1 = r5.A00()
            r4 = 1
            if (r1 == r4) goto L44
            r0 = 2
            if (r1 == r0) goto L44
            r0 = 4
            if (r1 == r0) goto L44
            goto L27
        L44:
            boolean r1 = r5.A26()
            boolean r0 = r5.A27()
            if (r9 == 0) goto L56
            if (r1 != 0) goto L52
        L50:
            if (r0 == 0) goto L59
        L52:
            r2.add(r3)
            goto L27
        L56:
            if (r1 == 0) goto L59
            goto L50
        L59:
            if (r16 != 0) goto L52
            if (r11 != 0) goto L27
            boolean r0 = r5.A1Z()
            if (r0 == 0) goto L27
            X.17P r0 = r5.A03
            java.lang.Boolean r0 = r0.CQ2()
            boolean r0 = X.AbstractC166997dE.A1Z(r0, r4)
            if (r0 != 0) goto L52
            if (r10 != 0) goto L27
            goto L52
        L72:
            r6 = 0
            goto L8
        L74:
            java.util.ArrayList r8 = X.AbstractC167017dG.A0q(r2)
            java.util.Iterator r1 = r2.iterator()
        L7c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L8e
            com.instagram.user.model.User r0 = X.C32107E9f.A01(r1)
            com.instagram.model.direct.threadkey.impl.MsysPendingRecipient r0 = X.AbstractC34821FVx.A00(r0)
            r8.add(r0)
            goto L7c
        L8e:
            java.lang.Class<X.Fbr> r0 = X.C35018Fbr.class
            r5 = 7
            java.lang.Object r0 = X.C31651DvH.A00(r14, r0, r5)
            X.Fbr r0 = (X.C35018Fbr) r0
            java.lang.Integer r0 = r0.A01
            int r4 = r0.intValue()
            java.lang.String r0 = "thread_details"
            X.1nl r3 = X.C36881nl.A01(r12, r13, r14, r0)
            X.4Ds r2 = X.EnumC92794Ds.A04
            com.instagram.direct.msys.subtype.MsysThreadSubtype$Standard r1 = com.instagram.direct.msys.subtype.MsysThreadSubtype.Standard.A00
            X.Ak9 r0 = new X.Ak9
            r0.<init>(r2, r1, r8)
            r3.A0B = r0
            if (r6 == 0) goto Lc2
            int r0 = r6.length()
            if (r0 < r4) goto Lc2
            int r0 = r4 + (-1)
            java.lang.String r1 = X.AbstractC25227BEk.A0w(r6, r7, r0)
            r0 = 8230(0x2026, float:1.1533E-41)
            java.lang.String r6 = X.AnonymousClass001.A0C(r1, r0)
        Lc2:
            r3.A0h = r6
            r0 = 1
            r3.A0s = r0
            X.C36395G3w.A00(r3, r12, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FUC.A00(androidx.fragment.app.FragmentActivity, X.0iw, com.instagram.common.session.UserSession, X.E70, boolean):void");
    }
}
