package X;

import android.os.Bundle;
import android.view.View;
import com.facebook.R;
import java.util.ArrayList;

/* renamed from: X.Ekg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33194Ekg extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "MessageLinksSettingsFragment";
    public final InterfaceC09390do A02 = C1XM.A00(C37061GUv.A01(this, 0));
    public final InterfaceC09390do A00 = C1XM.A00(new X2z(this, 49));
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131966356);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "message_links_toggle";
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ArrayList A1E = AbstractC166987dD.A1E();
        C23031Ai c23031Ai = (C23031Ai) this.A02.getValue();
        AbstractC33235ElU.A09(this, A1E, 43, 2131966357, AbstractC167017dG.A1b(c23031Ai, c23031Ai.A15, C23031Ai.A8c, 476));
        C35246Fgf c35246Fgf = new C35246Fgf(2131966358);
        c35246Fgf.A01 = R.style.PrivacyTextStyle;
        A1E.add(c35246Fgf);
        setItems(A1E);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }
}
