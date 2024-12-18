package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.N4b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52103N4b extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "RtcCallSurveyFreeFormFeedbackFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC16660sJ A01;
    public final C51910Mws A02;

    public C52103N4b(C51910Mws c51910Mws, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(c51910Mws, 1);
        this.A02 = c51910Mws;
        this.A01 = interfaceC16660sJ;
        this.A00 = AbstractC60492pY.A02(this);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "rtc_call_survey_freeform_feedback_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView A0e = AbstractC166987dD.A0e(view, R.id.survey_question);
        View findViewById = view.findViewById(R.id.survey_freeform_edit_text);
        IgdsButton igdsButton = (IgdsButton) view.findViewById(R.id.bottom_button);
        A0e.setText(this.A02.A00);
        findViewById.requestFocus();
        AbstractC13880nE.A0R(findViewById);
        igdsButton.setText(view.getResources().getString(2131954549));
        C0fQ.A00(new ViewOnClickListenerC35687FpM(29, findViewById, this), igdsButton);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(520382606);
        super.onCreate(bundle);
        requireArguments();
        C0f9.A09(-248705383, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(756410360);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_call_survey_freeform_feedback_fragment, false);
        C0f9.A09(79514240, A02);
        return A0R;
    }
}
