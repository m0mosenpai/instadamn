package X;

/* loaded from: classes8.dex */
public final class L9X {
    public final Integer A00;
    public final String A01;

    public L9X(Integer num, String str) {
        C14360o3.A0B(str, 2);
        this.A00 = num;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof L9X) {
                L9X l9x = (L9X) obj;
                if (this.A00 != l9x.A00 || !C14360o3.A0K(this.A01, l9x.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A00;
        return AbstractC25226BEj.A03(this.A01, AbstractC25230BEn.A0C(num, AbstractC46553Kis.A00(num)) * 31);
    }

    public final String toString() {
        return AnonymousClass001.A0v("StickerID(idType=", AbstractC46553Kis.A00(this.A00), ", rawTypeaheadId=", this.A01, ')');
    }
}
