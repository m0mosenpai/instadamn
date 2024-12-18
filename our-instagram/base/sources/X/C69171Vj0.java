package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Vj0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69171Vj0 {
    public final View A00;
    public final TextView A01;
    public final TextView A02;

    public C69171Vj0(View view) {
        this.A00 = view;
        this.A02 = (TextView) view.requireViewById(R.id.bottom_sheet_header_title);
        TextView textView = (TextView) view.requireViewById(R.id.bottom_sheet_header_info);
        this.A01 = textView;
        AbstractC25227BEk.A11(textView);
    }
}
