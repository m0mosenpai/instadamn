package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewStub;
import androidx.activity.ComponentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.8EL, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8EL {
    public final ValueAnimator.AnimatorUpdateListener A00;
    public final ViewStub A01;
    public final ComponentActivity A02;
    public final UserSession A03;
    public final InterfaceC56392iX A04;
    public final C1810981l A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final ViewStub A08;

    public C8EL(ViewStub viewStub, ViewStub viewStub2, ComponentActivity componentActivity, UserSession userSession, C1810981l c1810981l) {
        C14360o3.A0B(componentActivity, 1);
        C14360o3.A0B(c1810981l, 3);
        C14360o3.A0B(viewStub, 4);
        C14360o3.A0B(viewStub2, 5);
        this.A02 = componentActivity;
        this.A03 = userSession;
        this.A05 = c1810981l;
        this.A01 = viewStub;
        this.A08 = viewStub2;
        this.A07 = C1XM.A00(new C9E4(this, 42));
        this.A04 = AbstractC56372iV.A01(viewStub2, false, false);
        this.A06 = AbstractC09440dt.A01(new C9E4(this, 41));
        this.A00 = new ValueAnimator.AnimatorUpdateListener() { // from class: X.8EM
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C14360o3.A0B(valueAnimator, 0);
                View view = C8EL.this.A04.getView();
                Object animatedValue = valueAnimator.getAnimatedValue();
                C14360o3.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                view.setAlpha(((Number) animatedValue).floatValue());
            }
        };
    }
}
