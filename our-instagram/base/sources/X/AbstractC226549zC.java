package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.instagram.common.gallery.model.GalleryItem;

/* renamed from: X.9zC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226549zC {
    public static final void A00(C9V3 c9v3, C195608l0 c195608l0, InterfaceC195388ke interfaceC195388ke) {
        BitmapDrawable bitmapDrawable = (BitmapDrawable) c9v3.A0A.getDrawable();
        if (bitmapDrawable != null) {
            boolean z = c195608l0.A08;
            if (z) {
                c9v3.A01 = true;
            }
            GalleryItem galleryItem = c195608l0.A03;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            C14360o3.A07(bitmap);
            interfaceC195388ke.DNu(galleryItem, new C9NP(bitmap), c9v3.getAbsoluteAdapterPosition(), z);
            return;
        }
        interfaceC195388ke.DNu(c195608l0.A03, AiD.A00, c9v3.getAbsoluteAdapterPosition(), c195608l0.A08);
    }
}
