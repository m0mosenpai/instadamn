package X;

import android.graphics.RectF;

/* renamed from: X.Cwv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29362Cwv implements InterfaceC58290Psi {
    public final /* synthetic */ RectF A00;
    public final /* synthetic */ CP7 A01;

    @Override // X.InterfaceC58290Psi
    public final void CMt() {
    }

    @Override // X.InterfaceC58290Psi
    public final void ElQ() {
    }

    public C29362Cwv(RectF rectF, CP7 cp7) {
        this.A00 = rectF;
        this.A01 = cp7;
    }

    @Override // X.InterfaceC58290Psi
    public final void El5(boolean z) {
        C75113Zb c75113Zb;
        boolean z2;
        CP7 cp7 = this.A01;
        if (z) {
            if (cp7 != null) {
                c75113Zb = cp7.A00;
                z2 = true;
            } else {
                return;
            }
        } else {
            if (cp7 == null) {
                return;
            }
            c75113Zb = cp7.A00;
            z2 = false;
        }
        if (c75113Zb.A1s != z2) {
            c75113Zb.A1s = z2;
            C75113Zb.A00(c75113Zb, 64);
        }
    }

    @Override // X.InterfaceC72963Ox
    public final /* synthetic */ RectF Ahl() {
        return this.A00;
    }

    @Override // X.InterfaceC58290Psi
    /* renamed from: Bfj */
    public final RectF Ahl() {
        return this.A00;
    }
}
