package X;

/* renamed from: X.5II, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5II extends C0T6 {
    public final int A00;
    public final Integer A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5II) {
                C5II c5ii = (C5II) obj;
                if (this.A01 != c5ii.A01 || this.A00 != c5ii.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A01;
        return ((AbstractC114975Hn.A01(num).hashCode() + num.intValue()) * 31) + this.A00;
    }

    public final String toString() {
        String str;
        Integer num = this.A01;
        if (num != null) {
            str = AbstractC114975Hn.A01(num);
        } else {
            str = "null";
        }
        return AnonymousClass001.A0l("LastItemSeen(itemType=", str, ", lastSponsoredPosition=", ')', this.A00);
    }

    public C5II(int i, Integer num) {
        this.A01 = num;
        this.A00 = i;
    }
}
