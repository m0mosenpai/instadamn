package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class UJ3 extends C3OO {
    public final TextView A00;
    public final TextView A01;
    public final TextView A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UJ3(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A02 = AbstractC167007dF.A0N(view, R.id.qp_raw_text_toggle_cta);
        this.A00 = AbstractC167007dF.A0N(view, R.id.qp_copy_text_button);
        this.A01 = AbstractC167007dF.A0N(view, R.id.qp_raw_text_body);
    }
}
