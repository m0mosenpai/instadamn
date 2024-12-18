package X;

/* renamed from: X.C3e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27298C3e extends AbstractC27455C9x {
    public final int A00;
    public final Integer A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27298C3e) {
                C27298C3e c27298C3e = (C27298C3e) obj;
                if (this.A01 != c27298C3e.A01 || this.A00 != c27298C3e.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A01;
        return (AbstractC25230BEn.A0C(num, CZF.A01(num)) * 31) + this.A00;
    }

    public final String toString() {
        String str;
        Integer num = this.A01;
        if (num != null) {
            str = CZF.A01(num);
        } else {
            str = "null";
        }
        return AnonymousClass001.A0l("GeneratedVisible(imagineType=", str, ", itemIndex=", ')', this.A00);
    }

    public C27298C3e(int i, Integer num) {
        this.A01 = num;
        this.A00 = i;
    }
}
