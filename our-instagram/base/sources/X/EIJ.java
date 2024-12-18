package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.avatars.coinflip.ProfileCoinFlipView;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EIJ extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "CoinFlipEditAvatarBottomSheetFragment";
    public float A00;
    public C31476DsK A01;
    public String A02;
    public String A03;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ProfileCoinFlipView profileCoinFlipView = (ProfileCoinFlipView) AbstractC166997dE.A0S(view, R.id.profile_coin_flip_view);
        Context context = profileCoinFlipView.getContext();
        String str = this.A02;
        if (str != null) {
            UserSession A0r = AbstractC166987dD.A0r(this.A04);
            C14360o3.A0A(context);
            C74K.A02(context, profileCoinFlipView, A0r, AbstractC166997dE.A0b(), str, this.A00, R.dimen.appreciation_reels_grid_item_width);
        }
        Fp1.A00(view.requireViewById(R.id.coin_flip_edit_avatar_button), 12, this);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str = this.A03;
        if (str != null) {
            return str;
        }
        C14360o3.A0F("moduleName");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalStateException A14;
        int i;
        int A02 = C0f9.A02(-1665947407);
        super.onCreate(bundle);
        String string = requireArguments().getString("args_previous_module_name");
        if (string != null) {
            this.A03 = string;
            String string2 = requireArguments().getString(AbstractC111324zv.A00(3936));
            if (string2 != null) {
                this.A02 = string2;
                this.A00 = requireArguments().getFloat("args_top_margin_ratio");
                this.A01 = (C31476DsK) AbstractC31175DnJ.A0A(this).A00(C31476DsK.class);
                C0f9.A09(1945609207, A02);
                return;
            }
            A14 = AbstractC166987dD.A14("avatar sticker required");
            i = 2046040611;
        } else {
            A14 = AbstractC166987dD.A14("module name required");
            i = 1704955395;
        }
        C0f9.A09(i, A02);
        throw A14;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1827380229);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.coin_flip_edit_avatar_bottom_sheet_fragment, viewGroup, false);
        C0f9.A09(-1431242462, A02);
        return inflate;
    }
}
