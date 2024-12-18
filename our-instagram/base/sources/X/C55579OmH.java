package X;

import androidx.paging.PageFetcher;
import androidx.paging.PageFetcherSnapshot;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.OmH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55579OmH implements InterfaceC57894Ply {
    public final PageFetcherSnapshot A00;
    public final /* synthetic */ PageFetcher A01;

    public C55579OmH(PageFetcher pageFetcher, PageFetcherSnapshot pageFetcherSnapshot) {
        C14360o3.A0B(pageFetcherSnapshot, 2);
        this.A01 = pageFetcher;
        this.A00 = pageFetcherSnapshot;
    }

    @Override // X.InterfaceC57894Ply
    public final void A7F(AbstractC55021OWv abstractC55021OWv) {
        C51082Mhh c51082Mhh;
        C54653OCf c54653OCf = this.A00.A00.A00;
        if (abstractC55021OWv instanceof C51082Mhh) {
            c51082Mhh = (C51082Mhh) abstractC55021OWv;
        } else {
            c51082Mhh = null;
        }
        C30193DRy c30193DRy = new C30193DRy(abstractC55021OWv, 16);
        ReentrantLock reentrantLock = c54653OCf.A03;
        reentrantLock.lock();
        if (c51082Mhh != null) {
            try {
                c54653OCf.A00 = c51082Mhh;
            } finally {
                reentrantLock.unlock();
            }
        }
        c30193DRy.invoke(c54653OCf.A02, c54653OCf.A01);
    }
}
