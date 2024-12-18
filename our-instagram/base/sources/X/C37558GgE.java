package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.GgE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37558GgE extends AbstractC65852TvD {
    public final java.util.Set A03 = AbstractC31171DnF.A0l();
    public int A00 = -1;
    public float A02 = -1.0f;
    public int A01 = -1;

    @Override // X.AbstractC65852TvD
    public final void A00(int i) {
        Integer num;
        if (i != 1) {
            if (i != 2) {
                num = C05F.A00;
            } else {
                num = C05F.A0C;
            }
        } else {
            num = C05F.A01;
        }
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            ((C38Y) it.next()).Dj0(num);
        }
    }

    @Override // X.AbstractC65852TvD
    public final void A01(int i) {
        if (i != -1) {
            if (this.A00 != -1) {
                Iterator it = this.A03.iterator();
                while (it.hasNext()) {
                    ((C38Y) it.next()).DXa(i, this.A00);
                }
            }
        } else {
            C0f5 AEp = C18950wb.A01.AEp("ClipsViewPagerImpl", 817902720);
            AEp.ABW(DialogModule.KEY_MESSAGE, "onPageSelected called with position = -1");
            AEp.report();
        }
        Iterator it2 = this.A03.iterator();
        while (it2.hasNext()) {
            ((C38Y) it2.next()).DXc(i, this.A00);
        }
        this.A01 = Math.max(this.A01, i);
        this.A00 = i;
    }

    @Override // X.AbstractC65852TvD
    public final void A02(int i, float f, int i2) {
        float f2 = i + f;
        if (f2 != -1.0f && this.A02 != -1.0f) {
            java.util.Set set = this.A03;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((C38Y) it.next()).Dim(f2, this.A02);
            }
            float f3 = this.A02;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i3 = (int) f3;
            linkedHashSet.add(Integer.valueOf(i3));
            if (f3 % 1.0f != 0.0f) {
                linkedHashSet.add(Integer.valueOf(i3 + 1));
            }
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            int i4 = (int) f2;
            linkedHashSet2.add(Integer.valueOf(i4));
            if (f2 % 1.0f != 0.0f) {
                linkedHashSet2.add(Integer.valueOf(i4 + 1));
            }
            if (!linkedHashSet.equals(linkedHashSet2)) {
                Iterator it2 = linkedHashSet.iterator();
                while (it2.hasNext()) {
                    int intValue = ((Number) it2.next()).intValue();
                    if (!linkedHashSet2.contains(Integer.valueOf(intValue))) {
                        Iterator it3 = set.iterator();
                        while (it3.hasNext()) {
                            ((C38Y) it3.next()).DXS(intValue);
                        }
                    }
                }
                Iterator it4 = linkedHashSet2.iterator();
                while (it4.hasNext()) {
                    int intValue2 = ((Number) it4.next()).intValue();
                    if (!linkedHashSet.contains(Integer.valueOf(intValue2))) {
                        Iterator it5 = set.iterator();
                        while (it5.hasNext()) {
                            ((C38Y) it5.next()).DXR(intValue2);
                        }
                    }
                }
            }
        } else if (f2 == -1.0f) {
            C0f5 AEp = C18950wb.A01.AEp("ClipsViewPagerImpl", 817902720);
            AEp.ABW(DialogModule.KEY_MESSAGE, "onPageScrolled called with positionOffset = -1");
            AEp.report();
        }
        this.A02 = f2;
    }
}
