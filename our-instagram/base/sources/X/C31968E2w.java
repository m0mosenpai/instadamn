package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.E2w, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31968E2w extends C3OO {
    public final TextView A00;
    public final TextView A01;
    public final TextView A02;
    public final CircularImageView A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31968E2w(View view) {
        super(view);
        C14360o3.A0A(view);
        this.A03 = AbstractC31176DnK.A0U(view, R.id.direct_action_row_avatar);
        this.A00 = AbstractC167007dF.A0N(view, R.id.direct_action_row_name);
        this.A01 = AbstractC167007dF.A0N(view, R.id.direct_action_row_status);
        this.A02 = AbstractC167007dF.A0N(view, R.id.direct_action_row_time_stamp);
    }
}
