package X;

import android.graphics.Bitmap;
import com.instagram.util.creation.RenderBridge;
import java.nio.ByteBuffer;

/* renamed from: X.OOp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54877OOp {
    public static final Bitmap A00(int i, int i2, int i3) {
        try {
            if (RenderBridge.isCacheKeyValid(i) && (!RenderBridge.freeCachedImage(i) || RenderBridge.isCacheKeyValid(i))) {
                AbstractC12120kG.A0D("SavePhotoUtil", "Cached image could not be freed", null);
            }
            ByteBuffer A00 = AbstractC66019TyH.A00(i2, i3);
            AbstractC66019TyH.A01(A00, i2, i3);
            Bitmap A0F = AbstractC167007dF.A0F(i2, i3);
            A0F.copyPixelsFromBuffer(A00);
            return A0F;
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    public static final OWX A01(Bitmap bitmap, OEN oen, int i, int i2, int i3) {
        String str;
        int intValue = oen.A03.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                str = "image/webp";
            } else {
                str = "image/jpeg";
            }
        } else {
            str = "image/heic";
        }
        return new OWX(bitmap, oen, str, i, i2, i3, -1);
    }
}
