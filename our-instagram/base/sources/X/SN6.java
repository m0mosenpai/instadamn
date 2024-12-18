package X;

/* loaded from: classes10.dex */
public final class SN6 {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof SN6);
    }

    public final int hashCode() {
        int A03 = AbstractC25228BEl.A03(-9223372036854775807L);
        int i = ((((A03 * 31) + A03) * 31) + A03) * 31;
        int floatToIntBits = Float.floatToIntBits(-3.4028235E38f);
        return ((i + floatToIntBits) * 31) + floatToIntBits;
    }
}
