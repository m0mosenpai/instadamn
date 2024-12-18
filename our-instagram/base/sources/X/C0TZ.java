package X;

/* renamed from: X.0TZ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0TZ implements Cloneable {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public C0TY A05;
    public C0TY A06;
    public C0TY A07;

    public C0TZ() {
        C0TY c0ty = C0TY.GREEN;
        this.A06 = c0ty;
        this.A07 = c0ty;
        this.A05 = c0ty;
    }

    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C0TZ clone() {
        try {
            C0TZ c0tz = (C0TZ) super.clone();
            c0tz.A06 = this.A06;
            c0tz.A07 = this.A07;
            c0tz.A05 = this.A05;
            c0tz.A03 = this.A03;
            c0tz.A01 = this.A01;
            c0tz.A02 = this.A02;
            c0tz.A00 = this.A00;
            return c0tz;
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }
}
