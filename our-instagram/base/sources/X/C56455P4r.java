package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* renamed from: X.P4r, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56455P4r implements InterfaceC58279PsX {
    public static final String __redex_internal_original_name = "MediaKitActionBarHolder";
    public float A00;
    public float A01;
    public int A02;
    public View A03;
    public View A04;
    public View A05;
    public ViewGroup A06;
    public TextView A07;
    public TextView A08;
    public AppBarLayout A09;
    public CollapsingToolbarLayout A0A;
    public C56352iT A0B;
    public EnumC53120NeX A0C;
    public OH8 A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final ValueAnimator A0I;
    public final Drawable A0J;
    public final Drawable A0K;
    public final InterfaceC60122ou A0L;
    public final ODC A0M;
    public final int A0N;
    public final InterfaceC11380iw A0O;
    public final C54780OIu A0P;

    public C56455P4r(Context context, InterfaceC11380iw interfaceC11380iw, C54780OIu c54780OIu, ODC odc, OH8 oh8, int i) {
        C14360o3.A0B(c54780OIu, 5);
        this.A0G = i;
        this.A0D = oh8;
        this.A0M = odc;
        this.A0O = interfaceC11380iw;
        this.A0P = c54780OIu;
        this.A0C = EnumC53120NeX.A03;
        this.A0H = MSX.A02(context);
        this.A0J = C3LQ.A08(context, R.drawable.instagram_x_pano_outline_24, R.color.design_dark_default_color_on_background, R.drawable.instagram_x_pano_outline_24, R.color.bright_foreground_disabled_material_dark);
        this.A0K = C3LQ.A08(context, R.drawable.instagram_more_vertical_pano_outline_24, R.color.design_dark_default_color_on_background, R.drawable.instagram_more_vertical_pano_outline_24, R.color.bright_foreground_disabled_material_dark);
        this.A0N = context.getColor(AbstractC53242c7.A08(context));
        this.A0E = AbstractC31173DnH.A01(context);
        this.A0F = AbstractC167007dF.A09(context, R.attr.igds_color_primary_button_on_media);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        C14360o3.A07(ofFloat);
        this.A0I = ofFloat;
        this.A0L = new C55816OqR(0, context, this);
    }

    public static final void A00(C56455P4r c56455P4r) {
        String str;
        int A02 = AbstractC13950nL.A02(c56455P4r.A00, -1, c56455P4r.A0N);
        ColorFilter A00 = C3DY.A00(A02);
        c56455P4r.A0J.setColorFilter(A00);
        c56455P4r.A0K.setColorFilter(A00);
        View view = c56455P4r.A03;
        if (view == null) {
            str = "actionBarDimmer";
        } else {
            view.setAlpha(c56455P4r.A00);
            View view2 = c56455P4r.A05;
            if (view2 == null) {
                str = "statusBarBackground";
            } else {
                view2.setAlpha(c56455P4r.A00);
                View view3 = c56455P4r.A04;
                if (view3 != null) {
                    float alpha = view3.getAlpha();
                    float f = c56455P4r.A00;
                    if (alpha != f) {
                        View view4 = c56455P4r.A04;
                        if (view4 != null) {
                            view4.setAlpha(f);
                        }
                    }
                    TextView textView = c56455P4r.A07;
                    if (textView == null) {
                        str = "actionBarTitle";
                    } else {
                        textView.setTextColor(A02);
                        return;
                    }
                }
                C14360o3.A0F("actionBarShadow");
                throw C00O.createAndThrow();
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC58279PsX
    public final C54780OIu BOh() {
        return this.A0P;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0O.getModuleName();
    }
}
