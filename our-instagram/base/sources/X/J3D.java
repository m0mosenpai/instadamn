package X;

import com.instagram.feed.ui.state.IntentAwareAdPivotState;

/* loaded from: classes7.dex */
public final class J3D implements Runnable {
    public final /* synthetic */ C64082vT A00;

    public J3D(C64082vT c64082vT) {
        this.A00 = c64082vT;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C64082vT c64082vT = this.A00;
        IntentAwareAdPivotState intentAwareAdPivotState = c64082vT.A00;
        if (intentAwareAdPivotState != null) {
            intentAwareAdPivotState.A0B = true;
        }
        JGE jge = c64082vT.A01;
        if (jge != null) {
            jge.Ekj();
        }
    }
}
