package X;

import android.view.ViewGroup;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* loaded from: classes9.dex */
public final class PTL implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C51379Mme A02;
    public final /* synthetic */ boolean A03;

    public PTL(C51379Mme c51379Mme, int i, int i2, boolean z) {
        this.A02 = c51379Mme;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaFrameLayout mediaFrameLayout = this.A02.A0D;
        C14360o3.A07(mediaFrameLayout);
        int i = this.A01;
        int i2 = this.A00;
        boolean z = this.A03;
        ViewGroup.LayoutParams layoutParams = mediaFrameLayout.getLayoutParams();
        C14360o3.A0C(layoutParams, AbstractC111324zv.A00(20));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i3 = marginLayoutParams.topMargin;
        if (i3 == i && marginLayoutParams.bottomMargin == i2) {
            return;
        }
        if (!z) {
            marginLayoutParams.bottomMargin = i2;
            marginLayoutParams.topMargin = i;
            mediaFrameLayout.setLayoutParams(marginLayoutParams);
        } else {
            C50798McF c50798McF = new C50798McF(mediaFrameLayout, marginLayoutParams, i3, i, marginLayoutParams.bottomMargin, i2);
            c50798McF.setDuration(300L);
            mediaFrameLayout.startAnimation(c50798McF);
        }
    }
}
