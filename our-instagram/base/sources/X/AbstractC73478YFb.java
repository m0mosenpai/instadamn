package X;

import android.graphics.Point;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.YFb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC73478YFb implements YQ3 {
    public float A00;
    public XO3 A04;
    public YQQ A05;
    public float[] A07;
    public final String A09;
    public float A01 = 1.0f;
    public int A03 = 16711935;
    public int A02 = 255;
    public Y13 A06 = Y13.A08;
    public final Point A08 = new Point();

    @Override // X.YQ3
    public YRN AMV() {
        return null;
    }

    public static PointF A00(PointF pointF, PointF pointF2) {
        PointF pointF3 = new PointF(pointF.x * 70.0f, pointF.y * 70.0f);
        return new PointF(pointF2.x - pointF3.x, pointF2.y - pointF3.y);
    }

    @Override // X.YQ3
    public final int AbQ() {
        if (!(this instanceof C72277Xaa) && !(this instanceof C72281Xae) && !(this instanceof C72286Xaj)) {
            if (this instanceof C72285Xai) {
                return 229;
            }
            return this.A02;
        }
        return 255;
    }

    @Override // X.YQ3
    public final String Aia() {
        if (this instanceof C72281Xae) {
            return "Eraser";
        }
        return this.A09;
    }

    @Override // X.YQ3
    public final float AwP() {
        if (this instanceof C72292Xap) {
            return 12.0f;
        }
        return (BTz() * 0.8f) + (BQ6() * 0.2f);
    }

    @Override // X.YQ3
    public final float BQ6() {
        if (!(this instanceof C72286Xaj)) {
            if (this instanceof C72277Xaa) {
                return 38.0f;
            }
            if (!(this instanceof C72281Xae) && !(this instanceof C72285Xai)) {
                if (this instanceof AbstractC72282Xaf) {
                    AbstractC72282Xaf abstractC72282Xaf = (AbstractC72282Xaf) this;
                    if (abstractC72282Xaf instanceof C72295Xas) {
                        return 120.0f;
                    }
                    if (!(abstractC72282Xaf instanceof C72292Xap)) {
                        if (abstractC72282Xaf instanceof C72291Xao) {
                            return 16.0f;
                        }
                        C18C.A07(null, "Must initialize brush size model");
                        throw C00O.createAndThrow();
                    }
                    return 40.0f;
                }
                return 0.0f;
            }
            return 80.0f;
        }
        return 40.0f;
    }

    @Override // X.YQ3
    public final float BTz() {
        if (this instanceof C72286Xaj) {
            return 7.0f;
        }
        if (this instanceof C72277Xaa) {
            return 3.0f;
        }
        if (this instanceof C72281Xae) {
            return 4.0f;
        }
        if (this instanceof C72285Xai) {
            return 16.0f;
        }
        if (this instanceof AbstractC72282Xaf) {
            AbstractC72282Xaf abstractC72282Xaf = (AbstractC72282Xaf) this;
            if (!(abstractC72282Xaf instanceof C72295Xas) && !(abstractC72282Xaf instanceof C72292Xap)) {
                if (abstractC72282Xaf instanceof C72291Xao) {
                    return 6.0f;
                }
                C18C.A07(null, "Must initialize brush size model");
                throw C00O.createAndThrow();
            }
            return 8.0f;
        }
        return 0.0f;
    }

    @Override // X.YQ3
    public final List CA2(W92 w92, List list) {
        if (this instanceof C72283Xag) {
            if (((C72283Xag) this) instanceof C72291Xao) {
                C14360o3.A0B(list, 1);
                PointF pointF = w92.A04;
                PointF pointF2 = new PointF(pointF.x, pointF.y);
                ArrayList A1E = AbstractC166987dD.A1E();
                if (!list.isEmpty()) {
                    int size = list.size();
                    while (true) {
                        int i = size - 1;
                        if (size <= 0) {
                            break;
                        }
                        PointF pointF3 = (PointF) list.get(i);
                        if (!pointF3.equals(pointF2.x, pointF2.y)) {
                            float f = pointF2.x - pointF3.x;
                            float f2 = pointF2.y - pointF3.y;
                            if (((float) Math.sqrt((f * f) + (f2 * f2))) > 30.0f) {
                                PointF pointF4 = new PointF(f, f2);
                                float f3 = pointF2.x - pointF3.x;
                                float f4 = pointF2.y - pointF3.y;
                                float sqrt = 1.0f / ((float) Math.sqrt((f3 * f3) + (f4 * f4)));
                                PointF pointF5 = new PointF(pointF4.x * sqrt, pointF4.y * sqrt);
                                PointF pointF6 = new PointF(-pointF5.y, pointF5.x);
                                PointF A00 = A00(pointF5, pointF2);
                                PointF pointF7 = new PointF(pointF6.x * 70.0f, pointF6.y * 70.0f);
                                PointF[] pointFArr = {new PointF(A00.x + pointF7.x, A00.y + pointF7.y), A00(pointF6, A00(pointF5, pointF2))};
                                PointF pointF8 = pointFArr[0];
                                PointF pointF9 = pointFArr[1];
                                W92 w922 = new W92(w92);
                                w922.A03 += 100;
                                A1E.add(w922);
                                W92 w923 = new W92(w92);
                                w923.A04 = pointF9;
                                w923.A03 += 200;
                                A1E.add(w923);
                                W92 w924 = new W92(w92);
                                w924.A04 = pointF2;
                                w924.A03 += 300;
                                A1E.add(w924);
                                W92 w925 = new W92(w92);
                                w925.A04 = pointF8;
                                w925.A03 += 400;
                                A1E.add(w925);
                                break;
                            }
                        }
                        size = i;
                    }
                }
                return A1E;
            }
            return null;
        }
        if (this instanceof C72278Xab) {
            return ((C72278Xab) this).A04.CA2(w92, list);
        }
        return CA2(w92, list);
    }

    @Override // X.YQ3
    public final boolean CN8() {
        if (!(this instanceof C72281Xae) && !(this instanceof C72295Xas)) {
            return false;
        }
        return true;
    }

    @Override // X.YQ3
    public final void EPb(int i) {
        if (this instanceof C72278Xab) {
            C72278Xab c72278Xab = (C72278Xab) this;
            ((AbstractC73478YFb) c72278Xab).A02 = i;
            c72278Xab.A04.EPb(i);
            return;
        }
        this.A02 = i;
    }

    @Override // X.YQ3
    public void EQD(Point point) {
        this.A08.set(point.x, point.y);
    }

    @Override // X.YQ3
    public final void EQL(Y13 y13) {
        if (this instanceof C72278Xab) {
            C72278Xab c72278Xab = (C72278Xab) this;
            c72278Xab.A06 = y13;
            c72278Xab.A04.EQL(y13);
        } else {
            if (this instanceof C72277Xaa) {
                C72277Xaa c72277Xaa = (C72277Xaa) this;
                C14360o3.A0B(y13, 0);
                c72277Xaa.A06 = y13;
                YQ3[] yq3Arr = c72277Xaa.A00;
                int i = 0;
                do {
                    yq3Arr[i].EQL(y13);
                    i++;
                } while (i < 3);
                return;
            }
            this.A06 = y13;
        }
    }

    @Override // X.YQ3
    public final void EeR(float f) {
        float f2;
        XOM xom;
        YQ3 yq3;
        if (this instanceof C72278Xab) {
            C72278Xab c72278Xab = (C72278Xab) this;
            ((AbstractC73478YFb) c72278Xab).A00 = f;
            yq3 = c72278Xab.A04;
        } else if (this instanceof C72277Xaa) {
            C72277Xaa c72277Xaa = (C72277Xaa) this;
            ((AbstractC73478YFb) c72277Xaa).A00 = f;
            YQ3[] yq3Arr = c72277Xaa.A00;
            int i = 0;
            do {
                yq3Arr[i].EeR(f);
                i++;
            } while (i < 3);
            yq3Arr[2].EeR(f);
            yq3Arr[1].EeR(70.0f + f);
            yq3 = yq3Arr[0];
        } else {
            if (this instanceof C72296Xat) {
                this.A00 = f;
                this.A01 = ((float) Math.sqrt(f)) / 2.0f;
                return;
            }
            if (this instanceof C72298Xav) {
                C72298Xav c72298Xav = (C72298Xav) this;
                ((AbstractC73478YFb) c72298Xav).A00 = f;
                ((AbstractC73478YFb) c72298Xav).A01 = ((float) Math.sqrt(f)) / 2.0f;
                f2 = ((f - 70.0f) / f) + 1.0f;
                xom = c72298Xav.A00;
            } else if (this instanceof C72297Xau) {
                C72297Xau c72297Xau = (C72297Xau) this;
                ((AbstractC73478YFb) c72297Xau).A00 = f;
                f2 = ((f - 1.5f) / f) + 0.1f;
                xom = c72297Xau.A00;
            } else {
                this.A00 = f;
                return;
            }
            C14360o3.A0A(xom);
            xom.A00(f2);
            return;
        }
        yq3.EeR(f);
    }

    @Override // X.YQ3
    public boolean isValid() {
        return AbstractC167007dF.A1W(this.A04);
    }

    public AbstractC73478YFb(String str) {
        this.A09 = str;
    }

    @Override // X.YQ3
    public void ERe(int i) {
        this.A03 = i;
    }
}
