package X;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.google.android.material.datepicker.MaterialCalendarGridView;

/* loaded from: classes11.dex */
public final class UIR extends C3OO {
    public final TextView A00;
    public final MaterialCalendarGridView A01;

    public UIR(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.A00 = textView;
        AbstractC010103p.A0I(textView, true);
        this.A01 = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (!z) {
            textView.setVisibility(8);
        }
    }
}
