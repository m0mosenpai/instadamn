package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import com.instagram.wonderwall.api.WallApiGraphQLImpl;
import com.instagram.wonderwall.model.WallInfo;
import com.instagram.wonderwall.model.WallLaunchConfig;
import com.instagram.wonderwall.model.WallMenuConfig;
import com.instagram.wonderwall.model.WallPostItem;
import com.instagram.wonderwall.model.WallText;
import com.instagram.wonderwall.repository.WallFeedRepository;
import com.instagram.wonderwall.repository.WallPendingPostManager;
import com.instagram.wonderwall.repository.WallPostRepository;

/* renamed from: X.Bcj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25883Bcj extends AbstractC52922bZ implements InterfaceC31065Dl7, InterfaceC31058Dl0 {
    public final UserSession A00;
    public final WallLaunchConfig A01;
    public final WallFeedRepository A02;
    public final WallPendingPostManager A03;
    public final WallPostRepository A04;
    public final InterfaceC24731Iq A05;
    public final InterfaceC19390xP A06;
    public final C05A A07;
    public final C05A A08;
    public final C0UO A09;

    public C25883Bcj(UserSession userSession, WallLaunchConfig wallLaunchConfig, WallFeedRepository wallFeedRepository, WallPendingPostManager wallPendingPostManager) {
        C14360o3.A0B(wallPendingPostManager, 4);
        this.A00 = userSession;
        this.A01 = wallLaunchConfig;
        this.A02 = wallFeedRepository;
        this.A03 = wallPendingPostManager;
        this.A08 = C10E.A00(C16930sl.A00);
        C008002u A1H = AbstractC25225BEi.A1H(new C26059Bfm());
        this.A07 = A1H;
        this.A09 = A1H;
        C24721Ip A12 = AbstractC25229BEm.A12();
        this.A05 = A12;
        this.A06 = AbstractC07080Za.A03(A12);
        this.A04 = new WallPostRepository(new WallApiGraphQLImpl(userSession), CZ2.A00(userSession), new C29420Cxv(this));
        C141796aw A00 = AbstractC141776au.A00(this);
        PYu pYu = new PYu(this, null, 34);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, new PYu(this, null, 32), AbstractC25235BEs.A0W(this, anonymousClass191, pYu, A00));
        WallFeedRepository wallFeedRepository2 = this.A02;
        AbstractC25232BEp.A1J(this, new C57154PYy(this, null, 28), C10Q.A01(new D5R(this, 3), wallFeedRepository2.A0B, wallFeedRepository2.A0C, wallFeedRepository2.A0A, this.A08));
    }

    @Override // X.InterfaceC31058Dl0
    public final void AE6(User user) {
        C14360o3.A0B(user, 0);
        A00(new C56817PJn(user, C30179DRk.A01(this, 27)), this);
    }

    @Override // X.InterfaceC31065Dl7
    public final void E1Y(WallPostItem wallPostItem) {
        C14360o3.A0B(wallPostItem, 0);
        if (wallPostItem.Bez().A01()) {
            E1Z(wallPostItem);
        } else {
            A00(new C56819PJp(wallPostItem, false), this);
        }
    }

    @Override // X.InterfaceC31065Dl7
    public final void E1Z(WallPostItem wallPostItem) {
        C14360o3.A0B(wallPostItem, 0);
        WallInfo wallInfo = (WallInfo) ((C26059Bfm) this.A09.getValue()).A03;
        if (wallInfo != null) {
            WallMenuConfig A00 = AbstractC27714CKh.A00(wallInfo, wallPostItem.Bez(), wallPostItem, this.A04, this, AbstractC141776au.A00(this));
            if (A00 != null) {
                A00(new Cy8(A00), this);
            }
        }
    }

    @Override // X.InterfaceC31065Dl7
    public final void E1c(C51740MtP c51740MtP, WallPostItem wallPostItem) {
        C14360o3.A0B(wallPostItem, 0);
        AbstractC166987dD.A1Z(new C57168PZm(wallPostItem, c51740MtP, this, (InterfaceC23621Ds) null, 40), AbstractC141776au.A00(this));
    }

    @Override // X.InterfaceC31065Dl7
    public final void E1d(WallPostItem wallPostItem) {
        C14360o3.A0B(wallPostItem, 0);
        A00(new C56819PJp(wallPostItem, true), this);
    }

    @Override // X.InterfaceC31058Dl0
    public final void EI2(WallPostItem wallPostItem) {
        C14360o3.A0B(wallPostItem, 0);
        A00(new C29434CyA(wallPostItem, new C57751Pje(37, wallPostItem, this)), this);
    }

    public static boolean A01(C26059Bfm c26059Bfm, C27915CSa c27915CSa, Object obj, C05A c05a) {
        C5Hc c5Hc = (C5Hc) c26059Bfm.A02;
        WallInfo wallInfo = (WallInfo) c26059Bfm.A03;
        boolean z = c26059Bfm.A09;
        boolean z2 = c26059Bfm.A06;
        boolean z3 = c26059Bfm.A07;
        boolean z4 = c26059Bfm.A08;
        boolean z5 = c26059Bfm.A04;
        boolean z6 = c26059Bfm.A05;
        C14360o3.A0B(c5Hc, 0);
        return c05a.AIi(obj, new C26059Bfm(c27915CSa, wallInfo, c5Hc, z, z2, z3, z4, z5, z6));
    }

    @Override // X.InterfaceC31058Dl0
    public final void CMV() {
        Object value;
        C05A c05a = this.A07;
        do {
            value = c05a.getValue();
        } while (!A01((C26059Bfm) value, null, value, c05a));
    }

    @Override // X.InterfaceC31065Dl7
    public final void Dxx(String str) {
        A00(new C29432Cy7(str), this);
    }

    @Override // X.InterfaceC31065Dl7
    public final void E1b(String str) {
        A00(new C29431Cy6(str), this);
    }

    @Override // X.InterfaceC31058Dl0
    public final void Ekl(C27915CSa c27915CSa) {
        Object value;
        C05A c05a = this.A07;
        do {
            value = c05a.getValue();
        } while (!A01((C26059Bfm) value, c27915CSa, value, c05a));
    }

    @Override // X.InterfaceC31058Dl0
    public final void Eln(WallText wallText) {
        A00(new C29433Cy9(wallText), this);
    }

    public static final void A00(InterfaceC30836DhB interfaceC30836DhB, C25883Bcj c25883Bcj) {
        AbstractC166987dD.A1Z(new C57157PZb(interfaceC30836DhB, c25883Bcj, (InterfaceC23621Ds) null, 34), AbstractC141776au.A00(c25883Bcj));
    }
}
