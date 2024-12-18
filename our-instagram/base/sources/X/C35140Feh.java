package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.Feh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35140Feh {
    public static final C35140Feh A00 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0037, code lost:
    
        if (X.AbstractC31171DnF.A1V(r26, r5) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(androidx.fragment.app.Fragment r23, androidx.fragment.app.FragmentActivity r24, X.InterfaceC11380iw r25, com.instagram.common.session.UserSession r26, com.instagram.direct.capabilities.Capabilities r27, X.E70 r28, X.C32107E9f r29) {
        /*
            r22 = this;
            r21 = 1
            r0 = 0
            r7 = r26
            r3 = r29
            X.AbstractC167007dF.A1F(r7, r0, r3)
            r4 = r28
            X.3o9 r9 = r4.A08()
            boolean r15 = X.E70.A04(r4)
            boolean r16 = r4.A0C()
            X.3oI r6 = r4.A0L
            X.C14360o3.A0B(r6, r0)
            boolean r2 = r6 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            boolean r1 = r4.A0n
            java.lang.String r0 = r7.userId
            boolean r19 = r4.A0E(r0)
            int r13 = r4.A09
            java.lang.String r5 = X.E70.A02(r4)
            r0 = 29
            if (r13 != r0) goto L39
            boolean r0 = X.AbstractC31171DnF.A1V(r7, r5)
            r20 = 1
            if (r0 == 0) goto L3b
        L39:
            r20 = 0
        L3b:
            java.lang.String r11 = X.AbstractC1345466e.A06(r6)
            java.lang.String r12 = r4.A0Q
            int r14 = r4.A06
            com.instagram.user.model.User r10 = r3.A00
            r4 = r23
            r5 = r24
            r6 = r25
            r8 = r27
            r17 = r2
            r18 = r1
            A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35140Feh.A01(androidx.fragment.app.Fragment, androidx.fragment.app.FragmentActivity, X.0iw, com.instagram.common.session.UserSession, com.instagram.direct.capabilities.Capabilities, X.E70, X.E9f):void");
    }

    public static final void A00(Fragment fragment, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Capabilities capabilities, C3o9 c3o9, User user, String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        EnumC33464Eqz enumC33464Eqz;
        String moduleName = interfaceC11380iw.getModuleName();
        int BJ8 = user.BJ8();
        FollowStatus B7L = user.B7L();
        String A03 = C7KH.A03(c3o9);
        Boolean valueOf = Boolean.valueOf(z2);
        Boolean valueOf2 = Boolean.valueOf(z);
        EnumC1579076z A002 = AbstractC1578976y.A00(z3, z);
        if (z4 && z) {
            enumC33464Eqz = EnumC33464Eqz.GXAC;
        } else {
            enumC33464Eqz = EnumC33464Eqz.DEFAULT;
        }
        C35199Ffr c35199Ffr = new C35199Ffr(A002, enumC33464Eqz, valueOf, valueOf2, moduleName, "direct_thread", B7L.name(), A03, "DEFAULT", "DEFAULT", AbstractC166997dE.A0n(), BJ8);
        FJ7 fj7 = new FJ7(z5, i);
        if (z7 && !z2 && !user.CYY() && capabilities.A00(EnumC2054697t.A0x) && C18U.A06(C06090Tz.A05, userSession, 2342153298389237765L)) {
            F7C.A00(fragmentActivity, fragment, fragmentActivity, userSession, fj7, null, null, user, c35199Ffr, new C36759GIh(fragmentActivity, interfaceC11380iw, userSession, c3o9, user, str, str2, i2, z6, z4, z3), null);
        } else {
            F7C.A00(fragmentActivity, fragment, fragmentActivity, userSession, fj7, null, null, user, c35199Ffr, null, null);
        }
    }
}
