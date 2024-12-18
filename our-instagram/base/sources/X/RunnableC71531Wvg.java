package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Wvg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71531Wvg implements Runnable {
    public final /* synthetic */ FrameLayout A00;
    public final /* synthetic */ U56 A01;
    public final /* synthetic */ boolean A02;

    public RunnableC71531Wvg(FrameLayout frameLayout, U56 u56, boolean z) {
        this.A01 = u56;
        this.A00 = frameLayout;
        this.A02 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        U56 u56 = this.A01;
        FrameLayout frameLayout3 = this.A00;
        InterfaceC71884X8r interfaceC71884X8r = u56.A03;
        boolean z = this.A02;
        FrameLayout frameLayout4 = u56.A00;
        if (frameLayout4 == null) {
            u56.A00 = new FrameLayout(u56.A01);
        } else if (frameLayout4.getParent() != null && (frameLayout = u56.A00) != null) {
            ViewParent parent = frameLayout.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(frameLayout);
            }
            frameLayout.removeAllViews();
        }
        boolean CSL = u56.A05.CSL();
        float A02 = AbstractC25291Lj.A02(C05F.A0B);
        Context context = u56.A01;
        Resources resources = context.getResources();
        ViewParent viewParent = null;
        C55862hS c55862hS = new C55862hS();
        ((AbstractC55872hT) c55862hS).A00 = resources.getDrawable(R.drawable.ic_error_outline_96_rev, null);
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(c55862hS);
        imageView.setPadding(0, 0, 0, (int) U5C.A00(context, AbstractC25291Lj.A02(C05F.A0f)));
        imageView.setColorFilter(AbstractC25291Lj.A03(EnumC72394Xcg.A2A, CSL));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 3;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(1);
        linearLayout.setPadding((int) U5C.A00(context, A02), 0, (int) U5C.A00(context, A02), 0);
        linearLayout.addView(imageView, layoutParams);
        Integer num = C05F.A0C;
        CSN A04 = AbstractC25291Lj.A04(num);
        TextView textView = new TextView(context);
        textView.setText(R.string.res_0x7f13005f_name_removed);
        int A03 = AbstractC25291Lj.A03(EnumC72394Xcg.A1r, CSL);
        textView.setTextColor(A03);
        float f = A04.A00;
        textView.setTextSize(f);
        textView.setLineSpacing(0.0f, AbstractC25291Lj.A00(A04.A02));
        AbstractC65702TsY.A0u(context, textView, A04, f);
        textView.setTypeface(C1LZ.A00().A05.A00(context, ((EnumC72437Xdh) A04.A04).A00));
        textView.setMaxLines(3);
        textView.setPadding(0, 0, 0, (int) U5C.A00(context, AbstractC25291Lj.A02(C05F.A0b)));
        Integer num2 = C05F.A00;
        CSN A042 = AbstractC25291Lj.A04(num2);
        TextView textView2 = new TextView(context);
        textView2.setText(R.string.res_0x7f13005d_name_removed);
        textView2.setTextColor(A03);
        float f2 = A042.A00;
        textView2.setTextSize(f2);
        textView2.setLineSpacing(0.0f, AbstractC25291Lj.A00(A042.A02));
        textView.setTypeface(C1LZ.A00().A05.A00(context, ((EnumC72437Xdh) A042.A04).A00));
        AbstractC65702TsY.A0u(context, textView2, A042, f2);
        textView2.setTextSize(15.0f);
        textView2.setMaxLines(7);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        C25547BRj A05 = AbstractC25291Lj.A05(num2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        Integer num3 = C05F.A0Y;
        C14360o3.A0B(AbstractC25291Lj.A00.C73(), 0);
        gradientDrawable.setCornerRadius(U5C.A00(context, XPC.A00(r0).AKz(num3)));
        gradientDrawable.setColor(AbstractC25291Lj.A03(EnumC72394Xcg.A1c, CSL));
        gradientDrawable.setStroke((int) A05.A00, AbstractC25291Lj.A03((EnumC72394Xcg) A05.A01, CSL));
        CSN A043 = AbstractC25291Lj.A04(C05F.A15);
        Button button = new Button(context);
        button.setBackground(gradientDrawable);
        button.setText(R.string.res_0x7f13005e_name_removed);
        float f3 = A043.A00;
        button.setTextSize(f3);
        button.setTextColor(AbstractC25291Lj.A03(EnumC72394Xcg.A1h, CSL));
        button.setHeight((int) U5C.A00(context, AbstractC25291Lj.A01(num)));
        button.setLineSpacing(0.0f, AbstractC25291Lj.A00(A043.A02));
        button.setTypeface(C1LZ.A00().A05.A00(context, ((EnumC72437Xdh) A043.A04).name()));
        AbstractC65702TsY.A0u(context, button, A043, f3);
        int A022 = (int) AbstractC25291Lj.A02(C05F.A04);
        button.setPadding(A022, 0, A022, 0);
        WNV.A00(button, 2, interfaceC71884X8r, u56);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setGravity(80);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins((int) U5C.A00(context, 20.0f), 0, (int) U5C.A00(context, 20.0f), (int) U5C.A00(context, 20.0f));
        layoutParams2.weight = 1.0f;
        linearLayout2.addView(button, layoutParams2);
        if (z && (frameLayout2 = u56.A00) != null) {
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageResource(R.drawable.company_layer_icons_close_outline_24);
            imageView2.setColorFilter(AbstractC25291Lj.A03(EnumC72394Xcg.A1o, CSL));
            WNN.A00(imageView2, 3, u56);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) U5C.A00(context, 24.0f), (int) U5C.A00(context, 24.0f));
            layoutParams3.setMargins((int) U5C.A00(context, 20.0f), (int) U5C.A00(context, 30.0f), 0, 0);
            layoutParams3.gravity = 51;
            frameLayout2.addView(imageView2, layoutParams3);
        }
        FrameLayout frameLayout5 = u56.A00;
        if (frameLayout5 != null) {
            frameLayout5.addView(linearLayout);
        }
        FrameLayout frameLayout6 = u56.A00;
        if (frameLayout6 != null) {
            frameLayout6.addView(linearLayout2);
        }
        FrameLayout frameLayout7 = u56.A00;
        if (frameLayout7 != null && frameLayout7.getParent() != null) {
            FrameLayout frameLayout8 = u56.A00;
            if (frameLayout8 != null) {
                viewParent = frameLayout8.getParent();
            }
            C14360o3.A0C(viewParent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) viewParent).removeView(u56.A00);
        }
        frameLayout3.addView(u56.A00);
    }
}
