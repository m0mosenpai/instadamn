package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class VgP {
    public final View A00;
    public final TextView A01;

    public VgP(View view) {
        this.A00 = view;
        this.A01 = (TextView) view.requireViewById(R.id.bottom_sheet_subtitle);
    }
}
