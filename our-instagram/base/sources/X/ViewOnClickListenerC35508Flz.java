package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Flz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35508Flz implements View.OnClickListener {
    public final /* synthetic */ C155966zQ A00;

    public ViewOnClickListenerC35508Flz(C155966zQ c155966zQ) {
        this.A00 = c155966zQ;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(506062298);
        C1YY A01 = FVI.A01();
        C155966zQ c155966zQ = this.A00;
        FragmentActivity fragmentActivity = c155966zQ.A00;
        UserSession userSession = c155966zQ.A03;
        User user = ((AbstractC155926zM) c155966zQ).A04.A02.A0O.A0J;
        if (user != null) {
            String id = user.getId();
            java.util.Set set = FE3.A00;
            A01.A05(fragmentActivity, userSession, id, "content_preview_activation_card");
            C0f9.A0C(1336462560, A05);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A0C(-988044301, A05);
        throw A0g;
    }
}
