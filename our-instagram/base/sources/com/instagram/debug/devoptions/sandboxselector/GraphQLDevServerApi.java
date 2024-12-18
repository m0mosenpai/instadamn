package com.instagram.debug.devoptions.sandboxselector;

import X.AbstractC1807880g;
import X.AbstractC40691uc;
import X.C14360o3;
import X.C172887n0;
import X.C40701ud;
import X.InterfaceC23621Ds;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.DevserversCategoryInfoQueryImpl;

/* loaded from: classes11.dex */
public final class GraphQLDevServerApi {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getDevServers(com.instagram.common.session.UserSession r6, X.InterfaceC23621Ds r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.instagram.debug.devoptions.sandboxselector.GraphQLDevServerApi$getDevServers$1
            if (r0 == 0) goto L90
            r4 = r7
            com.instagram.debug.devoptions.sandboxselector.GraphQLDevServerApi$getDevServers$1 r4 = (com.instagram.debug.devoptions.sandboxselector.GraphQLDevServerApi$getDevServers$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L90
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L74
            if (r0 != r2) goto L9d
            X.AbstractC09560e7.A00(r1)
        L20:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C194848jk
            r3 = 0
            if (r0 == 0) goto L4c
            X.8jk r1 = (X.C194848jk) r1
            java.lang.Object r1 = r1.A00
            boolean r0 = r1 instanceof X.C115115Ig
            if (r0 == 0) goto L4a
            X.5Ig r1 = (X.C115115Ig) r1
            if (r1 == 0) goto L4a
            java.lang.Object r0 = r1.A00
            X.1um r0 = (X.C40791um) r0
            if (r0 == 0) goto L4a
            int r2 = r0.mStatusCode
        L3b:
            int r1 = r2 / 100
            r0 = 5
            if (r1 == r0) goto L42
            if (r2 != 0) goto L6e
        L42:
            com.instagram.debug.devoptions.sandboxselector.DevserverListError$ConnectionError r0 = com.instagram.debug.devoptions.sandboxselector.DevserverListError.ConnectionError.INSTANCE
        L44:
            X.8jk r3 = new X.8jk
            r3.<init>(r0)
            return r3
        L4a:
            r2 = 0
            goto L3b
        L4c:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L97
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r2 = r1.A00
            X.435 r2 = (X.AnonymousClass435) r2
            java.lang.Object r1 = r2.A01
            com.instagram.debug.devoptions.sandboxselector.DevserversListResponse r1 = (com.instagram.debug.devoptions.sandboxselector.DevserversListResponse) r1
            boolean r0 = r2.isOk()
            if (r0 == 0) goto L6c
            if (r1 == 0) goto L6c
            X.XFF r0 = r1.getXdtApiV1DevserversListAsApiTypeModel()
            X.3NX r3 = new X.3NX
            r3.<init>(r0)
            return r3
        L6c:
            int r2 = r2.mStatusCode
        L6e:
            com.instagram.debug.devoptions.sandboxselector.DevserverListError$HttpError r0 = new com.instagram.debug.devoptions.sandboxselector.DevserverListError$HttpError
            r0.<init>(r2, r3)
            goto L44
        L74:
            X.AbstractC09560e7.A00(r1)
            com.instagram.debug.devoptions.sandboxselector.DevserversListQueryImpl$Builder r0 = new com.instagram.debug.devoptions.sandboxselector.DevserversListQueryImpl$Builder
            r0.<init>()
            com.facebook.pando.PandoGraphQLRequest r1 = r0.A00()
            X.1ud r0 = X.AbstractC40691uc.A01(r6)
            X.C14360o3.A0A(r1)
            r4.label = r2
            java.lang.Object r1 = r0.A04(r1, r4)
            if (r1 != r3) goto L20
            return r3
        L90:
            com.instagram.debug.devoptions.sandboxselector.GraphQLDevServerApi$getDevServers$1 r4 = new com.instagram.debug.devoptions.sandboxselector.GraphQLDevServerApi$getDevServers$1
            r4.<init>(r5, r7)
            goto L12
        L97:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L9d:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.sandboxselector.GraphQLDevServerApi.getDevServers(com.instagram.common.session.UserSession, X.1Ds):java.lang.Object");
    }

    public Object getDevServersCategorizedAsFlow(UserSession userSession, InterfaceC23621Ds interfaceC23621Ds) {
        PandoGraphQLRequest A00 = new DevserversCategoryInfoQueryImpl.Builder().A00();
        C40701ud A01 = AbstractC40691uc.A01(userSession);
        C14360o3.A0A(A00);
        return AbstractC1807880g.A00(new GraphQLDevServerApi$getDevServersCategorizedAsFlow$3(null), new C172887n0(new GraphQLDevServerApi$getDevServersCategorizedAsFlow$2(null), A01.A05(A00)));
    }
}
