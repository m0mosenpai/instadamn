package com.instagram.avatars.suggestions;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC25225BEi;
import X.AbstractC31171DnF;
import X.AbstractC43593JPy;
import X.C006802i;
import X.C05A;
import X.C0Zx;
import X.C10E;
import X.C14360o3;
import X.C167417dv;
import X.C4A7;
import X.C4A8;
import X.C50254MHj;
import X.InterfaceC02590Ai;
import X.InterfaceC09390do;
import X.MBq;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes8.dex */
public final class AvatarStickerSuggestionRepository extends C4A7 {
    public boolean A00;
    public final int A01;
    public final C167417dv A02;
    public final C006802i A03;
    public final UserSession A04;
    public final String A05;
    public final ConcurrentHashMap A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final C05A A09;
    public final C05A A0A;
    public final boolean A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AvatarStickerSuggestionRepository(C006802i c006802i, UserSession userSession, String str, int i, boolean z) {
        super("AvatarSuggestionRepository", C4A8.A00(1342004349));
        C167417dv c167417dv = new C167417dv(userSession);
        C14360o3.A0B(c006802i, 2);
        this.A04 = userSession;
        this.A03 = c006802i;
        this.A05 = str;
        this.A01 = i;
        this.A0B = z;
        this.A02 = c167417dv;
        this.A0A = AbstractC25225BEi.A1H("");
        this.A09 = C10E.A00(null);
        this.A06 = new ConcurrentHashMap();
        this.A08 = C50254MHj.A01(this, 42);
        this.A07 = C50254MHj.A01(this, 41);
        MBq.A01(this, super.A01, 23);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x017a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.avatars.suggestions.AvatarStickerSuggestionRepository r16, java.lang.String r17, X.InterfaceC23621Ds r18) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.suggestions.AvatarStickerSuggestionRepository.A00(com.instagram.avatars.suggestions.AvatarStickerSuggestionRepository, java.lang.String, X.1Ds):java.lang.Object");
    }

    private final void A01(String str, List list, boolean z) {
        String str2;
        C167417dv c167417dv = this.A02;
        String str3 = this.A05;
        String valueOf = String.valueOf(((LexiconRecommendationProvider) this.A07.getValue()).A02);
        C14360o3.A0B(str, 5);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c167417dv.A00, "avatar_stickers_measurement_typeahead_recommendations");
        if (A0f.isSampled()) {
            C0Zx c0Zx = new C0Zx();
            c0Zx.A05("result_size", AbstractC31171DnF.A0V(list.size()));
            c0Zx.A06("referrer_surface", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT);
            c0Zx.A06("lexicon_version", valueOf);
            c0Zx.A07("non_avatar_sticker_ids", list);
            if (z) {
                str2 = "raw";
            } else {
                str2 = "filtered";
            }
            c0Zx.A06("recommendation_type", str2);
            c0Zx.A06(AbstractC111324zv.A00(63), str3);
            c0Zx.A06(AbstractC111324zv.A00(2543), str);
            A0f.AAQ(c0Zx, "event_data");
            AbstractC43593JPy.A1I(A0f, "typeahead");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(java.lang.String r9, X.InterfaceC23621Ds r10) {
        /*
            r8 = this;
            r3 = 23
            boolean r0 = X.MAL.A01(r10, r3)
            if (r0 == 0) goto L2f
            r4 = r10
            X.MAL r4 = (X.MAL) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2f
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r7 = r4.A04
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r6 = 4
            r5 = 3
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L43
            if (r0 == r1) goto L94
            if (r0 == r2) goto L35
            if (r0 == r5) goto L94
            if (r0 == r6) goto L94
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L2f:
            X.MAL r4 = new X.MAL
            r4.<init>(r8, r10, r3)
            goto L16
        L35:
            java.lang.Object r2 = r4.A03
            com.instagram.avatars.suggestions.AvatarStickerSuggestionRepository r2 = (com.instagram.avatars.suggestions.AvatarStickerSuggestionRepository) r2
            java.lang.Object r9 = r4.A02
            java.lang.Object r1 = r4.A01
            com.instagram.avatars.suggestions.AvatarStickerSuggestionRepository r1 = (com.instagram.avatars.suggestions.AvatarStickerSuggestionRepository) r1
            X.AbstractC09560e7.A00(r7)
            goto L69
        L43:
            X.AbstractC09560e7.A00(r7)
            boolean r0 = r8.A00
            if (r0 == 0) goto L59
            r4.A00 = r1
            X.05A r0 = r8.A0A
            java.lang.Object r0 = r0.emit(r9, r4)
        L52:
            if (r0 == r3) goto L99
            X.0eB r0 = X.C0eB.A00
        L56:
            if (r0 != r3) goto L97
            return r3
        L59:
            r4.A01 = r8
            r4.A02 = r9
            r4.A03 = r8
            r4.A00 = r2
            java.lang.Object r7 = r8.A03(r4)
            if (r7 == r3) goto L99
            r1 = r8
            r2 = r8
        L69:
            boolean r0 = X.AbstractC166987dD.A1a(r7)
            r2.A00 = r0
            boolean r0 = r1.A00
            r2 = 0
            if (r0 == 0) goto L83
            r4.A01 = r2
            r4.A02 = r2
            r4.A03 = r2
            r4.A00 = r5
            X.05A r0 = r1.A0A
            java.lang.Object r0 = r0.emit(r9, r4)
            goto L52
        L83:
            X.05A r1 = r1.A09
            X.0sl r0 = X.C16930sl.A00
            r4.A01 = r2
            r4.A02 = r2
            r4.A03 = r2
            r4.A00 = r6
            java.lang.Object r0 = r1.emit(r0, r4)
            goto L56
        L94:
            X.AbstractC09560e7.A00(r7)
        L97:
            X.0eB r3 = X.C0eB.A00
        L99:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.suggestions.AvatarStickerSuggestionRepository.A02(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:13)(2:10|11))(3:18|19|(1:21))|14|15|16))|24|6|7|(0)(0)|14|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        r3 = new X.C09540e5(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(X.InterfaceC23621Ds r6) {
        /*
            r5 = this;
            r3 = 32
            boolean r0 = X.MAR.A03(r6, r3)
            if (r0 == 0) goto L22
            r4 = r6
            X.MAR r4 = (X.MAR) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r3 = r4.A01
            X.1JX r2 = X.C1JX.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 != r1) goto L27
            goto L40
        L22:
            X.MAR r4 = X.MAR.A01(r5, r6, r3)
            goto L16
        L27:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L2c:
            X.AbstractC09560e7.A00(r3)
            X.0do r0 = r5.A08     // Catch: java.lang.Throwable -> L46
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L46
            com.facebook.avatar.stickerguide.lib.impl.StickerTypeaheadImpl r0 = (com.facebook.avatar.stickerguide.lib.impl.StickerTypeaheadImpl) r0     // Catch: java.lang.Throwable -> L46
            r4.A00 = r1     // Catch: java.lang.Throwable -> L46
            java.lang.Object r3 = r0.A01(r4)     // Catch: java.lang.Throwable -> L46
            if (r3 != r2) goto L43
            return r2
        L40:
            X.AbstractC09560e7.A00(r3)     // Catch: java.lang.Throwable -> L46
        L43:
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L46
            goto L4c
        L46:
            r0 = move-exception
            X.0e5 r3 = new X.0e5
            r3.<init>(r0)
        L4c:
            boolean r0 = r3 instanceof X.C09540e5
            java.lang.Boolean r2 = X.AbstractC31172DnG.A0s(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.suggestions.AvatarStickerSuggestionRepository.A03(X.1Ds):java.lang.Object");
    }
}
