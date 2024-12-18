package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Jqi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44699Jqi extends C3OO {
    public final ImageView A00;
    public final TextView A01;
    public final TextView A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44699Jqi(View view, C47435KxQ c47435KxQ) {
        super(view);
        C14360o3.A0B(c47435KxQ, 2);
        this.A02 = AbstractC167007dF.A0N(view, R.id.sort_and_filter_label);
        this.A01 = AbstractC167007dF.A0N(view, R.id.sort_and_filter_subtitle);
        ImageView A0D = AbstractC31176DnK.A0D(view, R.id.sort_and_filter_button);
        this.A00 = A0D;
        C0fQ.A00(new ViewOnClickListenerC48074LPz(c47435KxQ, 32), A0D);
    }
}
