package com.facebook.avatar.expresso.cache.ig;

import X.AbstractC167017dG;
import X.AnonymousClass139;
import X.C12W;
import android.content.Context;
import java.io.File;

/* loaded from: classes8.dex */
public final class AvatarStickerCacheImpl {
    public final Context A00;
    public final C12W A01;
    public final AnonymousClass139 A02;
    public volatile File A03;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(java.lang.String r6, java.lang.String r7, java.lang.String r8, X.InterfaceC23621Ds r9, int r10) {
        /*
            r5 = this;
            r4 = 1
            boolean r0 = X.MAI.A01(r9, r4)
            if (r0 == 0) goto L68
            r3 = r9
            X.MAI r3 = (X.MAI) r3
            int r2 = r3.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L68
            int r2 = r2 - r1
            r3.A01 = r2
        L15:
            java.lang.Object r2 = r3.A05
            X.1JX r1 = X.C1JX.A02
            int r0 = r3.A01
            if (r0 == 0) goto L54
            if (r0 != r4) goto L6e
            int r10 = r3.A00
            java.lang.Object r8 = r3.A04
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r3.A03
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r3.A02
            java.lang.String r6 = (java.lang.String) r6
            X.AbstractC09560e7.A00(r2)
        L30:
            java.io.File r2 = (java.io.File) r2
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()
            r1.append(r10)
            r0 = 47
            r1.append(r0)
            r1.append(r6)
            r1.append(r0)
            r1.append(r7)
            r1.append(r0)
            java.lang.String r1 = X.AbstractC166997dE.A0x(r8, r1)
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r1)
            return r0
        L54:
            X.AbstractC09560e7.A00(r2)
            r3.A02 = r6
            r3.A03 = r7
            r3.A04 = r8
            r3.A00 = r10
            r3.A01 = r4
            java.lang.Object r2 = r5.A05(r3)
            if (r2 != r1) goto L30
            return r1
        L68:
            X.MAI r3 = new X.MAI
            r3.<init>(r5, r9, r4)
            goto L15
        L6e:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl.A03(java.lang.String, java.lang.String, java.lang.String, X.1Ds, int):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object A00(com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl r8, java.io.File r9, X.InterfaceC23621Ds r10) {
        /*
            r3 = 18
            boolean r0 = X.MAQ.A02(r10, r3)
            if (r0 == 0) goto L22
            r7 = r10
            X.MAQ r7 = (X.MAQ) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r7.A00 = r2
        L16:
            java.lang.Object r1 = r7.A01
            X.1JX r6 = X.C1JX.A02
            int r0 = r7.A00
            r5 = 1
            if (r0 == 0) goto L33
            if (r0 != r5) goto L2e
            goto L2a
        L22:
            r0 = 42
            X.MAQ r7 = new X.MAQ
            r7.<init>(r8, r10, r3, r0)
            goto L16
        L2a:
            X.AbstractC09560e7.A00(r1)     // Catch: java.io.IOException -> L51
            goto L4c
        L2e:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L33:
            X.AbstractC09560e7.A00(r1)
            java.io.File r4 = r9.getParentFile()     // Catch: java.io.IOException -> L51
            X.12W r3 = r8.A01     // Catch: java.io.IOException -> L51
            r2 = 0
            r1 = 7
            X.MBr r0 = new X.MBr     // Catch: java.io.IOException -> L51
            r0.<init>(r9, r4, r2, r1)     // Catch: java.io.IOException -> L51
            r7.A00 = r5     // Catch: java.io.IOException -> L51
            java.lang.Object r0 = X.AbstractC23641Du.A00(r7, r3, r0)     // Catch: java.io.IOException -> L51
            if (r0 != r6) goto L4c
            return r6
        L4c:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            return r6
        L51:
            r2 = move-exception
            java.lang.String r1 = "AvatarStickerAssetCache"
            java.lang.String r0 = "Failed to create cache file"
            X.C0K8.A0F(r1, r0, r2)
            java.lang.Boolean r0 = X.AbstractC166997dE.A0a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl.A00(com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl, java.io.File, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object A01(com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl r7, java.lang.String r8, X.InterfaceC23621Ds r9) {
        /*
            r3 = 19
            boolean r0 = X.MAN.A02(r9, r3)
            if (r0 == 0) goto L4e
            r6 = r9
            X.MAN r6 = (X.MAN) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4e
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r2 = r6.A02
            X.1JX r5 = X.C1JX.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L36
            if (r0 != r4) goto L54
            java.lang.Object r8 = r6.A01
            java.lang.String r8 = (java.lang.String) r8
            X.AbstractC09560e7.A00(r2)
        L28:
            java.io.File r2 = (java.io.File) r2
            java.lang.String r0 = "model/"
            java.lang.String r1 = X.AnonymousClass001.A0R(r0, r8)
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r1)
            return r0
        L36:
            X.AbstractC09560e7.A00(r2)
            X.12W r3 = r7.A01
            r2 = 0
            r1 = 22
            X.MW8 r0 = new X.MW8
            r0.<init>(r7, r2, r1)
            r6.A01 = r8
            r6.A00 = r4
            java.lang.Object r2 = X.AbstractC23641Du.A00(r6, r3, r0)
            if (r2 != r5) goto L28
            return r5
        L4e:
            X.MAN r6 = new X.MAN
            r6.<init>(r7, r9, r3)
            goto L16
        L54:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl.A01(com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object A02(com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl r7, java.lang.String r8, X.InterfaceC23621Ds r9) {
        /*
            r3 = 20
            boolean r0 = X.MAN.A02(r9, r3)
            if (r0 == 0) goto L64
            r6 = r9
            X.MAN r6 = (X.MAN) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L64
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r1 = r6.A02
            X.1JX r5 = X.C1JX.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L4c
            if (r0 != r4) goto L6a
            java.lang.Object r8 = r6.A01
            java.lang.String r8 = (java.lang.String) r8
            X.AbstractC09560e7.A00(r1)
        L28:
            java.io.File r1 = (java.io.File) r1
            java.io.File r3 = new java.io.File
            r3.<init>(r1, r8)
            java.util.HashMap r2 = X.AbstractC166987dD.A1G()
            java.lang.String r0 = "scene.json"
            java.io.File r1 = new java.io.File
            r1.<init>(r3, r0)
            java.lang.String r0 = "scene"
            r2.put(r0, r1)
            java.lang.String r0 = "anim.behavior"
            java.io.File r1 = new java.io.File
            r1.<init>(r3, r0)
            java.lang.String r0 = "anim"
            r2.put(r0, r1)
            return r2
        L4c:
            X.AbstractC09560e7.A00(r1)
            X.12W r3 = r7.A01
            r2 = 0
            r1 = 23
            X.MW8 r0 = new X.MW8
            r0.<init>(r7, r2, r1)
            r6.A01 = r8
            r6.A00 = r4
            java.lang.Object r1 = X.AbstractC23641Du.A00(r6, r3, r0)
            if (r1 != r5) goto L28
            return r5
        L64:
            X.MAN r6 = new X.MAN
            r6.<init>(r7, r9, r3)
            goto L16
        L6a:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl.A02(com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(java.lang.String r11, java.lang.String r12, java.lang.String r13, X.InterfaceC23621Ds r14, int r15) {
        /*
            r10 = this;
            r3 = 17
            boolean r0 = X.MAQ.A02(r14, r3)
            r4 = r10
            if (r0 == 0) goto L3f
            r8 = r14
            X.MAQ r8 = (X.MAQ) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3f
            int r2 = r2 - r1
            r8.A00 = r2
        L17:
            java.lang.Object r3 = r8.A01
            X.1JX r2 = X.C1JX.A02
            int r1 = r8.A00
            r0 = 1
            if (r1 == 0) goto L2f
            if (r1 != r0) goto L47
            X.AbstractC09560e7.A00(r3)
        L25:
            java.io.File r3 = (java.io.File) r3
            java.lang.String r1 = "sticker.webp"
            java.io.File r0 = new java.io.File
            r0.<init>(r3, r1)
            return r0
        L2f:
            X.AbstractC09560e7.A00(r3)
            r8.A00 = r0
            r5 = r11
            r6 = r12
            r7 = r13
            r9 = r15
            java.lang.Object r3 = r4.A03(r5, r6, r7, r8, r9)
            if (r3 != r2) goto L25
            return r2
        L3f:
            r0 = 42
            X.MAQ r8 = new X.MAQ
            r8.<init>(r10, r14, r3, r0)
            goto L17
        L47:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl.A04(java.lang.String, java.lang.String, java.lang.String, X.1Ds, int):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0058 A[Catch: all -> 0x0073, TryCatch #1 {all -> 0x0073, blocks: (B:25:0x0054, B:27:0x0058), top: B:24:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A05(X.InterfaceC23621Ds r10) {
        /*
            r9 = this;
            r3 = 10
            boolean r0 = X.MAO.A02(r10, r3)
            if (r0 == 0) goto L2a
            r8 = r10
            X.MAO r8 = (X.MAO) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2a
            int r2 = r2 - r1
            r8.A00 = r2
        L16:
            java.lang.Object r0 = r8.A03
            X.1JX r7 = X.C1JX.A02
            int r2 = r8.A00
            r6 = 2
            r1 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r1) goto L35
            if (r2 != r6) goto L30
            java.lang.Object r4 = r8.A01
            X.139 r4 = (X.AnonymousClass139) r4
            goto L6b
        L2a:
            X.MAO r8 = new X.MAO
            r8.<init>(r9, r10, r3)
            goto L16
        L30:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L35:
            java.lang.Object r4 = r8.A02
            X.139 r4 = (X.AnonymousClass139) r4
            java.lang.Object r3 = r8.A01
            com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl r3 = (com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl) r3
            X.AbstractC09560e7.A00(r0)
            goto L54
        L41:
            X.AbstractC09560e7.A00(r0)
            java.io.File r0 = r9.A03
            if (r0 != 0) goto L7c
            X.139 r4 = r9.A02
            X.MAO.A00(r9, r4, r8, r1)
            java.lang.Object r0 = X.AnonymousClass139.A00(r8, r4)
            if (r0 == r7) goto L78
            r3 = r9
        L54:
            java.io.File r0 = r3.A03     // Catch: java.lang.Throwable -> L73
            if (r0 != 0) goto L79
            X.12W r2 = r3.A01     // Catch: java.lang.Throwable -> L73
            r1 = 21
            X.MW8 r0 = new X.MW8     // Catch: java.lang.Throwable -> L73
            r0.<init>(r3, r5, r1)     // Catch: java.lang.Throwable -> L73
            X.MAO.A00(r4, r5, r8, r6)     // Catch: java.lang.Throwable -> L73
            java.lang.Object r0 = X.AbstractC23641Du.A00(r8, r2, r0)     // Catch: java.lang.Throwable -> L73
            if (r0 != r7) goto L6e
            return r7
        L6b:
            X.AbstractC09560e7.A00(r0)     // Catch: java.lang.Throwable -> L71
        L6e:
            java.io.File r0 = (java.io.File) r0     // Catch: java.lang.Throwable -> L71
            goto L79
        L71:
            r0 = move-exception
            goto L74
        L73:
            r0 = move-exception
        L74:
            r4.A04(r5)
            throw r0
        L78:
            return r7
        L79:
            r4.A04(r5)
        L7c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.cache.ig.AvatarStickerCacheImpl.A05(X.1Ds):java.lang.Object");
    }

    public AvatarStickerCacheImpl(Context context, C12W c12w) {
        AbstractC167017dG.A1P(context, c12w);
        this.A00 = context;
        this.A01 = c12w;
        this.A02 = new AnonymousClass139();
    }
}
