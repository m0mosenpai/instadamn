package X;

import java.util.List;

/* loaded from: classes10.dex */
public final class QIq extends C0T6 {
    public final List A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof QIq) {
                QIq qIq = (QIq) obj;
                if (!C14360o3.A0K(this.A00, qIq.A00) || this.A01 != qIq.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0G = AbstractC166987dD.A0G(this.A00);
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return A0G + i;
    }

    public QIq(List list, boolean z) {
        this.A00 = list;
        this.A01 = z;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("detections: ");
        A1C.append(this.A00);
        A1C.append(" isPaymentAutofillWithValidCreditCardDetected: ");
        A1C.append(this.A01);
        return A1C.toString();
    }
}
