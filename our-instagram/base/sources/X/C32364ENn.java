package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.R;
import java.util.Map;

/* renamed from: X.ENn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32364ENn extends C53Z implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "QuickPromotionDebugSurveyFragment";
    public EditText A00;
    public TextView A01;
    public final Map A02 = AbstractC166987dD.A1G();

    public static final void A00(C32364ENn c32364ENn) {
        Map map = c32364ENn.A02;
        boolean isEmpty = map.isEmpty();
        TextView textView = c32364ENn.A01;
        if (isEmpty) {
            if (textView != null) {
                textView.setText(2131958544);
                return;
            }
        } else if (textView != null) {
            textView.setText(map.toString());
            return;
        }
        C14360o3.A0F("triggerContextDescription");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.setTitle(getString(2131958530));
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A02(C05F.A1F);
        A0B.A0G = ViewOnClickListenerC31723DwS.A00(this, 46);
        A0B.A02 = AbstractC31173DnH.A02(requireContext());
        interfaceC56362iU.AA9(new C3LY(A0B));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "quick_promotion_survey_internal";
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(536722849);
        super.onCreate(bundle);
        C0f9.A09(-2077658973, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1429096726);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.quick_promotion_launch_survey_fragment, viewGroup, false);
        this.A00 = AbstractC31173DnH.A0H(inflate, R.id.integration_point_field);
        this.A01 = AbstractC166997dE.A0T(inflate, R.id.trigger_context_content);
        ViewOnClickListenerC31723DwS.A01(AbstractC166997dE.A0S(inflate, R.id.add_attribute_button), 47, this);
        ViewOnClickListenerC31723DwS.A01(AbstractC166997dE.A0S(inflate, R.id.clear_attributes_button), 48, this);
        C0f9.A09(735035053, A02);
        return inflate;
    }
}
