package X;

/* renamed from: X.0Tz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06090Tz implements Cloneable {
    public static final C06090Tz A04;
    public static final C06090Tz A05 = new C06090Tz();
    public static final C06090Tz A06;
    public boolean A03 = false;
    public boolean A01 = false;
    public boolean A02 = false;
    public C0U5 A00 = C0U5.A01;

    static {
        C06090Tz A00 = A00(new C06090Tz());
        A00.A01 = true;
        A04 = A00;
        C06090Tz A002 = A00(new C06090Tz());
        A002.A03 = true;
        A06 = A002;
    }

    public static C06090Tz A00(C06090Tz c06090Tz) {
        if (c06090Tz != A05 && c06090Tz != A04 && c06090Tz != A06) {
            return c06090Tz;
        }
        try {
            return (C06090Tz) c06090Tz.clone();
        } catch (CloneNotSupportedException unused) {
            throw new RuntimeException("");
        }
    }
}
