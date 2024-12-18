package com.instagram.repository.user;

import X.AbstractC31177DnL;
import X.AbstractC50522MSa;
import X.AnonymousClass500;
import X.AnonymousClass501;
import X.AnonymousClass700;
import X.B4Z;
import X.C06090Tz;
import X.C14360o3;
import X.C18U;
import X.C1ON;
import X.C2045893s;
import X.C2046093u;
import X.C25621Ms;
import X.C50617MWe;
import X.NA8;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

/* loaded from: classes9.dex */
public final class UserNetworkDataSource {
    public NA8 A00;
    public final UserSession A01;
    public final boolean A02;
    public final boolean A03;

    public UserNetworkDataSource(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A02 = C18U.A06(c06090Tz, userSession, 36316370849960242L);
        this.A03 = C18U.A06(c06090Tz, userSession, 36316370850025779L);
    }

    public static final C1ON A00(UserNetworkDataSource userNetworkDataSource, AnonymousClass700 anonymousClass700, AnonymousClass501 anonymousClass501, String str, String str2, boolean z) {
        String str3;
        String str4;
        C25621Ms A0M = AbstractC31177DnL.A0M(userNetworkDataSource.A01);
        A0M.A0R(C2045893s.class, C2046093u.class);
        if (anonymousClass501 instanceof AnonymousClass500) {
            A0M.A0B("users/{user_id}/info/");
            A0M.A0A = "users/{user_id}/info/";
            A0M.A0C = "user_info_by_id";
            str3 = ((AnonymousClass500) anonymousClass501).A00;
            str4 = CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID;
        } else if (anonymousClass501 instanceof C50617MWe) {
            A0M.A0B("users/{user_name}/usernameinfo/");
            A0M.A0A = "users/{user_name}/usernameinfo/";
            A0M.A0C = "user_info_by_username";
            str3 = ((C50617MWe) anonymousClass501).A00;
            str4 = "user_name";
        } else {
            throw B4Z.A00();
        }
        A0M.A9s(str4, str3);
        AbstractC50522MSa.A1M(A0M, anonymousClass700, str, str2, z);
        return A0M.A0N();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        if (r2 == 404) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.AnonymousClass700 r13, X.AnonymousClass501 r14, java.lang.String r15, java.lang.String r16, X.InterfaceC23621Ds r17, int r18, boolean r19) {
        /*
            r12 = this;
            r3 = 29
            r5 = r17
            boolean r0 = X.PXD.A03(r5, r3)
            r6 = r12
            if (r0 == 0) goto L7c
            r4 = r5
            X.PXD r4 = (X.PXD) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7c
            int r2 = r2 - r1
            r4.A00 = r2
        L19:
            java.lang.Object r3 = r4.A01
            X.1JX r2 = X.C1JX.A02
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L5d
            if (r1 != r0) goto L86
            X.AbstractC09560e7.A00(r3)
        L27:
            r2 = r3
            X.3NY r2 = (X.C3NY) r2
            boolean r0 = r2 instanceof X.C3NX
            if (r0 != 0) goto L5c
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 == 0) goto L81
            X.5If r1 = X.MSX.A0E(r2)
            boolean r3 = r1 instanceof X.C115115Ig
            if (r3 == 0) goto L52
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.ApiError.Response<com.instagram.api.schemas.UserInfoResponse_Response>"
            X.C14360o3.A0C(r1, r0)
            X.5Ig r1 = (X.C115115Ig) r1
            java.lang.Object r1 = r1.A00
            X.1un r1 = (X.InterfaceC40801un) r1
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            int r2 = r1.getStatusCode()
            r0 = 404(0x194, float:5.66E-43)
            r1 = 0
            if (r2 != r0) goto L53
        L52:
            r1 = 1
        L53:
            X.O8a r0 = new X.O8a
            r0.<init>(r3, r1)
            X.8jk r2 = X.AbstractC43592JPx.A0p(r0)
        L5c:
            return r2
        L5d:
            X.AbstractC09560e7.A00(r3)
            r7 = r13
            r8 = r14
            r9 = r15
            r10 = r16
            r11 = r19
            X.1ON r1 = A00(r6, r7, r8, r9, r10, r11)
            r3 = r18
            X.AbstractC50522MSa.A1P(r1, r3)
            r4.A00 = r0
            r0 = 1671325816(0x639e6878, float:5.8442267E21)
            java.lang.Object r3 = r1.A00(r0, r4)
            if (r3 != r2) goto L27
            return r2
        L7c:
            X.PXD r4 = X.PXD.A00(r12, r5, r3)
            goto L19
        L81:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L86:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.repository.user.UserNetworkDataSource.A01(X.700, X.501, java.lang.String, java.lang.String, X.1Ds, int, boolean):java.lang.Object");
    }
}
