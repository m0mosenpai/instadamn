package com.facebook.avatar.expresso.odr.asset;

import X.C12W;
import X.C14360o3;

/* loaded from: classes9.dex */
public final class ODRAssetManager {
    public static final String A01;
    public final C12W A00;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl r7, com.facebook.avatar.expresso.odr.asset.ODRAssetManager r8, java.lang.String r9, X.InterfaceC23621Ds r10, org.json.JSONObject r11, org.json.JSONObject r12) {
        /*
            r4 = 4
            boolean r0 = X.MAP.A02(r10, r4)
            if (r0 == 0) goto L80
            r2 = r10
            X.MAP r2 = (X.MAP) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L80
            int r3 = r3 - r1
            r2.A00 = r3
        L15:
            java.lang.Object r4 = r2.A05
            X.1JX r3 = X.C1JX.A02
            int r5 = r2.A00
            r1 = 2
            r0 = 1
            if (r5 == 0) goto L2f
            if (r5 == r0) goto L3e
            if (r5 != r1) goto L86
            X.AbstractC09560e7.A00(r4)
        L26:
            boolean r0 = X.AbstractC166987dD.A1a(r4)
        L2a:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L2f:
            X.AbstractC09560e7.A00(r4)
            r2.A01 = r8
            X.MAP.A00(r11, r12, r7, r2, r0)
            java.lang.Object r4 = com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl.A02(r7, r9, r2)
            if (r4 != r3) goto L4b
            return r3
        L3e:
            java.lang.Object r7 = r2.A04
            java.lang.Object r12 = r2.A03
            java.lang.Object r11 = r2.A02
            java.lang.Object r8 = r2.A01
            com.facebook.avatar.expresso.odr.asset.ODRAssetManager r8 = (com.facebook.avatar.expresso.odr.asset.ODRAssetManager) r8
            X.AbstractC09560e7.A00(r4)
        L4b:
            java.util.Map r4 = (java.util.Map) r4
            java.lang.String r0 = "scene"
            java.lang.Object r6 = r4.get(r0)
            if (r6 == 0) goto L7e
            org.json.JSONObject r5 = X.AbstractC31171DnF.A0q()
            java.lang.String r0 = "lights"
            r5.put(r0, r11)
            java.lang.String r0 = "camera"
            r5.put(r0, r12)
            X.12W r0 = r8.A00
            r8 = 0
            r9 = 36
            X.PZq r4 = new X.PZq
            r4.<init>(r5, r6, r7, r8, r9)
            r2.A01 = r8
            r2.A02 = r8
            r2.A03 = r8
            r2.A04 = r8
            r2.A00 = r1
            java.lang.Object r4 = X.AbstractC23641Du.A00(r2, r0, r4)
            if (r4 != r3) goto L26
            return r3
        L7e:
            r0 = 0
            goto L2a
        L80:
            X.MAP r2 = new X.MAP
            r2.<init>(r8, r10, r4)
            goto L15
        L86:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.odr.asset.ODRAssetManager.A00(com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl, com.facebook.avatar.expresso.odr.asset.ODRAssetManager, java.lang.String, X.1Ds, org.json.JSONObject, org.json.JSONObject):java.lang.Object");
    }

    static {
        String name = ODRAssetManager.class.getName();
        C14360o3.A07(name);
        A01 = name;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r1 == r6) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl r9, java.lang.String r10, X.InterfaceC23621Ds r11) {
        /*
            r8 = this;
            r3 = 12
            boolean r0 = X.MAO.A02(r11, r3)
            if (r0 == 0) goto L63
            r7 = r11
            X.MAO r7 = (X.MAO) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L63
            int r2 = r2 - r1
            r7.A00 = r2
        L16:
            java.lang.Object r1 = r7.A03
            X.1JX r6 = X.C1JX.A02
            int r2 = r7.A00
            r5 = 2
            r0 = 1
            if (r2 == 0) goto L3a
            if (r2 == r0) goto L2e
            if (r2 != r5) goto L69
            java.lang.Object r10 = r7.A02
            java.lang.String r10 = (java.lang.String) r10
            X.AbstractC09560e7.A00(r1)
        L2b:
            if (r1 == 0) goto L6e
            return r1
        L2e:
            java.lang.Object r10 = r7.A02
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r4 = r7.A01
            com.facebook.avatar.expresso.odr.asset.ODRAssetManager r4 = (com.facebook.avatar.expresso.odr.asset.ODRAssetManager) r4
            X.AbstractC09560e7.A00(r1)
            goto L47
        L3a:
            X.AbstractC09560e7.A00(r1)
            X.MAO.A00(r8, r10, r7, r0)
            java.lang.Object r1 = com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl.A02(r9, r10, r7)
            if (r1 == r6) goto L62
            r4 = r8
        L47:
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r0 = "scene"
            java.lang.Object r3 = r1.get(r0)
            if (r3 == 0) goto L6e
            X.12W r2 = r4.A00
            r1 = 0
            X.MCF r0 = new X.MCF
            r0.<init>(r3, r10, r1, r5)
            X.MAO.A00(r4, r10, r7, r5)
            java.lang.Object r1 = X.AbstractC23641Du.A00(r7, r2, r0)
            if (r1 != r6) goto L2b
        L62:
            return r6
        L63:
            X.MAO r7 = new X.MAO
            r7.<init>(r8, r11, r3)
            goto L16
        L69:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L6e:
            java.lang.String r2 = com.facebook.avatar.expresso.odr.asset.ODRAssetManager.A01
            java.lang.Object[] r1 = new java.lang.Object[]{r10}
            java.lang.String r0 = "Scene path not found for %s"
            X.C0K8.A0O(r2, r0, r1)
            java.lang.String r0 = "Scene path not found for "
            java.io.IOException r0 = X.MSY.A0X(r0, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.odr.asset.ODRAssetManager.A01(com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0131 -> B:13:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl r23, java.util.List r24, java.util.Map r25, X.InterfaceC23621Ds r26, X.InterfaceC16590sC r27) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.odr.asset.ODRAssetManager.A02(com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl, java.util.List, java.util.Map, X.1Ds, X.0sC):java.lang.Object");
    }

    public ODRAssetManager(C12W c12w) {
        this.A00 = c12w;
    }
}
