package X;

import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: X.Ekl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33198Ekl extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "DirectSuggestedReplySettingsFragment";
    public LGj A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131960377);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_suggested_reply_settings_fragment";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1371115707);
        super.onCreate(bundle);
        LGj lGj = new LGj(this, AbstractC166987dD.A0r(this.A01));
        this.A00 = lGj;
        LGj.A00(lGj, null, "suggested_replies_settings_impression", null, AbstractC166987dD.A1G());
        C0f9.A09(-1047224446, A02);
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1600470716);
        super.onResume();
        InterfaceC09390do interfaceC09390do = this.A01;
        C2056398n A00 = AbstractC2056298m.A00(AbstractC166987dD.A0r(interfaceC09390do));
        ArrayList A1E = AbstractC166987dD.A1E();
        C35246Fgf.A02(A1E, 2131960375);
        if (C7I2.A00(AbstractC166987dD.A0r(interfaceC09390do))) {
            A1E.add(new C36731GHa(new C35730FqD(8, this, A00), requireContext().getString(2131960374), requireContext().getString(2131960372), A00.A08()));
        }
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        C14360o3.A0B(A0o, 0);
        C06090Tz c06090Tz = C06090Tz.A06;
        if (AbstractC31177DnL.A1U(c06090Tz, A0o, 36315194028264555L) || C18U.A06(c06090Tz, AbstractC25230BEn.A0k(interfaceC09390do, 0), 36316173280743515L)) {
            A1E.add(new C36731GHa(new C35730FqD(9, this, A00), requireContext().getString(2131960371), requireContext().getString(2131960370), AbstractC167017dG.A1b(A00, A00.A0U, C2056398n.A0d, 8)));
        }
        setItems(A1E);
        C0f9.A09(-904014890, A02);
    }
}
