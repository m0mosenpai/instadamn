package X;

import com.facebook.cameracore.mediapipeline.services.uicontrol.instagram.RawTextInputView;

/* renamed from: X.ApR, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24260ApR implements Runnable {
    public final /* synthetic */ RawTextInputView A00;

    public RunnableC24260ApR(RawTextInputView rawTextInputView) {
        this.A00 = rawTextInputView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RawTextInputView rawTextInputView = this.A00;
        if (!rawTextInputView.A00.showSoftInput(rawTextInputView, 2)) {
            rawTextInputView.A00.toggleSoftInput(2, 0);
            rawTextInputView.A00.showSoftInput(rawTextInputView, 2);
        }
    }
}
