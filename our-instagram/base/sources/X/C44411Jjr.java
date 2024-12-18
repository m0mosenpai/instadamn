package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.view.View;
import com.facebook.R;

/* renamed from: X.Jjr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44411Jjr extends View {
    public String A00;
    public String A01;
    public final float A02;
    public final int A03;
    public final Paint A04;
    public final DynamicLayout A05;
    public final SpannableStringBuilder A06;

    public static void A00(C44411Jjr c44411Jjr) {
        String str = c44411Jjr.A01;
        boolean isEmpty = str.isEmpty();
        String str2 = c44411Jjr.A00;
        if (!isEmpty) {
            if (str2.isEmpty()) {
                str2 = str;
            } else {
                str2 = AnonymousClass001.A0g(str, "\n", str2);
            }
        }
        SpannableStringBuilder spannableStringBuilder = c44411Jjr.A06;
        spannableStringBuilder.replace(0, spannableStringBuilder.length(), (CharSequence) str2);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.translate((int) (this.A03 * 0.1d), (int) (this.A02 * 40.0f));
        DynamicLayout dynamicLayout = this.A05;
        canvas.drawRect(0.0f, 0.0f, dynamicLayout.getWidth(), dynamicLayout.getHeight(), this.A04);
        dynamicLayout.draw(canvas);
    }

    public C44411Jjr(Context context) {
        super(context);
        this.A01 = "";
        this.A00 = "";
        DisplayMetrics A0K = AbstractC167007dF.A0K(context);
        float f = A0K.density;
        this.A02 = f;
        int i = A0K.widthPixels;
        this.A03 = i;
        Paint A0S = AbstractC166987dD.A0S(1);
        this.A04 = A0S;
        AbstractC166987dD.A1N(context, A0S, R.color.clips_overlay_ads_end_background_color);
        AbstractC166987dD.A1R(A0S);
        SpannableStringBuilder A01 = AbstractC37300Gc1.A01();
        this.A06 = A01;
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(f * 14.0f);
        AbstractC166987dD.A1N(context, textPaint, R.color.igds_icon_on_color);
        this.A05 = new DynamicLayout(A01, textPaint, (int) (i * 0.8d), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }
}
