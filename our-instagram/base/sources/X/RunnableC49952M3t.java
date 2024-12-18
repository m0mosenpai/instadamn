package X;

import com.instagram.direct.fragment.writewithai.RewriteTextBubbleViewPager;

/* renamed from: X.M3t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49952M3t implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ RewriteTextBubbleViewPager A01;

    public RunnableC49952M3t(RewriteTextBubbleViewPager rewriteTextBubbleViewPager, int i) {
        this.A01 = rewriteTextBubbleViewPager;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A0L(this.A00, 0.0f);
    }
}
