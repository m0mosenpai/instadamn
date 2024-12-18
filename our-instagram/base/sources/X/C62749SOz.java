package X;

/* renamed from: X.SOz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62749SOz {
    public final int A00;
    public final Class A01;
    public final AbstractC910944l[] A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj != null && obj.getClass() == getClass()) {
                C62749SOz c62749SOz = (C62749SOz) obj;
                if (this.A00 == c62749SOz.A00 && this.A01 == c62749SOz.A01) {
                    AbstractC910944l[] abstractC910944lArr = c62749SOz.A02;
                    AbstractC910944l[] abstractC910944lArr2 = this.A02;
                    int length = abstractC910944lArr2.length;
                    if (length == abstractC910944lArr.length) {
                        for (int i = 0; i < length; i++) {
                            if (abstractC910944lArr2[i].equals(abstractC910944lArr[i])) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return AnonymousClass001.A0R(this.A01.getName(), "<>");
    }

    public C62749SOz(Class cls, AbstractC910944l[] abstractC910944lArr, int i) {
        this.A01 = cls;
        this.A02 = abstractC910944lArr;
        this.A00 = i;
    }
}
