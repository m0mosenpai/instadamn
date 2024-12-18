package X;

import java.util.Map;

/* renamed from: X.L9l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47803L9l {
    public final long A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final Map A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47803L9l) {
                C47803L9l c47803L9l = (C47803L9l) obj;
                if (!C14360o3.A0K(this.A03, c47803L9l.A03) || !C14360o3.A0K(this.A02, c47803L9l.A02) || !C14360o3.A0K(this.A04, c47803L9l.A04) || this.A01 != c47803L9l.A01 || this.A00 != c47803L9l.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A07 = AbstractC167007dF.A07(this.A01, AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0J(this.A03))));
        long j = this.A00;
        return A07 + ((int) (j ^ (j >>> 32)));
    }

    public /* synthetic */ C47803L9l(String str, Map map, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        long nanoTime = System.nanoTime();
        this.A03 = str;
        this.A02 = str2;
        this.A04 = map;
        this.A01 = currentTimeMillis;
        this.A00 = nanoTime;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("EventData(type=");
        A1C.append(this.A03);
        A1C.append(", renderStateId=");
        A1C.append(this.A02);
        A1C.append(", attributes=");
        A1C.append(this.A04);
        A1C.append(", timestamp=");
        A1C.append(this.A01);
        A1C.append(", startTime=");
        A1C.append(this.A00);
        return AbstractC167017dG.A0p(A1C);
    }
}
