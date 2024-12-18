package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.shopping.widget.clickabletext.ClickableTextContainer;

/* renamed from: X.Viq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69161Viq {
    public final int A00;
    public final TextView A01;
    public final ClickableTextContainer A02;

    public C69161Viq(View view) {
        ClickableTextContainer clickableTextContainer = (ClickableTextContainer) AbstractC166987dD.A0c(view, R.id.labels_container);
        this.A02 = clickableTextContainer;
        TextView A0Q = AbstractC25230BEn.A0Q(clickableTextContainer, R.id.labels);
        this.A01 = A0Q;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.account_group_management_row_text_size);
        this.A00 = dimensionPixelSize;
        AbstractC010103p.A0B(clickableTextContainer, new UEF(3));
        AbstractC25227BEk.A11(A0Q);
        C13680mu.A03(A0Q, dimensionPixelSize);
    }
}
