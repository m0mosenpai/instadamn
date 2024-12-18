package X;

import android.text.Editable;

/* renamed from: X.Scq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63090Scq {
    public static final C63090Scq A00 = new Object();

    public static final void A00(Editable editable, String str, int i, int i2) {
        while (i < i2 && AbstractC58319PtB.A1T(editable, i)) {
            i++;
        }
        while (i2 > i && AbstractC58319PtB.A1T(editable, i2 - 1)) {
            i2--;
        }
        if (i != i2) {
            int length = editable.length();
            int i3 = i;
            for (int i4 = i2 - 1; i3 >= 0 && i4 < length && (!AbstractC58319PtB.A1T(editable, i3) || !AbstractC58319PtB.A1T(editable, i4)); i4++) {
                if (str.equals(Character.toString(editable.charAt(i3))) && str.equals(Character.toString(editable.charAt(i4)))) {
                    editable.delete(i3, i3 + 1);
                    editable.delete(i4 - 1, i4);
                    return;
                }
                i3--;
            }
            editable.insert(i, str);
            editable.insert(i2 + 1, str);
        }
    }
}
