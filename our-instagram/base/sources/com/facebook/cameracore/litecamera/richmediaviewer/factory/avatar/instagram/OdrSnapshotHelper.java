package com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram;

import X.AbstractC166997dE;
import X.C47815L9x;
import X.InterfaceC16660sJ;
import android.content.Context;
import com.facebook.avatar.expresso.webp.WebPEncoderImpl;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public final class OdrSnapshotHelper {
    public int A00;
    public int A01;
    public WebPEncoderImpl A02;
    public File A03;
    public Integer A04;
    public Integer A05;
    public final C47815L9x A06;
    public final QuickPerformanceLogger A07;
    public final Context A08;
    public final AtomicBoolean A09 = AbstractC166997dE.A17();
    public final InterfaceC16660sJ A0A;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper r7, java.io.File r8, X.InterfaceC23621Ds r9) {
        /*
            r3 = 27
            boolean r0 = X.MAN.A02(r9, r3)
            if (r0 == 0) goto L51
            r6 = r9
            X.MAN r6 = (X.MAN) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L51
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r5 = r6.A02
            X.1JX r4 = X.C1JX.A02
            int r0 = r6.A00
            r3 = 1
            if (r0 == 0) goto L37
            if (r0 != r3) goto L57
            java.lang.Object r7 = r6.A01
            com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper r7 = (com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper) r7
            X.AbstractC09560e7.A00(r5)
        L28:
            boolean r0 = r5 instanceof X.C44912JuQ
            if (r0 != 0) goto L36
            com.facebook.quicklog.QuickPerformanceLogger r2 = r7.A07
            r1 = 603995461(0x24003d45, float:2.7807473E-17)
            java.lang.String r0 = "/take_snapshot/encode_and_write_to_disk_end"
            r2.markerPoint(r1, r0)
        L36:
            return r5
        L37:
            X.AbstractC09560e7.A00(r5)
            com.facebook.quicklog.QuickPerformanceLogger r2 = r7.A07
            r1 = 603995461(0x24003d45, float:2.7807473E-17)
            java.lang.String r0 = "/take_snapshot/encode_and_write_to_disk_start"
            r2.markerPoint(r1, r0)
            com.facebook.avatar.expresso.webp.WebPEncoderImpl r0 = r7.A02
            r6.A01 = r7
            r6.A00 = r3
            java.lang.Object r5 = r0.A00(r2, r8, r6, r1)
            if (r5 != r4) goto L28
            return r4
        L51:
            X.MAN r6 = new X.MAN
            r6.<init>(r7, r9, r3)
            goto L16
        L57:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper.A00(com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper, java.io.File, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper r8, X.C0eP r9, X.InterfaceC23621Ds r10, X.InterfaceC16620sF r11) {
        /*
            r3 = 14
            boolean r0 = X.MAO.A02(r10, r3)
            if (r0 == 0) goto L5d
            r7 = r10
            X.MAO r7 = (X.MAO) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5d
            int r2 = r2 - r1
            r7.A00 = r2
        L16:
            java.lang.Object r1 = r7.A03
            X.1JX r6 = X.C1JX.A02
            int r0 = r7.A00
            java.lang.String r5 = "/take_snapshot/encode_frame/"
            r4 = 603995461(0x24003d45, float:2.7807473E-17)
            r3 = 1
            if (r0 == 0) goto L41
            if (r0 != r3) goto L63
            java.lang.Object r9 = r7.A02
            X.0eP r9 = (X.C0eP) r9
            java.lang.Object r8 = r7.A01
            com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper r8 = (com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper) r8
            X.AbstractC09560e7.A00(r1)
        L31:
            com.facebook.quicklog.QuickPerformanceLogger r2 = r8.A07
            int r1 = r9.A00
            java.lang.String r0 = "_end"
            java.lang.String r0 = X.AnonymousClass001.A0c(r5, r0, r1)
            r2.markerPoint(r4, r0)
            X.0eB r0 = X.C0eB.A00
            return r0
        L41:
            X.AbstractC09560e7.A00(r1)
            com.facebook.quicklog.QuickPerformanceLogger r2 = r8.A07
            int r1 = r9.A00
            java.lang.String r0 = "_start"
            java.lang.String r0 = X.AnonymousClass001.A0c(r5, r0, r1)
            r2.markerPoint(r4, r0)
            java.lang.Object r0 = r9.A01
            X.MAO.A00(r8, r9, r7, r3)
            java.lang.Object r0 = r11.invoke(r0, r7)
            if (r0 != r6) goto L31
            return r6
        L5d:
            X.MAO r7 = new X.MAO
            r7.<init>(r8, r10, r3)
            goto L16
        L63:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper.A01(com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper, X.0eP, X.1Ds, X.0sF):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(X.AKN r17, X.InterfaceC23621Ds r18) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper.A02(X.AKN, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0096, code lost:
    
        if (r2 == r5) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(java.io.File r14, X.InterfaceC23621Ds r15, X.InterfaceC16620sF r16, X.InterfaceC19390xP r17, int r18) {
        /*
            r13 = this;
            r3 = 13
            boolean r0 = X.MAO.A02(r15, r3)
            r8 = r13
            if (r0 == 0) goto Lb3
            r4 = r15
            X.MAO r4 = (X.MAO) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb3
            int r2 = r2 - r1
            r4.A00 = r2
        L17:
            java.lang.Object r2 = r4.A03
            X.1JX r5 = X.C1JX.A02
            int r0 = r4.A00
            r6 = 1
            r3 = 2
            r10 = 0
            if (r0 == 0) goto L35
            if (r0 == r6) goto L7e
            if (r0 != r3) goto Lba
            java.lang.Object r6 = r4.A01
            com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper r6 = (com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper) r6
            X.AbstractC09560e7.A00(r2)
        L2d:
            X.0sJ r0 = r6.A0A
            r0.invoke(r2)
            X.0eB r0 = X.C0eB.A00
            return r0
        L35:
            X.AbstractC09560e7.A00(r2)
            java.lang.Integer r0 = X.C05F.A00
            r2 = r17
            r1 = r18
            X.0xP r0 = X.AbstractC011604e.A00(r0, r2, r1)
            r7 = 3
            X.0ju r2 = new X.0ju
            r2.<init>(r0, r7)
            r1 = 12
            X.MBr r0 = new X.MBr
            r0.<init>(r13, r10, r1)
            X.0po r1 = new X.0po
            r1.<init>(r0, r2)
            X.MSt r0 = new X.MSt
            r0.<init>(r1, r7)
            r11 = 41
            r12 = 42
            X.PZq r7 = new X.PZq
            r9 = r16
            r7.<init>(r8, r9, r10, r11, r12)
            X.0po r2 = new X.0po
            r2.<init>(r7, r0)
            X.MWF r1 = new X.MWF
            r1.<init>(r13, r10, r3)
            X.0rm r0 = new X.0rm
            r0.<init>(r1, r2)
            X.MAO.A00(r13, r14, r4, r6)
            java.lang.Object r2 = X.AbstractC209010m.A05(r4, r0)
            if (r2 == r5) goto L98
            r6 = r13
            goto L89
        L7e:
            java.lang.Object r14 = r4.A02
            java.io.File r14 = (java.io.File) r14
            java.lang.Object r6 = r4.A01
            com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper r6 = (com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper) r6
            X.AbstractC09560e7.A00(r2)
        L89:
            X.3NY r2 = (X.C3NY) r2
            boolean r0 = r2 instanceof X.C3NX
            if (r0 == 0) goto L99
            X.MAO.A00(r6, r10, r4, r3)
            java.lang.Object r2 = A00(r6, r14, r4)
            if (r2 != r5) goto L2d
        L98:
            return r5
        L99:
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 == 0) goto La2
            X.8jk r2 = (X.C194848jk) r2
            java.lang.Object r2 = r2.A00
            goto L2d
        La2:
            if (r2 != 0) goto Lbf
            java.lang.Integer r1 = X.C05F.A00
            java.lang.String r0 = "No frames are encoded"
            java.lang.RuntimeException r0 = X.AbstractC166987dD.A18(r0)
            X.JuQ r2 = new X.JuQ
            r2.<init>(r0, r1)
            goto L2d
        Lb3:
            X.MAO r4 = new X.MAO
            r4.<init>(r13, r15, r3)
            goto L17
        Lba:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        Lbf:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper.A03(java.io.File, X.1Ds, X.0sF, X.0xP, int):java.lang.Object");
    }

    public OdrSnapshotHelper(Context context, C47815L9x c47815L9x, InterfaceC16660sJ interfaceC16660sJ) {
        this.A08 = context;
        this.A06 = c47815L9x;
        this.A0A = interfaceC16660sJ;
        this.A07 = c47815L9x.A05;
        this.A03 = c47815L9x.A06;
        this.A01 = c47815L9x.A01;
        this.A02 = c47815L9x.A04;
        this.A05 = c47815L9x.A08;
        this.A04 = c47815L9x.A07;
    }
}
