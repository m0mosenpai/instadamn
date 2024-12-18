package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.Adapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import com.facebook.common.dextricks.DexStore;
import java.lang.reflect.Field;
import java.util.List;

/* loaded from: classes8.dex */
public class JWK implements C3FQ {
    public InterfaceC65242xM A00;
    public InterfaceC65242xM A01;
    public final AbsListView A03;
    public final List A04 = AbstractC166987dD.A1E();
    public boolean A02 = false;
    public final AbsListView.OnScrollListener A05 = new LRB(this, 2);

    @Override // X.C3FQ
    public final boolean CXX() {
        return true;
    }

    @Override // X.C3FQ
    public final void Egn(boolean z) {
        this.A03.setVerticalScrollBarEnabled(true);
    }

    @Override // X.C3FQ
    public final void AAJ(C1I2 c1i2) {
        List list = this.A04;
        if (list.contains(c1i2)) {
            C0w9.A04("AbsListViewProxy", AnonymousClass001.A0R("Cannot add same listener twice: ", c1i2.getClass().getName()), DexStore.MS_IN_NS);
        } else {
            list.add(c1i2);
        }
        if (!this.A02) {
            this.A03.setOnScrollListener(this.A05);
            this.A02 = true;
        }
    }

    @Override // X.C3FQ
    public final void AI0() {
        this.A04.clear();
    }

    @Override // X.C3FQ
    public final InterfaceC65242xM AZU() {
        InterfaceC65242xM interfaceC65242xM = this.A01;
        if (interfaceC65242xM == null) {
            InterfaceC65242xM interfaceC65242xM2 = this.A00;
            if (interfaceC65242xM2 == null) {
                AbsListView absListView = this.A03;
                Adapter adapter = absListView.getAdapter();
                if (adapter == null) {
                    return null;
                }
                if (adapter instanceof InterfaceC65242xM) {
                    InterfaceC65242xM interfaceC65242xM3 = (InterfaceC65242xM) absListView.getAdapter();
                    this.A00 = interfaceC65242xM3;
                    return interfaceC65242xM3;
                }
                C49514LuT c49514LuT = new C49514LuT(adapter, this);
                this.A01 = c49514LuT;
                return c49514LuT;
            }
            return interfaceC65242xM2;
        }
        return interfaceC65242xM;
    }

    @Override // X.C3FQ
    public final View AnU(int i) {
        return this.A03.getChildAt(i);
    }

    @Override // X.C3FQ
    public final View AnW(int i) {
        AbsListView absListView = this.A03;
        return absListView.getChildAt(i - absListView.getFirstVisiblePosition());
    }

    @Override // X.C3FQ
    public final int AnZ() {
        return this.A03.getChildCount();
    }

    @Override // X.C3FQ
    public final int Ayo() {
        return ((ListView) this.A03).getDividerHeight();
    }

    @Override // X.C3FQ
    public final int B6q() {
        return this.A03.getFirstVisiblePosition();
    }

    @Override // X.C3FQ
    public final void BA7(Rect rect) {
        this.A03.getGlobalVisibleRect(rect);
    }

    @Override // X.C3FQ
    public final int BDJ() {
        AbsListView absListView = this.A03;
        if (absListView instanceof ListView) {
            return ((ListView) absListView).getHeaderViewsCount();
        }
        return 0;
    }

    @Override // X.C3FQ
    public final int BM3() {
        return this.A03.getLastVisiblePosition();
    }

    @Override // X.C3FQ
    public final /* bridge */ /* synthetic */ ViewGroup CFj() {
        return this.A03;
    }

    @Override // X.C3FQ
    public final boolean CQ5() {
        AbsListView absListView = this.A03;
        Field field = LJW.A00;
        C14360o3.A0B(absListView, 0);
        if (absListView.getChildCount() != 0 && absListView.getAdapter() != null) {
            int count = absListView.getAdapter().getCount() - 1;
            int childCount = absListView.getChildCount() - 1;
            int height = absListView.getHeight() - absListView.getPaddingBottom();
            if (absListView.getLastVisiblePosition() != count || absListView.getChildAt(childCount).getBottom() > height) {
                return false;
            }
        }
        return true;
    }

