package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.ui.widget.pageindicator.CirclePageIndicator;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.Collection;

/* renamed from: X.EaU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32703EaU extends EOJ {
    public static final String __redex_internal_original_name = "DirectChallengeWinnerFragment";
    public IgSimpleImageView A00;
    public IgTextView A01;
    public IgTextView A02;
    public CirclePageIndicator A03;
    public SpinnerImageView A04;
    public final InterfaceC09390do A05 = AbstractC09440dt.A01(C37051GUh.A00(this, 19));
    public final InterfaceC09390do A06 = C1XM.A00(C37051GUh.A00(this, 25));
    public final InterfaceC41501vz A07 = C31650DvG.A00(this, 15);
    public final FFG A08 = new FFG(this);

    @Override // X.EOJ, X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(new GWH(this, 7));
    }

    @Override // X.EOJ, X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC56392iX interfaceC56392iX = super.A02;
        if (interfaceC56392iX != null) {
            interfaceC56392iX.setVisibility(8);
            this.A02 = AbstractC31172DnG.A0X(view, R.id.challenge_winner_title);
            this.A01 = AbstractC31172DnG.A0X(view, R.id.challenge_winner_subtitle);
            this.A04 = (SpinnerImageView) view.requireViewById(R.id.challenge_winner_loading_spinner);
            this.A03 = (CirclePageIndicator) view.requireViewById(R.id.page_indicator);
            this.A00 = (IgSimpleImageView) view.requireViewById(R.id.confetti_image_view);
            new C61792rg().A07(getRecyclerView());
            E0L.A00(getRecyclerView(), this, 4);
            Dz7 A0E = A0E();
            C14360o3.A0C(A0E, "null cannot be cast to non-null type com.instagram.direct.fragment.cardgallery.model.DirectChallengeWinnerViewModel");
            AbstractC31174DnI.A1E(getViewLifecycleOwner(), ((C32714Eaf) A0E).A01, new GWH(this, 8), 10);
            return;
        }
        C14360o3.A0F("emptyStateViewHolder");
        throw C00O.createAndThrow();
    }

    public static final void A02(C32703EaU c32703EaU, String str, boolean z, boolean z2) {
        Integer num;
        String str2;
        String str3;
        InterfaceC09390do interfaceC09390do = c32703EaU.A0S;
        C81663kb B3U = AbstractC28761aE.A00(AbstractC166987dD.A0r(interfaceC09390do)).B3U(c32703EaU.A0G());
        C36298Fzs A0e = AbstractC31172DnG.A0e(c32703EaU.A06);
        String str4 = c32703EaU.A0G().A00;
        String str5 = c32703EaU.A0G().A01;
        C81543kP c81543kP = null;
        if (B3U != null) {
            num = Integer.valueOf(B3U.AdZ());
        } else {
            num = null;
        }
        String str6 = AbstractC166987dD.A0r(interfaceC09390do).userId;
        int i = ((EOJ) c32703EaU).A01;
        if (B3U != null) {
            c81543kP = B3U.A01.A0t;
        }
        String A00 = C160857It.A00(c81543kP, str6, i);
        if (z2) {
            str2 = "share_winning_submission";
        } else {
            str2 = "share_winners";
        }
        if (z) {
            str3 = "share_airplane_button";
        } else {
            str3 = "share_winners_button";
        }
        C36298Fzs.A03(null, A0e, num, str4, str5, AbstractC111324zv.A00(793), "tap", str3, "challenge_winners_chosen_sheet", C36298Fzs.A02(str, A00, "winners_chosen", str2));
    }

    @Override // X.EOJ, X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        String str;
        Context requireContext = requireContext();
        InterfaceC09390do interfaceC09390do = this.A0S;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        FragmentActivity requireActivity = requireActivity();
        UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
        DirectThreadKey A0G = A0G();
        Dz7 A0E = A0E();
        C31680Dvl c31680Dvl = new C31680Dvl(this, 3);
        C36401G4c c36401G4c = new C36401G4c(this, 0);
        C49093LnJ c49093LnJ = new C49093LnJ(this);
        G4L g4l = G4L.A00;
        Bundle bundle = this.mArguments;
        if (bundle != null) {
            str = bundle.getString("surface");
        } else {
            str = null;
        }
        return AbstractC166987dD.A1J(new C32607EXh(requireContext, this, A0r, this.A08, new C34646FOd(requireActivity, A0r2, this, A0E, g4l, c36401G4c, c49093LnJ, A0G, str, c31680Dvl)));
    }

    public static final String A01(C32703EaU c32703EaU) {
        Dz7 A0E = c32703EaU.A0E();
        C14360o3.A0C(A0E, "null cannot be cast to non-null type com.instagram.direct.fragment.cardgallery.model.DirectChallengeWinnerViewModel");
        AbstractC33532Es6 abstractC33532Es6 = (AbstractC33532Es6) ((C32714Eaf) A0E).A01.A02();
        if (abstractC33532Es6 instanceof C32718Eaj) {
            return ((C32718Eaj) abstractC33532Es6).A06;
        }
        return null;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_challenge_winner";
    }

    @Override // X.EOJ, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        FKN fkn;
        int A02 = C0f9.A02(29025825);
        super.onCreate(bundle);
        AbstractC25651Mw.A00(AbstractC166987dD.A0r(this.A0S)).A01(this.A07, C36077FwD.class);
        if (!AbstractC31172DnG.A1X(requireArguments(), "channel_is_member")) {
            fkn = new FKN(AbstractC25227BEk.A0v(this, 2131954935), C37051GUh.A00(this, 21), true);
        } else {
            fkn = null;
        }
        super.A03 = fkn;
        C0f9.A09(-57571921, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1592006365);
        super.onDestroy();
        AbstractC25651Mw.A00(AbstractC166987dD.A0r(this.A0S)).A02(this.A07, C36077FwD.class);
        C0f9.A09(-170456941, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1801108031);
        super.onDestroyView();
        ((C148086le) this.A05.getValue()).A00();
        this.A02 = null;
        this.A01 = null;
        this.A04 = null;
        this.A03 = null;
        this.A00 = null;
        C0f9.A09(748121612, A02);
    }
}
