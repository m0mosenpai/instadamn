package com.instagram.avatars.graphql;

import X.AbstractC149786oX;
import X.AbstractC40691uc;
import X.AbstractC55671Onw;
import X.C142016bK;
import X.C14360o3;
import X.C2JM;
import X.C2JO;
import X.C40701ud;
import X.InterfaceC23621Ds;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.stickersearch.api.AvatarStickerGraphQLApi;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class AvatarStickerGraphQLRepository {
    public final UserSession A00;
    public final C142016bK A01;
    public final C40701ud A02;
    public final AvatarStickerGraphQLApi A03;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(java.lang.String r10, java.lang.String r11, X.InterfaceC23621Ds r12) {
        /*
            r9 = this;
            r3 = 26
            boolean r0 = X.MAR.A03(r12, r3)
            if (r0 == 0) goto La7
            r6 = r12
            X.MAR r6 = (X.MAR) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La7
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r2 = r6.A01
            X.1JX r8 = X.C1JX.A02
            int r0 = r6.A00
            r7 = 1
            if (r0 == 0) goto L69
            if (r0 != r7) goto Lb0
            X.AbstractC09560e7.A00(r2)
        L24:
            X.3NY r2 = (X.C3NY) r2
            boolean r0 = r2 instanceof X.C3NX
            r1 = 0
            if (r0 == 0) goto L5f
            X.3NX r2 = (X.C3NX) r2
            java.lang.Object r0 = r2.A00
            X.435 r0 = (X.AnonymousClass435) r0
            java.lang.Object r0 = r0.A01
            X.R0w r0 = (X.C60496R0w) r0
            if (r0 == 0) goto L5e
            X.R0v r0 = r0.A0E()
            if (r0 == 0) goto L5e
            X.R0u r0 = r0.A0E()
            if (r0 == 0) goto L5e
            X.R0t r0 = r0.A0E()
            if (r0 == 0) goto L5e
            com.google.common.collect.ImmutableList r2 = r0.A0E()
            if (r2 == 0) goto L5e
            r0 = 0
            java.lang.Object r2 = X.AbstractC001800i.A0O(r2, r0)
            X.2JS r2 = (X.C2JS) r2
            if (r2 == 0) goto L5e
            java.lang.String r0 = "cdn_url"
            java.lang.String r1 = r2.getOptionalStringField(r7, r0)
        L5e:
            return r1
        L5f:
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 != 0) goto L5e
            X.B4Z r1 = new X.B4Z
            r1.<init>()
            throw r1
        L69:
            X.AbstractC09560e7.A00(r2)
            r6.A00 = r7
            X.1ud r5 = r9.A02
            r0 = 0
            X.C14360o3.A0B(r10, r0)
            X.C14360o3.A0B(r11, r7)
            X.2JM r4 = new X.2JM
            r4.<init>()
            X.2JM r3 = new X.2JM
            r3.<init>()
            java.lang.String r0 = "user_id"
            r4.A04(r0, r10)
            X.2JO r2 = new X.2JO
            r2.<init>()
            java.lang.String r1 = ""
            java.lang.String r0 = "sticker_pack_id"
            r2.A09(r1, r0)
            java.lang.String r0 = "expression_id"
            r2.A09(r11, r0)
            java.lang.String r0 = "query_params"
            r4.A00(r2, r0)
            com.facebook.pando.PandoGraphQLRequest r0 = X.AbstractC55671Onw.A00(r4, r3, r7)
            java.lang.Object r2 = r5.A04(r0, r6)
            if (r2 != r8) goto L24
            return r8
        La7:
            r0 = 42
            X.MAR r6 = new X.MAR
            r6.<init>(r9, r12, r3, r0)
            goto L16
        Lb0:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.graphql.AvatarStickerGraphQLRepository.A00(java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    public final Object A01(String str, String str2, InterfaceC23621Ds interfaceC23621Ds) {
        AvatarStickerGraphQLApi avatarStickerGraphQLApi = this.A03;
        C2JO c2jo = new C2JO();
        c2jo.A09("", "sticker_pack_id");
        List singletonList = Collections.singletonList(str);
        C14360o3.A07(singletonList);
        c2jo.A05("instruction_key_ids", singletonList);
        C2JM c2jm = new C2JM();
        C2JM c2jm2 = new C2JM();
        c2jm.A04(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str2);
        boolean z = false;
        if (str2 != null) {
            z = true;
        }
        c2jm.A00(c2jo, "query_params");
        return avatarStickerGraphQLApi.A01.A04(AbstractC55671Onw.A00(c2jm, c2jm2, z), interfaceC23621Ds);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(java.lang.String r21, X.InterfaceC23621Ds r22) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.graphql.AvatarStickerGraphQLRepository.A02(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(java.lang.String r11, X.InterfaceC23621Ds r12) {
        /*
            r10 = this;
            r3 = 28
            boolean r0 = X.MAR.A03(r12, r3)
            if (r0 == 0) goto La9
            r5 = r12
            X.MAR r5 = (X.MAR) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La9
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r0 = r5.A01
            X.1JX r7 = X.C1JX.A02
            int r1 = r5.A00
            r6 = 1
            if (r1 == 0) goto L6f
            if (r1 != r6) goto Lb2
            X.AbstractC09560e7.A00(r0)
        L24:
            r7 = r0
            X.3NY r7 = (X.C3NY) r7
            boolean r0 = r7 instanceof X.C3NX
            if (r0 == 0) goto L65
            X.3NX r7 = (X.C3NX) r7
            java.lang.Object r0 = r7.A00
            X.435 r0 = (X.AnonymousClass435) r0
            java.lang.Object r0 = r0.A01
            X.R0w r0 = (X.C60496R0w) r0
            if (r0 == 0) goto L63
            X.R0v r0 = r0.A0E()
            if (r0 == 0) goto L63
            X.R0u r0 = r0.A0E()
            if (r0 == 0) goto L63
            X.R0t r0 = r0.A0E()
            if (r0 == 0) goto L63
            com.google.common.collect.ImmutableList r0 = r0.A0E()
            if (r0 == 0) goto L63
            java.lang.Object r1 = X.AbstractC001800i.A0J(r0)
            X.2JS r1 = (X.C2JS) r1
            if (r1 == 0) goto L63
            java.lang.String r0 = "cdn_url"
            java.lang.String r0 = r1.getOptionalStringField(r6, r0)
        L5d:
            X.3NX r7 = new X.3NX
            r7.<init>(r0)
        L62:
            return r7
        L63:
            r0 = 0
            goto L5d
        L65:
            boolean r0 = r7 instanceof X.C194848jk
            if (r0 != 0) goto L62
            X.B4Z r1 = new X.B4Z
            r1.<init>()
            throw r1
        L6f:
            X.AbstractC09560e7.A00(r0)
            com.instagram.stickersearch.api.AvatarStickerGraphQLApi r9 = r10.A03
            r5.A00 = r6
            X.2JO r8 = new X.2JO
            r8.<init>()
            java.lang.String r0 = "sticker_pack_id"
            r8.A09(r11, r0)
            X.2JM r4 = new X.2JM
            r4.<init>()
            X.2JM r3 = new X.2JM
            r3.<init>()
            com.instagram.common.session.UserSession r0 = r9.A00
            java.lang.String r2 = r0.userId
            java.lang.String r0 = "user_id"
            r4.A04(r0, r2)
            r1 = 0
            if (r2 == 0) goto L97
            r1 = 1
        L97:
            java.lang.String r0 = "query_params"
            r4.A00(r8, r0)
            com.facebook.pando.PandoGraphQLRequest r1 = X.AbstractC55671Onw.A00(r4, r3, r1)
            X.1ud r0 = r9.A01
            java.lang.Object r0 = r0.A04(r1, r5)
            if (r0 != r7) goto L24
            return r7
        La9:
            r0 = 42
            X.MAR r5 = new X.MAR
            r5.<init>(r10, r12, r3, r0)
            goto L16
        Lb2:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.graphql.AvatarStickerGraphQLRepository.A03(java.lang.String, X.1Ds):java.lang.Object");
    }

    public /* synthetic */ AvatarStickerGraphQLRepository(UserSession userSession) {
        AvatarStickerGraphQLApi avatarStickerGraphQLApi = new AvatarStickerGraphQLApi(userSession, AbstractC40691uc.A01(userSession));
        C142016bK A00 = AbstractC149786oX.A00(userSession);
        C40701ud A01 = AbstractC40691uc.A01(userSession);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(A00, 3);
        C14360o3.A0B(A01, 4);
        this.A00 = userSession;
        this.A03 = avatarStickerGraphQLApi;
        this.A01 = A00;
        this.A02 = A01;
    }
}
