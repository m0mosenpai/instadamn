package X;

import java.util.List;

/* renamed from: X.Srn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63680Srn implements InterfaceC65578TnD {
    public float A00 = -1.0f;
    public final C63366SiP A01;

    @Override // X.InterfaceC65578TnD
    public final boolean isEmpty() {
        return false;
    }

    @Override // X.InterfaceC65578TnD
    public final C63366SiP AuW() {
        return this.A01;
    }

    @Override // X.InterfaceC65578TnD
    public final float B1z() {
        return this.A01.A01();
    }

    @Override // X.InterfaceC65578TnD
    public final float Bzb() {
        return this.A01.A02();
    }

    @Override // X.InterfaceC65578TnD
    public final boolean CR6(float f) {
        if (this.A00 == f) {
            return true;
        }
        this.A00 = f;
        return false;
    }

    @Override // X.InterfaceC65578TnD
    public final boolean CfV(float f) {
        return !this.A01.A03();
    }

    public C63680Srn(List list) {
        this.A01 = (C63366SiP) AbstractC166987dD.A16(list);
    }
}
