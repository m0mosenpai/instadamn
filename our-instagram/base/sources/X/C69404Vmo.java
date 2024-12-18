package X;

import android.util.SparseIntArray;
import com.facebook.common.dextricks.Constants;

/* renamed from: X.Vmo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69404Vmo {
    public final C1KI A00;
    public final Vh3 A01;
    public final Vh3 A02;
    public final Vh3 A03;
    public final XF3 A04;
    public final XF3 A05;
    public final Vh3 A06;
    public final XF3 A07;

    /* JADX WARN: Type inference failed for: r0v31, types: [X.WUp, java.lang.Object] */
    public C69404Vmo() {
        int i;
        C70412WUp c70412WUp;
        int i2;
        int i3;
        C1VI.A00();
        SparseIntArray sparseIntArray = VY8.A00;
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min > 16777216) {
            i = (min / 4) * 3;
        } else {
            i = min / 2;
        }
        this.A06 = new Vh3(VY8.A00, 0, i, -1);
        this.A07 = WWP.A00();
        int i4 = VY9.A00;
        int i5 = i4 * 4194304;
        int i6 = Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        do {
            sparseIntArray2.put(i6, i4);
            i6 *= 2;
        } while (i6 <= 4194304);
        this.A01 = new Vh3(sparseIntArray2, 4194304, i5, i4);
        synchronized (C70412WUp.class) {
            C70412WUp c70412WUp2 = C70412WUp.A00;
            c70412WUp = c70412WUp2;
            if (c70412WUp2 == null) {
                ?? obj = new Object();
                C70412WUp.A00 = obj;
                c70412WUp = obj;
            }
        }
        this.A00 = c70412WUp;
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        sparseIntArray3.put(1024, 5);
        sparseIntArray3.put(C3OO.FLAG_MOVED, 5);
        sparseIntArray3.put(4096, 5);
        sparseIntArray3.put(8192, 5);
        sparseIntArray3.put(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET, 5);
        sparseIntArray3.put(Constants.LOAD_RESULT_PGO, 5);
        sparseIntArray3.put(Constants.LOAD_RESULT_PGO_ATTEMPTED, 5);
        sparseIntArray3.put(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP, 5);
        sparseIntArray3.put(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED, 2);
        sparseIntArray3.put(Constants.LOAD_RESULT_WITH_VDEX_ODEX, 2);
        sparseIntArray3.put(1048576, 2);
        int min2 = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min2 < 16777216) {
            i2 = 3145728;
        } else {
            i2 = 12582912;
            if (min2 < 33554432) {
                i2 = 6291456;
            }
        }
        int min3 = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min3 < 16777216) {
            i3 = min3 / 2;
        } else {
            i3 = (min3 / 4) * 3;
        }
        this.A02 = new Vh3(sparseIntArray3, i2, i3, -1);
        this.A04 = WWP.A00();
        SparseIntArray sparseIntArray4 = new SparseIntArray();
        sparseIntArray4.put(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET, 5);
        this.A03 = new Vh3(sparseIntArray4, 81920, 1048576, -1);
        this.A05 = WWP.A00();
        C1VI.A00();
    }
}
