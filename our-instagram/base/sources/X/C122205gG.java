package X;

import java.util.ArrayList;

/* renamed from: X.5gG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122205gG {
    public final int A00;
    public static final C122205gG A02 = new C122205gG(0);
    public static final C122205gG A03 = new C122205gG(1);
    public static final C122205gG A01 = new C122205gG(2);

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C122205gG) && this.A00 == ((C122205gG) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        StringBuilder sb;
        int i = this.A00;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            sb = new StringBuilder();
            sb.append("TextDecoration.");
            sb.append((String) arrayList.get(0));
        } else {
            sb = new StringBuilder();
            sb.append("TextDecoration[");
            sb.append(AbstractC121615fC.A00(", ", arrayList));
            sb.append(']');
        }
        return sb.toString();
    }

    public C122205gG(int i) {
        this.A00 = i;
    }
}
