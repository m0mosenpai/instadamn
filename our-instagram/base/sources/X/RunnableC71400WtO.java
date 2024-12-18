package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.WtO, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71400WtO implements Runnable {
    public final /* synthetic */ FrameLayout A00;
    public final /* synthetic */ U55 A01;

    public RunnableC71400WtO(FrameLayout frameLayout, U55 u55) {
        this.A01 = u55;
        this.A00 = frameLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.widget.ImageView, android.view.View, X.U5i] */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.widget.ImageView, android.view.View, X.U5i] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.widget.FrameLayout, android.view.ViewGroup] */
    @Override // java.lang.Runnable
    public final void run() {
        U55 u55 = this.A01;
        C68894Vdq c68894Vdq = u55.A03;
        ?? r8 = this.A00;
        if (c68894Vdq != null) {
            FrameLayout frameLayout = u55.A00;
            ?? r4 = frameLayout;
            if (frameLayout == null) {
                FrameLayout frameLayout2 = new FrameLayout(u55.A01);
                u55.A00 = frameLayout2;
                r4 = frameLayout2;
            }
            Context context = u55.A01;
            if (r4 != 0) {
                XBV xbv = u55.A04;
                boolean A1U = AbstractC167007dF.A1U(xbv);
                View inflate = LayoutInflater.from(context).inflate(R.layout.shops_lite_loading_view_ig, (ViewGroup) null, A1U);
                ViewTreeObserver viewTreeObserver = inflate.getViewTreeObserver();
                QEV qev = c68894Vdq.A00;
                String str = c68894Vdq.A01;
                viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC63513Sog(inflate, qev, str));
                r4.addView(inflate);
                Interpolator interpolator = U5F.A09;
                U5F u5f = new U5F(context, 4.0f, -16751392, (int) U5C.A00(context, 64.0f));
                ?? imageView = new ImageView(context);
                imageView.A01(u5f);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                r4.addView(imageView, layoutParams);
                imageView.A00();
                View findViewById = r4.findViewById(R.id.shops_lite_cancel_button_ig);
                if (findViewById != null) {
                    C0fQ.A00(new ViewOnClickListenerC63505SoY(xbv, qev, str, A1U ? 1 : 0), findViewById);
                    findViewById.setBackgroundResource(R.drawable.instagram_x_pano_outline_24);
                    Drawable drawable = context.getDrawable(R.drawable.instagram_x_pano_outline_24);
                    if (drawable != null) {
                        AbstractC25231BEo.A0x(context, drawable, R.color.igds_primary_text);
                    }
                }
                TextView textView = (TextView) r4.findViewById(R.id.loading_screen_text_ig);
                if (textView != null) {
                    AbstractC166987dD.A1O(context, textView, R.color.igds_primary_text);
                }
                r8.addView(u55.A00);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        boolean CSL = u55.A05.CSL();
        Interpolator interpolator2 = U5F.A09;
        Context context2 = u55.A01;
        U5F u5f2 = new U5F(context2, 2.0f, AbstractC25291Lj.A03(EnumC72394Xcg.A1w, CSL), (int) U5C.A00(context2, AbstractC25291Lj.A01(C05F.A0R)));
        ?? imageView2 = new ImageView(context2);
        imageView2.A01(u5f2);
        FrameLayout frameLayout3 = u55.A00;
        ?? r6 = frameLayout3;
        if (frameLayout3 == null) {
            FrameLayout frameLayout4 = new FrameLayout(context2);
            u55.A00 = frameLayout4;
            r6 = frameLayout4;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        if (!u55.A06) {
            Integer num = C05F.A0C;
            C25547BRj A05 = AbstractC25291Lj.A05(num);
            EnumC72394Xcg enumC72394Xcg = (EnumC72394Xcg) A05.A01;
            float f = A05.A00;
            GradientDrawable gradientDrawable = new GradientDrawable();
            Integer num2 = C05F.A0Y;
            C14360o3.A0B(AbstractC25291Lj.A00.C73(), 0);
            gradientDrawable.setCornerRadius(U5C.A00(context2, XPC.A00(r0).AKz(num2)));
            gradientDrawable.setStroke((int) f, AbstractC25291Lj.A03(enumC72394Xcg, CSL));
            gradientDrawable.setColor(AbstractC25291Lj.A03(EnumC72394Xcg.A1y, CSL));
            CSN A04 = AbstractC25291Lj.A04(C05F.A15);
            Button button = new Button(context2);
            button.setBackgroundDrawable(gradientDrawable);
            button.setText(2131958581);
            float f2 = A04.A00;
            button.setTextSize(f2);
            button.setTextColor(AbstractC25291Lj.A03(EnumC72394Xcg.A25, CSL));
            button.setHeight((int) U5C.A00(context2, AbstractC25291Lj.A01(num)));
            button.setLineSpacing(0.0f, AbstractC25291Lj.A00(A04.A02));
            button.setTypeface(C1LZ.A00().A05.A00(context2, ((EnumC72437Xdh) A04.A04).name()));
            AbstractC65702TsY.A0u(context2, button, A04, f2);
            WNN.A00(button, 4, u55);
            button.setAlpha(0.0f);
            C04E A03 = AbstractC010103p.A03(button);
            A03.A05(3000L);
            A03.A02(1.0f);
            A03.A04(200L);
            A03.A06(new LinearInterpolator());
            A03.A01();
            LinearLayout linearLayout = new LinearLayout(context2);
            linearLayout.setGravity(80);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams3.setMargins((int) U5C.A00(context2, 20.0f), 0, (int) U5C.A00(context2, 20.0f), (int) U5C.A00(context2, 20.0f));
            layoutParams3.weight = 1.0f;
            linearLayout.addView(button, layoutParams3);
            r6.addView(linearLayout);
        }
        r6.addView(imageView2, layoutParams2);
        r8.addView(r6);
        imageView2.A00();
    }
}
