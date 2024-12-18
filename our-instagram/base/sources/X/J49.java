package X;

import instagram.features.feed.fragment.ContextualFeedFragment;

/* loaded from: classes7.dex */
public final class J49 implements Runnable {
    public final /* synthetic */ ContextualFeedFragment A00;

    public J49(ContextualFeedFragment contextualFeedFragment) {
        this.A00 = contextualFeedFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ContextualFeedFragment contextualFeedFragment = this.A00;
        C3FR c3fr = (C3FR) contextualFeedFragment.getScrollingViewProxy();
        if (c3fr != null) {
            c3fr.EWc(true);
        }
        if (!contextualFeedFragment.isLoading()) {
            ContextualFeedFragment.A03(contextualFeedFragment, true, true);
        }
    }
}
