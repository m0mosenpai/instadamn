package X;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.E2t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31965E2t extends C3OO {
    public final TextView A00;
    public final TextView A01;
    public final ConstraintLayout A02;
    public final IgImageView A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31965E2t(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A02 = (ConstraintLayout) AbstractC166987dD.A0c(view, R.id.direct_inbox_message_setting_container);
        this.A01 = AbstractC25230BEn.A0Q(view, R.id.direct_inbox_message_setting_title);
        this.A00 = AbstractC25230BEn.A0Q(view, R.id.direct_inbox_message_setting_description);
        this.A03 = (IgImageView) AbstractC166987dD.A0c(view, R.id.direct_inbox_message_setting_nav_button);
    }
}
