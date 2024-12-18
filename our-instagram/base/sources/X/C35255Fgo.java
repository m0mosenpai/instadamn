package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.ui.widget.pulsingbutton.PulsingPillButton;

/* renamed from: X.Fgo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35255Fgo {
    public static final C35255Fgo A00 = new Object();

    public static final View A00(Context context, View.OnClickListener onClickListener, InterfaceC56362iU interfaceC56362iU, float f, int i, boolean z) {
        C31775DxY c31775DxY = new C31775DxY(context);
        int i2 = R.drawable.instagram_icons_exceptions_blend_pano_outline_24;
        if (z) {
            i2 = R.drawable.instagram_blend_add_pano_outline_24;
        }
        c31775DxY.setButtonResource(i2);
        c31775DxY.setColorFilter(C3DY.A00(i));
        c31775DxY.setAlpha(f);
        C3LO A0B = AbstractC31171DnF.A0B();
        c31775DxY.setClipToPadding(false);
        A0B.A0I = c31775DxY;
        A0B.A05 = 2131953860;
        A0B.A0L = C05F.A15;
        A0B.A0G = onClickListener;
        return interfaceC56362iU.AAA(new C3LY(A0B));
    }

    public static final ImageView A01(Context context, InterfaceC56362iU interfaceC56362iU, C7J6 c7j6) {
        C14360o3.A0B(context, 0);
        int i = R.drawable.instagram_info_pano_outline_24;
        int A0H = AbstractC53242c7.A0H(context, R.attr.infoButtonIcon);
        if (A0H != 0) {
            i = A0H;
        }
        C3LP c3lp = new C3LP(context, i);
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A0F = c3lp;
        A0B.A05 = 2131964503;
        View A0F = AbstractC31177DnL.A0F(ViewOnClickListenerC35691FpR.A00(c7j6, 53), A0B, interfaceC56362iU);
        C14360o3.A0C(A0F, "null cannot be cast to non-null type android.widget.ImageView");
        return (ImageView) A0F;
    }

    public static final void A03(Context context, InterfaceC56362iU interfaceC56362iU, int i, int i2, boolean z) {
        C35026Fbz c35026Fbz = new C35026Fbz(C05F.A00);
        c35026Fbz.A02(i);
        c35026Fbz.A03 = i2;
        c35026Fbz.A05 = context.getTheme();
        if (z) {
            c35026Fbz.A04 = 0;
            c35026Fbz.A0B = AbstractC53242c7.A0L(context, android.R.attr.windowLightStatusBar, true);
        }
        C35026Fbz.A00(interfaceC56362iU, c35026Fbz);
    }

    public static final void A04(InterfaceC56362iU interfaceC56362iU, C7J7 c7j7, int i, boolean z) {
        C14360o3.A0B(c7j7, 1);
        interfaceC56362iU.EkT(new ViewOnClickListenerC35482FlZ(c7j7), !z);
        ((C56352iT) interfaceC56362iU).A0Q().setColorFilter(C3DY.A00(i));
    }

    public static final void A02(Context context, View.OnClickListener onClickListener, InterfaceC56362iU interfaceC56362iU, int i, int i2) {
        PulsingPillButton pulsingPillButton = new PulsingPillButton(context, null, 0);
        pulsingPillButton.setButtonResource(i);
        pulsingPillButton.setButtonText(2131959650);
        pulsingPillButton.A00(context.getColor(R.color.igds_active_badge), context.getColor(R.color.igds_join_call_button_background_gradient_end));
        if (i2 != 0) {
            pulsingPillButton.setIconColor(context.getColor(i2));
            pulsingPillButton.setButtonTextColor(context.getColor(i2));
        }
        pulsingPillButton.setPulsingEnabled(true);
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A0I = pulsingPillButton;
        A0B.A05 = 2131960668;
        A0B.A0G = onClickListener;
        A0B.A0O = false;
        A0B.A09 = 17;
        AbstractC31175DnJ.A1G(A0B, interfaceC56362iU);
    }

    public static final void A05(InterfaceC56362iU interfaceC56362iU, C7J6 c7j6, boolean z) {
        C3LO A0B = AbstractC31171DnF.A0B();
        int i = R.drawable.instagram_alert_new_pano_outline_24;
        if (z) {
            i = R.drawable.instagram_alert_off_new_pano_outline_24;
        }
        A0B.A06 = i;
        int i2 = 2131959109;
        if (z) {
            i2 = 2131959156;
        }
        A0B.A05 = i2;
        AbstractC31176DnK.A1B(new ViewOnClickListenerC35535Fmn(c7j6, z), A0B, interfaceC56362iU);
    }
}
