package X;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.WkF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70911WkF implements InterfaceC65282xQ, InterfaceC65272xP {
    public final /* synthetic */ C66362zD A03;
    public final /* synthetic */ C37443GeN A04;
    public final HashMap A02 = new HashMap();
    public final C65372xZ A00 = new DataSetObservable();
    public final UH2 A01 = new UH2(this, 7);

    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ void A8q(Object obj, int i) {
    }

    @Override // X.InterfaceC65282xQ
    public final void AVK() {
    }

    @Override // X.InterfaceC61772re, X.InterfaceC61782rf
    public final C75113Zb BRZ(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        HashMap hashMap = this.A02;
        String id = c38321qM.getId();
        if (id != null) {
            Object obj = hashMap.get(id);
            if (obj == null) {
                obj = AbstractC37303Gc4.A0E(c38321qM);
                hashMap.put(id, obj);
            }
            return (C75113Zb) obj;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC65282xQ
    public final boolean CSO() {
        return false;
    }

    @Override // X.InterfaceC65282xQ
    public final void Ct5() {
    }

    @Override // X.InterfaceC65272xP
    public final void ETA(InterfaceC686036x interfaceC686036x) {
        C14360o3.A0B(interfaceC686036x, 0);
        this.A04.A03(interfaceC686036x);
    }

    @Override // X.InterfaceC65272xP
    public final void EUR(C33P c33p) {
        C14360o3.A0B(c33p, 0);
        this.A04.A03 = c33p;
    }

    @Override // X.InterfaceC65282xQ
    public final int[] getModelIndex(Object obj) {
        return null;
    }

    @Override // X.InterfaceC65282xQ, android.widget.Adapter
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        C14360o3.A0B(dataSetObserver, 0);
        C65372xZ c65372xZ = this.A00;
        if (c65372xZ.A00() == 0) {
            this.A03.registerAdapterDataObserver(this.A01);
        }
        c65372xZ.registerObserver(dataSetObserver);
    }

    @Override // X.InterfaceC65282xQ, android.widget.Adapter
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        C14360o3.A0B(dataSetObserver, 0);
        C65372xZ c65372xZ = this.A00;
        c65372xZ.unregisterObserver(dataSetObserver);
        if (c65372xZ.A00() == 0) {
            this.A03.unregisterAdapterDataObserver(this.A01);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.2xZ, android.database.DataSetObservable] */
    public C70911WkF(C66362zD c66362zD, C37443GeN c37443GeN) {
        this.A03 = c66362zD;
        this.A04 = c37443GeN;
    }

    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ List CCN() {
        return new ArrayList();
    }

    @Override // X.InterfaceC65232xL
    public final void CtR(C38321qM c38321qM) {
        this.A03.notifyDataSetChanged();
    }

    @Override // X.InterfaceC65272xP
    public final String getBinderGroupName(int i) {
        String binderGroupName = this.A04.getBinderGroupName();
        C14360o3.A07(binderGroupName);
        return binderGroupName;
    }

    @Override // X.InterfaceC65282xQ, android.widget.Adapter
    public final int getCount() {
        return this.A03.getItemCount();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Object A04 = this.A03.A04(i);
        C14360o3.A07(A04);
        return A04;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return this.A03.getItemId(i);
    }

    @Override // android.widget.Adapter
    public final int getItemViewType(int i) {
        return this.A03.getItemViewType(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        throw new UnsupportedOperationException();
    }

    @Override // android.widget.Adapter
    public final int getViewTypeCount() {
        throw new UnsupportedOperationException();
    }

    @Override // android.widget.Adapter
    public final boolean hasStableIds() {
        return this.A03.hasStableIds();
    }

    @Override // android.widget.Adapter
    public final boolean isEmpty() {
        return AbstractC167007dF.A1N(this.A03.getItemCount());
    }

    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ int BK6(String str) {
        return -1;
    }

    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ Object EFR(int i) {
        return null;
    }
}
