package X;

import android.os.Bundle;

/* renamed from: X.KAe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45443KAe extends AbstractC45465KBa implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AvatarNuxStickerGridFragment";
    public String A01;
    public EnumC143286dT A00 = EnumC143286dT.A0D;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC31175DnJ.A1I(interfaceC56362iU, AbstractC166997dE.A0N(this).getString(2131953535));
        AbstractC31179DnN.A1G(interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str = this.A01;
        if (str == null) {
            C14360o3.A0F("previousModuleName");
            throw C00O.createAndThrow();
        }
        return AnonymousClass001.A0R(str, "_context_sheet_post_avatar_creation");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1726305092);
        super.onCreate(bundle);
        String string = requireArguments().getString("args_previous_module_name");
        if (string != null) {
            this.A01 = string;
            this.A0L = false;
            this.A0H = false;
            this.A0G = false;
            if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(this.A02), 36319441750859187L)) {
                super.A00 = 4;
            }
            C0f9.A09(959283415, A02);
            return;
        }
        IllegalStateException A14 = AbstractC166987dD.A14("previous module required");
        C0f9.A09(107889511, A02);
        throw A14;
    }
}
