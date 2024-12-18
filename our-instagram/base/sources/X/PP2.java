package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.plugins.CreatorInspirationSignalsPlaygroundRecommendationsFragmentPluginKt;

/* loaded from: classes9.dex */
public final class PP2 implements Runnable {
    public final /* synthetic */ HC4 A00;

    public PP2(HC4 hc4) {
        this.A00 = hc4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HC4 hc4 = this.A00;
        AbstractC31174DnI.A0I(hc4).A18(CreatorInspirationSignalsPlaygroundRecommendationsFragmentPluginKt.RECOMMENDATION_FRAGMENT_TAG, 1);
        C146106i8 A0K = AbstractC31171DnF.A0K();
        AbstractC25226BEj.A1N(hc4.requireContext(), A0K, 2131957193);
        AbstractC31178DnM.A1S(A0K);
    }
}
