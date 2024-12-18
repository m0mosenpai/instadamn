package X;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* renamed from: X.7n6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class CallableC172927n6 implements Callable {
    public final /* synthetic */ C37581ov A00;
    public final /* synthetic */ C142456c7 A01;

    public CallableC172927n6(C37581ov c37581ov, C142456c7 c142456c7) {
        this.A01 = c142456c7;
        this.A00 = c37581ov;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C1YP c1yp = this.A01.A07;
        C37581ov c37581ov = this.A00;
        Object obj = null;
        Cursor A00 = C3EP.A00(c1yp, c37581ov, false);
        try {
            int A01 = AbstractC37601ox.A01(A00, "productId");
            int A012 = AbstractC37601ox.A01(A00, "collectionName");
            int A013 = AbstractC37601ox.A01(A00, "syncedAt");
            int A014 = AbstractC37601ox.A01(A00, "lastSyncedNextCursor");
            int A015 = AbstractC37601ox.A01(A00, "hasMore");
            int A016 = AbstractC37601ox.A01(A00, "collectionId");
            if (A00.moveToFirst()) {
                String string = A00.getString(A01);
                String string2 = A00.getString(A012);
                long j = A00.getLong(A013);
                if (!A00.isNull(A014)) {
                    obj = A00.getString(A014);
                }
                String str = obj;
                boolean z = false;
                if (A00.getInt(A015) != 0) {
                    z = true;
                }
                obj = new C172937n7(string, string2, str, A00.getString(A016), j, z);
            }
            return obj;
        } finally {
            A00.close();
            c37581ov.A00();
        }
    }
}
