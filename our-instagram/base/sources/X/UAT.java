package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.Choreographer;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes11.dex */
public final class UAT extends View {
    public final U8V A00;
    public final List A01;
    public final W2X A02;

    public UAT(Context context) {
        super(context, null, 0);
        this.A02 = new W2X(this, new X2o(this, 1));
        U8V u8v = new U8V(context);
        this.A00 = u8v;
        this.A01 = new ArrayList();
        setBackground(u8v);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        A00(this);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        C14360o3.A0B(view, 0);
        super.onVisibilityChanged(view, i);
        W2X.A00(this.A02);
    }

    public final void setListener(InterfaceC71851X7j interfaceC71851X7j) {
        this.A00.A01 = interfaceC71851X7j;
    }

    public static final void A00(UAT uat) {
        if (uat.getWidth() != 0 && uat.getHeight() != 0) {
            List<C68926VeQ> list = uat.A01;
            for (C68926VeQ c68926VeQ : list) {
                U8V u8v = uat.A00;
                RectF rectF = c68926VeQ.A00;
                List<C69606Vs9> list2 = c68926VeQ.A01;
                C14360o3.A0B(rectF, 0);
                if (!u8v.getBounds().isEmpty()) {
                    Context context = u8v.A02;
                    int A00 = AbstractC69815Vw1.A00(context, 1200.0f);
                    float A0F = ((AbstractC166997dE.A0F(u8v) - rectF.centerX()) / AbstractC166997dE.A0H(u8v)) * 1.5f;
                    float f = (rectF.left + rectF.right) / 2.0f;
                    float f2 = (rectF.top + rectF.bottom) / 2.0f;
                    HashMap hashMap = new HashMap();
                    List<C69206VjZ> list3 = u8v.A06;
                    for (C69206VjZ c69206VjZ : list3) {
                        hashMap.put(c69206VjZ.A03, c69206VjZ);
                    }
                    float A002 = AbstractC69815Vw1.A00(context, -300.0f);
                    float A003 = AbstractC69815Vw1.A00(context, -1000.0f);
                    float A004 = AbstractC69815Vw1.A00(context, 700.0f);
                    for (C69606Vs9 c69606Vs9 : list2) {
                        float f3 = 0.75f - 0.05f;
                        float A02 = 0.05f + (AbstractC50712Us.A01.A02() * f3);
                        Paint paint = new Paint();
                        paint.set(c69606Vs9.A01);
                        paint.setAlpha(255);
                        List list4 = u8v.A07;
                        Object obj = hashMap.get(c69606Vs9.A02.A03);
                        C14360o3.A0A(obj);
                        C69606Vs9 c69606Vs92 = new C69606Vs9(paint, (C69206VjZ) obj, c69606Vs9.A00);
                        C69627VsU c69627VsU = c69606Vs92.A04;
                        C69627VsU c69627VsU2 = c69606Vs9.A04;
                        float f4 = c69627VsU2.A05 + rectF.left;
                        float f5 = c69627VsU2.A06 + rectF.top;
                        float f6 = 1.0f - 0.95f;
                        c69627VsU.A05 = ((f - f4) * f6) + f4;
                        c69627VsU.A06 = ((f2 - f5) * f6) + f5;
                        c69627VsU.A03 = c69627VsU2.A03 * 0.95f;
                        c69627VsU.A04 = c69627VsU2.A04 * 0.95f;
                        c69627VsU.A02 = c69627VsU2.A02;
                        C69719VuE c69719VuE = c69606Vs92.A03;
                        c69719VuE.A05 = A02;
                        c69719VuE.A06 = A02;
                        c69719VuE.A01 = A00 * ((((A02 - 0.05f) / f3) * (1.0f - 0.75f)) + 0.75f);
                        c69719VuE.A04 = ((r18.A02() * (1.0f - (-1.0f))) - 1.0f) * 540.0f;
                        c69719VuE.A08 = AbstractC69815Vw1.A00(context, 200.0f) * (U8V.A00(-1.0f, 1.0f) + A0F);
                        c69719VuE.A09 = U8V.A00(A002, A003);
                        c69719VuE.A02 = A004;
                        list4.add(c69606Vs92);
                    }
                    int max = Math.max(0, 66 - list2.size());
                    for (int i = 0; i < max; i++) {
                        C50722Ut c50722Ut = AbstractC50712Us.A00;
                        C69206VjZ c69206VjZ2 = (C69206VjZ) AbstractC001800i.A0G(list3, c50722Ut);
                        AbstractC50712Us abstractC50712Us = AbstractC50712Us.A01;
                        float f7 = 1.5f - 0.1f;
                        float A022 = 0.1f + (abstractC50712Us.A02() * f7);
                        float A023 = 0.3f + (abstractC50712Us.A02() * (0.6f - 0.3f));
                        List list5 = u8v.A07;
                        C69606Vs9 c69606Vs93 = new C69606Vs9((Paint) AbstractC001800i.A0G(u8v.A05, c50722Ut), c69206VjZ2, abstractC50712Us.A08(1000L));
                        C69627VsU c69627VsU3 = c69606Vs93.A04;
                        c69627VsU3.A05 = U8V.A00(rectF.left, rectF.right);
                        c69627VsU3.A06 = U8V.A00(rectF.top, rectF.bottom);
                        c69627VsU3.A03 = A023;
                        c69627VsU3.A04 = A023;
                        c69627VsU3.A02 = abstractC50712Us.A02() * 360.0f;
                        C69719VuE c69719VuE2 = c69606Vs93.A03;
                        c69719VuE2.A01 = A00 * ((((A022 - 0.1f) / f7) * (1.0f - 0.75f)) + 0.75f);
                        c69719VuE2.A05 = A022;
                        c69719VuE2.A06 = A022;
                        int i2 = -1;
                        if (abstractC50712Us.A0A()) {
                            i2 = 1;
                        }
                        c69719VuE2.A04 = i2 * (270.0f + (abstractC50712Us.A02() * (540.0f - 270.0f)));
                        c69719VuE2.A08 = AbstractC69815Vw1.A00(context, 200.0f) * (U8V.A00(-1.0f, 1.0f) + A0F);
                        c69719VuE2.A09 = U8V.A00(A002, A003);
                        c69719VuE2.A02 = A004;
                        list5.add(c69606Vs93);
                    }
                    Choreographer choreographer = u8v.A04;
                    Choreographer.FrameCallback frameCallback = u8v.A03;
                    choreographer.removeFrameCallback(frameCallback);
                    choreographer.postFrameCallback(frameCallback);
                }
            }
            list.clear();
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        int A06 = C0f9.A06(-1219045195);
        super.onWindowVisibilityChanged(i);
        W2X w2x = this.A02;
        w2x.A00 = i;
        W2X.A00(w2x);
        C0f9.A0D(-215312546, A06);
    }
}
