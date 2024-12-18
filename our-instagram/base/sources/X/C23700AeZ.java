package X;

import android.graphics.Bitmap;

/* renamed from: X.AeZ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23700AeZ implements C3Se {
    public final /* synthetic */ C6XY A00;
    public final /* synthetic */ C28186CbZ A01;

    public C23700AeZ(C6XY c6xy, C28186CbZ c28186CbZ) {
        this.A01 = c28186CbZ;
        this.A00 = c6xy;
    }

    @Override // X.C3Se
    public final void CzZ(Bitmap bitmap) {
        this.A01.A02.setImageBitmap(bitmap);
        this.A00.A00.A01();
    }
}
