package X;

import android.content.Context;
import android.os.Handler;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.Sdw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63149Sdw {
    public static final C63149Sdw A06 = new C63149Sdw();
    public Context A00;
    public C62408SAh A01;
    public String A02;
    public final Handler A03 = AbstractC167007dF.A0J();
    public final Thread A04 = new TY1(this);
    public final Thread A05 = new TY2(this);

    public static final void A00(C63149Sdw c63149Sdw) {
        try {
            C14360o3.A0A(c63149Sdw.A00);
            HashSet A00 = AbstractC62767SQe.A00();
            if (!A00.isEmpty()) {
                C62408SAh c62408SAh = c63149Sdw.A01;
                C14360o3.A0A(c62408SAh);
                File file = c62408SAh.A00;
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                    try {
                        Iterator it = A00.iterator();
                        while (it.hasNext()) {
                            bufferedWriter.write(AbstractC166987dD.A1B(it));
                            bufferedWriter.newLine();
                        }
                        bufferedWriter.close();
                        return;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            C20I.A00(bufferedWriter, th);
                            throw th2;
                        }
                    }
                }
                throw AbstractC166997dE.A0g();
            }
        } catch (IOException | NoClassDefFoundError unused) {
        }
    }
}
