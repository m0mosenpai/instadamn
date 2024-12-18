package X;

import android.view.View;

/* loaded from: classes11.dex */
public abstract class VK4 {
    public void A01(View view, float f) {
        if (!(this instanceof C67746UxI)) {
            if (this instanceof C67748UxK) {
                C67748UxK.A00(view, (C67748UxK) this);
                return;
            }
            if (this instanceof C67745UxH) {
                C67745UxH c67745UxH = (C67745UxH) this;
                C67729Uwv c67729Uwv = c67745UxH.A00;
                if (!C67729Uwv.A03(c67729Uwv) || f != 0.0f || c67729Uwv.A03) {
                    return;
                }
                int i = c67745UxH.A01.A0G;
                if (i != 4 && i != 1) {
                    return;
                }
                c67729Uwv.A0A.invoke();
                return;
            }
            C67747UxJ c67747UxJ = (C67747UxJ) this;
            int A01 = AbstractC31176DnK.A01(c67747UxJ.A05, 0) + C1H4.A01((AbstractC31176DnK.A01(r1, r1.size() - 1) - r3) * f);
            C69771Vv8 c69771Vv8 = c67747UxJ.A02;
            int max = Math.max(c69771Vv8.A01, c69771Vv8.A02 - A01);
            V45 v45 = c67747UxJ.A04;
            int i2 = c67747UxJ.A00;
            v45.A01 = i2;
            v45.A00 = max;
            V45.A00(v45);
            V45 v452 = c67747UxJ.A03;
            v452.A01 = i2;
            v452.A00 = A01;
            V45.A00(v452);
        }
    }

    public void A02(View view, int i) {
        if (this instanceof C67746UxI) {
            C67746UxI c67746UxI = (C67746UxI) this;
            if (i != 1) {
                if (i != 3 && i != 4) {
                    if (i == 5) {
                        if (c67746UxI.A00) {
                            c67746UxI.A01.A0W(4);
                        }
                    } else {
                        return;
                    }
                }
                c67746UxI.A00 = false;
                return;
            }
            c67746UxI.A00 = true;
            return;
        }
        if (this instanceof C67748UxK) {
            C67748UxK.A00(view, (C67748UxK) this);
        } else {
            if (this instanceof C67745UxH) {
                return;
            }
            ((C67747UxJ) this).A01.A00 = i;
        }
    }
}
