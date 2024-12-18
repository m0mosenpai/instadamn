package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes6.dex */
public final class EYT extends AbstractC66422zJ {
    public final GZF A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new E2W(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.layout_meta_ai_prompt_pill, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C32098E8w c32098E8w = (C32098E8w) interfaceC66482zP;
        E2W e2w = (E2W) c3oo;
        AbstractC167017dG.A1N(c32098E8w, e2w);
        String str = c32098E8w.A05;
        int length = str.length();
        boolean z = true;
        IgTextView igTextView = e2w.A02;
        if (length == 0) {
            igTextView.setVisibility(8);
        } else {
            igTextView.setText(str);
        }
        Integer num = c32098E8w.A03;
        if (num != null) {
            int intValue = num.intValue();
            if (length != 0) {
                z = false;
            }
            Drawable drawable = AbstractC31172DnG.A05(e2w).getDrawable(intValue);
            int i = igTextView.getResources().getDisplayMetrics().widthPixels;
            int A01 = C13680mu.A01(igTextView.getContext(), igTextView.getTypeface(), "", igTextView.getLineSpacingMultiplier(), (int) igTextView.getTextSize(), i);
            IgSimpleImageView igSimpleImageView = e2w.A01;
            Resources resources = igSimpleImageView.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.account_recs_header_image_margin) + A01;
            AbstractC13880nE.A0h(igSimpleImageView, dimensionPixelSize, dimensionPixelSize);
            igSimpleImageView.setImageDrawable(drawable);
            if (z) {
                int dimensionPixelSize2 = A01 + resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material) + resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
                IgLinearLayout igLinearLayout = e2w.A00;
                AbstractC13880nE.A0h(igLinearLayout, dimensionPixelSize2, dimensionPixelSize2);
                AbstractC13880nE.A0l(igLinearLayout, 0, 0, 0, 0);
            } else {
                AbstractC13880nE.A0V(igSimpleImageView, resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material));
            }
            igSimpleImageView.requestLayout();
            igSimpleImageView.setVisibility(0);
        }
        C3P9 c3p9 = new C3P9(AbstractC31171DnF.A06(e2w));
        c3p9.A04 = new EZP(2, c32098E8w, this);
        c3p9.A05 = C05F.A01;
        c3p9.A00();
        this.A00.EDy(e2w.A00, c32098E8w);
    }

    public EYT(GZF gzf) {
        this.A00 = gzf;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C32098E8w.class;
    }
}
