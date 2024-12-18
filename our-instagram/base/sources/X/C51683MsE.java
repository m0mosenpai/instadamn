package X;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: X.MsE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51683MsE extends C0T6 {
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final double[] A03;
    public final int A04;
    public final boolean A05;
    public final Bitmap[] A06;
    public final WeakReference[] A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51683MsE) {
                C51683MsE c51683MsE = (C51683MsE) obj;
                if (this.A04 != c51683MsE.A04 || this.A01 != c51683MsE.A01 || this.A00 != c51683MsE.A00 || !C14360o3.A0K(this.A03, c51683MsE.A03) || this.A05 != c51683MsE.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public final void A00(int i, Bitmap bitmap) {
        WeakReference[] weakReferenceArr = this.A07;
        if (weakReferenceArr != null && weakReferenceArr.length > i) {
            weakReferenceArr[i] = AbstractC25225BEi.A16(bitmap);
        } else {
            if (A01().length <= i) {
                return;
            }
            A01()[i] = bitmap;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Bitmap[] A01() {
        WeakReference[] weakReferenceArr = this.A07;
        if (weakReferenceArr != null) {
            int length = weakReferenceArr.length;
            Bitmap[] bitmapArr = new Bitmap[length];
            for (int i = 0; i < length; i++) {
                bitmapArr[i] = weakReferenceArr[i].get();
            }
            return bitmapArr;
        }
        return this.A06;
    }

    public final int hashCode() {
        int hashCode;
        int i = ((((this.A04 * 31) + this.A01) * 31) + this.A00) * 31;
        double[] dArr = this.A03;
        if (dArr == null) {
            hashCode = 0;
        } else {
            hashCode = Arrays.hashCode(dArr);
        }
        return AbstractC166987dD.A0K(this.A05, (i + hashCode) * 31);
    }

    public C51683MsE(double[] dArr, int i, int i2, int i3, boolean z) {
        WeakReference[] weakReferenceArr;
        this.A04 = i;
        this.A01 = i2;
        this.A00 = i3;
        this.A03 = dArr;
        this.A05 = z;
        Bitmap[] bitmapArr = new Bitmap[i];
        int i4 = 0;
        while (true) {
            weakReferenceArr = null;
            if (i4 >= i) {
                break;
            }
            bitmapArr[i4] = null;
            i4++;
        }
        this.A06 = bitmapArr;
        if (z) {
            WeakReference[] weakReferenceArr2 = new WeakReference[i];
            for (int i5 = 0; i5 < i; i5++) {
                weakReferenceArr2[i5] = AbstractC25225BEi.A16(null);
            }
            weakReferenceArr = weakReferenceArr2;
        }
        this.A07 = weakReferenceArr;
        this.A02 = this.A03 != null;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("GeneratedVideoTimelineBitmaps(numOfThumbnails=");
        A1C.append(this.A04);
        A1C.append(", targetWidth=");
        A1C.append(this.A01);
        A1C.append(", targetHeight=");
        A1C.append(this.A00);
        A1C.append(", thumbnailFrameScales=");
        A1C.append(Arrays.toString(this.A03));
        A1C.append(", isWeakRef=");
        return AbstractC25236BEt.A0a(A1C, this.A05);
    }
}
