package X;

import android.os.Bundle;
import android.view.View;
import com.facebook.R;
import java.util.List;

/* renamed from: X.KAd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45442KAd extends AbstractC45465KBa {
    public static final String __redex_internal_original_name = "ReelAvatarQuickReactionsMoreOptionsFragment";
    public LA9 A00;
    public C41181vS A01;
    public InterfaceC1118853a A02;
    public C148076ld A03;
    public C147046jg A04;
    public InterfaceC16820sZ A05;
    public boolean A06;
    public boolean A07;
    public String A08;
    public final InterfaceC09390do A09 = C1XM.A00(MHG.A00);
    public final InterfaceC09390do A0A = AbstractC60492pY.A02(this);

    @Override // X.AbstractC45465KBa
    public final void A0H(QIw qIw, AbstractC46382Kg4 abstractC46382Kg4, AbstractC46386Kg8 abstractC46386Kg8, List list) {
        C14360o3.A0B(list, 0);
        super.A0H(qIw, null, null, list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            LA9 la9 = this.A00;
            if (la9 != null) {
                String A15 = AbstractC25225BEi.A15(this.A09);
                Integer num = C05F.A00;
                String str = ((C148286ly) list.get(i)).A0a;
                C14360o3.A07(str);
                la9.A01(num, num, C05F.A0C, A15, str, "", "", 1, 1, i, i, list.size(), false);
            }
        }
    }

    @Override // X.AbstractC45465KBa, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC31172DnG.A1B(requireContext(), AbstractC166997dE.A0S(view, R.id.avatar_sticker_grid_container), R.color.black);
        LA9 A00 = AbstractC46620Kjx.A00(AbstractC166987dD.A0r(this.A0A));
        this.A00 = A00;
        A00.A02(C05F.A0C, C05F.A00, AbstractC25225BEi.A15(this.A09));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str = this.A08;
        if (str == null) {
            C14360o3.A0F("previousModuleName");
            throw C00O.createAndThrow();
        }
        return AnonymousClass001.A0R(str, "_avatar_quick_reactions_more_options_sticker_grid");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0A);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1481490113);
        super.onCreate(bundle);
        super.A04 = EnumC143286dT.A0F;
        String string = requireArguments().getString("args_previous_module_name");
        if (string != null) {
            this.A08 = string;
            super.A00 = 4;
            this.A0N = false;
            this.A0H = true;
            this.A0G = false;
            C0f9.A09(-2044865377, A02);
            return;
        }
        IllegalStateException A14 = AbstractC166987dD.A14("previous module required");
        C0f9.A09(1126907776, A02);
        throw A14;
    }

    @Override // X.AbstractC45465KBa, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-788324474);
        super.onDestroy();
        LA9 la9 = this.A00;
        if (la9 != null) {
            la9.A03(AbstractC25225BEi.A15(this.A09), "");
        }
        C0f9.A09(-1581063111, A02);
    }
}
