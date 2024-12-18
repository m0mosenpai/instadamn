package X;

import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.VnS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69443VnS {
    public final View A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final ImageView A05;
    public final IgTextView A06;
    public final IgTextView A07;
    public final IgTextView A08;
    public final IgTextView A09;
    public final IgTextView A0A;

    public C69443VnS(View view) {
        C14360o3.A0B(view, 1);
        this.A04 = view;
        this.A01 = AbstractC166997dE.A0S(view, R.id.location_information_wrapper);
        this.A09 = AbstractC25231BEo.A0d(view, R.id.location_info_row_1);
        this.A0A = AbstractC25231BEo.A0d(view, R.id.location_info_row_2);
        this.A02 = AbstractC166997dE.A0S(view, R.id.location_info_link_wrapper);
        this.A06 = AbstractC25231BEo.A0d(view, R.id.location_directions);
        this.A08 = AbstractC25231BEo.A0d(view, R.id.links_separator);
        this.A07 = AbstractC25231BEo.A0d(view, R.id.location_information);
        this.A00 = AbstractC166997dE.A0S(view, R.id.direct_button);
        this.A03 = AbstractC166997dE.A0S(view, R.id.save_button);
        this.A05 = AbstractC31176DnK.A0D(view, R.id.save_icon);
    }
}
