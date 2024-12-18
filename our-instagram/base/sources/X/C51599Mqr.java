package X;

/* renamed from: X.Mqr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51599Mqr extends C0T6 {
    public final int A00;
    public final long A01;
    public final Integer A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51599Mqr) {
                C51599Mqr c51599Mqr = (C51599Mqr) obj;
                if (this.A02 != c51599Mqr.A02 || this.A00 != c51599Mqr.A00 || this.A01 != c51599Mqr.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int intValue = this.A02.intValue();
        if (1 != intValue) {
            str = "DAYS";
        } else {
            str = "WEEKS";
        }
        return ((AbstractC25228BEl.A0F(str, intValue) + this.A00) * 31) + AbstractC25228BEl.A03(this.A01);
    }

    public C51599Mqr(Integer num, int i, long j) {
        this.A02 = num;
        this.A00 = i;
        this.A01 = j;
    }
}
