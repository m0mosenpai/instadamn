package X;

import android.view.View;

/* renamed from: X.OjO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55413OjO implements View.OnClickListener {
    public final /* synthetic */ MWD A00;
    public final /* synthetic */ C41181vS A01;
    public final /* synthetic */ InterfaceC145436h2 A02;
    public final /* synthetic */ C139706Tz A03;

    public ViewOnClickListenerC55413OjO(MWD mwd, C41181vS c41181vS, InterfaceC145436h2 interfaceC145436h2, C139706Tz c139706Tz) {
        this.A00 = mwd;
        this.A01 = c41181vS;
        this.A03 = c139706Tz;
        this.A02 = interfaceC145436h2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(572445590);
        MWD.A02(this.A00, "lead_ads_stories_first_question", "lead_ads_first_question_continue_click");
        C41181vS c41181vS = this.A01;
        C139706Tz c139706Tz = this.A03;
        c41181vS.A0J = AbstractC25228BEl.A1A(AbstractC167007dF.A0g(c139706Tz.A02()));
        this.A02.DMW(c41181vS, C2Fb.A3f, c139706Tz.A01().getPivotX(), c139706Tz.A01().getPivotY());
        C0f9.A0C(-1068915629, A05);
    }
}
