package X;

import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;

/* loaded from: classes6.dex */
public final class E3F extends C3OO {
    public final TextView A00;
    public final TextView A01;
    public final UserSession A02;
    public final IgSimpleImageView A03;
    public final FragmentActivity A04;

    public E3F(UserSession userSession, FragmentActivity fragmentActivity, View view) {
        super(view);
        this.A04 = fragmentActivity;
        this.A02 = userSession;
        this.A03 = AbstractC31176DnK.A0T(view, R.id.icon);
        this.A00 = AbstractC167007dF.A0N(view, R.id.primary_text);
        this.A01 = AbstractC167007dF.A0N(view, R.id.secondary_text);
    }
}
