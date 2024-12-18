package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* renamed from: X.7L1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7L1 implements InterfaceC161277Km {
    public final AnonymousClass541 A02 = AnonymousClass541.A0E;
    public final DecelerateInterpolator A01 = new DecelerateInterpolator();
    public final OvershootInterpolator A00 = new OvershootInterpolator();

    public static final ScaleAnimation A00(Interpolator interpolator, float f, float f2) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setDuration(400L);
        scaleAnimation.setInterpolator(interpolator);
        return scaleAnimation;
    }

    public final void A01(C47701L4i c47701L4i, boolean z) {
        U8O u8o;
        View view;
        ViewGroup viewGroup = c47701L4i.A05;
        if (viewGroup != null) {
            C162867Qx c162867Qx = c47701L4i.A07;
            Drawable drawable = null;
            if (c162867Qx != null) {
                drawable = c162867Qx.A00;
            }
            if ((drawable instanceof U8O) && (u8o = (U8O) drawable) != null && (view = c47701L4i.A04) != null) {
                Context context = viewGroup.getContext();
                viewGroup.setVisibility(0);
                C14360o3.A07(context);
                UAT uat = new UAT(context);
                viewGroup.addView(uat);
                uat.setListener(new C70505WZm(viewGroup, uat));
                uat.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                ScaleAnimation A00 = A00(this.A01, 1.0f, 0.95f);
                A00.setAnimationListener(new WOV(context, view, u8o, this, uat, z));
                if (z) {
                    Object systemService = context.getSystemService("vibrator");
                    C14360o3.A0C(systemService, "null cannot be cast to non-null type android.os.Vibrator");
                    Vibrator vibrator = (Vibrator) systemService;
                    if (vibrator.hasAmplitudeControl()) {
                        vibrator.vibrate(VibrationEffect.createOneShot(300L, 5));
                    }
                }
                view.startAnimation(A00);
            }
        }
    }

    @Override // X.InterfaceC161277Km
    public final void ADX(C47701L4i c47701L4i, C7L3 c7l3, String str, boolean z, boolean z2) {
        C14360o3.A0B(c47701L4i, 0);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(c7l3, 2);
        C162867Qx c162867Qx = c47701L4i.A07;
        View view = c47701L4i.A04;
        if (view != null) {
            Context context = view.getContext();
            C14360o3.A07(context);
            U8O u8o = new U8O(context);
            float f = c7l3.A00;
            if (u8o.A00 != f) {
                u8o.A00 = f;
                u8o.A05 = true;
                u8o.invalidateSelf();
            }
            if (!C14360o3.A0K(u8o.A03, str)) {
                u8o.A03 = str;
                u8o.A0G.clear();
                u8o.invalidateSelf();
            }
            u8o.A0C.removeMessages(1);
            if (!u8o.A04) {
                u8o.A04 = true;
            }
            if (c162867Qx != null) {
                c162867Qx.A01(u8o);
            }
        }
        if (!z) {
            A01(c47701L4i, false);
        }
    }

    @Override // X.InterfaceC161277Km
    public final C47701L4i Csm(Context context, ShapeDrawable shapeDrawable, View view, ViewGroup viewGroup, ImageView imageView, C162867Qx c162867Qx) {
        C14360o3.A0B(context, 0);
        return new C47701L4i(shapeDrawable, null, null, null, view, viewGroup, null, c162867Qx);
    }

    @Override // X.InterfaceC161277Km
    public final boolean D3T(C47701L4i c47701L4i, C7L3 c7l3, String str, boolean z) {
        C14360o3.A0B(c47701L4i, 0);
        A01(c47701L4i, true);
        return true;
    }

    @Override // X.InterfaceC161277Km
    public final void F90(C47701L4i c47701L4i, String str) {
        U8O u8o;
        C14360o3.A0B(c47701L4i, 0);
        C162867Qx c162867Qx = c47701L4i.A07;
        Drawable drawable = null;
        if (c162867Qx != null) {
            drawable = c162867Qx.A00;
        }
        if ((drawable instanceof U8O) && (u8o = (U8O) drawable) != null) {
            u8o.A0C.sendEmptyMessage(1);
        }
    }

    @Override // X.InterfaceC161277Km
    public final AnonymousClass541 CBO() {
        return this.A02;
    }

    @Override // X.InterfaceC161277Km
    public final /* synthetic */ boolean CRi(String str) {
        return false;
    }
}
