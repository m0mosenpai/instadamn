package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: X.AeW, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23697AeW implements C3Se {
    public final int A00;
    public final Object A01;

    public C23697AeW(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [android.graphics.drawable.Drawable] */
    @Override // X.C3Se
    public final void CzZ(Bitmap bitmap) {
        C9SH c9sh;
        switch (this.A00) {
            case 4:
                break;
            case 5:
                C9SH c9sh2 = (C9SH) this.A01;
                Paint A0R = AbstractC166987dD.A0R();
                A0R.setAntiAlias(true);
                A0R.setDither(true);
                A0R.setFilterBitmap(true);
                A0R.setAlpha(63);
                AbstractC166997dE.A1D(A0R, PorterDuff.Mode.OVERLAY);
                int i = c9sh2.A0B;
                Bitmap A00 = C0fK.A00(bitmap, i, i, true);
                Shader.TileMode tileMode = Shader.TileMode.MIRROR;
                A0R.setShader(new BitmapShader(A00, tileMode, tileMode));
                c9sh2.A02 = A0R;
                c9sh = c9sh2;
                c9sh.invalidateSelf();
            default:
                if (bitmap == null) {
                    return;
                }
                break;
        }
        c9sh = (Drawable) this.A01;
        c9sh.invalidateSelf();
    }
}
