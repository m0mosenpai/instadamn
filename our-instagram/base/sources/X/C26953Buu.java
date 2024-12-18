package X;

import android.content.Context;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.litho.LithoView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;

/* renamed from: X.Buu */
/* loaded from: classes5.dex */
public final class C26953Buu extends AbstractC25595BTi implements InterfaceC60092or {
    public static final String __redex_internal_original_name = "CommentListBottomsheetFragment";
    public final InterfaceC09390do A04 = C1XM.A00(DAZ.A00);
    public final InterfaceC09390do A00 = AbstractC25595BTi.A00(this, 16);
    public final InterfaceC09390do A01 = AbstractC25595BTi.A00(this, 18);
    public final InterfaceC09390do A02 = AbstractC25595BTi.A00(this, 23);
    public final InterfaceC09390do A03 = AbstractC25595BTi.A00(this, 24);
    public final InterfaceC09390do A05 = AbstractC25595BTi.A00(this, 25);

    @Override // X.AbstractC25595BTi, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        IgLinearLayout igLinearLayout = (IgLinearLayout) view;
        final IgFrameLayout igFrameLayout = (IgFrameLayout) AbstractC166987dD.A0c(igLinearLayout, R.id.list_view_container);
        LithoView lithoView = (LithoView) AbstractC166987dD.A0c(igLinearLayout, R.id.main_list_view);
        LithoView lithoView2 = (LithoView) AbstractC166987dD.A0c(igLinearLayout, R.id.above_composer_views);
        View A0c = AbstractC166987dD.A0c(igLinearLayout, R.id.comment_composer_parent);
        InterfaceC09390do interfaceC09390do = this.A00;
        ((C166567cS) interfaceC09390do.getValue()).A00(this, lithoView2);
        ((C166567cS) interfaceC09390do.getValue()).A00(this, lithoView);
        InterfaceC09390do interfaceC09390do2 = this.A09;
        InterfaceC60442pS A00 = C28185CbY.A00(interfaceC09390do2);
        InterfaceC09390do interfaceC09390do3 = this.A0A;
        C166587cU c166587cU = new C166587cU((C166047bW) A04().A0B.A03.getValue(), AbstractC166987dD.A0r(interfaceC09390do3), A00);
        c166587cU.A00(lithoView, C71163Hc.A00(this));
        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        C62882tR c62882tR = new C62882tR(requireActivity(), C28185CbY.A00(interfaceC09390do2), AbstractC166987dD.A0r(interfaceC09390do3), 23592978);
        registerLifecycleListener(c62882tR);
        C166607cW c166607cW = new C166607cW(new C2Y0(getThemedContext(), new GestureDetector.SimpleOnGestureListener() { // from class: X.7cV
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return C26953Buu.A02(view, this);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return C26953Buu.A02(view, this);
            }
        }));
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        C57312k6 A002 = C07Y.A00(viewLifecycleOwner);
        D4x d4x = new D4x(viewLifecycleOwner, c07s, this, c166587cU, igFrameLayout, lithoView, A0c, c62882tR, c166607cW, null, 0);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, d4x, A002);
        C25814BbV A04 = A04();
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do3);
        InterfaceC60442pS A003 = C28185CbY.A00(interfaceC09390do2);
        D89 d89 = new D89(this, 21);
        D89 d892 = new D89(this, 22);
        C26025BfE A03 = A03();
        C1M0 c1m0 = ((C28185CbY) interfaceC09390do2.getValue()).A01;
        AbstractC167017dG.A1P(A04, igFrameLayout);
        AbstractC167017dG.A1T(lithoView2, A0r);
        AbstractC25232BEp.A1P(A03, c1m0);
        final C166627cY A02 = C166617cX.A02(A0c, this, A03, A04, A0r, igLinearLayout, A003, c1m0, d89, d892);
        final Context context = A0c.getContext();
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: X.7ck
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                IgFrameLayout igFrameLayout2 = igFrameLayout;
                ComposerAutoCompleteTextView composerAutoCompleteTextView = A02.A0B;
                Context context2 = context;
                C14360o3.A0A(context2);
                int A004 = C3HB.A00(context2);
                if (igFrameLayout2.getMeasuredHeight() > 0) {
                    int measuredHeight = ((igFrameLayout2.getMeasuredHeight() - igFrameLayout2.getPaddingTop()) - igFrameLayout2.getPaddingBottom()) + A004;
                    if (measuredHeight < 0) {
                        measuredHeight = 0;
                    }
                    composerAutoCompleteTextView.setDropDownHeight(measuredHeight);
                }
            }
        };
        C07X viewLifecycleOwner2 = getViewLifecycleOwner();
        AbstractC23641Du.A05(anonymousClass191, new MCP(c07s, onLayoutChangeListener, viewLifecycleOwner2, igFrameLayout, null, 33), C07Y.A00(viewLifecycleOwner2));
        C50368MLv c50368MLv = new C50368MLv(A02, 31);
        lithoView2.setComponent(new C166737cl(A04, (InterfaceC166367c5) A04.A0U.getValue(), A0r, A003, c50368MLv, A03.A0f));
        lithoView2.setVisibility(0);
        C07X viewLifecycleOwner3 = getViewLifecycleOwner();
        AbstractC23641Du.A05(anonymousClass191, new JWL(viewLifecycleOwner3, c07s, A04, lithoView2, A0r, A003, c50368MLv, A03, null, 4), C07Y.A00(viewLifecycleOwner3));
        super.onViewCreated(view, bundle);
    }

    @Override // X.AbstractC59962oe
    public final Context getThemedContext() {
        return (Context) this.A05.getValue();
    }

    public static final boolean A02(View view, C26953Buu c26953Buu) {
        C167637eJ c167637eJ;
        C011504d A00 = AbstractC009003e.A00(view);
        if (A00 != null && A00.A00.A0I(8)) {
            Object value = c26953Buu.A04().A0U.getValue();
            if ((value instanceof C167637eJ) && (c167637eJ = (C167637eJ) value) != null && !c167637eJ.A0D && !c26953Buu.A03().A0e) {
                AbstractC13880nE.A0O(c26953Buu.mView);
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC60092or
    public final void EMT() {
        C05A c05a = A04().A0R;
        do {
        } while (!c05a.AIi(c05a.getValue(), new C167837ed(null, null, 1)));
    }

    @Override // X.AbstractC25595BTi, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1794081164);
        super.onCreate(bundle);
        if (A03().A0e) {
            setDayNightMode(EnumC60792q3.A03);
        }
        this.mLifecycleRegistry.A09((C166487cH) this.A04.getValue());
        C0f9.A09(556573345, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1914183886);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_comment_list, viewGroup, false);
        C0f9.A09(903267940, A02);
        return inflate;
    }
}
