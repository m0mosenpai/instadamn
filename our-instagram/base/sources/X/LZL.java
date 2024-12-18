package X;

import android.graphics.Bitmap;

/* loaded from: classes8.dex */
public final class LZL implements InterfaceC66482zP {
    public final Bitmap A00;

    public LZL(Bitmap bitmap) {
        C14360o3.A0B(bitmap, 1);
        this.A00 = bitmap;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return AbstractC166997dE.A0u(this.A00);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
