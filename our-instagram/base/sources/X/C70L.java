package X;

import android.view.View;

/* renamed from: X.70L, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C70L {
    public final C55982hj A00;

    public C70L(final View view, final View view2, C55942hf c55942hf) {
        C14360o3.A0B(view2, 2);
        C14360o3.A0B(c55942hf, 4);
        C55982hj A02 = AbstractC13560mi.A00().A02();
        A02.A00 = 0.019999999552965164d;
        A02.A05 = c55942hf;
        A02.A0A(new C668630d() { // from class: X.70M
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
            
                if (r0.doubleValue() != 1.0d) goto L7;
             */
            @Override // X.C668630d, X.InterfaceC55932he
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void Dnk(X.C55982hj r6) {
                /*
                    r5 = this;
                    if (r6 == 0) goto L17
                    X.2hk r0 = r6.A09
                    double r0 = r0.A00
                    java.lang.Double r0 = java.lang.Double.valueOf(r0)
                    r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                    if (r0 == 0) goto L17
                    double r1 = r0.doubleValue()
                    int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    r2 = 1
                    if (r0 == 0) goto L18
                L17:
                    r2 = 0
                L18:
                    android.view.View r1 = r1
                    r0 = 4
                    if (r2 == 0) goto L1e
                    r0 = 0
                L1e:
                    r1.setVisibility(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C70M.Dnk(X.2hj):void");
            }

            /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
            
                if (r2 != 1.0d) goto L7;
             */
            @Override // X.C668630d, X.InterfaceC55932he
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void Dnl(X.C55982hj r7) {
                /*
                    r6 = this;
                    if (r7 == 0) goto L1a
                    double r0 = r7.A01
                    java.lang.Double r0 = java.lang.Double.valueOf(r0)
                    r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                    if (r0 == 0) goto L15
                    double r2 = r0.doubleValue()
                    int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    r0 = 1
                    if (r1 == 0) goto L16
                L15:
                    r0 = 0
                L16:
                    r0 = r0 ^ 1
                    r7.A06 = r0
                L1a:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C70M.Dnl(X.2hj):void");
            }

            @Override // X.C668630d, X.InterfaceC55932he
            public final void Dnm(C55982hj c55982hj) {
                if (c55982hj != null) {
                    double d = c55982hj.A09.A00;
                    view.setAlpha((float) d);
                    View view3 = view2;
                    float f = (float) ((d * (1.0f - 0.8f)) + 0.800000011920929d);
                    view3.setScaleX(Math.signum(view3.getScaleX()) * f);
                    view3.setScaleY(Math.signum(view3.getScaleY()) * f);
                }
                view.setVisibility(0);
            }
        });
        this.A00 = A02;
    }
}
