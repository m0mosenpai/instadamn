package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.40r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C903240r implements C3ZQ {
    public C903240r A00;
    public C903240r A01;
    public final int A02;
    public final Object A03;
    public final /* synthetic */ C903040p A04;

    @Override // X.C3ZQ
    public final /* synthetic */ boolean DR6(Object obj) {
        return true;
    }

    @Override // X.C3ZQ
    public final /* synthetic */ void DR7(Object obj) {
    }

    public C903240r(C903040p c903040p, Object obj, int i) {
        this.A04 = c903040p;
        this.A02 = i;
        this.A03 = obj;
    }

    @Override // X.C3ZQ
    public final Object Ava() {
        return this.A03;
    }

    @Override // X.C3ZQ
    public final Iterable BWV(C206209Bd c206209Bd, C3AW c3aw, int i) {
        int i2;
        C3AV c3av;
        InterfaceC16660sJ interfaceC16660sJ;
        int i3;
        Iterator it = C903040p.A00(this.A04).iterator();
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        while (it.hasNext()) {
            Object obj = ((C09530e4) it.next()).A00;
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.common.uigraph.ListCarouselNode.CarouselItemNode<DataType of com.instagram.common.uigraph.ListCarouselNode.CarouselItemNode.getDistanceFromScreen$lambda$4, OnScreenKeyType of com.instagram.common.uigraph.ListCarouselNode.CarouselItemNode.getDistanceFromScreen$lambda$4>");
            int i6 = ((C903240r) obj).A02;
            if (i6 < i4) {
                i4 = i6;
            }
            if (i6 > i5) {
                i5 = i6;
            }
        }
        int i7 = this.A02;
        if (i7 < i4) {
            i2 = i7 - i4;
        } else {
            i2 = 0;
            if (i7 > i5) {
                i2 = i7 - i5;
            }
        }
        if (c3aw == null || (c3av = c3aw.A01) == null) {
            c3av = C903040p.A07;
        }
        C903240r[] c903240rArr = {this.A00, this.A01};
        C14360o3.A0B(c903240rArr, 0);
        List A0I = AbstractC009903n.A0I(c903240rArr);
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A0I, 10));
        for (Object obj2 : A0I) {
            if (C14360o3.A0K(obj2, this.A00)) {
                interfaceC16660sJ = c3av.A00;
                i3 = i2 - 1;
            } else if (C14360o3.A0K(obj2, this.A01)) {
                interfaceC16660sJ = c3av.A00;
                i3 = i2 + 1;
            } else {
                throw new IllegalArgumentException();
            }
            arrayList.add(new C09530e4(obj2, interfaceC16660sJ.invoke(Integer.valueOf(i3))));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (((Number) ((C09530e4) obj3).A01).intValue() > -1) {
                arrayList2.add(obj3);
            }
        }
        return arrayList2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[CarouselItemNode] data = ");
        sb.append(this.A03);
        return sb.toString();
    }
}
