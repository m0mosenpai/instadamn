package X;

/* renamed from: X.JuQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44912JuQ extends AbstractC53426NkF {
    public final Integer A00;
    public final Exception A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C44912JuQ) {
                C44912JuQ c44912JuQ = (C44912JuQ) obj;
                if (this.A00 != c44912JuQ.A00 || !C14360o3.A0K(this.A01, c44912JuQ.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int intValue = this.A00.intValue();
        if (1 != intValue) {
            str = "CAPTURE_VIEW";
        } else {
            str = "OUTPUT_VALIDATION";
        }
        return AbstractC166987dD.A0I(this.A01, AbstractC25228BEl.A0F(str, intValue));
    }

    public C44912JuQ(Exception exc, Integer num) {
        this.A00 = num;
        this.A01 = exc;
    }
}
