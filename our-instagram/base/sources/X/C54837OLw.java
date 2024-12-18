package X;

import java.util.Arrays;

/* renamed from: X.OLw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54837OLw {
    public long A03 = -1;
    public long A00 = -1;
    public long A02 = -1;
    public long A01 = -1;
    public String A05 = "";
    public String A04 = "";

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C54837OLw c54837OLw = (C54837OLw) obj;
            if (this.A03 != c54837OLw.A03 || this.A00 != c54837OLw.A00 || this.A02 != c54837OLw.A02 || this.A01 != c54837OLw.A01 || !this.A05.equals(c54837OLw.A05) || !this.A04.equals(c54837OLw.A04)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.A03), Long.valueOf(this.A00), Long.valueOf(this.A02), Long.valueOf(this.A01), this.A05, this.A04});
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("startReadTimeUs:");
        A1C.append(this.A03);
        A1C.append("\nendReadTimeUs:");
        A1C.append(this.A00);
        A1C.append("\nframeBeforeStartReadTimeUs:");
        A1C.append(this.A02);
        A1C.append("\nframeAfterEndReadTimeUs:");
        A1C.append(this.A01);
        A1C.append("\ntrackInfoMap:");
        A1C.append(this.A05);
        A1C.append("\nexceptions:");
        return AbstractC166997dE.A0x(this.A04, A1C);
    }
}
