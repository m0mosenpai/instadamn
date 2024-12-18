package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.facebook.R;
import com.google.android.material.tabs.TabLayout;
import com.instagram.common.session.UserSession;
import instagram.features.clips.viewer.recipesheet.RecipeSheetParams;
import java.util.List;

/* renamed from: X.BtV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26868BtV extends AbstractC59962oe implements C51D, InterfaceC021908q {
    public static final String __redex_internal_original_name = "RecipeSheetFragment";
    public int A00;
    public C38321qM A01;
    public C189478aR A02;
    public InterfaceC31049Dkn A03;
    public RecipeSheetParams A04;
    public final List A05 = AbstractC166987dD.A1E();
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
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
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "recipe_sheet_parent";
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
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.InterfaceC021908q
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.InterfaceC021908q
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        RecipeSheetParams recipeSheetParams = this.A04;
        if (recipeSheetParams != null) {
            bundle.putParcelable("arg_extra_params", recipeSheetParams);
        }
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    private final C26836Bsy A00() {
        UserSession A0r = AbstractC166987dD.A0r(this.A06);
        RecipeSheetParams recipeSheetParams = this.A04;
        if (recipeSheetParams == null) {
            C14360o3.A0F("params");
            throw C00O.createAndThrow();
        }
        int i = recipeSheetParams.A01;
        int i2 = 2;
        String str = recipeSheetParams.A04;
        long j = recipeSheetParams.A02;
        boolean z = recipeSheetParams.A08;
        boolean z2 = recipeSheetParams.A07;
        String str2 = recipeSheetParams.A06;
        String str3 = recipeSheetParams.A05;
        String str4 = recipeSheetParams.A03;
        int i3 = recipeSheetParams.A00;
        if (i == 2) {
            AbstractC167007dF.A1F(str, 0, str2);
        } else {
            i2 = 0;
            AbstractC167007dF.A1F(str, 0, str2);
        }
        RecipeSheetParams recipeSheetParams2 = new RecipeSheetParams(str, str2, str3, str4, i3, i2, j, z, z2);
        C14360o3.A0B(A0r, 0);
        C26836Bsy c26836Bsy = new C26836Bsy();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("IgSessionManager.SESSION_TOKEN_KEY", A0r.token);
        A0b.putParcelable("arg_extra_params", recipeSheetParams2);
        c26836Bsy.setArguments(A0b);
        c26836Bsy.A0C = this.A03;
        this.A05.add(AbstractC166987dD.A1L(AbstractC25227BEk.A0v(this, 2131971554), c26836Bsy));
        return c26836Bsy;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (r0.canScrollVertically(-1) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        if (r1 == false) goto L19;
     */
    @Override // X.C51D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isScrolledToTop() {
        /*
            r5 = this;
            java.util.List r2 = r5.A05
            boolean r0 = X.AbstractC166987dD.A1b(r2)
            if (r0 == 0) goto L3e
            int r1 = r5.A00
            if (r1 < 0) goto L3e
            int r0 = r2.size()
            if (r1 >= r0) goto L3e
            int r0 = r5.A00
            java.lang.Object r0 = r2.get(r0)
            X.0e4 r0 = (X.C09530e4) r0
            java.lang.Object r4 = r0.A01
            X.Bsy r4 = (X.C26836Bsy) r4
            if (r4 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView r0 = r4.A02
            r1 = -1
            r3 = 0
            if (r0 == 0) goto L2d
            boolean r0 = r0.canScrollVertically(r1)
            r2 = 0
            if (r0 != 0) goto L2e
        L2d:
            r2 = 1
        L2e:
            androidx.recyclerview.widget.RecyclerView r0 = r4.A03
            if (r0 == 0) goto L39
            boolean r1 = r0.canScrollVertically(r1)
            r0 = 0
            if (r1 != 0) goto L3a
        L39:
            r0 = 1
        L3a:
            if (r2 == 0) goto L3f
            if (r0 == 0) goto L3f
        L3e:
            r3 = 1
        L3f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26868BtV.isScrolledToTop():boolean");
    }

    @Override // X.InterfaceC021908q
    public final void onPageSelected(int i) {
        C3DN c3dn;
        this.A00 = i;
        C189478aR c189478aR = this.A02;
        if (c189478aR != null && (c3dn = c189478aR.A00) != null) {
            c3dn.A0W(true);
        }
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalStateException A14;
        int i;
        int A02 = C0f9.A02(-212869402);
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = requireArguments();
        }
        RecipeSheetParams recipeSheetParams = (RecipeSheetParams) bundle.getParcelable("arg_extra_params");
        if (recipeSheetParams != null) {
            this.A04 = recipeSheetParams;
            C1DX A00 = C1DW.A00(AbstractC166987dD.A0r(this.A06));
            RecipeSheetParams recipeSheetParams2 = this.A04;
            if (recipeSheetParams2 == null) {
                C14360o3.A0F("params");
                throw C00O.createAndThrow();
            }
            C38321qM A022 = A00.A02(recipeSheetParams2.A04);
            if (A022 != null) {
                this.A01 = A022;
                C0f9.A09(-2072887919, A02);
                return;
            } else {
                A14 = AbstractC166987dD.A14("Media required.");
                i = -1772111628;
            }
        } else {
            A14 = AbstractC166987dD.A14(AbstractC111324zv.A00(1713));
            i = 851143771;
        }
        C0f9.A09(i, A02);
        throw A14;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        View inflate;
        int A02 = C0f9.A02(888237105);
        C14360o3.A0B(layoutInflater, 0);
        List list = this.A05;
        list.clear();
        RecipeSheetParams recipeSheetParams = this.A04;
        if (recipeSheetParams != null) {
            if (recipeSheetParams.A01 != 2) {
                InterfaceC09390do interfaceC09390do = C28493Chl.A02;
                C38321qM c38321qM = this.A01;
                if (c38321qM == null) {
                    str = "media";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                if (AbstractC25226BEj.A1b(C28493Chl.A05(c38321qM))) {
                    inflate = layoutInflater.inflate(R.layout.recipe_sheet_parent_tabbed_fragment, viewGroup, false);
                    A00();
                    UserSession A0r = AbstractC166987dD.A0r(this.A06);
                    RecipeSheetParams recipeSheetParams2 = this.A04;
                    if (recipeSheetParams2 != null) {
                        String str2 = recipeSheetParams2.A04;
                        long j = recipeSheetParams2.A02;
                        boolean z = recipeSheetParams2.A08;
                        boolean z2 = recipeSheetParams2.A07;
                        String str3 = recipeSheetParams2.A06;
                        String str4 = recipeSheetParams2.A05;
                        String str5 = recipeSheetParams2.A03;
                        int i = recipeSheetParams2.A00;
                        AbstractC167007dF.A1F(str2, 0, str3);
                        RecipeSheetParams recipeSheetParams3 = new RecipeSheetParams(str2, str3, str4, str5, i, 1, j, z, z2);
                        C14360o3.A0B(A0r, 0);
                        C26836Bsy c26836Bsy = new C26836Bsy();
                        Bundle A0b = AbstractC166987dD.A0b();
                        A0b.putString("IgSessionManager.SESSION_TOKEN_KEY", A0r.token);
                        A0b.putParcelable("arg_extra_params", recipeSheetParams3);
                        c26836Bsy.setArguments(A0b);
                        c26836Bsy.A0C = this.A03;
                        list.add(AbstractC166987dD.A1L(AbstractC25227BEk.A0v(this, 2131971552), c26836Bsy));
                        AbstractC10360h2 childFragmentManager = getChildFragmentManager();
                        C14360o3.A07(childFragmentManager);
                        UF7 uf7 = new UF7(childFragmentManager, list);
                        ViewPager viewPager = (ViewPager) AbstractC166997dE.A0R(inflate, R.id.view_pager);
                        viewPager.setAdapter(uf7);
                        viewPager.A0J(this);
                        ((TabLayout) AbstractC166997dE.A0R(inflate, R.id.tabs)).setupWithViewPager(viewPager);
                        C0f9.A09(1973095521, A02);
                        return inflate;
                    }
                }
            }
            inflate = layoutInflater.inflate(R.layout.recipe_sheet_parent_tabless_fragment, viewGroup, false);
            C14240no c14240no = new C14240no(getChildFragmentManager());
            c14240no.A09(A00(), R.id.content_frame);
            c14240no.A00();
            C14360o3.A0A(inflate);
            C0f9.A09(1973095521, A02);
            return inflate;
        }
        str = "params";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-476422876);
        super.onDestroyView();
        this.A05.clear();
        C0f9.A09(795096015, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-2131912695);
        super.onPause();
        if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(this.A06), 36331261500867811L)) {
            C189478aR c189478aR = this.A02;
            if (c189478aR != null) {
                c189478aR.A07();
            }
            this.A05.clear();
        }
        C0f9.A09(-47383203, A02);
    }
}
