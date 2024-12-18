package X;

import android.graphics.PointF;
import android.graphics.RectF;
import com.google.common.collect.ImmutableList;

/* renamed from: X.VsI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69615VsI {
    public int A00;
    public C5M2 A01;
    public final C206409Bx A02;
    public final PointF A03;
    public final RectF A04;
    public final Integer A05;

    public final void A00() {
        int i = this.A00;
        ImmutableList immutableList = (ImmutableList) this.A02.A00;
        if (i < immutableList.size()) {
            int i2 = this.A00;
            this.A00 = i2 + 1;
            InterfaceC71848X7g interfaceC71848X7g = (InterfaceC71848X7g) immutableList.get(i2);
            C5M2 c5m2 = this.A01;
            C14360o3.A0A(interfaceC71848X7g);
            c5m2.DJv(this.A03, this.A04, interfaceC71848X7g, this.A05);
            if (!(interfaceC71848X7g instanceof XL8)) {
                A00();
            }
        }
    }

    public C69615VsI(PointF pointF, RectF rectF, C206409Bx c206409Bx, C5M2 c5m2, Integer num) {
        this.A02 = c206409Bx;
        this.A03 = pointF;
        this.A04 = rectF;
        this.A05 = num;
        this.A01 = c5m2;
    }
}
