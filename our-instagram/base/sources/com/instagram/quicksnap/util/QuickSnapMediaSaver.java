package com.instagram.quicksnap.util;

import X.C14360o3;
import android.content.Context;

/* loaded from: classes9.dex */
public final class QuickSnapMediaSaver {
    public final Context A00;

    public QuickSnapMediaSaver(Context context) {
        C14360o3.A0B(context, 1);
        this.A00 = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.common.typedurl.ImageUrl r6, com.instagram.quicksnap.util.QuickSnapMediaSaver r7, X.InterfaceC23621Ds r8, int r9) {
        /*
            r3 = 39
            boolean r0 = X.C57145PWx.A02(r8, r3)
            if (r0 == 0) goto L78
            r5 = r8
            X.PWx r5 = (X.C57145PWx) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L78
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r3 = r5.A02
            X.1JX r4 = X.C1JX.A02
            int r1 = r5.A00
            r0 = 1
            if (r1 == 0) goto L49
            if (r1 != r0) goto L7d
            java.lang.Object r7 = r5.A01
            com.instagram.quicksnap.util.QuickSnapMediaSaver r7 = (com.instagram.quicksnap.util.QuickSnapMediaSaver) r7
            X.AbstractC09560e7.A00(r3)
        L28:
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            if (r3 == 0) goto L46
            android.content.Context r2 = r7.A00
            java.lang.String r0 = ".png"
            java.io.File r1 = X.AbstractC15860qg.A00(r2, r0)
            if (r1 == 0) goto L46
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG
            X.C1NC.A0K(r2, r0, r3, r1)
            X.AbstractC50633MWu.A09(r2, r1)
            r1 = 2131971293(0x7f134cdd, float:1.9579561E38)
            java.lang.String r0 = "quick_snap_archive_preview_save"
            X.C9GR.A0F(r2, r0, r1)
        L46:
            X.0eB r4 = X.C0eB.A00
            return r4
        L49:
            X.AbstractC09560e7.A00(r3)
            if (r6 == 0) goto L46
            r5.A01 = r7
            r5.A00 = r0
            X.1Jo r3 = X.AbstractC25232BEp.A1H(r5)
            X.1No r1 = X.C25821No.A00()
            java.lang.String r0 = ""
            X.1OG r2 = r1.A0J(r6, r0)
            r0 = 2
            X.Pjh r1 = new X.Pjh
            r1.<init>(r3, r0)
            X.Osi r0 = new X.Osi
            r0.<init>(r7, r1, r9)
            r2.A02(r0)
            r2.A01()
            java.lang.Object r3 = r3.A0E()
            if (r3 != r4) goto L28
            return r4
        L78:
            X.PWx r5 = X.C57145PWx.A00(r7, r8, r3)
            goto L16
        L7d:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.quicksnap.util.QuickSnapMediaSaver.A00(com.instagram.common.typedurl.ImageUrl, com.instagram.quicksnap.util.QuickSnapMediaSaver, X.1Ds, int):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(java.util.List r7, X.InterfaceC23621Ds r8, int r9) {
        /*
            r6 = this;
            r3 = 9
            boolean r0 = X.PXD.A03(r8, r3)
            if (r0 == 0) goto L4a
            r5 = r8
            X.PXD r5 = (X.PXD) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4a
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A01
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L2a
            if (r0 == r2) goto L3c
            if (r0 != r3) goto L4f
            X.AbstractC09560e7.A00(r1)
        L27:
            X.0eB r4 = X.C0eB.A00
            return r4
        L2a:
            X.AbstractC09560e7.A00(r1)
            r1 = 0
            X.PZj r0 = new X.PZj
            r0.<init>(r6, r7, r1, r9)
            r5.A00 = r2
            java.lang.Object r1 = X.AnonymousClass194.A00(r5, r0)
            if (r1 != r4) goto L3f
            return r4
        L3c:
            X.AbstractC09560e7.A00(r1)
        L3f:
            java.util.Collection r1 = (java.util.Collection) r1
            r5.A00 = r3
            java.lang.Object r0 = X.AbstractC918549n.A00(r1, r5)
            if (r0 != r4) goto L27
            return r4
        L4a:
            X.PXD r5 = X.PXD.A00(r6, r8, r3)
            goto L16
        L4f:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.quicksnap.util.QuickSnapMediaSaver.A01(java.util.List, X.1Ds, int):java.lang.Object");
    }
}
