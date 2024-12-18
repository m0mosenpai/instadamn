package com.facebook.avatar.expresso.odr;

import X.AbstractC09440dt;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25225BEi;
import X.AnonymousClass057;
import X.C06090Tz;
import X.C12W;
import X.C14360o3;
import X.C18U;
import X.C47815L9x;
import X.C51463MoA;
import X.C54501O6e;
import X.C55143Od2;
import X.C55641OnQ;
import X.C57290PcC;
import X.C65075Td4;
import X.EnumC09460dv;
import X.InterfaceC06180Ui;
import X.InterfaceC09390do;
import X.InterfaceC15070pN;
import X.InterfaceC16660sJ;
import X.InterfaceC58015Pnz;
import X.MSW;
import X.MSX;
import X.MSY;
import android.content.Context;
import com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl;
import com.facebook.avatar.expresso.odr.asset.ODRAssetManager;
import com.facebook.avatar.expresso.webp.WebPEncoderImpl;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public final class ODRController {
    public static final AtomicInteger A0H = MSW.A1C(0);
    public InterfaceC58015Pnz A00;
    public C51463MoA A01;
    public C55641OnQ A02;
    public C55143Od2 A03;
    public final Context A04;
    public final AvatarStickerCacheImpl A05;
    public final C54501O6e A06;
    public final ODRAssetManager A07;
    public final QuickPerformanceLogger A08;
    public final UserSession A09;
    public final Map A0A;
    public final Map A0B;
    public final InterfaceC09390do A0C;
    public final C12W A0D;
    public final InterfaceC16660sJ A0E;
    public final InterfaceC06180Ui A0F;
    public final InterfaceC15070pN A0G;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (((X.PWk) r20).A0D != 0) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.facebook.avatar.expresso.odr.ODRController r15, X.C51456Mo2 r16, X.C51462Mo9 r17, X.C51463MoA r18, java.io.File r19, X.InterfaceC23621Ds r20) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.odr.ODRController.A01(com.facebook.avatar.expresso.odr.ODRController, X.Mo2, X.Mo9, X.MoA, java.io.File, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A03(com.facebook.avatar.expresso.odr.ODRController r8, X.C54836OLv r9, java.io.File r10, java.lang.String r11, java.lang.String r12, X.InterfaceC23621Ds r13) {
        /*
            r3 = 3
            boolean r0 = X.MAP.A02(r13, r3)
            if (r0 == 0) goto Lb1
            r6 = r13
            X.MAP r6 = (X.MAP) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb1
            int r2 = r2 - r1
            r6.A00 = r2
        L15:
            java.lang.Object r1 = r6.A05
            X.1JX r4 = X.C1JX.A02
            int r0 = r6.A00
            r7 = 2
            r5 = 1
            if (r0 == 0) goto L3b
            if (r0 == r5) goto L53
            if (r0 != r7) goto Lb8
            java.lang.Object r12 = r6.A01
            java.lang.String r12 = (java.lang.String) r12
            X.AbstractC09560e7.A00(r1)
        L2a:
            java.lang.String r1 = "ODRController"
            java.lang.String r0 = "Failed to download animation asset for template id "
            java.lang.String r0 = X.AnonymousClass001.A0R(r0, r12)
            X.C0K8.A0C(r1, r0)
            r5 = 0
        L36:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r5)
            return r4
        L3b:
            X.AbstractC09560e7.A00(r1)
            X.12W r0 = r8.A0D
            com.facebook.avatar.expresso.odr.network.ODRNetworkDownloader r1 = new com.facebook.avatar.expresso.odr.network.ODRNetworkDownloader
            r1.<init>(r0)
            com.instagram.common.session.UserSession r0 = r8.A09
            r6.A01 = r8
            X.MAP.A00(r10, r12, r9, r6, r5)
            java.lang.Object r1 = r1.A00(r0, r10, r11, r6)
            if (r1 != r4) goto L66
            return r4
        L53:
            java.lang.Object r9 = r6.A04
            X.OLv r9 = (X.C54836OLv) r9
            java.lang.Object r12 = r6.A03
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r10 = r6.A02
            java.io.File r10 = (java.io.File) r10
            java.lang.Object r8 = r6.A01
            com.facebook.avatar.expresso.odr.ODRController r8 = (com.facebook.avatar.expresso.odr.ODRController) r8
            X.AbstractC09560e7.A00(r1)
        L66:
            boolean r0 = X.AbstractC166987dD.A1a(r1)
            if (r0 == 0) goto L94
            java.util.Map r4 = r8.A0A
            org.json.JSONObject r3 = X.AbstractC31171DnF.A0q()
            java.lang.String r2 = "lights"
            r0 = 0
            if (r9 == 0) goto L92
            org.json.JSONObject r1 = r9.A05
        L79:
            r3.put(r2, r1)
            java.lang.String r1 = "camera"
            if (r9 == 0) goto L82
            org.json.JSONObject r0 = r9.A04
        L82:
            r3.put(r1, r0)
            java.lang.String r1 = X.MSX.A0h(r10)
            X.OWr r0 = new X.OWr
            r0.<init>(r1, r3)
            r4.put(r12, r0)
            goto L36
        L92:
            r1 = r0
            goto L79
        L94:
            X.0Ui r3 = r8.A0F
            java.lang.Integer r2 = X.C05F.A0N
            java.lang.String r0 = "Template info asset download failure"
            X.Mo0 r1 = new X.Mo0
            r1.<init>(r0, r2)
            r6.A01 = r12
            r0 = 0
            r6.A02 = r0
            r6.A03 = r0
            r6.A04 = r0
            r6.A00 = r7
            java.lang.Object r0 = r3.emit(r1, r6)
            if (r0 != r4) goto L2a
            return r4
        Lb1:
            X.MAP r6 = new X.MAP
            r6.<init>(r8, r13, r3)
            goto L15
        Lb8:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.odr.ODRController.A03(com.facebook.avatar.expresso.odr.ODRController, X.OLv, java.io.File, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    public /* synthetic */ ODRController(Context context, QuickPerformanceLogger quickPerformanceLogger, UserSession userSession, C12W c12w) {
        AvatarStickerCacheImpl avatarStickerCacheImpl = new AvatarStickerCacheImpl(context, c12w);
        C65075Td4 c65075Td4 = new C65075Td4(c12w, 3);
        AbstractC167017dG.A1P(context, userSession);
        C14360o3.A0B(quickPerformanceLogger, 3);
        this.A04 = context;
        this.A09 = userSession;
        this.A08 = quickPerformanceLogger;
        this.A0D = c12w;
        this.A05 = avatarStickerCacheImpl;
        this.A0E = c65075Td4;
        AnonymousClass057 A0t = MSY.A0t();
        this.A0F = A0t;
        this.A0G = MSX.A0r(A0t);
        this.A0A = AbstractC166987dD.A1I();
        this.A0B = AbstractC166987dD.A1I();
        this.A07 = new ODRAssetManager(c12w);
        this.A06 = new C54501O6e(userSession);
        this.A0C = AbstractC09440dt.A00(EnumC09460dv.A03, C57290PcC.A00);
    }

    private final C47815L9x A00(File file, float f, int i, int i2, int i3) {
        QuickPerformanceLogger quickPerformanceLogger = this.A08;
        WebPEncoderImpl webPEncoderImpl = (WebPEncoderImpl) this.A0E.invoke(Float.valueOf(f));
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(i2);
        UserSession userSession = this.A09;
        C06090Tz c06090Tz = C06090Tz.A05;
        return new C47815L9x(webPEncoderImpl, quickPerformanceLogger, file, valueOf, valueOf2, i3, AbstractC25225BEi.A07(c06090Tz, userSession, 36605868825253220L), AbstractC25225BEi.A07(c06090Tz, userSession, 36605868825384294L), AbstractC25225BEi.A07(c06090Tz, userSession, 36605868825711976L), C18U.A06(C06090Tz.A06, userSession, 36324393848811666L));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(com.facebook.avatar.expresso.odr.ODRController r22, X.C51456Mo2 r23, X.C51462Mo9 r24, X.C51463MoA r25, java.lang.String r26, X.InterfaceC23621Ds r27, X.C19L r28) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.odr.ODRController.A02(com.facebook.avatar.expresso.odr.ODRController, X.Mo2, X.Mo9, X.MoA, java.lang.String, X.1Ds, X.19L):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A04(com.facebook.avatar.expresso.odr.ODRController r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, X.InterfaceC23621Ds r12, int r13) {
        /*
            r3 = 20
            boolean r0 = X.MAQ.A02(r12, r3)
            if (r0 == 0) goto L22
            r7 = r12
            X.MAQ r7 = (X.MAQ) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r7.A00 = r2
        L16:
            java.lang.Object r3 = r7.A01
            X.1JX r2 = X.C1JX.A02
            int r1 = r7.A00
            r0 = 1
            if (r1 == 0) goto L33
            if (r1 != r0) goto L2e
            goto L2a
        L22:
            r0 = 42
            X.MAQ r7 = new X.MAQ
            r7.<init>(r8, r12, r3, r0)
            goto L16
        L2a:
            X.AbstractC09560e7.A00(r3)     // Catch: java.lang.NullPointerException -> L46
            return r3
        L2e:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L33:
            X.AbstractC09560e7.A00(r3)
            com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl r3 = r8.A05     // Catch: java.lang.NullPointerException -> L46
            r7.A00 = r0     // Catch: java.lang.NullPointerException -> L46
            r4 = r9
            r5 = r10
            r6 = r11
            r8 = r13
            java.lang.Object r3 = r3.A04(r4, r5, r6, r7, r8)     // Catch: java.lang.NullPointerException -> L46
            if (r3 != r2) goto L45
            return r2
        L45:
            return r3
        L46:
            java.lang.String r4 = "ODRController"
            java.lang.String r3 = "File place holder name is null"
            X.C0K8.A0C(r4, r3)
            java.lang.String r2 = "cache"
            X.0wb r1 = X.C18950wb.A01
            r0 = 603982406(0x24000a46, float:2.7764278E-17)
            X.0f5 r0 = r1.AEp(r4, r0)
            r0.ABW(r2, r3)
            r0.report()
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.odr.ODRController.A04(com.facebook.avatar.expresso.odr.ODRController, java.lang.String, java.lang.String, java.lang.String, X.1Ds, int):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A05(com.facebook.avatar.expresso.odr.ODRController r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, X.InterfaceC23621Ds r12, int r13) {
        /*
            r3 = 10
            r4 = r12
            boolean r0 = X.MAL.A01(r12, r3)
            if (r0 == 0) goto La7
            r12 = r4
            X.MAL r12 = (X.MAL) r12
            int r2 = r12.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La7
            int r2 = r2 - r1
            r12.A00 = r2
        L17:
            java.lang.Object r3 = r12.A04
            X.1JX r7 = X.C1JX.A02
            int r1 = r12.A00
            r6 = 3
            r0 = 2
            r5 = 1
            if (r1 == 0) goto L52
            if (r1 == r5) goto L62
            if (r1 == r0) goto L84
            if (r1 != r6) goto Lae
            X.AbstractC09560e7.A00(r3)
        L2b:
            boolean r0 = X.AbstractC166987dD.A1a(r3)
            if (r0 != 0) goto Lb4
            java.lang.String r4 = "ODRController"
            java.lang.String r3 = "cache"
            java.lang.String r2 = "Error in creating cache file"
            X.0wb r1 = X.C18950wb.A01
            r0 = 603982406(0x24000a46, float:2.7764278E-17)
            X.0f5 r0 = r1.AEp(r4, r0)
            r0.ABW(r3, r2)
            r0.report()
            java.lang.String r0 = "unable to create cache file"
            X.C0K8.A0C(r4, r0)
            java.lang.String r0 = "Unable to create cache file"
            java.io.IOException r0 = X.MSW.A0y(r0)
            throw r0
        L52:
            X.AbstractC09560e7.A00(r3)
            r12.A01 = r8
            r12.A02 = r10
            r12.A00 = r5
            java.lang.Object r3 = A04(r8, r9, r10, r11, r12, r13)
            if (r3 != r7) goto L6b
            return r7
        L62:
            java.lang.Object r10 = r12.A02
            java.lang.Object r8 = r12.A01
            com.facebook.avatar.expresso.odr.ODRController r8 = (com.facebook.avatar.expresso.odr.ODRController) r8
            X.AbstractC09560e7.A00(r3)
        L6b:
            r2 = r3
            java.io.File r2 = (java.io.File) r2
            if (r2 == 0) goto Lb3
            X.AbstractC25235BEs.A1J(r8, r10, r2, r12, r0)
            X.12W r4 = r8.A0D
            r3 = 0
            r1 = 26
            X.MW8 r0 = new X.MW8
            r0.<init>(r2, r3, r1)
            java.lang.Object r3 = X.AbstractC23641Du.A00(r12, r4, r0)
            if (r3 != r7) goto L8f
            return r7
        L84:
            java.lang.Object r2 = r12.A03
            java.io.File r2 = (java.io.File) r2
            java.lang.Object r8 = r12.A01
            com.facebook.avatar.expresso.odr.ODRController r8 = (com.facebook.avatar.expresso.odr.ODRController) r8
            X.AbstractC09560e7.A00(r3)
        L8f:
            boolean r0 = X.AbstractC166987dD.A1a(r3)
            if (r0 != 0) goto Lb3
            com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl r1 = r8.A05
            r0 = 0
            r12.A01 = r0
            r12.A02 = r0
            r12.A03 = r0
            r12.A00 = r6
            java.lang.Object r3 = com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl.A00(r1, r2, r12)
            if (r3 != r7) goto L2b
            return r7
        La7:
            X.MAL r12 = new X.MAL
            r12.<init>(r8, r4, r3)
            goto L17
        Lae:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        Lb3:
            r5 = 0
        Lb4:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.odr.ODRController.A05(com.facebook.avatar.expresso.odr.ODRController, java.lang.String, java.lang.String, java.lang.String, X.1Ds, int):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A06(com.facebook.avatar.expresso.odr.ODRController r8, java.lang.String r9, java.util.Map r10, X.InterfaceC23621Ds r11) {
        /*
            r3 = 19
            boolean r0 = X.MAQ.A02(r11, r3)
            if (r0 == 0) goto L4b
            r7 = r11
            X.MAQ r7 = (X.MAQ) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4b
            int r2 = r2 - r1
            r7.A00 = r2
        L16:
            java.lang.Object r0 = r7.A01
            X.1JX r6 = X.C1JX.A02
            int r1 = r7.A00
            r5 = 1
            if (r1 == 0) goto L2d
            if (r1 != r5) goto L53
            X.AbstractC09560e7.A00(r0)
        L24:
            boolean r0 = X.AbstractC166987dD.A1a(r0)
        L28:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            return r6
        L2d:
            X.AbstractC09560e7.A00(r0)
            java.lang.Object r4 = r10.get(r9)
            if (r4 == 0) goto L49
            X.12W r3 = r8.A0D
            r2 = 0
            r1 = 25
            X.MW8 r0 = new X.MW8
            r0.<init>(r4, r2, r1)
            r7.A00 = r5
            java.lang.Object r0 = X.AbstractC23641Du.A00(r7, r3, r0)
            if (r0 != r6) goto L24
            return r6
        L49:
            r0 = 0
            goto L28
        L4b:
            r0 = 42
            X.MAQ r7 = new X.MAQ
            r7.<init>(r8, r11, r3, r0)
            goto L16
        L53:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.odr.ODRController.A06(com.facebook.avatar.expresso.odr.ODRController, java.lang.String, java.util.Map, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A07(com.facebook.avatar.expresso.odr.ODRController r6, java.util.Map r7, X.InterfaceC23621Ds r8) {
        /*
            r3 = 11
            boolean r0 = X.MAO.A02(r8, r3)
            if (r0 == 0) goto L58
            r5 = r8
            X.MAO r5 = (X.MAO) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L58
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r4 = r5.A03
            X.1JX r3 = X.C1JX.A02
            int r2 = r5.A00
            r1 = 2
            r0 = 1
            if (r2 == 0) goto L28
            if (r2 == r0) goto L37
            if (r2 != r1) goto L5e
            X.AbstractC09560e7.A00(r4)
        L27:
            return r4
        L28:
            X.AbstractC09560e7.A00(r4)
            X.MAO.A00(r6, r7, r5, r0)
            java.lang.String r0 = "scene"
            java.lang.Object r4 = A06(r6, r0, r7, r5)
            if (r4 != r3) goto L42
            return r3
        L37:
            java.lang.Object r7 = r5.A02
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Object r6 = r5.A01
            com.facebook.avatar.expresso.odr.ODRController r6 = (com.facebook.avatar.expresso.odr.ODRController) r6
            X.AbstractC09560e7.A00(r4)
        L42:
            boolean r0 = X.AbstractC166987dD.A1a(r4)
            if (r0 == 0) goto L63
            r0 = 0
            r5.A01 = r0
            r5.A02 = r0
            r5.A00 = r1
            java.lang.String r0 = "anim"
            java.lang.Object r4 = A06(r6, r0, r7, r5)
            if (r4 != r3) goto L27
            return r3
        L58:
            X.MAO r5 = new X.MAO
            r5.<init>(r6, r8, r3)
            goto L16
        L5e:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L63:
            java.lang.Boolean r3 = X.AbstractC166997dE.A0a()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.odr.ODRController.A07(com.facebook.avatar.expresso.odr.ODRController, java.util.Map, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c1, code lost:
    
        if (r15 == r9) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011f A[Catch: FileNotFoundException | IOException -> 0x013e, TryCatch #0 {FileNotFoundException | IOException -> 0x013e, blocks: (B:21:0x010e, B:22:0x0111, B:24:0x011f, B:40:0x00f9, B:49:0x0139, B:50:0x013d), top: B:20:0x010e }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0139 A[Catch: FileNotFoundException | IOException -> 0x013e, TryCatch #0 {FileNotFoundException | IOException -> 0x013e, blocks: (B:21:0x010e, B:22:0x0111, B:24:0x011f, B:40:0x00f9, B:49:0x0139, B:50:0x013d), top: B:20:0x010e }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r15v5, types: [com.facebook.avatar.expresso.odr.asset.ODRAssetManager] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0097 -> B:26:0x00a3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00f7 -> B:25:0x013e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x010b -> B:22:0x0111). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A08(com.facebook.avatar.expresso.odr.ODRController r17, java.util.Map r18, X.InterfaceC23621Ds r19) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.odr.ODRController.A08(com.facebook.avatar.expresso.odr.ODRController, java.util.Map, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(4:5|6|7|8))|99|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0270, code lost:
    
        if (r0 == r4) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x023b, code lost:
    
        r2 = e;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x002a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0129 A[Catch: IOException -> 0x023b, TryCatch #2 {IOException -> 0x023b, blocks: (B:34:0x0123, B:36:0x0129, B:38:0x012d, B:39:0x012f, B:43:0x0172, B:45:0x0178, B:47:0x0182, B:49:0x0186, B:50:0x0188, B:54:0x0226, B:56:0x01a7, B:57:0x01ab, B:71:0x014e, B:72:0x0152, B:84:0x016f), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0178 A[Catch: IOException -> 0x023b, TryCatch #2 {IOException -> 0x023b, blocks: (B:34:0x0123, B:36:0x0129, B:38:0x012d, B:39:0x012f, B:43:0x0172, B:45:0x0178, B:47:0x0182, B:49:0x0186, B:50:0x0188, B:54:0x0226, B:56:0x01a7, B:57:0x01ab, B:71:0x014e, B:72:0x0152, B:84:0x016f), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014e A[Catch: IOException -> 0x023b, TryCatch #2 {IOException -> 0x023b, blocks: (B:34:0x0123, B:36:0x0129, B:38:0x012d, B:39:0x012f, B:43:0x0172, B:45:0x0178, B:47:0x0182, B:49:0x0186, B:50:0x0188, B:54:0x0226, B:56:0x01a7, B:57:0x01ab, B:71:0x014e, B:72:0x0152, B:84:0x016f), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Type inference failed for: r2v23, types: [com.facebook.avatar.expresso.odr.network.ExpressoTemplatePackAndUserInfo, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A09(X.C47953LGn r23, X.InterfaceC23621Ds r24, X.C19L r25) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.odr.ODRController.A09(X.LGn, X.1Ds, X.19L):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02ae, code lost:
    
        throw X.AbstractC166987dD.A14("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0224, code lost:
    
        r0 = r0.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0226, code lost:
    
        if (r0 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0228, code lost:
    
        r20 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0218, code lost:
    
        r14 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x021a, code lost:
    
        if (r0 == null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0264, code lost:
    
        r0 = new X.C55143Od2(r4, r3.A00(r8, r6, r0, r0, r7), new X.C50526MSf(3, 0, false), r11);
        r3.A03 = r0;
        r0.A06(r13, r4);
        r0 = r3.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0286, code lost:
    
        if (r0 == null) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0288, code lost:
    
        r0 = r0.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x028a, code lost:
    
        if (r0 == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x028c, code lost:
    
        r0.A02();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x028f, code lost:
    
        r1 = r3.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0291, code lost:
    
        if (r1 == null) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0293, code lost:
    
        r1.A05(r4, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02bb, code lost:
    
        throw X.AbstractC166987dD.A14("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01db, code lost:
    
        r0 = X.AbstractC43592JPx.A0r(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0111, code lost:
    
        r15 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0113, code lost:
    
        if (r2 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0103, code lost:
    
        r0 = r2.A02;
        r16 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0107, code lost:
    
        if (r0 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x00f7, code lost:
    
        if (r2 != null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f3, code lost:
    
        if (r0 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f9, code lost:
    
        r0 = r2.A04;
        r17 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00fd, code lost:
    
        if (r0 != null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ff, code lost:
    
        r17 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0101, code lost:
    
        if (r2 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0109, code lost:
    
        r16 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x010b, code lost:
    
        if (r2 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x010d, code lost:
    
        r15 = r2.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x010f, code lost:
    
        if (r15 != null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0115, code lost:
    
        r0 = r2.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0117, code lost:
    
        if (r0 != null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0119, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x011b, code lost:
    
        r19 = new X.C51456Mo2(r25, r12, r6, r18, r17, r16, r15, r0, r7, r0, r0, r21);
        r9.A02 = null;
        r9.A03 = null;
        r9.A04 = null;
        r9.A05 = null;
        r9.A06 = null;
        r9.A07 = null;
        r9.A08 = null;
        r9.A00 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0148, code lost:
    
        if (r4 == null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0150, code lost:
    
        if (((X.C54836OLv) r4.get(r12)) == null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0152, code lost:
    
        r0 = X.AbstractC25225BEi.A10(r0.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0159, code lost:
    
        r6 = 1.0f / X.AbstractC166987dD.A09(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0162, code lost:
    
        if (r3.A03 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0164, code lost:
    
        r4 = r3.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0166, code lost:
    
        if (r4 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0168, code lost:
    
        r1 = r13.get(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x016c, code lost:
    
        if (r1 == null) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x016e, code lost:
    
        r4.FCL((X.C55018OWr) r1, r19, r6);
        r5 = (com.facebook.avatar.expresso.webp.WebPEncoderImpl) r3.A0E.invoke(X.AbstractC25225BEi.A10(r6));
        r2 = r3.A03;
        r4 = "ig4aAvatarRichMediaViewerProvider";
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0185, code lost:
    
        if (r2 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0187, code lost:
    
        X.C14360o3.A0B(r5, 2);
        r1 = r2.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x018e, code lost:
    
        if (r1 != null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0190, code lost:
    
        r4 = "odrSnapshotHelper";
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x019a, code lost:
    
        r1.A03 = r8;
        r1.A01 = r7;
        r1.A02 = r5;
        r1.A05 = java.lang.Integer.valueOf(r0);
        r1.A04 = java.lang.Integer.valueOf(r0);
        r1.A00 = 0;
        r2 = r2.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01b0, code lost:
    
        if (r2 != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01b2, code lost:
    
        r4 = "richMediaViewerAr3d";
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01b7, code lost:
    
        if (r2.A04 == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01bd, code lost:
    
        if (r0 != r2.A02) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01c3, code lost:
    
        if (r0 != r2.A01) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01cf, code lost:
    
        r2.A02 = r0;
        r2.A01 = r0;
        X.AKN.A01(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01c5, code lost:
    
        r0 = r3.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01c7, code lost:
    
        if (r0 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01c9, code lost:
    
        r1 = r0.A03(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0261, code lost:
    
        if (r1 != r23) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0263, code lost:
    
        return r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0192, code lost:
    
        X.C14360o3.A0F(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0199, code lost:
    
        throw X.C00O.createAndThrow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02a9, code lost:
    
        throw X.AbstractC166987dD.A14("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01e8, code lost:
    
        r4 = r3.A04;
        r0 = r5.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ee, code lost:
    
        if (r0 == null) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01f0, code lost:
    
        X.C14360o3.A0B(r11, 1);
        r13 = r3.A09;
        r15 = X.C18U.A06(X.C06090Tz.A05, r13, 36324393848942740L);
        r3.A08.markerAnnotate(603995461, "ale_enabled", r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x020e, code lost:
    
        if (r15 == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0210, code lost:
    
        r0 = r3.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0212, code lost:
    
        if (r0 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0214, code lost:
    
        r14 = r0.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0216, code lost:
    
        if (r14 != null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x021c, code lost:
    
        r1 = r0.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x021e, code lost:
    
        if (r1 != null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0220, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0222, code lost:
    
        if (r0 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x022a, code lost:
    
        r0 = new X.C55641OnQ(new X.C54774OIn(r4, r14, r1, r20), r3.A00(r8, r6, r0, r0, r7), r13, r11);
        r3.A02 = r0;
        r0 = r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x024a, code lost:
    
        if (r0 == null) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x024c, code lost:
    
        r3.A03 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x024e, code lost:
    
        r0 = r3.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0250, code lost:
    
        if (r0 == null) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0252, code lost:
    
        r3.A03 = r0;
        r1 = A02(r3, r19, r2, r5, r12, r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02af, code lost:
    
        X.C14360o3.A0F("ig4aAvatarRichMediaViewerProvider");
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02b6, code lost:
    
        throw X.C00O.createAndThrow();
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0A(X.C51461Mo8 r38, X.C51463MoA r39, java.lang.String r40, java.lang.String r41, java.util.Map r42, X.InterfaceC23621Ds r43, X.C19L r44) {
        /*
            Method dump skipped, instructions count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.odr.ODRController.A0A(X.Mo8, X.MoA, java.lang.String, java.lang.String, java.util.Map, X.1Ds, X.19L):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|(1:(1:(1:(2:12|13)(2:86|87))(4:88|89|33|(16:35|(1:37)(1:76)|38|(1:75)(1:42)|(1:74)(1:47)|48|49|(1:51)|73|(1:54)|72|(1:71)|(1:70)|(1:69)|65|(2:67|68))(1:77)))(4:90|91|30|(3:32|33|(0)(0))(1:78)))(4:92|(2:94|(2:96|(1:98)))|84|85)|14|(4:16|17|18|(2:82|83)(2:20|(2:80|81)(6:22|(1:24)(1:79)|25|(2:27|28)|30|(0)(0))))|84|85))|100|6|7|(0)(0)|14|(0)|84|85) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0158, code lost:
    
        if (r1 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0162, code lost:
    
        if (r1 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ba, code lost:
    
        X.C0K8.A0C("ODRController", "File place holder name is null");
        r0 = X.C18950wb.A01.AEp("ODRController", 603982406);
        r0.ABW("cache", "File place holder name is null in render");
        r0.report();
        r4 = r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0108 A[Catch: NullPointerException -> 0x01ba, TryCatch #0 {NullPointerException -> 0x01ba, blocks: (B:13:0x0047, B:17:0x00b4, B:20:0x00bc, B:22:0x00c2, B:24:0x00c6, B:25:0x00c8, B:30:0x00e5, B:33:0x0102, B:35:0x0108, B:37:0x010f, B:38:0x0115, B:40:0x0119, B:42:0x0121, B:45:0x0130, B:47:0x0138, B:48:0x013c, B:51:0x0154, B:54:0x015e, B:57:0x0168, B:60:0x0170, B:63:0x0178, B:65:0x017e, B:77:0x01ab, B:80:0x01b0, B:81:0x01b4, B:82:0x01b5, B:83:0x01b9, B:89:0x00ff, B:91:0x00e2), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ab A[Catch: NullPointerException -> 0x01ba, TryCatch #0 {NullPointerException -> 0x01ba, blocks: (B:13:0x0047, B:17:0x00b4, B:20:0x00bc, B:22:0x00c2, B:24:0x00c6, B:25:0x00c8, B:30:0x00e5, B:33:0x0102, B:35:0x0108, B:37:0x010f, B:38:0x0115, B:40:0x0119, B:42:0x0121, B:45:0x0130, B:47:0x0138, B:48:0x013c, B:51:0x0154, B:54:0x015e, B:57:0x0168, B:60:0x0170, B:63:0x0178, B:65:0x017e, B:77:0x01ab, B:80:0x01b0, B:81:0x01b4, B:82:0x01b5, B:83:0x01b9, B:89:0x00ff, B:91:0x00e2), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.Iterator, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x01a8 -> B:14:0x00a8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x01ab -> B:14:0x00a8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0B(java.lang.String r35, X.InterfaceC23621Ds r36) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.odr.ODRController.A0B(java.lang.String, X.1Ds):java.lang.Object");
    }
}
