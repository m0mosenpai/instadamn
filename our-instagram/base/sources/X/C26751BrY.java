package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.BrY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26751BrY extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "EarlyAccessFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131961212);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "early_access_settings";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-246255352);
        ComposeView A01 = AbstractC25319BIo.A01(this, AbstractC27781CMw.A00);
        C0f9.A09(1233813639, A02);
        return A01;
    }
}
