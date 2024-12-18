package X;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.M7s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC50055M7s implements Callable {
    public final /* synthetic */ C49442Pb A00;
    public final /* synthetic */ List A01;

    public CallableC50055M7s(C49442Pb c49442Pb, List list) {
        this.A00 = c49442Pb;
        this.A01 = list;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("DELETE FROM drafts WHERE id in (");
        List list = this.A01;
        AbstractC73723Sa.A00(A1C, list.size());
        String A0x = AbstractC166997dE.A0x(")", A1C);
        C1YP c1yp = this.A00.A02;
        InterfaceC37561ot compileStatement = c1yp.compileStatement(A0x);
        Iterator it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            compileStatement.ADp(i, AbstractC166987dD.A1B(it));
            i++;
        }
        c1yp.beginTransaction();
        try {
            return AbstractC43593JPy.A14(c1yp, compileStatement);
        } finally {
            c1yp.endTransaction();
        }
    }
}
