package X;

import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class UBC extends BaseAdapter {
    public WQH A00;
    public boolean A01;
    public int A02 = -1;
    public final int A03;
    public final LayoutInflater A04;
    public final boolean A05;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r5 == r1) goto L12;
     */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
        /*
            r6 = this;
            r4 = 0
            if (r8 != 0) goto Lb
            android.view.LayoutInflater r1 = r6.A04
            int r0 = r6.A03
            android.view.View r8 = r1.inflate(r0, r9, r4)
        Lb:
            X.WQJ r0 = r6.getItem(r7)
            int r5 = r0.getGroupId()
            int r0 = r7 + (-1)
            if (r0 < 0) goto L44
            X.WQJ r0 = r6.getItem(r0)
            int r1 = r0.getGroupId()
        L1f:
            r3 = r8
            androidx.appcompat.view.menu.ListMenuItemView r3 = (androidx.appcompat.view.menu.ListMenuItemView) r3
            X.WQH r0 = r6.A00
            boolean r0 = r0.A0E()
            r2 = 1
            if (r0 == 0) goto L2e
            r0 = 1
            if (r5 != r1) goto L2f
        L2e:
            r0 = 0
        L2f:
            r3.setGroupDividerEnabled(r0)
            r1 = r8
            X.XBj r1 = (X.InterfaceC71934XBj) r1
            boolean r0 = r6.A01
            if (r0 == 0) goto L3c
            r3.setForceShowIcon(r2)
        L3c:
            X.WQJ r0 = r6.getItem(r7)
            r1.COF(r0, r4)
            return r8
        L44:
            r1 = r5
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UBC.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.Adapter
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final WQJ getItem(int i) {
        ArrayList A03;
        boolean z = this.A05;
        WQH wqh = this.A00;
        if (z) {
            wqh.A04();
            A03 = wqh.A08;
        } else {
            A03 = wqh.A03();
        }
        int i2 = this.A02;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (WQJ) A03.get(i);
    }

    public final void A01() {
        int i;
        WQH wqh = this.A00;
        WQJ wqj = wqh.A04;
        if (wqj != null) {
            wqh.A04();
            ArrayList arrayList = wqh.A08;
            int size = arrayList.size();
            i = 0;
            while (i < size) {
                if (arrayList.get(i) == wqj) {
                    break;
                } else {
                    i++;
                }
            }
        }
        i = -1;
        this.A02 = i;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList A03;
        boolean z = this.A05;
        WQH wqh = this.A00;
        if (z) {
            wqh.A04();
            A03 = wqh.A08;
        } else {
            A03 = wqh.A03();
        }
        int i = this.A02;
        int size = A03.size();
        if (i >= 0) {
            return size - 1;
        }
        return size;
    }

    public UBC(LayoutInflater layoutInflater, WQH wqh, int i, boolean z) {
        this.A05 = z;
        this.A04 = layoutInflater;
        this.A00 = wqh;
        this.A03 = i;
        A01();
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        A01();
        super.notifyDataSetChanged();
    }
}
