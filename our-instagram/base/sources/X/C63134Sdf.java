package X;

import java.util.List;

/* renamed from: X.Sdf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63134Sdf {
    public final float[] A00;
    public final int[] A01;

    public C63134Sdf(List list, List list2) {
        int size = list.size();
        this.A01 = new int[size];
        this.A00 = new float[size];
        for (int i = 0; i < size; i++) {
            this.A01[i] = AbstractC31176DnK.A01(list, i);
            this.A00[i] = AbstractC167007dF.A04(list2, i);
        }
    }

    public C63134Sdf(int i, int i2, int i3) {
        this.A01 = new int[]{i, i2, i3};
        this.A00 = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C63134Sdf(int i, int i2) {
        this.A01 = new int[]{i, i2};
        this.A00 = new float[]{0.0f, 1.0f};
    }
}
