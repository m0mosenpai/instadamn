package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* loaded from: classes6.dex */
public final class FNL {
    public final ViewGroup A00;
    public final CheckBox A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final CircularImageView A05;

    public FNL(View view) {
        this.A03 = AbstractC166997dE.A0T(view, R.id.page_name);
        this.A04 = AbstractC166997dE.A0T(view, R.id.page_sub_title);
        this.A02 = AbstractC166997dE.A0T(view, R.id.page_description);
        this.A05 = AbstractC31173DnH.A0T(view, R.id.page_profile_image);
        this.A00 = AbstractC31173DnH.A0F(view, R.id.row_page_container);
        CheckBox checkBox = (CheckBox) view.requireViewById(R.id.checkbox);
        this.A01 = checkBox;
        AbstractC56952jT.A04(checkBox, C05F.A02);
    }
}
