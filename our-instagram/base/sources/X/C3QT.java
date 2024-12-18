package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.expanding.ExpandingListView;
import java.util.HashMap;

/* renamed from: X.3QT, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3QT implements C3QU {
    public ViewGroup A00;
    public C9C3 A01;
    public C75113Zb A02;
    public TextView A03;
    public CircularImageView A04;
    public Integer A05;
    public final View A06;
    public final ViewStub A07;
    public final InterfaceC11380iw A08;
    public final UserSession A09;
    public final boolean A0A;

    public C3QT(View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession, boolean z) {
        C14360o3.A0B(view, 1);
        this.A06 = view;
        this.A09 = userSession;
        this.A0A = z;
        this.A08 = interfaceC11380iw;
        this.A07 = (ViewStub) view.findViewById(R.id.feed_inline_composer_button_stub);
    }

    @Override // X.C3QU
    public final void DFc() {
    }

    public final void A00() {
        CircularImageView circularImageView;
        ViewGroup viewGroup = (ViewGroup) this.A06.requireViewById(R.id.feed_inline_composer_button_container);
        this.A00 = viewGroup;
        if (viewGroup != null) {
            this.A04 = (CircularImageView) viewGroup.requireViewById(R.id.feed_inline_composer_button_avatar);
            this.A03 = (TextView) viewGroup.findViewById(R.id.feed_inline_composer_button_textview);
            CircularImageView circularImageView2 = this.A04;
            if (circularImageView2 != null) {
                circularImageView2.setUrl(C17060sy.A01.A01(this.A09).Bhu(), this.A08);
            }
            if (C3HM.A00.A04(this.A09) && (circularImageView = this.A04) != null) {
                ViewGroup.LayoutParams layoutParams = circularImageView.getLayoutParams();
                Resources resources = circularImageView.getResources();
                layoutParams.width = resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material);
                layoutParams.height = resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material);
                circularImageView.setLayoutParams(layoutParams);
            }
            if (this.A0A) {
                AbstractC56932jR.A04(viewGroup, 4);
            }
        }
    }

    @Override // X.C3QU
    public final void DFd() {
        ViewGroup viewGroup;
        C75113Zb c75113Zb = this.A02;
        if (c75113Zb != null && c75113Zb.A3D) {
            if (this.A00 == null) {
                ViewStub viewStub = this.A07;
                if (viewStub != null) {
                    viewStub.inflate();
                }
                A00();
            }
            C9C3 c9c3 = this.A01;
            if (c9c3 != null && (viewGroup = this.A00) != null) {
                C0fQ.A00(new ViewOnClickListenerC23213AQx(c9c3), viewGroup);
            }
            ViewGroup viewGroup2 = this.A00;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(0);
            }
            View view = this.A06;
            if (view.getParent() instanceof ExpandingListView) {
                ViewParent parent = view.getParent();
                C14360o3.A0C(parent, "null cannot be cast to non-null type com.instagram.ui.widget.expanding.ExpandingListView");
                ExpandingListView expandingListView = (ExpandingListView) parent;
                Integer num = this.A05;
                if (num == null) {
                    Context context = view.getContext();
                    C14360o3.A07(context);
                    view.measure(View.MeasureSpec.makeMeasureSpec(AbstractC13880nE.A0A(context), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(0, 0));
                    num = Integer.valueOf(view.getMeasuredHeight());
                    this.A05 = num;
                    if (num == null) {
                        return;
                    }
                }
                int intValue = num.intValue();
                if (expandingListView.A01) {
                    int height = intValue - view.getHeight();
                    HashMap hashMap = new HashMap();
                    int childCount = expandingListView.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = expandingListView.getChildAt(i);
                        if (childAt.getTop() >= view.getTop()) {
                            childAt.setHasTransientState(true);
                            hashMap.put(childAt, new int[]{childAt.getTop(), childAt.getBottom()});
                        }
                    }
                    if (hashMap.containsKey(view)) {
                        ViewTreeObserver viewTreeObserver = expandingListView.getViewTreeObserver();
                        viewTreeObserver.addOnPreDrawListener(new WOO(view, viewTreeObserver, expandingListView, hashMap, height));
                        view.getLayoutParams().height = intValue;
                        view.requestLayout();
                    }
                }
            }
        }
    }

    @Override // X.C3QU
    public final void DFe(float f) {
        ViewGroup viewGroup;
        C75113Zb c75113Zb = this.A02;
        if (c75113Zb != null && c75113Zb.A3D && (viewGroup = this.A00) != null) {
            viewGroup.setAlpha(f);
        }
    }
}
