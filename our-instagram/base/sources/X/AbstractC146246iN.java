package X;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.facebook.systrace.Systrace;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.6iN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC146246iN extends BaseAdapter implements C41P {
    public final CopyOnWriteArrayList A00 = new CopyOnWriteArrayList();

    @Override // X.C41P
    public final void EDg(C3VX c3vx) {
        C14360o3.A0B(c3vx, 0);
        this.A00.addIfAbsent(c3vx);
    }

    @Override // X.C41P
    public final void F9h(C3VX c3vx) {
        C14360o3.A0B(c3vx, 0);
        this.A00.remove(c3vx);
    }

    @Override // android.widget.Adapter
    public abstract View getView(int i, View view, ViewGroup viewGroup);

    public void CtM() {
        super.notifyDataSetChanged();
        Iterator it = this.A00.iterator();
        C14360o3.A07(it);
        while (it.hasNext()) {
            ReboundViewPager reboundViewPager = ((C3VX) it.next()).A00;
            if (Systrace.A0E(1L)) {
                C0fO.A01("ReboundViewPagerDataSetObserver.onItemsAddedOrRemoved", 1082415095);
            }
            try {
                ReboundViewPager.A06(reboundViewPager, false, false);
                int i = reboundViewPager.A08;
                if (i < reboundViewPager.A0D) {
                    reboundViewPager.A0D = i;
                }
                if (Systrace.A0E(1L)) {
                    C0fO.A00(-1307732947);
                }
            } catch (Throwable th) {
                if (Systrace.A0E(1L)) {
                    C0fO.A00(1514651785);
                }
                throw th;
            }
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Iterator it = this.A00.iterator();
        C14360o3.A07(it);
        while (it.hasNext()) {
            ((DataSetObserver) it.next()).onChanged();
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Iterator it = this.A00.iterator();
        C14360o3.A07(it);
        while (it.hasNext()) {
            ((DataSetObserver) it.next()).onInvalidated();
        }
    }
}
