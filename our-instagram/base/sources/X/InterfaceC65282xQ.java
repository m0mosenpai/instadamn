package X;

import android.database.DataSetObserver;
import android.widget.Adapter;
import java.util.List;

/* renamed from: X.2xQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC65282xQ extends Adapter, InterfaceC65232xL {
    void A8q(Object obj, int i);

    void AVK();

    int BK6(String str);

    List CCN();

    boolean CSO();

    void Ct5();

    Object EFR(int i);

    @Override // android.widget.Adapter
    int getCount();

    int[] getModelIndex(Object obj);

    @Override // android.widget.Adapter
    void registerDataSetObserver(DataSetObserver dataSetObserver);

    @Override // android.widget.Adapter
    void unregisterDataSetObserver(DataSetObserver dataSetObserver);
}
