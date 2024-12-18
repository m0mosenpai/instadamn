package X;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.WkE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70910WkE implements InterfaceC65282xQ, InterfaceC65272xP {
    public final /* synthetic */ C37443GeN A00;
    public final /* synthetic */ InterfaceC65282xQ A01;

    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ void A8q(Object obj, int i) {
    }

    @Override // X.InterfaceC65282xQ
    public final void AVK() {
        this.A01.AVK();
    }

    @Override // X.InterfaceC61772re, X.InterfaceC61782rf
    public final C75113Zb BRZ(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        return this.A01.BRZ(c38321qM);
    }

    @Override // X.InterfaceC65282xQ
    public final boolean CSO() {
        return this.A01.CSO();
    }

    @Override // X.InterfaceC65282xQ
    public final void Ct5() {
        this.A01.Ct5();
    }

    @Override // X.InterfaceC65232xL
    public final void CtR(C38321qM c38321qM) {
        this.A01.CtR(c38321qM);
    }

    @Override // X.InterfaceC65272xP
    public final void ETA(InterfaceC686036x interfaceC686036x) {
        C14360o3.A0B(interfaceC686036x, 0);
        this.A00.A03(interfaceC686036x);
    }

    @Override // X.InterfaceC65272xP
    public final void EUR(C33P c33p) {
        C14360o3.A0B(c33p, 0);
        this.A00.A03 = c33p;
    }

    @Override // X.InterfaceC65282xQ, android.widget.Adapter
    public final int getCount() {
        return this.A01.getCount();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.A01.getItem(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return this.A01.getItemId(i);
    }

    @Override // android.widget.Adapter
    public final int getItemViewType(int i) {
        return this.A01.getItemViewType(i);
    }

    @Override // X.InterfaceC65282xQ
    public final int[] getModelIndex(Object obj) {
        return this.A01.getModelIndex(obj);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        this.A01.getView(i, view, viewGroup);
        throw null;
    }

    @Override // android.widget.Adapter
    public final int getViewTypeCount() {
        this.A01.getViewTypeCount();
        throw null;
    }

    @Override // android.widget.Adapter
    public final boolean hasStableIds() {
        return this.A01.hasStableIds();
    }

    @Override // android.widget.Adapter
    public final boolean isEmpty() {
        return this.A01.isEmpty();
    }

    @Override // X.InterfaceC65282xQ, android.widget.Adapter
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.A01.registerDataSetObserver(dataSetObserver);
    }

    @Override // X.InterfaceC65282xQ, android.widget.Adapter
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.A01.unregisterDataSetObserver(dataSetObserver);
    }

    public C70910WkE(C66362zD c66362zD, C37443GeN c37443GeN) {
        this.A00 = c37443GeN;
        this.A01 = new C70911WkF(c66362zD, c37443GeN);
    }

    @Override // X.InterfaceC65272xP
    public final String getBinderGroupName(int i) {
        String binderGroupName = this.A00.getBinderGroupName();
        C14360o3.A07(binderGroupName);
        return binderGroupName;
    }

    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ int BK6(String str) {
        return -1;
    }

    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ List CCN() {
        return AbstractC166987dD.A1E();
    }

    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ Object EFR(int i) {
        return null;
    }
}
