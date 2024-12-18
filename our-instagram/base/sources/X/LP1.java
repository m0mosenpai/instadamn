package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LP1 implements View.OnClickListener {
    public final /* synthetic */ C1P1 A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    public LP1(C1P1 c1p1, UserSession userSession, String str) {
        this.A01 = userSession;
        this.A02 = str;
        this.A00 = c1p1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1542677342);
        LBR.A01(this.A00, this.A01, this.A02);
        C0f9.A0C(-1544501340, A05);
    }
}
