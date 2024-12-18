package X;

import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.ui.widget.pageindicator.CirclePageIndicator;

/* renamed from: X.AvE, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24618AvE implements Runnable {
    public final /* synthetic */ ReboundViewPager A00;
    public final /* synthetic */ C9LN A01;

    public RunnableC24618AvE(ReboundViewPager reboundViewPager, C9LN c9ln) {
        this.A01 = c9ln;
        this.A00 = reboundViewPager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CirclePageIndicator circlePageIndicator = this.A01.A0S;
        if (circlePageIndicator != null) {
            AbstractC13880nE.A0f(this.A00, circlePageIndicator.getHeight());
        }
    }
}
