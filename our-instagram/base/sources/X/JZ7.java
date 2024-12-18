package X;

import android.util.SparseArray;

/* loaded from: classes8.dex */
public enum JZ7 {
    NORTH(0),
    SOUTH(1);

    public static final SparseArray A01 = new SparseArray();
    public final int A00;

    static {
        for (JZ7 jz7 : values()) {
            A01.put(jz7.A00, jz7);
        }
    }

    JZ7(int i) {
        this.A00 = i;
    }
}
