package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class BP6 {
    public final ArrayList A01(UserSession userSession, C38321qM c38321qM) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(AbstractC16960so.A1Q(EnumC25465BOe.A0M, EnumC25465BOe.A02, EnumC25465BOe.A07, EnumC25465BOe.A0C, EnumC25465BOe.A03, EnumC25465BOe.A04, EnumC25465BOe.A08, EnumC25465BOe.A0B, EnumC25465BOe.A0A, EnumC25465BOe.A0Q, EnumC25465BOe.A09, EnumC25465BOe.A0E, EnumC25465BOe.A0H, EnumC25465BOe.A0P, EnumC25465BOe.A0J, EnumC25465BOe.A06, EnumC25465BOe.A0G, EnumC25465BOe.A0K, EnumC25465BOe.A0N, EnumC25465BOe.A0D, EnumC25465BOe.A05, EnumC25465BOe.A0O, EnumC25465BOe.A0L, EnumC25465BOe.A0I));
        A00(userSession, c38321qM, arrayList);
        if (C18U.A06(C06090Tz.A06, userSession, 36322761763203576L)) {
            arrayList.add(EnumC25465BOe.A0F);
            return arrayList;
        }
        arrayList.add(0, EnumC25465BOe.A0F);
        return arrayList;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x003c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x029d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x029d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x029d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x002c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v114, types: [java.util.List, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List A02(android.content.Context r31, X.C120985dq r32, com.instagram.common.session.UserSession r33, X.C38321qM r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BP6.A02(android.content.Context, X.5dq, com.instagram.common.session.UserSession, X.1qM, boolean):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        if (r3.contains(r4.userId) != true) goto L10;
     */
    @kotlin.Deprecated(message = "This is only for a learning test to remove People Tag from attribution row. This will be cleaned up after experiment wraps up.")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(com.instagram.common.session.UserSession r4, X.C38321qM r5, java.util.List r6) {
        /*
            java.util.ArrayList r1 = r5.A3M()
            if (r1 == 0) goto L37
            r0 = 10
            int r0 = X.AbstractC06950Ym.A1E(r1, r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r1.next()
            com.instagram.model.people.PeopleTag r0 = (com.instagram.model.people.PeopleTag) r0
            com.instagram.user.model.User r0 = r0.A07()
            java.lang.String r0 = r0.getId()
            r3.add(r0)
            goto L15
        L2d:
            r2 = 1
            java.lang.String r0 = r4.userId
            boolean r0 = r3.contains(r0)
            r1 = 1
            if (r0 == r2) goto L38
        L37:
            r1 = 0
        L38:
            boolean r0 = X.C2TN.A02(r4, r5)
            if (r0 != 0) goto L52
            if (r1 != 0) goto L52
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36328705995390692(0x8110c400013ee4, double:3.037758183217994E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 == 0) goto L52
            X.BOe r0 = X.EnumC25465BOe.A0G
            r6.remove(r0)
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BP6.A00(com.instagram.common.session.UserSession, X.1qM, java.util.List):void");
    }
}
