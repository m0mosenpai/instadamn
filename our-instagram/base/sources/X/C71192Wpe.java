package X;

import java.util.Arrays;

/* renamed from: X.Wpe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71192Wpe implements Comparable {
    public final double A00;
    public final double A01;
    public final double A02;
    public final float[] A03 = new float[1];

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Double.compare(((C71192Wpe) obj).A02, this.A02);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C71192Wpe)) {
            return false;
        }
        C71192Wpe c71192Wpe = (C71192Wpe) obj;
        if (c71192Wpe.A00 != this.A00 || c71192Wpe.A01 != this.A01 || c71192Wpe.A02 != this.A02) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.A00), Double.valueOf(this.A01), Double.valueOf(this.A02)});
    }

    public C71192Wpe(double d, double d2, double d3) {
        this.A00 = d;
        this.A01 = d2;
        this.A02 = d3;
    }
}
