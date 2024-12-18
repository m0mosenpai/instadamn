package X;

/* renamed from: X.Mom, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51501Mom extends AbstractC53426NkF {
    public final Integer A00;

    public final boolean equals(Object obj) {
        if (obj instanceof C51501Mom) {
            Integer num = this.A00;
            if (num == C05F.A05) {
                return false;
            }
            return C14360o3.A0K(AbstractC225029wR.A00(num), AbstractC225029wR.A00(((C51501Mom) obj).A00));
        }
        return super.equals(obj);
    }

    public final int hashCode() {
        Integer num = this.A00;
        return AbstractC25230BEn.A0C(num, AbstractC225029wR.A00(num));
    }

    public C51501Mom(Integer num) {
        this.A00 = num;
    }
}
