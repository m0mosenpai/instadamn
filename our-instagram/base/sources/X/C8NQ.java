package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.instagram.common.ui.widget.textureview.MultiListenerTextureView;

/* renamed from: X.8NQ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8NQ {
    public Bitmap A00;
    public final C57012jc A01;
    public final C81N A02;
    public final AnonymousClass840 A03;

    public C8NQ(C57012jc c57012jc, C81N c81n, AnonymousClass840 anonymousClass840) {
        C14360o3.A0B(c81n, 3);
        this.A01 = c57012jc;
        this.A03 = anonymousClass840;
        this.A02 = c81n;
    }

    public final void A00() {
        C57012jc c57012jc = this.A01;
        if (c57012jc.A04()) {
            ((ImageView) c57012jc.A01()).setImageDrawable(null);
        }
        c57012jc.A03(8);
        Bitmap bitmap = this.A00;
        if (bitmap != null) {
            bitmap.recycle();
            this.A00 = null;
        }
    }

    public final void A01() {
        if (this.A03.A02.A01() == EnumC198268pb.A07) {
            Bitmap bitmap = this.A00;
            C81N c81n = this.A02;
            if (bitmap == null) {
                MultiListenerTextureView multiListenerTextureView = c81n.A0D;
                if (multiListenerTextureView != null) {
                    bitmap = multiListenerTextureView.getBitmap();
                } else {
                    bitmap = null;
                }
            } else {
                c81n.A03(bitmap);
                bitmap.setPixel(0, 0, bitmap.getPixel(0, 0));
            }
            this.A00 = bitmap;
            if (bitmap != null) {
                C57012jc c57012jc = this.A01;
                c57012jc.A03(0);
                ((ImageView) c57012jc.A01()).setImageBitmap(this.A00);
                c57012jc.A01().invalidate();
            }
        }
    }
}
