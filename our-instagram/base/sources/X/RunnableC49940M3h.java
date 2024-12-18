package X;

import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* renamed from: X.M3h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49940M3h implements Runnable {
    public final /* synthetic */ KP0 A00;
    public final /* synthetic */ boolean A01;

    public RunnableC49940M3h(KP0 kp0, boolean z) {
        this.A00 = kp0;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        KP0 kp0 = this.A00;
        IgdsBottomButtonLayout igdsBottomButtonLayout = kp0.A00;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setPrimaryActionIsLoading(this.A01);
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout2 = kp0.A00;
        if (igdsBottomButtonLayout2 != null) {
            igdsBottomButtonLayout2.setSecondaryButtonEnabled(!this.A01);
        }
    }
}
