package X;

/* loaded from: classes9.dex */
public final class NIR extends AbstractC53448Nkb {
    public final Integer A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof NIR) && this.A00 == ((NIR) obj).A00);
    }

    public final int hashCode() {
        String str;
        int intValue = this.A00.intValue();
        switch (intValue) {
            case 1:
                str = "RESUME";
                break;
            case 2:
                str = "RESTART";
                break;
            default:
                str = "PAUSE";
                break;
        }
        return AbstractC25226BEj.A02(str, intValue);
    }

    public NIR(Integer num) {
        this.A00 = num;
    }
}
