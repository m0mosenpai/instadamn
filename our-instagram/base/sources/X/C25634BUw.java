package X;

import android.view.View;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.ComponentsSystrace;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.BUw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25634BUw {
    public static final AtomicInteger A09 = new AtomicInteger();
    public final C2XE A03;
    public final boolean A06;
    public final ArrayList A05 = AbstractC166987dD.A1E();
    public int A00 = 0;
    public int A02 = -1;
    public int A01 = -1;
    public final C25629BUr A04 = new C25629BUr(this);
    public final BV2 A08 = new BV2(this);
    public final int A07 = 4;

    public static void A00(C25634BUw c25634BUw) {
        if (c25634BUw.A02 != -1 && c25634BUw.A01 != -1) {
            int i = c25634BUw.A00;
            int i2 = c25634BUw.A07;
            ArrayList arrayList = c25634BUw.A05;
            int min = Math.min(arrayList.size() - 1, i + i2);
            for (int max = Math.max(0, i - i2); max <= min; max++) {
                C25633BUv c25633BUv = (C25633BUv) arrayList.get(max);
                ComponentTree A00 = c25633BUv.A00();
                C25634BUw c25634BUw2 = c25633BUv.A04;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c25634BUw2.A02, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c25634BUw2.A01, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
                if (c25633BUv.A01) {
                    A00.A0O(c25633BUv.A00.A00, makeMeasureSpec, makeMeasureSpec2);
                    c25633BUv.A01 = false;
                } else {
                    ComponentTree.A06(null, A00, null, null, null, makeMeasureSpec, makeMeasureSpec2, 3, true, false);
                }
            }
        }
    }

    public final void A02(List list) {
        ArrayList arrayList = this.A05;
        int size = arrayList.size();
        C2XV.A00();
        ComponentsSystrace.A02("LithoViewPagerAdapter.insertItemsAt");
        int size2 = list.size();
        for (int i = 0; i < size2; i++) {
            C25633BUv c25633BUv = new C25633BUv(this);
            C170697jM c170697jM = (C170697jM) list.get(i);
            boolean z = c25633BUv.A01;
            boolean z2 = false;
            if (c170697jM != c25633BUv.A00) {
                z2 = true;
            }
            c25633BUv.A01 = z | z2;
            c25633BUv.A00 = c170697jM;
            arrayList.add(size + i, c25633BUv);
        }
        A00(this);
        this.A04.CtM();
        ComponentsSystrace.A01();
    }

    public C25634BUw(C2XE c2xe, boolean z) {
        this.A03 = c2xe;
        this.A06 = z;
    }

    public final void A01(ReboundViewPager reboundViewPager, int i) {
        C2XV.A00();
        reboundViewPager.A0O(this.A04, i);
        reboundViewPager.A0P(this.A08);
        reboundViewPager.A0L = new C25635BUx(this);
    }
}
