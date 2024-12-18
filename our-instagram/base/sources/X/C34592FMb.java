package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.FMb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34592FMb {
    public final ViewGroup A00;
    public final CheckBox A01;
    public final TextView A02;
    public final TextView A03;
    public final CircularImageView A04;

    public C34592FMb(View view) {
        C14360o3.A0B(view, 1);
        this.A03 = AbstractC167007dF.A0N(view, R.id.row_page_name);
        this.A02 = AbstractC167007dF.A0N(view, R.id.row_page_category);
        this.A04 = AbstractC31176DnK.A0U(view, R.id.row_page_imageview);
        CheckBox checkBox = (CheckBox) AbstractC166997dE.A0R(view, R.id.checkbox);
        this.A01 = checkBox;
        this.A00 = AbstractC31176DnK.A0C(view, R.id.row_page_container);
        AbstractC56952jT.A04(checkBox, C05F.A02);
    }
}
