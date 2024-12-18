package X;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public final class MTD {
    public static final AtomicInteger A06 = MSW.A1C(0);
    public final int A00 = A06.getAndIncrement();
    public final long A01;
    public final AbstractC10360h2 A02;
    public final InterfaceC191378do A03;
    public final Integer A04;
    public final List A05;

    public MTD(MTC mtc) {
        this.A05 = mtc.A04;
        this.A03 = mtc.A02;
        this.A04 = mtc.A03;
        this.A02 = mtc.A01;
        this.A01 = mtc.A00;
    }
}
