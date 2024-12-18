package com.instagram.user.follow;

import X.AbstractC111324zv;
import X.AbstractC115105If;
import X.AbstractC31174DnI;
import X.C07950bF;
import X.C115095Ie;
import X.C115115Ig;
import X.C14360o3;
import X.C151516rx;
import X.C34858FXs;
import X.C60399Qyn;
import X.C67545Unj;
import X.EDR;
import X.W5H;
import X.X1y;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public abstract class GraphQLFollowRequestApiKt {
    public static final AbstractC115105If A00(UserSession userSession, Throwable th) {
        X1y x1y;
        W5H w5h;
        String str;
        if ((th instanceof X1y) && (x1y = (X1y) th) != null && (w5h = x1y.A00) != null && (str = w5h.A00) != null) {
            EDR parseFromJson = C34858FXs.parseFromJson(C07950bF.A04.A01(userSession, str));
            C14360o3.A07(parseFromJson);
            return new C115115Ig(parseFromJson);
        }
        return new C115095Ie(new NullPointerException("GraphQL error response is null"));
    }

    public static final C151516rx A01(C67545Unj c67545Unj) {
        boolean z;
        boolean z2;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        if (c67545Unj != null) {
            C60399Qyn A0E = c67545Unj.A0E();
            if (A0E != null) {
                z = A0E.getCoercedBooleanField(10, AbstractC111324zv.A00(252));
            } else {
                z = false;
            }
            C60399Qyn A0E2 = c67545Unj.A0E();
            if (A0E2 != null) {
                z2 = A0E2.getCoercedBooleanField(2, "following");
            } else {
                z2 = false;
            }
            C60399Qyn A0E3 = c67545Unj.A0E();
            Boolean bool7 = null;
            if (A0E3 != null) {
                bool = AbstractC31174DnI.A0o(A0E3, "followed_by", 1);
            } else {
                bool = null;
            }
            C60399Qyn A0E4 = c67545Unj.A0E();
            if (A0E4 != null) {
                bool2 = AbstractC31174DnI.A0o(A0E4, "incoming_request", 3);
            } else {
                bool2 = null;
            }
            C60399Qyn A0E5 = c67545Unj.A0E();
            if (A0E5 != null) {
                bool3 = AbstractC31174DnI.A0o(A0E5, "blocking", 0);
            } else {
                bool3 = null;
            }
            C60399Qyn A0E6 = c67545Unj.A0E();
            if (A0E6 != null) {
                bool4 = AbstractC31174DnI.A0o(A0E6, "muting", 9);
            } else {
                bool4 = null;
            }
            C60399Qyn A0E7 = c67545Unj.A0E();
            if (A0E7 != null) {
                bool5 = AbstractC31174DnI.A0o(A0E7, "is_private", 7);
            } else {
                bool5 = null;
            }
            C60399Qyn A0E8 = c67545Unj.A0E();
            if (A0E8 != null) {
                bool6 = AbstractC31174DnI.A0o(A0E8, "subscribed", 12);
            } else {
                bool6 = null;
            }
            C60399Qyn A0E9 = c67545Unj.A0E();
            if (A0E9 != null) {
                bool7 = AbstractC31174DnI.A0o(A0E9, AbstractC111324zv.A00(4737), 5);
            }
            return new C151516rx(bool, bool2, bool3, bool4, bool5, bool6, bool7, z, z2);
        }
        return new C151516rx(null, null, null, null, null, null, null, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r7v2, types: [X.EDR, java.lang.Object, X.1um] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(com.instagram.common.session.UserSession r17, java.lang.String r18, java.lang.String r19, X.InterfaceC23621Ds r20) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.user.follow.GraphQLFollowRequestApiKt.A02(com.instagram.common.session.UserSession, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r7v2, types: [X.EDR, java.lang.Object, X.1um] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A03(com.instagram.common.session.UserSession r17, java.lang.String r18, java.lang.String r19, X.InterfaceC23621Ds r20) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.user.follow.GraphQLFollowRequestApiKt.A03(com.instagram.common.session.UserSession, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }
}
