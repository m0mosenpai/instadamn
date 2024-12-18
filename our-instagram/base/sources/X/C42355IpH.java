package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.IpH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42355IpH implements InterfaceC73023Pd {
    public final int A00;
    public final Object A01;

    public C42355IpH(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC73023Pd
    public final void DFp() {
        BitmapDrawable bitmapDrawable;
        switch (this.A00) {
            case 0:
                ImageView imageView = (ImageView) this.A01;
                Drawable drawable = imageView.getContext().getDrawable(R.drawable.default_album_art_icon);
                Bitmap bitmap = null;
                if ((drawable instanceof BitmapDrawable) && (bitmapDrawable = (BitmapDrawable) drawable) != null) {
                    bitmap = bitmapDrawable.getBitmap();
                }
                imageView.setImageBitmap(bitmap);
                return;
            case 1:
                return;
            default:
                C39488HcG c39488HcG = (C39488HcG) this.A01;
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                RoundedCornerImageView roundedCornerImageView = c39488HcG.A08;
                AbstractC166997dE.A19(AbstractC31172DnG.A05(c39488HcG), roundedCornerImageView, R.drawable.instagram_music_pano_outline_24);
                roundedCornerImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                return;
        }
    }

    @Override // X.InterfaceC73023Pd
    public final void DPX(C73083Pj c73083Pj) {
        if (1 - this.A00 == 0) {
            ((HHK) this.A01).A09.A01(0);
        }
    }
}
