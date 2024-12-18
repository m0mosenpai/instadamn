package X;

import com.instagram.api.schemas.FanClubCategoryType;
import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.common.session.UserSession;
import com.instagram.fanclub.memberlist.repository.FanClubMemberListCategoryRepository;

/* renamed from: X.EeM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32941EeM extends AbstractC31827Dyl {
    public final UserSession A00;
    public final FanClubMemberListCategoryRepository A01;
    public final C05A A02;
    public final C0UO A03;
    public final C0UO A04;
    public final boolean A05;
    public final C12N A06;

    public C32941EeM(C12N c12n, UserSession userSession, FanClubMemberListCategoryRepository fanClubMemberListCategoryRepository) {
        boolean z;
        AbstractC167007dF.A1E(fanClubMemberListCategoryRepository, 1, c12n);
        this.A01 = fanClubMemberListCategoryRepository;
        this.A00 = userSession;
        this.A06 = c12n;
        AbstractC18560vj.A03(AbstractC141776au.A00(this), AnonymousClass111.A01(new MC2(this, null, 18), fanClubMemberListCategoryRepository.A02));
        FanClubInfoDict A0M = AbstractC31172DnG.A0M(AbstractC166997dE.A0Y(userSession));
        if (A0M != null) {
            z = AbstractC166997dE.A1Z(A0M.BBZ(), true);
        } else {
            z = false;
        }
        this.A05 = z;
        C15180pY A02 = C10Q.A02(new C57189PaU(this, null, 0), fanClubMemberListCategoryRepository.A03, fanClubMemberListCategoryRepository.A04, fanClubMemberListCategoryRepository.A05, super.A00, super.A01);
        this.A04 = AbstractC208910l.A01(new C45114Jxj(), AbstractC141776au.A00(this), A02, C10I.A01);
        C008002u A00 = C10E.A00(C49375Ls8.A00);
        this.A02 = A00;
        this.A03 = A00;
    }

    public final void A04(FanClubCategoryType fanClubCategoryType, boolean z, boolean z2) {
        AbstractC23641Du.A05(((C12M) this.A06).A04, new PZ6(this, fanClubCategoryType, null, 2, z, z2), AbstractC141776au.A00(this));
    }
}
