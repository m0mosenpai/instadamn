package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.GvZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38452GvZ extends C3OO {
    public final TextView A00;
    public final View A01;
    public final TextView A02;

    public C38452GvZ(View view) {
        super(view);
        this.A01 = view;
        TextView A0N = AbstractC167007dF.A0N(view, R.id.keyword_name);
        this.A00 = A0N;
        TextView A0N2 = AbstractC167007dF.A0N(view, R.id.see_all);
        this.A02 = A0N2;
        A0N.setFocusable(true);
        A0N2.setFocusable(true);
        AbstractC56952jT.A01(A0N2);
    }
}
