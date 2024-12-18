package X;

import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Vj1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69172Vj1 {
    public final View A00;
    public final RadioButton A01;
    public final TextView A02;

    public C69172Vj1(View view) {
        this.A00 = view;
        this.A02 = (TextView) view.requireViewById(R.id.report_tag_title);
        this.A01 = (RadioButton) view.requireViewById(R.id.report_tag_radio_button);
    }
}
