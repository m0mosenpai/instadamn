package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import java.util.List;

/* renamed from: X.Obr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55130Obr {
    public static final C55130Obr A00 = new Object();

    public final int A02(Context context, List list, List list2, int i) {
        int i2 = 0;
        if (list2 == null || i == -1 || i >= list.size()) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            i3 += A00(context, (O7N) list2.get(i4));
            i2 += A00(context, (O7N) list.get(i4));
        }
        return i3 - i2;
    }

    public static final int A00(Context context, O7N o7n) {
        int i;
        if (o7n instanceof C52420NHq) {
            return ((C52420NHq) o7n).A00;
        }
        if (o7n instanceof C52419NHp) {
            return ((C52419NHp) o7n).A00;
        }
        if (o7n instanceof C52422NHs) {
            C51832Mva c51832Mva = ((C52422NHs) o7n).A04;
            int i2 = c51832Mva.A02 - c51832Mva.A05;
            i = AbstractC25230BEn.A06(i2, i2);
        } else if (o7n instanceof C52421NHr) {
            i = ((C52421NHr) o7n).A00;
        } else {
            throw B4Z.A00();
        }
        return AbstractC53880NsC.A00(context, i);
    }

    public static final void A01(View view, List list, List list2, int i) {
        C52419NHp c52419NHp;
        C52419NHp c52419NHp2;
        C52419NHp c52419NHp3;
        C52419NHp c52419NHp4;
        C52422NHs c52422NHs;
        if (view != null) {
            int i2 = Resources.getSystem().getDisplayMetrics().widthPixels;
            if (view.getLeft() <= 0 && view.getRight() >= i2 && (list.get(i) instanceof C52422NHs)) {
                int i3 = i - 1;
                Object A0O = AbstractC001800i.A0O(list, i3);
                if ((A0O instanceof C52419NHp) && (c52419NHp = (C52419NHp) A0O) != null) {
                    int i4 = c52419NHp.A00;
                    Object A0O2 = AbstractC001800i.A0O(list2, i3);
                    if ((A0O2 instanceof C52419NHp) && (c52419NHp2 = (C52419NHp) A0O2) != null) {
                        int i5 = i4 - c52419NHp2.A00;
                        int i6 = i + 1;
                        Object A0O3 = AbstractC001800i.A0O(list, i6);
                        if ((A0O3 instanceof C52419NHp) && (c52419NHp3 = (C52419NHp) A0O3) != null) {
                            int i7 = c52419NHp3.A00;
                            Object A0O4 = AbstractC001800i.A0O(list2, i6);
                            if ((A0O4 instanceof C52419NHp) && (c52419NHp4 = (C52419NHp) A0O4) != null) {
                                int i8 = i7 - c52419NHp4.A00;
                                if (AbstractC001800i.A0O(list, i) instanceof C52422NHs) {
                                    Object obj = list.get(i);
                                    if ((obj instanceof C52422NHs) && (c52422NHs = (C52422NHs) obj) != null) {
                                        list.set(i, new C52422NHs(c52422NHs.A04, c52422NHs.A00, c52422NHs.A01, i5, i8));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
