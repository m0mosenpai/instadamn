package X;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
public final class PUJ implements Callable {
    public final /* synthetic */ C37581ov A00;
    public final /* synthetic */ C49442Pb A01;

    public PUJ(C37581ov c37581ov, C49442Pb c49442Pb) {
        this.A01 = c49442Pb;
        this.A00 = c37581ov;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        String string;
        String string2;
        String string3;
        String string4;
        C1YP c1yp = this.A01.A02;
        c1yp.beginTransaction();
        try {
            C37581ov c37581ov = this.A00;
            Object obj = null;
            Cursor query = c1yp.query(c37581ov, (CancellationSignal) null);
            try {
                if (query.moveToFirst()) {
                    String string5 = query.getString(0);
                    C5JK A00 = AbstractC50598MVj.A00(query.getString(1));
                    List A002 = AbstractC50597MVi.A00(query.getString(2));
                    if (query.isNull(3)) {
                        string = null;
                    } else {
                        string = query.getString(3);
                    }
                    C9JS A003 = AbstractC50599MVk.A00(string);
                    long j = query.getLong(4);
                    if (query.isNull(5)) {
                        string2 = null;
                    } else {
                        string2 = query.getString(5);
                    }
                    String string6 = query.getString(6);
                    if (query.isNull(7)) {
                        string3 = null;
                    } else {
                        string3 = query.getString(7);
                    }
                    if (query.isNull(8)) {
                        string4 = null;
                    } else {
                        string4 = query.getString(8);
                    }
                    boolean A1M = AbstractC167007dF.A1M(query.getInt(9));
                    long j2 = query.getLong(10);
                    if (!query.isNull(11)) {
                        obj = query.getString(11);
                    }
                    obj = new MWL(A003, A00, string5, string2, string6, string3, string4, obj, A002, j, j2, A1M, AbstractC167007dF.A1M(query.getInt(12)));
                }
                c1yp.setTransactionSuccessful();
                return obj;
            } finally {
                query.close();
                c37581ov.A00();
            }
        } finally {
            c1yp.endTransaction();
        }
    }
}
