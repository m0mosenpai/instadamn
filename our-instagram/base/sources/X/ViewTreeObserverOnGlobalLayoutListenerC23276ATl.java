package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.ATl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC23276ATl implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C140366Wq A02;
    public final /* synthetic */ C30C A03;

    public ViewTreeObserverOnGlobalLayoutListenerC23276ATl(C140366Wq c140366Wq, C30C c30c, int i, int i2) {
        this.A03 = c30c;
        this.A02 = c140366Wq;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        float f;
        C140366Wq c140366Wq = this.A02;
        c140366Wq.A03.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        C30C c30c = this.A03;
        int i = this.A01;
        int i2 = this.A00;
        MediaFrameLayout mediaFrameLayout = c140366Wq.A0G.A0T;
        float width = mediaFrameLayout.getWidth() / mediaFrameLayout.getHeight();
        View view = c140366Wq.A03;
        int width2 = view.getWidth();
        int height = view.getHeight();
        int i3 = c30c.A05;
        int i4 = i3 * 2;
        float f2 = ((width2 - i4) / width) + c30c.A04 + c30c.A03;
        float f3 = f2 - (((height - i) - i2) - i4);
        if (f3 > 0.0f) {
            if (AbstractC52812bN.A01(width2)) {
                f = (width2 - ((r3 * r11) / f2)) / 2.0f;
            } else {
                f = width * f3;
            }
            i3 = (int) f;
        }
        View view2 = c140366Wq.A02;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
        marginLayoutParams.setMargins(i3, (i / 2) + i3, i3, i3 + (i2 / 2));
        view2.setLayoutParams(marginLayoutParams);
    }
}
