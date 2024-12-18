package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.Gvo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38467Gvo extends C3OO {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final RoundedCornerImageView A03;

    public C38467Gvo(View view) {
        super(view);
        this.A00 = view;
        this.A03 = (RoundedCornerImageView) AbstractC166997dE.A0R(view, R.id.product_image);
        this.A01 = AbstractC167007dF.A0N(view, R.id.product_name);
        this.A02 = AbstractC167007dF.A0N(view, R.id.product_price);
    }
}
