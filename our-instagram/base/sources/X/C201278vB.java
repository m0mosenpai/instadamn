package X;

import android.opengl.Matrix;

/* renamed from: X.8vB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C201278vB {
    public static final float[] A06;
    public long A00;
    public AnonymousClass810 A01 = null;
    public float[] A02;
    public float[] A03;
    public float[] A04;
    public float[] A05;

    public C201278vB() {
        float[] fArr = A06;
        this.A04 = fArr;
        this.A05 = fArr;
        this.A03 = fArr;
    }

    public final void A01(AnonymousClass810 anonymousClass810, float[] fArr, long j) {
        A02(anonymousClass810, null, fArr, null, j);
    }

    public final void A02(AnonymousClass810 anonymousClass810, float[] fArr, float[] fArr2, float[] fArr3, long j) {
        A03(anonymousClass810, fArr, fArr2, fArr3, null, j);
    }

    static {
        float[] fArr = new float[16];
        A06 = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    public final AnonymousClass810 A00() {
        AnonymousClass810 anonymousClass810 = this.A01;
        if (anonymousClass810 != null) {
            return anonymousClass810;
        }
        throw new IllegalStateException("MutableVideoFrame not initialized, missing rgbTexture");
    }

    public final void A03(AnonymousClass810 anonymousClass810, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, long j) {
        this.A01 = anonymousClass810;
        if (fArr == null) {
            fArr = A06;
        }
        this.A04 = fArr;
        if (fArr2 == null) {
            fArr2 = A06;
        }
        this.A05 = fArr2;
        if (fArr3 == null) {
            fArr3 = A06;
        }
        this.A03 = fArr3;
        if (fArr4 == null) {
            fArr4 = A06;
        }
        this.A02 = fArr4;
        this.A00 = j;
    }

    public final boolean A05() {
        AnonymousClass810 anonymousClass810 = this.A01;
        if (anonymousClass810 != null && anonymousClass810.A01 == 36197) {
            return true;
        }
        return false;
    }

    public final void A04(C201278vB c201278vB) {
        A03(c201278vB.A00(), c201278vB.A04, c201278vB.A05, c201278vB.A03, c201278vB.A02, c201278vB.A00);
    }
}
