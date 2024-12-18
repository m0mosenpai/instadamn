package X;

import java.lang.reflect.Array;

/* renamed from: X.4eV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C100074eV extends AbstractC100064eU implements InterfaceC100084eW {
    public int A00;
    public long[][] A01;
    public final C100094eX A02;
    public final boolean A03;

    @Override // X.InterfaceC100084eW
    public final String getName() {
        return "gc";
    }

    private void A00() {
        long[][] jArr;
        int length;
        C100094eX c100094eX = this.A02;
        if (c100094eX != null && (length = (jArr = this.A01).length) != 0) {
            long[] jArr2 = jArr[this.A00];
            jArr2[0] = c100094eX.A00;
            jArr2[1] = c100094eX.A05;
            jArr2[2] = c100094eX.A06;
            jArr2[3] = c100094eX.A02;
            jArr2[4] = c100094eX.A03;
            jArr2[5] = c100094eX.A01;
            jArr2[6] = c100094eX.A04;
            jArr2[7] = Runtime.getRuntime().totalMemory();
            jArr2[8] = Runtime.getRuntime().freeMemory();
            jArr2[9] = Runtime.getRuntime().maxMemory();
            int i = this.A00 + 1;
            this.A00 = i;
            this.A00 = i % length;
        }
    }

    @Override // X.InterfaceC100084eW
    public final void AGj(SN2 sn2, StackTraceElement[] stackTraceElementArr) {
        C100094eX c100094eX = this.A02;
        if (c100094eX != null) {
            c100094eX.A00();
            if (this.A03) {
                A00();
            }
            sn2.A04 = c100094eX.A05;
            sn2.A06 = c100094eX.A06;
            sn2.A01 = c100094eX.A02;
            sn2.A02 = c100094eX.A03;
            sn2.A05 = c100094eX.A07;
        }
    }

    @Override // X.InterfaceC100084eW
    public final void update() {
        C100094eX c100094eX = this.A02;
        if (c100094eX != null && this.A03) {
            c100094eX.A00();
            A00();
        }
    }

    public C100074eV(boolean z) {
        this.A00 = 0;
        C100094eX c100094eX = C100094eX.A0E;
        if (c100094eX == null) {
            c100094eX = new C100094eX();
            C100094eX.A0E = c100094eX;
        }
        this.A02 = c100094eX;
        this.A03 = z;
        int[] iArr = {0, 0};
        if (z) {
            // fill-array-data instruction
            iArr[0] = 15;
            iArr[1] = 10;
        }
        this.A01 = (long[][]) Array.newInstance((Class<?>) Long.TYPE, iArr);
    }

    public C100074eV() {
        this(false);
    }
}
