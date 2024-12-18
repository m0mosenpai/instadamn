package X;

import android.os.Bundle;
import android.widget.TextView;

/* renamed from: X.NZt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52836NZt extends AbstractC52184N7v {
    public static final String __redex_internal_original_name = "IgLiveQuestionBroadcasterFragment";

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "live_question_sheet";
    }

    @Override // X.AbstractC52184N7v
    public final void A0D() {
        String str;
        super.A0D();
        TextView textView = this.A02;
        if (textView != null) {
            AbstractC166987dD.A1P(requireContext(), textView, 2131965479);
            TextView textView2 = this.A01;
            if (textView2 != null) {
                AbstractC166987dD.A1P(requireContext(), textView2, 2131965477);
                return;
            }
            str = "emptyDescription";
        } else {
            str = "emptyTitle";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC52184N7v, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1227026468);
        super.onCreate(bundle);
        setModuleNameV2("live_question_sheet");
        C0f9.A09(-1430031479, A02);
    }
}
