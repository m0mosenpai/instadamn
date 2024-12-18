package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* renamed from: X.WtQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71402WtQ implements Runnable {
    public final /* synthetic */ FrameLayout A00;
    public final /* synthetic */ C34571FLg A01;

    public RunnableC71402WtQ(FrameLayout frameLayout, C34571FLg c34571FLg) {
        this.A01 = c34571FLg;
        this.A00 = frameLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.widget.ImageView, android.view.View, X.U5i] */
    @Override // java.lang.Runnable
    public final void run() {
        C34571FLg c34571FLg = this.A01;
        FrameLayout frameLayout = this.A00;
        Context context = c34571FLg.A01;
        boolean A00 = AbstractC72723Nt.A00(context);
        Interpolator interpolator = U5F.A09;
        U5F u5f = new U5F(context, 2.0f, AbstractC25291Lj.A03(EnumC72394Xcg.A1w, A00), (int) U5C.A00(context, AbstractC25291Lj.A01(C05F.A0R)));
        ?? imageView = new ImageView(context);
        imageView.A01(u5f);
        FrameLayout frameLayout2 = c34571FLg.A00;
        ViewGroup viewGroup = frameLayout2;
        if (frameLayout2 == null) {
            FrameLayout frameLayout3 = new FrameLayout(context);
            c34571FLg.A00 = frameLayout3;
            viewGroup = frameLayout3;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        Integer num = C05F.A0C;
        C25547BRj A05 = AbstractC25291Lj.A05(num);
        GradientDrawable gradientDrawable = new GradientDrawable();
        Integer num2 = C05F.A0Y;
        C14360o3.A0B(AbstractC25291Lj.A00.C73(), 0);
        gradientDrawable.setCornerRadius(U5C.A00(context, XPC.A00(r0).AKz(num2)));
        gradientDrawable.setStroke((int) A05.A00, AbstractC25291Lj.A03((EnumC72394Xcg) A05.A01, A00));
        gradientDrawable.setColor(AbstractC25291Lj.A03(EnumC72394Xcg.A1y, A00));
        CSN A04 = AbstractC25291Lj.A04(C05F.A15);
        Button button = new Button(context);
        button.setBackgroundDrawable(gradientDrawable);
        button.setText(2131958581);
        float f = A04.A00;
        button.setTextSize(f);
        button.setTextColor(AbstractC25291Lj.A03(EnumC72394Xcg.A25, A00));
        button.setHeight((int) U5C.A00(context, AbstractC25291Lj.A01(num)));
        button.setLineSpacing(0.0f, AbstractC25291Lj.A00(A04.A02));
        AbstractC65702TsY.A0u(context, button, A04, f);
        WNN.A00(button, 5, c34571FLg);
        button.setAlpha(0.0f);
        C04E A03 = AbstractC010103p.A03(button);
        A03.A05(3000L);
        A03.A02(1.0f);
        A03.A04(200L);
        A03.A06(new LinearInterpolator());
        A03.A01();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(80);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins((int) U5C.A00(context, 20.0f), 0, (int) U5C.A00(context, 20.0f), (int) U5C.A00(context, 20.0f));
        layoutParams2.weight = 1.0f;
        linearLayout.addView(button, layoutParams2);
        viewGroup.addView((View) imageView, layoutParams);
        viewGroup.addView(linearLayout);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
        if (viewGroup2 != null) {
            viewGroup2.removeView(viewGroup);
        }
        frameLayout.addView(viewGroup);
        imageView.A00();
    }
}
