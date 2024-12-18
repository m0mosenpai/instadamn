package X;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.gallery.Draft;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;

/* renamed from: X.LYd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48280LYd implements BCZ {
    public Draft A00;
    public final CheckBox A01;
    public final ImageView A02;
    public final TextView A03;
    public final ColorFilterAlphaImageView A04;
    public final ConstrainedImageView A05;

    @Override // X.BCZ
    public final boolean CXY(Draft draft) {
        Draft draft2 = this.A00;
        if (draft2 != null && draft2.equals(draft)) {
            return true;
        }
        return false;
    }

    @Override // X.BCZ
    public final void Dt2(Bitmap bitmap, Draft draft) {
        ConstrainedImageView constrainedImageView = this.A05;
        constrainedImageView.setImageBitmap(bitmap);
        constrainedImageView.invalidate();
    }

    public C48280LYd(View view) {
        this.A05 = (ConstrainedImageView) view.requireViewById(R.id.draft_imageview);
        this.A01 = (CheckBox) view.requireViewById(R.id.media_toggle);
        this.A03 = AbstractC166997dE.A0T(view, R.id.video_duration);
        this.A02 = AbstractC31173DnH.A0I(view, R.id.shopping_indicator);
        this.A04 = (ColorFilterAlphaImageView) view.requireViewById(R.id.album_indicator);
    }
}
