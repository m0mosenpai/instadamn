package X;

import android.app.Activity;
import android.graphics.RectF;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.FnV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35578FnV implements View.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    public ViewOnClickListenerC35578FnV(UserSession userSession, Activity activity, String str) {
        this.A01 = userSession;
        this.A00 = activity;
        this.A02 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1470949907);
        UserSession userSession = this.A01;
        AbstractC35183Ffa.A03(this.A00, new RectF(0.0f, 0.0f, 0.0f, 0.0f), userSession, this.A02, null);
        C0f9.A0C(-1993996560, A05);
    }
}
