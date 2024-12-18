package X;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.M7x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC50059M7x implements Callable {
    public final /* synthetic */ C29461bN A00;
    public final /* synthetic */ List A01;

    public CallableC50059M7x(C29461bN c29461bN, List list) {
        this.A00 = c29461bN;
        this.A01 = list;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("DELETE FROM user_feed_items WHERE item_type IN (");
        List list = this.A01;
        AbstractC73723Sa.A00(A1C, list.size());
        String A0x = AbstractC166997dE.A0x(")", A1C);
        C1YP c1yp = this.A00.A01;
        InterfaceC37561ot compileStatement = c1yp.compileStatement(A0x);
        int i = 1;
        for (Object obj : list) {
            C14360o3.A0B(obj, 0);
            compileStatement.ADp(i, obj.toString());
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
