package X;

import android.database.DataSetObserver;
import android.util.Pair;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.business.fragment.SuggestBusinessFragment;

/* loaded from: classes6.dex */
public final class FQW {
    public int A00;
    public int A01;
    public DataSetObserver A02;
    public final RecyclerView A03;
    public final C67919V2j A04;
    public final SuggestBusinessFragment A05;
    public final C1I4 A06;
    public final C13400mQ A07;

    public FQW(RecyclerView recyclerView, C67919V2j c67919V2j, SuggestBusinessFragment suggestBusinessFragment) {
        C14360o3.A0B(recyclerView, 1);
        this.A03 = recyclerView;
        this.A04 = c67919V2j;
        this.A05 = suggestBusinessFragment;
        this.A00 = 0;
        this.A01 = 0;
        U8E u8e = new U8E(this, 0);
        this.A02 = u8e;
        E0L e0l = new E0L(this, 1);
        this.A06 = e0l;
        c67919V2j.registerDataSetObserver(u8e);
        this.A07 = new C13400mQ(AbstractC167007dF.A0J(), new G0V(this, 0), 300L);
        recyclerView.A14(e0l);
    }

    public final void A00(RecyclerView recyclerView, int i) {
        LinearLayoutManager linearLayoutManager;
        AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
        if ((abstractC70663Fe instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) abstractC70663Fe) != null) {
            this.A07.A01(new Pair(Integer.valueOf(Math.max(linearLayoutManager.A1a(), 1)), Integer.valueOf(Math.min(linearLayoutManager.A1b(), (i - 1) - 1))));
        }
    }
}
