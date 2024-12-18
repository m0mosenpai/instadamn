package X;

import java.util.ArrayList;

/* renamed from: X.4jH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C102404jH {
    public ArrayList A00;
    public final C102404jH A01;
    public final Class A02;

    public final String toString() {
        String valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append("[ClassStack (self-refs: ");
        ArrayList arrayList = this.A00;
        if (arrayList == null) {
            valueOf = "0";
        } else {
            valueOf = String.valueOf(arrayList.size());
        }
        sb.append(valueOf);
        sb.append(')');
        C102404jH c102404jH = this;
        do {
            sb.append(' ');
            sb.append(c102404jH.A02.getName());
            c102404jH = c102404jH.A01;
        } while (c102404jH != null);
        sb.append(']');
        return sb.toString();
    }

    public C102404jH(C102404jH c102404jH, Class cls) {
        this.A01 = c102404jH;
        this.A02 = cls;
    }
}
