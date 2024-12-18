package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController;

/* loaded from: classes6.dex */
public final class GRE implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ViewGroup A02;
    public final /* synthetic */ DirectAggregatedMediaViewerController A03;

    public GRE(ViewGroup viewGroup, DirectAggregatedMediaViewerController directAggregatedMediaViewerController, int i, int i2) {
        this.A03 = directAggregatedMediaViewerController;
        this.A02 = viewGroup;
        this.A01 = i;
        this.A00 = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        if (r1 != null) goto L7;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r5 = this;
            com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController r4 = r5.A03
            boolean r0 = r4.A0j
            if (r0 == 0) goto L31
            android.view.ViewGroup r1 = r4.A08
            if (r1 == 0) goto L6b
            r0 = 0
            r1.setTop(r0)
            android.content.Context r0 = X.AbstractC166997dE.A0L(r1)
            int r0 = X.AbstractC13890nF.A00(r0)
            r1.setBottom(r0)
            android.view.View r0 = r4.A07
            A00(r1, r0)
            android.view.ViewGroup r0 = r4.A09
            A00(r1, r0)
        L23:
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r4.A0D
            if (r0 != 0) goto L68
            java.lang.String r0 = "viewPager"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L31:
            android.view.ViewGroup r3 = r5.A02
            android.content.Context r0 = X.AbstractC166997dE.A0L(r3)
            int r2 = X.AbstractC13890nF.A01(r0)
            int r1 = X.AbstractC13890nF.A00(r0)
            int r0 = r3.getWidth()
            if (r0 != r2) goto L4b
            int r0 = r3.getHeight()
            if (r0 == r1) goto L4e
        L4b:
            X.AbstractC13880nE.A0h(r3, r2, r1)
        L4e:
            int r0 = r5.A01
            r3.setTop(r0)
            int r0 = r5.A00
            int r1 = r1 - r0
            r3.setBottom(r1)
            android.view.View r0 = r4.A07
            A00(r3, r0)
            android.view.ViewGroup r0 = r4.A09
            A00(r3, r0)
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r1 = r4.A0E
            if (r1 == 0) goto L6b
            goto L23
        L68:
            A00(r1, r0)
        L6b:
            android.view.ViewGroup r0 = r5.A02
            X.AbstractC13880nE.A0s(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GRE.run():void");
    }

    public static void A00(View view, View view2) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (view2 != null) {
            if (view2.getWidth() != width || view2.getHeight() != height) {
                AbstractC13880nE.A0h(view2, width, height);
            }
        }
    }
}
