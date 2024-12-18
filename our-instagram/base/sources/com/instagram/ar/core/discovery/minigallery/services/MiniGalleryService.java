package com.instagram.ar.core.discovery.minigallery.services;

import X.AbstractC1807880g;
import X.AbstractC50529MSi;
import X.AnonymousClass058;
import X.AnonymousClass111;
import X.AnonymousClass566;
import X.AnonymousClass859;
import X.B4B;
import X.C04060Jx;
import X.C05F;
import X.C0CA;
import X.C0JK;
import X.C14360o3;
import X.C15340po;
import X.C16400rl;
import X.C16410rm;
import X.C16440rp;
import X.C172787mo;
import X.C172887n0;
import X.C194848jk;
import X.C206629Ct;
import X.C214609ey;
import X.C22828A4x;
import X.C2JM;
import X.C2JO;
import X.C47509Kyc;
import X.C907442n;
import X.C907542o;
import X.C9D0;
import X.C9D2;
import X.C9DI;
import X.C9DN;
import X.C9Yl;
import X.InterfaceC19390xP;
import X.InterfaceC23621Ds;
import X.M9P;
import X.MC5;
import X.MCC;
import android.content.Context;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.google.common.collect.ImmutableList;
import com.instagram.ar.core.effectcollection.EffectCollectionService;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class MiniGalleryService {
    public String A00;
    public final MiniGalleryCategoriesService A01;
    public final EffectCollectionService A02;
    public final UserSession A03;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(X.C47703L4k r12, com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService r13, X.C173327nk r14, X.InterfaceC23621Ds r15) {
        /*
            r3 = 6
            boolean r0 = X.C206459Cc.A00(r15, r3)
            r6 = r13
            if (r0 == 0) goto L2c
            r11 = r15
            X.9Cc r11 = (X.C206459Cc) r11
            int r2 = r11.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2c
            int r2 = r2 - r1
            r11.A00 = r2
        L16:
            java.lang.Object r1 = r11.A03
            X.1JX r4 = X.C1JX.A02
            int r0 = r11.A00
            r5 = 2
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 == r2) goto L92
            if (r0 == r5) goto L92
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L2c:
            X.9Cc r11 = new X.9Cc
            r11.<init>(r13, r15, r3)
            goto L16
        L32:
            X.AbstractC09560e7.A00(r1)
            java.lang.Object r1 = r14.A00
            X.9Bj r1 = (X.C206269Bj) r1
            java.lang.Object r0 = r1.A02
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r0)
            java.util.List r10 = r12.A05
            if (r10 == 0) goto L72
            java.lang.Object r0 = r1.A01
            X.8dU r0 = (X.C191258dU) r0
            java.lang.String r1 = r0.A01
            java.lang.String r0 = r12.A04
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L72
            java.lang.String r8 = r12.A03
            X.859 r0 = r12.A00
            X.85A r1 = r0.A00
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            java.lang.String r0 = "EFFECT_BY_ID"
            X.8dU r7 = new X.8dU
            r7.<init>(r1, r0)
            r11.A01 = r14
            r11.A02 = r9
            r11.A00 = r2
            java.lang.Object r0 = A02(r6, r7, r8, r9, r10, r11)
        L6f:
            if (r0 != r4) goto L9d
            return r4
        L72:
            java.lang.String r3 = r12.A03
            if (r3 == 0) goto L9d
            X.859 r1 = r12.A00
            X.8dU r0 = X.C191258dU.A0M
            X.85A r2 = r1.A00
            r0 = 0
            X.C14360o3.A0B(r2, r0)
            java.lang.String r1 = "EFFECT_BY_ID"
            X.8dU r0 = new X.8dU
            r0.<init>(r2, r1)
            r11.A01 = r14
            r11.A02 = r9
            r11.A00 = r5
            java.lang.Object r0 = A03(r13, r0, r3, r9, r11)
            goto L6f
        L92:
            java.lang.Object r9 = r11.A02
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            java.lang.Object r14 = r11.A01
            X.7nk r14 = (X.C173327nk) r14
            X.AbstractC09560e7.A00(r1)
        L9d:
            boolean r2 = r14.A02
            java.lang.String r1 = r14.A01
            X.L0l r0 = new X.L0l
            r0.<init>(r1, r9, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService.A01(X.L4k, com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService, X.7nk, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService r10, X.C191258dU r11, java.lang.String r12, java.util.ArrayList r13, java.util.List r14, X.InterfaceC23621Ds r15) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService.A02(com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService, X.8dU, java.lang.String, java.util.ArrayList, java.util.List, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(X.C191258dU r12, java.lang.String r13, X.InterfaceC23621Ds r14) {
        /*
            r11 = this;
            r3 = 6
            boolean r0 = X.MAR.A03(r14, r3)
            if (r0 == 0) goto L49
            r8 = r14
            X.MAR r8 = (X.MAR) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L49
            int r2 = r2 - r1
            r8.A00 = r2
        L15:
            java.lang.Object r3 = r8.A01
            X.1JX r2 = X.C1JX.A02
            int r0 = r8.A00
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L5d
            X.AbstractC09560e7.A00(r3)
        L23:
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L51
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r2 = r3.A00
            return r2
        L2e:
            X.AbstractC09560e7.A00(r3)
            com.instagram.ar.core.effectcollection.EffectCollectionService r3 = r11.A02
            r6 = 0
            r5 = r13
            X.C14360o3.A0B(r13, r1)
            r0 = 2
            r4 = r12
            X.C14360o3.A0B(r12, r0)
            r8.A00 = r1
            r9 = 2
            r7 = r6
            java.lang.Object r3 = com.instagram.ar.core.effectcollection.EffectCollectionService.A03(r3, r4, r5, r6, r7, r8, r9)
            if (r3 != r2) goto L23
            return r2
        L49:
            r0 = 42
            X.MAR r8 = new X.MAR
            r8.<init>(r11, r14, r3, r0)
            goto L15
        L51:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 == 0) goto L57
            r2 = 0
            return r2
        L57:
            X.B4Z r1 = new X.B4Z
            r1.<init>()
            throw r1
        L5d:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService.A04(X.8dU, java.lang.String, X.1Ds):java.lang.Object");
    }

    public final C16410rm A05(AnonymousClass859 anonymousClass859, boolean z, boolean z2) {
        long j;
        C14360o3.A0B(anonymousClass859, 0);
        if (z) {
            j = 0;
        } else {
            j = 3;
        }
        MiniGalleryCategoriesService miniGalleryCategoriesService = this.A01;
        C172787mo c172787mo = new C172787mo(anonymousClass859);
        return new C16410rm(new C9D2(c172787mo, null, 0), new C15340po(new C9D0(c172787mo, (InterfaceC23621Ds) null, 7, 42), AnonymousClass111.A02(new C9DN(miniGalleryCategoriesService, anonymousClass859, null, 0), AnonymousClass111.A02(new MiniGalleryCategoriesService$getCategories$$inlined$flatMapLatest$1(miniGalleryCategoriesService, anonymousClass859, null, z2), new C16400rl(new C206629Ct(c172787mo, null, 7), new AnonymousClass058(new C9DI(miniGalleryCategoriesService, anonymousClass859, null, j)))))));
    }

    public static final B4B A00(MiniGalleryService miniGalleryService, AnonymousClass859 anonymousClass859, String str, String str2, String str3) {
        Integer num;
        String str4;
        InterfaceC19390xP c15340po;
        UserSession userSession = miniGalleryService.A03;
        switch (anonymousClass859.ordinal()) {
            case 0:
                num = C05F.A00;
                break;
            case 1:
                num = C05F.A0u;
                break;
            case 2:
                num = C05F.A0C;
                break;
            case 3:
                num = C05F.A0N;
                break;
            case 4:
                num = C05F.A0Y;
                break;
            case 5:
                num = C05F.A0j;
                break;
            case 6:
                num = C05F.A15;
                break;
            default:
                throw new RuntimeException();
        }
        C14360o3.A0B(num, 1);
        C14360o3.A0B(str, 2);
        C14360o3.A0B(str2, 3);
        if (!(!C0JK.A01().A0A())) {
            c15340po = new C16440rp(new C194848jk(C214609ey.A00));
        } else {
            C47509Kyc c47509Kyc = new C47509Kyc(userSession);
            C22828A4x c22828A4x = new C22828A4x(num);
            C2JO A01 = AnonymousClass566.A01(userSession);
            C04060Jx c04060Jx = GraphQlCallInput.A02;
            String A012 = AbstractC50529MSi.A01();
            C0CA A02 = c04060Jx.A02();
            C0CA.A00(A02, str, A012);
            C2JM c2jm = new C2JM();
            c2jm.A04("query", str2);
            switch (c22828A4x.A00.intValue()) {
                case 0:
                    str4 = "INSTAGRAM__STORIES__PRECAPTURE__SEARCH_V2";
                    break;
                case 1:
                    str4 = "INSTAGRAM__STORIES__POSTCAPTURE__SEARCH";
                    break;
                case 2:
                    str4 = "INSTAGRAM__LIVE__PRECAPTURE__SEARCH_V2";
                    break;
                case 3:
                    str4 = "INSTAGRAM__REELS__PRECAPTURE__SEARCH_V2";
                    break;
                case 4:
                    str4 = "INSTAGRAM__REELS__POSTCAPTURE__SEARCH_V2";
                    break;
                case 5:
                    str4 = "INSTAGRAM__DIRECT__RTC__SEARCH_V2";
                    break;
                case 6:
                    str4 = "INSTAGRAM__DIRECT__PRECAPTURE__SEARCH_V2";
                    break;
                default:
                    str4 = "INSTAGRAM__DIRECT__POSTCAPTURE__SEARCH_V2";
                    break;
            }
            c2jm.A04("surface", str4);
            c2jm.A00(A01, "device_capabilities");
            c2jm.A03("preview_width", 240);
            c2jm.A03("preview_height", 240);
            c2jm.A00.A02().A0E(A02, "context");
            c2jm.A04("cursor", str3);
            ImmutableList of = ImmutableList.of((Object) "TAR_BROTLI", (Object) "ZIP");
            C14360o3.A07(of);
            c2jm.A05("supported_compression_types", of);
            c2jm.A03("page_size", 24);
            c2jm.A01("formatted_media_count_enabled");
            C907442n c907442n = new C907442n(c2jm, C9Yl.class, "CommonAREffectSearchQuery", false);
            C907542o c907542o = new C907542o(userSession);
            c907542o.A08(c907442n);
            c907542o.A03 = C05F.A00;
            c907542o.A05 = null;
            c907542o.A04 = -1L;
            c15340po = new C15340po(new MC5(c47509Kyc, (InterfaceC23621Ds) null, 7, 42), new M9P(new C16400rl(new MCC(c47509Kyc, null, 13), AbstractC1807880g.A00(new MC5(c22828A4x, null, 6), new C172887n0(new C206629Ct(10, null), c907542o.A06().A04(744, 3))))));
        }
        return new B4B(miniGalleryService, anonymousClass859, str2, str3, c15340po);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.util.AbstractList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A03(com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService r11, X.C191258dU r12, java.lang.String r13, java.util.ArrayList r14, X.InterfaceC23621Ds r15) {
        /*
            r3 = 40
            r4 = r15
            boolean r0 = X.MAN.A02(r15, r3)
            if (r0 == 0) goto L84
            r10 = r4
            X.MAN r10 = (X.MAN) r10
            int r2 = r10.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L84
            int r2 = r2 - r1
            r10.A00 = r2
        L17:
            java.lang.Object r1 = r10.A02
            X.1JX r3 = X.C1JX.A02
            int r0 = r10.A00
            r2 = 0
            r4 = 1
            if (r0 == 0) goto L44
            if (r0 != r4) goto L8a
            java.lang.Object r14 = r10.A01
            java.util.AbstractList r14 = (java.util.AbstractList) r14
            X.AbstractC09560e7.A00(r1)
        L2a:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L3a
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r0 = r1.A00
            r14.add(r2, r0)
        L37:
            X.0eB r3 = X.C0eB.A00
            return r3
        L3a:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto L37
            X.B4Z r1 = new X.B4Z
            r1.<init>()
            throw r1
        L44:
            X.AbstractC09560e7.A00(r1)
            boolean r0 = r14 instanceof java.util.Collection
            r7 = r13
            if (r0 == 0) goto L6b
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L6b
        L52:
            com.instagram.ar.core.effectcollection.EffectCollectionService r5 = r11.A02
            r8 = 0
            X.C14360o3.A0B(r13, r4)
            r0 = 2
            r6 = r12
            X.C14360o3.A0B(r12, r0)
            r10.A01 = r14
            r10.A00 = r4
            r11 = 2
            r9 = r8
            java.lang.Object r1 = com.instagram.ar.core.effectcollection.EffectCollectionService.A03(r5, r6, r7, r8, r9, r10, r11)
            if (r1 != r3) goto L2a
            return r3
        L6b:
            java.util.Iterator r1 = r14.iterator()
        L6f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L52
            java.lang.Object r0 = r1.next()
            com.instagram.camera.effect.models.CameraAREffect r0 = (com.instagram.camera.effect.models.CameraAREffect) r0
            java.lang.String r0 = r0.A0K
            boolean r0 = X.C14360o3.A0K(r0, r13)
            if (r0 == 0) goto L6f
            goto L37
        L84:
            X.MAN r10 = new X.MAN
            r10.<init>(r11, r15, r3)
            goto L17
        L8a:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService.A03(com.instagram.ar.core.discovery.minigallery.services.MiniGalleryService, X.8dU, java.lang.String, java.util.ArrayList, X.1Ds):java.lang.Object");
    }

    public /* synthetic */ MiniGalleryService(Context context, EffectCollectionService effectCollectionService, UserSession userSession) {
        Context applicationContext = context.getApplicationContext();
        C14360o3.A07(applicationContext);
        MiniGalleryCategoriesService miniGalleryCategoriesService = new MiniGalleryCategoriesService(applicationContext, userSession);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(effectCollectionService, 3);
        this.A03 = userSession;
        this.A02 = effectCollectionService;
        this.A01 = miniGalleryCategoriesService;
        this.A00 = "";
    }
}
