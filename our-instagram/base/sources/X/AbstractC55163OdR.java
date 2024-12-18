package X;

import android.view.View;
import android.view.animation.RotateAnimation;

/* renamed from: X.OdR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55163OdR {
    public static final C55942hf A00 = C55942hf.A03(5.0d, 10.0d);

    public static final AbstractC125325le A01(View view) {
        C14360o3.A0B(view, 0);
        AbstractC125325le A0A = AbstractC43592JPx.A0o(view, 0).A0E(A00).A0A();
        A0A.A0M(0.0f, 1.0f);
        A0A.A0U(0.0f, 1.0f, -1.0f);
        A0A.A0V(0.0f, 1.0f, -1.0f);
        A0A.A04 = 0;
        return A0A;
    }

    public static final void A02(View view, InterfaceC125355lh interfaceC125355lh) {
        C14360o3.A0B(view, 0);
        AbstractC125325le A0A = AbstractC43592JPx.A0o(view, 0).A0B(0.5f).A0A();
        A0A.A0M(0.0f, 1.0f);
        A0A.A05 = interfaceC125355lh;
        A0A.A0H();
    }

    public static final void A03(View view, InterfaceC125355lh interfaceC125355lh) {
        C14360o3.A0B(view, 0);
        AbstractC125325le A0E = AbstractC43592JPx.A0o(view, 0).A0E(A00);
        A0E.A0U(1.0f, 0.5f, AbstractC166987dD.A07(view) / 2.0f);
        A0E.A0V(1.0f, 0.5f, AbstractC166987dD.A08(view) / 2.0f);
        A0E.A0J(view.getTranslationX() + (view.getWidth() / 4));
        A0E.A0K(view.getTranslationY() + (view.getHeight() / 4));
        A0E.A05 = interfaceC125355lh;
        A0E.A0H();
    }

    public static final RotateAnimation A00() {
        RotateAnimation rotateAnimation = new RotateAnimation(-15.0f, 20.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setRepeatMode(2);
        rotateAnimation.setRepeatCount(7);
        rotateAnimation.setDuration(200L);
        return rotateAnimation;
    }
}
