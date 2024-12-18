package X;

/* renamed from: X.4bQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC98474bQ extends AbstractC98234b2 {
    public final long A00;

    public AbstractC98474bQ(C4B6 c4b6, InterfaceC92354Bq interfaceC92354Bq, C4C7 c4c7, Object obj, int i, long j, long j2, long j3) {
        super(c4b6, interfaceC92354Bq, c4c7, obj, 1, i, j, j2);
        c4b6.getClass();
        this.A00 = j3;
    }

    public boolean A01() {
        return ((C98504bT) this).A00;
    }

    public final long A00() {
        if (this instanceof C98504bT) {
            return ((AbstractC98474bQ) ((C98504bT) this)).A00 + r0.A02;
        }
        long j = this.A00;
        if (j == -1) {
            return -1L;
        }
        return 1 + j;
    }
}
