package com.instagram.debug.devoptions.section.msys;

import X.AbstractC166987dD;
import X.AbstractC16960so;
import X.AbstractC18680vv;
import X.AbstractC31175DnJ;
import X.AbstractC33235ElU;
import X.AbstractC60492pY;
import X.AnonymousClass001;
import X.C0f9;
import X.C14360o3;
import X.C35246Fgf;
import X.C99Y;
import X.C9AQ;
import X.InterfaceC09390do;
import X.InterfaceC56362iU;
import X.InterfaceC60122ou;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class MsysDecouplingViewSettingsFragment extends AbstractC33235ElU implements InterfaceC60122ou {
    public final InterfaceC09390do session$delegate = AbstractC60492pY.A01(this);
    public final InterfaceC09390do userSession$delegate = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC31175DnJ.A1I(interfaceC56362iU, "[msys] Mailbox Bootstrap Decoupling Settings");
    }

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return "video_debug_settings";
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        setItems(AbstractC16960so.A1Q(new C35246Fgf(AnonymousClass001.A0R("ArmadilloExpressDBAwareGatingManager:\n", C99Y.A00.A01(AbstractC166987dD.A0r(this.userSession$delegate)))), new C35246Fgf(AnonymousClass001.A0R("ArmadilloExpressBootstrapGatingManager:\n", C9AQ.A00.A00(AbstractC166987dD.A0r(this.userSession$delegate))))));
    }

    @Override // X.AbstractC59962oe
    public AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.session$delegate);
    }

    public final UserSession getUserSession() {
        return AbstractC166987dD.A0r(this.userSession$delegate);
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-2056091202);
        super.onCreate(bundle);
        C0f9.A09(-2018400231, A02);
    }
}
