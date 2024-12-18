package X;

import com.facebook.wearable.mediastream.events.EventsReceiver$subscribeTo$$inlined$CoroutineExceptionHandler$1;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes8.dex */
public final class LGW {
    public C12T A00;
    public C12T A01;
    public final LGN A02;
    public final ConcurrentHashMap A03;

    public final void A01(InterfaceC50385MMn interfaceC50385MMn, InterfaceC16620sF interfaceC16620sF) {
        C14360o3.A0B(interfaceC50385MMn, 0);
        C23671Dx A1L = AbstractC25226BEj.A1L(new C57172PZq(this, interfaceC50385MMn, interfaceC16620sF, (InterfaceC23621Ds) null, 47), AnonymousClass194.A02(new AnonymousClass197(null).plus(this.A00).plus(new EventsReceiver$subscribeTo$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key))));
        ConcurrentHashMap concurrentHashMap = this.A03;
        List list = (List) concurrentHashMap.get(interfaceC50385MMn);
        if (list == null) {
            list = AbstractC166987dD.A1E();
        }
        list.add(A1L);
        concurrentHashMap.put(interfaceC50385MMn, list);
    }

    public /* synthetic */ LGW(LGN lgn) {
        C12T c12t = C12P.A00;
        C14360o3.A0B(lgn, 1);
        this.A02 = lgn;
        this.A00 = c12t;
        this.A01 = c12t;
        this.A03 = new ConcurrentHashMap();
    }

    public final void A00() {
        ConcurrentHashMap concurrentHashMap = this.A03;
        Collection<List> values = concurrentHashMap.values();
        C14360o3.A07(values);
        for (List list : values) {
            C14360o3.A0A(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((AnonymousClass195) it.next()).AGH(null);
            }
        }
        concurrentHashMap.clear();
    }

    public LGW() {
        LGN lgn = LGN.A01;
        C12T c12t = C12P.A00;
        C14360o3.A0B(lgn, 1);
        this.A02 = lgn;
        this.A00 = c12t;
        this.A01 = c12t;
        this.A03 = new ConcurrentHashMap();
    }
}
