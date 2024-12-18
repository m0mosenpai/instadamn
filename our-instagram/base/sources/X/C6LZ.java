package X;

import android.graphics.Bitmap;

/* renamed from: X.6LZ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6LZ implements InterfaceC137546La {
    public final Bitmap A00;

    @Override // X.InterfaceC137546La
    public final int AqB() {
        Bitmap.Config config = this.A00.getConfig();
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config != Bitmap.Config.ARGB_4444) {
            if (config == Bitmap.Config.RGBA_F16) {
                return 3;
            }
            if (config == Bitmap.Config.HARDWARE) {
                return 4;
            }
            return 0;
        }
        return 0;
    }

    public C6LZ(Bitmap bitmap) {
        this.A00 = bitmap;
    }
}
