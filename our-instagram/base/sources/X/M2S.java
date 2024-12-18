package X;

import com.instagram.ui.widget.fixedtabbar.FixedTabBarIndicator;

/* loaded from: classes8.dex */
public final class M2S implements Runnable {
    public final /* synthetic */ FixedTabBarIndicator A00;

    public M2S(FixedTabBarIndicator fixedTabBarIndicator) {
        this.A00 = fixedTabBarIndicator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FixedTabBarIndicator fixedTabBarIndicator = this.A00;
        fixedTabBarIndicator.A00(fixedTabBarIndicator.A01, 0.0f);
    }
}
