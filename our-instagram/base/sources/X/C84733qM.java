package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: X.3qM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84733qM {
    public static final C84733qM A00 = new Object();

    public final ShimmerFrameLayout A01(Context context, ViewGroup viewGroup) {
        C14360o3.A0B(context, 0);
        ShimmerFrameLayout A002 = A00(context, viewGroup);
        U19 u19 = new U19(context);
        u19.setLayoutType(EnumC38183Gqo.A0F);
        u19.setLayoutParams(new ViewGroup.LayoutParams(-1, Resources.getSystem().getDisplayMetrics().heightPixels));
        A002.addView(u19);
        return A002;
    }

    public final ShimmerFrameLayout A02(final Context context, ViewGroup viewGroup) {
        C14360o3.A0B(context, 0);
        AbstractC84813qV abstractC84813qV = new AbstractC84813qV(context) { // from class: X.9oH
            public static final float[] A07 = {1.0f, 1.03f, 1.2f, 1.07f, 1.2f, 1.3f, 0.62f, 0.62f};
            public final float A00;
            public final float A01;
            public final float A02;
            public final float A03;
            public final float A04;
            public final Paint A05;
            public final RectF A06;

            {
                super(context, null);
                Resources resources = getResources();
                this.A01 = resources.getDimension(R.dimen.abc_button_inset_vertical_material) + AbstractC13880nE.A04(context, 8);
                this.A04 = AbstractC13880nE.A04(context, 2);
                this.A03 = resources.getDimension(R.dimen.refinements_header_destination_item_placeholder_standard_width);
                this.A02 = AbstractC13880nE.A04(context, 33);
                this.A00 = AbstractC13880nE.A04(context, 8);
                this.A06 = AbstractC166987dD.A0X();
                Paint A0R = AbstractC166987dD.A0R();
                this.A05 = A0R;
                AbstractC166987dD.A1N(context, A0R, AbstractC53242c7.A04(context));
            }

            @Override // android.view.View
            public final void onDraw(Canvas canvas) {
                C14360o3.A0B(canvas, 0);
                float f = this.A01;
                float[] fArr = A07;
                int i = 0;
                do {
                    float f2 = this.A03 * fArr[i];
                    RectF rectF = this.A06;
                    float f3 = this.A04;
                    rectF.set(f, f3, f + f2, this.A02 + f3);
                    float f4 = this.A00;
                    canvas.drawRoundRect(rectF, f4, f4, this.A05);
                    f += f2 + f;
                    i++;
                } while (i < 8);
            }
        };
        abstractC84813qV.setBackgroundColor(AbstractC53242c7.A0F(context, R.attr.actionBarBackgroundColor));
        int A04 = (int) AbstractC13880nE.A04(context, 44);
        View inflate = LayoutInflater.from(context).inflate(R.layout.shimmer_header_layout, viewGroup, false);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type com.facebook.shimmer.ShimmerFrameLayout");
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate;
        abstractC84813qV.setLayoutParams(new ViewGroup.LayoutParams(-1, A04));
        shimmerFrameLayout.addView(abstractC84813qV);
        return shimmerFrameLayout;
    }

    public static final ShimmerFrameLayout A00(Context context, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.shimmer_content_layout, viewGroup, false);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type com.facebook.shimmer.ShimmerFrameLayout");
        return (ShimmerFrameLayout) inflate;
    }
}
