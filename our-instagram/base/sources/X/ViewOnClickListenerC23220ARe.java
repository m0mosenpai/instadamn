package X;

import android.view.View;
import com.instagram.user.model.User;

/* renamed from: X.ARe, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnClickListenerC23220ARe implements View.OnClickListener {
    public final /* synthetic */ AGO A00;
    public final /* synthetic */ User A01;

    public ViewOnClickListenerC23220ARe(AGO ago, User user) {
        this.A01 = user;
        this.A00 = ago;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(860879418);
        User user = this.A01;
        if (user != null) {
            this.A00.A07.Dfb(user.getId());
        }
        C0f9.A0C(-1368919042, A05);
    }
}
