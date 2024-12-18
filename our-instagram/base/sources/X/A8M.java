package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes4.dex */
public final class A8M {
    public final TextView A00;
    public final TextView A01;
    public final TextView A02;

    public A8M(View view) {
        C14360o3.A0B(view, 1);
        TextView A0N = AbstractC167007dF.A0N(view, R.id.bottom_notice_text_title);
        TextView A0N2 = AbstractC167007dF.A0N(view, R.id.bottom_notice_text_subtitle);
        TextView A0N3 = AbstractC167007dF.A0N(view, R.id.bottom_notice_text_cta);
        this.A02 = A0N;
        this.A01 = A0N2;
        this.A00 = A0N3;
    }
}
