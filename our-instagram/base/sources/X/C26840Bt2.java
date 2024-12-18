package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Bt2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26840Bt2 extends AbstractC59962oe implements JPX {
    public static final String __redex_internal_original_name = "PolaroidStickerAttributionBottomSheetFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);
    public final String A01 = "polaroid_sticker_attribution_sheet_fragment";

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView A0N = AbstractC167007dF.A0N(view, R.id.title);
        TextView A0N2 = AbstractC167007dF.A0N(view, R.id.subtitle);
        ImageView imageView = (ImageView) AbstractC166997dE.A0R(view, R.id.icon);
        View A0S = AbstractC166997dE.A0S(view, R.id.action_button);
        Context context = getContext();
        if (context != null) {
            A0N.setText(AbstractC07900bA.A01(context.getResources(), new String[0], 2131969706));
            A0N2.setText(AbstractC07900bA.A01(context.getResources(), new String[0], 2131969705));
            imageView.setImageDrawable(new C9S8(context, null, AbstractC166987dD.A0r(this.A00)));
            C0fQ.A00(new ViewOnClickListenerC28604Cjt(this, 3), A0S);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // X.JPX
    public final Integer BlT() {
        return C05F.A09;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A01;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1668770700);
        super.onCreate(bundle);
        C0f9.A09(1660513601, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1655358904);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.polaroid_sticker_attribution_sheet_fragment, false);
        C0f9.A09(-663748048, A02);
        return A0R;
    }
}
