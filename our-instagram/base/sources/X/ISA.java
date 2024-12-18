package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;

/* loaded from: classes7.dex */
public abstract class ISA {
    public static final FrameLayout A00(Context context, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.shops_data_signifier, viewGroup, false);
        C14360o3.A0C(inflate, AbstractC111324zv.A00(1));
        FrameLayout frameLayout = (FrameLayout) inflate;
        C126545np c126545np = new C126545np(context);
        frameLayout.addView(c126545np);
        frameLayout.setTag(new IIB(frameLayout, c126545np));
        return frameLayout;
    }

    public static final void A01(C62862tP c62862tP, C1338462s c1338462s, IIB iib) {
        AbstractC167017dG.A1P(c1338462s, c62862tP);
        if (iib != null && iib.A01 != c1338462s) {
            iib.A01 = c1338462s;
            C6T7 c6t7 = iib.A00;
            if (c6t7 != null) {
                c6t7.A04();
            }
            C6T7 A0B = AbstractC37301Gc2.A0B(iib.A02.getContext(), c1338462s, c62862tP);
            iib.A00 = A0B;
            A0B.A07(iib.A03);
        }
    }
}
