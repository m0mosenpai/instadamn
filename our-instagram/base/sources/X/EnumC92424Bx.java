package X;

import android.util.SparseArray;

/* renamed from: X.4Bx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC92424Bx {
    NOT_CACHED(0, "NOT_CACHED"),
    CACHED(1, "CACHED"),
    SEMI_CACHED(2, "SEMI_CACHED"),
    NOT_APPLY(-1, "NOT_APPLY");

    public static final SparseArray A02 = new SparseArray();
    public final int A00;
    public final String A01;

    static {
        for (EnumC92424Bx enumC92424Bx : values()) {
            A02.put(enumC92424Bx.A00, enumC92424Bx);
        }
    }

    EnumC92424Bx(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }
}
