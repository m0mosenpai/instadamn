package X;

import com.bloks.stdlib.components.bkcomponentscollection.StickyHeadersLinearLayoutManager;
import java.util.List;

/* loaded from: classes11.dex */
public final class UH1 extends AbstractC65392xb {
    public final /* synthetic */ StickyHeadersLinearLayoutManager A00;

    public UH1(StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager) {
        this.A00 = stickyHeadersLinearLayoutManager;
    }

    @Override // X.AbstractC65392xb
    public final void onChanged() {
        int i;
        List list;
        U48 u48;
        StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager = this.A00;
        List list2 = stickyHeadersLinearLayoutManager.A05;
        list2.clear();
        AbstractC65828Tul abstractC65828Tul = stickyHeadersLinearLayoutManager.A04;
        if (abstractC65828Tul != null) {
            i = abstractC65828Tul.getItemCount();
        } else {
            i = 0;
        }
        boolean z = true;
        for (int i2 = 0; i2 < i; i2++) {
            AbstractC65828Tul abstractC65828Tul2 = stickyHeadersLinearLayoutManager.A04;
            if (abstractC65828Tul2 != null && (list = abstractC65828Tul2.A03) != null && (u48 = (U48) list.get(i2)) != null && U4B.A00(u48.A01)) {
                MSX.A0u(i2, list2);
                if (i2 == stickyHeadersLinearLayoutManager.A02) {
                    z = false;
                }
            }
        }
        if (stickyHeadersLinearLayoutManager.A03 != null && z) {
            StickyHeadersLinearLayoutManager.A0I(null, stickyHeadersLinearLayoutManager);
        }
    }

    @Override // X.AbstractC65392xb
    public final void onItemRangeInserted(int i, int i2) {
        List list;
        U48 u48;
        StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager = this.A00;
        List list2 = stickyHeadersLinearLayoutManager.A05;
        int size = list2.size();
        int A04 = StickyHeadersLinearLayoutManager.A04(stickyHeadersLinearLayoutManager, i);
        if (size > 0 && A04 != -1) {
            while (A04 < size) {
                list2.set(A04, Integer.valueOf(AbstractC31176DnK.A01(list2, A04) + i2));
                A04++;
            }
        }
        int i3 = i2 + i;
        while (i < i3) {
            AbstractC65828Tul abstractC65828Tul = stickyHeadersLinearLayoutManager.A04;
            if (abstractC65828Tul != null && (list = abstractC65828Tul.A03) != null && (u48 = (U48) list.get(i)) != null && U4B.A00(u48.A01)) {
                int A042 = StickyHeadersLinearLayoutManager.A04(stickyHeadersLinearLayoutManager, i);
                if (A042 != -1) {
                    list2.add(A042, Integer.valueOf(i));
                } else {
                    MSX.A0u(i, list2);
                }
            }
            i++;
        }
    }

    @Override // X.AbstractC65392xb
    public final void onItemRangeRemoved(int i, int i2) {
        StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager = this.A00;
        List list = stickyHeadersLinearLayoutManager.A05;
        int size = list.size();
        if (size > 0) {
            boolean z = false;
            int i3 = i + i2;
            int i4 = i3 - 1;
            if (i <= i4) {
                while (true) {
                    int A1K = AbstractC16960so.A1K(Integer.valueOf(i4), list, list.size());
                    if (A1K >= 0) {
                        list.remove(Integer.valueOf(A1K));
                        size--;
                        if (A1K == stickyHeadersLinearLayoutManager.A02) {
                            z = true;
                        }
                    }
                    if (i4 == i) {
                        break;
                    } else {
                        i4--;
                    }
                }
            }
            if (stickyHeadersLinearLayoutManager.A03 != null && z) {
                StickyHeadersLinearLayoutManager.A0I(null, stickyHeadersLinearLayoutManager);
            }
            int A04 = StickyHeadersLinearLayoutManager.A04(stickyHeadersLinearLayoutManager, i3);
            if (A04 != -1) {
                while (A04 < size) {
                    list.set(A04, Integer.valueOf(-i2));
                    A04++;
                }
            }
        }
    }
}
