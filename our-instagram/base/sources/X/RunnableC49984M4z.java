package X;

import android.app.Activity;
import android.graphics.RectF;
import android.view.View;
import android.view.Window;

/* renamed from: X.M4z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49984M4z implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ KFB A01;
    public final /* synthetic */ InterfaceC125355lh A02;

    public RunnableC49984M4z(View view, KFB kfb, InterfaceC125355lh interfaceC125355lh) {
        this.A00 = view;
        this.A01 = kfb;
        this.A02 = interfaceC125355lh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.A00;
        C55942hf c55942hf = C150956qv.A02;
        AbstractC125325le A0o = AbstractC43592JPx.A0o(view, 0);
        KFB kfb = this.A01;
        RectF rectF = kfb.A05;
        if (rectF != null) {
            float width = rectF.width();
            float f = kfb.A03;
            float f2 = width / f;
            float centerX = rectF.centerX();
            float centerY = rectF.centerY();
            float f3 = f / 2.0f;
            float f4 = kfb.A02 / 2.0f;
            A0o.A0U(f2, 1.0f, f3);
            A0o.A0V(f2, 1.0f, f4);
            A0o.A0S(centerX - f3, 0.0f);
            A0o.A0T(centerY - f4, 0.0f);
            A0o.A04 = 0;
            AbstractC125325le A0A = A0o.A0E(AbstractC43599JQf.A00).A0A();
            A0A.A05 = this.A02;
            A0A.A0H();
            Activity activity = kfb.A04;
            AbstractC56402iY.A02(activity, 0);
            Window window = activity.getWindow();
            if (window != null) {
                AbstractC56402iY.A07(window.getDecorView(), window, false);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
