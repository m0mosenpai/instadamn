package X;

import android.view.View;
import com.instagram.user.model.User;

/* renamed from: X.Oiq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55380Oiq implements View.OnClickListener {
    public final /* synthetic */ C41181vS A00;
    public final /* synthetic */ InterfaceC144586fe A01;

    public ViewOnClickListenerC55380Oiq(C41181vS c41181vS, InterfaceC144586fe interfaceC144586fe) {
        this.A00 = c41181vS;
        this.A01 = interfaceC144586fe;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String A00;
        int A05 = C0f9.A05(46180497);
        C41181vS c41181vS = this.A00;
        User user = c41181vS.A0i;
        if (user != null && (A00 = AbstractC76433bn.A00(user)) != null) {
            this.A01.Dpg(A00, c41181vS.A0Q);
        }
        C0f9.A0C(326956789, A05);
    }
}
