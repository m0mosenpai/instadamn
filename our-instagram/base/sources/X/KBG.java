package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import java.io.Serializable;

/* loaded from: classes8.dex */
public final class KBG extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "FriendMapSettingsBottomSheetFragment";
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);
    public InterfaceC16610sE A00 = MMJ.A00;
    public final InterfaceC09390do A01 = MHN.A00(this, 14);
    public final InterfaceC09390do A02 = MHN.A00(this, 15);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Serializable serializable;
        String string;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && bundle2.getBoolean("arg_is_from_nux")) {
            LLR.A02(EnumC46289KeL.NUX_AUDIENCE_SELECT, AbstractC43592JPx.A0i(this.A02), "NUX_WINDOW", "IMPRESSION");
        }
        LLR A0i = AbstractC43592JPx.A0i(this.A02);
        Bundle bundle3 = this.mArguments;
        EnumC46298KeU enumC46298KeU = null;
        if (bundle3 != null) {
            serializable = bundle3.getSerializable("arg_entrypoint");
        } else {
            serializable = null;
        }
        if (serializable instanceof EnumC46298KeU) {
            enumC46298KeU = (EnumC46298KeU) serializable;
        }
        EnumC92974Es enumC92974Es = ((C45292K2u) AbstractC43592JPx.A0k(this.A04).A0L()).A03;
        C14360o3.A0B(enumC92974Es, 1);
        LLR.A00(null, null, enumC46298KeU, null, A0i, enumC92974Es, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "AUDIENCE_SELECT_WINDOW", "IMPRESSION", null, null, null, null, null, null, null, null, null);
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null && (string = bundle4.getString("arg_current_hidden_place_name")) != null) {
            String A0q = AbstractC166997dE.A0q(AbstractC166997dE.A0N(this), 2131962863);
            String A0r = AbstractC166997dE.A0r(AbstractC166997dE.A0N(this), string, 2131962861);
            EnumC193348hE enumC193348hE = EnumC193348hE.A04;
            MHN mhn = new MHN(this, 17);
            C50234MGp c50234MGp = C50234MGp.A00;
            C50235MGq c50235MGq = C50235MGq.A00;
            C193328hC A0O = AbstractC31175DnJ.A0O(this);
            A0O.A05 = A0q;
            A0O.A0S(DialogInterfaceOnClickListenerC48023LMs.A00(mhn, 56), enumC193348hE, 2131962862);
            DialogInterfaceOnDismissListenerC48025LMu.A00(A0O, c50234MGp, 10);
            A0O.A0h(new DialogInterfaceOnShowListenerC48027LMw(c50235MGq, 7));
            A0O.A0I(null, 2131956794);
            if (A0r != null) {
                A0O.A0r(A0r);
            }
            AbstractC166987dD.A1W(A0O);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    public KBG() {
        MHN mhn = new MHN(this, 18);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new MHN(new MHN(this, 23), 24));
        this.A04 = AbstractC25225BEi.A0a(new MHN(A00, 25), mhn, new ME1(42, null, A00), AbstractC25225BEi.A1D(C45995KXj.class));
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1993) {
            JQC A0k = AbstractC43592JPx.A0k(this.A04);
            A0k.A0O(new C50355MLh(A0k, 43));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1310425224);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30191DRw(this, 33), 1495259490);
        C0f9.A09(47774847, A02);
        return A00;
    }
}
