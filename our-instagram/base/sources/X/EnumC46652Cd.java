package X;

import android.util.SparseArray;

/* renamed from: X.2Cd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC46652Cd {
    UNKNOWN(0),
    GREEN(1),
    YELLOW(2),
    RED(3);

    public static final SparseArray A01 = new SparseArray();
    public final int A00;

    static {
        for (EnumC46652Cd enumC46652Cd : values()) {
            A01.put(enumC46652Cd.A00, enumC46652Cd);
        }
    }

    EnumC46652Cd(int i) {
        this.A00 = i;
    }
}
