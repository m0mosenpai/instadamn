package X;

import instagram.features.feed.fragment.ContextualFeedFragment;

/* renamed from: X.GoD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38024GoD {
    public final /* synthetic */ ContextualFeedFragment A00;

    public C38024GoD(ContextualFeedFragment contextualFeedFragment) {
        this.A00 = contextualFeedFragment;
    }

    public final String A00() {
        String str;
        ContextualFeedFragment contextualFeedFragment = this.A00;
        if (contextualFeedFragment.mView == null) {
            return null;
        }
        C3FQ scrollingViewProxy = contextualFeedFragment.getScrollingViewProxy();
        ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = contextualFeedFragment.A06;
        if (viewOnTouchListenerC60632pm == null) {
            str = "_helper";
        } else {
            int B6q = scrollingViewProxy.B6q();
            if (scrollingViewProxy.AnZ() > 0 && scrollingViewProxy.AnU(0).getBottom() <= viewOnTouchListenerC60632pm.A00 - viewOnTouchListenerC60632pm.A01) {
                B6q++;
            }
            if (B6q < 0) {
                return null;
            }
            HY4 hy4 = contextualFeedFragment.A0N;
            str = "adapter";
            if (hy4 != null) {
                if (B6q >= hy4.getItemCount()) {
                    return null;
                }
                HY4 hy42 = contextualFeedFragment.A0N;
                if (hy42 != null) {
                    Object item = hy42.getItem(B6q);
                    if (!(item instanceof C38321qM)) {
                        return null;
                    }
                    return AbstractC37300Gc1.A0V(item);
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
