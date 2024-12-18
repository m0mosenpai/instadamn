package androidx.profileinstaller;

import X.AbstractC58318PtA;
import X.AbstractC61643RrE;
import X.C08D;
import X.C0f9;
import X.C4PW;
import X.C63641Sr3;
import X.MSW;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;

/* loaded from: classes10.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        C63641Sr3 c63641Sr3;
        Object obj;
        int i;
        C4PW c4pw;
        final C63641Sr3 c63641Sr32;
        final Object obj2;
        final int i2;
        int i3;
        int A04 = AbstractC58318PtA.A04(this, context, intent, -1193999392);
        if (intent == null) {
            i3 = 773008244;
        } else {
            String action = intent.getAction();
            if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
                C08D.A00(context, new C63641Sr3(this), new C4PW(), true);
            } else if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
                Bundle extras2 = intent.getExtras();
                if (extras2 != null) {
                    String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                    if ("WRITE_SKIP_FILE".equals(string)) {
                        c4pw = new C4PW();
                        c63641Sr32 = new C63641Sr3(this);
                        try {
                            C08D.A01(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                            obj2 = null;
                            i2 = 10;
                        } catch (PackageManager.NameNotFoundException e) {
                            final int i4 = 7;
                            c4pw.execute(new Runnable() { // from class: X.089
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C08C.this.Dh5(i4, e);
                                }
                            });
                        }
                    } else if ("DELETE_SKIP_FILE".equals(string)) {
                        c4pw = new C4PW();
                        c63641Sr32 = new C63641Sr3(this);
                        MSW.A0w(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        obj2 = null;
                        i2 = 11;
                    }
                    c4pw.execute(new Runnable() { // from class: X.089
                        @Override // java.lang.Runnable
                        public final void run() {
                            C08C.this.Dh5(i2, obj2);
                        }
                    });
                }
            } else {
                if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
                    c63641Sr3 = new C63641Sr3(this);
                    obj = null;
                    Process.sendSignal(Process.myPid(), 10);
                    i = 12;
                } else if ("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) && (extras = intent.getExtras()) != null) {
                    String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
                    c63641Sr3 = new C63641Sr3(this);
                    if ("DROP_SHADER_CACHE".equals(string2)) {
                        obj = null;
                        i = 15;
                        if (AbstractC61643RrE.A00(context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
                            i = 14;
                        }
                    } else {
                        c63641Sr3.Dh5(16, null);
                    }
                }
                c63641Sr3.Dh5(i, obj);
            }
            i3 = -1179851166;
        }
        C0f9.A0E(i3, A04, intent);
    }
}
