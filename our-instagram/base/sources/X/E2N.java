package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes6.dex */
public final class E2N extends C3OO {
    public final IgTextView A00;
    public final IgTextView A01;
    public final IgTextView A02;

    public E2N(View view) {
        super(view);
        this.A01 = AbstractC25231BEo.A0d(view, R.id.row_order_number);
        this.A02 = AbstractC25231BEo.A0d(view, R.id.row_order_price);
        this.A00 = AbstractC25231BEo.A0d(view, R.id.row_order_date_status);
    }
}
