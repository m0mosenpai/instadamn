package X;

import android.view.TextureView;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;

/* renamed from: X.Az4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24844Az4 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C187058Qy A02;
    public final /* synthetic */ boolean A03;

    public RunnableC24844Az4(C187058Qy c187058Qy, int i, int i2, boolean z) {
        this.A02 = c187058Qy;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C187058Qy c187058Qy = this.A02;
        TextureView textureView = c187058Qy.A05;
        if (textureView != null) {
            int i = this.A01;
            int i2 = this.A00;
            boolean z = this.A03;
            InterfaceC1812882f interfaceC1812882f = ((NineSixteenLayoutConfigImpl) c187058Qy.A0G).A0K;
            AbstractC226849zg.A00(textureView, interfaceC1812882f.getWidth(), interfaceC1812882f.getHeight(), i, i2, z, false);
        }
    }
}
