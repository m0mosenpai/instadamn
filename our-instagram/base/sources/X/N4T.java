package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.facebook.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;

/* loaded from: classes9.dex */
public final class N4T extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "DirectMessageSettingsUpsellsBottomSheetFragment";
    public OWU A00;
    public C54990OTy A01;
    public EnumC39589Hdz A02;
    public String A03;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A05;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_message_settings_upsell_bottom_sheet";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    public N4T() {
        C57529Pg3 A00 = C57529Pg3.A00(this, 8);
        InterfaceC09390do A002 = AbstractC09440dt.A00(EnumC09460dv.A02, C57529Pg3.A00(C57529Pg3.A00(this, 5), 6));
        this.A05 = AbstractC25225BEi.A0a(C57529Pg3.A00(A002, 7), A00, new C29895DGj(6, null, A002), AbstractC25225BEi.A1D(C53029Nd1.class));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        Object obj;
        int A02 = C0f9.A02(225091265);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        EnumC39589Hdz enumC39589Hdz = null;
        if (bundle2 != null) {
            str = bundle2.getString(AbstractC50532MSl.A00());
        } else {
            str = null;
        }
        this.A03 = str;
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            obj = bundle3.getSerializable("entrypoint");
        } else {
            obj = null;
        }
        if (obj instanceof EnumC39589Hdz) {
            enumC39589Hdz = (EnumC39589Hdz) obj;
        }
        this.A02 = enumC39589Hdz;
        OLM olm = new OLM(this, AbstractC166987dD.A0r(this.A04));
        String str2 = this.A03;
        EnumC39589Hdz enumC39589Hdz2 = this.A02;
        EnumC72375XcB enumC72375XcB = EnumC72375XcB.A06;
        this.A00 = new OWU(enumC39589Hdz2, olm, enumC72375XcB, str2);
        this.A01 = new C54990OTy(this.A02, olm, enumC72375XcB, this.A03);
        C0f9.A09(469636385, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String A0p;
        Context requireContext;
        int i;
        int A02 = C0f9.A02(1788897909);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.direct_message_settings_upsell_bottom_sheet, viewGroup, false);
        CompoundButton compoundButton = (CompoundButton) AbstractC166997dE.A0R(inflate, R.id.anyone_radio);
        CompoundButton compoundButton2 = (CompoundButton) AbstractC166997dE.A0R(inflate, R.id.your_followers_radio);
        CompoundButton compoundButton3 = (CompoundButton) AbstractC166997dE.A0R(inflate, R.id.no_one_radio);
        boolean equals = C18U.A04(C06090Tz.A05, AbstractC166987dD.A0o(this.A04), 36879402407297292L).equals(AbstractC43591JPw.A00(1148));
        Context requireContext2 = requireContext();
        if (equals) {
            A0p = AbstractC166997dE.A0p(requireContext2, 2131976374);
            requireContext = requireContext();
            i = 2131976369;
        } else {
            A0p = AbstractC166997dE.A0p(requireContext2, 2131976375);
            requireContext = requireContext();
            i = 2131976370;
        }
        String string = requireContext.getString(i);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AbstractC166997dE.A0R(inflate, R.id.upsell_bottom_sheet_headline);
        C14360o3.A0B(igdsHeadline, 0);
        igdsHeadline.A02 = true;
        igdsHeadline.setHeadline(A0p);
        if (string != null) {
            igdsHeadline.setBody(string);
        }
        igdsHeadline.setImageResource(R.drawable.ig_illustrations_qp_messages_refresh);
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) AbstractC166997dE.A0R(inflate, R.id.bottom_bar);
        AbstractC54295NzF.A00(igdsBottomButtonLayout, new OCY(new ViewOnClickListenerC55463OkI(this, 19), AbstractC25230BEn.A0m(this), 2131972699, 2131968687));
        AbstractC53034Nd6 A0v = MSW.A0v(this.A05);
        AbstractC37301Gc2.A0w(getViewLifecycleOwner(), A0v.A00, new C30177DRh(25, compoundButton2, compoundButton, igdsBottomButtonLayout, compoundButton3), 41);
        C57157PZb.A01(A0v, this, AbstractC25235BEs.A0S(this), 23);
        C55519OlD.A01(compoundButton, this, 31);
        C55519OlD.A01(compoundButton2, this, 32);
        C55519OlD.A01(compoundButton3, this, 33);
        C0f9.A09(235274947, A02);
        return inflate;
    }
}
