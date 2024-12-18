package X;

import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class E2C extends C3OO {
    public final RadioButton A00;
    public final TextView A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E2C(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A01 = AbstractC167007dF.A0N(view, R.id.follow_list_sorting_option);
        this.A00 = (RadioButton) AbstractC166997dE.A0R(view, R.id.follow_list_sorting_option_radio_button);
    }
}
