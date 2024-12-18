package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class OEY {
    public String A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final ImageView A04;
    public final TextView A05;
    public final TextView A06;

    public OEY(View view) {
        C14360o3.A0B(view, 1);
        this.A05 = AbstractC166987dD.A0e(view, R.id.text);
        this.A06 = AbstractC166987dD.A0e(view, R.id.serial);
        this.A02 = view.findViewById(R.id.serial_layout);
        this.A04 = (ImageView) view.findViewById(R.id.selected);
        this.A01 = view.findViewById(R.id.answer_container);
        this.A03 = view.findViewById(R.id.serial_layout_extra_margin);
    }
}
