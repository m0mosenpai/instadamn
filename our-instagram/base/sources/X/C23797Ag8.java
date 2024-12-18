package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ag8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23797Ag8 implements InterfaceC185598Lb {
    public final /* synthetic */ C36941nr A00;
    public final /* synthetic */ ACA A01;
    public final /* synthetic */ A8X A02;

    public C23797Ag8(C36941nr c36941nr, ACA aca, A8X a8x) {
        this.A00 = c36941nr;
        this.A02 = a8x;
        this.A01 = aca;
    }

    @Override // X.InterfaceC185598Lb
    public final void DSG(A5Y a5y, ACA aca) {
        Map map = this.A00.A01;
        String str = this.A02.A02;
        List list = (List) map.get(str);
        if (list != null) {
            ACA aca2 = this.A01;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC185598Lb) it.next()).DSG(a5y, aca2);
            }
        }
        map.remove(str);
    }
}
