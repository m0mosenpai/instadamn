package X;

import com.instagram.common.session.UserSession;
import com.instagram.explore.topiccluster.ExploreTopicCluster;

/* renamed from: X.Gpu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38127Gpu implements InterfaceC43071ya {
    public ExploreTopicCluster A00;
    public java.util.Set A01;
    public final C18920wW A02;
    public final UserSession A03;
    public final InterfaceC60442pS A04;
    public final C64842wi A05;
    public final String A06;
    public final C38082GpB A07;

    /* JADX WARN: Removed duplicated region for block: B:128:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0170  */
    /* JADX WARN: Type inference failed for: r1v64, types: [X.IHq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [X.5yy, java.lang.Object] */
    @Override // X.InterfaceC43071ya
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ATP(X.C59062n7 r29, X.InterfaceC57162jr r30) {
        /*
            Method dump skipped, instructions count: 984
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38127Gpu.ATP(X.2n7, X.2jr):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00(X.C132835z6 r18, X.C38162GqT r19, X.C38321qM r20, long r21) {
        /*
            r17 = this;
            r4 = r19
            X.5qK r8 = r4.A01
            int r0 = r8.A04
            r2 = 2
            if (r0 != r2) goto L4a
            int r0 = r8.A02
            r1 = 1
            if (r0 != r2) goto L4a
            X.5uw r5 = X.EnumC130515uw.A06
        L10:
            r3 = r17
            X.0wW r6 = r3.A02
            X.5qT r7 = r4.A00
            com.instagram.explore.topiccluster.ExploreTopicCluster r10 = r3.A00
            java.lang.String r14 = r3.A06
            r12 = 0
            java.lang.Long r13 = java.lang.Long.valueOf(r21)
            r11 = r20
            X.1rF r0 = r11.A0C
            java.lang.String r16 = r0.BJN()
            r9 = r18
            r15 = r12
            X.1Mh r2 = X.AbstractC37836Gkq.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            if (r1 == 0) goto L3b
            r0 = 5557(0x15b5, float:7.787E-42)
            java.lang.String r1 = X.AbstractC111324zv.A00(r0)
            java.lang.String r0 = "endpoint_type"
            r2.A0R(r0, r1)
        L3b:
            com.instagram.explore.topiccluster.ExploreTopicCluster r0 = r3.A00
            if (r0 == 0) goto L46
            java.lang.String r1 = r0.A05
            java.lang.String r0 = "topic_cluster_debug_info"
            r2.A0R(r0, r1)
        L46:
            r2.Cht()
            return
        L4a:
            r1 = 0
            X.5uw r5 = X.EnumC130515uw.A0D
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38127Gpu.A00(X.5z6, X.GqT, X.1qM, long):void");
    }

    public C38127Gpu(UserSession userSession, ExploreTopicCluster exploreTopicCluster, C38082GpB c38082GpB, InterfaceC60442pS interfaceC60442pS, C64842wi c64842wi, String str) {
        String str2;
        this.A03 = userSession;
        this.A04 = interfaceC60442pS;
        this.A06 = str;
        this.A00 = exploreTopicCluster;
        this.A05 = c64842wi;
        this.A07 = c38082GpB;
        this.A02 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
        C38128Gpv c38128Gpv = (C38128Gpv) userSession.A01(C38128Gpv.class, C38178Gqj.A00);
        ExploreTopicCluster exploreTopicCluster2 = this.A00;
        if (exploreTopicCluster2 != null) {
            str2 = exploreTopicCluster2.A06;
        } else {
            str2 = "";
        }
        this.A01 = c38128Gpv.A00(str, str2);
    }
}
