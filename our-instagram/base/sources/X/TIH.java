package X;

import java.io.Serializable;

/* loaded from: classes10.dex */
public final class TIH implements Serializable {
    public C45K A00;
    public C45K A01;
    public final Boolean A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final transient C62495SDx A06;
    public static final TIH A08 = new TIH(null, null, null, Boolean.TRUE, null, null, null);
    public static final TIH A07 = new TIH(null, null, null, Boolean.FALSE, null, null, null);
    public static final TIH A09 = new TIH(null, null, null, null, null, null, null);

    public static TIH A00(Boolean bool, Integer num, String str, String str2) {
        if (str == null && num == null && str2 == null) {
            if (bool == null) {
                return A09;
            }
            if (bool.booleanValue()) {
                return A08;
            }
            return A07;
        }
        return new TIH(null, null, null, bool, num, str, str2);
    }

    public final TIH A01(C62495SDx c62495SDx) {
        Boolean bool = this.A02;
        String str = this.A05;
        return new TIH(this.A01, this.A00, c62495SDx, bool, this.A03, str, this.A04);
    }

    public TIH(C45K c45k, C45K c45k2, C62495SDx c62495SDx, Boolean bool, Integer num, String str, String str2) {
        this.A02 = bool;
        this.A05 = str;
        this.A03 = num;
        this.A04 = (str2 == null || str2.isEmpty()) ? null : str2;
        this.A06 = c62495SDx;
        this.A01 = c45k;
        this.A00 = c45k2;
    }
}
