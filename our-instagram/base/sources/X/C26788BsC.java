package X;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* renamed from: X.BsC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26788BsC extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "LockoutFragment";
    public boolean A00;
    public boolean A01;
    public final InterfaceC09390do A05 = C1XM.A00(new D8A(this, 5));
    public final InterfaceC09390do A04 = C1XM.A00(new D8A(this, 4));
    public final InterfaceC09390do A03 = C1XM.A00(new D8A(this, 3));
    public boolean A02 = true;
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "dogfooding_lockout";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return this.A02;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C8m c8m;
        int A02 = C0f9.A02(1917041907);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A02 = bundle2.getBoolean("com.instagram.release.lockout.disable_back_press", true);
            this.A00 = bundle2.getBoolean("com.instagram.release.lockout.expired_build", false);
        }
        boolean A03 = ((C3EW) this.A04.getValue()).A03();
        this.A01 = A03;
        boolean z = this.A00;
        C3EZ c3ez = (C3EZ) this.A05.getValue();
        if (z) {
            c8m = C8m.PRESENT_STALE_BUILD_LOCKOUT_SCREEN;
        } else if (A03) {
            c8m = C8m.PRESENT_PROD_LOCKOUT_SCREEN_NO_SNOOZE;
        } else {
            c8m = C8m.PRESENT_PROD_LOCKOUT_SCREEN;
        }
        c3ez.A00(c8m);
        C0f9.A09(-148081326, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1549766711);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30189DRu(this, 31), -813392769);
        C0f9.A09(-173750079, A02);
        return A00;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        InterfaceC53712dA interfaceC53712dA;
        int A02 = C0f9.A02(604424277);
        super.onDestroyView();
        ComponentCallbacks2 rootActivity = getRootActivity();
        if ((rootActivity instanceof InterfaceC53712dA) && (interfaceC53712dA = (InterfaceC53712dA) rootActivity) != null) {
            interfaceC53712dA.EfL(0);
        }
        C0f9.A09(-154165670, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        InterfaceC53712dA interfaceC53712dA;
        int A02 = C0f9.A02(1408102525);
        super.onStart();
        ComponentCallbacks2 rootActivity = getRootActivity();
        if ((rootActivity instanceof InterfaceC53712dA) && (interfaceC53712dA = (InterfaceC53712dA) rootActivity) != null) {
            interfaceC53712dA.EfL(8);
        }
        C0f9.A09(-500217301, A02);
    }
}
