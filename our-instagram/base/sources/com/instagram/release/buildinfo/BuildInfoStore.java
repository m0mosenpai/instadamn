package com.instagram.release.buildinfo;

import X.AbstractC23641Du;
import X.AbstractC24771Iv;
import X.AnonymousClass191;
import X.C05F;
import X.C13920nI;
import X.C14360o3;
import X.C19K;
import X.C206649Cv;
import X.C97L;
import X.C9CA;
import X.InterfaceC19630xq;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class BuildInfoStore {
    public long A00;
    public C9CA A01;
    public final UserSession A02;
    public final InterfaceC19630xq A03;
    public final C13920nI A04;
    public final BuildInfoApi A05;
    public final C97L A06;

    public BuildInfoStore(UserSession userSession, C13920nI c13920nI, InterfaceC19630xq interfaceC19630xq, BuildInfoApi buildInfoApi, C97L c97l) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c13920nI, 5);
        this.A02 = userSession;
        this.A03 = interfaceC19630xq;
        this.A05 = buildInfoApi;
        this.A06 = c97l;
        this.A04 = c13920nI;
        this.A01 = new C9CA(interfaceC19630xq.C2s("RecommendedVersionName"), interfaceC19630xq.getInt("RecommendedBuildNumber", 0), interfaceC19630xq.getInt("RecommendedPublishDate", 0), 1, interfaceC19630xq.C2s("RecommendedDownloadUrl"));
        this.A00 = this.A03.getLong("RecommendedBuildLastUpdated", 0L);
    }

    public final void A01() {
        C19K A01 = AbstractC24771Iv.A01(2053690886, 3);
        C206649Cv c206649Cv = new C206649Cv(this, null, 31);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206649Cv, A01);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.InterfaceC23621Ds r6) {
        /*
            r5 = this;
            r3 = 43
            boolean r0 = X.C57145PWx.A02(r6, r3)
            if (r0 == 0) goto L8c
            r4 = r6
            X.PWx r4 = (X.C57145PWx) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8c
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r3 = r4.A02
            X.1JX r2 = X.C1JX.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L7b
            if (r0 != r1) goto L98
            java.lang.Object r4 = r4.A01
            com.instagram.release.buildinfo.BuildInfoStore r4 = (com.instagram.release.buildinfo.BuildInfoStore) r4
            X.AbstractC09560e7.A00(r3)
        L28:
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L72
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r2 = r3.A00
            X.9CA r2 = (X.C9CA) r2
            r4.A01 = r2
            long r0 = java.lang.System.currentTimeMillis()
            r4.A00 = r0
            X.0xq r0 = r4.A03
            X.0xo r3 = r0.ARD()
            int r1 = r2.A01
            java.lang.String r0 = "RecommendedBuildNumber"
            r3.E7D(r0, r1)
            int r1 = r2.A02
            java.lang.String r0 = "RecommendedPublishDate"
            r3.E7D(r0, r1)
            java.lang.String r1 = r2.A04
            java.lang.String r0 = "RecommendedVersionName"
            r3.E7K(r0, r1)
            java.lang.String r1 = r2.A03
            java.lang.String r0 = "RecommendedDownloadUrl"
            r3.E7K(r0, r1)
            long r1 = r4.A00
            java.lang.String r0 = "RecommendedBuildLastUpdated"
            r3.E7G(r0, r1)
            r3.apply()
            X.97L r1 = r4.A06
            java.lang.String r0 = "build_info_api_success"
        L6c:
            r1.A00(r0)
            X.0eB r2 = X.C0eB.A00
        L71:
            return r2
        L72:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 == 0) goto L92
            X.97L r1 = r4.A06
            java.lang.String r0 = "build_info_api_failure"
            goto L6c
        L7b:
            X.AbstractC09560e7.A00(r3)
            com.instagram.release.buildinfo.BuildInfoApi r0 = r5.A05
            r4.A01 = r5
            r4.A00 = r1
            java.lang.Object r3 = r0.A00(r4)
            if (r3 == r2) goto L71
            r4 = r5
            goto L28
        L8c:
            X.PWx r4 = new X.PWx
            r4.<init>(r5, r6, r3)
            goto L16
        L92:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L98:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.release.buildinfo.BuildInfoStore.A00(X.1Ds):java.lang.Object");
    }
}
