package X;

import com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.ArEffectPickerRecyclerView;

/* renamed from: X.PLr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56872PLr implements Runnable {
    public final /* synthetic */ OyC A00;

    public RunnableC56872PLr(OyC oyC) {
        this.A00 = oyC;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArEffectPickerRecyclerView arEffectPickerRecyclerView = this.A00.A03;
        if (arEffectPickerRecyclerView != null) {
            arEffectPickerRecyclerView.performAccessibilityAction(64, null);
        }
    }
}
