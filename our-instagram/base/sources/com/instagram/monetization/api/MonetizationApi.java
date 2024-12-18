package com.instagram.monetization.api;

import X.C05F;
import X.C104254mn;
import X.C104264mo;
import X.C14360o3;
import X.C1ON;
import X.C206579Co;
import X.C25621Ms;
import X.JX4;
import X.MWG;
import android.text.TextUtils;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes2.dex */
public final class MonetizationApi {
    public final UserSession A00;

    public MonetizationApi(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public static final C1ON A00(UserSession userSession, List list) {
        C14360o3.A0B(list, 1);
        String join = TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, list);
        C14360o3.A07(join);
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A09(C05F.A0N);
        c25621Ms.A03();
        c25621Ms.A0B("api/v1/creators/partner_program/get_monetization_products_gating/");
        c25621Ms.A0P(null, C104254mn.class, C104264mo.class, false);
        c25621Ms.A9s("product_types", join);
        C1ON A0N = c25621Ms.A0N();
        C14360o3.A0C(A0N, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.MonetizationProductGatingResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.MonetizationProductGatingResponse>>");
        return A0N;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A05(com.instagram.api.schemas.UserMonetizationProductType r8, X.InterfaceC23621Ds r9) {
        /*
            r7 = this;
            r3 = 0
            boolean r0 = X.PX5.A02(r9, r3)
            if (r0 == 0) goto L8d
            r4 = r9
            X.PX5 r4 = (X.PX5) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8d
            int r2 = r2 - r1
            r4.A00 = r2
        L15:
            java.lang.Object r1 = r4.A01
            X.1JX r6 = X.C1JX.A02
            int r0 = r4.A00
            r5 = 0
            r3 = 1
            if (r0 == 0) goto L5c
            if (r0 != r3) goto L9b
            X.AbstractC09560e7.A00(r1)
        L24:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L52
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r0 = r1.A00
            X.1un r0 = (X.InterfaceC40801un) r0
            if (r0 == 0) goto L39
            boolean r0 = r0.isOk()
            if (r0 == 0) goto L39
            r5 = 1
        L39:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            X.3NX r1 = new X.3NX
            r1.<init>(r0)
        L42:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 != 0) goto L51
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto L95
            X.0eB r0 = X.C0eB.A00
            X.8jk r1 = new X.8jk
            r1.<init>(r0)
        L51:
            return r1
        L52:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto L42
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L5c:
            X.AbstractC09560e7.A00(r1)
            com.instagram.common.session.UserSession r1 = r7.A00
            r0 = -2
            X.1Ms r2 = new X.1Ms
            r2.<init>(r1, r0)
            r2.A05()
            java.lang.String r0 = "creators/onboarding/mark_preview_screen_seen/"
            r2.A0B(r0)
            java.lang.String r1 = r8.A00
            java.lang.String r0 = "product_type"
            r2.A9s(r0, r1)
            java.lang.Class<X.1ul> r1 = X.C40781ul.class
            java.lang.Class<X.2hA> r0 = X.C55702hA.class
            r2.A0R(r1, r0)
            X.1ON r1 = r2.A0N()
            r4.A00 = r3
            r0 = 490845545(0x1d41b569, float:2.5637124E-21)
            java.lang.Object r1 = r1.A00(r0, r4)
            if (r1 != r6) goto L24
            return r6
        L8d:
            r0 = 42
            X.PX5 r4 = new X.PX5
            r4.<init>(r7, r9, r3, r0)
            goto L15
        L95:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L9b:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.monetization.api.MonetizationApi.A05(com.instagram.api.schemas.UserMonetizationProductType, X.1Ds):java.lang.Object");
    }

    public final MWG A01(List list) {
        return JX4.A00(new C206579Co(1, null), A00(this.A00, list).A05(352238759, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(com.instagram.api.schemas.UserMonetizationProductType r8, X.InterfaceC23621Ds r9) {
        /*
            r7 = this;
            r3 = 45
            boolean r0 = X.PX9.A03(r9, r3)
            if (r0 == 0) goto L8d
            r4 = r9
            X.PX9 r4 = (X.PX9) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8d
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r1 = r4.A01
            X.1JX r6 = X.C1JX.A02
            int r0 = r4.A00
            r5 = 0
            r3 = 1
            if (r0 == 0) goto L5d
            if (r0 != r3) goto L9b
            X.AbstractC09560e7.A00(r1)
        L25:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L53
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r0 = r1.A00
            X.1un r0 = (X.InterfaceC40801un) r0
            if (r0 == 0) goto L3a
            boolean r0 = r0.isOk()
            if (r0 == 0) goto L3a
            r5 = 1
        L3a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            X.3NX r1 = new X.3NX
            r1.<init>(r0)
        L43:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 != 0) goto L52
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto L95
            X.0eB r0 = X.C0eB.A00
            X.8jk r1 = new X.8jk
            r1.<init>(r0)
        L52:
            return r1
        L53:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto L43
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L5d:
            X.AbstractC09560e7.A00(r1)
            com.instagram.common.session.UserSession r1 = r7.A00
            r0 = -2
            X.1Ms r2 = new X.1Ms
            r2.<init>(r1, r0)
            r2.A05()
            java.lang.String r0 = "creators/onboarding/accept_tos/"
            r2.A0B(r0)
            java.lang.String r1 = r8.A00
            java.lang.String r0 = "product_type"
            r2.A9s(r0, r1)
            java.lang.Class<X.1ul> r1 = X.C40781ul.class
            java.lang.Class<X.2hA> r0 = X.C55702hA.class
            r2.A0R(r1, r0)
            X.1ON r1 = r2.A0N()
            r4.A00 = r3
            r0 = 210(0xd2, float:2.94E-43)
            java.lang.Object r1 = r1.A00(r0, r4)
            if (r1 != r6) goto L25
            return r6
        L8d:
            r0 = 42
            X.PX9 r4 = new X.PX9
            r4.<init>(r7, r9, r3, r0)
            goto L16
        L95:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L9b:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.monetization.api.MonetizationApi.A02(com.instagram.api.schemas.UserMonetizationProductType, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(com.instagram.api.schemas.UserMonetizationProductType r8, X.InterfaceC23621Ds r9) {
        /*
            r7 = this;
            r3 = 48
            boolean r0 = X.PX9.A03(r9, r3)
            if (r0 == 0) goto L8e
            r4 = r9
            X.PX9 r4 = (X.PX9) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8e
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r1 = r4.A01
            X.1JX r6 = X.C1JX.A02
            int r0 = r4.A00
            r5 = 0
            r3 = 1
            if (r0 == 0) goto L5d
            if (r0 != r3) goto L9c
            X.AbstractC09560e7.A00(r1)
        L25:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L53
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r0 = r1.A00
            X.1un r0 = (X.InterfaceC40801un) r0
            if (r0 == 0) goto L3a
            boolean r0 = r0.isOk()
            if (r0 == 0) goto L3a
            r5 = 1
        L3a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            X.3NX r1 = new X.3NX
            r1.<init>(r0)
        L43:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 != 0) goto L52
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto L96
            X.0eB r0 = X.C0eB.A00
            X.8jk r1 = new X.8jk
            r1.<init>(r0)
        L52:
            return r1
        L53:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto L43
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L5d:
            X.AbstractC09560e7.A00(r1)
            com.instagram.common.session.UserSession r1 = r7.A00
            r0 = -2
            X.1Ms r2 = new X.1Ms
            r2.<init>(r1, r0)
            r2.A05()
            java.lang.String r0 = "creators/onboarding/mark_checklist_screen_seen/"
            r2.A0B(r0)
            java.lang.String r1 = r8.A00
            java.lang.String r0 = "product_type"
            r2.A9s(r0, r1)
            java.lang.Class<X.1ul> r1 = X.C40781ul.class
            java.lang.Class<X.2hA> r0 = X.C55702hA.class
            r2.A0R(r1, r0)
            X.1ON r1 = r2.A0N()
            r4.A00 = r3
            r0 = 490845545(0x1d41b569, float:2.5637124E-21)
            java.lang.Object r1 = r1.A00(r0, r4)
            if (r1 != r6) goto L25
            return r6
        L8e:
            r0 = 42
            X.PX9 r4 = new X.PX9
            r4.<init>(r7, r9, r3, r0)
            goto L16
        L96:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L9c:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.monetization.api.MonetizationApi.A03(com.instagram.api.schemas.UserMonetizationProductType, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(com.instagram.api.schemas.UserMonetizationProductType r8, X.InterfaceC23621Ds r9) {
        /*
            r7 = this;
            r3 = 49
            boolean r0 = X.PX9.A03(r9, r3)
            if (r0 == 0) goto L8e
            r4 = r9
            X.PX9 r4 = (X.PX9) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8e
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r1 = r4.A01
            X.1JX r6 = X.C1JX.A02
            int r0 = r4.A00
            r5 = 0
            r3 = 1
            if (r0 == 0) goto L5d
            if (r0 != r3) goto L9c
            X.AbstractC09560e7.A00(r1)
        L25:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L53
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r0 = r1.A00
            X.1un r0 = (X.InterfaceC40801un) r0
            if (r0 == 0) goto L3a
            boolean r0 = r0.isOk()
            if (r0 == 0) goto L3a
            r5 = 1
        L3a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            X.3NX r1 = new X.3NX
            r1.<init>(r0)
        L43:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 != 0) goto L52
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto L96
            X.0eB r0 = X.C0eB.A00
            X.8jk r1 = new X.8jk
            r1.<init>(r0)
        L52:
            return r1
        L53:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto L43
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L5d:
            X.AbstractC09560e7.A00(r1)
            com.instagram.common.session.UserSession r1 = r7.A00
            r0 = -2
            X.1Ms r2 = new X.1Ms
            r2.<init>(r1, r0)
            r2.A05()
            java.lang.String r0 = "creators/onboarding/mark_confirmation_screen_done/"
            r2.A0B(r0)
            java.lang.String r1 = r8.A00
            java.lang.String r0 = "product_type"
            r2.A9s(r0, r1)
            java.lang.Class<X.1ul> r1 = X.C40781ul.class
            java.lang.Class<X.2hA> r0 = X.C55702hA.class
            r2.A0R(r1, r0)
            X.1ON r1 = r2.A0N()
            r4.A00 = r3
            r0 = 490845545(0x1d41b569, float:2.5637124E-21)
            java.lang.Object r1 = r1.A00(r0, r4)
            if (r1 != r6) goto L25
            return r6
        L8e:
            r0 = 42
            X.PX9 r4 = new X.PX9
            r4.<init>(r7, r9, r3, r0)
            goto L16
        L96:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L9c:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.monetization.api.MonetizationApi.A04(com.instagram.api.schemas.UserMonetizationProductType, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A06(java.lang.String r8, X.InterfaceC23621Ds r9) {
        /*
            r7 = this;
            r3 = 47
            boolean r0 = X.PX9.A03(r9, r3)
            if (r0 == 0) goto L8c
            r5 = r9
            X.PX9 r5 = (X.PX9) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8c
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A01
            X.1JX r6 = X.C1JX.A02
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L53
            if (r0 != r4) goto L9a
            X.AbstractC09560e7.A00(r1)
        L24:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L49
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r0 = r1.A00
            X.3DC r0 = (X.C3DC) r0
            java.lang.Object r0 = r0.F7f()
            X.3NX r1 = new X.3NX
            r1.<init>(r0)
        L39:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 != 0) goto L48
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto L94
            X.0eB r0 = X.C0eB.A00
            X.8jk r1 = new X.8jk
            r1.<init>(r0)
        L48:
            return r1
        L49:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto L39
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L53:
            X.AbstractC09560e7.A00(r1)
            com.instagram.common.session.UserSession r1 = r7.A00
            X.C14360o3.A0B(r8, r4)
            r0 = -2
            X.1Ms r3 = new X.1Ms
            r3.<init>(r1, r0)
            java.lang.String r2 = "product_type"
            r3.A06()
            r3.A03()
            java.lang.String r0 = "api/v1/creators/onboarding/get_monetization_products_onboarding_data/"
            r3.A0B(r0)
            java.lang.Class<X.H9V> r1 = X.H9V.class
            java.lang.Class<X.IOZ> r0 = X.IOZ.class
            r3.A0R(r1, r0)
            r3.A9s(r2, r8)
            X.1ON r1 = r3.A0N()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.MonetizationProductsOnboardingData>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.MonetizationProductsOnboardingData>>"
            X.C14360o3.A0C(r1, r0)
            r5.A00 = r4
            r0 = 210(0xd2, float:2.94E-43)
            java.lang.Object r1 = r1.A00(r0, r5)
            if (r1 != r6) goto L24
            return r6
        L8c:
            r0 = 42
            X.PX9 r5 = new X.PX9
            r5.<init>(r7, r9, r3, r0)
            goto L16
        L94:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L9a:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.monetization.api.MonetizationApi.A06(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @kotlin.Deprecated(message = "use fetchProductOnboardingEligibilityNew which fetchs from the onboarding endpoint")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A07(X.InterfaceC23621Ds r8) {
        /*
            r7 = this;
            r3 = 46
            boolean r0 = X.PX9.A03(r8, r3)
            if (r0 == 0) goto L5d
            r6 = r8
            X.PX9 r6 = (X.PX9) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5d
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r0 = r6.A01
            X.1JX r5 = X.C1JX.A02
            int r1 = r6.A00
            r4 = 1
            if (r1 == 0) goto L35
            if (r1 != r4) goto L6b
            X.AbstractC09560e7.A00(r0)
        L24:
            r5 = r0
            boolean r1 = r0 instanceof X.C3NX
            if (r1 != 0) goto L34
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto L65
            X.0eB r0 = X.C0eB.A00
            X.8jk r5 = new X.8jk
            r5.<init>(r0)
        L34:
            return r5
        L35:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r0 = r7.A00
            r3 = 210(0xd2, float:2.94E-43)
            X.1Ms r2 = new X.1Ms
            r2.<init>(r0, r3)
            r2.A06()
            java.lang.String r0 = "business/eligibility/get_monetization_products_onboarding_eligibility_data/"
            r2.A0B(r0)
            java.lang.Class<X.HA4> r1 = X.HA4.class
            java.lang.Class<X.IRN> r0 = X.IRN.class
            r2.A0R(r1, r0)
            X.1ON r0 = r2.A0N()
            r6.A00 = r4
            java.lang.Object r0 = r0.A00(r3, r6)
            if (r0 != r5) goto L24
            return r5
        L5d:
            r0 = 42
            X.PX9 r6 = new X.PX9
            r6.<init>(r7, r8, r3, r0)
            goto L16
        L65:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L6b:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.monetization.api.MonetizationApi.A07(X.1Ds):java.lang.Object");
    }
}
