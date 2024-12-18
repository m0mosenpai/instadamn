package com.instagram.genai.imageservice.service;

import X.AbstractC115105If;
import X.AbstractC166177bl;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.AbstractC43592JPx;
import X.B4Z;
import X.C115095Ie;
import X.C14360o3;
import X.C194848jk;
import X.C27231Bzq;
import X.C27234Bzt;
import X.C38687GzS;
import X.C3NX;
import X.C3NY;
import X.C46346KfU;
import X.C47452Kxh;
import X.C50244MGz;
import X.C51755Mte;
import X.C51758Mth;
import X.C92674Dc;
import X.C92694De;
import X.InterfaceC23621Ds;
import X.LK9;
import X.MQ9;
import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import com.instagram.genai.imageservice.upload.GenAIImageUploadService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class GenAIImageService implements MQ9 {
    public static final long A05 = TimeUnit.SECONDS.toMillis(30);
    public final Context A00;
    public final C51755Mte A01;
    public final C92694De A02;
    public final UserSession A03;
    public final GenAIImageUploadService A04;

    public /* synthetic */ GenAIImageService(Context context, C51755Mte c51755Mte, UserSession userSession, int i) {
        GenAIImageUploadService genAIImageUploadService = null;
        c51755Mte = (i & 4) != 0 ? new C51755Mte((C51758Mth) null, (DefaultConstructorMarker) null, 1, 28) : c51755Mte;
        if ((i & 8) != 0) {
            C51758Mth c51758Mth = (C51758Mth) c51755Mte.A00;
            C14360o3.A0B(userSession, 0);
            genAIImageUploadService = new GenAIImageUploadService(context, c51758Mth, userSession, (C47452Kxh) userSession.A01(C47452Kxh.class, C50244MGz.A00));
        }
        AbstractC167027dH.A0a(1, userSession, context, c51755Mte, genAIImageUploadService);
        this.A03 = userSession;
        this.A00 = context;
        this.A01 = c51755Mte;
        this.A04 = genAIImageUploadService;
        this.A02 = AbstractC166177bl.A00(C92674Dc.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A03(com.instagram.genai.imageservice.service.GenAIImageService r7, X.LK9 r8, X.C45067Jww r9, X.InterfaceC23621Ds r10) {
        /*
            r3 = 0
            boolean r0 = X.PX9.A03(r10, r3)
            if (r0 == 0) goto L57
            r5 = r10
            X.PX9 r5 = (X.PX9) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L57
            int r2 = r2 - r1
            r5.A00 = r2
        L15:
            java.lang.Object r1 = r5.A01
            X.1JX r6 = X.C1JX.A02
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L2e
            if (r0 != r4) goto L64
            X.AbstractC09560e7.A00(r1)
        L23:
            X.5ud r1 = (X.AbstractC130335ud) r1
            boolean r0 = r1 instanceof X.C130325uc
            if (r0 == 0) goto L5f
            X.5uc r1 = (X.C130325uc) r1
            java.lang.Object r6 = r1.A00
            return r6
        L2e:
            X.AbstractC09560e7.A00(r1)
            X.02i r3 = X.LK9.A02(r8)
            X.0do r0 = r8.A03
            int r2 = X.AbstractC167027dH.A01(r0)
            X.0do r0 = r8.A02
            int r1 = X.AbstractC167027dH.A01(r0)
            java.lang.String r0 = "image_request_start"
            r3.markerPoint(r2, r1, r0)
            X.4De r2 = r7.A02
            r1 = 0
            X.MAa r0 = new X.MAa
            r0.<init>(r7, r8, r9, r1)
            r5.A00 = r4
            java.lang.Object r1 = r2.A00(r9, r5, r0)
            if (r1 != r6) goto L23
            return r6
        L57:
            r0 = 42
            X.PX9 r5 = new X.PX9
            r5.<init>(r7, r10, r3, r0)
            goto L15
        L5f:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L64:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageservice.service.GenAIImageService.A03(com.instagram.genai.imageservice.service.GenAIImageService, X.LK9, X.Jww, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A04(com.instagram.genai.imageservice.service.GenAIImageService r15, X.LK9 r16, X.KY1 r17, X.InterfaceC23621Ds r18) {
        /*
            r3 = r15
            r7 = r16
            r9 = r17
            r4 = 3
            r5 = r18
            boolean r0 = X.PX6.A02(r5, r4)
            if (r0 == 0) goto L8e
            r6 = r5
            X.PX6 r6 = (X.PX6) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8e
            int r2 = r2 - r1
            r6.A00 = r2
        L1c:
            java.lang.Object r8 = r6.A04
            X.1JX r5 = X.C1JX.A02
            int r0 = r6.A00
            r4 = 2
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 == r2) goto L48
            if (r0 != r4) goto L94
            X.AbstractC09560e7.A00(r8)
        L2d:
            return r8
        L2e:
            X.AbstractC09560e7.A00(r8)
            X.GzS r0 = r9.A02
            java.lang.String r1 = r0.A01
            java.lang.Object r0 = r0.A00
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r6.A01 = r15
            r6.A02 = r9
            r6.A03 = r7
            r6.A00 = r2
            java.lang.Object r8 = A02(r0, r15, r7, r1, r6)
            if (r8 != r5) goto L57
            return r5
        L48:
            java.lang.Object r7 = r6.A03
            X.LK9 r7 = (X.LK9) r7
            java.lang.Object r9 = r6.A02
            X.KY1 r9 = (X.KY1) r9
            java.lang.Object r3 = r6.A01
            com.instagram.genai.imageservice.service.GenAIImageService r3 = (com.instagram.genai.imageservice.service.GenAIImageService) r3
            X.AbstractC09560e7.A00(r8)
        L57:
            X.KhW r8 = (X.AbstractC46472KhW) r8
            boolean r0 = r8 instanceof X.KY4
            if (r0 == 0) goto L99
            java.lang.Integer r10 = r9.A00
            X.MtK r0 = r9.A00
            int r2 = r0.A01
            int r1 = r0.A00
            java.lang.String r11 = r9.A03
            X.Dnj r0 = r9.A01
            java.lang.String r12 = r0.A00
            X.GzS r0 = r9.A02
            java.lang.String r13 = r0.A01
            X.KY4 r8 = (X.KY4) r8
            java.lang.String r14 = r8.A00
            r15 = 0
            X.Jww r9 = new X.Jww
            r16 = r15
            r18 = r1
            r17 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r6.A01 = r15
            r6.A02 = r15
            r6.A03 = r15
            r6.A00 = r4
            java.lang.Object r8 = A03(r3, r7, r9, r6)
            if (r8 != r5) goto L2d
            return r5
        L8e:
            X.PX6 r6 = new X.PX6
            r6.<init>(r15, r5, r4)
            goto L1c
        L94:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L99:
            boolean r0 = r8 instanceof X.KY5
            if (r0 == 0) goto La4
            X.C01 r0 = X.C01.A00
            X.8jk r5 = X.AbstractC43592JPx.A0p(r0)
            return r5
        La4:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageservice.service.GenAIImageService.A04(com.instagram.genai.imageservice.service.GenAIImageService, X.LK9, X.KY1, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0023. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d1  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.LK9] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A05(com.instagram.genai.imageservice.service.GenAIImageService r15, X.LK9 r16, X.AbstractC47450Kxf r17, X.InterfaceC23621Ds r18) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageservice.service.GenAIImageService.A05(com.instagram.genai.imageservice.service.GenAIImageService, X.LK9, X.Kxf, X.1Ds):java.lang.Object");
    }

    public static final C3NY A00(LK9 lk9, C3NY c3ny) {
        Object obj;
        if (c3ny instanceof C3NX) {
            Object obj2 = ((C3NX) c3ny).A00;
            LK9.A02(lk9).markerPoint(AbstractC167027dH.A01(lk9.A03), AbstractC167027dH.A01(lk9.A02), "image_request_success");
            c3ny = AbstractC25225BEi.A0z(obj2);
        } else if (!(c3ny instanceof C194848jk)) {
            throw B4Z.A00();
        }
        if (!(c3ny instanceof C3NX)) {
            if (c3ny instanceof C194848jk) {
                AbstractC115105If abstractC115105If = (AbstractC115105If) ((C194848jk) c3ny).A00;
                if (abstractC115105If instanceof C115095Ie) {
                    Throwable th = ((C115095Ie) abstractC115105If).A00;
                    if (th instanceof C46346KfU) {
                        C14360o3.A0C(th, "null cannot be cast to non-null type com.instagram.genai.imageservice.api.GenAIImageQueryServerException");
                        C46346KfU c46346KfU = (C46346KfU) th;
                        String str = c46346KfU.A00;
                        String str2 = str;
                        if (str == null) {
                            str2 = "";
                        }
                        lk9.A05(str2);
                        obj = new C27231Bzq(str, c46346KfU.A02, c46346KfU.A01);
                        return AbstractC43592JPx.A0p(obj);
                    }
                }
                lk9.A05(abstractC115105If.toString());
                obj = C27234Bzt.A00;
                return AbstractC43592JPx.A0p(obj);
            }
            throw B4Z.A00();
        }
        return c3ny;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(android.graphics.Bitmap r8, com.instagram.genai.imageservice.service.GenAIImageService r9, X.LK9 r10, java.lang.String r11, X.InterfaceC23621Ds r12) {
        /*
            r3 = 31
            boolean r0 = X.MAH.A01(r12, r3)
            if (r0 == 0) goto L69
            r5 = r12
            X.MAH r5 = (X.MAH) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L69
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r6 = r5.A02
            X.1JX r7 = X.C1JX.A02
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L44
            if (r0 != r4) goto La8
            java.lang.Object r10 = r5.A01
            X.LK9 r10 = (X.LK9) r10
            X.AbstractC09560e7.A00(r6)
        L28:
            X.KhW r6 = (X.AbstractC46472KhW) r6
            boolean r0 = r6 instanceof X.KY4
            if (r0 == 0) goto L6f
            X.02i r3 = X.LK9.A02(r10)
            X.0do r0 = r10.A03
            int r2 = X.AbstractC167027dH.A01(r0)
            X.0do r0 = r10.A02
            int r1 = X.AbstractC167027dH.A01(r0)
            java.lang.String r0 = "mask_media_upload_success"
            r3.markerPoint(r2, r1, r0)
            return r6
        L44:
            X.AbstractC09560e7.A00(r6)
            X.02i r3 = X.LK9.A02(r10)
            X.0do r0 = r10.A03
            int r2 = X.AbstractC167027dH.A01(r0)
            X.0do r0 = r10.A02
            int r1 = X.AbstractC167027dH.A01(r0)
            java.lang.String r0 = "mask_media_upload_start"
            r3.markerPoint(r2, r1, r0)
            com.instagram.genai.imageservice.upload.GenAIImageUploadService r0 = r9.A04
            r5.A01 = r10
            r5.A00 = r4
            java.lang.Object r6 = r0.A01(r8, r11, r5)
            if (r6 != r7) goto L28
            return r7
        L69:
            X.MAH r5 = new X.MAH
            r5.<init>(r9, r12, r3)
            goto L16
        L6f:
            boolean r0 = r6 instanceof X.KY5
            if (r0 == 0) goto La3
            r0 = r6
            X.KY5 r0 = (X.KY5) r0
            java.lang.String r7 = r0.A00
            r0 = 0
            X.C14360o3.A0B(r7, r0)
            X.02i r3 = X.LK9.A02(r10)
            X.0do r5 = r10.A03
            int r2 = X.AbstractC167027dH.A01(r5)
            X.0do r4 = r10.A02
            int r1 = X.AbstractC167027dH.A01(r4)
            java.lang.String r0 = "mask_media_upload_failure"
            r3.markerPoint(r2, r1, r0)
            X.02i r3 = X.LK9.A02(r10)
            int r2 = X.AbstractC167027dH.A01(r5)
            int r1 = X.AbstractC167027dH.A01(r4)
            java.lang.String r0 = "mask_media_upload_error"
            r3.markerAnnotate(r2, r1, r0, r7)
            return r6
        La3:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        La8:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageservice.service.GenAIImageService.A01(android.graphics.Bitmap, com.instagram.genai.imageservice.service.GenAIImageService, X.LK9, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(android.graphics.Bitmap r8, com.instagram.genai.imageservice.service.GenAIImageService r9, X.LK9 r10, java.lang.String r11, X.InterfaceC23621Ds r12) {
        /*
            r3 = 32
            boolean r0 = X.MAH.A01(r12, r3)
            if (r0 == 0) goto L69
            r5 = r12
            X.MAH r5 = (X.MAH) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L69
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r6 = r5.A02
            X.1JX r7 = X.C1JX.A02
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L44
            if (r0 != r4) goto Laf
            java.lang.Object r10 = r5.A01
            X.LK9 r10 = (X.LK9) r10
            X.AbstractC09560e7.A00(r6)
        L28:
            X.KhW r6 = (X.AbstractC46472KhW) r6
            boolean r0 = r6 instanceof X.KY4
            if (r0 == 0) goto L6f
            X.02i r3 = X.LK9.A02(r10)
            X.0do r0 = r10.A03
            int r2 = X.AbstractC167027dH.A01(r0)
            X.0do r0 = r10.A02
            int r1 = X.AbstractC167027dH.A01(r0)
            java.lang.String r0 = "source_media_upload_success"
            r3.markerPoint(r2, r1, r0)
            return r6
        L44:
            X.AbstractC09560e7.A00(r6)
            X.02i r3 = X.LK9.A02(r10)
            X.0do r0 = r10.A03
            int r2 = X.AbstractC167027dH.A01(r0)
            X.0do r0 = r10.A02
            int r1 = X.AbstractC167027dH.A01(r0)
            java.lang.String r0 = "source_media_upload_start"
            r3.markerPoint(r2, r1, r0)
            com.instagram.genai.imageservice.upload.GenAIImageUploadService r0 = r9.A04
            r5.A01 = r10
            r5.A00 = r4
            java.lang.Object r6 = r0.A01(r8, r11, r5)
            if (r6 != r7) goto L28
            return r7
        L69:
            X.MAH r5 = new X.MAH
            r5.<init>(r9, r12, r3)
            goto L16
        L6f:
            boolean r0 = r6 instanceof X.KY5
            if (r0 == 0) goto Laa
            r0 = r6
            X.KY5 r0 = (X.KY5) r0
            java.lang.String r7 = r0.A00
            X.02i r4 = X.LK9.A02(r10)
            X.0do r5 = r10.A03
            int r3 = X.AbstractC167027dH.A01(r5)
            X.0do r2 = r10.A02
            int r1 = X.AbstractC167027dH.A01(r2)
            java.lang.String r0 = "source_media_upload_failure"
            r4.markerPoint(r3, r1, r0)
            X.02i r4 = X.LK9.A02(r10)
            int r3 = X.AbstractC167027dH.A01(r5)
            int r2 = X.AbstractC167027dH.A01(r2)
            if (r7 == 0) goto La7
            r0 = 200(0xc8, float:2.8E-43)
            java.lang.String r1 = X.C00Q.A03(r7, r0)
        La1:
            java.lang.String r0 = "source_media_upload_error"
            r4.markerAnnotate(r3, r2, r0, r1)
            return r6
        La7:
            java.lang.String r1 = ""
            goto La1
        Laa:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Laf:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageservice.service.GenAIImageService.A02(android.graphics.Bitmap, com.instagram.genai.imageservice.service.GenAIImageService, X.LK9, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A06(X.AbstractC47450Kxf r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.KY1
            if (r0 == 0) goto L49
            X.KY1 r6 = (X.KY1) r6
            X.GzS r0 = r6.A02
        L8:
            java.lang.String r0 = r0.A01
            java.util.List r0 = X.AbstractC166987dD.A1J(r0)
        Le:
            java.util.Iterator r4 = r0.iterator()
        L12:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L88
            java.lang.Object r2 = r4.next()
            com.instagram.genai.imageservice.upload.GenAIImageUploadService r1 = r5.A04
            r0 = 0
            X.C14360o3.A0B(r2, r0)
            X.Kxh r0 = r1.A02
            if (r0 == 0) goto L12
            X.0Cs r1 = r0.A00
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = r1.A01
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r3.writeLock()
            r0.lock()
            java.util.HashMap r0 = r1.A00     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r2 = r0.remove(r2)     // Catch: java.lang.Throwable -> L7f
            X.0Cr r2 = (X.C03150Cr) r2     // Catch: java.lang.Throwable -> L7f
            if (r2 == 0) goto L41
            long r0 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L7f
            r2.A00 = r0     // Catch: java.lang.Throwable -> L7f
        L41:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r3.writeLock()
            r0.unlock()
            goto L12
        L49:
            boolean r0 = r6 instanceof X.KY2
            r3 = 1
            r2 = 0
            r1 = 2
            if (r0 == 0) goto L65
            java.lang.String[] r1 = new java.lang.String[r1]
            X.KY2 r6 = (X.KY2) r6
            X.GzS r0 = r6.A03
            java.lang.String r0 = r0.A01
            r1[r2] = r0
            X.GzS r0 = r6.A02
        L5c:
            java.lang.String r0 = r0.A01
            r1[r3] = r0
            java.util.List r0 = X.AbstractC16960so.A1Q(r1)
            goto Le
        L65:
            boolean r0 = r6 instanceof X.KY0
            if (r0 == 0) goto L76
            java.lang.String[] r1 = new java.lang.String[r1]
            X.KY0 r6 = (X.KY0) r6
            X.GzS r0 = r6.A02
            java.lang.String r0 = r0.A01
            r1[r2] = r0
            X.GzS r0 = r6.A01
            goto L5c
        L76:
            boolean r0 = r6 instanceof X.C46011KXz
            if (r0 == 0) goto L89
            X.KXz r6 = (X.C46011KXz) r6
            X.GzS r0 = r6.A00
            goto L8
        L7f:
            r1 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r3.writeLock()
            r0.unlock()
            throw r1
        L88:
            return
        L89:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageservice.service.GenAIImageService.A06(X.Kxf):void");
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x00a4: INVOKE (r3 I:X.02i) = (r10 I:X.LK9) STATIC call: X.LK9.A02(X.LK9):X.02i A[MD:(X.LK9):X.02i (m)] (LINE:164), block:B:37:0x00a4 */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x00bb: INVOKE (r10 I:X.LK9), (r0 I:X.CPB) VIRTUAL call: X.LK9.A04(X.CPB):void A[MD:(X.CPB):void (m)] (LINE:187), block:B:34:0x00b9 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.LK9] */
    @Override // X.MQ9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AWr(X.AbstractC47450Kxf r15, X.InterfaceC23621Ds r16) {
        /*
            r14 = this;
            r3 = 30
            r4 = r16
            boolean r0 = X.MAH.A01(r4, r3)
            r11 = r14
            if (r0 == 0) goto L29
            r6 = r4
            X.MAH r6 = (X.MAH) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L29
            int r2 = r2 - r1
            r6.A00 = r2
        L19:
            java.lang.Object r0 = r6.A02
            X.1JX r5 = X.C1JX.A02
            int r1 = r6.A00
            r4 = 1
            if (r1 == 0) goto L38
            if (r1 != r4) goto L33
            java.lang.Object r10 = r6.A01
            X.LK9 r10 = (X.LK9) r10
            goto L2f
        L29:
            X.MAH r6 = new X.MAH
            r6.<init>(r14, r4, r3)
            goto L19
        L2f:
            X.AbstractC09560e7.A00(r0)     // Catch: java.util.concurrent.CancellationException -> La3 X.C902540k -> Lb9
            return r0
        L33:
            java.lang.IllegalStateException r4 = X.AbstractC166987dD.A13()
            throw r4
        L38:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r1 = r14.A03
            r9 = r15
            java.lang.Integer r0 = r15.A00
            X.LK9 r10 = new X.LK9
            r10.<init>(r1, r0)
            boolean r0 = r15 instanceof X.C46011KXz     // Catch: java.util.concurrent.CancellationException -> La3 X.C902540k -> Lb9
            if (r0 == 0) goto L62
            r0 = r9
            X.KXz r0 = (X.C46011KXz) r0     // Catch: java.util.concurrent.CancellationException -> La3 X.C902540k -> Lb9
            java.lang.String r8 = r0.A01     // Catch: java.util.concurrent.CancellationException -> La3 X.C902540k -> Lb9
        L4e:
            X.02i r3 = X.LK9.A02(r10)     // Catch: java.util.concurrent.CancellationException -> La3 X.C902540k -> Lb9
            X.0do r7 = r10.A03     // Catch: java.util.concurrent.CancellationException -> La3 X.C902540k -> Lb9
            int r2 = X.AbstractC167027dH.A01(r7)     // Catch: java.util.concurrent.CancellationException -> La3 X.C902540k -> Lb9
            X.0do r1 = r10.A02     // Catch: java.util.concurrent.CancellationException -> La3 X.C902540k -> Lb9
            int r0 = X.AbstractC167027dH.A01(r1)     // Catch: java.util.concurrent.CancellationException -> La3 X.C902540k -> Lb9
            r3.markerStart(r2, r0)     // Catch: java.util.concurrent.CancellationException -> La3 X.C902540k -> Lb9
            goto L7c
        L62:
            boolean r0 = r15 instanceof X.KY1     // Catch: java.util.concurrent.CancellationException -> La3 X.C902540k -> Lb9
            if (r0 == 0) goto L6c
            r0 = r9
            X.KY1 r0 = (X.KY1) r0     // Catch: java.util.concurrent.CancellationException -> La3 X.C902540k -> Lb9
            java.lang.String r8 = r0.A03     // Catch: java.util.concurrent.CancellationException -> La3 X.C902540k -> Lb9
            goto L4e
        L6c:
            boolean r0 = r15 instanceof X.KY0     // Catch: java.util.concurrent.CancellationException -> La3 X.C902540k -> Lb9
            if (r0 == 0) goto L76
            r0 = r9
            X.KY0 r0 = (X.KY0) r0     // Catch: java.util.concurrent.CancellationException -> La3 X.C902540k -> Lb9
            java.lang.String r8 = r0.A03     // Catch: java.util.concurrent.CancellationException -> La3 X.C902540k -> Lb9
            goto L4e
        L76:
            r0 = r9
            X.KY2 r0 = (X.KY2) r0     // Catch: java.util.concurrent.CancellationException -> La3 X.C902540k -> Lb9
            java.lang.String r8 = r0.A04     // Catch: java.util.concurrent.CancellationException -> La3 X.C902540k -> Lb9
            goto L4e
        L7c:
            if (r8 == 0) goto L8f
            X.02i r3 = X.LK9.A02(r10)     // Catch: java.util.concurrent.CancellationException -> La3 X.C902540k -> Lb9
            int r2 = X.AbstractC167027dH.A01(r7)     // Catch: java.util.concurrent.CancellationException -> La3 X.C902540k -> Lb9
            int r1 = X.AbstractC167027dH.A01(r1)     // Catch: java.util.concurrent.CancellationException -> La3 X.C902540k -> Lb9
            java.lang.String r0 = "client_session_id"
            r3.markerAnnotate(r2, r1, r0, r8)     // Catch: java.util.concurrent.CancellationException -> La3 X.C902540k -> Lb9
        L8f:
            long r0 = com.instagram.genai.imageservice.service.GenAIImageService.A05     // Catch: java.util.concurrent.CancellationException -> La3 X.C902540k -> Lb9
            r12 = 0
            r13 = 0
            X.PZP r8 = new X.PZP     // Catch: java.util.concurrent.CancellationException -> La3 X.C902540k -> Lb9
            r8.<init>(r9, r10, r11, r12, r13)     // Catch: java.util.concurrent.CancellationException -> La3 X.C902540k -> Lb9
            r6.A01 = r10     // Catch: java.util.concurrent.CancellationException -> La3 X.C902540k -> Lb9
            r6.A00 = r4     // Catch: java.util.concurrent.CancellationException -> La3 X.C902540k -> Lb9
            java.lang.Object r0 = X.LHL.A00(r6, r8, r0)     // Catch: java.util.concurrent.CancellationException -> La3 X.C902540k -> Lb9
            if (r0 != r5) goto Lc2
            return r5
        La3:
            r4 = move-exception
            X.02i r3 = X.LK9.A02(r10)
            X.0do r0 = r10.A03
            int r2 = X.AbstractC167027dH.A01(r0)
            X.0do r0 = r10.A02
            int r1 = X.AbstractC167027dH.A01(r0)
            r0 = 4
            r3.markerEnd(r2, r1, r0)
            throw r4
        Lb9:
            X.Bzy r0 = X.C27239Bzy.A00
            r10.A04(r0)
            X.8jk r0 = X.AbstractC43592JPx.A0p(r0)
        Lc2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageservice.service.GenAIImageService.AWr(X.Kxf, X.1Ds):java.lang.Object");
    }

    @Override // X.MQ9
    public final Object FDC(C51755Mte c51755Mte, InterfaceC23621Ds interfaceC23621Ds) {
        GenAIImageUploadService genAIImageUploadService = this.A04;
        C38687GzS c38687GzS = (C38687GzS) c51755Mte.A00;
        return genAIImageUploadService.A01((Bitmap) c38687GzS.A00, c38687GzS.A01, interfaceC23621Ds);
    }
}
