package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Srf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63672Srf implements InterfaceC65629Tpq, InterfaceC65309Thl, InterfaceC65467Tkj, InterfaceC65628Tpp {
    public SQ3 A00;
    public List A01;
    public final Matrix A02;
    public final String A03;
    public final List A04;
    public final Paint A05;
    public final Path A06;
    public final RectF A07;
    public final RectF A08;
    public final Q2O A09;
    public final boolean A0A;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C63672Srf(X.SQ2 r10, X.Q2O r11, X.Ss0 r12, X.AbstractC63678Srl r13) {
        /*
            r9 = this;
            java.lang.String r6 = r12.A00
            boolean r8 = r12.A02
            java.util.List r2 = r12.A01
            java.util.ArrayList r7 = X.AbstractC25230BEn.A0q(r2)
            r1 = 0
        Lb:
            int r0 = r2.size()
            r3 = r11
            r5 = r13
            if (r1 >= r0) goto L25
            java.lang.Object r0 = r2.get(r1)
            X.Thm r0 = (X.InterfaceC65310Thm) r0
            X.Tki r0 = r0.EqE(r10, r11, r13)
            if (r0 == 0) goto L22
            r7.add(r0)
        L22:
            int r1 = r1 + 1
            goto Lb
        L25:
            r1 = 0
        L26:
            int r0 = r2.size()
            if (r1 >= r0) goto L40
            java.lang.Object r4 = r2.get(r1)
            X.Thm r4 = (X.InterfaceC65310Thm) r4
            boolean r0 = r4 instanceof X.Ss5
            if (r0 == 0) goto L3d
            X.Ss5 r4 = (X.Ss5) r4
        L38:
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
        L3d:
            int r1 = r1 + 1
            goto L26
        L40:
            r4 = 0
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63672Srf.<init>(X.SQ2, X.Q2O, X.Ss0, X.Srl):void");
    }

    public final List A00() {
        if (this.A01 == null) {
            this.A01 = AbstractC166987dD.A1E();
            int i = 0;
            while (true) {
                List list = this.A04;
                if (i >= list.size()) {
                    break;
                }
                Object obj = list.get(i);
                if (obj instanceof InterfaceC65629Tpq) {
                    this.A01.add(obj);
                }
                i++;
            }
        }
        return this.A01;
    }

    @Override // X.InterfaceC65467Tkj
    public final void AAj(C62961SZe c62961SZe, Object obj) {
        SQ3 sq3 = this.A00;
        if (sq3 != null) {
            sq3.A04(c62961SZe, obj);
        }
    }

    @Override // X.InterfaceC65628Tpp
    public final void AQR(Canvas canvas, Matrix matrix, int i) {
        boolean z;
        int A0H;
        if (!this.A0A) {
            Matrix matrix2 = this.A02;
            matrix2.set(matrix);
            SQ3 sq3 = this.A00;
            if (sq3 != null) {
                matrix2.preConcat(sq3.A00());
                AbstractC63308ShE abstractC63308ShE = sq3.A02;
                if (abstractC63308ShE == null) {
                    A0H = 100;
                } else {
                    A0H = AbstractC166987dD.A0H(abstractC63308ShE.A06());
                }
                i = (int) ((((A0H / 100.0f) * i) / 255.0f) * 255.0f);
            }
            if (this.A09.A0T) {
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    List list = this.A04;
                    if (i2 >= list.size()) {
                        break;
                    }
                    if ((list.get(i2) instanceof InterfaceC65628Tpp) && (i3 = i3 + 1) >= 2) {
                        if (i != 255) {
                            z = true;
                            RectF rectF = this.A07;
                            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                            Aho(matrix2, rectF, true);
                            Paint paint = this.A05;
                            paint.setAlpha(i);
                            canvas.saveLayer(rectF, paint);
                            i = 255;
                        }
                    } else {
                        i2++;
                    }
                }
            }
            z = false;
            List list2 = this.A04;
            for (int A03 = AbstractC31172DnG.A03(list2, 1); A03 >= 0; A03--) {
                Object obj = list2.get(A03);
                if (obj instanceof InterfaceC65628Tpp) {
                    ((InterfaceC65628Tpp) obj).AQR(canvas, matrix2, i);
                }
            }
            if (z) {
                canvas.restore();
            }
        }
    }

    @Override // X.InterfaceC65628Tpp
    public final void Aho(Matrix matrix, RectF rectF, boolean z) {
        Matrix matrix2 = this.A02;
        matrix2.set(matrix);
        SQ3 sq3 = this.A00;
        if (sq3 != null) {
            matrix2.preConcat(sq3.A00());
        }
        RectF rectF2 = this.A08;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        List list = this.A04;
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                InterfaceC65466Tki interfaceC65466Tki = (InterfaceC65466Tki) list.get(size);
                if (interfaceC65466Tki instanceof InterfaceC65628Tpp) {
                    ((InterfaceC65628Tpp) interfaceC65466Tki).Aho(matrix2, rectF2, z);
                    rectF.union(rectF2);
                }
            } else {
                return;
            }
        }
    }

    @Override // X.InterfaceC65629Tpq
    public final Path Bbd() {
        Matrix matrix = this.A02;
        matrix.reset();
        SQ3 sq3 = this.A00;
        if (sq3 != null) {
            matrix.set(sq3.A00());
        }
        Path path = this.A06;
        path.reset();
        if (!this.A0A) {
            List list = this.A04;
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                InterfaceC65466Tki interfaceC65466Tki = (InterfaceC65466Tki) list.get(size);
                if (interfaceC65466Tki instanceof InterfaceC65629Tpq) {
                    path.addPath(((InterfaceC65629Tpq) interfaceC65466Tki).Bbd(), matrix);
                }
            }
        }
        return path;
    }

    @Override // X.InterfaceC65309Thl
    public final void Dya() {
        this.A09.invalidateSelf();
    }

    @Override // X.InterfaceC65467Tkj
    public final void EKH(C63221SfR c63221SfR, C63221SfR c63221SfR2, List list, int i) {
        String str = this.A03;
        if (!c63221SfR.A02(str, i) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            C63221SfR c63221SfR3 = new C63221SfR(c63221SfR2);
            c63221SfR3.A01.add(str);
            c63221SfR2 = c63221SfR3;
            if (c63221SfR.A01(str, i)) {
                C63221SfR c63221SfR4 = new C63221SfR(c63221SfR3);
                c63221SfR4.A00 = this;
                list.add(c63221SfR4);
            }
        }
        if (!c63221SfR.A03(str, i)) {
            return;
        }
        int A00 = i + c63221SfR.A00(str, i);
        int i2 = 0;
        while (true) {
            List list2 = this.A04;
            if (i2 >= list2.size()) {
                return;
            }
            InterfaceC65466Tki interfaceC65466Tki = (InterfaceC65466Tki) list2.get(i2);
            if (interfaceC65466Tki instanceof InterfaceC65467Tkj) {
                ((InterfaceC65467Tkj) interfaceC65466Tki).EKH(c63221SfR, c63221SfR2, list, A00);
            }
            i2++;
        }
    }

    @Override // X.InterfaceC65466Tki
    public final String getName() {
        return this.A03;
    }

    @Override // X.InterfaceC65466Tki
    public final void ES5(List list, List list2) {
        int size = list.size();
        List list3 = this.A04;
        ArrayList A17 = AbstractC25225BEi.A17(size + list3.size());
        A17.addAll(list);
        int size2 = list3.size();
        while (true) {
            size2--;
            if (size2 >= 0) {
                InterfaceC65466Tki interfaceC65466Tki = (InterfaceC65466Tki) list3.get(size2);
                interfaceC65466Tki.ES5(A17, list3.subList(0, size2));
                A17.add(interfaceC65466Tki);
            } else {
                return;
            }
        }
    }

    public C63672Srf(Q2O q2o, Ss5 ss5, AbstractC63678Srl abstractC63678Srl, String str, List list, boolean z) {
        this.A05 = new Paint();
        this.A07 = AbstractC166987dD.A0X();
        this.A02 = AbstractC166987dD.A0Q();
        this.A06 = AbstractC166987dD.A0T();
        this.A08 = AbstractC166987dD.A0X();
        this.A03 = str;
        this.A09 = q2o;
        this.A0A = z;
        this.A04 = list;
        if (ss5 != null) {
            SQ3 sq3 = new SQ3(ss5);
            this.A00 = sq3;
            sq3.A03(abstractC63678Srl);
            this.A00.A02(this);
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            Object obj = list.get(size);
            if (obj instanceof InterfaceC65308Thk) {
                A1E.add(obj);
            }
        }
        int size2 = A1E.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                ((InterfaceC65308Thk) A1E.get(size2)).A75(AbstractC43592JPx.A14(list));
            }
        }
    }
}
