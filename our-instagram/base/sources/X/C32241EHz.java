package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.EHz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32241EHz extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ChallengePrizeSelectorFragment";
    public FFP A00;
    public EnumC33423Epu A01;
    public String A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsListCell igdsListCell = (IgdsListCell) AbstractC166997dE.A0S(view, R.id.challenge_prize_chooser_shoutout_option);
        IgdsListCell igdsListCell2 = (IgdsListCell) AbstractC166997dE.A0S(view, R.id.challenge_prize_chooser_message_option);
        TextView A0N = AbstractC167007dF.A0N(view, R.id.challenge_prize_chooser_custom_option_edit);
        IgdsListCell igdsListCell3 = (IgdsListCell) AbstractC166997dE.A0S(view, R.id.challenge_prize_chooser_custom_option_radio);
        AbstractC31180DnO.A1D(this, igdsListCell, 2131954976);
        AbstractC31180DnO.A1D(this, igdsListCell2, 2131954974);
        EnumC33423Epu enumC33423Epu = this.A01;
        if (enumC33423Epu == null) {
            str = "initialOption";
        } else {
            if (enumC33423Epu == EnumC33423Epu.A06) {
                String str2 = this.A02;
                if (str2 == null) {
                    str = "customOptionValue";
                } else {
                    A0N.setText(str2, TextView.BufferType.EDITABLE);
                }
            } else {
                A0N.setHint(getString(2131954972));
            }
            igdsListCell.A0H(AbstractC25227BEk.A0v(this, 2131954975));
            igdsListCell2.A0H(AbstractC25227BEk.A0v(this, 2131954973));
            EnumC53237Nga enumC53237Nga = EnumC53237Nga.A07;
            igdsListCell.A0G(enumC53237Nga, true);
            igdsListCell2.A0G(enumC53237Nga, true);
            igdsListCell3.A0G(enumC53237Nga, true);
            C35745Fqd.A02(igdsListCell, this, 12);
            C35745Fqd.A02(igdsListCell2, this, 13);
            C35745Fqd.A02(igdsListCell3, this, 14);
            C35469Fl4.A00(A0N, this, 9);
            AbstractC31178DnM.A11(this, new C50124MBy(igdsListCell2, igdsListCell, this, igdsListCell3, null, 5), ((C31797DyH) this.A04.getValue()).A01);
            return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    public C32241EHz() {
        C50153MDg c50153MDg = new C50153MDg(this, 13);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C50153MDg(new C50153MDg(this, 10), 11));
        this.A04 = AbstractC25225BEi.A0a(new C50153MDg(A00, 12), c50153MDg, new C50172MDz(47, null, A00), AbstractC25225BEi.A1D(C31797DyH.class));
        this.A03 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1652202534);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.fragment_direct_challenge_prize_chooser, false);
        C0f9.A09(81500118, A02);
        return A0R;
    }
}
