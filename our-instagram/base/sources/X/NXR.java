package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.video.live.mvvm.viewmodel.bottomsheet.IgLiveBottomsheetManagerViewModel$observeViewerLiveState$1;
import java.util.List;

/* loaded from: classes9.dex */
public final class NXR extends AbstractC86353t7 implements InterfaceC37160GYx, InterfaceC58307Psz {
    public AnonymousClass195 A00;
    public final AbstractC59962oe A01;
    public final UserSession A02;
    public final EnumC142806cg A03;
    public final InterfaceC71994XEi A04;
    public final C147896lL A05;
    public final InterfaceC09390do A06;

    @Override // X.InterfaceC58307Psz
    public final /* synthetic */ void DB7() {
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC37160GYx
    public final void onShareOneTap(DirectShareTarget directShareTarget) {
    }

    public final void A00() {
        InterfaceC19390xP A02;
        InterfaceC19390xP A0y;
        InterfaceC09390do interfaceC09390do = this.A06;
        this.A00 = AbstractC18560vj.A03(AbstractC25235BEs.A0S(this.A01), C57167PZl.A02(this, ((C50980Mfn) interfaceC09390do.getValue()).A0D, 8));
        C50980Mfn c50980Mfn = (C50980Mfn) interfaceC09390do.getValue();
        AnonymousClass195 anonymousClass195 = c50980Mfn.A01;
        AnonymousClass195 anonymousClass1952 = null;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        int ordinal = c50980Mfn.A03.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                C0UO c0uo = c50980Mfn.A0A.A0g;
                O97 o97 = c50980Mfn.A06;
                if (o97 != null) {
                    A0y = o97.A01;
                } else {
                    A0y = MSZ.A0y();
                }
                A02 = C10Q.A03(new IgLiveBottomsheetManagerViewModel$observeViewerLiveState$1(c50980Mfn, null), c0uo, A0y);
            }
            c50980Mfn.A01 = anonymousClass1952;
        }
        A02 = C57167PZl.A02(c50980Mfn, c50980Mfn.A0A.A0W, 38);
        anonymousClass1952 = MSY.A0q(c50980Mfn, A02);
        c50980Mfn.A01 = anonymousClass1952;
    }

    @Override // X.AbstractC86353t7, X.InterfaceC86363t8
    public final void DB6() {
        C50980Mfn c50980Mfn = (C50980Mfn) this.A06.getValue();
        AbstractC166997dE.A1Y(c50980Mfn.A0A.A0C, false);
        c50980Mfn.A00 = 0.0f;
    }

    @Override // X.AbstractC86353t7, X.InterfaceC86363t8
    public final void DZk(int i, int i2) {
        ((C50980Mfn) this.A06.getValue()).A00(i);
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    @Override // X.C51D
    public final void onBottomSheetClosed() {
        C50980Mfn c50980Mfn = (C50980Mfn) this.A06.getValue();
        AbstractC166997dE.A1Y(c50980Mfn.A0A.A0C, false);
        c50980Mfn.A00 = 0.0f;
    }

    @Override // X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
        ((C50980Mfn) this.A06.getValue()).A00(i);
    }

    @Override // X.InterfaceC37160GYx
    public final void onShareTap(List list) {
        C50980Mfn c50980Mfn = (C50980Mfn) this.A06.getValue();
        if (c50980Mfn.A0G) {
            PZE.A02(c50980Mfn, AbstractC141776au.A00(c50980Mfn), 36);
        }
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public NXR(AbstractC59962oe abstractC59962oe, UserSession userSession, EnumC142806cg enumC142806cg, InterfaceC71994XEi interfaceC71994XEi, C147896lL c147896lL) {
        AbstractC43594JPz.A1P(userSession, c147896lL);
        this.A01 = abstractC59962oe;
        this.A02 = userSession;
        this.A03 = enumC142806cg;
        this.A05 = c147896lL;
        this.A04 = interfaceC71994XEi;
        C57541PgF A01 = C57541PgF.A01(this, 25);
        InterfaceC09390do A00 = C57541PgF.A00(C57541PgF.A01(abstractC59962oe, 22), EnumC09460dv.A02, 23);
        this.A06 = AbstractC25225BEi.A0a(C57541PgF.A01(A00, 24), A01, C57532Pg6.A00(null, A00, 13), AbstractC25225BEi.A1D(C50980Mfn.class));
        if (enumC142806cg != EnumC142806cg.A05) {
            A00();
        }
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }
}
