package X;

import com.facebook.cameracore.mediapipeline.services.uicontrol.SliderConfiguration;

/* renamed from: X.8zy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC203878zy implements Runnable {
    public final /* synthetic */ SliderConfiguration A00;
    public final /* synthetic */ C203858zu A01;

    public RunnableC203878zy(SliderConfiguration sliderConfiguration, C203858zu c203858zu) {
        this.A01 = c203858zu;
        this.A00 = sliderConfiguration;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C203858zu c203858zu = this.A01;
        c203858zu.A03.Dmz(this.A00, c203858zu.A05);
    }
}
