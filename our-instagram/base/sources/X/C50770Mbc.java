package X;

import android.graphics.Bitmap;
import android.util.LruCache;

/* renamed from: X.Mbc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50770Mbc extends LruCache {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50770Mbc(OXC oxc, int i, int i2) {
        super(i);
        this.A00 = i2;
        this.A01 = oxc;
    }

    @Override // android.util.LruCache
    public final /* bridge */ /* synthetic */ int sizeOf(Object obj, Object obj2) {
        return ((Bitmap) obj2).getByteCount();
    }
}
