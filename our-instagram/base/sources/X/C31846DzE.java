package X;

import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.common.session.UserSession;
import com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.DzE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31846DzE extends AbstractC52922bZ implements InterfaceC62602sz {
    public static final Integer A09 = C05F.A05;
    public boolean A00;
    public final UserSession A01;
    public final C99694dm A02;
    public final SubscribedAndRecommendedCreatorListRepository A03;
    public final C143436di A04;
    public final C05A A05;
    public final C0UO A06;
    public final C0UO A07;
    public final boolean A08;

    public static final C32087E8l A00(C31846DzE c31846DzE, User user, boolean z) {
        EnumC99704do enumC99704do;
        UserSession userSession = c31846DzE.A01;
        C1OU c1ou = C1OU.$redex_init_class;
        C14360o3.A0B(userSession, 0);
        Reel A02 = C75653aW.A02(userSession, user);
        C5QE A00 = C72Y.A00(userSession, user);
        if (user.A02 == C17Q.A06) {
            enumC99704do = EnumC99704do.A06;
        } else {
            enumC99704do = EnumC99704do.A03;
        }
        return new C32087E8l(A00, enumC99704do, A02, user, z);
    }

    @Override // X.InterfaceC62602sz
    public final boolean CL7() {
        Collection collection;
        SubscribedAndRecommendedCreatorListRepository subscribedAndRecommendedCreatorListRepository = this.A03;
        Collection collection2 = (Collection) subscribedAndRecommendedCreatorListRepository.A0F.getValue();
        if ((collection2 == null || collection2.isEmpty()) && (((collection = (Collection) subscribedAndRecommendedCreatorListRepository.A0E.getValue()) == null || collection.isEmpty()) && !(!((Collection) subscribedAndRecommendedCreatorListRepository.A0G.getValue()).isEmpty()))) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC62602sz
    public final boolean CLJ() {
        SubscribedAndRecommendedCreatorListRepository subscribedAndRecommendedCreatorListRepository = this.A03;
        if (!subscribedAndRecommendedCreatorListRepository.A05 && !subscribedAndRecommendedCreatorListRepository.A04) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC62602sz
    public final boolean CUG() {
        return AbstractC166987dD.A1a(this.A03.A0H.getValue());
    }

    @Override // X.InterfaceC62602sz
    public final boolean CXf() {
        SubscribedAndRecommendedCreatorListRepository subscribedAndRecommendedCreatorListRepository = this.A03;
        if (!subscribedAndRecommendedCreatorListRepository.A05 && !subscribedAndRecommendedCreatorListRepository.A04) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC62602sz
    public final boolean isLoading() {
        SubscribedAndRecommendedCreatorListRepository subscribedAndRecommendedCreatorListRepository = this.A03;
        return AbstractC16960so.A1Q(subscribedAndRecommendedCreatorListRepository.A01, subscribedAndRecommendedCreatorListRepository.A00).contains(EnumC33349Eoi.A05);
    }

    public /* synthetic */ C31846DzE(UserSession userSession, SubscribedAndRecommendedCreatorListRepository subscribedAndRecommendedCreatorListRepository, boolean z) {
        C99694dm A00 = AbstractC99684dl.A00(userSession);
        C143436di A002 = AbstractC149676oK.A00(userSession);
        AbstractC167017dG.A1P(userSession, subscribedAndRecommendedCreatorListRepository);
        AbstractC167007dF.A1G(A00, 4, A002);
        this.A01 = userSession;
        this.A03 = subscribedAndRecommendedCreatorListRepository;
        this.A08 = z;
        this.A02 = A00;
        this.A04 = A002;
        C008002u A003 = C10E.A00(C32918Edz.A00);
        this.A05 = A003;
        this.A07 = A003;
        InterfaceC19390xP A01 = C0ST.A01(AnonymousClass111.A02(new MU8(this, (InterfaceC23621Ds) null, 22), C10Q.A03(new BG6(4, null), subscribedAndRecommendedCreatorListRepository.A0D, subscribedAndRecommendedCreatorListRepository.A0H)));
        AnonymousClass059 A012 = AbstractC208910l.A01(C16930sl.A00, AbstractC141776au.A00(this), A01, C10I.A01);
        this.A06 = A012;
        DRQ drq = new DRQ(this, 6);
        AbstractC166987dD.A1Z(new MC6(A012, drq, (InterfaceC23621Ds) null, 48), AbstractC141776au.A00(this));
    }

    public static final List A01(List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : list) {
            User user = (User) obj;
            FanClubInfoDict A0M = AbstractC31172DnG.A0M(user);
            if (A0M != null && A0M.getFanClubId() != null && user.A02 != C17Q.A05) {
                A1E.add(obj);
            }
        }
        return A1E;
    }

    @Override // X.InterfaceC62602sz
    public final void Chd() {
        AbstractC166987dD.A1Z(new MBp(this, null, 7), AbstractC141776au.A00(this));
    }
}
