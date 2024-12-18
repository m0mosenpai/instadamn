package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.Vip, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69160Vip {
    public final ConstraintLayout A00;
    public final IgdsButton A01;
    public final IgdsButton A02;

    public C69160Vip(View view) {
        this.A00 = (ConstraintLayout) AbstractC166987dD.A0c(view, R.id.feedback_buttons_container);
        this.A01 = (IgdsButton) AbstractC166987dD.A0c(view, R.id.irrelevant_match_button);
        this.A02 = (IgdsButton) AbstractC166987dD.A0c(view, R.id.relevant_match_button);
    }
}
