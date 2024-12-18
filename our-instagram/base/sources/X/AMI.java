package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.ClipInfo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes4.dex */
public abstract class AMI {
    public static final Bitmap A00(Bitmap.Config config, Point point, File file, long j) {
        Bitmap frameAtTime;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(file.getPath());
            if (Build.VERSION.SDK_INT >= 30) {
                MediaMetadataRetriever.BitmapParams bitmapParams = new MediaMetadataRetriever.BitmapParams();
                bitmapParams.setPreferredConfig(config);
                frameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(j, 2, point.x, point.y, bitmapParams);
            } else {
                frameAtTime = mediaMetadataRetriever.getFrameAtTime(j, 2);
            }
            if (frameAtTime != null) {
                return frameAtTime;
            }
            throw new IOException(AbstractC166997dE.A0z("Closest frame is null, size=%s, config=%s, time=%l", Arrays.copyOf(new Object[]{point, config, Long.valueOf(AbstractC166987dD.A0L(j))}, 3)));
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    public static final Bitmap A01(Bitmap.Config config, File file, int i, int i2) {
        try {
            String canonicalPath = file.getCanonicalPath();
            Rect A0H = C1NC.A0H(canonicalPath);
            if (A0H.width() == 0 || A0H.height() == 0 || i == 0 || i2 == 0) {
                return null;
            }
            return C1NC.A03(config, canonicalPath, A0H.width(), A0H.height(), i, i2);
        } catch (IOException e) {
            AbstractC12120kG.A09("VideoFrameUtil", "could not read thumbnail path from file", e);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r11 > r9) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.graphics.Bitmap A02(X.MYJ r8, long r9, long r11) {
        /*
            r4 = 0
            r6 = 60000(0xea60, double:2.9644E-319)
            r2 = 0
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 > 0) goto Lf
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            r5 = 1
            if (r0 <= 0) goto L10
        Lf:
            r5 = 0
        L10:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = "Invalid frame time to extract video"
            X.C18C.A0J(r5, r0, r1)
            long r0 = r11 - r6
            long r2 = java.lang.Math.max(r2, r0)
            long r0 = r11 + r6
            long r5 = java.lang.Math.min(r0, r9)
            X.AoB r7 = new X.AoB
            r7.<init>(r2, r11)
            r8.A05 = r7
            X.MYK r0 = r8.A0A
            r0.A02 = r7
            r8.A01 = r2
            r0 = 500000(0x7a120, double:2.47033E-318)
            long r5 = r5 + r0
            r8.A00 = r5
            r8.A06 = r4
            r8.A07 = r4
            java.util.PriorityQueue r0 = r8.A0C
            r0.clear()
            r2 = 1
            r8.A01()
            android.graphics.Bitmap r0 = r7.A00
            if (r0 == 0) goto L48
            return r0
        L48:
            long r0 = X.AbstractC166987dD.A0L(r11)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object[] r1 = X.AbstractC166997dE.A1b(r0, r2)
            java.lang.String r0 = "Closest frame is null, time=%d"
            java.lang.String r1 = X.AbstractC166997dE.A0z(r0, r1)
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AMI.A02(X.MYJ, long, long):android.graphics.Bitmap");
    }

    public static final MYJ A03(Context context, UserSession userSession, C209059Mn c209059Mn, MYU myu, MYV myv, File file, long j, boolean z) {
        AbstractC167007dF.A1K(context, userSession);
        AbstractC167017dG.A1S(myu, myv);
        UserSession userSession2 = myv.A00;
        ClipInfo A02 = MY3.A02(userSession2, file, j);
        C9N6 A00 = C9N5.A00(c209059Mn.A00(new Point(A02.A09, A02.A06)), c209059Mn.A00(new Point(A02.A09, A02.A06)), A02);
        C9N8 c9n8 = new C9N8(context, userSession2, C9N7.A00(context, userSession2), XOT.A01, A00);
        Point point = A00.A03;
        int i = point.x;
        int i2 = point.y;
        C16930sl c16930sl = C16930sl.A00;
        AbstractC167007dF.A1I(c9n8, 2, c16930sl);
        return new MYJ(context, c9n8, userSession, myu, MYJ.A0G, file, c16930sl, i, i2, 0L, 0L, false, false, z);
    }

    public static final void A04(Bitmap bitmap, FileOutputStream fileOutputStream) {
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        C0fK.A01(compressFormat, bitmap, 100);
        if (bitmap.compress(compressFormat, 100, fileOutputStream)) {
        } else {
            throw new IOException("could not compress frame");
        }
    }
}
