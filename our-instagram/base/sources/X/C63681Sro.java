package X;

import java.util.List;

/* renamed from: X.Sro, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63681Sro implements InterfaceC65578TnD {
    public final List A03;
    public C63366SiP A01 = null;
    public float A00 = -1.0f;
    public C63366SiP A02 = A00(0.0f);

    @Override // X.InterfaceC65578TnD
    public final boolean isEmpty() {
        return false;
    }

    private C63366SiP A00(float f) {
        List list = this.A03;
        C63366SiP c63366SiP = (C63366SiP) list.get(list.size() - 1);
        if (f < c63366SiP.A02()) {
            for (int size = list.size() - 2; size >= 1; size--) {
                c63366SiP = (C63366SiP) list.get(size);
                if (this.A02 == c63366SiP || f < c63366SiP.A02() || f >= c63366SiP.A01()) {
                }
            }
            return (C63366SiP) AbstractC166987dD.A16(list);
        }
        return c63366SiP;
    }

    @Override // X.InterfaceC65578TnD
    public final C63366SiP AuW() {
        return this.A02;
    }

    @Override // X.InterfaceC65578TnD
    public final float B1z() {
        return ((C63366SiP) AbstractC58320PtC.A0u(this.A03)).A01();
    }

    @Override // X.InterfaceC65578TnD
    public final float Bzb() {
        return ((C63366SiP) AbstractC166987dD.A16(this.A03)).A02();
    }

    @Override // X.InterfaceC65578TnD
    public final boolean CR6(float f) {
        C63366SiP c63366SiP = this.A01;
        C63366SiP c63366SiP2 = this.A02;
        if (c63366SiP == c63366SiP2 && this.A00 == f) {
            return true;
        }
        this.A01 = c63366SiP2;
        this.A00 = f;
        return false;
    }

    @Override // X.InterfaceC65578TnD
    public final boolean CfV(float f) {
        C63366SiP c63366SiP = this.A02;
        if (f >= c63366SiP.A02() && f < c63366SiP.A01()) {
            return !c63366SiP.A03();
        }
        this.A02 = A00(f);
        return true;
    }

    public C63681Sro(List list) {
        this.A03 = list;
    }
}
