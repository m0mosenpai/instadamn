package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.avatars.coinflip.AvatarCoinFlipConfig;

/* loaded from: classes6.dex */
public final class EIZ extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "AvatarCoinFlipNuxBottomSheetFragment";
    public String A00;
    public AvatarCoinFlipConfig A01;
    public String A02;
    public final InterfaceC09390do A04 = AbstractC25225BEi.A0a(C37048GUe.A00(this, 37), C37048GUe.A00(this, 36), new MHV(27, (Object) null, this), AbstractC25225BEi.A1D(C31370Dqa.class));
    public final InterfaceC09390do A03 = AbstractC25225BEi.A0a(C37048GUe.A00(this, 38), C37048GUe.A00(this, 35), new MHV(28, (Object) null, this), AbstractC25225BEi.A1D(C31843DzA.class));
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC34758FSx.A01(view, this.A01, this, AbstractC166987dD.A0r(this.A05));
        Fp1.A00(view.requireViewById(R.id.coin_flip_bottom_sheet_button), 20, this);
        Fp1.A00(view.requireViewById(R.id.coin_flip_bottom_sheet_secondary_button), 21, this);
        C31843DzA c31843DzA = (C31843DzA) this.A03.getValue();
        Integer num = C05F.A00;
        String str = this.A00;
        if (str == null) {
            C14360o3.A0F("launchSurface");
            throw C00O.createAndThrow();
        }
        c31843DzA.A00(str, num, null);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str = this.A02;
        if (str != null) {
            return str;
        }
        C14360o3.A0F("moduleName");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalStateException A14;
        int i;
        int A02 = C0f9.A02(-92044424);
        super.onCreate(bundle);
        String string = requireArguments().getString("args_previous_module_name");
        if (string != null) {
            this.A02 = string;
            AvatarCoinFlipConfig avatarCoinFlipConfig = (AvatarCoinFlipConfig) requireArguments().getParcelable("args_avatar_coin_flip_config");
            if (avatarCoinFlipConfig != null) {
                this.A01 = avatarCoinFlipConfig;
                String string2 = requireArguments().getString("args_launch_surface");
                if (string2 != null) {
                    this.A00 = string2;
                    C0f9.A09(2126631605, A02);
                    return;
                } else {
                    A14 = AbstractC166987dD.A14("launch surface required");
                    i = 134827465;
                }
            } else {
                A14 = AbstractC166987dD.A14("avatar coin flip config required");
                i = -495360401;
            }
        } else {
            A14 = AbstractC166987dD.A14("module name required");
            i = 1648224419;
        }
        C0f9.A09(i, A02);
        throw A14;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1495000571);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.avatar_coin_flip_nux_bottom_sheet_fragment, viewGroup, false);
        C0f9.A09(-424186370, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(2135854457);
        super.onDestroyView();
        C0f9.A09(-1503634760, A02);
    }
}
