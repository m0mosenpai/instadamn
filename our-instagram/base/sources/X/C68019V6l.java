package X;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.util.DisplayMetrics;
import com.facebook.R;

/* renamed from: X.V6l, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68019V6l extends AbstractRunnableC14200nk {
    public final /* synthetic */ float A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ XCU A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ int[] A04;
    public final /* synthetic */ int[] A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68019V6l(Context context, XCU xcu, String str, int[] iArr, int[] iArr2, float f) {
        super(69, 2, false, true);
        this.A01 = context;
        this.A04 = iArr;
        this.A05 = iArr2;
        this.A00 = f;
        this.A03 = str;
        this.A02 = xcu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.A01;
        DisplayMetrics A0K = AbstractC167007dF.A0K(context);
        int i = A0K.widthPixels;
        int i2 = A0K.heightPixels;
        int color = context.getColor(R.color.design_dark_default_color_on_background);
        int[] iArr = this.A04;
        int length = iArr.length;
        if (length == 2 && iArr[0] == color) {
            int i3 = length - 1;
            if (iArr[i3] == color) {
                int color2 = context.getColor(R.color.black);
                iArr[0] = color2;
                iArr[i3] = color2;
            }
        }
        float f = i;
        int[] iArr2 = this.A05;
        float f2 = i2;
        AbstractC70197WGf.A08(AbstractC70197WGf.A02(context, new LinearGradient(f * iArr2[0], f2 * iArr2[1], f * iArr2[2], f2 * iArr2[3], iArr, (float[]) null, Shader.TileMode.CLAMP), this.A00, i, i2), this.A02, AbstractC70197WGf.A03(this.A03));
    }
}
