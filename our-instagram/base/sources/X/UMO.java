package X;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* loaded from: classes11.dex */
public final class UMO extends C162867Qx implements Animatable {
    public boolean A00;
    public final InterfaceC58682mR A01;

    /* JADX WARN: Multi-variable type inference failed */
    public UMO(InterfaceC58682mR interfaceC58682mR) {
        super((Drawable) interfaceC58682mR);
        this.A01 = interfaceC58682mR;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.A00;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.A01.E4S();
        this.A00 = true;
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.A01.pause();
        this.A00 = false;
    }
}
