package X;

/* renamed from: X.4b2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC98234b2 implements InterfaceC98244b3 {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03 = C98264b5.A03.getAndIncrement();
    public final long A04;
    public final C4B6 A05;
    public final C4C7 A06;
    public final C98254b4 A07;
    public final Object A08;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", Bytes Loaded: ");
        sb.append(this.A07.A00);
        sb.append(", Chunk Type: ");
        sb.append(this.A01);
        sb.append(", ");
        sb.append(this.A06.toString());
        return sb.toString();
    }

    public AbstractC98234b2(C4B6 c4b6, InterfaceC92354Bq interfaceC92354Bq, C4C7 c4c7, Object obj, int i, int i2, long j, long j2) {
        this.A07 = new C98254b4(interfaceC92354Bq);
        this.A06 = c4c7;
        this.A01 = i;
        this.A05 = c4b6;
        this.A00 = i2;
        this.A08 = obj;
        this.A04 = j;
        this.A02 = j2;
    }
}
