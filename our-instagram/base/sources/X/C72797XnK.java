package X;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Surface;

/* renamed from: X.XnK, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72797XnK {
    public float A00;
    public int A01;
    public Surface A02;
    public final C72706Xle A03 = new C72706Xle();
    public final Y84 A04;
    public final Y8A A05;

    public C72797XnK(Context context) {
        Y8A y8a;
        DisplayManager displayManager;
        Y84 y84 = null;
        if (context != null && (displayManager = (DisplayManager) context.getSystemService("display")) != null) {
            y84 = new Y84(displayManager, this);
        }
        this.A04 = y84;
        if (y84 != null) {
            y8a = Y8A.A04;
        } else {
            y8a = null;
        }
        this.A05 = y8a;
        this.A00 = 1.0f;
        this.A01 = 0;
    }
}
