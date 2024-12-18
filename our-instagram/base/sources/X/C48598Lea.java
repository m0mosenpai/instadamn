package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Lea, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48598Lea implements MOP {
    public final /* synthetic */ C44502Jm8 A00;

    public C48598Lea(C44502Jm8 c44502Jm8) {
        this.A00 = c44502Jm8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.MOP
    public final void Dh9(String str, List list) {
        ?? r2;
        Object value;
        C14360o3.A0B(str, 0);
        C05A c05a = this.A00.A03;
        if (str.equals(((MWT) c05a.getValue()).A03)) {
            if (list != null) {
                r2 = AbstractC166987dD.A1E();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C148336m3 B1F = ((InterfaceC148316m1) it.next()).B1F();
                    if (B1F != null) {
                        r2.add(B1F);
                    }
                }
            } else {
                r2 = C16930sl.A00;
            }
            ArrayList A0U = AbstractC001800i.A0U(r2);
            do {
                value = c05a.getValue();
            } while (!c05a.AIi(value, MWT.A00((MWT) value, null, null, null, A0U, 27)));
        }
    }
}
