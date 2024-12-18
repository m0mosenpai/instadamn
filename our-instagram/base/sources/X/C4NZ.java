package X;

import java.util.List;

/* renamed from: X.4NZ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4NZ {
    public String A00;
    public List A01;
    public List A02;

    public final String toString() {
        String str;
        List list = this.A01;
        String str2 = null;
        if (list != null) {
            str = AbstractC001800i.A0P(": ", "", "", list, null);
        } else {
            str = null;
        }
        List list2 = this.A02;
        if (list2 != null) {
            str2 = AbstractC001800i.A0P(":", "", "", list2, null);
        }
        return AnonymousClass001.A13("{ QPClause : clause_type: ", this.A00, ", clauses : ", str, ", filters : ", str2);
    }
}
