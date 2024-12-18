package X;

import android.graphics.Bitmap;
import android.graphics.Gainmap;
import android.os.Build;

/* renamed from: X.OwN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56156OwN implements InterfaceC80893jJ {
    public static final C56156OwN A00 = new Object();

    @Override // X.InterfaceC80893jJ
    public final void DiU(Bitmap bitmap) {
        if (bitmap != null && Build.VERSION.SDK_INT >= 34 && !bitmap.hasGainmap() && AbstractC167007dF.A1Z(AbstractC56872jL.A03)) {
            double random = Math.random();
            InterfaceC09390do interfaceC09390do = AbstractC56872jL.A00;
            boolean A1P = AbstractC25230BEn.A1P((random > MSZ.A03(interfaceC09390do) ? 1 : (random == MSZ.A03(interfaceC09390do) ? 0 : -1)));
            ((Number) interfaceC09390do.getValue()).floatValue();
            if (A1P) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth() / 4, bitmap.getHeight() / 4, Bitmap.Config.ALPHA_8);
                C14360o3.A07(createBitmap);
                bitmap.setGainmap(new Gainmap(createBitmap));
            }
        }
    }
}
