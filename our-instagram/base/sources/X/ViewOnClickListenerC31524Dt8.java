package X;

import android.view.View;
import com.instagram.user.model.User;

/* renamed from: X.Dt8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC31524Dt8 implements View.OnClickListener {
    public final /* synthetic */ C72q A00;
    public final /* synthetic */ User A01;

    public ViewOnClickListenerC31524Dt8(C72q c72q, User user) {
        this.A00 = c72q;
        this.A01 = user;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        GBV A02;
        int A05 = C0f9.A05(-1272335497);
        C72q c72q = this.A00;
        if (c72q != null && (A02 = c72q.A02()) != null) {
            A02.A07(AbstractC166997dE.A0L(view), this.A01, "user_profile_header");
        }
        C0f9.A0C(126828079, A05);
    }
}
