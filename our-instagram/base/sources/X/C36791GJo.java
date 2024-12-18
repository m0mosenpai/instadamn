package X;

import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.GJo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36791GJo implements InterfaceC42241xE {
    public final /* synthetic */ AbstractC31330Dpv A00;

    public C36791GJo(AbstractC31330Dpv abstractC31330Dpv) {
        this.A00 = abstractC31330Dpv;
    }

    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        AbstractC31330Dpv abstractC31330Dpv = this.A00;
        java.util.Set keySet = abstractC31330Dpv.A0C.keySet();
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj2 : keySet) {
            C14360o3.A0B(obj2, 0);
            if (obj2 instanceof MsysThreadId) {
                A1E.add(obj2);
            }
        }
        Iterator it = A1E.iterator();
        while (it.hasNext()) {
            AbstractC31330Dpv.A04(abstractC31330Dpv, (InterfaceC83733oI) it.next(), null, null);
        }
    }
}
