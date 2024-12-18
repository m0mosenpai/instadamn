package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Fnu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35603Fnu implements View.OnClickListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ User A03;

    public ViewOnClickListenerC35603Fnu(View view, FragmentActivity fragmentActivity, UserSession userSession, User user) {
        this.A02 = userSession;
        this.A03 = user;
        this.A01 = fragmentActivity;
        this.A00 = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(327846802);
        UserSession userSession = this.A02;
        C1567972f.A04(this.A01, userSession, this.A03);
        C1567972f.A03(this.A00, userSession);
        C0f9.A0C(1201990353, A05);
    }
}
