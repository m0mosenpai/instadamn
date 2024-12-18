package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.io.Serializable;

/* loaded from: classes9.dex */
public final class N4W extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "TagSettingsUpsellsBottomSheetFragment";
    public OWU A00;
    public C54990OTy A01;
    public EnumC39589Hdz A02;
    public OLM A03;
    public EnumC53250Ngo A04;
    public String A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "tag_settings_upsell_bottom_sheet";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    public N4W() {
        C57529Pg3 A00 = C57529Pg3.A00(this, 34);
        InterfaceC09390do A002 = AbstractC09440dt.A00(EnumC09460dv.A02, C57529Pg3.A00(C57529Pg3.A00(this, 31), 32));
        this.A07 = AbstractC25225BEi.A0a(C57529Pg3.A00(A002, 33), A00, new C29895DGj(12, null, A002), AbstractC25225BEi.A1D(C53032Nd4.class));
        this.A04 = EnumC53250Ngo.A04;
        this.A06 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        Serializable serializable;
        EnumC39589Hdz enumC39589Hdz;
        EnumC53250Ngo enumC53250Ngo;
        int A02 = C0f9.A02(-1872013089);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        Serializable serializable2 = null;
        if (bundle2 != null) {
            str = bundle2.getString(AbstractC50532MSl.A00());
        } else {
            str = null;
        }
        this.A05 = str;
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            serializable = bundle3.getSerializable("entrypoint");
        } else {
            serializable = null;
        }
        if (serializable instanceof EnumC39589Hdz) {
            enumC39589Hdz = (EnumC39589Hdz) serializable;
        } else {
            enumC39589Hdz = null;
        }
        this.A02 = enumC39589Hdz;
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            serializable2 = bundle4.getSerializable("upsell_type");
        }
        if (!(serializable2 instanceof EnumC53250Ngo) || (enumC53250Ngo = (EnumC53250Ngo) serializable2) == null) {
            enumC53250Ngo = EnumC53250Ngo.A04;
        }
        this.A04 = enumC53250Ngo;
        OLM olm = new OLM(this, AbstractC166987dD.A0r(this.A06));
        this.A03 = olm;
        String str2 = this.A05;
        EnumC39589Hdz enumC39589Hdz2 = this.A02;
        EnumC72375XcB enumC72375XcB = EnumC72375XcB.A09;
        this.A00 = new OWU(enumC39589Hdz2, olm, enumC72375XcB, str2);
        String str3 = this.A05;
        EnumC39589Hdz enumC39589Hdz3 = this.A02;
        OLM olm2 = this.A03;
        if (olm2 == null) {
            C14360o3.A0F("upsellsLogger");
            throw C00O.createAndThrow();
        }
        this.A01 = new C54990OTy(enumC39589Hdz3, olm2, enumC72375XcB, str3);
        C0f9.A09(749505763, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-281263918);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.tag_settings_upsell_bottom_sheet, viewGroup, false);
        IgdsListCell igdsListCell = (IgdsListCell) AbstractC166997dE.A0R(inflate, R.id.everyone_radio);
        IgdsListCell igdsListCell2 = (IgdsListCell) AbstractC166997dE.A0R(inflate, R.id.people_you_follow_radio);
        IgdsListCell igdsListCell3 = (IgdsListCell) AbstractC166997dE.A0R(inflate, R.id.off_radio);
        EnumC53237Nga enumC53237Nga = EnumC53237Nga.A07;
        igdsListCell.setTextCellType(enumC53237Nga);
        igdsListCell2.setTextCellType(enumC53237Nga);
        igdsListCell3.setTextCellType(enumC53237Nga);
        String A0p = AbstractC166997dE.A0p(requireContext(), this.A04.A01);
        String string = requireContext().getString(this.A04.A00);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AbstractC166997dE.A0R(inflate, R.id.upsell_bottom_sheet_headline);
        C14360o3.A0B(igdsHeadline, 0);
        igdsHeadline.A02 = true;
        igdsHeadline.setHeadline(A0p);
        if (string != null) {
            igdsHeadline.setBody(string);
        }
        OCY ocy = new OCY(new ViewOnClickListenerC55463OkI(this, 24), AbstractC25230BEn.A0m(this), 2131972699, 2131968687);
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) AbstractC166997dE.A0R(inflate, R.id.bottom_bar);
        AbstractC54295NzF.A00(igdsBottomButtonLayout, ocy);
        AbstractC53034Nd6 A0v = MSW.A0v(this.A07);
        AbstractC37301Gc2.A0w(getViewLifecycleOwner(), A0v.A00, new C30177DRh(27, igdsListCell2, igdsListCell, igdsBottomButtonLayout, igdsListCell3), 45);
        C57157PZb.A01(A0v, this, AbstractC25235BEs.A0S(this), 26);
        C55519OlD.A02(igdsListCell, this, 43);
        C55519OlD.A02(igdsListCell2, this, 44);
        C55519OlD.A02(igdsListCell3, this, 45);
        C0f9.A09(1285413762, A02);
        return inflate;
    }
}
