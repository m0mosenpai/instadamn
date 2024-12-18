package X;

import android.graphics.RectF;
import android.opengl.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public final class Y2B {
    public float[] A01;
    public float[] A02;
    public float[] A03;
    public float[] A04;
    public final C178597wX A08;
    public final C200598u2 A09;
    public final C179877yd A0B;
    public final Map A0C;
    public final C72798XnL A0D;
    public final float[] A0E;
    public boolean A00 = false;
    public int A06 = 0;
    public int A05 = 0;
    public final RectF A07 = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
    public final Y12 A0A = new Y12();

    public final void A02() {
        if (this.A00) {
            Iterator A12 = AbstractC43593JPy.A12(this.A0C);
            while (A12.hasNext()) {
                C200598u2 c200598u2 = (C200598u2) A12.next();
                c200598u2.A05.DrA();
                c200598u2.A03 = false;
            }
        }
        this.A00 = false;
        this.A06 = 0;
        this.A05 = 0;
    }

    public final void A03(int i, int i2) {
        this.A06 = i;
        this.A05 = i2;
        Iterator A12 = AbstractC43593JPy.A12(this.A0C);
        while (A12.hasNext()) {
            ((C200598u2) A12.next()).A05.Dr3(i, i2);
        }
    }

    public Y2B(C178597wX c178597wX, C72798XnL c72798XnL, C179877yd c179877yd, C201608vp c201608vp) {
        this.A0B = c179877yd;
        this.A08 = c178597wX;
        C200598u2 c200598u2 = new C200598u2(c201608vp);
        this.A09 = c200598u2;
        this.A0D = c72798XnL;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.A0C = concurrentHashMap;
        concurrentHashMap.put(c200598u2, 1);
        float[] fArr = new float[16];
        this.A0E = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    public static void A00(Y2B y2b, C72850Xp6 c72850Xp6, Y68 y68, C81A c81a) {
        int i;
        int i2;
        if (c81a.BIA() == C05F.A00) {
            C201278vB c201278vB = y2b.A0A.A04;
            y2b.A04 = c201278vB.A03;
            synchronized (c72850Xp6) {
                i = c72850Xp6.A02;
            }
            synchronized (c72850Xp6) {
                i2 = c72850Xp6.A00;
            }
            float[] A07 = y68.A07(EnumC197888oz.A02, i, i2, 0, false);
            y2b.A02 = A07;
            c201278vB.A03 = A07;
        }
    }

    public final ArrayList A01() {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator A12 = AbstractC43593JPy.A12(this.A0C);
        while (A12.hasNext()) {
            C200598u2 c200598u2 = (C200598u2) A12.next();
            if (c200598u2.A08) {
                C81A c81a = c200598u2.A05;
                if (c81a.isEnabled() && !(c81a instanceof C201608vp)) {
                    AnonymousClass818 anonymousClass818 = c200598u2.A01;
                    if (anonymousClass818 != null) {
                        c200598u2.A00.A00 = anonymousClass818.A0E();
                    }
                    A1E.add(c200598u2.A00);
                }
            }
        }
        return A1E;
    }

    public final void A04(List list) {
        int i;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C200598u2 c200598u2 = (C200598u2) it.next();
            Map map = this.A0C;
            Number A0Q = AbstractC37300Gc1.A0Q(c200598u2, map);
            if (A0Q == null) {
                A0Q = 0;
                C72798XnL c72798XnL = this.A0D;
                C81A c81a = c200598u2.A05;
                c81a.EPl(new YCJ(c72798XnL, c200598u2));
                if (this.A00) {
                    c81a.Dr7(this.A0B);
                    c200598u2.A03 = true;
                    int i2 = this.A05;
                    if (i2 > 0 && (i = this.A06) > 0) {
                        c81a.Dr3(i, i2);
                        c81a.Dr8(this.A07);
                    }
                }
            }
            map.put(c200598u2, Integer.valueOf(A0Q.intValue() + 1));
        }
    }

    public final void A05(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C200598u2 c200598u2 = (C200598u2) it.next();
            Map map = this.A0C;
            Number A0Q = AbstractC37300Gc1.A0Q(c200598u2, map);
            if (A0Q == null) {
                android.util.Log.w("EffectManager", "Effect unregistered that wasn't previously registered");
            } else {
                int intValue = A0Q.intValue() - 1;
                Integer valueOf = Integer.valueOf(intValue);
                if (intValue <= 0) {
                    map.remove(c200598u2);
                    C81A c81a = c200598u2.A05;
                    c81a.EPl(null);
                    if (this.A00) {
                        c81a.DrA();
                        c200598u2.A03 = false;
                    }
                } else {
                    map.put(c200598u2, valueOf);
                }
            }
        }
    }
}
