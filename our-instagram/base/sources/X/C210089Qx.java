package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.9Qx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210089Qx {
    public final C210099Qy A00;
    public final List A01 = AbstractC166987dD.A1E();
    public final Map A02 = new EnumMap(EnumC172837mv.class);
    public final Map A03 = new EnumMap(EnumC172837mv.class);
    public final Map A04 = new EnumMap(EnumC172837mv.class);

    public static List A00(C210089Qx c210089Qx, Object obj) {
        C14360o3.A0B(obj, 0);
        return (List) c210089Qx.A02.get(obj);
    }

    public final C56302iJ A03(EnumC172837mv enumC172837mv, int i) {
        C14360o3.A0B(enumC172837mv, 0);
        List list = (List) this.A04.get(enumC172837mv);
        if (list != null && i < list.size()) {
            return (C56302iJ) list.get(i);
        }
        return null;
    }

    public final C22918A8o A04(EnumC172837mv enumC172837mv, int i) {
        C14360o3.A0B(enumC172837mv, 0);
        Object obj = this.A02.get(enumC172837mv);
        if (obj != null) {
            return (C22918A8o) ((List) obj).get(i);
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A01(C210089Qx c210089Qx, C22917A8n c22917A8n) {
        EnumC172837mv enumC172837mv = c22917A8n.A00;
        c210089Qx.A02.put(enumC172837mv, c22917A8n.A01);
        c210089Qx.A03.put(enumC172837mv, c22917A8n.A02);
        c210089Qx.A04.put(enumC172837mv, c22917A8n.A03);
        c210089Qx.A01.add(enumC172837mv);
    }

    public final void A05() {
        C210099Qy c210099Qy = this.A00;
        float f = c210099Qy.A00;
        float f2 = f / 2.0f;
        float f3 = f / 4.0f;
        float f4 = c210099Qy.A01;
        float f5 = f4 / 2.0f;
        int i = (int) f2;
        int i2 = (int) f4;
        int i3 = (int) f3;
        int i4 = (int) f5;
        EnumC172837mv enumC172837mv = EnumC172837mv.A08;
        C22918A8o c22918A8o = new C22918A8o(f4, f2, 0.0f, 0.0f);
        C22918A8o c22918A8o2 = new C22918A8o(f5, f3, 0.0f, f2);
        C22918A8o c22918A8o3 = new C22918A8o(f5, f3, f5, f2);
        float f6 = f2 + f3;
        ArrayList A1M = AbstractC16960so.A1M(c22918A8o, c22918A8o2, c22918A8o3, new C22918A8o(f5, f3, 0.0f, f6), new C22918A8o(f5, f3, f5, f6));
        int i5 = c210099Qy.A02;
        C56302iJ c56302iJ = new C56302iJ(0, i5);
        AbstractC166997dE.A1M(c56302iJ);
        C56302iJ c56302iJ2 = new C56302iJ(0, i5);
        AbstractC166997dE.A1M(c56302iJ2);
        c56302iJ2.A09 = 0.75f;
        C56302iJ c56302iJ3 = new C56302iJ(i5, 0);
        c56302iJ3.A0u = -1;
        c56302iJ3.A0F = 0;
        c56302iJ3.A0s = 0;
        c56302iJ3.A0M = 0;
        c56302iJ3.A05 = 0.5f;
        ArrayList A1M2 = AbstractC16960so.A1M(c56302iJ, c56302iJ2, c56302iJ3);
        C56302iJ A0O = AbstractC167007dF.A0O(i2, i, 0, -1);
        A0O.A0s = 0;
        A0O.A0M = 0;
        C56302iJ c56302iJ4 = new C56302iJ(i4, i3);
        c56302iJ4.A0u = 0;
        c56302iJ4.A0F = 0;
        c56302iJ4.A0s = 0;
        c56302iJ4.A0M = -1;
        c56302iJ4.A09 = 0.6666667f;
        C56302iJ c56302iJ5 = new C56302iJ(i4, i3);
        c56302iJ5.A0u = 0;
        c56302iJ5.A0F = 0;
        c56302iJ5.A0s = -1;
        c56302iJ5.A0M = 0;
        c56302iJ5.A09 = 0.6666667f;
        C56302iJ A0O2 = AbstractC167007dF.A0O(i4, i3, -1, 0);
        A0O2.A0s = 0;
        A0O2.A0M = -1;
        C56302iJ A0O3 = AbstractC167007dF.A0O(i4, i3, -1, 0);
        A0O3.A0s = -1;
        A0O3.A0M = 0;
        A02(this, enumC172837mv, A1M, A1M2, new C56302iJ[]{A0O, c56302iJ4, c56302iJ5, A0O2, A0O3});
    }

    public final void A06() {
        C210099Qy c210099Qy = this.A00;
        float f = c210099Qy.A00 / 2.0f;
        float f2 = c210099Qy.A01;
        float f3 = f2 / 2.0f;
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = (int) f3;
        EnumC172837mv enumC172837mv = EnumC172837mv.A09;
        ArrayList A1M = AbstractC16960so.A1M(new C22918A8o(f2, f, 0.0f, 0.0f), new C22918A8o(f3, f, 0.0f, f), new C22918A8o(f3, f, f3, f));
        int i4 = c210099Qy.A02;
        C56302iJ c56302iJ = new C56302iJ(0, i4);
        AbstractC166997dE.A1M(c56302iJ);
        C56302iJ c56302iJ2 = new C56302iJ(i4, 0);
        c56302iJ2.A0u = -1;
        c56302iJ2.A0F = 0;
        c56302iJ2.A0s = 0;
        c56302iJ2.A0M = 0;
        c56302iJ2.A05 = 0.5f;
        ArrayList A1M2 = AbstractC16960so.A1M(c56302iJ, c56302iJ2);
        C56302iJ A0O = AbstractC167007dF.A0O(i2, i, 0, -1);
        A0O.A0s = 0;
        A0O.A0M = 0;
        C56302iJ A0O2 = AbstractC167007dF.A0O(i3, i, -1, 0);
        A0O2.A0s = 0;
        A0O2.A0M = -1;
        C56302iJ A0O3 = AbstractC167007dF.A0O(i3, i, -1, 0);
        A0O3.A0s = -1;
        A0O3.A0M = 0;
        A02(this, enumC172837mv, A1M, A1M2, new C56302iJ[]{A0O, A0O2, A0O3});
    }

    public final void A07() {
        C210099Qy c210099Qy = this.A00;
        float f = c210099Qy.A00;
        float f2 = c210099Qy.A01 / 2.0f;
        int i = (int) f;
        int i2 = (int) f2;
        EnumC172837mv enumC172837mv = EnumC172837mv.A0F;
        ArrayList A1M = AbstractC16960so.A1M(new C22918A8o(f2, f, 0.0f, 0.0f), new C22918A8o(f2, f, f2, 0.0f));
        C56302iJ c56302iJ = new C56302iJ(c210099Qy.A02, 0);
        AbstractC166997dE.A1M(c56302iJ);
        ArrayList A1M2 = AbstractC16960so.A1M(c56302iJ);
        C56302iJ c56302iJ2 = new C56302iJ(i2, i);
        c56302iJ2.A0u = 0;
        c56302iJ2.A0F = 0;
        c56302iJ2.A0s = 0;
        c56302iJ2.A0M = -1;
        C56302iJ c56302iJ3 = new C56302iJ(i2, i);
        c56302iJ3.A0u = 0;
        c56302iJ3.A0F = 0;
        c56302iJ3.A0s = -1;
        c56302iJ3.A0M = 0;
        A02(this, enumC172837mv, A1M, A1M2, new C56302iJ[]{c56302iJ2, c56302iJ3});
    }

    public final void A08() {
        C210099Qy c210099Qy = this.A00;
        float f = c210099Qy.A00 / 3.0f;
        float f2 = c210099Qy.A01 / 2.0f;
        int i = (int) f;
        int i2 = (int) f2;
        EnumC172837mv enumC172837mv = EnumC172837mv.A0G;
        float f3 = 2.0f * f;
        ArrayList A1M = AbstractC16960so.A1M(new C22918A8o(f2, f, 0.0f, 0.0f), new C22918A8o(f2, f, f2, 0.0f), new C22918A8o(f2, f, 0.0f, f), new C22918A8o(f2, f, f2, f), new C22918A8o(f2, f, 0.0f, f3), new C22918A8o(f2, f, f2, f3));
        int i3 = c210099Qy.A02;
        C56302iJ c56302iJ = new C56302iJ(0, i3);
        AbstractC166997dE.A1M(c56302iJ);
        c56302iJ.A09 = 0.33333334f;
        C56302iJ c56302iJ2 = new C56302iJ(0, i3);
        AbstractC166997dE.A1M(c56302iJ2);
        c56302iJ2.A09 = 0.6666667f;
        C56302iJ c56302iJ3 = new C56302iJ(i3, 0);
        AbstractC166997dE.A1M(c56302iJ3);
        ArrayList A1M2 = AbstractC16960so.A1M(c56302iJ, c56302iJ2, c56302iJ3);
        C56302iJ c56302iJ4 = new C56302iJ(i2, i);
        c56302iJ4.A0u = 0;
        c56302iJ4.A0F = -1;
        c56302iJ4.A0s = 0;
        c56302iJ4.A0M = -1;
        C56302iJ A0O = AbstractC167007dF.A0O(i2, i, 0, -1);
        A0O.A0s = -1;
        A0O.A0M = 0;
        C56302iJ c56302iJ5 = new C56302iJ(i2, i);
        c56302iJ5.A0u = 0;
        c56302iJ5.A0F = 0;
        c56302iJ5.A0s = 0;
        c56302iJ5.A0M = -1;
        C56302iJ c56302iJ6 = new C56302iJ(i2, i);
        c56302iJ6.A0u = 0;
        c56302iJ6.A0F = 0;
        c56302iJ6.A0s = -1;
        c56302iJ6.A0M = 0;
        C56302iJ A0O2 = AbstractC167007dF.A0O(i2, i, -1, 0);
        A0O2.A0s = 0;
        A0O2.A0M = -1;
        C56302iJ A0O3 = AbstractC167007dF.A0O(i2, i, -1, 0);
        A0O3.A0s = -1;
        A0O3.A0M = 0;
        A02(this, enumC172837mv, A1M, A1M2, new C56302iJ[]{c56302iJ4, A0O, c56302iJ5, c56302iJ6, A0O2, A0O3});
    }

    public final void A09() {
        C210099Qy c210099Qy = this.A00;
        float f = c210099Qy.A00 / 2.0f;
        float f2 = c210099Qy.A01 / 2.0f;
        int i = (int) f;
        int i2 = (int) f2;
        EnumC172837mv enumC172837mv = EnumC172837mv.A0H;
        ArrayList A1M = AbstractC16960so.A1M(new C22918A8o(f2, f, 0.0f, 0.0f), new C22918A8o(f2, f, f2, 0.0f), new C22918A8o(f2, f, 0.0f, f), new C22918A8o(f2, f, f2, f));
        int i3 = c210099Qy.A02;
        C56302iJ c56302iJ = new C56302iJ(0, i3);
        AbstractC166997dE.A1M(c56302iJ);
        C56302iJ c56302iJ2 = new C56302iJ(i3, 0);
        AbstractC166997dE.A1M(c56302iJ2);
        ArrayList A1M2 = AbstractC16960so.A1M(c56302iJ, c56302iJ2);
        C56302iJ c56302iJ3 = new C56302iJ(i2, i);
        c56302iJ3.A0u = 0;
        c56302iJ3.A0F = -1;
        c56302iJ3.A0s = 0;
        c56302iJ3.A0M = -1;
        C56302iJ A0O = AbstractC167007dF.A0O(i2, i, 0, -1);
        A0O.A0s = -1;
        A0O.A0M = 0;
        C56302iJ A0O2 = AbstractC167007dF.A0O(i2, i, -1, 0);
        A0O2.A0s = 0;
        A0O2.A0M = -1;
        C56302iJ A0O3 = AbstractC167007dF.A0O(i2, i, -1, 0);
        A0O3.A0s = -1;
        A0O3.A0M = 0;
        A02(this, enumC172837mv, A1M, A1M2, new C56302iJ[]{c56302iJ3, A0O, A0O2, A0O3});
    }

    public C210089Qx(Context context, float f, float f2) {
        this.A00 = new C210099Qy(context, f, f2);
    }

    public static void A02(C210089Qx c210089Qx, EnumC172837mv enumC172837mv, List list, List list2, Object[] objArr) {
        A01(c210089Qx, new C22917A8n(enumC172837mv, list, list2, AbstractC16960so.A1M(objArr)));
    }
}
