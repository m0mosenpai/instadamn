package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import java.util.Map;

/* renamed from: X.EMq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32344EMq extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "DirectSuggestedRecipientsFragment";
    public C32324ELs A00;
    public Map A01;
    public Context A02;
    public RecyclerView A03;
    public FOV A04;
    public IgdsInlineSearchBox A05;
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
        return __redex_internal_original_name;
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
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        this.A02 = requireContext;
        UserSession A0r = AbstractC166987dD.A0r(this.A06);
        RecyclerView recyclerView = this.A03;
        if (recyclerView == null) {
            str = "recyclerView";
        } else {
            C61972ry A0K = AbstractC31180DnO.A0K(requireContext(), this);
            IgdsInlineSearchBox igdsInlineSearchBox = this.A05;
            if (igdsInlineSearchBox == null) {
                str = "inlineSearchBox";
            } else {
                C32324ELs c32324ELs = this.A00;
                if (c32324ELs == null) {
                    str = "recipientSelectedListener";
                } else {
                    Map map = this.A01;
                    if (map == null) {
                        str = "selectedTargetsIds";
                    } else {
                        this.A04 = new FOV(requireContext, recyclerView, this, A0K, A0r, c32324ELs, igdsInlineSearchBox, map);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
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
        int A02 = C0f9.A02(652605707);
        super.onCreate(bundle);
        C0f9.A09(-1319991851, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1069823937);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.fragment_direct_suggested_recipients_list, false);
        this.A03 = AbstractC31172DnG.A0G(A0R, R.id.suggested_recipients_list);
        IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) A0R.requireViewById(R.id.suggested_recipients_inline_search_bar);
        this.A05 = igdsInlineSearchBox;
        if (igdsInlineSearchBox == null) {
            C14360o3.A0F("inlineSearchBox");
            throw C00O.createAndThrow();
        }
        igdsInlineSearchBox.setImeOptions(6);
        C0f9.A09(1787702950, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1614311635);
        super.onDestroyView();
        C0f9.A09(-1581431376, A02);
    }
}
