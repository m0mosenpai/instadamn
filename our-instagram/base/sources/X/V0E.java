package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.instagram.common.analytics.intf.AnalyticsEventDebugInfo;

/* loaded from: classes11.dex */
public final class V0E extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "EventInfoStringFragment";
    public TextView A00;
    public ScrollView A01;
    public AnalyticsEventDebugInfo A02;
    public final InterfaceC09390do A04 = AbstractC60492pY.A01(this);
    public final String A03 = "dict_debug";

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AnalyticsEventDebugInfo analyticsEventDebugInfo = this.A02;
        if (analyticsEventDebugInfo == null) {
            C14360o3.A0F("analyticsEventDebugInfo");
            throw C00O.createAndThrow();
        }
        AbstractC31175DnJ.A1I(interfaceC56362iU, analyticsEventDebugInfo.A00);
        interfaceC56362iU.AAE("COPY", new WNN(this, 57));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A03;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A04.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-337325863);
        super.onCreate(bundle);
        this.A02 = (AnalyticsEventDebugInfo) AbstractC153636vY.A00(requireArguments(), AnalyticsEventDebugInfo.class, "EventInfoFragment.EventInfo");
        C0f9.A09(2006611628, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A02 = C0f9.A02(1098474441);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.A01 = new ScrollView(getActivity());
        TextView textView = new TextView(getActivity());
        this.A00 = textView;
        AnalyticsEventDebugInfo analyticsEventDebugInfo = this.A02;
        if (analyticsEventDebugInfo == null) {
            str = "analyticsEventDebugInfo";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("{\n");
            AnalyticsEventDebugInfo.A03(analyticsEventDebugInfo, "| ", sb, true);
            textView.setText(AbstractC166997dE.A0x("}", sb));
            TextView textView2 = this.A00;
            str = "textView";
            if (textView2 != null) {
                textView2.setTextSize(12.0f);
                TextView textView3 = this.A00;
                if (textView3 != null) {
                    textView3.setLineSpacing(5.0f, 1.0f);
                    TextView textView4 = this.A00;
                    if (textView4 != null) {
                        textView4.setPadding(50, 50, 50, 50);
                        ScrollView scrollView = this.A01;
                        if (scrollView != null) {
                            TextView textView5 = this.A00;
                            if (textView5 != null) {
                                scrollView.addView(textView5);
                                ScrollView scrollView2 = this.A01;
                                if (scrollView2 != null) {
                                    C0f9.A09(-373379740, A02);
                                    return scrollView2;
                                }
                            }
                        }
                        C14360o3.A0F("scrollView");
                        throw C00O.createAndThrow();
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
