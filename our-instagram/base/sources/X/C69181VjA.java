package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.VjA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69181VjA {
    public final View A00;
    public final TextView A01;
    public final TextView A02;

    public C69181VjA(View view) {
        C14360o3.A0B(view, 1);
        this.A00 = view;
        this.A02 = (TextView) view.requireViewById(R.id.dashboard_section_header_title);
        this.A01 = (TextView) view.requireViewById(R.id.dashboard_section_header_subtitle);
    }
}
