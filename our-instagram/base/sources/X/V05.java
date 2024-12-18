package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes11.dex */
public final class V05 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "PromoteAudienceSizeEducationBottomSheetFragment";
    public SpannableStringBuilder A00;
    public IgTextView A01;
    public PromoteData A02;
    public IgTextView A03;
    public String A04;
    public final String A09 = "promote_audience_size_education_bottom_sheet_fragment";
    public final String A07 = "https://www.facebook.com/business/help/283579896000936";
    public final String A06 = MSV.A00(212);
    public final String A05 = "https://www.facebook.com/business/help/1665333080167380?id=176276233019487";
    public final InterfaceC09390do A08 = AbstractC60492pY.A02(this);

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        if (r0 != null) goto L19;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r6, android.os.Bundle r7) {
        /*
            r5 = this;
            r3 = 0
            X.C14360o3.A0B(r6, r3)
            super.onViewCreated(r6, r7)
            com.instagram.business.promote.model.PromoteData r0 = X.InterfaceC72021XFj.A00(r5)
            r5.A02 = r0
            android.widget.TextView r1 = X.AbstractC31180DnO.A06(r6)
            java.lang.String r0 = r5.A04
            r4 = 0
            if (r0 != 0) goto L20
            java.lang.String r2 = "title"
        L18:
            X.C14360o3.A0F(r2)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L20:
            r1.setText(r0)
            r0 = 2131428837(0x7f0b05e5, float:1.847933E38)
            android.view.View r0 = r6.requireViewById(r0)
            com.instagram.common.ui.base.IgTextView r0 = (com.instagram.common.ui.base.IgTextView) r0
            r5.A01 = r0
            r0 = 2131428845(0x7f0b05ed, float:1.8479346E38)
            android.view.View r2 = r6.requireViewById(r0)
            com.instagram.common.ui.base.IgTextView r2 = (com.instagram.common.ui.base.IgTextView) r2
            r5.A03 = r2
            if (r2 == 0) goto L4a
            r0 = 2131970384(0x7f134950, float:1.9577718E38)
            java.lang.String r1 = r5.getString(r0)
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r1)
            r2.setText(r0)
        L4a:
            com.instagram.business.promote.model.PromoteData r0 = r5.A02
            if (r0 != 0) goto L51
            java.lang.String r2 = "promoteData"
            goto L18
        L51:
            com.instagram.business.promote.model.PromoteAudienceInfo r0 = r0.A0q
            com.instagram.api.schemas.AdvantageAudienceData r0 = r0.A02
            if (r0 == 0) goto L5b
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r4 = r0.AaJ()
        L5b:
            com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus r1 = com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus.A05
            com.instagram.common.ui.base.IgTextView r0 = r5.A03
            if (r4 != r1) goto L97
            if (r0 == 0) goto L66
        L63:
            r0.setVisibility(r3)
        L66:
            r0 = 2131970389(0x7f134955, float:1.9577728E38)
            java.lang.String r1 = X.AbstractC25227BEk.A0v(r5, r0)
            java.lang.String r0 = r5.A07
            r5.A00(r1, r0)
            r0 = 2131970388(0x7f134954, float:1.9577726E38)
            java.lang.String r1 = X.AbstractC25227BEk.A0v(r5, r0)
            java.lang.String r0 = r5.A06
            r5.A00(r1, r0)
            r0 = 2131970387(0x7f134953, float:1.9577724E38)
            java.lang.String r1 = X.AbstractC25227BEk.A0v(r5, r0)
            java.lang.String r0 = r5.A05
            r5.A00(r1, r0)
            com.instagram.common.ui.base.IgTextView r1 = r5.A01
            java.lang.String r2 = "bodyView"
            if (r1 == 0) goto L18
            android.text.SpannableStringBuilder r0 = r5.A00
            if (r0 != 0) goto L9c
            java.lang.String r2 = "body"
            goto L18
        L97:
            if (r0 == 0) goto L66
            r3 = 8
            goto L63
        L9c:
            r1.setText(r0)
            com.instagram.common.ui.base.IgTextView r0 = r5.A01
            if (r0 == 0) goto L18
            X.AbstractC25227BEk.A11(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V05.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final void A00(String str, String str2) {
        SpannableStringBuilder spannableStringBuilder = this.A00;
        if (spannableStringBuilder == null) {
            C14360o3.A0F("body");
            throw C00O.createAndThrow();
        }
        Context requireContext = requireContext();
        AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A08.getValue();
        String A01 = AbstractC63260SgI.A01(requireContext(), str2);
        C14360o3.A07(A01);
        AnonymousClass773.A02(spannableStringBuilder, new C33248Eli(requireContext, abstractC12990ll, null, A01, AbstractC25233BEq.A04(this)), str);
        this.A00 = spannableStringBuilder;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A09;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A08.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1471947060);
        super.onCreate(bundle);
        this.A04 = getString(2131970386);
        this.A00 = new SpannableStringBuilder(getString(2131970385));
        C0f9.A09(-567529860, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1760138725);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_audience_size_education_bottom_sheet_view, viewGroup, false);
        C0f9.A09(2105866232, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1979009073);
        super.onDestroyView();
        this.A03 = null;
        C0f9.A09(-566483291, A02);
    }
}
