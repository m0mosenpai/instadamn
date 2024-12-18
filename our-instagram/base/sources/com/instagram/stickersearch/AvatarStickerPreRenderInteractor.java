package com.instagram.stickersearch;

import X.AbstractC150256pZ;
import X.AbstractC200578u0;
import X.AbstractC47130KsP;
import X.AnonymousClass001;
import X.C006802i;
import X.C14360o3;
import X.C150236pX;
import X.C20Y;
import X.EnumC143276dS;
import X.EnumC143286dT;
import X.InterfaceC19630xq;
import android.app.Application;
import com.facebook.quicklog.MarkerEditor;
import com.instagram.avatars.graphql.AvatarStickerGraphQLRepository;
import com.instagram.avatars.graphql.UserAvatarInfoGraphQLRepository;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.session.UserSession;
import com.instagram.stickersearch.api.ODRAvatarStickerRepository;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class AvatarStickerPreRenderInteractor {
    public final Application A00;
    public final AvatarStickerGraphQLRepository A01;
    public final UserAvatarInfoGraphQLRepository A02;
    public final AvatarStore A03;
    public final UserSession A04;
    public final C150236pX A05;
    public final ODRAvatarStickerRepository A06;

    public /* synthetic */ AvatarStickerPreRenderInteractor(Application application, UserSession userSession, int i) {
        UserAvatarInfoGraphQLRepository userAvatarInfoGraphQLRepository;
        AvatarStickerGraphQLRepository avatarStickerGraphQLRepository;
        if ((i & 2) != 0) {
            userAvatarInfoGraphQLRepository = new UserAvatarInfoGraphQLRepository(userSession);
        } else {
            userAvatarInfoGraphQLRepository = null;
        }
        C150236pX c150236pX = (i & 4) != 0 ? new C150236pX(userSession) : null;
        AvatarStore A00 = (i & 8) != 0 ? C20Y.A00(userSession) : null;
        if ((i & 16) != 0) {
            avatarStickerGraphQLRepository = new AvatarStickerGraphQLRepository(userSession);
        } else {
            avatarStickerGraphQLRepository = null;
        }
        ODRAvatarStickerRepository oDRAvatarStickerRepository = null;
        application = (i & 32) != 0 ? null : application;
        if ((i & 64) != 0 && AbstractC150256pZ.A00(userSession) && application != null) {
            C14360o3.A0B(userSession, 0);
            oDRAvatarStickerRepository = new ODRAvatarStickerRepository(AbstractC47130KsP.A00(application, userSession));
        }
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(userAvatarInfoGraphQLRepository, 2);
        C14360o3.A0B(c150236pX, 3);
        C14360o3.A0B(A00, 4);
        C14360o3.A0B(avatarStickerGraphQLRepository, 5);
        this.A04 = userSession;
        this.A02 = userAvatarInfoGraphQLRepository;
        this.A05 = c150236pX;
        this.A03 = A00;
        this.A01 = avatarStickerGraphQLRepository;
        this.A00 = application;
        this.A06 = oDRAvatarStickerRepository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        if (X.C14360o3.A0K(r1, r0.A00().get(r9)) == false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(X.EnumC143276dS r12, X.EnumC143286dT r13, X.InterfaceC23621Ds r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.stickersearch.AvatarStickerPreRenderInteractor.A02(X.6dS, X.6dT, X.1Ds, boolean):java.lang.Object");
    }

    public final boolean A06(String str, String str2) {
        C14360o3.A0B(str, 0);
        InterfaceC19630xq interfaceC19630xq = this.A05.A01.A00;
        String string = interfaceC19630xq.getString(AnonymousClass001.A0R("KEY_AVATAR_VERSION", str), null);
        if (string != null && string.length() != 0 && C14360o3.A0K(interfaceC19630xq.getString(AnonymousClass001.A0R("KEY_AVATAR_VERSION", str), null), str2)) {
            return false;
        }
        return true;
    }

    private final void A00(EnumC143276dS enumC143276dS, EnumC143286dT enumC143286dT, Integer num, String str) {
        if (num != null && str != null) {
            int intValue = num.intValue();
            String A00 = EnumC143276dS.A01.A00(enumC143276dS, enumC143286dT, this.A04, false);
            C14360o3.A0B(A00, 2);
            C006802i c006802i = C006802i.A0p;
            C14360o3.A0A(c006802i);
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            C14360o3.A0B(c006802i, 0);
            c006802i.markerStartWithCancelPolicy(129906472, true, intValue, -1L, timeUnit, str);
            MarkerEditor withMarker = c006802i.withMarker(129906472, intValue);
            long currentTimeMillis = System.currentTimeMillis();
            withMarker.annotate("join_id", str);
            withMarker.annotate("qpl_join__source_clock", "unreliable");
            withMarker.annotate("qpl_join__absolute_time_origin_ms", currentTimeMillis);
            withMarker.annotate("qpl_join__source_is_primary", false);
            withMarker.markerEditingCompleted();
            c006802i.markerAnnotate(129906472, intValue, "sticker_pack", A00);
            c006802i.markerAnnotate(129906472, intValue, "qpl_client_source", "client_android");
            C006802i c006802i2 = C006802i.A0p;
            C14360o3.A0A(c006802i2);
            C14360o3.A0B(c006802i2, 0);
            c006802i2.markerPoint(129906472, intValue, AnonymousClass001.A0R("join_request_", "avatar_e2e_qpl_request_id"), -1L, timeUnit);
        }
    }

    private final void A01(EnumC143276dS enumC143276dS, EnumC143286dT enumC143286dT, Integer num, boolean z) {
        if (z) {
            this.A05.A00(true, EnumC143276dS.A01.A00(enumC143276dS, enumC143286dT, this.A04, false));
        }
        if (num != null) {
            int intValue = num.intValue();
            AbstractC200578u0.A00(intValue);
            C006802i.A0p.markerEnd(129906472, intValue, (short) 87);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(X.EnumC143276dS r18, X.EnumC143286dT r19, X.InterfaceC23621Ds r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.stickersearch.AvatarStickerPreRenderInteractor.A03(X.6dS, X.6dT, X.1Ds, boolean, boolean):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x010e, code lost:
    
        if (r13 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0173, code lost:
    
        if (r6 != X.EnumC143276dS.A0U) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(X.EnumC143276dS r30, X.EnumC143286dT r31, X.InterfaceC23621Ds r32, boolean r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.stickersearch.AvatarStickerPreRenderInteractor.A04(X.6dS, X.6dT, X.1Ds, boolean, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A05(X.InterfaceC23621Ds r8) {
        /*
            r7 = this;
            r3 = 12
            boolean r0 = X.C57146PWy.A01(r8, r3)
            if (r0 == 0) goto L61
            r5 = r8
            X.PWy r5 = (X.C57146PWy) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L61
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A02
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r6 = 2
            r3 = 1
            if (r0 == 0) goto L32
            if (r0 == r3) goto L2a
            if (r0 != r6) goto L67
            X.AbstractC09560e7.A00(r1)
        L27:
            X.0eB r4 = X.C0eB.A00
            return r4
        L2a:
            java.lang.Object r0 = r5.A01
            com.instagram.stickersearch.AvatarStickerPreRenderInteractor r0 = (com.instagram.stickersearch.AvatarStickerPreRenderInteractor) r0
            X.AbstractC09560e7.A00(r1)
            goto L4b
        L32:
            X.AbstractC09560e7.A00(r1)
            com.instagram.stickersearch.api.ODRAvatarStickerRepository r2 = r7.A06
            if (r2 == 0) goto L4a
            com.instagram.api.schemas.StickerPack r0 = com.instagram.api.schemas.StickerPack.A0G
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "STORIES"
            r5.A01 = r7
            r5.A00 = r3
            java.lang.Object r0 = r2.A01(r1, r0, r5)
            if (r0 != r4) goto L4a
            return r4
        L4a:
            r0 = r7
        L4b:
            com.instagram.stickersearch.api.ODRAvatarStickerRepository r3 = r0.A06
            if (r3 == 0) goto L27
            com.instagram.api.schemas.StickerPack r0 = com.instagram.api.schemas.StickerPack.A0E
            java.lang.String r2 = r0.A00
            java.lang.String r1 = "STORIES"
            r0 = 0
            r5.A01 = r0
            r5.A00 = r6
            java.lang.Object r0 = r3.A01(r2, r1, r5)
            if (r0 != r4) goto L27
            return r4
        L61:
            X.PWy r5 = new X.PWy
            r5.<init>(r7, r8, r3)
            goto L16
        L67:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.stickersearch.AvatarStickerPreRenderInteractor.A05(X.1Ds):java.lang.Object");
    }
}
