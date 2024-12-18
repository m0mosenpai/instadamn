package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;

/* renamed from: X.Jr3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44720Jr3 extends C3OO {
    public final TextView A00;
    public final TextView A01;
    public final CircularImageView A02;
    public final ConstrainedImageView A03;

    public C44720Jr3(View view) {
        super(view);
        this.A02 = AbstractC31176DnK.A0U(view, R.id.row_avatar);
        this.A00 = AbstractC167007dF.A0N(view, R.id.primary_name);
        this.A01 = AbstractC167007dF.A0N(view, R.id.subtitle);
        this.A03 = (ConstrainedImageView) AbstractC166997dE.A0R(view, R.id.main_emoji);
    }
}
