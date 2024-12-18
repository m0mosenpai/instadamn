package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.7E1, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7E1 extends BaseAdapter {
    public AnonymousClass303 A00;
    public final boolean A01;

    public final void A08(InterfaceC65642y0 interfaceC65642y0, Object obj) {
        A09(interfaceC65642y0, obj, null);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public final void A06() {
        AnonymousClass303 anonymousClass303 = this.A00;
        anonymousClass303.A01 = 0;
        anonymousClass303.A07.clear();
        anonymousClass303.A03 = true;
    }

    public final void A09(InterfaceC65642y0 interfaceC65642y0, Object obj, Object obj2) {
        this.A00.A03(interfaceC65642y0, obj, obj2);
    }

    public final void A0A(List list) {
        if (this.A00 == null) {
            this.A00 = new AnonymousClass303(null, list);
            return;
        }
        throw new RuntimeException("Multi row adapter should only be initialized once.");
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return this.A00.A03;
    }

    public final String getBinderGroupName(int i) {
        return ((C3GA) this.A00.A05.get(i)).A01.getBinderGroupName();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.A00.A01;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return ((C3GA) this.A00.A05.get(i)).A02;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        return this.A00.A00(i);
    }

    public final int[] getModelIndex(Object obj) {
        return (int[]) this.A00.A07.get(obj);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View A01 = this.A00.A01(i, view, viewGroup);
        C13490mb c13490mb = C13490mb.A00;
        C13490mb.A00(viewGroup);
        c13490mb.A01(A01, getCount(), i);
        if (this.A01) {
            AnonymousClass303 anonymousClass303 = this.A00;
            boolean z = false;
            if (view == null) {
                z = true;
            }
            WFJ.A01(A01, anonymousClass303, i, z);
        }
        return A01;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return this.A00.A00;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i) {
        return ((C3GA) this.A00.A05.get(i)).A04;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (X.AbstractC65482xk.A01() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C7E1() {
        /*
            r2 = this;
            r2.<init>()
            boolean r0 = X.AbstractC65482xk.A00()
            if (r0 != 0) goto L10
            boolean r1 = X.AbstractC65482xk.A01()
            r0 = 0
            if (r1 == 0) goto L11
        L10:
            r0 = 1
        L11:
            r2.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7E1.<init>():void");
    }

    public final void A07() {
        super.notifyDataSetChanged();
    }

    public final void A0B(InterfaceC65642y0... interfaceC65642y0Arr) {
        A0A(Arrays.asList(interfaceC65642y0Arr));
    }

    public void FAg() {
        C0fA.A00(this, -1490594135);
    }
}
