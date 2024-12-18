package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.user.model.User;

/* renamed from: X.G7j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36485G7j implements InterfaceC37215GaQ {
    public final /* synthetic */ ENG A00;

    public C36485G7j(ENG eng) {
        this.A00 = eng;
    }

    @Override // X.InterfaceC37215GaQ
    public final void D3s(Hashtag hashtag, int i) {
        ENG eng = this.A00;
        eng.A03.A05(eng.A00, eng.A06, hashtag, "follow_chaining_suggestions_list");
        AbstractC25651Mw.A00(eng.A00).E4s(new C70033Cn(hashtag, false));
    }

    @Override // X.InterfaceC37215GaQ
    public final void D3t(User user, int i) {
        C0fA.A00(this.A00.A01, -950105942);
    }

    @Override // X.InterfaceC37215GaQ
    public final void D4d(Hashtag hashtag, int i) {
        ENG eng = this.A00;
        eng.A03.A06(eng.A00, eng.A06, hashtag, "follow_chaining_suggestions_list");
        AbstractC25651Mw.A00(eng.A00).E4s(new C70033Cn(hashtag, false));
    }

    @Override // X.InterfaceC37215GaQ
    public final void DAu(FOC foc, int i) {
        String A00;
        ENG eng = this.A00;
        C32414EPp c32414EPp = eng.A01;
        c32414EPp.A04.A00.remove(foc);
        C32414EPp.A00(c32414EPp);
        if (FVZ.A00(foc) == C05F.A00) {
            C31434Dre c31434Dre = eng.A02;
            Hashtag hashtag = foc.A00;
            hashtag.getClass();
            c31434Dre.A00(hashtag, "similar_entity_dismiss_tapped", i);
            return;
        }
        if (FVZ.A00(foc) == C05F.A01) {
            C31434Dre c31434Dre2 = eng.A02;
            User user = foc.A02;
            user.getClass();
            c31434Dre2.A01(user, "similar_entity_dismiss_tapped", i);
            return;
        }
        Integer A002 = FVZ.A00(foc);
        if (A002 == null) {
            A00 = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
        } else {
            A00 = F8P.A00(A002);
        }
        throw AbstractC167007dF.A0c("Unaccepted recommendation type for InterestRecommendation: ", A00);
    }

    @Override // X.InterfaceC37215GaQ
    public final void Dhf(Hashtag hashtag, int i) {
        ENG eng = this.A00;
        if (!(!C06P.A01(eng.mFragmentManager))) {
            C140966Yy A0r = AbstractC25225BEi.A0r(eng.requireActivity(), eng.A00);
            A0r.A0E(WE2.A02(eng.A00, hashtag, "see_all_suggested_hashtag_fragment", "DEFAULT"));
            A0r.A04();
            eng.A02.A00(hashtag, "similar_entity_tapped", i);
        }
    }

    @Override // X.InterfaceC37215GaQ
    public final void Dhg(User user, int i) {
        ENG eng = this.A00;
        if (!(!C06P.A01(eng.mFragmentManager))) {
            C140966Yy A0r = AbstractC25225BEi.A0r(eng.requireActivity(), eng.A00);
            C28431Ze A02 = AbstractC31364DqT.A02();
            UserSession userSession = eng.A00;
            A0r.A0E(A02.A02(userSession, AbstractC31402Dr6.A03(userSession, user.getId(), "hashtag_follow_chaining", "see_all_suggested_hashtag_fragment")));
            A0r.A0B = "account_recs";
            A0r.A04();
            eng.A02.A01(user, "similar_entity_tapped", i);
        }
    }
}
