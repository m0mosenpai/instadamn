package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.shopping.widget.clickabletext.ClickableTextContainer;

/* loaded from: classes7.dex */
public final class IHK {
    public final TextView A00;
    public final TextView A01;
    public final ClickableTextContainer A02;

    public IHK(View view) {
        ClickableTextContainer clickableTextContainer = (ClickableTextContainer) AbstractC166987dD.A0c(view, R.id.labels_container);
        this.A02 = clickableTextContainer;
        this.A00 = AbstractC25230BEn.A0Q(clickableTextContainer, R.id.product_name_label);
        TextView A0Q = AbstractC25230BEn.A0Q(clickableTextContainer, R.id.secondary_labels);
        this.A01 = A0Q;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.account_group_management_row_text_size);
        AbstractC010103p.A0B(clickableTextContainer, new UEF(2));
        AbstractC25227BEk.A11(A0Q);
        C13680mu.A03(A0Q, dimensionPixelSize);
    }
}
