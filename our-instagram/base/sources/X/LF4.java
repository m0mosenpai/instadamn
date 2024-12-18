package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class LF4 {
    public float A00;
    public long A01;
    public final GestureDetector A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final View A06;
    public final ImageView A07;
    public final ImageView A08;
    public final C55982hj A09;
    public final C44354Jit A0A;
    public final boolean A0B;
    public static final C55942hf A0D = C55942hf.A04(8.0d, 6.5d);
    public static final C55942hf A0C = C55942hf.A04(0.0d, 1.0E-4d);

    public LF4(View view, View view2, View view3, View view4, ImageView imageView, ImageView imageView2, boolean z) {
        C14360o3.A0B(view, 1);
        AbstractC25234BEr.A1R(imageView, view2, imageView2, view3, view4);
        this.A03 = view;
        this.A07 = imageView;
        this.A05 = view2;
        this.A08 = imageView2;
        this.A06 = view3;
        this.A04 = view4;
        this.A0B = z;
        C55982hj A02 = C55952hg.A00().A02();
        A02.A09(A0C);
        A02.A0A(new C45340K4t(this, 2));
        A02.A00 = 0.01d;
        this.A09 = A02;
        Context context = view.getContext();
        this.A02 = new GestureDetector(context, new LSV(this));
        int i = C44354Jit.A0H;
        C14360o3.A07(context);
        Drawable drawable = view.getResources().getDrawable(R.drawable.golden_ticket_back_logo);
        C14360o3.A07(drawable);
        this.A0A = new C44354Jit(context, drawable, z);
        view2.setCameraDistance(view2.getResources().getDisplayMetrics().density * 5000.0f);
    }
}
