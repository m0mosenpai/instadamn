package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class E3R extends C3OO {
    public final View A00;
    public final ImageView A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;

    public E3R(View view) {
        super(view);
        this.A00 = view;
        this.A01 = AbstractC31176DnK.A0D(view, R.id.image_check_list_item);
        this.A05 = AbstractC167007dF.A0N(view, R.id.text_check_list_item);
        this.A04 = AbstractC166987dD.A0e(view, R.id.text_check_list_item_subtitle);
        this.A02 = AbstractC31176DnK.A0D(view, R.id.image_check_list_item_status);
        this.A03 = AbstractC167007dF.A0N(view, R.id.text_progress);
    }
}
