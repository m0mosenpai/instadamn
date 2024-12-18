package X;

import android.graphics.Color;

/* renamed from: X.68w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1349768w implements InterfaceC56512ik {
    public int A00;
    public C56502ij[] A01;

    public final int[] A00() {
        int i;
        C56502ij[] c56502ijArr;
        int[] iArr = new int[this.A01.length];
        int i2 = 0;
        while (true) {
            i = this.A00;
            c56502ijArr = this.A01;
            if (i2 >= i) {
                break;
            }
            C56502ij c56502ij = c56502ijArr[i2];
            iArr[i2] = Color.argb(c56502ij.A00, c56502ij.A03, c56502ij.A02, c56502ij.A01);
            i2++;
        }
        int length = c56502ijArr.length;
        if (length > i) {
            while (i < length) {
                iArr[i] = iArr[i - 1];
                i++;
            }
        }
        return iArr;
    }

    @Override // X.InterfaceC56512ik
    public final /* bridge */ /* synthetic */ Object COt(float f, Object obj, Object obj2) {
        C1349768w c1349768w = (C1349768w) obj;
        C1349768w c1349768w2 = (C1349768w) obj2;
        int i = this.A00;
        if (i == c1349768w.A00) {
            c1349768w2.A00 = i;
            for (int i2 = 0; i2 < this.A00; i2++) {
                this.A01[i2].A00(c1349768w.A01[i2], c1349768w2.A01[i2], f);
            }
            return c1349768w2;
        }
        throw new IllegalArgumentException("cannot interpolate between mismatched lengths");
    }
}
