package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class Q9n extends AbstractC61597RqM {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public int A07;
    public String A08;
    public int[] A09;
    public final Matrix A0A;
    public final Matrix A0B;
    public final ArrayList A0C;

    /* JADX WARN: Type inference failed for: r3v3, types: [X.Q9l, X.Q9m] */
    public Q9n(C20030yX c20030yX, Q9n q9n) {
        AbstractC58791Q9m abstractC58791Q9m;
        this.A0B = AbstractC166987dD.A0Q();
        this.A0C = AbstractC166987dD.A1E();
        this.A02 = 0.0f;
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        this.A03 = 1.0f;
        this.A04 = 1.0f;
        this.A05 = 0.0f;
        this.A06 = 0.0f;
        Matrix A0Q = AbstractC166987dD.A0Q();
        this.A0A = A0Q;
        this.A08 = null;
        this.A02 = q9n.A02;
        this.A00 = q9n.A00;
        this.A01 = q9n.A01;
        this.A03 = q9n.A03;
        this.A04 = q9n.A04;
        this.A05 = q9n.A05;
        this.A06 = q9n.A06;
        this.A09 = q9n.A09;
        String str = q9n.A08;
        this.A08 = str;
        this.A07 = q9n.A07;
        if (str != null) {
            c20030yX.put(str, this);
        }
        A0Q.set(q9n.A0A);
        ArrayList arrayList = q9n.A0C;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof Q9n) {
                this.A0C.add(new Q9n(c20030yX, (Q9n) obj));
            } else {
                if (obj instanceof Q9l) {
                    Q9l q9l = (Q9l) obj;
                    ?? abstractC58791Q9m2 = new AbstractC58791Q9m(q9l);
                    abstractC58791Q9m2.A03 = 0.0f;
                    abstractC58791Q9m2.A01 = 1.0f;
                    abstractC58791Q9m2.A00 = 1.0f;
                    abstractC58791Q9m2.A06 = 0.0f;
                    abstractC58791Q9m2.A04 = 1.0f;
                    abstractC58791Q9m2.A05 = 0.0f;
                    abstractC58791Q9m2.A07 = Paint.Cap.BUTT;
                    abstractC58791Q9m2.A08 = Paint.Join.MITER;
                    abstractC58791Q9m2.A02 = 4.0f;
                    abstractC58791Q9m2.A0B = q9l.A0B;
                    abstractC58791Q9m2.A0A = q9l.A0A;
                    abstractC58791Q9m2.A03 = q9l.A03;
                    abstractC58791Q9m2.A01 = q9l.A01;
                    abstractC58791Q9m2.A09 = q9l.A09;
                    abstractC58791Q9m2.A01 = ((AbstractC58791Q9m) q9l).A01;
                    abstractC58791Q9m2.A00 = q9l.A00;
                    abstractC58791Q9m2.A06 = q9l.A06;
                    abstractC58791Q9m2.A04 = q9l.A04;
                    abstractC58791Q9m2.A05 = q9l.A05;
                    abstractC58791Q9m2.A07 = q9l.A07;
                    abstractC58791Q9m2.A08 = q9l.A08;
                    abstractC58791Q9m2.A02 = q9l.A02;
                    abstractC58791Q9m = abstractC58791Q9m2;
                } else if (obj instanceof Q9k) {
                    abstractC58791Q9m = new AbstractC58791Q9m((AbstractC58791Q9m) obj);
                } else {
                    throw AbstractC166987dD.A14("Unknown object in the tree!");
                }
                this.A0C.add(abstractC58791Q9m);
                Object obj2 = abstractC58791Q9m.A02;
                if (obj2 != null) {
                    c20030yX.put(obj2, abstractC58791Q9m);
                }
            }
        }
    }

    public static void A00(Q9n q9n) {
        Matrix matrix = q9n.A0A;
        matrix.reset();
        matrix.postTranslate(-q9n.A00, -q9n.A01);
        matrix.postScale(q9n.A03, q9n.A04);
        matrix.postRotate(q9n.A02, 0.0f, 0.0f);
        matrix.postTranslate(q9n.A05 + q9n.A00, q9n.A06 + q9n.A01);
    }

    public String getGroupName() {
        return this.A08;
    }

    public Matrix getLocalMatrix() {
        return this.A0A;
    }

    public float getPivotX() {
        return this.A00;
    }

    public float getPivotY() {
        return this.A01;
    }

    public float getRotation() {
        return this.A02;
    }

    public float getScaleX() {
        return this.A03;
    }

    public float getScaleY() {
        return this.A04;
    }

    public float getTranslateX() {
        return this.A05;
    }

    public float getTranslateY() {
        return this.A06;
    }

    public void setPivotX(float f) {
        if (f != this.A00) {
            this.A00 = f;
            A00(this);
        }
    }

    public void setPivotY(float f) {
        if (f != this.A01) {
            this.A01 = f;
            A00(this);
        }
    }

    public void setRotation(float f) {
        if (f != this.A02) {
            this.A02 = f;
            A00(this);
        }
    }

    public void setScaleX(float f) {
        if (f != this.A03) {
            this.A03 = f;
            A00(this);
        }
    }

    public void setScaleY(float f) {
        if (f != this.A04) {
            this.A04 = f;
            A00(this);
        }
    }

    public void setTranslateX(float f) {
        if (f != this.A05) {
            this.A05 = f;
            A00(this);
        }
    }

    public void setTranslateY(float f) {
        if (f != this.A06) {
            this.A06 = f;
            A00(this);
        }
    }

    public Q9n() {
        this.A0B = AbstractC166987dD.A0Q();
        this.A0C = AbstractC166987dD.A1E();
        this.A02 = 0.0f;
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        this.A03 = 1.0f;
        this.A04 = 1.0f;
        this.A05 = 0.0f;
        this.A06 = 0.0f;
        this.A0A = AbstractC166987dD.A0Q();
        this.A08 = null;
    }
}
