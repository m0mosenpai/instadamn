package X;

/* loaded from: classes12.dex */
public final class Y10 {
    public static final Y10 A05 = new Y10();
    public final YDO A04 = new YDO();
    public final YDP A02 = new YDP();
    public final YDP A01 = new YDP();
    public final Y0q A00 = Y0q.A01;
    public final YDP A03 = new YDP();

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Y10)) {
            return false;
        }
        Y10 y10 = (Y10) obj;
        return this.A04.equals(y10.A04) && this.A02.equals(y10.A02) && this.A01.equals(y10.A01) && this.A00.equals(y10.A00) && this.A03.equals(y10.A03);
    }
}
