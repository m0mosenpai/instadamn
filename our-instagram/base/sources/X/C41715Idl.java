package X;

import android.content.res.Resources;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;

/* renamed from: X.Idl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41715Idl {
    public static final C41715Idl A00 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
    
        if (r3 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.MWD A00(X.InterfaceC11380iw r4, com.instagram.common.session.UserSession r5, X.C41181vS r6) {
        /*
            X.1v4 r3 = r6.A0g
            r1 = 0
            if (r3 == 0) goto L1b
            X.1qM r0 = r3.A0K
            if (r0 == 0) goto L1b
            X.1sb r0 = X.AbstractC37300Gc1.A0F(r0)
            if (r0 == 0) goto L1b
            java.lang.String r2 = r0.BMm()
        L13:
            java.lang.String r1 = r3.A0S
        L15:
            X.MWD r0 = new X.MWD
            r0.<init>(r4, r5, r2, r1)
            return r0
        L1b:
            r2 = r1
            if (r3 == 0) goto L15
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41715Idl.A00(X.0iw, com.instagram.common.session.UserSession, X.1vS):X.MWD");
    }

    public static final void A01(View view, View view2, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        try {
            Animation loadAnimation = AnimationUtils.loadAnimation(view.getContext(), R.anim.button_slide_down_100_to_20);
            loadAnimation.setAnimationListener(new LR8(view2, view, constraintLayout, constraintLayout2));
            constraintLayout2.startAnimation(loadAnimation);
        } catch (Resources.NotFoundException unused) {
        }
    }
}
