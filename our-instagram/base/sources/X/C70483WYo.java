package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.WYo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70483WYo implements X9T {
    public final X9T A00;
    public final List A01;

    public C70483WYo(X9T x9t, List list) {
        this.A01 = list;
        this.A00 = x9t;
    }

    @Override // X.X9T
    public final /* bridge */ /* synthetic */ InterfaceC71995XEj ALF() {
        C01L A1I = C0eM.A1I();
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            A1I.add(((XLF) it.next()).ALG());
        }
        C01L A1J = C0eM.A1J(A1I);
        InterfaceC71995XEj ALF = this.A00.ALF();
        C14360o3.A07(ALF);
        return new C70480WYl(ALF, A1J);
    }
}
