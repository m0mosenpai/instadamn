package X;

import android.graphics.Bitmap;
import android.util.LruCache;

/* renamed from: X.8Bd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C183308Bd extends LruCache {
    @Override // android.util.LruCache
    public final /* bridge */ /* synthetic */ int sizeOf(Object obj, Object obj2) {
        Bitmap bitmap = (Bitmap) obj2;
        C14360o3.A0B(bitmap, 1);
        return bitmap.getByteCount();
    }
}
