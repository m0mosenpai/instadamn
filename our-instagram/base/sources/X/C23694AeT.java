package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import java.util.HashMap;

/* renamed from: X.AeT, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23694AeT implements InterfaceC73023Pd {
    public final /* synthetic */ C9V3 A00;
    public final /* synthetic */ C195608l0 A01;
    public final /* synthetic */ InterfaceC16660sJ A02;

    public C23694AeT(C9V3 c9v3, C195608l0 c195608l0, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = c9v3;
        this.A01 = c195608l0;
        this.A02 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC73023Pd
    public final void DFp() {
        InterfaceC16660sJ interfaceC16660sJ = this.A02;
        String url = this.A01.A04.getUrl();
        C14360o3.A07(url);
        interfaceC16660sJ.invoke(url);
    }

    @Override // X.InterfaceC73023Pd
    public final void DPX(C73083Pj c73083Pj) {
        BitmapDrawable bitmapDrawable;
        C9V3 c9v3 = this.A00;
        IgImageView igImageView = c9v3.A0A;
        String str = this.A01.A05;
        GradientDrawable gradientDrawable = c9v3.A02;
        AbstractC167027dH.A12(igImageView, str, gradientDrawable);
        Drawable drawable = igImageView.getDrawable();
        int[] iArr = null;
        if (drawable instanceof BitmapDrawable) {
            bitmapDrawable = (BitmapDrawable) drawable;
        } else {
            bitmapDrawable = null;
        }
        HashMap hashMap = FET.A01;
        BackgroundGradientColors backgroundGradientColors = (BackgroundGradientColors) hashMap.get(str);
        if (backgroundGradientColors == null) {
            if (bitmapDrawable != null) {
                Bitmap bitmap = bitmapDrawable.getBitmap();
                C14360o3.A07(bitmap);
                backgroundGradientColors = AbstractC14570oV.A01(bitmap, C05F.A00);
                hashMap.put(str, backgroundGradientColors);
            }
            gradientDrawable.setColors(iArr);
            igImageView.setBackground(gradientDrawable);
        }
        iArr = new int[]{backgroundGradientColors.A01, backgroundGradientColors.A00};
        gradientDrawable.setColors(iArr);
        igImageView.setBackground(gradientDrawable);
    }
}
