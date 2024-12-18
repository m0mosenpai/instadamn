package X;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes7.dex */
public final class IK1 {
    public final View A00;
    public final CheckBox A01;
    public final ImageView A02;
    public final ImageView A03;
    public final TextView A04;
    public final TextView A05;
    public final InterfaceC56392iX A06;

    public IK1(View view) {
        C14360o3.A0B(view, 1);
        this.A00 = view;
        this.A02 = AbstractC31176DnK.A0D(view, R.id.catalog_image);
        this.A04 = AbstractC167007dF.A0N(view, R.id.catalog_main_text);
        this.A05 = AbstractC167007dF.A0N(view, R.id.catalog_sub_text);
        this.A01 = (CheckBox) AbstractC166997dE.A0R(view, R.id.catalog_checkbox);
        this.A03 = AbstractC31176DnK.A0D(view, R.id.info_image);
        this.A06 = AbstractC31179DnN.A0M(view, R.id.catalog_checkbox_spinner);
    }
}
