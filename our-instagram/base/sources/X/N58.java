package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class N58 extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "ClipsEditMetadataAdvancedSettingsFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131952526);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "clips_editor_advanced_settings";
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0167, code lost:
    
        if (X.AbstractC166987dD.A1a(r0) != false) goto L30;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r13, android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N58.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    public N58() {
        C0YZ A1D = AbstractC25225BEi.A1D(C51034Mgi.class);
        this.A01 = AbstractC25225BEi.A0a(new C57537PgB(this, 35), new C57537PgB(this, 36), new D8J(2, null, this), A1D);
        this.A00 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(938337796);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_clips_edit_advanced_settings_fragment, false);
        C0f9.A09(1729640273, A02);
        return A0R;
    }
}
