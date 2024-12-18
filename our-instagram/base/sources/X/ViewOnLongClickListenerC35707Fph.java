package X;

import android.view.View;
import com.instagram.user.model.User;

/* renamed from: X.Fph, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnLongClickListenerC35707Fph implements View.OnLongClickListener {
    public final /* synthetic */ C70G A00;
    public final /* synthetic */ C154536x3 A01;
    public final /* synthetic */ User A02;

    public ViewOnLongClickListenerC35707Fph(C70G c70g, C154536x3 c154536x3, User user) {
        this.A00 = c70g;
        this.A02 = user;
        this.A01 = c154536x3;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.A00.DQn(this.A01, this.A02);
        return true;
    }
}
