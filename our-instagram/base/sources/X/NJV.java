package X;

/* loaded from: classes9.dex */
public final class NJV extends AbstractC53462Nkp {
    public final Integer A00;

    public NJV(Integer num) {
        C14360o3.A0B(num, 1);
        this.A00 = num;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof NJV) && this.A00 == ((NJV) obj).A00);
    }

    public final int hashCode() {
        Integer num = this.A00;
        return AbstractC25230BEn.A0C(num, AbstractC53938NtB.A00(num));
    }

    public final String toString() {
        String str;
        Integer num = this.A00;
        if (num != null) {
            str = AbstractC53938NtB.A00(num);
        } else {
            str = "null";
        }
        return AbstractC25235BEs.A0r("FeatureRowItem(rowItemEnum=", str);
    }
}
