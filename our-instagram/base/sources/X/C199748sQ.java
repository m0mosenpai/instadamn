package X;

import android.graphics.RectF;
import android.util.SparseArray;
import java.util.ArrayList;

/* renamed from: X.8sQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199748sQ extends AbstractC198678qH implements InterfaceC179117xN {
    public static final RectF A06 = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
    public int A00;
    public int A01;
    public final SparseArray A02;
    public final C22909A8f A03;
    public final AZD A04;
    public final ArrayList A05;

    public C199748sQ() {
        super(new C178747wm());
        this.A03 = new C22909A8f();
        this.A02 = new SparseArray();
        this.A05 = new ArrayList();
        this.A04 = new AZD(super.A01);
    }

    @Override // X.InterfaceC179117xN
    public final void E6H(InterfaceC179247xa interfaceC179247xa) {
        int ordinal = interfaceC179247xa.CBM().ordinal();
        if (ordinal != 40) {
            if (ordinal != 41) {
                return;
            } else {
                throw new NullPointerException("getZoomCropProperties");
            }
        }
        throw new NullPointerException("getBackgroundGradientColor");
    }

    @Override // X.InterfaceC179117xN
    public final void E6I(InterfaceC179247xa interfaceC179247xa, InterfaceC179577y7 interfaceC179577y7) {
        E6H(interfaceC179247xa);
    }
}
