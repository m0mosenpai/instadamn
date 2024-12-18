package X;

/* renamed from: X.1Wh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC27791Wh {
    public final C1X2 A00;
    public final C1X3 A01;
    public final String A02;

    public int hashCode() {
        int i;
        int i2;
        C1X2 c1x2 = this.A00;
        int i3 = 0;
        if (c1x2 != null) {
            i = c1x2.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        C1X3 c1x3 = this.A01;
        if (c1x3 != null) {
            i2 = c1x3.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str = this.A02;
        if (str != null) {
            i3 = str.hashCode();
        }
        return i5 + i3;
    }

    public AbstractC27791Wh(AbstractC27821Wk abstractC27821Wk) {
        this.A00 = abstractC27821Wk.A00;
        C1X3 c1x3 = abstractC27821Wk.A01;
        this.A01 = c1x3;
        String str = abstractC27821Wk.A02;
        this.A02 = str;
        if (c1x3 == C1X3.DYNAMIC) {
            if (str == null) {
                throw new C50097M9l("Disk cache id must be set for dynamic cache choice");
            }
        } else if (str != null && str.length() != 0) {
            throw new C50097M9l("Ensure that if you want to use a disk cache id, you set the CacheChoice to DYNAMIC");
        }
    }
}
