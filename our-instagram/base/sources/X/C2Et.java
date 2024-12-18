package X;

import java.util.Arrays;

/* renamed from: X.2Et, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2Et {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;

    public final void A00(C2Et c2Et) {
        C14360o3.A0B(c2Et, 0);
        this.A09 = c2Et.A09;
        this.A08 = c2Et.A08;
        this.A00 = c2Et.A00;
        this.A06 = c2Et.A06;
        this.A04 = c2Et.A04;
        this.A01 = c2Et.A01;
        this.A07 = c2Et.A07;
        this.A05 = c2Et.A05;
        this.A03 = c2Et.A03;
        this.A02 = c2Et.A02;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C14360o3.A0K(getClass(), obj.getClass())) {
                return false;
            }
            C2Et c2Et = (C2Et) obj;
            if (this.A09 != c2Et.A09 || this.A08 != c2Et.A08 || this.A00 != c2Et.A00 || this.A06 != c2Et.A06 || this.A04 != c2Et.A04 || this.A01 != c2Et.A01 || this.A07 != c2Et.A07 || this.A05 != c2Et.A05 || this.A03 != c2Et.A03 || this.A02 != c2Et.A02) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.A09), Boolean.valueOf(this.A08), Integer.valueOf(this.A00), Long.valueOf(this.A06), Long.valueOf(this.A04), Integer.valueOf(this.A01), Boolean.valueOf(this.A07), Long.valueOf(this.A05), Long.valueOf(this.A03), Long.valueOf(this.A02)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("State{isUserInitialized=");
        sb.append(this.A09);
        sb.append(", isPerfLoggerStarted=");
        sb.append(this.A08);
        sb.append(", appStartupType=");
        sb.append(this.A00);
        sb.append(", startupTimestampMs=");
        sb.append(this.A06);
        sb.append(", irisSequenceId=");
        sb.append(this.A04);
        sb.append(", irisSequenceIdSource=");
        sb.append(this.A01);
        sb.append(", isIrisSubscribed=");
        sb.append(this.A07);
        sb.append(", latestIrisSeqIdOnSubscribe=");
        sb.append(this.A05);
        sb.append(", irisSeqIdOnSubscribe=");
        sb.append(this.A03);
        sb.append(", irisSeqIdOnMarkerStart=");
        sb.append(this.A02);
        sb.append('}');
        return sb.toString();
    }
}
