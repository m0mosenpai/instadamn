package X;

import android.os.Bundle;
import android.view.View;

/* renamed from: X.NXk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52778NXk extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "ReelSettingsFragment";
    public C56255Oy2 A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        C56255Oy2 c56255Oy2 = this.A00;
        if (c56255Oy2 == null) {
            C14360o3.A0F("settingsController");
            throw C00O.createAndThrow();
        }
        AbstractC25229BEm.A1G(interfaceC56362iU, c56255Oy2.C8w());
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C56255Oy2 c56255Oy2 = this.A00;
        if (c56255Oy2 == null) {
            C14360o3.A0F("settingsController");
            throw C00O.createAndThrow();
        }
        setItems(c56255Oy2.A0G);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        C56255Oy2 c56255Oy2 = this.A00;
        if (c56255Oy2 != null) {
            return c56255Oy2.getModuleName();
        }
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(563604963);
        super.onCreate(bundle);
        EnumC53140Net enumC53140Net = (EnumC53140Net) requireArguments().getSerializable("ReelSettingsFragment.ARGUMENT_REEL_SETTINGS_MODE");
        if (enumC53140Net == null) {
            enumC53140Net = EnumC53140Net.A02;
        }
        C56255Oy2 c56255Oy2 = new C56255Oy2(requireContext(), AbstractC166997dE.A0N(this), requireActivity(), AbstractC166987dD.A0r(this.A01), enumC53140Net, this);
        this.A00 = c56255Oy2;
        c56255Oy2.A02 = new C56254Oy1(this);
        C0f9.A09(-1192483472, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(327641509);
        super.onDestroy();
        C56255Oy2 c56255Oy2 = this.A00;
        if (c56255Oy2 == null) {
            C14360o3.A0F("settingsController");
            throw C00O.createAndThrow();
        }
        c56255Oy2.onDestroy();
        C0f9.A09(-2067328011, A02);
    }
}
