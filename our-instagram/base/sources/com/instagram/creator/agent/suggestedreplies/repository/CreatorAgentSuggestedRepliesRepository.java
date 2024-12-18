package com.instagram.creator.agent.suggestedreplies.repository;

import X.AbstractC40691uc;
import X.C14360o3;
import X.C40701ud;
import X.C4A7;
import X.C4A8;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class CreatorAgentSuggestedRepliesRepository extends C4A7 {
    public final C40701ud A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatorAgentSuggestedRepliesRepository(UserSession userSession) {
        super("AISuggestedReplies", C4A8.A00(1216442747));
        C14360o3.A0B(userSession, 1);
        this.A00 = AbstractC40691uc.A01(userSession);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(com.instagram.creator.agent.suggestedreplies.constants.SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext r20, java.lang.String r21, X.InterfaceC23621Ds r22, boolean r23) {
        /*
            r19 = this;
            r2 = r21
            r5 = 16
            r7 = r22
            boolean r0 = X.MAF.A01(r7, r5)
            r6 = r19
            if (r0 == 0) goto Lc7
            r4 = r7
            X.MAF r4 = (X.MAF) r4
            int r3 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto Lc7
            int r3 = r3 - r1
            r4.A00 = r3
        L1c:
            java.lang.Object r1 = r4.A02
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r5 = 1
            if (r0 == 0) goto L5e
            if (r0 != r5) goto Ldc
            java.lang.Object r2 = r4.A01
            java.lang.String r2 = (java.lang.String) r2
            X.AbstractC09560e7.A00(r1)
        L2e:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto Lce
            X.2JS r5 = X.AbstractC25232BEp.A18(r1)
            if (r5 == 0) goto L50
            java.lang.Class<X.Udq> r4 = X.C66955Udq.class
            r3 = 0
            java.lang.String r1 = "xig_ig_suggested_replies_query(request:{\"sr_request_id\":$srRequestId,\"sr_session_id\":$srSessionId,\"thread_key\":$threadID,\"thread_session_id\":$threadSessionId})"
            r0 = 2019449811(0x785e5bd3, float:1.803988E34)
            X.2JS r1 = r5.getOptionalTreeField(r3, r1, r4, r0)
            if (r1 == 0) goto L50
            java.lang.String r0 = "messages"
            com.google.common.collect.ImmutableList r3 = r1.getRequiredCompactedStringListField(r3, r0)
            if (r3 != 0) goto L52
        L50:
            X.0sl r3 = X.C16930sl.A00
        L52:
            r1 = 31
            X.Jxw r0 = new X.Jxw
            r0.<init>(r3, r1, r2)
            X.3NX r3 = X.AbstractC25225BEi.A0z(r0)
            return r3
        L5e:
            X.AbstractC09560e7.A00(r1)
            if (r23 == 0) goto Lc3
            r0 = 0
        L65:
            r14 = 0
            X.2JM r10 = X.AbstractC25225BEi.A0b()
            X.2JM r9 = X.AbstractC25225BEi.A0b()
            java.lang.String r7 = "threadID"
            boolean r11 = X.AbstractC43594JPz.A1X(r10, r7, r2)
            r12 = r20
            java.lang.String r8 = r12.A02
            java.lang.String r7 = "srSessionId"
            r9.A04(r7, r8)
            java.lang.String r8 = r12.A03
            java.lang.String r7 = "threadSessionId"
            r9.A04(r7, r8)
            java.lang.String r8 = r12.A01
            java.lang.String r7 = "srRequestId"
            r9.A04(r7, r8)
            X.1uJ r8 = X.AbstractC25227BEk.A0U(r11)
            java.util.Map r10 = r10.getParamsCopy()
            java.util.Map r11 = r9.getParamsCopy()
            java.lang.Class<X.Udr> r12 = X.C66956Udr.class
            java.util.ArrayList r18 = X.AbstractC166987dD.A1E()
            java.lang.String r9 = "IGDirectCreatorAgentSuggestedReplies"
            r13 = 0
            java.lang.String r17 = "xig_ig_suggested_replies_query"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.1Dk r7 = r7.setMaxToleratedCacheAgeMs(r0)
            X.1Dk r0 = r7.setFreshCacheAgeMs(r0)
            X.1Dk r1 = r0.setEnsureCacheWrite(r5)
            X.1ud r0 = r6.A00
            r4.A01 = r2
            r4.A00 = r5
            java.lang.Object r1 = r0.A04(r1, r4)
            if (r1 != r3) goto L2e
            return r3
        Lc3:
            r0 = 10800000(0xa4cb80, double:5.335909E-317)
            goto L65
        Lc7:
            X.MAF r4 = new X.MAF
            r4.<init>(r6, r7, r5)
            goto L1c
        Lce:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto Ld7
            X.8jk r3 = X.AbstractC43594JPz.A0m(r1)
            return r3
        Ld7:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Ldc:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.suggestedreplies.repository.CreatorAgentSuggestedRepliesRepository.A00(com.instagram.creator.agent.suggestedreplies.constants.SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext, java.lang.String, X.1Ds, boolean):java.lang.Object");
    }
}
