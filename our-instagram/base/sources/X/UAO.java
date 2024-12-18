package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class UAO extends View {
    public float A00;
    public int A01;
    public int A02;
    public float[] A03;
    public String[] A04;
    public float[] A05;
    public String[] A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final Paint A0A;
    public final Path A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final Paint A0F;
    public final Paint A0G;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        float[] fArr = this.A03;
        String str = "yMarksPositions";
        if (fArr != null) {
            int length = fArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    String[] strArr = this.A06;
                    if (strArr == null) {
                        str = "yMarks";
                        break;
                    }
                    String str2 = strArr[i];
                    float f = this.A0E;
                    float[] fArr2 = this.A03;
                    if (fArr2 == null) {
                        break;
                    }
                    canvas.drawText(str2, f, fArr2[i] + 10.0f, this.A0G);
                    i++;
                } else {
                    canvas.drawPath(this.A0B, this.A0F);
                    int length2 = getXMarksPositions().length;
                    for (int i2 = 0; i2 < length2; i2++) {
                        String[] strArr2 = this.A04;
                        if (strArr2 == null) {
                            str = "xMarks";
                        } else {
                            canvas.drawText(strArr2[i2], getXMarksPositions()[i2] + (this.A0C / 2), this.A00, this.A0A);
                        }
                    }
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final void setRulersAndMarks(C68943Veh c68943Veh) {
        C14360o3.A0B(c68943Veh, 0);
        String[] strArr = c68943Veh.A01;
        this.A06 = strArr;
        String[] strArr2 = c68943Veh.A00;
        this.A04 = strArr2;
        this.A03 = new float[strArr.length];
        this.A05 = new float[strArr2.length];
    }

    public final float[] getXMarksPositions() {
        float[] fArr = this.A05;
        if (fArr != null) {
            return fArr;
        }
        C14360o3.A0F("xMarksPositions");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0082  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r15, int r16) {
        /*
            Method dump skipped, instructions count: 178
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UAO.onMeasure(int, int):void");
    }

    public UAO(Context context, boolean z) {
        super(context);
        Paint paint = new Paint();
        this.A0G = paint;
        Paint paint2 = new Paint();
        this.A0A = paint2;
        Paint paint3 = new Paint();
        this.A0F = paint3;
        this.A0B = new Path();
        paint3.setStrokeWidth(context.getResources().getDimensionPixelSize(R.dimen.ads_disclosure_footer_top_divider_height));
        AbstractC166987dD.A1N(context, paint3, AbstractC53242c7.A0H(context, R.attr.igds_color_separator));
        paint3.setStyle(Paint.Style.STROKE);
        AbstractC166987dD.A1N(context, paint, AbstractC53242c7.A09(context));
        paint.setTextSize(context.getResources().getDimensionPixelSize(R.dimen.button_text_size));
        paint.setTextAlign(Paint.Align.RIGHT);
        AbstractC166987dD.A1N(context, paint2, AbstractC53242c7.A09(context));
        paint2.setTextSize(AbstractC166997dE.A04(context, R.dimen.button_text_size));
        paint2.setTextAlign(Paint.Align.CENTER);
        Context context2 = getContext();
        int A09 = AbstractC167017dG.A09(context2);
        this.A08 = A09;
        this.A0E = A09 - AbstractC167017dG.A06(context2);
        int A0E = AbstractC167017dG.A0E(context2);
        this.A0D = A0E;
        this.A09 = A0E;
        this.A07 = AbstractC167017dG.A0B(context2);
        this.A0C = context.getResources().getDimensionPixelSize(z ? R.dimen.ai_agent_share_profile_sticker_padding : R.dimen.account_discovery_bottom_gap);
    }
}
