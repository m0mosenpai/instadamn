package X;

import java.util.Map;

/* renamed from: X.9gU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C215549gU extends AbstractC192138fE {
    public final C66246U5q A00;
    public final Map A01;
    public final C193028gi A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C215549gU(C66246U5q c66246U5q, C193028gi c193028gi, Map map) {
        super(c193028gi);
        C14360o3.A0B(map, 2);
        this.A00 = c66246U5q;
        this.A01 = map;
        this.A02 = c193028gi;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C215549gU) {
                C215549gU c215549gU = (C215549gU) obj;
                if (!C14360o3.A0K(this.A00, c215549gU.A00) || !C14360o3.A0K(this.A01, c215549gU.A01) || !C14360o3.A0K(this.A02, c215549gU.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A00)));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SuccessWithAction(action=");
        A1C.append(this.A00);
        A1C.append(", externalVariables=");
        A1C.append(this.A01);
        A1C.append(", fetchSummaryData=");
        return AbstractC167017dG.A0o(this.A02, A1C);
    }
}
