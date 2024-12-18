package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.OiW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55365OiW implements View.OnClickListener {
    public final /* synthetic */ C55909Os0 A00;

    public ViewOnClickListenerC55365OiW(C55909Os0 c55909Os0) {
        this.A00 = c55909Os0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-2147347100);
        C55909Os0 c55909Os0 = this.A00;
        C41181vS c41181vS = c55909Os0.A0F;
        Activity activity = c55909Os0.A04;
        UserSession userSession = c55909Os0.A0B;
        C55165OdT.A01(activity, c55909Os0.A01, c55909Os0.A07, c55909Os0.A08, userSession, c41181vS);
        c55909Os0.A01 = null;
        C0f9.A0C(-978765692, A05);
    }
}
