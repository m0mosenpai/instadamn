package X;

import android.graphics.Bitmap;

/* renamed from: X.1Vw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C27681Vw extends AbstractC27691Vx {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.VMS, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.WUs, java.lang.Object] */
    @Override // X.AbstractC27691Vx
    public final C1VO A00(Bitmap.Config config, int i, int i2) {
        C14360o3.A0B(config, 2);
        C68677VaD c68677VaD = new C68677VaD(new Object());
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        C70414WUs c70414WUs = C70414WUs.A00;
        C70414WUs c70414WUs2 = c70414WUs;
        if (c70414WUs == null) {
            ?? obj = new Object();
            C70414WUs.A00 = obj;
            c70414WUs2 = obj;
        }
        C1VO A00 = C1VO.A00(c68677VaD.A00, c70414WUs2, createBitmap);
        C14360o3.A07(A00);
        return A00;
    }
}
