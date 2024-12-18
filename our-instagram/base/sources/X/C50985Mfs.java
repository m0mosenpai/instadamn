package X;

import java.util.List;

/* renamed from: X.Mfs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50985Mfs extends AbstractC52922bZ {
    public final C2GT A00;
    public final C2GS A01;
    public final C2GS A02;
    public final C2GT A03;
    public final C2GT A04;
    public final C2GS A05;

    public final List A00() {
        List list = (List) this.A02.A02();
        if (list == null) {
            return C16930sl.A00;
        }
        return list;
    }

    public final void A01(boolean z) {
        MSX.A1B(this.A05, z);
    }

    public C50985Mfs() {
        C2GS A0E = MSW.A0E();
        this.A05 = A0E;
        this.A00 = A0E;
        C2GS A0E2 = MSW.A0E();
        this.A01 = A0E2;
        this.A03 = A0E2;
        C2GS A0E3 = MSW.A0E();
        this.A02 = A0E3;
        this.A04 = A0E3;
    }
}
