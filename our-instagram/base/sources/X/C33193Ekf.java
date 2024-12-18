package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.facebook.R;
import java.util.ArrayList;

/* renamed from: X.Ekf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33193Ekf extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AutomaticPreviewsSettingsFragment";
    public final InterfaceC09390do A01 = C1XM.A00(new X2z(this, 39));
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131953435);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "automatic_previews_toggle";
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ArrayList A1E = AbstractC166987dD.A1E();
        C23031Ai c23031Ai = (C23031Ai) this.A01.getValue();
        AbstractC33235ElU.A09(this, A1E, 40, 2131953437, AbstractC167017dG.A1b(c23031Ai, c23031Ai.A7t, C23031Ai.A8c, 510));
        Context requireContext = requireContext();
        String A0p = AbstractC166997dE.A0p(requireContext, 2131953436);
        Em1 em1 = new Em1(this, AbstractC31174DnI.A02(requireContext));
        SpannableStringBuilder A08 = AbstractC31178DnM.A08(this, A0p, 2131953438);
        AnonymousClass773.A04(A08, em1, A0p);
        C35246Fgf c35246Fgf = new C35246Fgf(A08);
        c35246Fgf.A01 = R.style.PrivacyTextStyle;
        A1E.add(c35246Fgf);
        setItems(A1E);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }
}
