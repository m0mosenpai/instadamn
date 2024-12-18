package X;

import android.view.View;
import com.instagram.user.model.User;

/* renamed from: X.FnA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35558FnA implements View.OnClickListener {
    public final /* synthetic */ FQS A00;
    public final /* synthetic */ User A01;

    public ViewOnClickListenerC35558FnA(FQS fqs, User user) {
        this.A00 = fqs;
        this.A01 = user;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(420010495);
        this.A00.A00(this.A01);
        C0f9.A0C(-2045640748, A05);
    }
}
