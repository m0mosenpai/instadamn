package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.FNv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34638FNv {
    public final View A00;
    public final View A01;
    public final ViewGroup A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;

    public C34638FNv(View view) {
        C14360o3.A0B(view, 1);
        this.A00 = AbstractC166997dE.A0S(view, R.id.like_and_view_count_header_container);
        this.A02 = AbstractC31176DnK.A0C(view, R.id.like_and_view_count_container);
        this.A05 = AbstractC167007dF.A0N(view, R.id.like_count_text);
        this.A06 = AbstractC167007dF.A0N(view, R.id.video_view_count_text);
        this.A04 = AbstractC167007dF.A0N(view, R.id.impression_count_text);
        this.A03 = AbstractC167007dF.A0N(view, R.id.explanation_message);
        this.A01 = AbstractC166997dE.A0S(view, R.id.divider);
    }
}
