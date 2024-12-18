package X;

/* loaded from: classes5.dex */
public final class CV6 {
    public final Integer A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof CV6) && this.A00 == ((CV6) obj).A00);
    }

    public final int hashCode() {
        String str;
        int intValue = this.A00.intValue();
        switch (intValue) {
            case 0:
                str = "FACEBOOK";
                break;
            case 1:
                str = "INSTAGRAM";
                break;
            default:
                str = "THREADS";
                break;
        }
        return AbstractC25226BEj.A02(str, intValue);
    }

    public final String toString() {
        String str;
        switch (this.A00.intValue()) {
            case 0:
                str = "FACEBOOK";
                break;
            case 1:
                str = "INSTAGRAM";
                break;
            default:
                str = "THREADS";
                break;
        }
        return AbstractC25235BEs.A0r("CdsAppGlyphProfilePhotoBadgeAddOn(glyphName=", str);
    }

    public CV6(Integer num) {
        this.A00 = num;
    }
}
