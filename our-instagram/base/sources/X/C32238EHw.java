package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.direct.fragment.prompts.challenges.duration.ChallengeDurationSelectorFragment$configureOptions$8;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.EHw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32238EHw extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ChallengeDurationSelectorFragment";
    public FFO A00;
    public EnumC33421Eps A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsListCell igdsListCell = (IgdsListCell) AbstractC166997dE.A0S(view, R.id.challenge_duration_chooser_1_min_option);
        IgdsListCell igdsListCell2 = (IgdsListCell) AbstractC166997dE.A0S(view, R.id.challenge_duration_chooser_5_min_option);
        IgdsListCell igdsListCell3 = (IgdsListCell) AbstractC166997dE.A0S(view, R.id.challenge_duration_chooser_1_hour_option);
        IgdsListCell igdsListCell4 = (IgdsListCell) AbstractC166997dE.A0S(view, R.id.challenge_duration_chooser_1_day_option);
        IgdsListCell igdsListCell5 = (IgdsListCell) AbstractC166997dE.A0S(view, R.id.challenge_duration_chooser_3_days_option);
        IgdsListCell igdsListCell6 = (IgdsListCell) AbstractC166997dE.A0S(view, R.id.challenge_duration_chooser_5_days_option);
        IgdsListCell igdsListCell7 = (IgdsListCell) AbstractC166997dE.A0S(view, R.id.challenge_duration_chooser_7_days_option);
        igdsListCell4.A06(2131954956);
        igdsListCell5.A06(2131954957);
        igdsListCell6.A06(2131954958);
        igdsListCell7.A06(2131954960);
        EnumC53237Nga enumC53237Nga = EnumC53237Nga.A07;
        igdsListCell4.A0G(enumC53237Nga, true);
        igdsListCell5.A0G(enumC53237Nga, true);
        igdsListCell6.A0G(enumC53237Nga, true);
        igdsListCell7.A0G(enumC53237Nga, true);
        C35745Fqd.A02(igdsListCell4, this, 5);
        C35745Fqd.A02(igdsListCell5, this, 6);
        C35745Fqd.A02(igdsListCell6, this, 7);
        C35745Fqd.A02(igdsListCell7, this, 8);
        if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(this.A02), 36324247819595788L)) {
            igdsListCell.setVisibility(0);
            igdsListCell2.setVisibility(0);
            igdsListCell3.setVisibility(0);
            igdsListCell.A0G(enumC53237Nga, true);
            igdsListCell2.A0G(enumC53237Nga, true);
            igdsListCell3.A0G(enumC53237Nga, true);
            igdsListCell.A06(2131954955);
            igdsListCell2.A06(2131954959);
            igdsListCell3.A06(2131954954);
            C35745Fqd.A02(igdsListCell, this, 9);
            C35745Fqd.A02(igdsListCell2, this, 10);
            C35745Fqd.A02(igdsListCell3, this, 11);
        }
        AbstractC31178DnM.A11(this, new ChallengeDurationSelectorFragment$configureOptions$8(this, igdsListCell4, igdsListCell5, igdsListCell6, igdsListCell7, igdsListCell, igdsListCell2, igdsListCell3, null), ((C31796DyG) this.A03.getValue()).A01);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    public C32238EHw() {
        C50153MDg c50153MDg = new C50153MDg(this, 8);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C50153MDg(new C50153MDg(this, 5), 6));
        this.A03 = AbstractC25225BEi.A0a(new C50153MDg(A00, 7), c50153MDg, new C50172MDz(46, null, A00), AbstractC25225BEi.A1D(C31796DyG.class));
        this.A02 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(579165183);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.fragment_direct_challenge_duration_chooser, false);
        C0f9.A09(-1544780891, A02);
        return A0R;
    }
}
