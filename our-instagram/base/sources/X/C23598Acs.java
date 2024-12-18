package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Acs, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23598Acs implements C1NJ {
    public final List A00;
    public final Map A01;
    public final InterfaceC16660sJ A02;

    public C23598Acs(String str, List list, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(str, 2);
        this.A00 = list;
        this.A02 = interfaceC16660sJ;
        this.A01 = AbstractC166987dD.A1I();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC167017dG.A1K(this, C25821No.A00(), (ImageUrl) it.next(), str);
        }
        if (this.A00.size() == 0) {
            this.A02.invoke(C16930sl.A00);
        }
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        AbstractC167017dG.A1N(interfaceC59502nt, c73033Pe);
        Map map = this.A01;
        map.put(interfaceC59502nt.BGt(), c73033Pe.A01);
        int size = map.size();
        List list = this.A00;
        if (size == list.size()) {
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Object obj = map.get(it.next());
                if (obj != null) {
                    A1E.add(obj);
                }
            }
            this.A02.invoke(A1E);
        }
    }
}
