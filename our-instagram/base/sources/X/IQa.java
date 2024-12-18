package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes7.dex */
public abstract class IQa {
    public static final FrameLayout A00(ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 0);
        Context context = viewGroup.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        C14360o3.A07(context);
        C126545np c126545np = new C126545np(context);
        frameLayout.addView(c126545np);
        frameLayout.setTag(new C38454Gvb(frameLayout, c126545np));
        return frameLayout;
    }

    public static final void A01(C62862tP c62862tP, C114665Fw c114665Fw, C38454Gvb c38454Gvb, int i, int i2) {
        AbstractC167017dG.A1O(c38454Gvb, c62862tP);
        C6T7 c6t7 = c114665Fw.A00;
        if (c6t7 == null) {
            c6t7 = AbstractC37301Gc2.A0B(c38454Gvb.A01.getContext(), C1338462s.A02(null, c114665Fw.A01.A01()), c62862tP);
            c114665Fw.A00 = c6t7;
            c62862tP.A05(new C60929Rbj(7, c114665Fw, c62862tP, c6t7));
        }
        C6T7 c6t72 = c38454Gvb.A00;
        if (c6t72 != c6t7) {
            if (c6t72 != null) {
                c6t72.A04();
            }
            c38454Gvb.A00 = c6t7;
            c6t7.A07(c38454Gvb.A02);
        }
        FrameLayout frameLayout = c38454Gvb.A01;
        Context context = frameLayout.getContext();
        C14360o3.A0A(context);
        frameLayout.setPadding(0, (int) AbstractC13880nE.A04(context, i), 0, (int) AbstractC13880nE.A04(context, i2));
    }
}
