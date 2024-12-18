package X;

import android.view.View;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.OjW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55421OjW implements View.OnClickListener {
    public final /* synthetic */ IgProgressImageView A00;
    public final /* synthetic */ MWD A01;
    public final /* synthetic */ C41181vS A02;
    public final /* synthetic */ InterfaceC145436h2 A03;
    public final /* synthetic */ C139706Tz A04;

    public ViewOnClickListenerC55421OjW(IgProgressImageView igProgressImageView, MWD mwd, C41181vS c41181vS, InterfaceC145436h2 interfaceC145436h2, C139706Tz c139706Tz) {
        this.A04 = c139706Tz;
        this.A00 = igProgressImageView;
        this.A02 = c41181vS;
        this.A03 = interfaceC145436h2;
        this.A01 = mwd;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-309872403);
        C139706Tz c139706Tz = this.A04;
        c139706Tz.A02().requestFocus();
        AbstractC13880nE.A0R(c139706Tz.A02());
        C41181vS c41181vS = this.A02;
        InterfaceC145436h2 interfaceC145436h2 = this.A03;
        MWD.A02(this.A01, "lead_ads_stories_first_question_with_saq", "lead_ads_first_question_with_saq_input_click");
        interfaceC145436h2.DgA();
        View A00 = c139706Tz.A00();
        View view2 = c139706Tz.A01;
        if (view2 != null) {
            AbstractC55223Oep.A07(A00, view2, c41181vS);
            C0f9.A0C(1861282337, A05);
        } else {
            C14360o3.A0F("dimmerOverlay");
            throw C00O.createAndThrow();
        }
    }
}
