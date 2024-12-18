package X;

import android.graphics.drawable.Drawable;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;

/* renamed from: X.Kqj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47026Kqj {
    public static final void A00(Drawable drawable, SlideInAndOutIconView slideInAndOutIconView, String str, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, float f, float f2, int i) {
        int A0H = AbstractC166987dD.A0H(interfaceC16660sJ.invoke(slideInAndOutIconView));
        int A0H2 = AbstractC166987dD.A0H(interfaceC16660sJ2.invoke(slideInAndOutIconView));
        slideInAndOutIconView.setTextSize(f);
        slideInAndOutIconView.A03(drawable, A0H, A0H);
        slideInAndOutIconView.A0B.setPadding(A0H2, A0H2, A0H2, A0H2);
        slideInAndOutIconView.setIconColor(i);
        slideInAndOutIconView.setIconScale(f2);
        slideInAndOutIconView.setText(str);
    }
}
