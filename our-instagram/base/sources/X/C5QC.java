package X;

import android.util.SparseArray;
import java.io.IOException;

/* renamed from: X.5QC, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5QC {
    public static final C5QD A00(C16L c16l) {
        SparseArray sparseArray = new SparseArray();
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("failed to parse region tracking edits");
        }
        while (c16l.A1J() != C16R.A09) {
            String A1P = c16l.A1P();
            c16l.A1J();
            C14360o3.A0A(A1P);
            sparseArray.put(Integer.parseInt(A1P), C5NF.parseFromJson(c16l));
        }
        C5QD c5qd = new C5QD();
        c5qd.A00 = sparseArray;
        return c5qd;
    }

    public static final void A01(SparseArray sparseArray, AnonymousClass182 anonymousClass182) {
        anonymousClass182.A0d();
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            anonymousClass182.A0r(String.valueOf(sparseArray.keyAt(i)));
            C5NF.A00(anonymousClass182, (C5NG) sparseArray.valueAt(i));
        }
        anonymousClass182.A0a();
    }
}
