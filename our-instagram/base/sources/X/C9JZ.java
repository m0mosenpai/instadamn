package X;

/* renamed from: X.9JZ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9JZ {
    public final C38321qM A00;
    public final Integer A01;
    public final Long A02;
    public final String A03;
    public final boolean A04;

    public C9JZ(C38321qM c38321qM, Integer num, String str, String str2, boolean z) {
        this.A00 = c38321qM;
        this.A04 = z;
        this.A01 = num;
        this.A03 = str2;
        Long l = null;
        if (str != null) {
            try {
                l = AbstractC003100w.A0k(10, str);
            } catch (NumberFormatException unused) {
            }
        }
        this.A02 = l;
    }
}
