package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Jqe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44695Jqe extends C3OO {
    public final View A00;
    public final View A01;
    public final TextView A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44695Jqe(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A00 = AbstractC166997dE.A0S(view, R.id.new_message_left_separator);
        this.A01 = AbstractC166997dE.A0S(view, R.id.new_message_right_separator);
        this.A02 = AbstractC167007dF.A0N(view, R.id.new_message_text);
    }
}
