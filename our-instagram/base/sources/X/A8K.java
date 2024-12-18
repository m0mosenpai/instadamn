package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* loaded from: classes4.dex */
public final class A8K {
    public final TextView A00;
    public final TextView A01;
    public final RoundedCornerImageView A02;

    public A8K(View view) {
        this.A02 = (RoundedCornerImageView) AbstractC166997dE.A0R(view, R.id.favicon);
        this.A01 = AbstractC167007dF.A0N(view, R.id.title);
        this.A00 = AbstractC167007dF.A0N(view, R.id.body);
    }
}
