package X;

import java.util.Map;

/* renamed from: X.REx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60638REx extends AbstractC61581Rq5 {
    public final long A00;
    public final long A01;
    public final C62740SOg A02;
    public final Integer A03;
    public final String A04;
    public final Map A05;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof AbstractC61581Rq5)) {
                return false;
            }
            C60638REx c60638REx = (C60638REx) ((AbstractC61581Rq5) obj);
            if (this.A04.equals(c60638REx.A04)) {
                Integer num = this.A03;
                Integer num2 = c60638REx.A03;
                if (num == null) {
                    if (num2 != null) {
                        return false;
                    }
                } else if (!num.equals(num2)) {
                    return false;
                }
                if (!this.A02.equals(c60638REx.A02) || this.A00 != c60638REx.A00 || this.A01 != c60638REx.A01 || !this.A05.equals(c60638REx.A05)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = (((((this.A04.hashCode() ^ 1000003) * 1000003) ^ AbstractC167017dG.A0M(this.A03)) * 1000003) ^ this.A02.hashCode()) * 1000003;
        long j = this.A00;
        int i = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.A01;
        return ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.A05.hashCode();
    }

    public C60638REx(C62740SOg c62740SOg, Integer num, String str, Map map, long j, long j2) {
        this.A04 = str;
        this.A03 = num;
        this.A02 = c62740SOg;
        this.A00 = j;
        this.A01 = j2;
        this.A05 = map;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("EventInternal{transportName=");
        A1C.append(this.A04);
        A1C.append(", code=");
        A1C.append(this.A03);
        A1C.append(", encodedPayload=");
        A1C.append(this.A02);
        A1C.append(", eventMillis=");
        A1C.append(this.A00);
        A1C.append(", uptimeMillis=");
        A1C.append(this.A01);
        A1C.append(", autoMetadata=");
        return JQ0.A0l(this.A05, A1C);
    }
}
