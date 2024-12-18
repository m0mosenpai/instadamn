package X;

import java.util.Arrays;

/* renamed from: X.2WK, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2WK implements C2VB {
    public static final C23109AGx A03 = new Object();
    public final float[] A00 = new float[4];
    public final int[] A02 = new int[4];
    public final int[] A01 = new int[4];

    public final void A00(EnumC77763e0 enumC77763e0, int i) {
        A03.A02(enumC77763e0, this.A01, i);
    }

    public final void A01(EnumC77763e0 enumC77763e0, int i) {
        if (i >= 0) {
            A03.A02(enumC77763e0, this.A02, i);
            return;
        }
        throw new IllegalArgumentException(AnonymousClass001.A05(i, "Given negative border width value: ", " for edge ", "ALL"));
    }

    @Override // X.C2VB
    public final /* bridge */ /* synthetic */ boolean CTz(Object obj) {
        C2WK c2wk = (C2WK) obj;
        C14360o3.A0B(c2wk, 0);
        if (this == c2wk || (Arrays.equals(this.A00, c2wk.A00) && Arrays.equals(this.A02, c2wk.A02) && Arrays.equals(this.A01, c2wk.A01))) {
            return true;
        }
        return false;
    }
}
