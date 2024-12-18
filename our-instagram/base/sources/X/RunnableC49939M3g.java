package X;

import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* renamed from: X.M3g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49939M3g implements Runnable {
    public final /* synthetic */ KP1 A00;
    public final /* synthetic */ boolean A01;

    public RunnableC49939M3g(KP1 kp1, boolean z) {
        this.A00 = kp1;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        KP1 kp1 = this.A00;
        IgdsBottomButtonLayout igdsBottomButtonLayout = kp1.A00;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setPrimaryActionIsLoading(this.A01);
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout2 = kp1.A00;
        if (igdsBottomButtonLayout2 != null) {
            igdsBottomButtonLayout2.setSecondaryButtonEnabled(!this.A01);
        }
    }
}
