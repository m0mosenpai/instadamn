package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.El5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33217El5 extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final List A02 = AbstractC16960so.A1Q(EnumC160877Iv.A03, EnumC160877Iv.A04);
    public static final String __redex_internal_original_name = "DirectMemberAddModeFragment";
    public C34433FFx A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, X.AbstractC59972of
    public final void afterOnCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, View view) {
        int i;
        C14360o3.A0B(layoutInflater, 0);
        super.afterOnCreateView(layoutInflater, viewGroup, bundle, view);
        ArrayList A1E = AbstractC166987dD.A1E();
        for (EnumC160877Iv enumC160877Iv : A02) {
            String valueOf = String.valueOf(enumC160877Iv.A00);
            int ordinal = enumC160877Iv.ordinal();
            if (ordinal != 2 && ordinal != 0) {
                if (ordinal == 1) {
                    i = 2131958678;
                } else {
                    throw B4Z.A00();
                }
            } else {
                i = 2131958677;
            }
            C35124FeR.A00(valueOf, getString(i), A1E);
        }
        int i2 = requireArguments().getInt("DIRECT_MEMBER_ADD_MODE_SELECTED");
        if (AbstractC160867Iu.A00(Integer.valueOf(i2)) == EnumC160877Iv.A05) {
            i2 = 0;
        }
        setItems(AbstractC166987dD.A1J(new C34960Fak(new C35748Fqg(this, 1), String.valueOf(i2), A1E, false)));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_member_add_mode";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.Efu(2131958679);
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A022 = C0f9.A02(1638349875);
        super.onCreate(bundle);
        C0f9.A09(-414088699, A022);
    }
}
