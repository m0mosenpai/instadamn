package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.R;
import java.util.List;

/* loaded from: classes8.dex */
public final class KCF extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "BrandedContentWelcomeComposeFragment";
    public boolean A00;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);
    public final List A01 = AbstractC16960so.A1Q(AbstractC167007dF.A0o(Integer.valueOf(R.drawable.instagram_settings_pano_outline_24), 2131977047), AbstractC167007dF.A0o(Integer.valueOf(R.drawable.instagram_tag_down_pano_outline_24), 2131977048), AbstractC167007dF.A0o(Integer.valueOf(R.drawable.instagram_users_pano_outline_24), 2131977049), AbstractC167007dF.A0o(Integer.valueOf(R.drawable.instagram_compose_pano_outline_24), 2131977050));

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131954217);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return true;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 16 && !getParentFragmentManager().A11()) {
            AbstractC25226BEj.A1P(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1460062748);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30480DbP(this, 38), 1356063744);
        C0f9.A09(26603529, A02);
        return A00;
    }
}
