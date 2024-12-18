package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class ASR implements View.OnClickListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AlB A01;
    public final /* synthetic */ C143676eA A02;
    public final /* synthetic */ String A03;

    public ASR(UserSession userSession, AlB alB, C143676eA c143676eA, String str) {
        this.A00 = userSession;
        this.A03 = str;
        this.A01 = alB;
        this.A02 = c143676eA;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(543100387);
        UserSession userSession = this.A00;
        AbstractC55215Oed.A03(new C19270xB(this.A03), userSession, "DONOR_DUPLICATE_PROMPT");
        AlB alB = this.A01;
        AbstractC23115AHe.A02(this.A02.A00(), C22P.A2s, userSession, alB, true);
        C0f9.A0C(1210381716, A05);
    }
}
