package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.ui.widget.typeahead.TypeaheadHeader;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.N7u, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52183N7u extends AbstractC43842Ja5 implements C51D, GZS {
    public static final String __redex_internal_original_name = "IgLiveRoomsInviteFragment";
    public InterfaceC71994XEi A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        return AbstractC16960so.A1Q(new C52350NEo(C57729PjI.A00), new V5U(this, AbstractC166987dD.A0r(this.A01), null, EnumC142806cg.A03, this.A00, C57730PjJ.A00));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
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
        ViewStub A07 = AbstractC31171DnF.A07(view, R.id.recycler_top_view_stub);
        A07.setLayoutResource(R.layout.top_search_bar);
        A07.inflate();
        TypeaheadHeader typeaheadHeader = (TypeaheadHeader) view.findViewById(R.id.search_typeahead_header);
        if (typeaheadHeader != null) {
            typeaheadHeader.A03(AbstractC25227BEk.A0v(this, 2131972993));
            typeaheadHeader.A01 = this;
        }
        InterfaceC09390do interfaceC09390do = this.A02;
        AbstractC37301Gc2.A0w(getViewLifecycleOwner(), ((C52882Nad) interfaceC09390do.getValue()).A00, C57755Pji.A02(this, 14), 28);
        ((C52882Nad) interfaceC09390do.getValue()).A07("");
    }

    @Override // X.GZS
    public final void registerTextViewLogging(TextView textView) {
    }

    @Override // X.GZS
    public final void searchTextChanged(String str) {
        C14360o3.A0B(str, 0);
        ((C52882Nad) this.A02.getValue()).A07(str);
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

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(C57755Pji.A02(this, 13));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
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
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public C52183N7u() {
        C57542PgG c57542PgG = new C57542PgG(this, 30);
        InterfaceC09390do A01 = C57542PgG.A01(new C57542PgG(this, 27), EnumC09460dv.A02, 28);
        this.A02 = AbstractC25225BEi.A0a(new C57542PgG(A01, 29), c57542PgG, C57530Pg4.A00(null, A01, 5), AbstractC25225BEi.A1D(C52882Nad.class));
        this.A01 = AbstractC60492pY.A02(this);
    }

    public static final List A00(List list, List list2, List list3, boolean z, boolean z2) {
        Integer num;
        String str;
        boolean z3;
        C70792Wh5 c70792Wh5;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            User user = (User) it.next();
            if (AbstractC31175DnJ.A1X(user, list3)) {
                num = C05F.A0C;
                str = null;
            } else if (AbstractC31175DnJ.A1X(user, list2)) {
                c70792Wh5 = new C70792Wh5(user, C05F.A01, null, false, false);
                A0q.add(c70792Wh5);
            } else {
                num = C05F.A15;
                str = null;
                if (!z || (user.A0L() != C05F.A00 && user.A0L() != C05F.A0N)) {
                    z3 = false;
                    c70792Wh5 = new C70792Wh5(user, num, str, z3, z2);
                    A0q.add(c70792Wh5);
                }
            }
            z3 = true;
            c70792Wh5 = new C70792Wh5(user, num, str, z3, z2);
            A0q.add(c70792Wh5);
        }
        return A0q;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView.getChildCount() != 0 && recyclerView.computeVerticalScrollOffset() != 0) {
            return false;
        }
        return true;
    }
}
