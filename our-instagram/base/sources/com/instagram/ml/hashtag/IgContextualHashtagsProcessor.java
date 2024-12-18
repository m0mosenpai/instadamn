package com.instagram.ml.hashtag;

import X.C0Cs;
import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class IgContextualHashtagsProcessor {
    public final C0Cs A00 = new C0Cs(TimeUnit.MINUTES, 1000);
    public final Context A01;
    public final UserSession A02;

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|(1:(2:10|11)(2:22|23))(2:24|(3:(1:27)|16|17)(2:28|(1:30)(1:31)))|12|(2:14|(1:19))(1:(1:21))|16|17))|34|6|7|(0)(0)|12|(0)(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008f, code lost:
    
        if (r9 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
    
        r9.DWa(X.C16930sl.A00, false);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0074 A[Catch: Exception -> 0x008f, TryCatch #0 {Exception -> 0x008f, blocks: (B:11:0x006b, B:12:0x006e, B:14:0x0074, B:19:0x007f, B:21:0x0089, B:28:0x004e), top: B:7:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.MP9 r9, java.lang.String r10, X.InterfaceC23621Ds r11) {
        /*
            r8 = this;
            r3 = 7
            boolean r0 = X.PX6.A02(r11, r3)
            if (r0 == 0) goto L2c
            r7 = r11
            X.PX6 r7 = (X.PX6) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2c
            int r2 = r2 - r1
            r7.A00 = r2
        L15:
            java.lang.Object r1 = r7.A04
            X.1JX r6 = X.C1JX.A02
            int r0 = r7.A00
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L37
            if (r0 != r5) goto L32
            java.lang.Object r9 = r7.A03
            X.MP9 r9 = (X.MP9) r9
            java.lang.Object r10 = r7.A02
            java.lang.Object r2 = r7.A01
            com.instagram.ml.hashtag.IgContextualHashtagsProcessor r2 = (com.instagram.ml.hashtag.IgContextualHashtagsProcessor) r2
            goto L6b
        L2c:
            X.PX6 r7 = new X.PX6
            r7.<init>(r8, r11, r3)
            goto L15
        L32:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L37:
            X.AbstractC09560e7.A00(r1)
            X.0Cs r0 = r8.A00
            java.lang.Object r0 = r0.A00(r10)
            if (r0 == 0) goto L4e
            if (r9 == 0) goto L4b
            java.util.List r0 = X.AbstractC166987dD.A1J(r0)
            r9.DWa(r0, r5)
        L4b:
            X.0eB r6 = X.C0eB.A00
        L4d:
            return r6
        L4e:
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFile(r10)     // Catch: java.lang.Exception -> L8f
            com.aiplatform.tools.upload.ig.ImageUploadTool r2 = com.aiplatform.tools.upload.ig.ImageUploadTool.A00     // Catch: java.lang.Exception -> L8f
            X.C14360o3.A0A(r3)     // Catch: java.lang.Exception -> L8f
            com.instagram.common.session.UserSession r1 = r8.A02     // Catch: java.lang.Exception -> L8f
            android.content.Context r0 = r8.A01     // Catch: java.lang.Exception -> L8f
            r7.A01 = r8     // Catch: java.lang.Exception -> L8f
            r7.A02 = r10     // Catch: java.lang.Exception -> L8f
            r7.A03 = r9     // Catch: java.lang.Exception -> L8f
            r7.A00 = r5     // Catch: java.lang.Exception -> L8f
            java.lang.Object r1 = r2.A01(r0, r3, r1, r7)     // Catch: java.lang.Exception -> L8f
            if (r1 == r6) goto L4d
            r2 = r8
            goto L6e
        L6b:
            X.AbstractC09560e7.A00(r1)     // Catch: java.lang.Exception -> L8f
        L6e:
            X.KfY r1 = (X.AbstractC46350KfY) r1     // Catch: java.lang.Exception -> L8f
            boolean r0 = r1 instanceof X.C44817Jso     // Catch: java.lang.Exception -> L8f
            if (r0 == 0) goto L87
            X.Jso r1 = (X.C44817Jso) r1     // Catch: java.lang.Exception -> L8f
            java.lang.String r1 = r1.A00     // Catch: java.lang.Exception -> L8f
            X.0Cs r0 = r2.A00     // Catch: java.lang.Exception -> L8f
            r0.A01(r10, r1)     // Catch: java.lang.Exception -> L8f
            if (r9 == 0) goto L4b
            java.util.List r0 = X.AbstractC166987dD.A1J(r1)     // Catch: java.lang.Exception -> L8f
            r9.DWa(r0, r5)     // Catch: java.lang.Exception -> L8f
            goto L4b
        L87:
            if (r9 == 0) goto L4b
            X.0sl r0 = X.C16930sl.A00     // Catch: java.lang.Exception -> L8f
            r9.DWa(r0, r4)     // Catch: java.lang.Exception -> L8f
            goto L4b
        L8f:
            if (r9 == 0) goto L4b
            X.0sl r0 = X.C16930sl.A00
            r9.DWa(r0, r4)
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ml.hashtag.IgContextualHashtagsProcessor.A00(X.MP9, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(2:3|(9:5|6|7|(1:(2:10|11)(2:23|24))(2:25|(3:(1:28)|18|19)(3:29|30|(1:32)(6:40|(2:42|34)|(2:36|(1:38)(1:39))|17|18|19)))|12|(2:14|(1:16))(1:(1:22))|17|18|19))|7|(0)(0)|12|(0)(0)|17|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d1, code lost:
    
        if (r3 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d3, code lost:
    
        r3.DWa(X.C16930sl.A00, false);
     */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00de: INVOKE (r11 I:android.media.MediaMetadataRetriever) VIRTUAL call: android.media.MediaMetadataRetriever.release():void A[MD:():void throws java.io.IOException (c)] (LINE:222), block:B:44:0x00de */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b6 A[Catch: Exception -> 0x00d1, all -> 0x00dd, TryCatch #1 {Exception -> 0x00d1, blocks: (B:11:0x00ad, B:12:0x00b0, B:14:0x00b6, B:16:0x00c1, B:22:0x00cb, B:30:0x0060, B:32:0x006e, B:34:0x0079, B:36:0x009a, B:40:0x0083, B:42:0x008a), top: B:7:0x0026, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.MP9 r18, java.lang.String r19, X.InterfaceC23621Ds r20, long r21) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ml.hashtag.IgContextualHashtagsProcessor.A01(X.MP9, java.lang.String, X.1Ds, long):java.lang.Object");
    }

    public IgContextualHashtagsProcessor(Context context, UserSession userSession) {
        this.A01 = context;
        this.A02 = userSession;
    }
}
