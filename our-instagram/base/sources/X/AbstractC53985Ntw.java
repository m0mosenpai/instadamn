package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import com.facebook.R;

/* renamed from: X.Ntw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53985Ntw {
    public static final Bitmap A00(Context context, Bitmap bitmap) {
        C14360o3.A0B(bitmap, 1);
        Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        Canvas A06 = AbstractC43592JPx.A06(copy);
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.meta_ai_watermark);
        int width = (int) (bitmap.getWidth() * 0.02d);
        int width2 = (int) (bitmap.getWidth() * 0.14d);
        int width3 = (int) (width2 / (decodeResource.getWidth() / decodeResource.getHeight()));
        int height = (bitmap.getHeight() - width3) - width;
        A06.drawBitmap(decodeResource, AbstractC50522MSa.A0D(decodeResource), AbstractC166987dD.A0V(width, height, width2 + width, width3 + height), AbstractC166987dD.A0R());
        C14360o3.A0A(copy);
        return copy;
    }
}
