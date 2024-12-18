package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class FN2 {
    public final View A00;
    public final ImageView A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextView A04;

    public FN2(View view) {
        C14360o3.A0B(view, 1);
        this.A00 = view;
        this.A04 = AbstractC167007dF.A0N(view, R.id.link_option_text);
        this.A03 = AbstractC167007dF.A0N(view, R.id.link_option_sub_text);
        this.A01 = AbstractC31176DnK.A0D(view, R.id.link_option_icon);
        this.A02 = AbstractC31176DnK.A0D(view, R.id.link_option_overflow_icon);
    }
}
