package X;

/* renamed from: X.3PQ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3PQ {
    public static final C12550kz A06 = new C12550kz(2);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public String A04;
    public String A05;

    /* JADX WARN: Multi-variable type inference failed */
    public static C3PQ A00(String str, String str2, int i, int i2, int i3, int i4) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException(AnonymousClass001.A0g("Tried to parse ReDrawable but couldn't find a valid URL! (id: 0x", Integer.toHexString(i), ")"));
        }
        C3PQ c3pq = (C3PQ) A06.A7H();
        C3PQ c3pq2 = c3pq;
        if (c3pq == null) {
            c3pq2 = new Object();
        }
        c3pq2.A01 = i;
        c3pq2.A04 = str;
        c3pq2.A05 = str2;
        c3pq2.A03 = i2;
        c3pq2.A00 = i3;
        c3pq2.A02 = i4;
        return c3pq2;
    }
}
