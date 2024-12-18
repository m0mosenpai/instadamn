package X;

import android.os.Bundle;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes6.dex */
public final class EEF extends AbstractC32247EIg {
    public static final String __redex_internal_original_name = "AvatarCoinFlipMimicryUpsellBottomSheetFragment";
    public C34394FEk A04;
    public C189478aR A06;
    public String A07;
    public String A08;
    public String A0A;
    public final InterfaceC09390do A0B = AbstractC60492pY.A02(this);
    public int A03 = R.drawable.ig_avatar_assets_avatar_nux_static;
    public int A02 = 2131953560;
    public int A01 = 2131956937;
    public int A00 = 2131953556;
    public boolean A09 = true;
    public C53O A05 = new C35909FtT(this, 0);

    private final List A00() {
        C149736oQ c149736oQ;
        UserSession A0r;
        EnumC143286dT enumC143286dT;
        EnumC143276dS enumC143276dS;
        InterfaceC09390do interfaceC09390do = this.A0B;
        if (AbstractC31248DoW.A01(AbstractC166987dD.A0r(interfaceC09390do)) && AbstractC31248DoW.A00(AbstractC166987dD.A0r(interfaceC09390do))) {
            c149736oQ = EnumC143276dS.A01;
            A0r = AbstractC166987dD.A0r(interfaceC09390do);
            enumC143286dT = EnumC143286dT.A0E;
            enumC143276dS = EnumC143276dS.A0E;
        } else if (AbstractC31248DoW.A02(AbstractC166987dD.A0r(interfaceC09390do)) && AbstractC31248DoW.A01(AbstractC166987dD.A0r(interfaceC09390do))) {
            c149736oQ = EnumC143276dS.A01;
            A0r = AbstractC166987dD.A0r(interfaceC09390do);
            enumC143286dT = EnumC143286dT.A0E;
            enumC143276dS = EnumC143276dS.A0F;
        } else if (AbstractC31248DoW.A02(AbstractC166987dD.A0r(interfaceC09390do))) {
            c149736oQ = EnumC143276dS.A01;
            A0r = AbstractC166987dD.A0r(interfaceC09390do);
            enumC143286dT = EnumC143286dT.A0E;
            enumC143276dS = EnumC143276dS.A0A;
        } else {
            return null;
        }
        return AbstractC166987dD.A1J(c149736oQ.A00(enumC143276dS, enumC143286dT, A0r, false));
    }

    @Override // X.AbstractC32247EIg
    public final void A0O() {
        JZ8 jz8 = AbstractC47193KtS.A01;
        UserSession A0r = AbstractC166987dD.A0r(this.A0B);
        jz8.A04(requireActivity(), this.A05, A0r, A0H(), A0G(), null, A00());
    }

    @Override // X.AbstractC32247EIg
    public final void A0P() {
        JZ8 jz8 = AbstractC47193KtS.A01;
        UserSession A0r = AbstractC166987dD.A0r(this.A0B);
        jz8.A04(requireActivity(), this.A05, A0r, A0H(), A0G(), null, A00());
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str = this.A0A;
        if (str == null) {
            C14360o3.A0F("previousModuleName");
            throw C00O.createAndThrow();
        }
        return str;
    }

    @Override // X.AbstractC32247EIg, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalStateException A14;
        int i;
        int A02 = C0f9.A02(-1022053256);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("args_editor_logging_surface");
        if (string != null) {
            this.A08 = string;
            String string2 = requireArguments.getString("args_editor_logging_mechanism");
            if (string2 != null) {
                this.A07 = string2;
                String string3 = requireArguments.getString("args_previous_module_name");
                if (string3 != null) {
                    this.A0A = string3;
                    C0f9.A09(1247692478, A02);
                    return;
                } else {
                    A14 = AbstractC166987dD.A14("previous module required");
                    i = 1683250918;
                }
            } else {
                A14 = AbstractC166987dD.A14("editor logging mechanism required");
                i = -152512079;
            }
        } else {
            A14 = AbstractC166987dD.A14("editor logging surface required");
            i = -441040210;
        }
        C0f9.A09(i, A02);
        throw A14;
    }
}
