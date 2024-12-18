package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.7bu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166257bu extends C3r5 {
    public final InterfaceC166227br A00;
    public final UserSession A01;
    public final InterfaceC166247bt A02;

    public C166257bu(UserSession userSession, InterfaceC166227br interfaceC166227br, InterfaceC166247bt interfaceC166247bt) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = interfaceC166227br;
        this.A02 = interfaceC166247bt;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
    
        if (r2 == com.instagram.user.model.FollowStatus.A07) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(com.instagram.user.model.User r23, X.InterfaceC16820sZ r24) {
        /*
            r22 = this;
            r9 = r23
            com.instagram.user.model.FollowStatus r2 = r9.B7L()
            com.instagram.user.model.FollowStatus r1 = com.instagram.user.model.FollowStatus.A06
            if (r2 != r1) goto L75
            java.lang.Integer r1 = r9.A0M()
            java.lang.Integer r0 = X.C05F.A01
            if (r1 == r0) goto L69
            com.instagram.user.model.FollowStatus r19 = com.instagram.user.model.FollowStatus.A07
        L14:
            com.instagram.user.model.FollowStatus r0 = r9.B7L()
            int r1 = r0.ordinal()
            r0 = 4
            if (r1 == r0) goto L66
            r0 = 3
            if (r1 == r0) goto L63
            r0 = 5
            if (r1 == r0) goto L60
            r8 = 0
        L26:
            if (r19 == 0) goto L5f
            if (r8 == 0) goto L5f
            r0 = r22
            com.instagram.common.session.UserSession r3 = r0.A01
            java.lang.Integer r11 = X.AbstractC37441GeL.A00(r19)
            r2 = 0
            r4 = r2
            r5 = r2
            r6 = r2
            r7 = r2
            r10 = r2
            r12 = r2
            r13 = r2
            r14 = r2
            r15 = r2
            r16 = r2
            r17 = r2
            r18 = r2
            X.AbstractC129875tr.A01(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.19L r1 = r0.A03()
            r21 = 4
            X.PZR r14 = new X.PZR
            r15 = r24
            r16 = r8
            r18 = r9
            r20 = r2
            r17 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            X.191 r0 = X.AnonymousClass191.A00
            X.AbstractC23641Du.A05(r0, r14, r1)
        L5f:
            return
        L60:
            X.EpZ r8 = X.EnumC33402EpZ.A05
            goto L26
        L63:
            X.EpZ r8 = X.EnumC33402EpZ.A06
            goto L26
        L66:
            X.EpZ r8 = X.EnumC33402EpZ.A0A
            goto L26
        L69:
            boolean r0 = r9.A25()
            if (r0 == 0) goto L72
            com.instagram.user.model.FollowStatus r19 = com.instagram.user.model.FollowStatus.A04
            goto L14
        L72:
            com.instagram.user.model.FollowStatus r19 = com.instagram.user.model.FollowStatus.A05
            goto L14
        L75:
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A05
            if (r2 == r0) goto L7f
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A07
            r19 = 0
            if (r2 != r0) goto L14
        L7f:
            r19 = r1
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C166257bu.A05(com.instagram.user.model.User, X.0sZ):void");
    }

    public final void A06(User user, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, boolean z, boolean z2) {
        Integer B7J;
        int i;
        if (user.CQf()) {
            i = 5;
        } else if (user.B7L() == FollowStatus.A05 && user.A0M() != C05F.A01 && !z) {
            i = 1;
        } else if (user.B7L() == FollowStatus.A06 && (B7J = user.A03.B7J()) != null && B7J.intValue() > 0 && !z2) {
            i = 2;
        } else {
            A05(user, interfaceC16820sZ);
            return;
        }
        interfaceC16660sJ.invoke(new C51947MxU(user, i));
    }
}
