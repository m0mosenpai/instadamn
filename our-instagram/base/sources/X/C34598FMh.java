package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.FMh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34598FMh {
    public final View A00;
    public final View A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextView A04;

    public C34598FMh(View view) {
        C14360o3.A0B(view, 1);
        this.A01 = view;
        this.A04 = AbstractC167007dF.A0N(view, R.id.row_venue_title);
        this.A03 = AbstractC167007dF.A0N(view, R.id.row_venue_subtitle);
        this.A02 = AbstractC31176DnK.A0D(view, R.id.row_place_icon);
        this.A00 = AbstractC166997dE.A0S(view, R.id.row_divider);
    }
}
