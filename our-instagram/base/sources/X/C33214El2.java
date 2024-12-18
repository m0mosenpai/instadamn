package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;

/* renamed from: X.El2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33214El2 extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "ContactOptionsFragment";
    public final InterfaceC41501vz A01 = C31650DvG.A00(this, 11);
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131963153);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "contacts_import_settings";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    public static final ArrayList A00(C33214El2 c33214El2) {
        ArrayList A1E = AbstractC166987dD.A1E();
        Context context = c33214El2.getContext();
        if (context != null) {
            InterfaceC09390do interfaceC09390do = c33214El2.A00;
            AbstractC33235ElU.A09(c33214El2, A1E, 4, 2131956593, C54P.A01(context, AbstractC166987dD.A0r(interfaceC09390do)));
            String A0v = AbstractC25227BEk.A0v(c33214El2, 2131965052);
            SpannableStringBuilder A08 = AbstractC31178DnM.A08(c33214El2, A0v, 2131956600);
            AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
            String A01 = AbstractC63260SgI.A01(context, "https://help.instagram.com/227486307449481");
            C14360o3.A07(A01);
            AnonymousClass773.A05(A08, new C33248Eli(context, A0o, null, A01, AbstractC31174DnI.A02(context)), A0v);
            A1E.add(new C35246Fgf(A08));
        }
        return A1E;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(770423163);
        super.onPause();
        AbstractC31176DnK.A0Q(this.A00).A02(this.A01, C36114Fwo.class);
        C0f9.A09(-774425165, A02);
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(504721859);
        super.onResume();
        AbstractC31176DnK.A0Q(this.A00).A01(this.A01, C36114Fwo.class);
        setItems(A00(this));
        C0f9.A09(2081868493, A02);
    }
}
