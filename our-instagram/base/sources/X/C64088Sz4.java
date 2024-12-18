package X;

import android.os.ConditionVariable;
import com.facebook.msys.mci.DatabaseConnection;
import com.facebook.msys.mci.MsysDatabaseRedactor;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;
import java.io.File;
import java.util.List;

/* renamed from: X.Sz4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64088Sz4 implements DatabaseConnection.DatabaseRunnable {
    public final MsysDatabaseRedactor A00;
    public final ConditionVariable A01;
    public final File A02;
    public final List A03;

    @Override // com.facebook.msys.mci.DatabaseConnection.DatabaseRunnable
    public final void run(SqliteHolder sqliteHolder) {
        try {
            List list = this.A03;
            File A0w = MSW.A0w(this.A02, "msys_debug");
            if (!A0w.exists() && !A0w.mkdirs()) {
                C0K8.A0C("MsysAddReportRunnable", AbstractC111324zv.A00(3613));
            } else {
                File A0w2 = MSW.A0w(A0w, "msys_debug_database.bin");
                int copyAndRedactDatabase = this.A00.copyAndRedactDatabase(sqliteHolder, android.net.Uri.fromFile(A0w2).toString());
                if (copyAndRedactDatabase == 0) {
                    list.add(A0w2);
                } else {
                    C0K8.A0O("MsysAddReportRunnable", "copyAndRedactDatabase for msys DB failed with error code: %d", Integer.valueOf(copyAndRedactDatabase));
                }
            }
        } finally {
            this.A01.open();
        }
    }

    public C64088Sz4(ConditionVariable conditionVariable, MsysDatabaseRedactor msysDatabaseRedactor, File file, List list) {
        this.A03 = list;
        this.A01 = conditionVariable;
        this.A02 = file;
        this.A00 = msysDatabaseRedactor;
    }
}
