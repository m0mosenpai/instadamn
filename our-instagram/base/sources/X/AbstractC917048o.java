package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

/* renamed from: X.48o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC917048o {
    public static File A00;

    public static final String A02(Bitmap bitmap) {
        C14360o3.A0B(bitmap, 0);
        File A002 = A00();
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(A002));
            try {
                C0fK.A02(Bitmap.CompressFormat.PNG, bitmap, bufferedOutputStream, 100);
                bufferedOutputStream.close();
                String canonicalPath = A002.getCanonicalPath();
                C14360o3.A07(canonicalPath);
                return canonicalPath;
            } finally {
            }
        } catch (Exception e) {
            C0w9.A06("PhotoStorageUtil", "Failed while trying to save bitmap decor image", e);
            throw new RuntimeException(e);
        }
    }

    public static final String A03(Drawable drawable) {
        C14360o3.A0B(drawable, 0);
        Rect bounds = drawable.getBounds();
        C14360o3.A07(bounds);
        Bitmap createBitmap = Bitmap.createBitmap(bounds.width(), bounds.height(), Bitmap.Config.ARGB_8888);
        C14360o3.A07(createBitmap);
        Canvas canvas = new Canvas(createBitmap);
        canvas.save();
        canvas.translate(-bounds.left, -bounds.top);
        drawable.draw(canvas);
        canvas.restore();
        return A02(createBitmap);
    }

    public static final File A00() {
        String A04 = A04("quick_cam_decor", ".png");
        File file = new File(A01(), A04);
        try {
            file.createNewFile();
            return file;
        } catch (IOException unused) {
            return new File(C50472Tr.A01(), A04);
        }
    }

    public static final File A01() {
        File file = A00;
        if (file == null) {
            File AXd = AbstractC23881Ey.A00().AXd(null, 653514818);
            A00 = AXd;
            return AXd;
        }
        return file;
    }

    public static final String A04(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('_');
        sb.append(UUID.randomUUID());
        sb.append(str2);
        return sb.toString();
    }
}
