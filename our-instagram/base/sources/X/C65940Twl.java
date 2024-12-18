package X;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;

/* renamed from: X.Twl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65940Twl implements InterfaceC1119253e, InterfaceC1119453g {
    public float A00;
    public final View A01;
    public final View A02;
    public final JZH A03;
    public final Activity A04;
    public final Context A05;
    public final UserSession A06;
    public final C65941Twm A07;
    public final UserDetailFragment A08;

    public C65940Twl(Activity activity, Context context, View view, View view2, UserSession userSession, JZH jzh, C65941Twm c65941Twm, UserDetailFragment userDetailFragment) {
        AbstractC167007dF.A1G(context, 2, view2);
        this.A04 = activity;
        this.A05 = context;
        this.A06 = userSession;
        this.A01 = view;
        this.A02 = view2;
        this.A08 = userDetailFragment;
        this.A03 = jzh;
        this.A07 = c65941Twm;
        this.A00 = 1.0f;
    }

    @Override // X.InterfaceC1119253e
    public final boolean DBd(GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX, float f, float f2) {
        C14360o3.A0B(gestureDetectorOnGestureListenerC148016lX, 0);
        return gestureDetectorOnGestureListenerC148016lX.A04();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x007e, code lost:
    
        if (r2 < 0.0f) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008e, code lost:
    
        if (r5 < 0.0f) goto L21;
     */
    @Override // X.InterfaceC1119253e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DC2(X.GestureDetectorOnGestureListenerC148016lX r8, float r9, float r10, float r11, float r12, float r13) {
        /*
            r7 = this;
            r0 = 0
            X.C14360o3.A0B(r8, r0)
            float r1 = r7.A00
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L4c
            android.view.View r2 = r7.A01
            float r1 = r2.getX()
            int r0 = r2.getWidth()
            int r0 = r0 / 2
            float r0 = (float) r0
            float r1 = r1 + r0
            float r9 = r9 / r1
            float r1 = r2.getY()
            int r0 = r2.getHeight()
            int r0 = r0 / 2
            float r0 = (float) r0
            float r1 = r1 + r0
            float r10 = r10 / r1
            float r1 = java.lang.Math.abs(r9)
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L46
            float r1 = java.lang.Math.abs(r10)
            r0 = 1050253722(0x3e99999a, float:0.3)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L46
            r7.A00(r8)
        L40:
            X.JZH r0 = r7.A03
            r0.A01()
        L45:
            return
        L46:
            com.instagram.profile.fragment.UserDetailFragment r0 = r7.A08
            r0.A0o()
            goto L40
        L4c:
            android.view.View r4 = r7.A01
            float r3 = r4.getTranslationX()
            float r6 = r4.getTranslationY()
            float r2 = r4.getX()
            int r0 = r4.getWidth()
            float r0 = (float) r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            float r2 = r2 + r0
            float r5 = r4.getY()
            int r0 = r4.getHeight()
            float r0 = (float) r0
            float r0 = r0 / r1
            float r5 = r5 + r0
            float r2 = r2 + r3
            android.view.View r1 = r7.A02
            int r0 = r1.getWidth()
            float r0 = (float) r0
            r3 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L80
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            r2 = 0
            if (r0 >= 0) goto L81
        L80:
            r2 = 1
        L81:
            float r5 = r5 + r6
            int r0 = r1.getHeight()
            float r0 = (float) r0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 > 0) goto L90
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            r0 = 0
            if (r1 >= 0) goto L91
        L90:
            r0 = 1
        L91:
            if (r2 != 0) goto L95
            if (r0 == 0) goto L45
        L95:
            r4.setTranslationY(r3)
            r4.setTranslationX(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65940Twl.DC2(X.6lX, float, float, float, float, float):void");
    }

    @Override // X.InterfaceC1119253e
    public final boolean Dmo(GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX, float f, float f2) {
        return false;
    }

    @Override // X.InterfaceC1119253e
    public final void Dwn(GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX) {
    }

    @Override // X.InterfaceC1119453g
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        A00(null);
        boolean z = !AbstractC167007dF.A1N((this.A00 > 1.0f ? 1 : (this.A00 == 1.0f ? 0 : -1)));
        JZH jzh = this.A03;
        if (z) {
            jzh.A00();
        } else {
            jzh.A01();
        }
        View view = this.A01;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        this.A00 = 1.0f;
        C65941Twm c65941Twm = this.A07;
        if (c65941Twm != null && c65941Twm.A00) {
            UserSession userSession = c65941Twm.A03;
            InterfaceC11380iw interfaceC11380iw = c65941Twm.A02;
            User user = c65941Twm.A04;
            C1571673v.A06(interfaceC11380iw, userSession, C1571673v.A00(userSession, user), "profile_photo_zoom_end", user.getId(), "expanded_profile_photo");
            c65941Twm.A01 = true;
            c65941Twm.A00 = false;
        }
    }

    public final void A00(GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX) {
        if (this.A00 == 1.0f) {
            View view = this.A01;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", 0.0f);
            ofFloat.setDuration(100L);
            ofFloat.start();
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "translationY", 0.0f);
            ofFloat2.setDuration(100L);
            ofFloat2.start();
            if (gestureDetectorOnGestureListenerC148016lX != null) {
                gestureDetectorOnGestureListenerC148016lX.EJW(0.0f, 0.0f);
            }
        }
    }

    @Override // X.InterfaceC1119253e
    public final void DBv(GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX, float f, float f2, float f3, boolean z) {
        View view = this.A01;
        view.setTranslationY(f2 * 1.0f);
        view.setTranslationX(f * 1.0f);
    }

    @Override // X.InterfaceC1119253e
    public final boolean DC9(GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX, float f, float f2, float f3, float f4, boolean z) {
        this.A03.A00();
        return true;
    }

    @Override // X.InterfaceC1119453g
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = this.A00 * scaleGestureDetector.getScaleFactor();
        this.A00 = scaleFactor;
        float A01 = AbstractC58322PtE.A01(scaleFactor, 5.0f, 1.0f);
        this.A00 = A01;
        View view = this.A01;
        view.setScaleX(A01);
        view.setScaleY(this.A00);
        return true;
    }

    @Override // X.InterfaceC1119453g
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.A03.A00();
        C65941Twm c65941Twm = this.A07;
        if (c65941Twm != null && c65941Twm.A01) {
            UserSession userSession = c65941Twm.A03;
            InterfaceC11380iw interfaceC11380iw = c65941Twm.A02;
            User user = c65941Twm.A04;
            C1571673v.A06(interfaceC11380iw, userSession, C1571673v.A00(userSession, user), "profile_photo_zoom_start", user.getId(), "expanded_profile_photo");
            c65941Twm.A01 = false;
            c65941Twm.A00 = true;
            return true;
        }
        return true;
    }
}
