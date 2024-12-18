package X;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.litho.ComponentHost;
import com.facebook.litho.ComponentsSystrace;

/* renamed from: X.3fv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C78893fv {
    public int A00;
    public int A01;
    public Canvas A02;
    public final /* synthetic */ ComponentHost A03;

    public C78893fv(ComponentHost componentHost) {
        this.A03 = componentHost;
    }

    public final void A00() {
        int i;
        if (this.A02 != null) {
            C005101q c005101q = this.A03.A0M;
            int A00 = c005101q.A00();
            int i2 = this.A00;
            while (true) {
                if (i2 < A00) {
                    C3h4 c3h4 = (C3h4) c005101q.A04(i2);
                    Object obj = c3h4.A04;
                    if (obj instanceof View) {
                        i = i2 + 1;
                        break;
                    }
                    if (c3h4.A02) {
                        boolean isTracing = ComponentsSystrace.A00.isTracing();
                        if (isTracing) {
                            String A0H = AbstractC79093gG.A00(c3h4.A01).A03.A0H();
                            C14360o3.A07(A0H);
                            ComponentsSystrace.A02(AnonymousClass001.A0R("draw: ", A0H));
                        }
                        C14360o3.A0C(obj, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
                        Drawable drawable = (Drawable) obj;
                        Canvas canvas = this.A02;
                        if (canvas != null) {
                            drawable.draw(canvas);
                            if (isTracing) {
                                ComponentsSystrace.A01();
                            }
                        } else {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                    i2++;
                } else {
                    i = this.A01;
                    break;
                }
            }
            this.A00 = i;
        }
    }
}
