package X;

import java.util.List;

/* renamed from: X.8dW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C191278dW extends AbstractC191288dX {
    public final long A00;
    public final C191258dU A01;
    public final Integer A02;
    public final String A03;
    public final List A04;
    public final boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C191278dW(C191258dU c191258dU, Integer num, String str, List list, long j, boolean z) {
        super(c191258dU);
        C14360o3.A0B(c191258dU, 2);
        this.A03 = str;
        this.A01 = c191258dU;
        this.A04 = list;
        this.A00 = j;
        this.A05 = z;
        this.A02 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C191278dW) {
                C191278dW c191278dW = (C191278dW) obj;
                if (!C14360o3.A0K(this.A03, c191278dW.A03) || !C14360o3.A0K(this.A01, c191278dW.A01) || !C14360o3.A0K(this.A04, c191278dW.A04) || this.A00 != c191278dW.A00 || this.A05 != c191278dW.A05 || !C14360o3.A0K(this.A02, c191278dW.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.A03;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode2 = ((((hashCode * 31) + this.A01.hashCode()) * 31) + this.A04.hashCode()) * 31;
        long j = this.A00;
        int i2 = (((hashCode2 + ((int) (j ^ (j >>> 32)))) * 31) + 1231) * 31;
        int i3 = 1237;
        if (this.A05) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        Integer num = this.A02;
        if (num != null) {
            i = num.hashCode();
        }
        return i4 + i;
    }
}
