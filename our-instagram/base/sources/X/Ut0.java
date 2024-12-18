package X;

import com.instagram.ui.widget.selectableview.RoundedCornerCheckMarkSelectableImageView;

/* loaded from: classes11.dex */
public final class Ut0 extends C668630d {
    public final /* synthetic */ RoundedCornerCheckMarkSelectableImageView A00;

    public Ut0(RoundedCornerCheckMarkSelectableImageView roundedCornerCheckMarkSelectableImageView) {
        this.A00 = roundedCornerCheckMarkSelectableImageView;
    }

    @Override // X.C668630d, X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        float f = 1.0f - (((float) c55982hj.A09.A00) * 0.05f);
        RoundedCornerCheckMarkSelectableImageView roundedCornerCheckMarkSelectableImageView = this.A00;
        roundedCornerCheckMarkSelectableImageView.setScaleX(f);
        roundedCornerCheckMarkSelectableImageView.setScaleY(f);
    }
}
