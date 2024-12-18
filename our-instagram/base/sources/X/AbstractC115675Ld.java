package X;

import java.util.Iterator;

/* renamed from: X.5Ld, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC115675Ld implements Iterable, InterfaceC15590qF {
    public final long A00;
    public final long A01;
    public final long A02;

    public AbstractC115675Ld(long j, long j2) {
        this.A00 = j;
        if (j < j2) {
            long j3 = j2 % 1;
            long j4 = j % 1;
            long j5 = ((j3 < 0 ? j3 + 1 : j3) - (j4 < 0 ? j4 + 1 : j4)) % 1;
            j2 -= j5 < 0 ? j5 + 1 : j5;
        }
        this.A01 = j2;
        this.A02 = 1L;
    }

    @Override // java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new C64949TaP(this.A00, this.A01);
    }
}
