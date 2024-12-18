package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class NXT extends AbstractC51363MmO {
    public final View A00;
    public final View A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NXT(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A00 = view;
        TextView A0e = AbstractC166987dD.A0e(view, R.id.button_label);
        C14360o3.A0B(A0e, 0);
        super.A01 = A0e;
        ImageView A08 = AbstractC31171DnF.A08(this.A00, R.id.button);
        C14360o3.A0B(A08, 0);
        super.A00 = A08;
        this.A01 = this.A00.findViewById(R.id.divider);
    }
}
