package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes11.dex */
public final class V5E extends AbstractC66412zI {
    public final InterfaceC11380iw A00;
    public final InterfaceC16660sJ A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C66470UIu(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.row_appreciation_gift_feed_filter_button, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C70791Wh4 c70791Wh4 = (C70791Wh4) interfaceC66482zP;
        C66470UIu c66470UIu = (C66470UIu) c3oo;
        AbstractC167007dF.A1K(c70791Wh4, c66470UIu);
        String str = c70791Wh4.A03;
        IgTextView igTextView = c66470UIu.A01;
        if (str == null) {
            igTextView.setVisibility(8);
        } else {
            igTextView.setText(str);
            igTextView.setSelected(c70791Wh4.A04);
            igTextView.setVisibility(0);
        }
        ImageUrl imageUrl = c70791Wh4.A01;
        IgImageView igImageView = c66470UIu.A02;
        if (imageUrl == null) {
            igImageView.setVisibility(8);
        } else {
            igImageView.setUrl(imageUrl, this.A00);
            igImageView.setVisibility(0);
        }
        ConstraintLayout constraintLayout = c66470UIu.A00;
        constraintLayout.setSelected(c70791Wh4.A04);
        WNV.A00(constraintLayout, 35, c70791Wh4, this);
        constraintLayout.setContentDescription(c70791Wh4.A02);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C70791Wh4.class;
    }

    public V5E(InterfaceC11380iw interfaceC11380iw, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC11380iw;
        this.A01 = interfaceC16660sJ;
    }
}
