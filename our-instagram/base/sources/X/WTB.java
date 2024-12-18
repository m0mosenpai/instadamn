package X;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.facebook.R;
import com.instagram.ui.viewpager.IgWrapContentRtlViewPager;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class WTB implements InterfaceC021908q {
    public final int A00;
    public final Object A01;

    public WTB(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC021908q
    public final void onPageScrollStateChanged(int i) {
        if (3 - this.A00 == 0) {
            Iterator it = ((IgWrapContentRtlViewPager) this.A01).A02.iterator();
            while (it.hasNext()) {
                ((InterfaceC021908q) it.next()).onPageScrollStateChanged(i);
            }
        }
    }

    @Override // X.InterfaceC021908q
    public final void onPageScrolled(int i, float f, int i2) {
        View view;
        View view2;
        switch (this.A00) {
            case 2:
                ViewPager viewPager = ((C55907Ory) this.A01).A08;
                C14360o3.A0B(viewPager, 0);
                int childCount = viewPager.getChildCount();
                int i3 = 0;
                while (true) {
                    if (i3 < childCount) {
                        view = viewPager.getChildAt(i3);
                        Object tag = view.getTag(R.id.effect_info_attributions_item_view_holder);
                        if (!(tag instanceof OF7) || ((OF7) tag).A00 != i) {
                            i3++;
                        }
                    } else {
                        view = null;
                    }
                }
                int i4 = i + 1;
                int childCount2 = viewPager.getChildCount();
                int i5 = 0;
                while (true) {
                    if (i5 < childCount2) {
                        view2 = viewPager.getChildAt(i5);
                        Object tag2 = view2.getTag(R.id.effect_info_attributions_item_view_holder);
                        if (!(tag2 instanceof OF7) || ((OF7) tag2).A00 != i4) {
                            i5++;
                        }
                    } else {
                        view2 = null;
                    }
                }
                if (view != null) {
                    OUH.A00(view, 1.0f - f);
                }
                if (view2 == null) {
                    return;
                }
                OUH.A00(view2, f);
                return;
            case 3:
                Iterator it = ((IgWrapContentRtlViewPager) this.A01).A02.iterator();
                while (it.hasNext()) {
                    ((InterfaceC021908q) it.next()).onPageScrolled(i, f, i2);
                }
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC021908q
    public final void onPageSelected(int i) {
        C70399WUb c70399WUb;
        VG4 vg4;
        String str;
        C70399WUb A0N;
        VG4 vg42;
        String str2;
        C05A c05a;
        Object value;
        C66628UPq c66628UPq;
        switch (this.A00) {
            case 0:
                C67870V0b c67870V0b = (C67870V0b) this.A01;
                AbstractC13880nE.A0O(c67870V0b.mView);
                if (i != 0) {
                    if (i == 1 && (c70399WUb = c67870V0b.A02) != null) {
                        vg4 = VG4.A0z;
                        str = "local_tab";
                    } else {
                        return;
                    }
                } else {
                    c70399WUb = c67870V0b.A02;
                    if (c70399WUb != null) {
                        vg4 = VG4.A0z;
                        str = "region_tab";
                    } else {
                        return;
                    }
                }
                c70399WUb.A0G(vg4, str);
                return;
            case 1:
                V0K v0k = (V0K) this.A01;
                AbstractC13880nE.A0O(v0k.mView);
                if (i != 0) {
                    if (i == 1) {
                        A0N = AbstractC65702TsY.A0N(v0k.A05);
                        vg42 = VG4.A0z;
                        str2 = "local_tab";
                    }
                    c05a = ((UFT) v0k.A07.getValue()).A02.A04;
                    do {
                        value = c05a.getValue();
                        c66628UPq = (C66628UPq) value;
                    } while (!c05a.AIi(value, C66628UPq.A00(c66628UPq.A03, c66628UPq.A02, c66628UPq.A05, c66628UPq.A04, i, c66628UPq.A01, c66628UPq.A06)));
                    return;
                }
                A0N = AbstractC65702TsY.A0N(v0k.A05);
                vg42 = VG4.A0z;
                str2 = "region_tab";
                A0N.A0G(vg42, str2);
                c05a = ((UFT) v0k.A07.getValue()).A02.A04;
                do {
                    value = c05a.getValue();
                    c66628UPq = (C66628UPq) value;
                } while (!c05a.AIi(value, C66628UPq.A00(c66628UPq.A03, c66628UPq.A02, c66628UPq.A05, c66628UPq.A04, i, c66628UPq.A01, c66628UPq.A06)));
                return;
            case 2:
                C55907Ory.A02((C55907Ory) this.A01);
                return;
            default:
                Iterator it = ((IgWrapContentRtlViewPager) this.A01).A02.iterator();
                while (it.hasNext()) {
                    ((InterfaceC021908q) it.next()).onPageSelected(i);
                }
                return;
        }
    }
}
