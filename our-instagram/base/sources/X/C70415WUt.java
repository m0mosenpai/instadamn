package X;

import android.graphics.Bitmap;

/* renamed from: X.WUt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70415WUt implements C1VS {
    public final /* synthetic */ Vh1 A00;

    public C70415WUt(Vh1 vh1) {
        this.A00 = vh1;
    }

    @Override // X.C1VS
    public final /* bridge */ /* synthetic */ void EE3(Object obj) {
        int byteCount;
        Bitmap bitmap = (Bitmap) obj;
        try {
            Vh1 vh1 = this.A00;
            synchronized (vh1) {
                if (bitmap == null) {
                    byteCount = 0;
                } else {
                    try {
                        byteCount = bitmap.getAllocationByteCount();
                    } catch (NullPointerException unused) {
                        byteCount = bitmap.getByteCount();
                    }
                }
                C0Hf.A02(AbstractC167007dF.A1O(vh1.A00), "No bitmaps registered.");
                long j = byteCount;
                long j2 = vh1.A01;
                C0Hf.A03(new Object[]{Integer.valueOf(byteCount), Long.valueOf(j2)}, AbstractC31175DnJ.A1S((j > j2 ? 1 : (j == j2 ? 0 : -1))));
                vh1.A01 -= j;
                vh1.A00--;
            }
        } finally {
            bitmap.recycle();
        }
    }
}
