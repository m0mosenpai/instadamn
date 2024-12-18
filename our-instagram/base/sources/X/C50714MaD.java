package X;

import android.graphics.Bitmap;
import android.util.LruCache;

/* renamed from: X.MaD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50714MaD extends LruCache {
    @Override // android.util.LruCache
    public final /* bridge */ /* synthetic */ int sizeOf(Object obj, Object obj2) {
        AbstractC25225BEi.A1R(obj);
        Bitmap bitmap = (Bitmap) obj2;
        C14360o3.A0B(bitmap, 1);
        return bitmap.getByteCount();
    }

    public C50714MaD(int i) {
        super(i);
    }
}