    @Override // X.C3FQ
    public final boolean CQ6() {
        AbsListView absListView = this.A03;
        Field field = LJW.A00;
        C14360o3.A0B(absListView, 0);
        if (absListView.getChildCount() == 0 || (absListView.getFirstVisiblePosition() == 0 && absListView.getChildAt(0).getTop() >= absListView.getPaddingTop())) {
            return true;
        }
        return false;
    }

    @Override // X.C3FQ
    public final boolean CV1() {
        return this.A03.isFocused();
    }

    @Override // X.C3FQ
    public final void EGF(C1I2 c1i2) {
        this.A04.remove(c1i2);
    }

    @Override // X.C3FQ
    public final void EMU(Fragment fragment) {
        AbstractC47119KsE.A00(this.A03, fragment);
    }

    @Override // X.C3FQ
    public final void EMV(boolean z) {
        AbsListView absListView = this.A03;
        Field field = LJW.A00;
        C14360o3.A0B(absListView, 0);
        int count = absListView.getCount();
        if (z) {
            if (count != 0 && absListView.getHeight() != 0) {
                absListView.smoothScrollToPosition(0);
                absListView.postDelayed(new M2W(absListView), 100L);
                return;
            }
            return;
        }
        if (count == 0 || absListView.getHeight() == 0) {
            return;
        }
        absListView.smoothScrollToPositionFromTop(0, 0, 0);
    }

    @Override // X.C3FQ
    public final void EPJ(InterfaceC65242xM interfaceC65242xM) {
        ListAdapter listAdapter;
        this.A00 = interfaceC65242xM;
        AbsListView absListView = this.A03;
        if (interfaceC65242xM == null) {
            listAdapter = null;
        } else {
            listAdapter = (ListAdapter) interfaceC65242xM.getAdapter();
        }
        absListView.setAdapter(listAdapter);
    }

    @Override // X.C3FQ
    public final void EcF(C42068Ikb c42068Ikb) {
        this.A03.setRecyclerListener(c42068Ikb);
    }

    @Override // X.C3FQ
    public final void EdY(int i) {
        this.A03.setSelection(i);
    }

    @Override // X.C3FQ
    public final void EdZ(int i, int i2) {
        this.A03.setSelectionFromTop(i, i2);
    }

    @Override // X.C3FQ
    public final void EmD(int i) {
        this.A03.smoothScrollToPosition(i);
    }

    @Override // X.C3FQ
    public final void EmE(int i, int i2) {
        this.A03.smoothScrollToPositionFromTop(i, i2);
    }

    @Override // X.C3FQ
    public final void EmF(int i, int i2, int i3) {
        this.A03.smoothScrollToPositionFromTop(i, i2, 150);
    }

    @Override // X.C3FQ
    public final void Eog() {
        this.A03.smoothScrollBy(0, 0);
    }

    @Override // X.C3FQ
    public final Context getContext() {
        return this.A03.getContext();
    }

    @Override // X.C3FQ
    public final int getCount() {
        return this.A03.getCount();
    }

    @Override // X.C3FQ
    public final ViewParent getParent() {
        return this.A03.getParent();
    }

    public JWK(AbsListView absListView) {
        this.A03 = absListView;
    }

    @Override // X.C3FQ
    public final int BMa(View view) {
        Object parent;
        while (true) {
            parent = view.getParent();
            if (!(parent instanceof View) || parent == this.A03) {
                break;
            }
            view = (View) parent;
        }
        AbsListView absListView = this.A03;
        if (parent == absListView) {
            for (int firstVisiblePosition = absListView.getFirstVisiblePosition(); firstVisiblePosition <= absListView.getLastVisiblePosition(); firstVisiblePosition++) {
                if (view == AnW(firstVisiblePosition)) {
                    return firstVisiblePosition;
                }
            }
        }
        return -1;
    }
}
