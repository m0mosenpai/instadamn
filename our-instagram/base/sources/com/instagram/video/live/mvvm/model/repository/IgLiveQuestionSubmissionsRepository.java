package com.instagram.video.live.mvvm.model.repository;

import X.AbstractC208910l;
import X.C008002u;
import X.C05A;
import X.C0UO;
import X.C14360o3;
import X.C1Df;
import X.C9B7;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveQuestionsApi;

/* loaded from: classes3.dex */
public final class IgLiveQuestionSubmissionsRepository {
    public static final String A07 = IgLiveQuestionSubmissionsRepository.class.getName();
    public int A00;
    public C1Df A01;
    public String A02;
    public final UserSession A03;
    public final IgLiveQuestionsApi A04;
    public final C05A A05;
    public final C0UO A06;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.InterfaceC23621Ds r8, boolean r9) {
        /*
            r7 = this;
            r3 = 7
            boolean r0 = X.MUF.A00(r8, r3)
            if (r0 == 0) goto L71
            r6 = r8
            X.MUF r6 = (X.MUF) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L71
            int r2 = r2 - r1
            r6.A00 = r2
        L15:
            java.lang.Object r5 = r6.A02
            X.1JX r4 = X.C1JX.A02
            int r0 = r6.A00
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L5a
            if (r0 != r3) goto L7d
            boolean r9 = r6.A04
            java.lang.Object r1 = r6.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveQuestionSubmissionsRepository r1 = (com.instagram.video.live.mvvm.model.repository.IgLiveQuestionSubmissionsRepository) r1
            X.AbstractC09560e7.A00(r5)
        L2a:
            X.3NY r5 = (X.C3NY) r5
            boolean r0 = r5 instanceof X.C3NX
            if (r0 == 0) goto L51
            X.3NX r5 = (X.C3NX) r5
            java.lang.Object r4 = r5.A00
        L34:
            r0 = r4
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L50
            X.05A r3 = r1.A05
            java.lang.Object r0 = r3.getValue()
            X.9B7 r0 = (X.C9B7) r0
            int r2 = r0.A00
            r1 = 2
            X.9B7 r0 = new X.9B7
            r0.<init>(r9, r2, r1)
            r3.Egh(r0)
        L50:
            return r4
        L51:
            boolean r0 = r5 instanceof X.C194848jk
            if (r0 == 0) goto L77
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            goto L34
        L5a:
            X.AbstractC09560e7.A00(r5)
            java.lang.String r1 = r7.A02
            if (r1 == 0) goto L85
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveQuestionsApi r0 = r7.A04
            r6.A01 = r7
            r6.A04 = r9
            r6.A00 = r3
            java.lang.Object r5 = r0.A07(r1, r6, r9)
            if (r5 == r4) goto L89
            r1 = r7
            goto L2a
        L71:
            X.MUF r6 = new X.MUF
            r6.<init>(r7, r8, r3)
            goto L15
        L77:
            X.B4Z r1 = new X.B4Z
            r1.<init>()
            throw r1
        L7d:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L85:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
        L89:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveQuestionSubmissionsRepository.A00(X.1Ds, boolean):java.lang.Object");
    }

    public /* synthetic */ IgLiveQuestionSubmissionsRepository(UserSession userSession) {
        String str = userSession.userId;
        IgLiveQuestionsApi igLiveQuestionsApi = new IgLiveQuestionsApi(userSession);
        C14360o3.A0B(str, 2);
        this.A03 = userSession;
        this.A04 = igLiveQuestionsApi;
        C008002u c008002u = new C008002u(new C9B7(false, 0, 2));
        this.A05 = c008002u;
        this.A06 = AbstractC208910l.A02(c008002u);
    }
}
