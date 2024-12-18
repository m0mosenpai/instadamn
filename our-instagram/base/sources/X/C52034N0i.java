package X;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.N0i, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52034N0i extends AbstractC55776Opl {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C52034N0i(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.XES
    public final void D6f(List list) {
        switch (this.A00) {
            case 0:
                C14360o3.A0B(list, 0);
                if (list.size() == 1) {
                    ((Object[]) this.A02)[0] = ((C55176Odf) list.get(0)).A0N.getPath();
                    return;
                }
                throw AbstractC166987dD.A14("we should have exactly one result");
            case 1:
                C14360o3.A0B(list, 0);
                if (list.size() == 1) {
                    ((C15370ps) this.A02).A00 = ((C55176Odf) list.get(0)).A0N;
                    return;
                }
                throw AbstractC166987dD.A14("we should have exactly one result");
            default:
                C14360o3.A0B(list, 0);
                if (list.size() == 1) {
                    ((InterfaceC58183Pqo) this.A01).Dv2(list);
                    return;
                }
                throw AbstractC166987dD.A14("we should have exactly one result");
        }
    }

    @Override // X.XES
    public final /* bridge */ /* synthetic */ void DEg(C70129W5q c70129W5q, Object obj) {
        switch (this.A00) {
            case 0:
                C14360o3.A0B(obj, 0);
                ((Object[]) this.A01)[0] = obj;
                return;
            case 1:
                android.util.Log.e("MediaTranscodeUtil", AbstractC167017dG.A0n(obj, "onException - ", AbstractC43594JPz.A0x(obj)));
                ((C15370ps) this.A01).A00 = obj;
                return;
            default:
                C105764pn c105764pn = (C105764pn) obj;
                C14360o3.A0B(c105764pn, 0);
                ((AtomicReference) this.A02).set(c105764pn);
                ((InterfaceC58183Pqo) this.A01).Dux(c105764pn);
                return;
        }
    }
}
