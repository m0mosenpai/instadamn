package com.instagram.stickersearch;

import X.AbstractC150256pZ;
import X.AbstractC167027dH;
import X.AbstractC47130KsP;
import X.AnonymousClass058;
import X.C14360o3;
import X.C150236pX;
import X.C20Y;
import X.C51758Mth;
import X.EnumC143276dS;
import X.EnumC143286dT;
import android.content.Context;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.session.UserSession;
import com.instagram.stickersearch.api.ODRAvatarStickerRepository;

/* loaded from: classes8.dex */
public final class AvatarStickerInteractor {
    public final Context A00;
    public final AvatarStore A01;
    public final UserSession A02;
    public final C150236pX A03;
    public final ODRAvatarStickerRepository A04;

    public /* synthetic */ AvatarStickerInteractor(Context context, UserSession userSession, int i) {
        C150236pX c150236pX;
        AvatarStore avatarStore;
        if ((i & 2) != 0) {
            c150236pX = new C150236pX(userSession);
        } else {
            c150236pX = null;
        }
        if ((i & 4) != 0) {
            avatarStore = C20Y.A00(userSession);
        } else {
            avatarStore = null;
        }
        ODRAvatarStickerRepository oDRAvatarStickerRepository = null;
        context = (i & 8) != 0 ? null : context;
        if ((i & 16) != 0 && AbstractC150256pZ.A00(userSession) && context != null) {
            C14360o3.A0B(userSession, 0);
            oDRAvatarStickerRepository = new ODRAvatarStickerRepository(AbstractC47130KsP.A00(context, userSession));
        }
        AbstractC167027dH.A13(userSession, c150236pX, avatarStore);
        this.A02 = userSession;
        this.A03 = c150236pX;
        this.A01 = avatarStore;
        this.A00 = context;
        this.A04 = oDRAvatarStickerRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.C51758Mth r11, X.EnumC143276dS r12, X.EnumC143286dT r13, com.instagram.stickersearch.AvatarStickerInteractor r14, java.lang.Integer r15, java.lang.String r16, X.InterfaceC23621Ds r17) {
        /*
            r4 = r14
            r3 = 5
            r5 = r17
            boolean r0 = X.PXB.A03(r5, r3)
            if (r0 == 0) goto L7c
            r14 = r5
            X.PXB r14 = (X.PXB) r14
            int r2 = r14.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7c
            int r2 = r2 - r1
            r14.A00 = r2
        L18:
            java.lang.Object r3 = r14.A02
            X.1JX r2 = X.C1JX.A02
            int r0 = r14.A00
            r1 = 1
            if (r0 == 0) goto L60
            if (r0 != r1) goto L90
            java.lang.Object r4 = r14.A01
            com.instagram.stickersearch.AvatarStickerInteractor r4 = (com.instagram.stickersearch.AvatarStickerInteractor) r4
            X.AbstractC09560e7.A00(r3)
        L2a:
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L57
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r2 = r3.A00
            X.K8S r2 = (X.K8S) r2
            r0 = 0
            r2.A09 = r0
            X.0nS r1 = X.C14120nc.A00()
            X.KM8 r0 = new X.KM8
            r0.<init>(r4, r2)
            r1.ATO(r0)
            X.KZk r0 = new X.KZk
            r0.<init>(r2)
            X.3NX r3 = X.AbstractC25225BEi.A0z(r0)
        L4e:
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L82
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r2 = r3.A00
            return r2
        L57:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 != 0) goto L4e
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L60:
            X.AbstractC09560e7.A00(r3)
            X.6pX r0 = r4.A03
            java.lang.Integer r9 = X.C05F.A01
            r10 = 0
            r14.A01 = r4
            r14.A00 = r1
            X.6pY r5 = r0.A02
            r6 = r11
            r7 = r12
            r8 = r13
            r11 = r15
            r12 = r16
            r13 = r10
            java.lang.Object r3 = r5.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r3 != r2) goto L2a
            return r2
        L7c:
            X.PXB r14 = new X.PXB
            r14.<init>(r3, r5)
            goto L18
        L82:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 == 0) goto L8b
            X.KZl r2 = X.KZl.A00(r3)
            return r2
        L8b:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L90:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.stickersearch.AvatarStickerInteractor.A00(X.Mth, X.6dS, X.6dT, com.instagram.stickersearch.AvatarStickerInteractor, java.lang.Integer, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.C51758Mth r14, X.EnumC143276dS r15, X.EnumC143286dT r16, java.lang.Integer r17, java.lang.Integer r18, java.lang.String r19, X.InterfaceC23621Ds r20) {
        /*
            r13 = this;
            r3 = 4
            r4 = r20
            boolean r0 = X.PXB.A03(r4, r3)
            if (r0 == 0) goto L6c
            r12 = r4
            X.PXB r12 = (X.PXB) r12
            int r2 = r12.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6c
            int r2 = r2 - r1
            r12.A00 = r2
        L17:
            java.lang.Object r3 = r12.A01
            X.1JX r2 = X.C1JX.A02
            int r0 = r12.A00
            r1 = 1
            if (r0 == 0) goto L4f
            if (r0 != r1) goto L82
            X.AbstractC09560e7.A00(r3)
        L25:
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L46
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r1 = r3.A00
            X.K8S r1 = (X.K8S) r1
            r0 = 0
            r1.A09 = r0
            X.KZk r0 = new X.KZk
            r0.<init>(r1)
            X.3NX r3 = X.AbstractC25225BEi.A0z(r0)
        L3d:
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L74
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r2 = r3.A00
            return r2
        L46:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 != 0) goto L3d
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L4f:
            X.AbstractC09560e7.A00(r3)
            X.6pX r0 = r13.A03
            java.lang.Integer r7 = X.C05F.A01
            r11 = 0
            r12.A00 = r1
            X.6pY r3 = r0.A02
            r4 = r14
            r5 = r15
            r6 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            java.lang.Object r3 = r3.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r3 != r2) goto L25
            return r2
        L6c:
            r0 = 42
            X.PXB r12 = new X.PXB
            r12.<init>(r13, r4, r3, r0)
            goto L17
        L74:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 == 0) goto L7d
            X.KZl r2 = X.KZl.A00(r3)
            return r2
        L7d:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L82:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.stickersearch.AvatarStickerInteractor.A01(X.Mth, X.6dS, X.6dT, java.lang.Integer, java.lang.Integer, java.lang.String, X.1Ds):java.lang.Object");
    }

    public final AnonymousClass058 A03(C51758Mth c51758Mth, EnumC143276dS enumC143276dS, EnumC143286dT enumC143286dT, Integer num, Integer num2, String str, boolean z, boolean z2) {
        C14360o3.A0B(enumC143276dS, 1);
        return new AnonymousClass058(new AvatarStickerInteractor$loadAvatarStickers$1(c51758Mth, enumC143276dS, enumC143286dT, this, num, num2, str, null, z, z2));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0130 A[PHI: r1
      0x0130: PHI (r1v7 java.lang.Object) = (r1v5 java.lang.Object), (r1v6 java.lang.Object), (r1v8 java.lang.Object), (r1v0 java.lang.Object) binds: [B:44:0x0128, B:37:0x00cb, B:19:0x00f2, B:28:0x012d] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(X.C51758Mth r31, X.EnumC143276dS r32, X.EnumC143286dT r33, java.lang.Integer r34, X.InterfaceC23621Ds r35) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.stickersearch.AvatarStickerInteractor.A02(X.Mth, X.6dS, X.6dT, java.lang.Integer, X.1Ds):java.lang.Object");
    }
}
