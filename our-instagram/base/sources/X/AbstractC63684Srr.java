package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.Srr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63684Srr implements InterfaceC65535Tm7 {
    public final List A00;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.ShE, X.QAZ] */
    public static QAZ A00(AbstractC63684Srr abstractC63684Srr) {
        return new AbstractC63308ShE(abstractC63684Srr.A00);
    }

    @Override // X.InterfaceC65535Tm7
    public final List BKm() {
        return this.A00;
    }

    @Override // X.InterfaceC65535Tm7
    public final boolean Cde() {
        List list = this.A00;
        if (!list.isEmpty() && (list.size() != 1 || !((C63366SiP) list.get(0)).A03())) {
            return false;
        }
        return true;
    }

    public AbstractC63684Srr(List list) {
        this.A00 = list;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        List list = this.A00;
        if (!list.isEmpty()) {
            A1C.append("values=");
            A1C.append(Arrays.toString(list.toArray()));
        }
        return A1C.toString();
    }
}
