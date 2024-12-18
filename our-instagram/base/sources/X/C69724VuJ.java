package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.VuJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69724VuJ {
    public double A00;
    public double A01;
    public double A02;
    public double A03;
    public double A04;
    public double A05;
    public long A06;
    public List A07;
    public List A08;
    public boolean A09;
    public boolean A0A;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C69724VuJ)) {
            return false;
        }
        return AbstractC50102Ry.A00(Long.valueOf(this.A06), Long.valueOf(((C69724VuJ) obj).A06));
    }

    public final int hashCode() {
        return Arrays.hashCode(AbstractC58319PtB.A1Y(this.A06));
    }
}
