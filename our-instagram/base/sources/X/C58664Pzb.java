package X;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: X.Pzb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58664Pzb {
    public final int A00;
    public final int A01;
    public final Py9 A02;
    public final List A03;

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C58664Pzb)) {
            return false;
        }
        C58664Pzb c58664Pzb = (C58664Pzb) obj;
        return c58664Pzb.A01 == this.A01 && c58664Pzb.A00 == this.A00 && c58664Pzb.A02 == this.A02 && AbstractC50102Ry.A00(c58664Pzb.A03, this.A03);
    }

    public final int hashCode() {
        return AbstractC58321PtD.A0C(Integer.valueOf(this.A01), Integer.valueOf(this.A00), this.A02, this.A03);
    }

    public final String toString() {
        return AbstractC58318PtA.A0o(Locale.ENGLISH, "start: %d, end: %d, formatter: %s, formatDelimiterRanges %s", Arrays.copyOf(new Object[]{Integer.valueOf(this.A01), Integer.valueOf(this.A00), this.A02, this.A03}, 4));
    }

    public C58664Pzb(Py9 py9, List list, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = py9;
        this.A03 = list;
    }
}
