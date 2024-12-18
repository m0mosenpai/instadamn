package X;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* renamed from: X.64v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1342864v {
    public int A00;
    public int A01;
    public Canvas A02;
    public final /* synthetic */ C126555nq A03;

    public C1342864v(C126555nq c126555nq) {
        this.A03 = c126555nq;
    }

    public final void A00() {
        int i;
        Canvas canvas;
        if (this.A02 != null) {
            int i2 = this.A00;
            C126555nq c126555nq = this.A03;
            int length = c126555nq.A04.length;
            while (true) {
                if (i2 < length) {
                    C3h4 c3h4 = c126555nq.A04[i2];
                    if (c3h4 != null) {
                        if (c3h4.A01.A06.A04 == C05F.A01) {
                            i = i2 + 1;
                            break;
                        } else if (c3h4.A02 && (canvas = this.A02) != null) {
                            Object obj = c3h4.A04;
                            C14360o3.A0C(obj, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
                            ((Drawable) obj).draw(canvas);
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
