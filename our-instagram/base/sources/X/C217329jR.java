package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.blur.BlurUtil;

/* renamed from: X.9jR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C217329jR extends AbstractRunnableC14200nk {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ DisplayMetrics A03;
    public final /* synthetic */ ImageUrl A04;
    public final /* synthetic */ XCU A05;
    public final /* synthetic */ String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C217329jR(DisplayMetrics displayMetrics, ImageUrl imageUrl, XCU xcu, String str, int i, int i2, int i3) {
        super(659747612, 1, false, true);
        this.A03 = displayMetrics;
        this.A04 = imageUrl;
        this.A00 = i;
        this.A01 = i2;
        this.A06 = str;
        this.A05 = xcu;
        this.A02 = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap A0F;
        DisplayMetrics displayMetrics = this.A03;
        int i = displayMetrics.widthPixels / 4;
        int i2 = displayMetrics.heightPixels / 4;
        Bitmap A0H = C25821No.A00().A0H(this.A04, "MediaBackgroundGenerator");
        if (A0H != null) {
            A0F = C1NC.A09(A0H, i, i2, 0, false);
            BlurUtil.blurInPlace(A0F, this.A00);
            Canvas canvas = new Canvas(A0F);
            Paint A0R = AbstractC166987dD.A0R();
            A0R.setColor(this.A02);
            A0R.setAlpha(51);
            canvas.drawPaint(A0R);
        } else {
            int i3 = this.A01;
            A0F = AbstractC167007dF.A0F(i, i2);
            new Canvas(A0F).drawColor(i3);
        }
        AbstractC70197WGf.A08(A0F, this.A05, AbstractC70197WGf.A03(this.A06));
    }
}
