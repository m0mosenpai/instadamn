package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Aee, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23705Aee implements InterfaceC59142nF {
    public final /* synthetic */ float A00;
    public final /* synthetic */ IgImageView A01;
    public final /* synthetic */ C6XY A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    public C23705Aee(IgImageView igImageView, C6XY c6xy, String str, float f, boolean z, boolean z2) {
        this.A02 = c6xy;
        this.A01 = igImageView;
        this.A00 = f;
        this.A05 = z;
        this.A04 = z2;
        this.A03 = str;
    }

    @Override // X.InterfaceC59142nF
    public final Bitmap renderImage(Bitmap bitmap) {
        Integer valueOf;
        int height;
        C14360o3.A0B(bitmap, 0);
        C6XY c6xy = this.A02;
        IgImageView igImageView = this.A01;
        if (AbstractC166987dD.A08(igImageView) / AbstractC166987dD.A07(igImageView) < bitmap.getHeight() / bitmap.getWidth()) {
            float A07 = AbstractC166987dD.A07(igImageView) / bitmap.getWidth();
            valueOf = Integer.valueOf(igImageView.getWidth());
            height = (int) (bitmap.getHeight() * A07);
        } else {
            valueOf = Integer.valueOf((int) (bitmap.getWidth() * (AbstractC166987dD.A08(igImageView) / bitmap.getHeight())));
            height = igImageView.getHeight();
        }
        Bitmap A00 = C0fK.A00(bitmap, valueOf.intValue(), Integer.valueOf(height).intValue(), false);
        C14360o3.A07(A00);
        float f = this.A00;
        boolean z = this.A05;
        boolean z2 = this.A04;
        Bitmap A0F = AbstractC167007dF.A0F(igImageView.getWidth(), igImageView.getHeight());
        Canvas canvas = new Canvas(A0F);
        Paint A0R = AbstractC166987dD.A0R();
        A0R.setAntiAlias(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        A0R.setShader(new BitmapShader(A00, tileMode, tileMode));
        float f2 = 0.0f;
        if (z) {
            f2 = f;
        }
        if (!z2) {
            f = 0.0f;
        }
        float[] fArr = {f2, f2, f2, f2};
        AbstractC167017dG.A1X(fArr, f);
        RectF A0Y = AbstractC166987dD.A0Y(AbstractC166987dD.A07(igImageView), AbstractC166987dD.A08(igImageView));
        Path A0T = AbstractC166987dD.A0T();
        A0T.addRoundRect(A0Y, fArr, Path.Direction.CW);
        canvas.drawPath(A0T, A0R);
        c6xy.A02.put(this.A03, A0F);
        return A0F;
    }
}
