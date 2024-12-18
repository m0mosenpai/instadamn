package com.instagram.comments.mvvm.data.network;

import X.AbstractC002300n;
import X.AbstractC13670mt;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC186788Pv;
import X.AbstractC25226BEj;
import X.AbstractC31177DnL;
import X.C11L;
import X.C17Q;
import X.C186808Px;
import X.C32955Eem;
import X.C38321qM;
import X.C84923qg;
import X.InterfaceC38901rP;
import com.instagram.api.schemas.CommentGiphyMediaInfo;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.regex.Matcher;

/* loaded from: classes9.dex */
public abstract class CommentPostingRequestExtensionsKt {
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01f2, code lost:
    
        if (r13 == r12) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.instagram.api.schemas.CommentGiphyMediaInfo r20, X.C26025BfE r21, X.C51618MrB r22, com.instagram.common.session.UserSession r23, X.C115925Mi r24, X.C115935Mj r25, X.C38321qM r26, X.InterfaceC38371qR r27, java.lang.String r28, java.lang.String r29, X.InterfaceC23621Ds r30) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.network.CommentPostingRequestExtensionsKt.A01(com.instagram.api.schemas.CommentGiphyMediaInfo, X.BfE, X.MrB, com.instagram.common.session.UserSession, X.5Mi, X.5Mj, X.1qM, X.1qR, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(com.instagram.api.schemas.CommentGiphyMediaInfo r25, X.C26025BfE r26, X.C51618MrB r27, com.instagram.common.session.UserSession r28, X.C115925Mi r29, X.C115935Mj r30, X.InterfaceC38371qR r31, java.lang.String r32, java.lang.String r33, X.InterfaceC23621Ds r34) {
        /*
            Method dump skipped, instructions count: 1090
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.network.CommentPostingRequestExtensionsKt.A02(com.instagram.api.schemas.CommentGiphyMediaInfo, X.BfE, X.MrB, com.instagram.common.session.UserSession, X.5Mi, X.5Mj, X.1qR, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.7h2, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A03(X.C51618MrB r7, com.instagram.common.session.UserSession r8, X.InterfaceC38371qR r9, java.lang.String r10, X.InterfaceC23621Ds r11) {
        /*
            r3 = 22
            boolean r0 = X.MAS.A03(r11, r3)
            if (r0 == 0) goto Lb4
            r4 = r11
            X.MAS r4 = (X.MAS) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb4
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r1 = r4.A02
            X.1JX r5 = X.C1JX.A02
            int r0 = r4.A00
            r3 = 1
            if (r0 == 0) goto L74
            if (r0 != r3) goto Lc0
            java.lang.Object r8 = r4.A01
            com.instagram.common.session.UserSession r8 = (com.instagram.common.session.UserSession) r8
            X.AbstractC09560e7.A00(r1)
        L28:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L6b
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r5 = r1.A00
            X.N3E r5 = (X.N3E) r5
            X.AbstractC25230BEn.A15(r3, r8, r5)
            long r2 = r5.A00
            X.0xo r1 = X.AbstractC31176DnK.A0e(r8)
            java.lang.String r0 = "comment_warning_earliest_next_request_time"
            r1.E7G(r0, r2)
            r1.apply()
            boolean r4 = r5.A04
            java.lang.String r3 = r5.A03
            java.lang.Integer r2 = r5.A02
            X.Nfo r1 = r5.A01
            X.7h2 r0 = new X.7h2
            r0.<init>()
            r0.A03 = r4
            r0.A02 = r3
            r0.A01 = r2
            r0.A00 = r1
            X.3NX r1 = X.AbstractC25225BEi.A0z(r0)
        L5e:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 != 0) goto L6a
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto Lbb
            X.8jk r1 = X.AbstractC25227BEk.A0h()
        L6a:
            return r1
        L6b:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto L5e
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L74:
            X.AbstractC09560e7.A00(r1)
            java.lang.String r7 = r7.A03
            X.1qM r0 = r9.BQN()
            java.lang.String r6 = r0.getId()
            X.1Ms r2 = X.AbstractC167017dG.A0c(r8)
            r0 = 1160(0x488, float:1.626E-42)
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            r2.A0B(r0)
            java.lang.Class<X.N3E> r1 = X.N3E.class
            java.lang.Class<X.OPQ> r0 = X.OPQ.class
            r2.A0R(r1, r0)
            java.lang.String r0 = "comment_text"
            r2.A9s(r0, r7)
            java.lang.String r0 = "media_id"
            r2.A0H(r0, r6)
            r0 = 860(0x35c, float:1.205E-42)
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            X.1ON r0 = X.MSY.A0I(r2, r0, r10)
            r4.A01 = r8
            r4.A00 = r3
            java.lang.Object r1 = r0.A01(r4)
            if (r1 != r5) goto L28
            return r5
        Lb4:
            X.MAS r4 = new X.MAS
            r4.<init>(r3, r11)
            goto L16
        Lbb:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lc0:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.network.CommentPostingRequestExtensionsKt.A03(X.MrB, com.instagram.common.session.UserSession, X.1qR, java.lang.String, X.1Ds):java.lang.Object");
    }

    public static final C84923qg A00(CommentGiphyMediaInfo commentGiphyMediaInfo, UserSession userSession, C38321qM c38321qM, String str, String str2, int i, long j) {
        Boolean bool;
        long max = Math.max(c38321qM.A19() + 1, AbstractC31177DnL.A06());
        C32955Eem A00 = InterfaceC38901rP.A00.A00();
        A00.A0t = new C11L("\\n{2,}").A00(str, "\n");
        A00.A09 = AbstractC166987dD.A10(userSession);
        A00.A0g = Long.valueOf(max);
        User A2E = c38321qM.A2E(userSession);
        if (A2E != null) {
            bool = Boolean.valueOf(AbstractC167007dF.A1X(A2E.A02, C17Q.A06));
        } else {
            bool = null;
        }
        A00.A0U = bool;
        A00.A0s = str2;
        A00.A0q = str2;
        A00.A02 = commentGiphyMediaInfo;
        A00.A0n = c38321qM.getId();
        C84923qg c84923qg = new C84923qg(A00.A00());
        c84923qg.A01(c38321qM);
        c84923qg.A04 = j;
        c84923qg.A00 = i;
        return c84923qg;
    }

    public static final void A04(UserSession userSession, String str, String str2) {
        Matcher A09 = AbstractC13670mt.A09(str);
        ArrayList A1E = AbstractC166987dD.A1E();
        while (A09.find()) {
            String group = A09.group(1);
            if (group != null) {
                A1E.add(AbstractC002300n.A0d(group, "@", "", false));
            }
        }
        C186808Px A00 = AbstractC186788Pv.A00(userSession);
        if (AbstractC25226BEj.A1b(A1E)) {
            A00.A01(str2, A1E);
        }
    }
}
