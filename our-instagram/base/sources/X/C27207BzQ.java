package X;

/* renamed from: X.BzQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27207BzQ extends AbstractC27436C9e {
    public final int A00;
    public final int A01;
    public final Integer A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27207BzQ) {
                C27207BzQ c27207BzQ = (C27207BzQ) obj;
                if (this.A01 != c27207BzQ.A01 || this.A02 != c27207BzQ.A02 || this.A00 != c27207BzQ.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int i = this.A01 * 31;
        int intValue = this.A02.intValue();
        switch (intValue) {
            case 1:
                str = "PHOTO_BUTTON";
                break;
            case 2:
                str = "IMAGINE_BUTTON";
                break;
            default:
                str = "ADD_BUTTON";
                break;
        }
        return AbstractC25231BEo.A0H(str, intValue, i) + this.A00;
    }

    public C27207BzQ(Integer num, int i, int i2) {
        this.A01 = i;
        this.A02 = num;
        this.A00 = i2;
    }
}
