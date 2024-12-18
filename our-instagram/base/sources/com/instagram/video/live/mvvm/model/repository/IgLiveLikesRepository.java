package com.instagram.video.live.mvvm.model.repository;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC208910l;
import X.AbstractC25225BEi;
import X.AbstractC25227BEk;
import X.AbstractC25233BEq;
import X.AbstractC40691uc;
import X.AnonymousClass057;
import X.C008002u;
import X.C05A;
import X.C05F;
import X.C06160Ug;
import X.C0UO;
import X.C10E;
import X.C10M;
import X.C14360o3;
import X.C147856lA;
import X.C16930sl;
import X.C19L;
import X.C1Df;
import X.C2JM;
import X.C45096JxQ;
import X.C51686MsH;
import X.C51709Mse;
import X.C55665Onq;
import X.InterfaceC06180Ui;
import X.InterfaceC15070pN;
import X.MSX;
import X.Qn9;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveLikesApi;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;

/* loaded from: classes9.dex */
public final class IgLiveLikesRepository {
    public C1Df A00;
    public C45096JxQ A01;
    public String A02;
    public final UserSession A03;
    public final C05A A04;
    public final InterfaceC15070pN A05;
    public final C0UO A06;
    public final C0UO A07;
    public final IgLiveLikesApi A08;
    public final IgLiveBroadcastInfoManager A09;
    public final C147856lA A0A;
    public final InterfaceC06180Ui A0B;
    public final C05A A0C;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.OB8 r15, com.instagram.video.live.mvvm.model.repository.IgLiveLikesRepository r16, X.InterfaceC23621Ds r17) {
        /*
            r3 = 6
            r4 = r17
            boolean r0 = X.C57147PWz.A02(r4, r3)
            r6 = r16
            if (r0 == 0) goto L2f
            r5 = r4
            X.PWz r5 = (X.C57147PWz) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2f
            int r2 = r2 - r1
            r5.A00 = r2
        L19:
            java.lang.Object r1 = r5.A03
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r9 = 3
            r8 = 2
            r2 = 1
            if (r0 == 0) goto L35
            if (r0 == r2) goto L98
            if (r0 == r8) goto L98
            if (r0 == r9) goto L98
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L2f:
            X.PWz r5 = new X.PWz
            r5.<init>(r6, r4, r3)
            goto L19
        L35:
            X.AbstractC09560e7.A00(r1)
            com.instagram.common.session.UserSession r0 = r6.A03
            boolean r0 = X.AbstractC109224vo.A01(r0)
            r7 = r15
            if (r0 == 0) goto L88
            X.OCQ r1 = r15.A00
            if (r1 == 0) goto L74
            X.0Ui r3 = r6.A0B
            java.lang.String r14 = r1.A02
            java.lang.String r17 = ""
            if (r14 != 0) goto L4f
            r14 = r17
        L4f:
            java.lang.String r0 = r1.A00
            java.lang.String r15 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r1.A03
            com.instagram.common.typedurl.SimpleImageUrl r12 = X.AbstractC25225BEi.A0t(r0)
            java.lang.String r0 = r1.A01
            if (r0 != 0) goto L61
            r0 = r17
        L61:
            r11 = 0
            X.NYU r10 = new X.NYU
            r13 = r11
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            X.C57147PWz.A00(r6, r7, r5, r2)
        L6d:
            java.lang.Object r0 = r3.emit(r10, r5)
            if (r0 != r4) goto L9b
            return r4
        L74:
            java.lang.String r2 = r15.A02
            if (r2 == 0) goto L9b
            X.0Ui r3 = r6.A0B
            r1 = 0
            r0 = 0
            X.NYT r10 = new X.NYT
            r10.<init>(r1, r2, r0)
            r5.A01 = r1
            r5.A02 = r1
            r5.A00 = r8
            goto L6d
        L88:
            java.lang.String r2 = r15.A02
            if (r2 == 0) goto L9b
            X.0Ui r3 = r6.A0B
            r1 = 0
            r0 = 0
            X.NYT r10 = new X.NYT
            r10.<init>(r1, r2, r0)
            r5.A00 = r9
            goto L6d
        L98:
            X.AbstractC09560e7.A00(r1)
        L9b:
            X.0eB r4 = X.C0eB.A00
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveLikesRepository.A00(X.OB8, com.instagram.video.live.mvvm.model.repository.IgLiveLikesRepository, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.OB6, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.AbstractC53541Nm8 r18, X.InterfaceC23621Ds r19) {
        /*
            r17 = this;
            r6 = r18
            r3 = 7
            r4 = r19
            boolean r0 = X.C57147PWz.A02(r4, r3)
            r7 = r17
            if (r0 == 0) goto Lb1
            r5 = r4
            X.PWz r5 = (X.C57147PWz) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb1
            int r2 = r2 - r1
            r5.A00 = r2
        L1b:
            java.lang.Object r8 = r5.A03
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L2f
            if (r0 == r2) goto L8a
            if (r0 != r3) goto Lb8
            X.AbstractC09560e7.A00(r8)
        L2c:
            X.0eB r4 = X.C0eB.A00
        L2e:
            return r4
        L2f:
            X.AbstractC09560e7.A00(r8)
            X.0Ui r1 = r7.A0B
            com.instagram.common.session.UserSession r0 = r7.A03
            r8 = 0
            X.C14360o3.A0B(r6, r2)
            com.instagram.user.model.User r9 = X.AbstractC166987dD.A10(r0)
            X.OB6 r12 = new X.OB6
            r12.<init>()
            r12.A00 = r2
            java.lang.String r0 = r9.getId()
            r12.A02 = r0
            com.instagram.common.typedurl.ImageUrl r0 = r9.Bhu()
            r12.A01 = r0
            boolean r0 = r6 instanceof X.NYT
            if (r0 == 0) goto L6c
            r0 = r6
            X.NYT r0 = (X.NYT) r0
            java.lang.String r8 = r0.A02
            int r0 = r0.A00
            X.NYT r9 = new X.NYT
            r9.<init>(r12, r8, r0)
        L61:
            X.C57147PWz.A00(r7, r6, r5, r2)
            java.lang.Object r0 = r1.emit(r9, r5)
            if (r0 == r4) goto L2e
            r1 = r7
            goto L95
        L6c:
            boolean r0 = r6 instanceof X.NYU
            if (r0 == 0) goto Lbd
            r0 = r6
            X.NYU r0 = (X.NYU) r0
            java.lang.String r13 = r0.A06
            java.lang.String r14 = r0.A05
            com.instagram.common.typedurl.ImageUrl r11 = r0.A01
            java.lang.String r15 = r0.A03
            android.graphics.drawable.Drawable r10 = r0.A00
            java.lang.String r0 = r0.A04
            X.C14360o3.A0B(r13, r8)
            X.NYU r9 = new X.NYU
            r16 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            goto L61
        L8a:
            java.lang.Object r6 = r5.A02
            X.Nm8 r6 = (X.AbstractC53541Nm8) r6
            java.lang.Object r1 = r5.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveLikesRepository r1 = (com.instagram.video.live.mvvm.model.repository.IgLiveLikesRepository) r1
            X.AbstractC09560e7.A00(r8)
        L95:
            com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager r0 = r1.A09
            X.Mse r0 = X.MSX.A0U(r0)
            if (r0 == 0) goto L2c
            java.lang.String r2 = r0.A08
            if (r2 == 0) goto L2c
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveLikesApi r1 = r1.A08
            r0 = 0
            r5.A01 = r0
            r5.A02 = r0
            r5.A00 = r3
            java.lang.Object r0 = r1.A00(r6, r2, r5)
            if (r0 != r4) goto L2c
            return r4
        Lb1:
            X.PWz r5 = new X.PWz
            r5.<init>(r7, r4, r3)
            goto L1b
        Lb8:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        Lbd:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveLikesRepository.A01(X.Nm8, X.1Ds):java.lang.Object");
    }

    public final void A02(String str, C19L c19l) {
        C51709Mse A0U;
        String str2 = str;
        if (str != null || ((A0U = MSX.A0U(this.A09)) != null && (str2 = A0U.A08) != null)) {
            if (!C14360o3.A0K(this.A02, str2)) {
                C1Df c1Df = this.A00;
                if (c1Df != null) {
                    c1Df.cancel();
                }
                this.A00 = null;
            }
            if (this.A00 == null) {
                C2JM A0b = AbstractC25225BEi.A0b();
                this.A00 = AbstractC40691uc.A01(this.A03).A01(null, new C55665Onq(6, this, c19l), new PandoGraphQLRequest(AbstractC25233BEq.A0H(AbstractC25227BEk.A0T(GraphQlCallInput.A02, str2, TraceFieldType.BroadcastId), A0b, "input"), "LiveReactionSubscribe", A0b.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), Qn9.class, false, PandoRealtimeInfoJNI.forSubscription("xdt_live_reaction_subscribe"), 0, null, "xdt_live_reaction_subscribe", AbstractC166987dD.A1E()));
            }
            this.A02 = str2;
        }
    }

    public IgLiveLikesRepository(UserSession userSession, IgLiveLikesApi igLiveLikesApi, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, C147856lA c147856lA) {
        AbstractC167017dG.A1R(c147856lA, igLiveBroadcastInfoManager);
        this.A03 = userSession;
        this.A0A = c147856lA;
        this.A09 = igLiveBroadcastInfoManager;
        this.A08 = igLiveLikesApi;
        this.A01 = new C45096JxQ();
        C16930sl c16930sl = C16930sl.A00;
        C008002u A1H = AbstractC25225BEi.A1H(new C51686MsH(c16930sl));
        this.A0C = A1H;
        this.A07 = AbstractC208910l.A02(A1H);
        C008002u A00 = C10E.A00(c16930sl);
        this.A04 = A00;
        this.A06 = AbstractC208910l.A02(A00);
        AnonymousClass057 A002 = C10M.A00(C05F.A00, 0, 0);
        this.A0B = A002;
        this.A05 = new C06160Ug(null, A002);
    }
}
