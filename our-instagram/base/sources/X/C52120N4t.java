package X;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.leadgen.core.model.LeadGenProfileContentInfo;
import com.instagram.leadgen.core.model.LeadGenTrustSignal;
import com.instagram.leadgen.core.model.LeadGenTrustSignalsPayload;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.N4t, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52120N4t extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "LeadAdsProfileContentBottomSheetFragment";
    public IgTextView A00;
    public final Rect A01 = AbstractC166987dD.A0U();
    public final InterfaceC09390do A02;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "lead_ad_question_page";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        LeadGenTrustSignalsPayload leadGenTrustSignalsPayload;
        O87 o87;
        EnumC53274NhC enumC53274NhC;
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = AbstractC31172DnG.A0X(view, R.id.profile_content_description);
        View A0S = AbstractC166997dE.A0S(view, R.id.profile_content_header_image);
        View A0S2 = AbstractC166997dE.A0S(view, R.id.profile_content_username);
        View A0S3 = AbstractC166997dE.A0S(view, R.id.profile_content_secondary_text);
        View A0S4 = AbstractC166997dE.A0S(view, R.id.profile_content_tertiary_text);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new JWL(A0S2, viewLifecycleOwner, this, c07s, view, A0S4, A0S3, A0S, null, 14), C07Y.A00(viewLifecycleOwner));
        C50996Mg3 c50996Mg3 = (C50996Mg3) this.A02.getValue();
        LeadGenProfileContentInfo leadGenProfileContentInfo = (LeadGenProfileContentInfo) c50996Mg3.A03.getValue();
        if (leadGenProfileContentInfo != null && (leadGenTrustSignalsPayload = leadGenProfileContentInfo.A01) != null && (o87 = c50996Mg3.A01) != null) {
            String str2 = c50996Mg3.A02;
            ArrayList A0S5 = AbstractC001800i.A0S(leadGenTrustSignalsPayload.A05, AbstractC16960so.A1R(leadGenTrustSignalsPayload.A00, leadGenTrustSignalsPayload.A02, leadGenTrustSignalsPayload.A01));
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = A0S5.iterator();
            while (it.hasNext()) {
                LeadGenTrustSignal leadGenTrustSignal = (LeadGenTrustSignal) it.next();
                String str3 = leadGenTrustSignal.A02;
                if (str3 != null && str3.length() != 0 && ((str = (enumC53274NhC = leadGenTrustSignal.A01).A02) != null || (str = enumC53274NhC.toString()) != null)) {
                    A1E.add(str);
                }
            }
            InterfaceC58268PsC interfaceC58268PsC = o87.A00;
            String str4 = o87.A01;
            String A1H = AbstractC25226BEj.A1H(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, A1E, null);
            Bundle A0b = AbstractC166987dD.A0b();
            if (str2 != null) {
                A0b.putString("question_type", str2);
            }
            A0b.putString("pii_question_type", A1H);
            InterfaceC58268PsC.A01(A0b, interfaceC58268PsC, str4, "lead_gen_business_profile_content", "business_profile_bottom_sheet_impression");
        }
    }

    public static final void A00(IgTextView igTextView, String str) {
        if (igTextView != null) {
            int i = 0;
            if (str == null || str.length() == 0) {
                i = 8;
            }
            igTextView.setVisibility(i);
            igTextView.setText(str);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return ((C50996Mg3) this.A02.getValue()).A00;
    }

    public C52120N4t() {
        C57554PgS A01 = C57554PgS.A01(this, 20);
        InterfaceC09390do A00 = C57554PgS.A00(C57554PgS.A01(this, 17), EnumC09460dv.A02, 18);
        this.A02 = AbstractC25225BEi.A0a(C57554PgS.A01(A00, 19), A01, C57534Pg8.A00(A00, null, 9), AbstractC25225BEi.A1D(C50996Mg3.class));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(2023852818);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.lead_gen_fragment_profile_content_bottom_sheet, viewGroup, false);
        C0f9.A09(412133127, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1498705662);
        super.onDestroyView();
        this.A00 = null;
        C0f9.A09(747268621, A02);
    }
}
