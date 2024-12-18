package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.BtO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26862BtO extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "AchievementsListFragment";
    public NestedScrollView A00;
    public RecyclerView A01;
    public C26118Bh2 A02;
    public InterfaceC30941Div A03;
    public CQR A04;
    public SpinnerImageView A05;
    public String A06;
    public String A07;
    public List A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;

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
        return "achievements_list_fragment";
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

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C57312k6 A0S = AbstractC25235BEs.A0S(this);
        PZZ pzz = new PZZ(this, view, null, 46);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, pzz, A0S);
        AbstractC23641Du.A05(anonymousClass191, D4z.A02(this, null, 8), AbstractC25235BEs.A0S(this));
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0A);
    }

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        NestedScrollView nestedScrollView = this.A00;
        if (nestedScrollView == null || !nestedScrollView.canScrollVertically(-1)) {
            return true;
        }
        return false;
    }

    public C26862BtO() {
        C50161MDo c50161MDo = new C50161MDo(this, 47);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C50161MDo(new C50161MDo(this, 48), 49));
        this.A09 = AbstractC25225BEi.A0a(C29911DGz.A01(A00, 0), c50161MDo, new C29894DGi(3, A00, null), AbstractC25225BEi.A1D(C25880Bcg.class));
        this.A0A = AbstractC60492pY.A02(this);
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
        String str;
        ArrayList<String> arrayList;
        int A02 = C0f9.A02(-1421598702);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        String str2 = null;
        if (bundle2 != null) {
            str = bundle2.getString("mediaId");
        } else {
            str = null;
        }
        this.A07 = str;
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            arrayList = bundle3.getStringArrayList("achievementIds");
        } else {
            arrayList = null;
        }
        this.A08 = arrayList;
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            str2 = bundle4.getString("entryPoint");
        }
        this.A06 = str2;
        List list = this.A08;
        if (list != null) {
            C25880Bcg c25880Bcg = (C25880Bcg) this.A09.getValue();
            C26118Bh2 c26118Bh2 = this.A02;
            String str3 = this.A07;
            if (c26118Bh2 != null) {
                c25880Bcg.A00(c26118Bh2);
                D53.A03(c26118Bh2, c25880Bcg, AbstractC141776au.A00(c25880Bcg), 5);
            } else {
                C141796aw A00 = AbstractC141776au.A00(c25880Bcg);
                MC9 mc9 = new MC9(c25880Bcg, list, str3, (InterfaceC23621Ds) null, 30);
                AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
                AbstractC23641Du.A05(anonymousClass191, D4z.A02(c25880Bcg, null, 20), AbstractC25235BEs.A0W(c25880Bcg, anonymousClass191, D4z.A02(c25880Bcg, null, 19), AbstractC25235BEs.A0W(c25880Bcg, anonymousClass191, mc9, A00)));
            }
        }
        C0f9.A09(831885155, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1617327435);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_achievements_list, viewGroup, false);
        this.A00 = (NestedScrollView) inflate.requireViewById(R.id.achievements_scrollview);
        this.A05 = (SpinnerImageView) inflate.requireViewById(R.id.achievements_loading_indicator);
        C0f9.A09(-1907931398, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1392614936);
        super.onDestroyView();
        this.A00 = null;
        this.A05 = null;
        this.A01 = null;
        C0f9.A09(197372988, A02);
    }
}
