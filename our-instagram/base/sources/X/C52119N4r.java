package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.N4r, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52119N4r extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "LimitsPlusWhatToLimitBottomsheetFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "limitsplus_what_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C51788Mus c51788Mus;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        A00(view, this);
        C50897MeS c50897MeS = (C50897MeS) this.A01.getValue();
        InterfaceC58232Prc interfaceC58232Prc = (InterfaceC58232Prc) AbstractC50523MSb.A0C(c50897MeS.A00.A01).A03;
        if (interfaceC58232Prc != null) {
            C05A c05a = c50897MeS.A01;
            do {
                c51788Mus = (C51788Mus) interfaceC58232Prc;
            } while (!c05a.AIi(c05a.getValue(), new C50526MSf(c51788Mus.A01, c51788Mus.A00, 21)));
        }
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57169PZn(view, viewLifecycleOwner, c07s, this, null, 45), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    public C52119N4r() {
        C57511Pfl c57511Pfl = new C57511Pfl(this, 14);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57511Pfl(new C57511Pfl(this, 11), 12));
        this.A01 = AbstractC25225BEi.A0a(new C57511Pfl(A00, 13), c57511Pfl, new C29895DGj(1, null, A00), AbstractC25225BEi.A1D(C50897MeS.class));
        this.A00 = AbstractC60492pY.A02(this);
    }

    public static final void A00(View view, C52119N4r c52119N4r) {
        int i;
        IgdsListCell igdsListCell = (IgdsListCell) AbstractC166987dD.A0c(view, R.id.limits_plus_some_interactions_row);
        EnumC53237Nga enumC53237Nga = EnumC53237Nga.A03;
        igdsListCell.setTextCellType(enumC53237Nga);
        InterfaceC09390do interfaceC09390do = c52119N4r.A01;
        igdsListCell.setChecked(((C50526MSf) ((C50897MeS) interfaceC09390do.getValue()).A02.getValue()).A01);
        AbstractC31180DnO.A1D(c52119N4r, igdsListCell, 2131965191);
        InterfaceC09390do interfaceC09390do2 = c52119N4r.A00;
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do2);
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean booleanValue = AbstractC166997dE.A0c(c06090Tz, A0o, 36326219209258745L).booleanValue();
        int i2 = 2131965189;
        if (booleanValue) {
            i2 = 2131965190;
        }
        igdsListCell.A0H(AbstractC25227BEk.A0v(c52119N4r, i2));
        C55519OlD.A02(igdsListCell, c52119N4r, 24);
        IgdsListCell igdsListCell2 = (IgdsListCell) AbstractC166987dD.A0c(view, R.id.limits_plus_most_interactions_row);
        igdsListCell2.setTextCellType(enumC53237Nga);
        igdsListCell2.setChecked(((C50526MSf) ((C50897MeS) interfaceC09390do.getValue()).A02.getValue()).A00);
        AbstractC31180DnO.A1D(c52119N4r, igdsListCell2, 2131965173);
        if (AbstractC166997dE.A0c(c06090Tz, AbstractC166987dD.A0o(interfaceC09390do2), 36326219209258745L).booleanValue()) {
            i = 2131965171;
        } else {
            i = 2131965170;
            if (AbstractC31176DnK.A0g(C17060sy.A01, interfaceC09390do2).A0M() == C05F.A0C) {
                i = 2131965172;
            }
        }
        igdsListCell2.A0H(AbstractC25227BEk.A0v(c52119N4r, i));
        C55519OlD.A02(igdsListCell2, c52119N4r, 25);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1526915849);
        super.onCreate(bundle);
        C0f9.A09(911713600, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1327051957);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.limits_plus_what_to_limit_bottomsheet_layout, viewGroup, false);
        C0f9.A09(-867455299, A02);
        return inflate;
    }
}
