package X;

import android.database.DataSetObserver;
import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.5Gn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC114805Gn extends InterfaceC101944i9 {
    C141596ac C00(C41181vS c41181vS);

    void CtM();

    C41551w4 EG9(int i);

    void EcL(List list);

    void Epc(Reel reel, C41551w4 c41551w4);

    int getCount();

    Object getItem(int i);

    boolean isEmpty();

    void notifyDataSetChanged();

    void registerDataSetObserver(DataSetObserver dataSetObserver);

    void unregisterDataSetObserver(DataSetObserver dataSetObserver);
}
