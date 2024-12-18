package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.io.Serializable;
import java.util.Collection;

/* loaded from: classes9.dex */
public final class N7x extends AbstractC43842Ja5 implements C51E, C51D, InterfaceC71994XEi, GZU {
    public static final String __redex_internal_original_name = "IgLiveIgdsHeaderFragment";
    public EnumC142806cg A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;

    public static C50989Mfw A00(N7x n7x, Object obj) {
        C14360o3.A0B(obj, 0);
        return (C50989Mfw) n7x.A03.getValue();
    }

    @Override // X.InterfaceC71994XEi
    public final void DN5(User user, Integer num) {
        AbstractC167017dG.A1N(user, num);
        C50989Mfw c50989Mfw = (C50989Mfw) this.A03.getValue();
        if (c50989Mfw instanceof C52897Nas) {
            AbstractC166987dD.A1Z(new C57168PZm(user, num, c50989Mfw, (InterfaceC23621Ds) null, 17), AbstractC141776au.A00(c50989Mfw));
        }
    }

    @Override // X.InterfaceC71994XEi
    public final void DTp(GZU gzu, User user) {
        C14360o3.A0B(user, 0);
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A03);
        PZY.A02(user, A0Z, AbstractC141776au.A00(A0Z), 18);
    }

    @Override // X.GZU
    public final void Ddb(User user, boolean z) {
    }

    @Override // X.InterfaceC71994XEi
    public final void E1r(C1P1 c1p1, AbstractC53633Nne abstractC53633Nne, User user, Integer num) {
        C50989Mfw A00 = A00(this, user);
        if (A00 instanceof C52898Nat) {
            AbstractC166987dD.A1Z(new C57170PZo(abstractC53633Nne, A00, user, (InterfaceC23621Ds) null, 16), AbstractC141776au.A00(A00));
        }
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51E
    public final boolean doNotDismissOnDraggingDown() {
        return false;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "live_cobroadcast";
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(C57755Pji.A02(this, 6));
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC13880nE.A0O(view);
        C14240no c14240no = new C14240no(getParentFragmentManager());
        c14240no.A09((Fragment) this.A01.getValue(), R.id.nested_fragment_container);
        c14240no.A00();
        InterfaceC09390do interfaceC09390do = this.A03;
        AbstractC37301Gc2.A0w(getViewLifecycleOwner(), ((C50989Mfw) interfaceC09390do.getValue()).A00, C57755Pji.A02(this, 7), 23);
        JQ0.A11(this, new PZN(view, this, null, 9), ((C50989Mfw) interfaceC09390do.getValue()).A0A);
        ((C50989Mfw) interfaceC09390do.getValue()).A00();
    }

    @Override // X.InterfaceC71994XEi
    public final void DOl() {
        C50989Mfw c50989Mfw = (C50989Mfw) this.A03.getValue();
        if (c50989Mfw instanceof C52896Nar) {
            C57164PZi.A03(c50989Mfw, AbstractC141776au.A00(c50989Mfw), 11);
        }
    }

    @Override // X.GZU
    public final void Dda() {
        ((C50989Mfw) this.A03.getValue()).A00();
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
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

    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        C52350NEo c52350NEo = new C52350NEo(C57729PjI.A00);
        NEM nem = new NEM(new C57540PgE(this, 16));
        UserSession A0r = AbstractC166987dD.A0r(this.A02);
        EnumC142806cg enumC142806cg = this.A00;
        if (enumC142806cg == null) {
            C14360o3.A0F("viewMode");
            throw C00O.createAndThrow();
        }
        return AbstractC16960so.A1Q(c52350NEo, nem, new V5U(this, A0r, this, enumC142806cg, this, C57755Pji.A02(this, 5)));
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.C51E
    public final int getExtraDragSpace() {
        return 0;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
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

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        return ((C52823NZg) this.A01.getValue()).isScrolledToTop();
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public N7x() {
        C57540PgE c57540PgE = new C57540PgE(this, 20);
        InterfaceC09390do A01 = C57540PgE.A01(new C57540PgE(this, 17), EnumC09460dv.A02, 18);
        this.A03 = AbstractC25225BEi.A0a(new C57540PgE(A01, 19), c57540PgE, C57532Pg6.A00(null, A01, 40), AbstractC25225BEi.A1D(C50989Mfw.class));
        this.A01 = AbstractC09440dt.A01(new C57540PgE(this, 15));
        this.A02 = AbstractC60492pY.A02(this);
    }

    @Override // X.InterfaceC71994XEi
    public final void CuK(User user) {
        C50989Mfw A00 = A00(this, user);
        if (A00 instanceof C52897Nas) {
            PZY.A02(user, A00, AbstractC141776au.A00(A00), 14);
        }
    }

    @Override // X.InterfaceC71994XEi
    public final void CvT(User user, String str) {
        AbstractC167017dG.A1N(user, str);
        C50989Mfw c50989Mfw = (C50989Mfw) this.A03.getValue();
        if (c50989Mfw instanceof C52897Nas) {
            C57164PZi.A03(c50989Mfw, AbstractC141776au.A00(c50989Mfw), 12);
        }
    }

    @Override // X.InterfaceC71994XEi
    public final void D1s(User user) {
        C50989Mfw A00 = A00(this, user);
        if (A00 instanceof C52897Nas) {
            PZY.A02(user, A00, AbstractC141776au.A00(A00), 15);
        }
    }

    @Override // X.InterfaceC71994XEi
    public final void DHz(String str) {
        C147776l2 c147776l2;
        C50989Mfw A00 = A00(this, str);
        if ((A00 instanceof C52898Nat) && (c147776l2 = ((C52898Nat) A00).A03) != null) {
            c147776l2.A00("header", str, null);
        }
    }

    @Override // X.InterfaceC71994XEi
    public final void Df6(User user) {
        C50989Mfw A00 = A00(this, user);
        if (A00 instanceof C52897Nas) {
            PZY.A02(user, A00, AbstractC141776au.A00(A00), 16);
        }
    }

    @Override // X.InterfaceC71994XEi
    public final void Dxl(String str) {
        A00(this, str).A01(str);
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final boolean isScrolledToBottom() {
        return !getRecyclerView().canScrollVertically(1);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1083710642);
        super.onCreate(bundle);
        Serializable serializable = requireArguments().getSerializable("live_view_mode");
        C14360o3.A0C(serializable, "null cannot be cast to non-null type com.instagram.video.live.mvvm.model.enums.IgLiveViewMode");
        this.A00 = (EnumC142806cg) serializable;
        setModuleNameV2("live_cobroadcast");
        C0f9.A09(1017244914, A02);
    }
}
