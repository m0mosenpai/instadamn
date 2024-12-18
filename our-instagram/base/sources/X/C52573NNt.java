package X;

import android.os.Bundle;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: X.NNt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52573NNt extends AbstractC52562NNi implements InterfaceC60442pS {
    public static final String __redex_internal_original_name = "LeadAdsMultiStepFormFragment";
    public final int A00;
    public final int A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "lead_ad_question_page";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return true;
    }

    @Override // X.AbstractC52562NNi, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C55137Oc5.A00(this);
    }

    public C52573NNt() {
        C57554PgS A01 = C57554PgS.A01(this, 16);
        C57554PgS A012 = C57554PgS.A01(this, 8);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = C57554PgS.A00(A012, enumC09460dv, 9);
        this.A04 = AbstractC25225BEi.A0a(C57554PgS.A01(A00, 10), A01, C57534Pg8.A00(A00, null, 7), AbstractC25225BEi.A1D(NOW.class));
        C57554PgS A013 = C57554PgS.A01(this, 14);
        InterfaceC09390do A002 = C57554PgS.A00(C57554PgS.A01(this, 11), enumC09460dv, 12);
        this.A02 = AbstractC25225BEi.A0a(C57554PgS.A01(A002, 13), A013, C57534Pg8.A00(A002, null, 8), AbstractC25225BEi.A1D(NOb.class));
        C57554PgS A014 = C57554PgS.A01(this, 15);
        InterfaceC09390do A003 = C57554PgS.A00(C57554PgS.A01(this, 5), enumC09460dv, 6);
        this.A03 = AbstractC25225BEi.A0a(C57554PgS.A01(A003, 7), A014, C57534Pg8.A00(A003, null, 6), AbstractC25225BEi.A1D(C50992Mfz.class));
        this.A01 = 2131970591;
        this.A00 = 2131964846;
    }

    public static final Bundle A04(C52573NNt c52573NNt) {
        int i;
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putAll(c52573NNt.mArguments);
        A0b.putString("thank_you_page_id", MSW.A0e(c52573NNt.A04).A0J.A03);
        ViewPager2 viewPager2 = ((AbstractC52562NNi) c52573NNt).A00;
        if (viewPager2 != null) {
            i = viewPager2.A00;
        } else {
            i = 0;
        }
        A0b.putInt("thank_you_page_index", i);
        return A0b;
    }
}
