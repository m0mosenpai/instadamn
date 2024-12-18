package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.facebook.R;
import com.instagram.creation.capture.quickcapture.cameratoolmenu.ui.EffectSlider;

/* loaded from: classes11.dex */
public final class UE6 extends ConstraintLayout implements InterfaceC25212BDk, X8N {
    public X8M A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final ImageView A04;
    public final TextView A05;
    public final C81W A06;
    public final EffectSlider A07;
    public final Guideline A08;

    public UE6(Context context, C81W c81w) {
        super(context, null, 0);
        this.A06 = c81w;
        EffectSlider effectSlider = (EffectSlider) AbstractC166987dD.A0c(this, R.id.secondary_slider);
        this.A07 = effectSlider;
        this.A05 = AbstractC25230BEn.A0Q(this, R.id.slider_value_text);
        ImageView imageView = (ImageView) AbstractC166987dD.A0c(this, R.id.tool_icon);
        this.A04 = imageView;
        this.A08 = (Guideline) AbstractC166987dD.A0c(this, R.id.guideline);
        Resources resources = getResources();
        this.A03 = resources.getDimensionPixelOffset(R.dimen.ad_not_delivering_thumbnail_height);
        this.A02 = resources.getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_width);
        AbstractC31174DnI.A1D(LayoutInflater.from(context).inflate(R.layout.layout_secondary_slider_view, (ViewGroup) this, true), this.A03, this.A02);
        setClickable(true);
        if (c81w == C81W.A0u) {
            imageView.setVisibility(8);
            C110964z8 c110964z8 = new C110964z8();
            c110964z8.A0I(this);
            c110964z8.A09(R.id.slider_value_text, 4);
            C110964z8.A02(c110964z8, R.id.slider_value_text).A03.A0p = resources.getDimensionPixelOffset(R.dimen.abc_edit_text_inset_top_material);
            c110964z8.A0G(this);
            effectSlider.setSliderThickness(VDM.A04);
            effectSlider.setSliderVibrationAction(VDN.A03);
            effectSlider.setSliderHandle(true);
        }
        effectSlider.A05 = true;
        effectSlider.A03 = this;
    }

    @Override // X.InterfaceC25212BDk
    public final boolean AFq() {
        return true;
    }

    @Override // X.InterfaceC25212BDk
    public final void DWs(float f) {
    }

    public final void setSecondarySliderValues(A56 a56) {
        C14360o3.A0B(a56, 0);
        EffectSlider effectSlider = this.A07;
        effectSlider.A02 = 10;
        effectSlider.A01 = 500;
        effectSlider.setSeekValue(a56.A00);
    }

    private final void A00(C110964z8 c110964z8, int i, boolean z) {
        int i2;
        int id;
        if (z) {
            i2 = this.A08.getId();
        } else {
            i2 = 0;
        }
        c110964z8.A0D(i, 1, i2, 1);
        if (z) {
            id = 0;
        } else {
            id = this.A08.getId();
        }
        c110964z8.A0D(i, 2, id, 2);
    }

    @Override // X.InterfaceC25212BDk
    public int getMenuHeight() {
        return this.A02;
    }

    @Override // X.InterfaceC25212BDk
    public int getMenuWidth() {
        return this.A03;
    }

    public View getView() {
        return this;
    }

    @Override // X.InterfaceC25212BDk
    public void setIsOnRightSide(boolean z) {
        this.A01 = z;
        C110964z8 c110964z8 = new C110964z8();
        c110964z8.A0I(this);
        A00(c110964z8, this.A07.getId(), !this.A01);
        A00(c110964z8, this.A04.getId(), this.A01);
        A00(c110964z8, this.A05.getId(), this.A01);
        c110964z8.A0G(this);
    }

    public final void setToolDrawable(Drawable drawable) {
        this.A04.setImageDrawable(drawable);
    }

    public final void setListener(X8M x8m) {
        this.A00 = x8m;
    }
}
