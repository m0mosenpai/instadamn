package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.EIi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32249EIi extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ChannelDurationSelectorFragment";
    public FFH A00;
    public EnumC33411Epi A01;
    public boolean A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View requireViewById = view.requireViewById(R.id.channel_duration_chooser_indefinite_option);
        IgdsListCell igdsListCell = (IgdsListCell) requireViewById;
        C14360o3.A0A(igdsListCell);
        EnumC33411Epi enumC33411Epi = EnumC33411Epi.A04;
        A00(enumC33411Epi, igdsListCell);
        C14360o3.A07(requireViewById);
        View requireViewById2 = view.requireViewById(R.id.channel_duration_chooser_3_month_option);
        IgdsListCell igdsListCell2 = (IgdsListCell) requireViewById2;
        C14360o3.A0A(igdsListCell2);
        EnumC33411Epi enumC33411Epi2 = EnumC33411Epi.A08;
        A00(enumC33411Epi2, igdsListCell2);
        C14360o3.A07(requireViewById2);
        View requireViewById3 = view.requireViewById(R.id.channel_duration_chooser_1_month_option);
        IgdsListCell igdsListCell3 = (IgdsListCell) requireViewById3;
        C14360o3.A0A(igdsListCell3);
        EnumC33411Epi enumC33411Epi3 = EnumC33411Epi.A06;
        A00(enumC33411Epi3, igdsListCell3);
        C14360o3.A07(requireViewById3);
        View requireViewById4 = view.requireViewById(R.id.channel_duration_chooser_1_day_option);
        IgdsListCell igdsListCell4 = (IgdsListCell) requireViewById4;
        C14360o3.A0A(igdsListCell4);
        A00(EnumC33411Epi.A05, igdsListCell4);
        C14360o3.A07(requireViewById4);
        View requireViewById5 = view.requireViewById(R.id.channel_duration_chooser_1_week_option);
        IgdsListCell igdsListCell5 = (IgdsListCell) requireViewById5;
        C14360o3.A0A(igdsListCell5);
        A00(EnumC33411Epi.A07, igdsListCell5);
        C14360o3.A07(requireViewById5);
        IgTextView igTextView = (IgTextView) AbstractC166997dE.A0S(view, R.id.options_description);
        EnumC33411Epi enumC33411Epi4 = this.A01;
        if (enumC33411Epi4 != null) {
            int i = 0;
            int i2 = 8;
            if (enumC33411Epi4 == enumC33411Epi) {
                i2 = 0;
            }
            igdsListCell.setVisibility(i2);
            EnumC33411Epi enumC33411Epi5 = this.A01;
            if (enumC33411Epi5 != null) {
                int i3 = 8;
                if (enumC33411Epi5 == enumC33411Epi2) {
                    i3 = 0;
                }
                igdsListCell2.setVisibility(i3);
                EnumC33411Epi enumC33411Epi6 = this.A01;
                if (enumC33411Epi6 != null) {
                    if (enumC33411Epi6 != enumC33411Epi3) {
                        i = 8;
                    }
                    igdsListCell3.setVisibility(i);
                    AbstractC31178DnM.A11(this, new GSP(igTextView, this, igdsListCell, igdsListCell2, igdsListCell3, igdsListCell4, igdsListCell5, null), ((C31805DyP) this.A04.getValue()).A01);
                    return;
                }
            }
        }
        C14360o3.A0F("initialOption");
        throw C00O.createAndThrow();
    }

    private final void A00(EnumC33411Epi enumC33411Epi, IgdsListCell igdsListCell) {
        igdsListCell.A06(enumC33411Epi.A01);
        igdsListCell.A0G(EnumC53237Nga.A07, true);
        igdsListCell.A0D(new C35730FqD(6, this, enumC33411Epi));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    public C32249EIi() {
        C37014GSt c37014GSt = new C37014GSt(this, 4);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C37014GSt(new C37014GSt(this, 1), 2));
        this.A04 = AbstractC25225BEi.A0a(new C37014GSt(A00, 3), c37014GSt, new C50172MDz(34, null, A00), AbstractC25225BEi.A1D(C31805DyP.class));
        this.A03 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(903797573);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.fragment_direct_channel_duration_chooser, false);
        C0f9.A09(254150434, A02);
        return A0R;
    }
}
