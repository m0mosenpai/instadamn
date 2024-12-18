package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository;

/* renamed from: X.8t5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200018t5 {
    public final UserSession A00;
    public final CXPNoticeStateRepository A01;
    public final C200028t6 A02;
    public final C19L A03;

    public C200018t5(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        CXPNoticeStateRepository cXPNoticeStateRepository = new CXPNoticeStateRepository(userSession, C05F.A00);
        C19K A02 = AnonymousClass194.A02(C12L.A00.CPG(664689487, 3));
        C200028t6 c200028t6 = new C200028t6(userSession, 479857365);
        C14360o3.A0B(A02, 3);
        this.A00 = userSession;
        this.A01 = cXPNoticeStateRepository;
        this.A03 = A02;
        this.A02 = c200028t6;
    }

    public final void A00(Context context, UserSession userSession, EnumC200038t7 enumC200038t7) {
        C14360o3.A0B(userSession, 1);
        if (enumC200038t7.A00(userSession)) {
            C200028t6 c200028t6 = this.A02;
            c200028t6.A02(null, null, enumC200038t7.toString());
            c200028t6.A00("is_prefetch_endpoint", 1L);
            C19L c19l = this.A03;
            C9DM c9dm = new C9DM(enumC200038t7, context, this, userSession, (InterfaceC23621Ds) null, 15);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9dm, c19l);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        if (r8 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.C206319Bo r16, X.C54804OJy r17, X.InterfaceC57992Pnc r18) {
        /*
            r15 = this;
            r9 = r17
            X.82G r6 = r9.A0D
            android.app.Activity r5 = r9.A0C
            r11 = r15
            X.8t6 r2 = r15.A02
            java.lang.String r0 = r6.toString()
            r13 = 0
            r2.A02(r0, r13, r13)
            java.lang.String r12 = X.AbstractC201118ut.A00(r6)
            r10 = r18
            if (r12 != 0) goto L31
            java.lang.String r1 = "CLNoticeManager"
            java.lang.String r0 = "Unexpected Failure: Unmapped notice entrypoint on the client"
            X.C0K8.A0C(r1, r0)
            java.lang.String r1 = "failure_reason"
            java.lang.String r0 = "unmapped_entrypoint"
            r2.A01(r1, r0)
            r0 = 3
            r2.A03(r0)
            java.lang.Integer r0 = X.C05F.A00
            r10.Dgl(r0)
            return
        L31:
            X.8t7[] r4 = X.EnumC200038t7.values()
            int r3 = r4.length
            r2 = 0
        L37:
            if (r2 >= r3) goto L69
            r1 = r4[r2]
            com.google.common.collect.ImmutableList r0 = r1.A00
            boolean r0 = r0.contains(r12)
            if (r0 == 0) goto L66
            com.google.common.collect.ImmutableList r8 = r1.A00
            if (r8 != 0) goto L5f
        L47:
            com.google.common.collect.ImmutableList r8 = com.google.common.collect.ImmutableList.of(r12)
            if (r1 != 0) goto L5f
            r14 = 0
        L4e:
            X.19L r2 = r15.A03
            com.instagram.share.facebook.upsell.manager.CLNoticeManager$maybeFetchAndDisplayServerProvidedUpsells$1 r4 = new com.instagram.share.facebook.upsell.manager.CLNoticeManager$maybeFetchAndDisplayServerProvidedUpsells$1
            r7 = r16
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.191 r1 = X.AnonymousClass191.A00
            java.lang.Integer r0 = X.C05F.A00
            X.AbstractC23641Du.A03(r0, r1, r4, r2)
            return
        L5f:
            com.instagram.common.session.UserSession r0 = r15.A00
            boolean r14 = r1.A00(r0)
            goto L4e
        L66:
            int r2 = r2 + 1
            goto L37
        L69:
            r1 = 0
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C200018t5.A01(X.9Bo, X.OJy, X.Pnc):void");
    }
}
