package X;

/* renamed from: X.SIj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62605SIj {
    public final float A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final Integer A04;
    public final Long A05;

    public AbstractC62605SIj(Integer num, Long l, float f, long j, long j2, long j3) {
        num.getClass();
        C18C.A0E(MSY.A1R((j > j2 ? 1 : (j == j2 ? 0 : -1))));
        C18C.A0E(AbstractC167007dF.A1O((j > 0L ? 1 : (j == 0L ? 0 : -1))));
        C18C.A0E(AbstractC167007dF.A1O((j2 > 0L ? 1 : (j2 == 0L ? 0 : -1))));
        C18C.A0E(MSY.A1R((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1))));
        C18C.A0E(j3 >= 0);
        this.A04 = num;
        this.A01 = j;
        this.A03 = j2;
        this.A00 = f;
        this.A02 = j3;
        this.A05 = l;
    }
}
