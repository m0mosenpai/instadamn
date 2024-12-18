package X;

import android.graphics.Bitmap;

/* renamed from: X.WUu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70416WUu implements C1VS {
    public final int A00;

    public C70416WUu(int i) {
        this.A00 = i;
    }

    @Override // X.C1VS
    public final void EE3(Object obj) {
        ((Bitmap) obj).recycle();
    }
}
