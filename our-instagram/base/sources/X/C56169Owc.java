package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;

/* renamed from: X.Owc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56169Owc implements C3Se {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C56169Owc(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    @Override // X.C3Se
    public final void CzZ(Bitmap bitmap) {
        if (this.A00 != 0) {
            OEZ oez = (OEZ) this.A01;
            C19L c19l = oez.A01;
            if (c19l != null) {
                AbstractC166987dD.A1Z(new PZQ(bitmap, oez, this.A02, null, 18), c19l);
                return;
            }
            return;
        }
        C50741Mav c50741Mav = (C50741Mav) this.A01;
        String str = this.A02;
        C14360o3.A0A(bitmap);
        c50741Mav.A00 = str;
        Paint paint = c50741Mav.A02;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        c50741Mav.invalidateSelf();
    }
}
