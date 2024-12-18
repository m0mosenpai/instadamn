package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* renamed from: X.9FG, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9FG extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9FG(Object obj, int i, Object obj2, int i2, int i3) {
        super(0);
        this.A00 = i3;
        this.A04 = obj;
        this.A03 = obj2;
        this.A02 = i;
        this.A01 = i2;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A00 != 0) {
            C4QT c4qt = ((AbstractC97724aA) this.A04).A00;
            Surface surface = new Surface((SurfaceTexture) this.A03);
            C4SE c4se = c4qt.A0O;
            if (c4se != null && c4se.A03.A03) {
                C4QT.A0G(c4qt);
            } else {
                C95334Qt c95334Qt = c4qt.A0K;
                if (c95334Qt != null) {
                    c95334Qt.setSurface(surface);
                }
            }
            return C0eB.A00;
        }
        return ((C140066Vk) this.A04).A00.AF8((C78473fD) this.A03, this.A02, this.A01);
    }
}
