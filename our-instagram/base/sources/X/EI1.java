package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes6.dex */
public final class EI1 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "SocialStickersDisclaimerBottomSheetFragment";
    public final InterfaceC09390do A02 = C1XM.A00(new MHS(this, 44));
    public final InterfaceC09390do A03 = C1XM.A00(new MHS(this, 46));
    public InterfaceC16820sZ A00 = new MHS(this, 45);
    public InterfaceC16820sZ A01 = new MHS(this, 47);
    public final InterfaceC09390do A05 = C1XM.A00(new MHS(this, 48));
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "social_stickers_disclaimer";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C77B c77b = ((C77A) this.A02.getValue()).A04;
        c77b.A00 = C77B.A04;
        C77C c77c = c77b.A02;
        C2JM A0b = AbstractC25225BEi.A0b();
        C2JM A0b2 = AbstractC25225BEi.A0b();
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "IGSocialAvatarStickerMarkDisclaimerAsSeenMutation", A0b.getParamsCopy(), A0b2.getParamsCopy(), QmY.class, true, null, 0, null, AbstractC58317Pt9.A00(1084), AbstractC166987dD.A1E());
        c77c.A00.ATV(C35807Frj.A00, C35841FsH.A00, pandoGraphQLRequest);
        ImageUrl imageUrl = (ImageUrl) this.A05.getValue();
        if (imageUrl != null) {
            AbstractC31172DnG.A0a(view, R.id.disclaimer_image).setUrl(imageUrl, this);
        }
        ViewOnClickListenerC35681FpG.A01(view.findViewById(R.id.disclaimer_settings_button), 15, this);
        AbstractC31179DnN.A1N(((FFB) this.A03.getValue()).A00, "social_avatars_bottom_sheet_disclaimer_impression");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(2048843147);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.social_stickers_disclaimer_fragment, viewGroup, false);
        C0f9.A09(-1494933905, A02);
        return inflate;
    }
}
