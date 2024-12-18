package X;

import android.graphics.PathEffect;

/* renamed from: X.3ex, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C78313ex extends C2W1 {
    public C2XE A00;
    public C2WG A01;
    public int[] A02;
    public boolean[] A03;
    public final C2W1 A04;
    public final C2XU A05;

    @Override // X.C2W1
    public final void A0C(PathEffect pathEffect, float[] fArr, int[] iArr, int[] iArr2) {
        C14360o3.A0B(iArr2, 1);
        C14360o3.A0B(fArr, 2);
        int[] iArr3 = new int[4];
        System.arraycopy(iArr, 0, iArr3, 0, 4);
        System.arraycopy(iArr2, 0, this.A0w, 0, 4);
        System.arraycopy(fArr, 0, this.A0v, 0, 4);
        this.A09 = pathEffect;
        this.A02 = iArr3;
    }

    public C78313ex(C2XE c2xe, C2W1 c2w1, C2XU c2xu) {
        C2XU A00;
        this.A04 = c2w1;
        this.A00 = c2xe;
        if (c2xu == null) {
            A00 = null;
        } else {
            A00 = AbstractC170427iv.A00(c2xu);
        }
        this.A05 = A00;
    }

    @Override // X.C2W1
    public final /* bridge */ /* synthetic */ C2W3 A06(C78573fP c78573fP) {
        C2XE A05 = A05();
        C14360o3.A0B(A05, 1);
        return new C2W3(A05, this, c78573fP);
    }

    public C78313ex() {
        this(null, null, null);
    }
}
