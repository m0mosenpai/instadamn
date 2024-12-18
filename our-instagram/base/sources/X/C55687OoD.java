package X;

import android.view.Surface;
import com.facebook.mediastreaming.opt.common.SurfaceHolder;

/* renamed from: X.OoD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55687OoD implements SurfaceHolder {
    public final int A00;
    public final int A01;
    public final Surface A02;

    @Override // com.facebook.mediastreaming.opt.common.SurfaceHolder
    public int getHeight() {
        return this.A00;
    }

    @Override // com.facebook.mediastreaming.opt.common.SurfaceHolder
    public Surface getSurface() {
        return this.A02;
    }

    @Override // com.facebook.mediastreaming.opt.common.SurfaceHolder
    public int getWidth() {
        return this.A01;
    }

    public C55687OoD(Surface surface, int i, int i2) {
        this.A02 = surface;
        this.A01 = i;
        this.A00 = i2;
    }
}
