package X;

import android.hardware.camera2.CameraAccessException;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class B1F implements Callable {
    public final /* synthetic */ C175307r4 A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public B1F(C175307r4 c175307r4, boolean z, boolean z2) {
        this.A00 = c175307r4;
        this.A01 = z;
        this.A02 = z2;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        try {
            this.A00.A0B(this.A01, this.A02);
            return null;
        } catch (CameraAccessException | IllegalArgumentException unused) {
            return null;
        } catch (Exception e) {
            throw new RuntimeException(AbstractC166997dE.A0y("Could not start preview: ", e));
        }
    }
}
