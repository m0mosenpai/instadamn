package X;

import android.database.Cursor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes8.dex */
public final class M7t implements Callable {
    public final /* synthetic */ C37581ov A00;
    public final /* synthetic */ C49432Pa A01;

    public M7t(C37581ov c37581ov, C49432Pa c49432Pa) {
        this.A01 = c49432Pa;
        this.A00 = c37581ov;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        String string;
        String string2;
        String string3;
        String string4;
        C1YP c1yp = this.A01.A00;
        C37581ov c37581ov = this.A00;
        Cursor A00 = C3EP.A00(c1yp, c37581ov, false);
        try {
            int A01 = AbstractC37601ox.A01(A00, "draft_id");
            int A012 = AbstractC37601ox.A01(A00, AbstractC111324zv.A00(3026));
            int A013 = AbstractC37601ox.A01(A00, "composition_id");
            int A014 = AbstractC37601ox.A01(A00, "date_created");
            int A015 = AbstractC37601ox.A01(A00, "date_modified");
            int A016 = AbstractC37601ox.A01(A00, "media_info");
            int A017 = AbstractC37601ox.A01(A00, "persisted_media_info");
            int A018 = AbstractC37601ox.A01(A00, "media_edits");
            int A019 = AbstractC37601ox.A01(A00, "cover_file_path");
            ArrayList A11 = AbstractC43593JPy.A11(A00);
            while (A00.moveToNext()) {
                String string5 = A00.getString(A01);
                String string6 = A00.getString(A012);
                String string7 = A00.getString(A013);
                long j = A00.getLong(A014);
                long j2 = A00.getLong(A015);
                if (!A00.isNull(A016)) {
                    string = A00.getString(A016);
                } else {
                    string = null;
                }
                C196948nP c196948nP = null;
                if (string != null) {
                    try {
                        c196948nP = AbstractC196968nR.parseFromJson(C16V.A00(string));
                    } catch (IOException unused) {
                    }
                }
                if (!A00.isNull(A017)) {
                    string2 = A00.getString(A017);
                } else {
                    string2 = null;
                }
                C196948nP c196948nP2 = null;
                if (string2 != null) {
                    try {
                        c196948nP2 = AbstractC196968nR.parseFromJson(C16V.A00(string2));
                    } catch (IOException unused2) {
                    }
                }
                if (A00.isNull(A018)) {
                    string3 = null;
                } else {
                    string3 = A00.getString(A018);
                }
                C203248yh A002 = AbstractC50600MVl.A00(string3);
                if (A00.isNull(A019)) {
                    string4 = null;
                } else {
                    string4 = A00.getString(A019);
                }
                A11.add(new C45065Jwu(c196948nP, c196948nP2, A002, string5, string6, string7, string4, j, j2));
            }
            return A11;
        } finally {
            A00.close();
            c37581ov.A00();
        }
    }
}
