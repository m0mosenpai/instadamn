package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.Camera;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Size;
import com.instagram.pendingmedia.model.ClipInfo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: X.OeB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55201OeB {
    public static final File A00(Context context, ClipInfo clipInfo, String str, int i, int i2) {
        C14360o3.A0B(context, 2);
        File A01 = AbstractC916948n.A01();
        File parentFile = A01.getParentFile();
        if (parentFile == null) {
            C0K8.A02(C55201OeB.class, "Unable to get video cover folder");
            return null;
        }
        if (!parentFile.exists()) {
            AbstractC916948n.A0F();
        }
        try {
            FileOutputStream A0x = MSW.A0x(A01);
            if (str != null) {
                try {
                    if (Build.VERSION.SDK_INT >= 29) {
                        C14360o3.A0B("content://", 1);
                        if (str.startsWith("content://")) {
                            Bitmap loadThumbnail = context.getContentResolver().loadThumbnail(AbstractC08820cl.A03(str), new Size(i, i2), null);
                            C14360o3.A07(loadThumbnail);
                            A03(A01);
                            C0fK.A02(Bitmap.CompressFormat.JPEG, loadThumbnail, A0x, 100);
                            A0x.close();
                            return A01;
                        }
                    }
                } finally {
                }
            }
            A01(clipInfo, A01, i, i2, 100, TimeUnit.MICROSECONDS.toMillis(clipInfo.A05), false);
            A0x.close();
            return A01;
        } catch (IOException e) {
            C0K8.A07(C55201OeB.class, "Unable to save thumbnail to file", e, new Object[0]);
            return A01;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A01(ClipInfo clipInfo, File file, int i, int i2, int i3, long j, boolean z) {
        Bitmap A00;
        boolean z2;
        C14360o3.A0B(clipInfo, 0);
        String str = clipInfo.A0F;
        if (str == null) {
            C0K8.A02(C55201OeB.class, "Unable to get video file path to fetch frame.");
            return;
        }
        File A11 = AbstractC166987dD.A11(str);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(A11.getAbsolutePath());
                Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(j, 3);
                if (frameAtTime == null) {
                    mediaMetadataRetriever.release();
                    return;
                }
                if (z) {
                    int i4 = clipInfo.A03;
                    int i5 = 0;
                    if (!AbstractC167007dF.A1P(i4, -1) && i4 != -1) {
                        C196868nG c196868nG = AbstractC196848nE.A01;
                        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                        Camera.getCameraInfo(i4, cameraInfo);
                        int i6 = cameraInfo.orientation;
                        if (cameraInfo.facing == 1) {
                            i5 = 1;
                        }
                        z2 = i5;
                        i5 = i6;
                    } else {
                        z2 = 0;
                    }
                    A00 = C1NC.A09(frameAtTime, i, i2, i5, z2);
                    C14360o3.A07(A00);
                } else {
                    A00 = C0fK.A00(frameAtTime, i, i2, true);
                    C14360o3.A07(A00);
                }
                frameAtTime.recycle();
                try {
                    mediaMetadataRetriever.release();
                } catch (Exception unused) {
                }
                A03(file);
                try {
                    FileOutputStream A0x = MSW.A0x(file);
                    try {
                        C0fK.A02(Bitmap.CompressFormat.JPEG, A00, A0x, i3);
                        A0x.close();
                    } finally {
                    }
                } catch (IOException e) {
                    C0K8.A07(C55201OeB.class, "Unable to save frame to file", e, new Object[0]);
                }
            } catch (Exception unused2) {
            }
        } catch (RuntimeException unused3) {
            mediaMetadataRetriever.release();
        } catch (Throwable th) {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception unused4) {
            }
            throw th;
        }
    }

    public static final void A02(C47Z c47z, File file, int i, int i2, int i3) {
        C14360o3.A0B(file, 1);
        if (c47z != null) {
            A01(c47z.A1N, file, i, i2, i3, 0L, true);
        }
    }

    public static final boolean A04(C47Z c47z) {
        boolean A1M = AbstractC167007dF.A1M(c47z.A1i.A01);
        boolean z = c47z.A5L;
        boolean A02 = AbstractC50707Ma2.A02(c47z);
        boolean z2 = c47z.A5F;
        if (A1M || z || A02 || z2) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r9 != r0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A05(X.C47Z r5, int r6, int r7, int r8, int r9, boolean r10) {
        /*
            X.47m r0 = r5.A1i
            int r0 = r0.A01
            r4 = 1
            boolean r3 = X.MSY.A1S(r0, r6)
            int r0 = r5.A05
            boolean r2 = X.MSY.A1S(r0, r7)
            com.instagram.pendingmedia.model.ClipInfo r0 = r5.A1N
            int r1 = r0.A07
            int r0 = r0.A05
            if (r8 != r1) goto L1a
            r1 = 0
            if (r9 == r0) goto L1b
        L1a:
            r1 = 1
        L1b:
            boolean r0 = r5.A5F
            boolean r0 = X.MSY.A1S(r0, r10)
            if (r3 != 0) goto L2a
            if (r2 != 0) goto L2a
            if (r1 != 0) goto L2a
            if (r0 != 0) goto L2a
            r4 = 0
        L2a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55201OeB.A05(X.47Z, int, int, int, int, boolean):boolean");
    }

    public static final void A03(File file) {
        String A0x = AbstractC43592JPx.A0x(file);
        String str = File.separator;
        C14360o3.A08(str);
        int A07 = AbstractC001900j.A07(A0x, str, A0x.length() - 1);
        if (A07 > -1) {
            A0x = AbstractC25227BEk.A0w(A0x, 0, A07);
        }
        AbstractC166987dD.A11(A0x).mkdirs();
    }
}
