package X;

import android.os.Bundle;
import android.view.View;

/* renamed from: X.Ka5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46050Ka5 extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "CameraSettingsFragment";
    public final InterfaceC09390do A00 = AbstractC09440dt.A01(new C50151MDe(this, 28));
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        InterfaceC09390do interfaceC09390do = this.A00;
        interfaceC56362iU.Efu(((MRI) interfaceC09390do.getValue()).C8w());
        if (((MRI) interfaceC09390do.getValue()).EjN()) {
            interfaceC56362iU.EkS(true);
        } else {
            interfaceC56362iU.AAF(new ViewOnClickListenerC48063LPo(this, 17), 2131961124);
        }
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        setItems(((MRI) this.A00.getValue()).BST());
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return ((MRI) this.A00.getValue()).getModuleName();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1595978341);
        super.onDestroy();
        ((MRI) this.A00.getValue()).onDestroy();
        C0f9.A09(119752673, A02);
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(339453987);
        super.onResume();
        InterfaceC09390do interfaceC09390do = this.A00;
        ((MRI) interfaceC09390do.getValue()).onResume();
        setItems(((MRI) interfaceC09390do.getValue()).BST());
        C0f9.A09(1951626944, A02);
    }
}
