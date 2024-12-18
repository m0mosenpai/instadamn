package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.avatars.coinflip.AvatarCoinFlipConfig;

/* loaded from: classes6.dex */
public final class EIQ extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "AvatarCoinFlipAutoEnableBottomsheetFragment";
    public String A00;
    public String A01;
    public AvatarCoinFlipConfig A02;
    public Boolean A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC34758FSx.A01(view, this.A02, this, AbstractC166987dD.A0r(this.A06));
        Fp1.A00(view.requireViewById(R.id.coin_flip_bottom_sheet_button), 10, this);
        if (!AbstractC31177DnL.A1b(this.A03)) {
            View requireViewById = view.requireViewById(R.id.coin_flip_bottom_sheet_secondary_button);
            requireViewById.setVisibility(0);
            Fp1.A00(requireViewById, 11, this);
        }
        ((C31843DzA) this.A05.getValue()).A00("ig_opt_out_tied_to_avatar", C05F.A00, this.A01);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    public EIQ() {
        C37048GUe A00 = C37048GUe.A00(this, 6);
        C37048GUe A002 = C37048GUe.A00(this, 8);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A003 = AbstractC09440dt.A00(enumC09460dv, C37048GUe.A00(A002, 9));
        this.A04 = AbstractC25225BEi.A0a(C37048GUe.A00(A003, 10), A00, new MHV(18, (Object) null, A003), AbstractC25225BEi.A1D(C143266dR.class));
        C37048GUe A004 = C37048GUe.A00(this, 7);
        InterfaceC09390do A005 = AbstractC09440dt.A00(enumC09460dv, C37048GUe.A00(C37048GUe.A00(this, 11), 12));
        this.A05 = AbstractC25225BEi.A0a(C37048GUe.A00(A005, 13), A004, new MHV(19, (Object) null, A005), AbstractC25225BEi.A1D(C31843DzA.class));
        this.A00 = "avatar_coin_flip_auto_enable_bottomsheet_";
        this.A06 = AbstractC60492pY.A02(this);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A00;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        AvatarCoinFlipConfig avatarCoinFlipConfig;
        int A02 = C0f9.A02(277892602);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        Boolean bool = null;
        if (bundle2 != null) {
            str = bundle2.getString("args_previous_module_name");
        } else {
            str = null;
        }
        this.A01 = str;
        String A0R = AnonymousClass001.A0R(this.A00, str);
        C14360o3.A0B(A0R, 0);
        this.A00 = A0R;
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            avatarCoinFlipConfig = (AvatarCoinFlipConfig) bundle3.getParcelable("args_avatar_coin_flip_config");
        } else {
            avatarCoinFlipConfig = null;
        }
        this.A02 = avatarCoinFlipConfig;
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            bool = AbstractC31174DnI.A0n(bundle4, "tied_to_avatar_enabled");
        }
        this.A03 = bool;
        C0f9.A09(-1178210762, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1424074348);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.avatar_coin_flip_auto_enable_nux_bottom_sheet_fragment, viewGroup, false);
        C0f9.A09(-2063425357, A02);
        return inflate;
    }
}
