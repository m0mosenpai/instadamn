package X;

/* renamed from: X.5GM, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5GM {
    public AbstractC33588Et0 A00;
    public C32956Een A01;
    public V80 A02;
    public C32957Eeo A03;
    public C32957Eeo A04;
    public C32957Eeo A05;
    public Integer A06;

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C32957Eeo c32957Eeo = this.A04;
        int i7 = 0;
        if (c32957Eeo != null) {
            i = c32957Eeo.hashCode();
        } else {
            i = 0;
        }
        int i8 = i * 31;
        C32957Eeo c32957Eeo2 = this.A05;
        if (c32957Eeo2 != null) {
            i2 = c32957Eeo2.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = (i8 + i2) * 31;
        C32957Eeo c32957Eeo3 = this.A03;
        if (c32957Eeo3 != null) {
            i3 = c32957Eeo3.hashCode();
        } else {
            i3 = 0;
        }
        int i10 = (i9 + i3) * 31;
        V80 v80 = this.A02;
        if (v80 != null) {
            i4 = v80.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (i10 + i4) * 31;
        C32956Een c32956Een = this.A01;
        if (c32956Een != null) {
            i5 = c32956Een.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 31;
        Integer num = this.A06;
        if (num != null) {
            i6 = AbstractC34246F8s.A00(num).hashCode() + num.intValue();
        } else {
            i6 = 0;
        }
        int i13 = (i12 + i6) * 31;
        AbstractC33588Et0 abstractC33588Et0 = this.A00;
        if (abstractC33588Et0 != null) {
            i7 = abstractC33588Et0.hashCode();
        }
        return (i13 + i7) * 31;
    }
}
