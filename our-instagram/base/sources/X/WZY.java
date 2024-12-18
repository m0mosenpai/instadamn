package X;

import com.facebook.videolite.transcoder.base.composition.MediaComposition;

/* loaded from: classes11.dex */
public final class WZY implements InterfaceC71895X9c {
    public U7T A00;
    public XD9 A01;

    @Override // X.InterfaceC71895X9c
    public final XCA ALX(MediaComposition mediaComposition, boolean z) {
        if (z) {
            return new WZV();
        }
        return new WZU(mediaComposition, this.A00, this.A01);
    }

    public WZY(U7T u7t, XD9 xd9) {
        this.A00 = u7t;
        this.A01 = xd9;
    }
}
