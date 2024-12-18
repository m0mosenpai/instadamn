package X;

import android.view.View;

/* renamed from: X.OjP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55414OjP implements View.OnClickListener {
    public final /* synthetic */ MWD A00;
    public final /* synthetic */ C41181vS A01;
    public final /* synthetic */ InterfaceC145436h2 A02;
    public final /* synthetic */ C6U3 A03;

    public ViewOnClickListenerC55414OjP(MWD mwd, C41181vS c41181vS, InterfaceC145436h2 interfaceC145436h2, C6U3 c6u3) {
        this.A00 = mwd;
        this.A02 = interfaceC145436h2;
        this.A01 = c41181vS;
        this.A03 = c6u3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-845145928);
        MWD.A02(this.A00, "lead_ads_stories_offsite_generic_question", "lead_ads_stories_offsite_generic_question_continue_click");
        InterfaceC145436h2 interfaceC145436h2 = this.A02;
        C41181vS c41181vS = this.A01;
        C2Fb c2Fb = C2Fb.A3f;
        C6U3 c6u3 = this.A03;
        interfaceC145436h2.DMW(c41181vS, c2Fb, c6u3.A01().getPivotX(), c6u3.A01().getPivotY());
        C0f9.A0C(606418279, A05);
    }
}
