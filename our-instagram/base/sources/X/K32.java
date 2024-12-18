package X;

/* loaded from: classes8.dex */
public final class K32 extends AbstractC46358Kfg {
    public final Integer A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof K32) && this.A00 == ((K32) obj).A00);
    }

    public final int hashCode() {
        String str;
        int intValue = this.A00.intValue();
        if (1 != intValue) {
            str = "NoGoogleDriveScope";
        } else {
            str = "AutoRetryOnFirstInternalError";
        }
        return AbstractC25226BEj.A02(str, intValue);
    }

    public K32(Integer num) {
        this.A00 = num;
    }
}
