package X;

import com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration;

/* renamed from: X.Au5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24548Au5 implements Runnable {
    public final /* synthetic */ PickerConfiguration A00;
    public final /* synthetic */ C203858zu A01;

    public RunnableC24548Au5(PickerConfiguration pickerConfiguration, C203858zu c203858zu) {
        this.A01 = c203858zu;
        this.A00 = pickerConfiguration;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C203858zu c203858zu = this.A01;
        c203858zu.A01.DYd(this.A00, c203858zu.A05);
    }
}
