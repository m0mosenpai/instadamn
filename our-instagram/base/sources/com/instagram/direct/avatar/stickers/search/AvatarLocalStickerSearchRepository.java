package com.instagram.direct.avatar.stickers.search;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC40691uc;
import X.EnumC143276dS;
import com.instagram.common.session.UserSession;
import com.instagram.stickersearch.api.AvatarStickerGraphQLApi;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public final class AvatarLocalStickerSearchRepository {
    public List A00;
    public final EnumC143276dS A01;
    public final UserSession A02;
    public final AvatarStickerGraphQLApi A03;
    public final AtomicBoolean A04;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.direct.avatar.stickers.search.AvatarLocalStickerSearchRepository r11, X.InterfaceC23621Ds r12) {
        /*
            r3 = 25
            boolean r0 = X.MAF.A01(r12, r3)
            if (r0 == 0) goto L6b
            r9 = r12
            X.MAF r9 = (X.MAF) r9
            int r2 = r9.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6b
            int r2 = r2 - r1
            r9.A00 = r2
        L16:
            java.lang.Object r4 = r9.A02
            X.1JX r3 = X.C1JX.A02
            int r0 = r9.A00
            r2 = 0
            r10 = 1
            if (r0 == 0) goto L48
            if (r0 != r10) goto L71
            java.lang.Object r11 = r9.A01
            com.instagram.direct.avatar.stickers.search.AvatarLocalStickerSearchRepository r11 = (com.instagram.direct.avatar.stickers.search.AvatarLocalStickerSearchRepository) r11
            X.AbstractC09560e7.A00(r4)
        L29:
            X.3NY r4 = (X.C3NY) r4
            boolean r0 = r4 instanceof X.C3NX
            r1 = 0
            if (r0 == 0) goto L3c
            X.3NX r4 = (X.C3NX) r4
            java.lang.Object r0 = r4.A00
            X.K8S r0 = (X.K8S) r0
            if (r0 == 0) goto L3c
            java.util.List r1 = r0.A00()
        L3c:
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.A04
            r0.set(r2)
            if (r1 != 0) goto L45
            X.0sl r1 = X.C16930sl.A00
        L45:
            r11.A00 = r1
            return r1
        L48:
            X.AbstractC09560e7.A00(r4)
            com.instagram.stickersearch.api.AvatarStickerGraphQLApi r4 = r11.A03
            X.6dT r7 = X.EnumC143286dT.A07
            X.6dS r6 = r11.A01
            r0 = 1000(0x3e8, float:1.401E-42)
            java.lang.Integer r8 = X.AbstractC43592JPx.A0r(r0)
            X.0sl r1 = X.C16930sl.A00
            r0 = 20
            X.Mth r5 = new X.Mth
            r5.<init>(r2, r1, r0)
            r9.A01 = r11
            r9.A00 = r10
            java.lang.Object r4 = r4.A00(r5, r6, r7, r8, r9, r10)
            if (r4 != r3) goto L29
            return r3
        L6b:
            X.MAF r9 = new X.MAF
            r9.<init>(r11, r12, r3)
            goto L16
        L71:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.avatar.stickers.search.AvatarLocalStickerSearchRepository.A00(com.instagram.direct.avatar.stickers.search.AvatarLocalStickerSearchRepository, X.1Ds):java.lang.Object");
    }

    public /* synthetic */ AvatarLocalStickerSearchRepository(EnumC143276dS enumC143276dS, UserSession userSession) {
        AvatarStickerGraphQLApi avatarStickerGraphQLApi = new AvatarStickerGraphQLApi(userSession, AbstractC40691uc.A01(userSession));
        AbstractC167017dG.A1P(userSession, enumC143276dS);
        this.A02 = userSession;
        this.A01 = enumC143276dS;
        this.A03 = avatarStickerGraphQLApi;
        this.A04 = AbstractC166997dE.A17();
    }
}
