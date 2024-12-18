package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import com.facebook.R;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.smartcapture.docauth.CaptureState;
import com.facebook.smartcapture.view.IdCaptureActivity;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creation.video.widget.scrubber.IgScrubberProgressIndicator;
import com.instagram.friendmap.view.customview.FriendMapAnimatedLikeView;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes8.dex */
public final class LLs implements Animator.AnimatorListener {
    public final int A00;
    public final Object A01;

    public LLs(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(Animator animator, Object obj, int i) {
        animator.addListener(new LLs(obj, i));
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.A00) {
            case 8:
                LnN.A04 = false;
                return;
            case 9:
            case 10:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case Process.SIGTERM /* 15 */:
            default:
                return;
            case 11:
                ((C45690KKb) this.A01).A00 = 0.0f;
                return;
            case 14:
                C45696KKz c45696KKz = (C45696KKz) this.A01;
                c45696KKz.A00 = 0.0f;
                c45696KKz.invalidate();
                return;
            case 16:
                KKd kKd = (KKd) this.A01;
                int i = kKd.A02;
                kKd.A01 = i;
                KKd.A00(kKd, i);
                kKd.A04 = false;
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        MO1 mo1;
        switch (this.A00) {
            case 1:
                WeakReference weakReference = ((K5I) this.A01).A00;
                if (weakReference == null || (mo1 = (MO1) weakReference.get()) == null) {
                    return;
                }
                C64094SzB c64094SzB = ((IdCaptureActivity) mo1).A03;
                if (c64094SzB == null) {
                    C14360o3.A0F("presenter");
                    throw C00O.createAndThrow();
                }
                c64094SzB.A04 = CaptureState.CAPTURING_AUTOMATIC;
                C64094SzB.A01(null, c64094SzB, true);
                return;
            case 2:
                C44358Jix c44358Jix = (C44358Jix) this.A01;
                if (!c44358Jix.A0J) {
                    return;
                }
                c44358Jix.A02 = 255;
                ((C55982hj) c44358Jix.A0F.getValue()).A08(0.0d, true);
                return;
            case 3:
            case 4:
                AbstractC25225BEi.A1U(this.A01, animator);
                return;
            case 5:
                IgScrubberProgressIndicator igScrubberProgressIndicator = (IgScrubberProgressIndicator) this.A01;
                if (!igScrubberProgressIndicator.A01) {
                    return;
                }
                igScrubberProgressIndicator.post(igScrubberProgressIndicator.A03);
                return;
            case 6:
                ((Dialog) this.A01).dismiss();
                return;
            case 7:
                GradientSpinner gradientSpinner = ((C43769JXi) this.A01).A01;
                if (gradientSpinner == null) {
                    return;
                }
                gradientSpinner.setVisibility(0);
                gradientSpinner.A06();
                return;
            case 8:
                AbstractC43593JPy.A1Q(this.A01);
                LnN.A04 = false;
                return;
            case 9:
                FriendMapAnimatedLikeView.A01(null, (FriendMapAnimatedLikeView) this.A01);
                return;
            case 10:
                AnimatorSet animatorSet = ((FriendMapAnimatedLikeView) this.A01).A00;
                if (animatorSet == null) {
                    return;
                }
                animatorSet.start();
                return;
            case 11:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 14:
            default:
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                ((C45690KKb) this.A01).A00 = 0.0f;
                return;
            case Process.SIGTERM /* 15 */:
                C45696KKz c45696KKz = (C45696KKz) this.A01;
                if (c45696KKz.A00 != 0.0f) {
                    return;
                }
                C45696KKz.A00(c45696KKz);
                return;
            case 16:
                KKd kKd = (KKd) this.A01;
                int i = kKd.A02;
                kKd.A01 = i;
                KKd.A00(kKd, i);
                kKd.A04 = false;
                return;
            case 17:
                C149216nV c149216nV = (C149216nV) this.A01;
                if (c149216nV.A09 == null) {
                    return;
                }
                C48214LVo c48214LVo = new C48214LVo();
                View view = c149216nV.A09;
                C14360o3.A0A(view);
                C149216nV.A00(view.findViewById(R.id.title), c48214LVo, c149216nV, false);
                View view2 = c149216nV.A09;
                C14360o3.A0A(view2);
                C149216nV.A00(view2.findViewById(R.id.tip_tap_forward), c48214LVo, c149216nV, false);
                View view3 = c149216nV.A09;
                C14360o3.A0A(view3);
                C149216nV.A00(view3.findViewById(R.id.tip_pause), c48214LVo, c149216nV, false);
                View view4 = c149216nV.A09;
                C14360o3.A0A(view4);
                C149216nV.A00(view4.findViewById(R.id.tip_tap_backward), c48214LVo, c149216nV, false);
                View view5 = c149216nV.A09;
                C14360o3.A0A(view5);
                C149216nV.A00(view5.findViewById(R.id.tip_swipe), c48214LVo, c149216nV, true);
                View view6 = c149216nV.A09;
                C14360o3.A0A(view6);
                C149216nV.A00(view6.findViewById(R.id.pinch_to_zoom_gesture_image), c48214LVo, c149216nV, false);
                View view7 = c149216nV.A09;
                C14360o3.A0A(view7);
                C149216nV.A00(view7.findViewById(R.id.pinch_zoom_title), c48214LVo, c149216nV, true);
                CopyOnWriteArrayList copyOnWriteArrayList = c48214LVo.A01;
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((C55982hj) it.next()).A06 = true;
                }
                c48214LVo.A00();
                ((C55982hj) copyOnWriteArrayList.get(c48214LVo.A00)).A03();
                return;
            case 18:
                ((C51762Yz) this.A01).A02(AbstractC166997dE.A0b());
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.A00) {
            case 0:
                ((Animator) this.A01).setStartDelay(367L);
                return;
            case 16:
                KKd kKd = (KKd) this.A01;
                if (!kKd.A03) {
                    return;
                }
                int i = kKd.A02;
                if (i > 0) {
                    KKd.A00(kKd, i);
                    int i2 = kKd.A02;
                    kKd.A01 = i2;
                    int i3 = i2 - 1;
                    kKd.A02 = i3;
                    C6RB c6rb = kKd.A0I;
                    c6rb.A0M(Integer.toString(i3));
                    KKd.A01(kKd, c6rb, -kKd.A0A);
                    kKd.A00 = 0;
                    kKd.A04 = true;
                    return;
                }
                kKd.A02 = 0;
                ValueAnimator valueAnimator = kKd.A0E;
                valueAnimator.cancel();
                kKd.A00 = 0;
                kKd.invalidateSelf();
                valueAnimator.setRepeatCount(0);
                valueAnimator.setDuration(400L);
                kKd.A03 = false;
                return;
            default:
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Bitmap createBitmap;
        switch (this.A00) {
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                ((C45690KKb) this.A01).A00 = 0.0f;
                return;
            case 14:
            case Process.SIGTERM /* 15 */:
            case 16:
            default:
                return;
            case 17:
                C149216nV c149216nV = (C149216nV) this.A01;
                C145166gb c145166gb = c149216nV.A0E;
                if (c145166gb != null) {
                    c145166gb.A00.Dm4();
                }
                View view = c149216nV.A0K;
                view.setDrawingCacheEnabled(true);
                view.buildDrawingCache();
                if (view.getDrawingCache() != null) {
                    Bitmap drawingCache = view.getDrawingCache();
                    C14360o3.A07(drawingCache);
                    createBitmap = BlurUtil.blur(drawingCache, 0.1f, 9);
                } else {
                    createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
                    C14360o3.A0A(createBitmap);
                }
                Canvas A06 = AbstractC43592JPx.A06(createBitmap);
                Context context = c149216nV.A0J;
                A06.drawColor(context.getColor(R.color.background), PorterDuff.Mode.DST_OVER);
                BitmapDrawable A0A = AbstractC43593JPy.A0A(context, createBitmap);
                view.destroyDrawingCache();
                view.setDrawingCacheEnabled(false);
                IgImageView igImageView = c149216nV.A0C;
                if (igImageView != null) {
                    igImageView.setBackground(A0A);
                    IgImageView igImageView2 = c149216nV.A0C;
                    if (igImageView2 != null) {
                        igImageView2.setAlpha(0.0f);
                        IgImageView igImageView3 = c149216nV.A0C;
                        C14360o3.A0A(igImageView3);
                        igImageView3.setVisibility(0);
                        IgImageView igImageView4 = c149216nV.A0C;
                        C14360o3.A0A(igImageView4);
                        igImageView4.animate().withLayer().setDuration(200L).alpha(1.0f);
                        return;
                    }
                    throw AbstractC166997dE.A0g();
                }
                throw AbstractC166997dE.A0g();
        }
    }
}
