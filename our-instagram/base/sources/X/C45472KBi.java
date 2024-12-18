package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.KBi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45472KBi extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "PromoteAdsManagerPromotionsInReviewFragment";
    public String A00;
    public ImageUrl A01;
    public boolean A02;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131970332);
        interfaceC56362iU.EkS(AbstractC167007dF.A1O(getParentFragmentManager().A0L()));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promotions_in_review_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        ViewGroup.LayoutParams layoutParams;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) AbstractC166997dE.A0R(view, R.id.in_review_thumbnail);
        TextView A0N = AbstractC167007dF.A0N(view, R.id.in_review_title);
        TextView A0N2 = AbstractC167007dF.A0N(view, R.id.in_review_description);
        C64P c64p = (C64P) AbstractC166997dE.A0R(view, R.id.in_review_button);
        roundedCornerImageView.setBitmapShaderScaleType(C3OB.A02);
        if (this.A02 && (layoutParams = roundedCornerImageView.getLayoutParams()) != null) {
            layoutParams.width = AbstractC166997dE.A0N(this).getDimensionPixelSize(R.dimen.challenge_sticker_v2_4_winner2_submission_offsetX);
        }
        ImageUrl imageUrl = this.A01;
        if (imageUrl == null) {
            str = "imageUrl";
        } else {
            roundedCornerImageView.setUrl(imageUrl, this);
            A0N.setText(2131970333);
            A0N2.setText(2131970331);
            c64p.setPrimaryActionText(requireContext().getString(2131970330));
            c64p.setPrimaryActionOnClickListener(new ViewOnClickListenerC48064LPp(this, 37));
            W6I A00 = VRC.A00(AbstractC166987dD.A0r(this.A03));
            String str2 = this.A00;
            if (str2 == null) {
                str = "mediaId";
            } else {
                A00.A03("promotion_details", str2);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(106374801);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A00 = AbstractC153636vY.A01(bundle2, "media_id");
            this.A01 = AbstractC25225BEi.A0t(AbstractC153636vY.A01(bundle2, "url"));
            this.A02 = bundle2.getBoolean(AbstractC111324zv.A00(2636));
        }
        C0f9.A09(-1456191633, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1097859150);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.promote_ads_manager_in_review_view, false);
        C0f9.A09(-111601806, A02);
        return A0R;
    }
}
