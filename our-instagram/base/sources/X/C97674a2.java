package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* renamed from: X.4a2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97674a2 {
    public View A00;
    public View A01;
    public C44358Jix A02;
    public IgSimpleImageView A03;
    public InterfaceC56392iX A04;
    public InterfaceC56392iX A05;
    public InterfaceC56392iX A06;
    public InterfaceC56392iX A07;
    public C5SW A08;
    public C3G2 A09;
    public C8P8 A0A;
    public PromptStickerModel A0B;
    public boolean A0C;
    public final ValueAnimator A0D;
    public final ValueAnimator A0E;
    public final Context A0F;
    public final InterfaceC56392iX A0G;
    public final Map A0H;
    public final java.util.Set A0I;

    public C97674a2(Context context, InterfaceC56392iX interfaceC56392iX) {
        this.A0F = context;
        this.A0G = interfaceC56392iX;
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        duration.setInterpolator(new OvershootInterpolator(2.5f));
        duration.setStartDelay(250L);
        this.A0D = duration;
        ValueAnimator duration2 = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(500L);
        duration2.setInterpolator(new PathInterpolator(0.17f, 0.17f, 0.0f, 1.0f));
        duration2.setStartDelay(500L);
        this.A0E = duration2;
        this.A0H = new LinkedHashMap();
        this.A0I = new LinkedHashSet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r11, 36324252114432023L) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r11, 36324252114366486L) == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r11, 36324252114300949L) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(com.instagram.common.session.UserSession r11, X.C97674a2 r12, X.C8P8 r13, com.instagram.reels.prompt.model.PromptStickerModel r14) {
        /*
            r7 = r14
            boolean r0 = r14.A0M()
            r3 = 0
            if (r0 == 0) goto L16
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36324252114366486(0x810cb700023016, double:3.034941530923947E-306)
            boolean r0 = X.C18U.A06(r2, r11, r0)
            r9 = 1
            if (r0 != 0) goto L17
        L16:
            r9 = 0
        L17:
            boolean r0 = r14.A0M()
            if (r0 == 0) goto L2b
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36324252114300949(0x810cb700013015, double:3.034941530882501E-306)
            boolean r0 = X.C18U.A06(r2, r11, r0)
            r10 = 1
            if (r0 != 0) goto L2c
        L2b:
            r10 = 0
        L2c:
            boolean r0 = r14.A0M()
            if (r0 == 0) goto L40
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36324252114432023(0x810cb700033017, double:3.034941530965393E-306)
            boolean r0 = X.C18U.A06(r2, r11, r0)
            r8 = 1
            if (r0 == 0) goto L41
        L40:
            r8 = 0
        L41:
            r5 = r12
            r6 = r13
            if (r9 != 0) goto L57
            if (r10 != 0) goto L57
            android.animation.ValueAnimator r0 = r12.A0D
            X.ANR r4 = new X.ANR
            r4.<init>(r12, r13, r14)
        L4e:
            r0.addUpdateListener(r4)
            r0.start()
            r12.A0C = r3
            return
        L57:
            android.animation.ValueAnimator r0 = r12.A0E
            X.ANU r4 = new X.ANU
            r4.<init>(r5, r6, r7, r8, r9, r10)
            goto L4e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97674a2.A01(com.instagram.common.session.UserSession, X.4a2, X.8P8, com.instagram.reels.prompt.model.PromptStickerModel):void");
    }

    public static final void A00(UserSession userSession, C84823qW c84823qW, InterfaceC41201vU interfaceC41201vU, C97674a2 c97674a2, C8P8 c8p8, PromptStickerModel promptStickerModel, boolean z) {
        if (A02(userSession, promptStickerModel)) {
            ViewGroup A01 = AbstractC124845kp.A01(c97674a2.A0G.getView());
            double dimensionPixelSize = 2.0d * c97674a2.A0F.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material);
            double height = dimensionPixelSize / A01.getHeight();
            c84823qW.A00 = (float) (c84823qW.A00 + height);
            c84823qW.A02 = (float) (c84823qW.A02 + (dimensionPixelSize / A01.getWidth()));
        }
        View A05 = c97674a2.A05();
        ViewGroup A012 = AbstractC124845kp.A01(c97674a2.A0G.getView());
        C138436Oz.A04(A05, c84823qW, interfaceC41201vU.Ack(userSession), A012.getWidth(), A012.getHeight(), true);
        String str = "primaryCardView";
        if (A03(promptStickerModel)) {
            InterfaceC56392iX interfaceC56392iX = c97674a2.A06;
            if (interfaceC56392iX != null) {
                View view = interfaceC56392iX.getView();
                if (c97674a2.A00 != null) {
                    view.setRotation(r2.getRotation() - 5.0f);
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            str = "secondaryCardViewStubber";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        if (A04(promptStickerModel)) {
            InterfaceC56392iX interfaceC56392iX2 = c97674a2.A07;
            if (interfaceC56392iX2 != null) {
                View view2 = interfaceC56392iX2.getView();
                View view3 = c97674a2.A00;
                if (view3 != null) {
                    view2.setRotation(view3.getRotation() + 7.0f);
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            str = "tertiaryCardViewStubber";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        if (c97674a2.A09 != C3G2.A0U && promptStickerModel.A00.B48().size() > 1 && !c97674a2.A0I.contains(promptStickerModel)) {
            if (!promptStickerModel.A0M() || !C18U.A06(C06090Tz.A05, userSession, 36324252114432023L)) {
                c8p8.EU6(1.0f);
            }
            if (A03(promptStickerModel)) {
                InterfaceC56392iX interfaceC56392iX3 = c97674a2.A06;
                if (interfaceC56392iX3 != null) {
                    View view4 = interfaceC56392iX3.getView();
                    View view5 = c97674a2.A00;
                    if (view5 != null) {
                        view4.setRotation(view5.getRotation());
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                str = "secondaryCardViewStubber";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            if (A04(promptStickerModel)) {
                InterfaceC56392iX interfaceC56392iX4 = c97674a2.A07;
                if (interfaceC56392iX4 != null) {
                    View view6 = interfaceC56392iX4.getView();
                    View view7 = c97674a2.A00;
                    if (view7 != null) {
                        view6.setRotation(view7.getRotation());
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                str = "tertiaryCardViewStubber";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            if (A02(userSession, promptStickerModel)) {
                Context context = c97674a2.A0F;
                if (c97674a2.A0A == null) {
                    str = "sticker";
                } else {
                    c97674a2.A02 = new C44358Jix(context, C05F.A01, C05F.A00, (((Drawable) r2).getIntrinsicHeight() + (context.getResources().getDimensionPixelSize(R.dimen.audience_lists_text_in_badge_horizontal_margin_right) * 2.0f)) / 2.0f, context.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material), true, false, true);
                    InterfaceC56392iX interfaceC56392iX5 = c97674a2.A05;
                    if (interfaceC56392iX5 == null) {
                        str = "progressViewStubber";
                    } else {
                        ((ImageView) interfaceC56392iX5.getView()).setImageDrawable(c97674a2.A02);
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            if (z) {
                A01(userSession, c97674a2, c8p8, promptStickerModel);
            } else {
                c97674a2.A0C = true;
            }
        }
    }

    public final View A05() {
        View view = this.A01;
        if (view != null) {
            return view;
        }
        C14360o3.A0F("stickerContainerView");
        throw C00O.createAndThrow();
    }

    public final void A06() {
        InterfaceC56392iX interfaceC56392iX = this.A0G;
        if (interfaceC56392iX != null) {
            ValueAnimator valueAnimator = this.A0D;
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
            ValueAnimator valueAnimator2 = this.A0E;
            valueAnimator2.cancel();
            valueAnimator2.removeAllUpdateListeners();
            C44358Jix c44358Jix = this.A02;
            if (c44358Jix != null) {
                c44358Jix.A01();
            }
            InterfaceC56392iX interfaceC56392iX2 = this.A05;
            if (interfaceC56392iX2 != null) {
                ((ImageView) interfaceC56392iX2.getView()).setImageDrawable(null);
                this.A02 = null;
            }
            interfaceC56392iX.setVisibility(8);
        }
    }

    public static final boolean A02(UserSession userSession, PromptStickerModel promptStickerModel) {
        if (promptStickerModel.A0M() && C18U.A06(C06090Tz.A05, userSession, 36324252114300949L)) {
            return true;
        }
        return false;
    }

    public static final boolean A03(PromptStickerModel promptStickerModel) {
        if (!promptStickerModel.A0M() && !promptStickerModel.A0D && !promptStickerModel.A0B && promptStickerModel.A00.B48().size() > 1) {
            return true;
        }
        return false;
    }

    public static final boolean A04(PromptStickerModel promptStickerModel) {
        if (!promptStickerModel.A0M() && !promptStickerModel.A0D && !promptStickerModel.A0B && promptStickerModel.A00.B48().size() > 2) {
            return true;
        }
        return false;
    }
}
