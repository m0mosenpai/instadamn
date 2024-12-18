package X;

/* renamed from: X.VuY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69738VuY {
    public long A00 = -1;
    public final InterfaceC71970XDc A01;

    public final long A01() {
        long j = this.A00;
        if (j == -1) {
            this.A00 = 0L;
            int frameCount = this.A01.getFrameCount();
            for (int i = 0; i < frameCount; i++) {
                this.A00 += r6.B8b(i);
            }
            return this.A00;
        }
        return j;
    }

    public C69738VuY(InterfaceC71970XDc interfaceC71970XDc) {
        this.A01 = interfaceC71970XDc;
    }

    public final int A00(long j) {
        long A01 = A01();
        long j2 = 0;
        if (A01 != 0) {
            if (this.A01.getLoopCount() != 0 && j / A01 >= r1.getLoopCount()) {
                return -1;
            }
            j2 = j % A01;
        }
        int i = 0;
        long j3 = 0;
        do {
            j3 += this.A01.B8b(i);
            i++;
        } while (j2 >= j3);
        return i - 1;
    }

    public final long A02(long j) {
        long A01 = A01();
        long j2 = 0;
        if (A01 != 0) {
            InterfaceC71970XDc interfaceC71970XDc = this.A01;
            if (interfaceC71970XDc.getLoopCount() == 0 || j / A01 < interfaceC71970XDc.getLoopCount()) {
                long j3 = j % A01;
                int frameCount = interfaceC71970XDc.getFrameCount();
                for (int i = 0; i < frameCount && j2 <= j3; i++) {
                    j2 += interfaceC71970XDc.B8b(i);
                }
                return j + (j2 - j3);
            }
        }
        return -1L;
    }
}
