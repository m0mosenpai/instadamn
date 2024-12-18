package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* loaded from: classes11.dex */
public final class WEW {
    public static final C55942hf A0F = C55942hf.A04(125.0d, 12.5d);
    public float A00 = 1.0f;
    public float A01;
    public int A02;
    public int A03;
    public boolean A04;
    public boolean A05;
    public final Activity A06;
    public final View A07;
    public final View A08;
    public final View A09;
    public final View A0A;
    public final C69530Vqu A0B;
    public final RoundedCornerFrameLayout A0C;
    public final boolean A0D;
    public final View A0E;

    public static final void A00(ViewGroup viewGroup, float f, float f2, float f3) {
        int height = viewGroup.getHeight();
        int width = viewGroup.getWidth();
        AbstractC125325le A00 = AbstractC125325le.A00(viewGroup);
        A00.A0G();
        AbstractC125325le A0E = A00.A0A().A0E(A0F);
        A0E.A0K(f3);
        A0E.A06 = new C71044Wmz(viewGroup, f, f2, height, width);
        A0E.A0H();
    }

    public static final void A01(WEW wew, C69412Vmw c69412Vmw, C69412Vmw c69412Vmw2, InterfaceC125355lh interfaceC125355lh, boolean z, boolean z2) {
        View view = wew.A09;
        C55942hf c55942hf = C150956qv.A02;
        AbstractC125325le A00 = AbstractC125325le.A00(view);
        A00.A0G();
        AbstractC125325le A0F2 = A00.A0F(true);
        int i = 0;
        if (z2) {
            i = 4;
        }
        A0F2.A04 = i;
        C55942hf c55942hf2 = A0F;
        AbstractC125325le A0E = A0F2.A0E(c55942hf2);
        float f = c69412Vmw.A04;
        float f2 = c69412Vmw2.A04;
        A0E.A0U(f, f2, 0.0f);
        A0E.A0V(f, f2, 0.0f);
        A0E.A0S(c69412Vmw.A05, c69412Vmw2.A05);
        A0E.A0T(c69412Vmw.A06, c69412Vmw2.A06);
        A0E.A0O(c69412Vmw.A02, c69412Vmw2.A02);
        A0E.A06 = new C71043Wmy(wew, c69412Vmw, c69412Vmw2, z);
        A0E.A05 = new C49602Lvv(3, interfaceC125355lh, wew);
        A0E.A0H();
        wew.A04 = true;
        AbstractC125325le A002 = AbstractC125325le.A00(wew.A0A);
        A002.A0G();
        View view2 = wew.A08;
        A002.A0U(view2.getScaleX(), 1.0f, 0.0f);
        A002.A0V(view2.getScaleY(), 1.0f, 0.0f);
        A002.A0K(0.0f);
        A002.A0J(0.0f);
        A002.A0F(true).A0E(c55942hf2).A0H();
    }

    public WEW(Activity activity, View view, View view2, View view3, View view4, View view5, RoundedCornerFrameLayout roundedCornerFrameLayout, boolean z) {
        this.A06 = activity;
        this.A07 = view;
        this.A0E = view2;
        this.A08 = view3;
        this.A09 = view4;
        this.A0A = view5;
        this.A0C = roundedCornerFrameLayout;
        this.A0D = z;
        this.A0B = new C69530Vqu(activity);
    }
}
