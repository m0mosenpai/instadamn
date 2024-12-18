package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* renamed from: X.MmS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC51367MmS extends C3OO {
    public C54841OMk A00;
    public boolean A01;
    public final Rect A02;
    public final ViewTreeObserver.OnPreDrawListener A03;
    public final ConstraintLayout A04;
    public final NestedScrollView A05;
    public final UserSession A06;
    public final IgTextView A07;
    public final C57112jm A08;
    public final IgdsBottomButtonLayout A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC51367MmS(View view, UserSession userSession) {
        super(view);
        C14360o3.A0B(view, 2);
        this.A06 = userSession;
        this.A09 = (IgdsBottomButtonLayout) view.findViewById(R.id.bottom_button_layout);
        this.A07 = AbstractC31172DnG.A0Y(view, R.id.privacy_policy_text_view);
        this.A04 = (ConstraintLayout) view.findViewById(R.id.inline_context_card);
        this.A05 = (NestedScrollView) view.findViewById(R.id.scroll_view);
        this.A02 = AbstractC166987dD.A0U();
        C57112jm A0N = AbstractC31180DnO.A0N();
        this.A08 = A0N;
        this.A03 = new ViewTreeObserverOnPreDrawListenerC55503Okw(this, 8);
        A0N.A08(view, new ViewOnAttachStateChangeListenerC56972jY(view), new InterfaceC57142jp[0]);
    }

    public static final void A00(View view) {
        Object systemService = AbstractC31173DnH.A06(view, 0).getSystemService("input_method");
        C14360o3.A0C(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        if (inputMethodManager.isActive()) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void A02() {
        ViewTreeObserver viewTreeObserver;
        IgTextView igTextView = this.A07;
        if (igTextView != null && (viewTreeObserver = igTextView.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(this.A03);
        }
    }
}
