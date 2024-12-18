package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes11.dex */
public final class V06 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "PromoteAudienceSizeEducationBottomSheetFragmentV2";
    public SpannableStringBuilder A00;
    public IgTextView A01;
    public IgTextView A02;
    public String A03;
    public final String A09 = "promote_audience_size_education_bottom_sheet_fragment";
    public final String A06 = "https://www.facebook.com/business/help/283579896000936";
    public final String A05 = MSV.A00(212);
    public final String A04 = "https://www.facebook.com/business/help/1665333080167380?id=176276233019487";
    public final InterfaceC09390do A08 = new C60842q8(new X55(this, 8), new X55(this, 9), new C57253Pbb(25, null, this), new C0YZ(UFT.class));
    public final InterfaceC09390do A07 = AbstractC60492pY.A02(this);

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0051, code lost:
    
        if (r0 != null) goto L11;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r5, android.os.Bundle r6) {
        /*
            r4 = this;
            r3 = 0
            X.C14360o3.A0B(r5, r3)
            super.onViewCreated(r5, r6)
            android.widget.TextView r1 = X.AbstractC31180DnO.A06(r5)
            java.lang.String r0 = r4.A03
            r1.setText(r0)
            r0 = 2131428837(0x7f0b05e5, float:1.847933E38)
            android.view.View r0 = r5.requireViewById(r0)
            com.instagram.common.ui.base.IgTextView r0 = (com.instagram.common.ui.base.IgTextView) r0
            r4.A01 = r0
            r0 = 2131428845(0x7f0b05ed, float:1.8479346E38)
            android.view.View r2 = r5.requireViewById(r0)
            com.instagram.common.ui.base.IgTextView r2 = (com.instagram.common.ui.base.IgTextView) r2
            r4.A02 = r2
            if (r2 == 0) goto L37
            r0 = 2131970384(0x7f134950, float:1.9577718E38)
            java.lang.String r1 = r4.getString(r0)
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r1)
            r2.setText(r0)
        L37:
            X.0do r0 = r4.A08
            java.lang.Object r0 = r0.getValue()
            X.UFT r0 = (X.UFT) r0
            X.UQJ r0 = r0.A05()
            com.instagram.api.schemas.AdvantageAudienceData r0 = r0.A02
            if (r0 == 0) goto L90
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r2 = r0.AaJ()
        L4b:
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r1 = com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus.A05
            com.instagram.common.ui.base.IgTextView r0 = r4.A02
            if (r2 != r1) goto L8b
            if (r0 == 0) goto L56
        L53:
            r0.setVisibility(r3)
        L56:
            r0 = 2131970389(0x7f134955, float:1.9577728E38)
            java.lang.String r1 = X.AbstractC25227BEk.A0v(r4, r0)
            java.lang.String r0 = r4.A06
            r4.A00(r1, r0)
            r0 = 2131970388(0x7f134954, float:1.9577726E38)
            java.lang.String r1 = X.AbstractC25227BEk.A0v(r4, r0)
            java.lang.String r0 = r4.A05
            r4.A00(r1, r0)
            r0 = 2131970387(0x7f134953, float:1.9577724E38)
            java.lang.String r1 = X.AbstractC25227BEk.A0v(r4, r0)
            java.lang.String r0 = r4.A04
            r4.A00(r1, r0)
            com.instagram.common.ui.base.IgTextView r1 = r4.A01
            if (r1 == 0) goto L83
            android.text.SpannableStringBuilder r0 = r4.A00
            r1.setText(r0)
        L83:
            com.instagram.common.ui.base.IgTextView r0 = r4.A01
            if (r0 == 0) goto L8a
            X.AbstractC25227BEk.A11(r0)
        L8a:
            return
        L8b:
            if (r0 == 0) goto L56
            r3 = 8
            goto L53
        L90:
            r2 = 0
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V06.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final void A00(String str, String str2) {
        SpannableStringBuilder spannableStringBuilder = this.A00;
        if (spannableStringBuilder != null) {
            Context requireContext = requireContext();
            AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A07.getValue();
            String A01 = AbstractC63260SgI.A01(requireContext(), str2);
            C14360o3.A07(A01);
            AnonymousClass773.A02(spannableStringBuilder, new C33248Eli(requireContext, abstractC12990ll, null, A01, AbstractC25233BEq.A04(this)), str);
            this.A00 = spannableStringBuilder;
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A09;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A07.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1813173780);
        super.onCreate(bundle);
        this.A03 = getString(2131970386);
        this.A00 = new SpannableStringBuilder(getString(2131970385));
        C0f9.A09(170418715, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1288940663);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_audience_size_education_bottom_sheet_view, viewGroup, false);
        C0f9.A09(536070274, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1996764323);
        super.onDestroyView();
        this.A03 = null;
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
        C0f9.A09(1705181844, A02);
    }
}
