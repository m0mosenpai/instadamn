package X;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.9Ui, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210859Ui extends C3OO {
    public final CompoundButton A00;
    public final TextView A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C210859Ui(View view, CompoundButton compoundButton) {
        super(view);
        C14360o3.A0B(compoundButton, 2);
        this.A00 = compoundButton;
        this.A01 = (TextView) AbstractC166987dD.A0c(view, R.id.row_label);
    }
}
