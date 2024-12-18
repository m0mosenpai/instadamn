package com.instagram.process.secondary;

import X.AbstractC001900j;
import X.AbstractC12280kW;
import X.AbstractC166987dD;
import X.AbstractC43592JPx;
import X.AbstractC43593JPy;
import X.AbstractC46802Ct;
import X.C09170dP;
import X.C0J1;
import X.C0K8;
import X.C0eS;
import X.C14360o3;
import X.C63149Sdw;
import X.RunnableC03840Iz;
import android.content.Context;
import android.os.AsyncTask;
import com.facebook.breakpad.BreakpadManager;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public class InstagramApplicationForSecondaryProcess extends AbstractC12280kW {
    public final Class TAG;

    @Override // X.AbstractC12280kW
    public File getCacheDir(File file) {
        C14360o3.A0B(file, 0);
        Context context = this.context;
        C14360o3.A0B(context, 0);
        if (AbstractC46802Ct.A00) {
            File A00 = C0eS.A00(context, 486209204);
            A00.mkdirs();
            if (A00.isDirectory() || A00.mkdirs()) {
                return A00;
            }
        }
        return file;
    }

    @Override // X.AbstractC12280kW
    public File getDirOverride(String str, int i) {
        C14360o3.A0B(str, 0);
        Context context = this.context;
        C14360o3.A0B(context, 0);
        if (AbstractC46802Ct.A00 && "webview".equals(str)) {
            File A00 = C0eS.A00(context, 372754419);
            A00.mkdirs();
            return A00;
        }
        return null;
    }

    @Override // X.AbstractC12280kW
    public void onCreate(String str, long j, long j2, long j3, long j4) {
        C14360o3.A0B(str, 0);
        AbstractC12280kW._processName = str;
        if (str.length() == 0) {
            throw AbstractC166987dD.A14("Can't find current process's name");
        }
        C0K8.A00(6);
        C09170dP.A05(this.context);
        try {
            C09170dP.A0C("c++_shared");
            BreakpadManager.start(this.context);
        } catch (Throwable th) {
            C0K8.A05(this.TAG, "Can't load breakpad", th);
        }
        C63149Sdw c63149Sdw = C63149Sdw.A06;
        Context context = this.context;
        int A04 = AbstractC001900j.A04(str, ':', 0);
        if (A04 != -1) {
            str = AbstractC43592JPx.A0z(str, A04 + 1);
        }
        c63149Sdw.A00 = context;
        c63149Sdw.A02 = str;
        c63149Sdw.A03.postDelayed(c63149Sdw.A04, AbstractC43593JPy.A09(TimeUnit.MINUTES));
        AsyncTask.execute(new RunnableC03840Iz(this.context, C0J1.A00));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstagramApplicationForSecondaryProcess(Context context) {
        super(context);
        C14360o3.A0D(context, "context");
        this.TAG = InstagramApplicationForSecondaryProcess.class;
    }
}
