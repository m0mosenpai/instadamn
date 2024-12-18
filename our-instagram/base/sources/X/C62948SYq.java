package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* renamed from: X.SYq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62948SYq {
    public final Context A00;
    public final SharedPreferences A01;
    public final C63377Sip A02;
    public final Map A03;

    public final synchronized void A01() {
        this.A03.clear();
        Context context = this.A00;
        File noBackupFilesDir = context.getNoBackupFilesDir();
        if (noBackupFilesDir == null || !noBackupFilesDir.isDirectory()) {
            android.util.Log.w("FirebaseInstanceId", "noBackupFilesDir doesn't exist, using regular files directory instead");
            noBackupFilesDir = context.getFilesDir();
        }
        for (File file : noBackupFilesDir.listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
        this.A01.edit().clear().commit();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.01p, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.Sip] */
    public C62948SYq(Context context) {
        boolean isEmpty;
        ?? obj = new Object();
        this.A03 = new C005001p(0);
        this.A00 = context;
        this.A01 = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.A02 = obj;
        File A0w = MSW.A0w(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (!A0w.exists()) {
            try {
                if (A0w.createNewFile()) {
                    synchronized (this) {
                        isEmpty = this.A01.getAll().isEmpty();
                    }
                    if (!isEmpty) {
                        A01();
                        FirebaseInstanceId.getInstance(C63342Shx.A00()).A06();
                    }
                }
            } catch (IOException e) {
                if (android.util.Log.isLoggable("FirebaseInstanceId", 3)) {
                    String.valueOf(e.getMessage());
                }
            }
        }
    }

    public static String A00(String str) {
        StringBuilder A15 = AbstractC58320PtC.A15(str, AbstractC58319PtB.A05("") + 3);
        A15.append("");
        return MSZ.A0u("|S|", str, A15);
    }
}
