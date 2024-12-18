package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class UBB extends BaseAdapter {
    public int A00 = -1;
    public final /* synthetic */ WPU A01;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            WPU wpu = this.A01;
            view = wpu.A02.inflate(wpu.A00, viewGroup, false);
        }
        ((InterfaceC71934XBj) view).COF(getItem(i), 0);
        return view;
    }

    public UBB(WPU wpu) {
        this.A01 = wpu;
        A01();
    }

    @Override // android.widget.Adapter
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final WQJ getItem(int i) {
        WQH wqh = this.A01.A05;
        wqh.A04();
        ArrayList arrayList = wqh.A08;
        int i2 = this.A00;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (WQJ) arrayList.get(i);
    }

    public final void A01() {
        int i;
        WQH wqh = this.A01.A05;
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
        this.A00 = i;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        WQH wqh = this.A01.A05;
        wqh.A04();
        int size = wqh.A08.size();
        if (this.A00 >= 0) {
            return size - 1;
        }
        return size;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        A01();
        super.notifyDataSetChanged();
    }
}
