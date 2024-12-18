package com.facebook.voltron.download.scheduledinstaller;

import X.AbstractC001800i;
import X.AbstractC09930fu;
import X.AbstractC10000gD;
import X.AbstractC166987dD;
import X.AbstractC93164Fs;
import X.C00O;
import X.C0f9;
import X.C0fN;
import X.C14360o3;
import X.C1U5;
import X.C1UI;
import X.C63057Sbe;
import X.C64096SzD;
import X.TOG;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.HandlerThread;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes10.dex */
public final class OxygenScheduledInstallerJobService extends JobService {
    public static final C63057Sbe A05 = new Object();
    public HandlerThread A00;
    public C1UI A01;
    public C64096SzD A02;
    public ExecutorService A03;
    public ExecutorService A04;

    public final List A00(C1UI c1ui) {
        Set keySet = c1ui.A00("AppModules::ScheduledInstallRequestTimestamp").Aax().keySet();
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : keySet) {
            String str = (String) obj;
            if (AbstractC09930fu.A00(str) != -1 && !AbstractC10000gD.A01(this, str)) {
                A1E.add(obj);
            }
        }
        return AbstractC001800i.A0a(A1E);
    }

    @Override // android.app.Service
    public final void onCreate() {
        int A04 = C0f9.A04(-746841003);
        super.onCreate();
        this.A04 = Executors.newSingleThreadExecutor();
        this.A03 = Executors.newSingleThreadExecutor();
        this.A01 = new C1U5(this).A00();
        C0f9.A0B(-494773045, A04);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        AbstractC93164Fs.A00(jobParameters, this);
        C14360o3.A0B(jobParameters, 0);
        ExecutorService executorService = this.A04;
        if (executorService == null) {
            C14360o3.A0F("executorService");
            throw C00O.createAndThrow();
        }
        executorService.execute(new TOG(jobParameters, this));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        C0fN.A01(jobParameters, this);
        C14360o3.A0B(jobParameters, 0);
        C1UI c1ui = this.A01;
        if (c1ui == null) {
            C14360o3.A0F("lightSharedPreferencesFactory");
            throw C00O.createAndThrow();
        }
        if (!A00(c1ui).isEmpty()) {
            return true;
        }
        return false;
    }
}
