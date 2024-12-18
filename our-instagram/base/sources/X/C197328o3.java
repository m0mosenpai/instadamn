package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.opengl.GLUtils;
import android.os.Build;
import com.facebook.onecamera.components.mediapipeline.gl.context.igl.IglTexture;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter;
import com.instagram.util.jpeg.JpegBridge;
import com.instagram.util.jpeg.NativeImage;
import java.io.IOException;

/* renamed from: X.8o3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197328o3 {
    public static final Object A0B = new Object();
    public int A00;
    public CropInfo A01;
    public AnonymousClass842 A02;
    public boolean A03;
    public boolean A04;
    public final UserSession A05;
    public final InterfaceC197258nw A06;
    public final C197348o5 A07;
    public final InterfaceC197178nn A08;
    public final boolean A09;
    public final Bitmap A0A;

    public C197328o3(Bitmap bitmap, UserSession userSession, CropInfo cropInfo, AnonymousClass842 anonymousClass842, InterfaceC197258nw interfaceC197258nw, InterfaceC197178nn interfaceC197178nn, int i, boolean z) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(interfaceC197178nn, 2);
        this.A05 = userSession;
        this.A08 = interfaceC197178nn;
        this.A0A = bitmap;
        this.A01 = cropInfo;
        this.A00 = i;
        this.A09 = z;
        this.A02 = anonymousClass842;
        this.A06 = interfaceC197258nw;
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        this.A07 = new C197348o5(c006802i);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0071 A[Catch: all -> 0x0082, TryCatch #0 {, blocks: (B:13:0x0026, B:15:0x0030, B:19:0x0033, B:29:0x0045, B:30:0x0053, B:22:0x0061, B:24:0x0071, B:25:0x007b, B:32:0x003e, B:34:0x0059), top: B:12:0x0026, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b A[Catch: all -> 0x0082, TRY_LEAVE, TryCatch #0 {, blocks: (B:13:0x0026, B:15:0x0030, B:19:0x0033, B:29:0x0045, B:30:0x0053, B:22:0x0061, B:24:0x0071, B:25:0x007b, B:32:0x003e, B:34:0x0059), top: B:12:0x0026, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0124 A[Catch: all -> 0x014d, TryCatch #2 {, blocks: (B:42:0x0096, B:44:0x00a0, B:47:0x00a4, B:49:0x00e3, B:51:0x00e9, B:53:0x00ef, B:55:0x00f5, B:63:0x0102, B:58:0x0114, B:60:0x0124, B:61:0x012e, B:66:0x010c, B:67:0x0135, B:70:0x014c, B:69:0x0147, B:71:0x013b, B:73:0x0141), top: B:41:0x0096, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012e A[Catch: all -> 0x014d, TRY_LEAVE, TryCatch #2 {, blocks: (B:42:0x0096, B:44:0x00a0, B:47:0x00a4, B:49:0x00e3, B:51:0x00e9, B:53:0x00ef, B:55:0x00f5, B:63:0x0102, B:58:0x0114, B:60:0x0124, B:61:0x012e, B:66:0x010c, B:67:0x0135, B:70:0x014c, B:69:0x0147, B:71:0x013b, B:73:0x0141), top: B:41:0x0096, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.instagram.util.jpeg.NativeImage A01(java.lang.String r17, java.lang.String r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C197328o3.A01(java.lang.String, java.lang.String, boolean):com.instagram.util.jpeg.NativeImage");
    }

    private final InterfaceC197718oi A00(SurfaceCropFilter surfaceCropFilter) {
        Bitmap decodeByteArray;
        InterfaceC197178nn interfaceC197178nn = this.A08;
        String Avl = interfaceC197178nn.Avl();
        String title = interfaceC197178nn.getTitle();
        if (Avl != null) {
            decodeByteArray = BitmapFactory.decodeFile(Avl);
        } else {
            byte[] BGb = interfaceC197178nn.BGb();
            if (BGb == null) {
                return null;
            }
            decodeByteArray = BitmapFactory.decodeByteArray(BGb, 0, BGb.length);
        }
        if (decodeByteArray == null) {
            return null;
        }
        int width = decodeByteArray.getWidth();
        int height = decodeByteArray.getHeight();
        CropInfo cropInfo = this.A01;
        if (cropInfo == null) {
            cropInfo = A0Q.A00(width, height);
            this.A01 = cropInfo;
        }
        A02(cropInfo.A02, width, height, this.A00);
        if (!AbstractC001900j.A0a(title, "cover_photo", false)) {
            A04(surfaceCropFilter, this.A00, width, height);
        }
        InterfaceC197718oi A03 = C209089Mq.A03(decodeByteArray, true);
        this.A06.DV1(cropInfo, title, this.A00);
        return A03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r10.A05, 36325154057827115L) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A02(android.graphics.Rect r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            boolean r0 = r10.A03
            if (r0 != 0) goto L91
            boolean r0 = r10.A09
            if (r0 != 0) goto L91
            int r0 = r11.width()
            float r4 = (float) r0
            int r0 = r11.height()
            float r0 = (float) r0
            float r4 = r4 / r0
            X.842 r0 = r10.A02
            if (r0 == 0) goto L8f
            X.5L6 r1 = r0.ANZ()
        L1b:
            X.5L6 r0 = X.C5L6.A0B
            if (r1 != r0) goto L2f
            com.instagram.common.session.UserSession r3 = r10.A05
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36325154057827115(0x810d890007332b, double:3.0355119236002835E-306)
            boolean r1 = X.C18U.A06(r2, r3, r0)
            r0 = 1
            if (r1 != 0) goto L30
        L2f:
            r0 = 0
        L30:
            boolean r0 = X.LHK.A02(r14, r4, r0)
            if (r0 != 0) goto L91
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            r2 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            com.instagram.creation.base.CropInfo r1 = r10.A01
            if (r1 == 0) goto L8d
            int r0 = r1.A01
        L45:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            if (r1 == 0) goto L8b
            int r0 = r1.A00
        L4d:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            if (r1 == 0) goto L89
            android.graphics.Rect r0 = r1.A02
            if (r0 == 0) goto L89
            int r0 = r0.width()
        L5b:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            com.instagram.creation.base.CropInfo r0 = r10.A01
            if (r0 == 0) goto L6b
            android.graphics.Rect r0 = r0.A02
            if (r0 == 0) goto L6b
            int r2 = r0.height()
        L6b:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r14)
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r4, r5, r6, r7, r8, r9}
            java.lang.String r0 = "scaled: %d x %d, orig: %d x %d, crop: %d x %d, exif: %d"
            java.lang.String r1 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r1)
            java.lang.String r0 = "Aspect ratio error: "
            java.lang.String r1 = X.AnonymousClass001.A0R(r0, r1)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L89:
            r0 = 0
            goto L5b
        L8b:
            r0 = 0
            goto L4d
        L8d:
            r0 = 0
            goto L45
        L8f:
            r1 = 0
            goto L1b
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C197328o3.A02(android.graphics.Rect, int, int, int):void");
    }

    public static final void A03(IglTexture iglTexture, C197328o3 c197328o3, SurfaceCropFilter surfaceCropFilter, String str, int i) {
        NativeImage nativeImage;
        int width;
        int height;
        C197548oQ c197548oQ = AbstractC197538oP.A00;
        synchronized (c197548oQ) {
            C197558oR c197558oR = (C197558oR) c197548oQ.A00.get(str);
            if (c197558oR != null) {
                nativeImage = c197558oR.A00;
            } else {
                nativeImage = null;
            }
        }
        if (iglTexture == null) {
            if (nativeImage != null) {
                width = nativeImage.width;
                height = nativeImage.height;
            } else {
                return;
            }
        } else {
            width = iglTexture.getWidth();
            height = iglTexture.getHeight();
        }
        CropInfo cropInfo = c197328o3.A01;
        if (cropInfo == null) {
            cropInfo = A0Q.A00(width, height);
            c197328o3.A01 = cropInfo;
        }
        c197328o3.A02(cropInfo.A02, width, height, i);
        if (!AbstractC001900j.A0a(str, "cover_photo", false)) {
            c197328o3.A04(surfaceCropFilter, i, width, height);
        }
        c197328o3.A06.DV1(cropInfo, str, i);
    }

    private final void A04(SurfaceCropFilter surfaceCropFilter, int i, int i2, int i3) {
        CropInfo cropInfo = this.A01;
        if (cropInfo != null && surfaceCropFilter != null && surfaceCropFilter.A00.A0F) {
            surfaceCropFilter.A0K(A0S.A00(cropInfo.A02, i2, i3, cropInfo.A01, cropInfo.A00), i2, i3, i, false);
            surfaceCropFilter.A00.A0A = this.A09;
        }
    }

    public final InterfaceC197718oi A05(SurfaceCropFilter surfaceCropFilter, boolean z) {
        InterfaceC197718oi A00;
        NativeImage A01;
        InterfaceC197718oi A002;
        InterfaceC197178nn interfaceC197178nn = this.A08;
        String Avl = interfaceC197178nn.Avl();
        if (Avl != null && this.A01 == null) {
            this.A00 = C1NC.A00(Avl);
        }
        Bitmap bitmap = this.A0A;
        if (bitmap != null) {
            if (bitmap.isRecycled()) {
                C0f5 AEp = C18950wb.A01.AEp("ImageInputSurfaceProvider", 817892527);
                AEp.ABW(DialogModule.KEY_MESSAGE, "createInputSurfaceNonDestructiveCrop: unintended recycle behavior with bitmap");
                AEp.report();
            }
            BitmapFactory.Options options = C209089Mq.A00;
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int A003 = C209089Mq.A00();
            GLUtils.texImage2D(3553, 0, bitmap, 0);
            bitmap.recycle();
            if (C209089Mq.A05("makeBitmapTexture")) {
                return null;
            }
            return AbstractC197698og.A01(null, A003, width, height);
        }
        if (Build.VERSION.SDK_INT >= 34 && this.A04 && interfaceC197178nn.Cev() && (A002 = A00(surfaceCropFilter)) != null) {
            return A002;
        }
        try {
            synchronized (A0B) {
                String Avl2 = interfaceC197178nn.Avl();
                String title = interfaceC197178nn.getTitle();
                try {
                    if (z) {
                        try {
                            try {
                                C447624g c447624g = AnonymousClass229.A01(this.A05).A04;
                                c447624g.A03.A0D("upload_image_to_gpu_requested", c447624g.A01, null, null, null, null);
                            } catch (IOException e) {
                                A00 = A00(surfaceCropFilter);
                                if (A00 != null) {
                                    if (z) {
                                        C447624g c447624g2 = AnonymousClass229.A01(this.A05).A04;
                                        c447624g2.A03.A0D("upload_image_to_gpu_success", c447624g2.A01, null, null, null, null);
                                    }
                                    A06();
                                } else {
                                    if (z) {
                                        C447624g c447624g3 = AnonymousClass229.A01(this.A05).A04;
                                        c447624g3.A03.A0C("upload_image_to_gpu_failed", c447624g3.A01);
                                    }
                                    throw new RuntimeException(e);
                                }
                            }
                        } catch (IllegalStateException e2) {
                            if (z) {
                                C447624g c447624g4 = AnonymousClass229.A01(this.A05).A04;
                                c447624g4.A03.A0C("upload_image_to_gpu_failed", c447624g4.A01);
                            }
                            throw new RuntimeException(e2);
                        }
                    }
                    if (this.A09) {
                        A01 = A01(Avl2, title, true);
                        CropInfo cropInfo = this.A01;
                        if (cropInfo != null) {
                            Rect rect = cropInfo.A02;
                            rect.set(0, 0, rect.width(), cropInfo.A02.height());
                        }
                    } else {
                        A01 = A01(Avl2, title, false);
                    }
                    A00 = AbstractC197698og.A01(null, JpegBridge.uploadTexture(A01, 6408), A01.width, A01.height);
                    A03(null, this, surfaceCropFilter, title, this.A00);
                    A06();
                    if (z) {
                        C447624g c447624g5 = AnonymousClass229.A01(this.A05).A04;
                        c447624g5.A03.A0D("upload_image_to_gpu_success", c447624g5.A01, null, null, null, null);
                    }
                } catch (Throwable th) {
                    A06();
                    throw th;
                }
            }
            return A00;
        } catch (C197338o4 e3) {
            android.net.Uri Ba0 = interfaceC197178nn.Ba0();
            if (Ba0 != null) {
                if (C18U.A06(C06090Tz.A05, this.A05, 36315451728071930L)) {
                    String title2 = interfaceC197178nn.getTitle();
                    Bitmap E35 = interfaceC197178nn.E35(((int) (Runtime.getRuntime().maxMemory() * 0.08d)) / 4, false);
                    if (E35 != null) {
                        int width2 = E35.getWidth();
                        int height2 = E35.getHeight();
                        CropInfo cropInfo2 = this.A01;
                        if (cropInfo2 == null) {
                            cropInfo2 = A0Q.A00(width2, height2);
                            this.A01 = cropInfo2;
                        }
                        A02(cropInfo2.A02, width2, height2, this.A00);
                        if (!AbstractC001900j.A0a(title2, "cover_photo", false)) {
                            A04(surfaceCropFilter, this.A00, width2, height2);
                        }
                        InterfaceC197718oi A03 = C209089Mq.A03(E35, true);
                        this.A06.DV1(cropInfo2, title2, this.A00);
                        if (A03 != null) {
                            return A03;
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to load original file: ");
                    sb.append(Ba0);
                    throw new IOException(sb.toString(), e3);
                }
            }
            throw e3;
        }
    }

    public final void A06() {
        AbstractC197538oP.A00.A01(this.A08.getTitle());
    }
}
