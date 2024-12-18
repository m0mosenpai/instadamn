package X;

import android.view.View;

/* renamed from: X.OjN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55412OjN implements View.OnClickListener {
    public final /* synthetic */ MWD A00;
    public final /* synthetic */ C41181vS A01;
    public final /* synthetic */ InterfaceC145436h2 A02;
    public final /* synthetic */ C139686Tx A03;

    public ViewOnClickListenerC55412OjN(MWD mwd, C41181vS c41181vS, InterfaceC145436h2 interfaceC145436h2, C139686Tx c139686Tx) {
        this.A02 = interfaceC145436h2;
        this.A01 = c41181vS;
        this.A03 = c139686Tx;
        this.A00 = mwd;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(231478830);
        InterfaceC145436h2 interfaceC145436h2 = this.A02;
        C41181vS c41181vS = this.A01;
        C2Fb c2Fb = C2Fb.A3f;
        C139686Tx c139686Tx = this.A03;
        interfaceC145436h2.DMW(c41181vS, c2Fb, c139686Tx.A01().getPivotX(), c139686Tx.A01().getPivotY());
        MWD.A02(this.A00, "lead_ads_stories_first_question", "lead_ads_first_question_continue_click");
        C0f9.A0C(-1711822259, A05);
    }
}
