package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Gvz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38478Gvz extends C3OO {
    public final ViewGroup A00;
    public final TextView A01;
    public final TextView A02;
    public final /* synthetic */ C37516GfY A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38478Gvz(View view, C37516GfY c37516GfY) {
        super(view);
        C14360o3.A0B(view, 2);
        this.A03 = c37516GfY;
        ViewGroup A0C = AbstractC31176DnK.A0C(view, R.id.disclosure_bar_container);
        this.A00 = A0C;
        TextView A0N = AbstractC167007dF.A0N(view, R.id.disclosure_header);
        this.A02 = A0N;
        TextView A0N2 = AbstractC167007dF.A0N(view, R.id.disclosure_body);
        this.A01 = A0N2;
        A0N.setText(2131960963);
        A0N2.setText(2131960960);
        ViewOnClickListenerC38053Gog.A03(A0C, 51, view, c37516GfY);
    }
}
