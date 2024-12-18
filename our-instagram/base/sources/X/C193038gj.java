package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.8gj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C193038gj extends AbstractC192138fE {
    public final C1338462s A00;
    public final C193028gi A01;
    public final List A02;
    public final Map A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C193038gj(C1338462s c1338462s, C193028gi c193028gi) {
        super(c193028gi);
        C16930sl c16930sl = C16930sl.A00;
        C16920sk A0E = AbstractC06930Yk.A0E();
        C14360o3.A0B(c16930sl, 2);
        C14360o3.A0B(A0E, 3);
        this.A00 = c1338462s;
        this.A02 = c16930sl;
        this.A03 = A0E;
        this.A01 = c193028gi;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193038gj) {
                C193038gj c193038gj = (C193038gj) obj;
                if (!C14360o3.A0K(this.A00, c193038gj.A00) || !C14360o3.A0K(this.A02, c193038gj.A02) || !C14360o3.A0K(this.A03, c193038gj.A03) || !C14360o3.A0K(this.A01, c193038gj.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.A00.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC43591JPw.A00(121));
        sb.append(this.A00);
        sb.append(", actions=");
        sb.append(this.A02);
        sb.append(", externalVariables=");
        sb.append(this.A03);
        sb.append(", fetchSummaryData=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }
}
