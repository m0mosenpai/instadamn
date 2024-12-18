package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.button.IgdsButton;

/* loaded from: classes6.dex */
public final class EHZ extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "RtcCallSurveyThanksFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);
    public final InterfaceC16820sZ A01;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "rtc_call_survey_thanks_fragment";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    public EHZ(InterfaceC16820sZ interfaceC16820sZ) {
        this.A01 = interfaceC16820sZ;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1087269138);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_call_survey_thanks_fragment, viewGroup, false);
        TextView A0e = AbstractC166987dD.A0e(inflate, R.id.survey_thanks_feedback_text);
        IgdsButton igdsButton = (IgdsButton) inflate.findViewById(R.id.bottom_button);
        ImageView A08 = AbstractC31171DnF.A08(inflate, R.id.survey_thanks_image);
        A0e.setText(2131954550);
        igdsButton.setText(inflate.getResources().getString(2131961124));
        ViewOnClickListenerC35686FpL.A00(igdsButton, 8, this);
        AbstractC31173DnH.A11(inflate.getContext(), A08, R.color.green_5);
        C0f9.A09(625826234, A02);
        return inflate;
    }
}
