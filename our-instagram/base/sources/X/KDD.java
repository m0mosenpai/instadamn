package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgProgressBar;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class KDD extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "ExistingThreadSheetFragment";
    public View A00;
    public RecyclerView A01;
    public C66362zD A02;
    public IgProgressBar A03;
    public String A04;
    public List A05;

    @Override // X.AbstractC59962oe
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public UserSession getSession() {
        return AbstractC166987dD.A0r(((C45983KWx) this).A03);
    }

    public KZH A02() {
        KZH kzh = ((C45983KWx) this).A00;
        if (kzh != null) {
            return kzh;
        }
        C14360o3.A0F("repository");
        throw C00O.createAndThrow();
    }

    public InterfaceC37172GZj A03() {
        return ((C45983KWx) this).A01;
    }

    public boolean A04() {
        return ((C45983KWx) this).A04;
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
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
        this.A00 = view;
        this.A03 = (IgProgressBar) view.requireViewById(R.id.progressbar_loading);
        JQ0.A11(this, new MC4(this, null, 0), A02().A01);
    }

    public boolean A05() {
        return false;
    }

    public boolean A06() {
        return false;
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
    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = this.A01;
        if (recyclerView != null && AbstractC43592JPx.A1X(recyclerView)) {
            return false;
        }
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public final ViewModelListUpdate A00() {
        ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
        List<C44Q> list = this.A05;
        if (list == null) {
            C14360o3.A0F("threads");
            throw C00O.createAndThrow();
        }
        for (C44Q c44q : list) {
            A0E.A00(new C36195Fy9(c44q, C14360o3.A0K(c44q.C7K(), this.A04)));
        }
        return A0E;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1763694486);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.existing_thread_sheet_fragment, false);
        C0f9.A09(-747744557, A02);
        return A0R;
    }
}
