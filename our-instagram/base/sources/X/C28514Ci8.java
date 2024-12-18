package X;

import android.animation.Animator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.creation.capture.quickcapture.direct.view.ReshareTogglePickerView;

/* renamed from: X.Ci8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28514Ci8 implements Animator.AnimatorListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C28514Ci8(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj3;
        this.A01 = obj2;
        this.A03 = obj;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (2 - this.A00 == 0) {
            AbstractC166987dD.A1Y(this.A01);
            ((Animator) this.A03).removeAllListeners();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i;
        String A00;
        switch (this.A00) {
            case 0:
                C131845xK.A00((C6FQ) this.A03, (C6FW) this.A01, (InterfaceC103384lE) this.A02);
                return;
            case 1:
                Drawable drawable = (Drawable) this.A01;
                if (drawable != null) {
                    ((ReshareTogglePickerView) this.A03).A01.setImageDrawable(drawable);
                }
                ReshareTogglePickerView reshareTogglePickerView = (ReshareTogglePickerView) this.A03;
                TextView textView = reshareTogglePickerView.A02;
                Context A0L = AbstractC166997dE.A0L(reshareTogglePickerView);
                Number number = (Number) this.A02;
                C14360o3.A0B(number, 1);
                if (number.intValue() != 0) {
                    i = 2131971585;
                } else {
                    i = 2131971584;
                }
                textView.setText(AbstractC166997dE.A0p(A0L, i));
                return;
            case 2:
                AbstractC166987dD.A1Y(this.A01);
                return;
            case 3:
                ((View) this.A02).setVisibility(8);
                View view = (View) this.A03;
                if (view != null) {
                    view.setVisibility(8);
                }
                CRY cry = (CRY) this.A01;
                C85833sC c85833sC = cry.A01;
                IgSimpleImageView igSimpleImageView = cry.A00;
                C85233rE c85233rE = cry.A02;
                C85833sC.A01(igSimpleImageView, c85233rE.A02, c85833sC, c85233rE, C18U.A06(C06090Tz.A05, c85833sC.A02, 36320618574127849L));
                return;
            case 4:
                ((Animator) this.A03).removeAllListeners();
                ((ImageView) this.A02).setImageResource(R.drawable.note_like_filled_drawable);
                return;
            default:
                C25728BYo c25728BYo = (C25728BYo) this.A03;
                InterfaceC60442pS interfaceC60442pS = c25728BYo.A0D;
                UserSession userSession = c25728BYo.A0C;
                C40971v4 c40971v4 = c25728BYo.A0E;
                C120985dq c120985dq = c25728BYo.A0A;
                C37644Ghd c37644Ghd = c25728BYo.A0B;
                MotionEvent motionEvent = (MotionEvent) this.A02;
                MotionEvent motionEvent2 = (MotionEvent) this.A01;
                View view2 = c25728BYo.A02;
                String str = c25728BYo.A04;
                C51762Yz c51762Yz = c25728BYo.A09;
                C14360o3.A0B(interfaceC60442pS, 0);
                AbstractC167027dH.A0a(1, userSession, c40971v4, c120985dq, c37644Ghd);
                C14360o3.A0B(c51762Yz, 9);
                c51762Yz.A01(true);
                CLC.A00(c120985dq, c37644Ghd, userSession, c40971v4.A0K, interfaceC60442pS, true);
                if (view2 != null && str != null) {
                    if (motionEvent2.getRawX() < motionEvent.getRawX()) {
                        A00 = "swipe_left";
                    } else {
                        A00 = AbstractC111324zv.A00(3199);
                    }
                    View findViewWithTag = view2.getRootView().findViewWithTag("clips_overlay_ad_cta_component");
                    if (findViewWithTag != null) {
                        Rect rect = new Rect();
                        view2.getGlobalVisibleRect(rect);
                        Rect rect2 = new Rect();
                        findViewWithTag.getGlobalVisibleRect(rect2);
                        float x = rect.left + motionEvent.getX();
                        float y = rect.top + motionEvent.getY();
                        float x2 = motionEvent2.getX() + rect.left;
                        float y2 = motionEvent2.getY() + rect.top;
                        float eventTime = ((float) (motionEvent2.getEventTime() - motionEvent.getEventTime())) / 1000.0f;
                        AbstractC40903IAb.A00(AbstractC166997dE.A0L(view2), rect, rect2, userSession, interfaceC60442pS, c40971v4, Float.valueOf(x2), Float.valueOf(y2), Float.valueOf((motionEvent2.getRawX() - motionEvent.getRawX()) / eventTime), Float.valueOf((motionEvent2.getRawY() - motionEvent.getRawY()) / eventTime), Float.valueOf(eventTime), A00, str, x, y);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Drawable drawable;
        switch (this.A00) {
            case 2:
                AbstractC166987dD.A1Y(this.A02);
                return;
            case 3:
            default:
                return;
            case 4:
                ImageView imageView = (ImageView) this.A02;
                Context context = (Context) this.A01;
                Drawable drawable2 = context.getDrawable(R.drawable.instagram_heart_pano_filled_24);
                if (drawable2 != null) {
                    drawable = drawable2.mutate();
                    AbstractC25228BEl.A1H(PorterDuff.Mode.SRC_ATOP, drawable, context.getColor(R.color.igds_creation_tools_pink));
                } else {
                    drawable = null;
                }
                imageView.setImageDrawable(drawable);
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
