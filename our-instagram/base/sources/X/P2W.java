package X;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* loaded from: classes9.dex */
public final class P2W implements InterfaceC65282xQ {
    public C38321qM A00;

    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ void A8q(Object obj, int i) {
    }

    @Override // X.InterfaceC65282xQ
    public final void AVK() {
    }

    @Override // X.InterfaceC61772re, X.InterfaceC61782rf
    public final C75113Zb BRZ(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        return AbstractC37303Gc4.A0E(c38321qM);
    }

    @Override // X.InterfaceC65282xQ
    public final boolean CSO() {
        return false;
    }

    @Override // X.InterfaceC65282xQ
    public final void Ct5() {
    }

    @Override // X.InterfaceC65232xL
    public final void CtR(C38321qM c38321qM) {
    }

    @Override // X.InterfaceC65282xQ, android.widget.Adapter
    public final int getCount() {
        return 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final int getItemViewType(int i) {
        return 0;
    }

    @Override // X.InterfaceC65282xQ
    public final int[] getModelIndex(Object obj) {
        return null;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.widget.Adapter
    public final int getViewTypeCount() {
        return 0;
    }

    @Override // android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.Adapter
    public final boolean isEmpty() {
        return false;
    }

    @Override // X.InterfaceC65282xQ, android.widget.Adapter
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
    }

    @Override // X.InterfaceC65282xQ, android.widget.Adapter
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
    }

    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ List CCN() {
        return AbstractC166987dD.A1E();
    }

    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ int BK6(String str) {
        return -1;
    }

    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ Object EFR(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.A00;
    }
}
