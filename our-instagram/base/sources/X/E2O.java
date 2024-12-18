package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

/* loaded from: classes6.dex */
public final class E2O extends C3OO {
    public final TextView A00;
    public final TextView A01;
    public final ColorFilterAlphaImageView A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E2O(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A01 = AbstractC31178DnM.A0C(view);
        this.A00 = AbstractC167007dF.A0N(view, R.id.message);
        this.A02 = (ColorFilterAlphaImageView) AbstractC166997dE.A0R(view, R.id.dismiss_button);
    }
}
