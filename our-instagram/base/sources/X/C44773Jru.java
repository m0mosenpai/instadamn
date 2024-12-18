package X;

import android.graphics.Bitmap;
import android.view.View;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.Jru, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44773Jru extends C3OO implements InterfaceC193488hT {
    public View.OnLayoutChangeListener A00;
    public C193498hU A01;
    public Medium A02;
    public final IgTextView A03;
    public final RoundedCornerImageView A04;
    public final Integer A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44773Jru(View view, MOO moo, Integer num, boolean z) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A05 = num;
        RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) AbstractC166997dE.A0R(view, R.id.gallery_sticker_grid_item_thumbnail);
        this.A04 = roundedCornerImageView;
        this.A03 = AbstractC25231BEo.A0d(view, R.id.gallery_sticker_grid_item_label);
        if (z) {
            roundedCornerImageView.setRadius(AbstractC167017dG.A0A(view.getContext()));
        }
        roundedCornerImageView.setBitmapShaderScaleType(C3OB.A02);
        C3P9 A0s = AbstractC166987dD.A0s(roundedCornerImageView);
        A0s.A0D = true;
        A0s.A07 = true;
        A0s.A02 = 0.92f;
        KKo.A00(A0s, moo, this, 2);
    }

    @Override // X.InterfaceC193488hT
    public final boolean CXZ(Medium medium) {
        C14360o3.A0B(medium, 0);
        return medium.equals(this.A02);
    }

    @Override // X.InterfaceC193488hT
    public final void DN1(Medium medium, String str) {
    }

    public final void A00(Bitmap bitmap, Medium medium) {
        Integer num;
        RoundedCornerImageView roundedCornerImageView = this.A04;
        roundedCornerImageView.setImageBitmap(bitmap);
        if (medium.Cff() && (num = this.A05) != null && medium.A03 < num.intValue()) {
            AbstractC31173DnH.A11(AbstractC31172DnG.A05(this), roundedCornerImageView, R.color.grey_10_80_transparent);
        } else {
            roundedCornerImageView.clearColorFilter();
        }
    }

    @Override // X.InterfaceC193488hT
    public final void Dt1(Bitmap bitmap, Medium medium, boolean z) {
        AbstractC167017dG.A1O(medium, bitmap);
        RoundedCornerImageView roundedCornerImageView = this.A04;
        if (roundedCornerImageView.getWidth() > 0 && roundedCornerImageView.getHeight() > 0) {
            A00(bitmap, medium);
            return;
        }
        LQD lqd = new LQD(1, medium, this, bitmap);
        this.A00 = lqd;
        roundedCornerImageView.addOnLayoutChangeListener(lqd);
    }
}
