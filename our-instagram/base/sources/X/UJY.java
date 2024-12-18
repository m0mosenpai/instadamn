package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class UJY extends C3OO {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UJY(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A08 = AbstractC167007dF.A0N(view, R.id.qp_item_title);
        this.A04 = AbstractC167007dF.A0N(view, R.id.qp_item_id_value);
        this.A06 = AbstractC167007dF.A0N(view, R.id.qp_item_surface_value);
        this.A01 = AbstractC167007dF.A0N(view, R.id.qp_item_content_value);
        this.A02 = AbstractC167007dF.A0N(view, R.id.qp_item_duration_value);
        this.A07 = AbstractC167007dF.A0N(view, R.id.qp_item_surface_info_value);
        this.A05 = AbstractC167007dF.A0N(view, R.id.qp_item_qualification_value);
        this.A03 = AbstractC167007dF.A0N(view, R.id.qp_item_error_value);
        this.A00 = AbstractC166997dE.A0S(view, R.id.qp_item_preview_button);
    }
}
