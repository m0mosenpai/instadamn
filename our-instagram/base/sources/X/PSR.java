package X;

import android.view.TextureView;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;

/* loaded from: classes9.dex */
public final class PSR implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C52135N5j A02;

    public PSR(C52135N5j c52135N5j, int i, int i2) {
        this.A02 = c52135N5j;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C52135N5j c52135N5j = this.A02;
        TextureView textureView = c52135N5j.A06;
        if (textureView != null) {
            int width = ((NineSixteenLayoutConfigImpl) C52135N5j.A00(c52135N5j)).A0K.getWidth();
            int height = ((NineSixteenLayoutConfigImpl) C52135N5j.A00(c52135N5j)).A0K.getHeight();
            int i = this.A01;
            int i2 = this.A00;
            AbstractC226849zg.A00(textureView, width, height, i, i2, false, true);
            ((C8JS) c52135N5j.A0V.getValue()).A01(i, i2, ((NineSixteenLayoutConfigImpl) C52135N5j.A00(c52135N5j)).A0K.getWidth(), ((NineSixteenLayoutConfigImpl) C52135N5j.A00(c52135N5j)).A0K.getHeight());
            C9TN c9tn = c52135N5j.A0H;
            if (c9tn != null) {
                c9tn.A01();
            }
        }
    }
}
