package X;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

@Deprecated(message = "AsyncPagedListDiffer is deprecated and has been replaced by AsyncPagingDataDiffer", replaceWith = @ReplaceWith(expression = "AsyncPagingDataDiffer<T>", imports = {"androidx.paging.AsyncPagingDataDiffer"}))
/* loaded from: classes9.dex */
public final class OUW {
    public int A00;
    public PW7 A01;
    public PW7 A02;
    public InterfaceC65452xh A03;
    public Executor A04;
    public final AbstractC53629Nna A05;
    public final OIE A06;
    public final C65472xj A07;
    public final List A08;
    public final CopyOnWriteArrayList A09;
    public final C0YS A0A;

    @Deprecated(message = "PagedList is deprecated and has been replaced by PagingData", replaceWith = @ReplaceWith(expression = "AsyncPagingDataDiffer(\n                Dispatchers.Main,\n                Dispatchers.IO,\n                diffCallback,\n                listUpdateCallback\n            )", imports = {"androidx.paging.AsyncPagingDataDiffer", "kotlinx.coroutines.Dispatchers"}))
    public OUW(AbstractC65412xd abstractC65412xd, C2UU c2uu) {
        Executor executor = C72051XLs.A03;
        C14360o3.A07(executor);
        this.A04 = executor;
        this.A09 = new CopyOnWriteArrayList();
        C51066MhM c51066MhM = new C51066MhM(this);
        this.A06 = c51066MhM;
        this.A0A = new C57228PbC(c51066MhM, 0);
        this.A08 = new CopyOnWriteArrayList();
        this.A05 = new C51064MhK(this);
        this.A03 = new C65442xg(c2uu);
        synchronized (AbstractC65462xi.A01) {
            if (AbstractC65462xi.A00 == null) {
                AbstractC65462xi.A00 = Executors.newFixedThreadPool(2);
            }
        }
        this.A07 = new C65472xj(abstractC65412xd, null, AbstractC65462xi.A00);
    }

    public static final void A00(OUW ouw, PW7 pw7, PW7 pw72) {
        Iterator it = ouw.A09.iterator();
        while (it.hasNext()) {
            ((C55576OmE) ((InterfaceC57785PkC) it.next())).A00.invoke(pw7, pw72);
        }
    }
}
