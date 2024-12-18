package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* renamed from: X.AFg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23074AFg {
    public static final BitmapFactory.Options A00 = new BitmapFactory.Options();

    public static final AnonymousClass810 A00(Bitmap bitmap) {
        AnonymousClass811 anonymousClass811 = new AnonymousClass811("GlInputHelper");
        anonymousClass811.A00 = 6408;
        anonymousClass811.A05 = bitmap;
        anonymousClass811.A07 = true;
        AnonymousClass810 anonymousClass810 = new AnonymousClass810(anonymousClass811);
        AbstractC180237zD.A02("makeBitmapTexture", new Object[0]);
        if (anonymousClass810.A00 > 0) {
            return anonymousClass810;
        }
        throw AbstractC166987dD.A12("TextureHelper#createTexture Failed to create texture from bitmap");
    }
}
