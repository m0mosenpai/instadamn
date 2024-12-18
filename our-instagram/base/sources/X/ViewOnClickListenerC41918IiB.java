package X;

import android.view.View;
import com.instagram.user.model.User;

/* renamed from: X.IiB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41918IiB implements View.OnClickListener {
    public final /* synthetic */ User A00;
    public final /* synthetic */ C153856vu A01;

    public ViewOnClickListenerC41918IiB(User user, C153856vu c153856vu) {
        this.A01 = c153856vu;
        this.A00 = user;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(717235931);
        this.A01.A01.D55(this.A00);
        C0f9.A0C(850499689, A05);
    }
}
