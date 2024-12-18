package X;

/* renamed from: X.54x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1122554x extends C54y {
    public static final C1122554x[] A01;
    public final int A00;

    @Override // X.AbstractC911344p
    public final boolean equals(Object obj) {
        if (obj != this) {
            return obj != null && (obj instanceof C1122554x) && ((C1122554x) obj).A00 == this.A00;
        }
        return true;
    }

    static {
        C1122554x[] c1122554xArr = new C1122554x[12];
        A01 = c1122554xArr;
        int i = 0;
        do {
            c1122554xArr[i] = new C1122554x(i - 1);
            i++;
        } while (i < 12);
    }

    public static C1122554x A00(int i) {
        if (i <= 10 && i >= -1) {
            return A01[i - (-1)];
        }
        return new C1122554x(i);
    }

    @Override // X.AbstractC911344p
    public final String A07() {
        return AnonymousClass188.A08(this.A00);
    }

    @Override // X.C54u
    public final int hashCode() {
        return this.A00;
    }

    public C1122554x(int i) {
        this.A00 = i;
    }
}
