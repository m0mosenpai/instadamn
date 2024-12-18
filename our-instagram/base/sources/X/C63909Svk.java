package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.Svk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63909Svk implements InterfaceC65337TiI {
    public final /* synthetic */ C63283Sgi A00;

    public C63909Svk(C63283Sgi c63283Sgi) {
        this.A00 = c63283Sgi;
    }

    @Override // X.InterfaceC65337TiI
    public final void DxX(String str) {
        C14360o3.A0B(str, 0);
        List list = this.A00.A0C;
        C14360o3.A07(list);
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC65337TiI) it.next()).DxX(str);
            }
        }
    }
}
