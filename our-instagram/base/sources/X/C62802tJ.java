package X;

/* renamed from: X.2tJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C62802tJ {
    public final float A00;
    public final C005001p A01 = new C005001p(0);

    public final long A00(String str, long j) {
        Number number = (Number) this.A01.get(str);
        if (number == null) {
            return -2147483648L;
        }
        return j - number.longValue();
    }

    public final void A01(String str, float f, long j) {
        C005001p c005001p = this.A01;
        if (!c005001p.containsKey(str) && f >= this.A00) {
            c005001p.put(str, Long.valueOf(j));
        }
    }

    public C62802tJ(float f) {
        this.A00 = f;
    }
}
