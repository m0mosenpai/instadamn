package X;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.SsE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63700SsE implements InterfaceC65311Thn {
    public static final C63700SsE A00 = new Object();
    public static final C63136Sdh A01 = C63136Sdh.A01("c", "v", "i", "o");

    public static PointF A00(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    @Override // X.InterfaceC65311Thn
    public final /* bridge */ /* synthetic */ Object E3O(THX thx, float f) {
        if (thx.A0E() == C05F.A00) {
            thx.A0I();
        }
        thx.A0J();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        boolean z = false;
        while (thx.A0Q()) {
            int A0D = thx.A0D(A01);
            if (A0D != 0) {
                if (A0D != 1) {
                    if (A0D != 2) {
                        if (A0D != 3) {
                            thx.A0M();
                            thx.A0N();
                        } else {
                            arrayList3 = AbstractC63319ShS.A03(thx, f);
                        }
                    } else {
                        arrayList2 = AbstractC63319ShS.A03(thx, f);
                    }
                } else {
                    arrayList = AbstractC63319ShS.A03(thx, f);
                }
            } else {
                z = thx.A0R();
            }
        }
        thx.A0L();
        if (thx.A0E() == C05F.A01) {
            thx.A0K();
        }
        if (arrayList != null && arrayList2 != null && arrayList3 != null) {
            if (arrayList.isEmpty()) {
                return new C62934SYc(new PointF(), Collections.emptyList(), false);
            }
            int size = arrayList.size();
            PointF pointF = (PointF) arrayList.get(0);
            ArrayList A17 = AbstractC25225BEi.A17(size);
            for (int i = 1; i < size; i++) {
                PointF pointF2 = (PointF) arrayList.get(i);
                int i2 = i - 1;
                PointF pointF3 = (PointF) arrayList.get(i2);
                PointF pointF4 = (PointF) arrayList3.get(i2);
                PointF pointF5 = (PointF) arrayList2.get(i);
                PointF pointF6 = AbstractC63251Sg7.A00;
                A17.add(new C62933SYb(A00(pointF3, pointF4), A00(pointF2, pointF5), pointF2));
            }
            if (z) {
                PointF pointF7 = (PointF) arrayList.get(0);
                int i3 = size - 1;
                PointF pointF8 = (PointF) arrayList.get(i3);
                PointF pointF9 = (PointF) arrayList3.get(i3);
                PointF pointF10 = (PointF) arrayList2.get(0);
                PointF pointF11 = AbstractC63251Sg7.A00;
                A17.add(new C62933SYb(A00(pointF8, pointF9), A00(pointF7, pointF10), pointF7));
            }
            return new C62934SYc(pointF, A17, z);
        }
        throw AbstractC166987dD.A12("Shape data was missing information.");
    }
}
