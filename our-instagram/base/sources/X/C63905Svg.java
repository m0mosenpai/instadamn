package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.Svg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63905Svg implements InterfaceC65335TiG {
    public final /* synthetic */ C63283Sgi A00;

    public C63905Svg(C63283Sgi c63283Sgi) {
        this.A00 = c63283Sgi;
    }

    @Override // X.InterfaceC65335TiG
    public final void DXV(R7U r7u, String str) {
        AbstractC167017dG.A1N(r7u, str);
        List list = this.A00.A0B;
        C14360o3.A07(list);
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC65335TiG) it.next()).DXV(r7u, str);
            }
        }
    }
}
