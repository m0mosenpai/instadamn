package X;

/* renamed from: X.SaI, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62994SaI {
    public static final Class[] A02 = new Class[0];
    public final String A00;
    public final Class[] A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj != null && obj.getClass() == getClass()) {
                C62994SaI c62994SaI = (C62994SaI) obj;
                if (this.A00.equals(c62994SaI.A00)) {
                    Class[] clsArr = c62994SaI.A01;
                    Class[] clsArr2 = this.A01;
                    int length = clsArr2.length;
                    if (clsArr.length == length) {
                        for (int i = 0; i < length; i++) {
                            if (clsArr[i] == clsArr2[i]) {
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
        return this.A00.hashCode() + this.A01.length;
    }

    public final String toString() {
        return AnonymousClass001.A06(this.A01.length, this.A00, "(", "-args)");
    }

    public C62994SaI(String str, Class[] clsArr) {
        this.A00 = str;
        this.A01 = clsArr == null ? A02 : clsArr;
    }
}
