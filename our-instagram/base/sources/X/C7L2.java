package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: X.7L2, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7L2 implements InterfaceC161277Km {
    public final InterfaceC161177Kc A02;
    public final AnonymousClass541 A03 = AnonymousClass541.A0F;
    public final DecelerateInterpolator A01 = new DecelerateInterpolator();
    public final AccelerateInterpolator A00 = new AccelerateInterpolator();

    public final boolean A00(C47701L4i c47701L4i, boolean z, boolean z2) {
        Object obj;
        EnumC53112NeP enumC53112NeP;
        InterfaceC58682mR interfaceC58682mR;
        InterfaceC58682mR interfaceC58682mR2;
        AbstractC56582ir abstractC56582ir;
        InterfaceC58682mR interfaceC58682mR3;
        View view = c47701L4i.A04;
        C14360o3.A0A(view);
        View view2 = c47701L4i.A01;
        C14360o3.A0C(view2, "null cannot be cast to non-null type com.facebook.xac.powerups.fire.FireUnderlayWithBigFlareView");
        UAR uar = (UAR) view2;
        C162867Qx c162867Qx = c47701L4i.A07;
        TransitionDrawable transitionDrawable = null;
        if (c162867Qx != null) {
            obj = c162867Qx.A00;
        } else {
            obj = null;
        }
        if (obj instanceof TransitionDrawable) {
            transitionDrawable = (TransitionDrawable) obj;
        }
        C66311U8k c66311U8k = uar.A00;
        if (c66311U8k.getBounds().width() < AbstractC69815Vw1.A00(c66311U8k.A0A, 50.0f)) {
            enumC53112NeP = EnumC53112NeP.A03;
        } else {
            enumC53112NeP = EnumC53112NeP.A02;
        }
        if (c66311U8k.A02 != enumC53112NeP) {
            c66311U8k.A02 = enumC53112NeP;
            Object obj2 = c66311U8k.A01;
            if (obj2 != null) {
                if ((obj2 instanceof InterfaceC58682mR) && (interfaceC58682mR3 = (InterfaceC58682mR) obj2) != null) {
                    interfaceC58682mR3.stop();
                }
                c66311U8k.A01 = null;
                c66311U8k.invalidateSelf();
            }
            c66311U8k.A07 = false;
        }
        Object obj3 = c66311U8k.A01;
        if (obj3 == null) {
            if (!c66311U8k.A07) {
                c66311U8k.A06 = true;
                InterfaceC161177Kc interfaceC161177Kc = c66311U8k.A03;
                if (interfaceC161177Kc != null) {
                    EnumC53112NeP enumC53112NeP2 = c66311U8k.A02;
                    C69523Vqn c69523Vqn = c66311U8k.A0C;
                    C161167Kb c161167Kb = (C161167Kb) interfaceC161177Kc;
                    synchronized (c161167Kb) {
                        C14360o3.A0B(enumC53112NeP2, 0);
                        C14360o3.A0B(c69523Vqn, 1);
                        Map map = c161167Kb.A03;
                        Object obj4 = map.get(enumC53112NeP2);
                        if (obj4 == null) {
                            obj4 = new C69071VhM();
                            map.put(enumC53112NeP2, obj4);
                        }
                        C69071VhM c69071VhM = (C69071VhM) obj4;
                        WeakReference weakReference = c69071VhM.A00;
                        if (weakReference != null && (abstractC56582ir = (AbstractC56582ir) weakReference.get()) != null) {
                            c69523Vqn.A00(new AnonymousClass693(abstractC56582ir), enumC53112NeP2);
                        } else {
                            c69071VhM.A01.add(new WeakReference(c69523Vqn));
                            if (!c69071VhM.A02) {
                                c69071VhM.A02 = true;
                                c161167Kb.A05.execute(new RunnableC56968PPj(enumC53112NeP2, c161167Kb));
                            }
                        }
                    }
                }
            }
            return false;
        }
        if ((obj3 instanceof InterfaceC58682mR) && (interfaceC58682mR2 = (InterfaceC58682mR) obj3) != null && interfaceC58682mR2.isPlaying()) {
            return false;
        }
        if ((obj3 instanceof InterfaceC58682mR) && (interfaceC58682mR = (InterfaceC58682mR) obj3) != null) {
            interfaceC58682mR.E4S();
        }
        DecelerateInterpolator decelerateInterpolator = this.A01;
        C14360o3.A0B(decelerateInterpolator, 3);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.05f, 1.0f, 1.05f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setDuration(500L);
        scaleAnimation.setInterpolator(decelerateInterpolator);
        scaleAnimation.setAnimationListener(new LR7(transitionDrawable, view, this));
        if (transitionDrawable != null) {
            transitionDrawable.startTransition(500);
        }
        view.startAnimation(scaleAnimation);
        if (z) {
            Context context = view.getContext();
            C14360o3.A07(context);
            Object systemService = context.getSystemService("vibrator");
            C14360o3.A0C(systemService, "null cannot be cast to non-null type android.os.Vibrator");
            Vibrator vibrator = (Vibrator) systemService;
            long[] jArr = new long[20];
            for (int i = 0; i < 20; i++) {
                jArr[i] = 50;
            }
            if (vibrator.hasAmplitudeControl()) {
                vibrator.vibrate(VibrationEffect.createWaveform(jArr, new int[]{7, 10, 7, 10, 15, 20, 15, 20, 30, 35, 20, 15, 20, 15, 10, 15, 10, 15, 10, 7}, -1));
                return true;
            }
            if (z2) {
                vibrator.vibrate(jArr, -1);
                return true;
            }
            vibrator.vibrate(50L);
            return true;
        }
        return true;
    }

    @Override // X.InterfaceC161277Km
    public final void ADX(C47701L4i c47701L4i, C7L3 c7l3, String str, boolean z, boolean z2) {
        C14360o3.A0B(c47701L4i, 0);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(c7l3, 2);
        int A01 = C1H4.A01(c7l3.A00);
        View view = c47701L4i.A02;
        C14360o3.A0C(view, "null cannot be cast to non-null type com.facebook.xac.powerups.fire.FireOverlayView");
        ((UAQ) view).setCornerRadiusPx(A01);
        View view2 = c47701L4i.A01;
        C14360o3.A0C(view2, "null cannot be cast to non-null type com.facebook.xac.powerups.fire.FireUnderlayWithBigFlareView");
        UAR uar = (UAR) view2;
        uar.setTargetId(str);
        uar.setCornerRadiusPx(A01);
        C162867Qx c162867Qx = c47701L4i.A07;
        float f = c7l3.A00;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{Color.parseColor("#FF8600"), Color.parseColor("#FFA800")});
        gradientDrawable.setCornerRadius(f);
        float f2 = c7l3.A00;
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{Color.parseColor("#FF6C00"), Color.parseColor("#FFE27D")});
        gradientDrawable2.setCornerRadius(f2);
        TransitionDrawable transitionDrawable = new TransitionDrawable(new GradientDrawable[]{gradientDrawable, gradientDrawable2});
        if (c162867Qx != null) {
            c162867Qx.A01(transitionDrawable);
        }
        if (!z) {
            A00(c47701L4i, false, false);
        }
    }

    @Override // X.InterfaceC161277Km
    public final C47701L4i Csm(Context context, ShapeDrawable shapeDrawable, View view, ViewGroup viewGroup, ImageView imageView, C162867Qx c162867Qx) {
        C14360o3.A0B(context, 0);
        UAR uar = new UAR(context, new C66309U8i(context));
        uar.setFlareDrawableFactory(this.A02);
        return new C47701L4i(shapeDrawable, uar, new UAQ(context, new C66309U8i(context)), null, view, viewGroup, null, c162867Qx);
    }

    @Override // X.InterfaceC161277Km
    public final boolean D3T(C47701L4i c47701L4i, C7L3 c7l3, String str, boolean z) {
        C14360o3.A0B(c47701L4i, 0);
        return A00(c47701L4i, true, z);
    }

    @Override // X.InterfaceC161277Km
    public final /* synthetic */ void F90(C47701L4i c47701L4i, String str) {
    }

    @Override // X.InterfaceC161277Km
    public final AnonymousClass541 CBO() {
        return this.A03;
    }

    public C7L2(InterfaceC161177Kc interfaceC161177Kc) {
        this.A02 = interfaceC161177Kc;
    }

    @Override // X.InterfaceC161277Km
    public final /* synthetic */ boolean CRi(String str) {
        return false;
    }
}
