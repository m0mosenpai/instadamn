package androidx.work.impl.background.systemjob;

import X.AbstractC61646RrI;
import X.AbstractC93164Fs;
import X.C0f9;
import X.C0fN;
import X.C1113750b;
import X.C1114150f;
import X.C14360o3;
import X.C2L1;
import X.C2MX;
import X.C2N0;
import X.C2WP;
import X.C48442Kl;
import X.C49012Mu;
import X.InterfaceC48932Mm;
import X.InterfaceC49022Mv;
import X.RunnableC1113950d;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.util.Log;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements InterfaceC48932Mm {
    public static final String A04 = C48442Kl.A01("SystemJobService");
    public InterfaceC49022Mv A00;
    public C2L1 A01;
    public final Map A03 = new HashMap();
    public final C2N0 A02 = new C2N0();

    @Override // X.InterfaceC48932Mm
    public final void DEk(C2WP id, boolean needsReschedule) {
        JobParameters jobParameters;
        C48442Kl.A00();
        Map map = this.A03;
        synchronized (map) {
            jobParameters = (JobParameters) map.remove(id);
        }
        this.A02.A00(id);
        if (jobParameters != null) {
            jobFinished(jobParameters, needsReschedule);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        int A042 = C0f9.A04(314533705);
        super.onCreate();
        try {
            C2L1 A00 = C2L1.A00(getApplicationContext());
            this.A01 = A00;
            C2MX c2mx = A00.A03;
            this.A00 = new C49012Mu(c2mx, A00.A06);
            c2mx.A02(this);
        } catch (IllegalStateException e) {
            if (Application.class.equals(getApplication().getClass())) {
                C48442Kl.A00();
                Log.w(A04, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
                C0f9.A0B(798936809, A042);
                throw illegalStateException;
            }
        }
        C0f9.A0B(-1228448829, A042);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        int A042 = C0f9.A04(-1556002774);
        super.onDestroy();
        C2L1 c2l1 = this.A01;
        if (c2l1 != null) {
            c2l1.A03.A03(this);
        }
        C0f9.A0B(2143181020, A042);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters params) {
        AbstractC93164Fs.A00(params, this);
        if (this.A01 == null) {
            C48442Kl.A00();
            jobFinished(params, true);
            return false;
        }
        try {
            PersistableBundle extras = params.getExtras();
            if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                C2WP c2wp = new C2WP(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
                Map map = this.A03;
                synchronized (map) {
                    if (map.containsKey(c2wp)) {
                        C48442Kl.A00();
                        return false;
                    }
                    C48442Kl.A00();
                    map.put(c2wp, params);
                    C1114150f c1114150f = new C1114150f();
                    if (params.getTriggeredContentUris() != null) {
                        c1114150f.A02 = Arrays.asList(params.getTriggeredContentUris());
                    }
                    if (params.getTriggeredContentAuthorities() != null) {
                        c1114150f.A01 = Arrays.asList(params.getTriggeredContentAuthorities());
                    }
                    c1114150f.A00 = params.getNetwork();
                    InterfaceC49022Mv interfaceC49022Mv = this.A00;
                    C1113750b A01 = this.A02.A01(c2wp);
                    C49012Mu c49012Mu = (C49012Mu) interfaceC49022Mv;
                    C14360o3.A0B(A01, 0);
                    c49012Mu.A01.ATa(new RunnableC1113950d(c1114150f, c49012Mu.A00, A01));
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        C48442Kl.A00();
        Log.e(A04, "WorkSpec id not found!");
        return false;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters params) {
        boolean contains;
        int i;
        C0fN.A01(params, this);
        if (this.A01 == null) {
            C48442Kl.A00();
            return true;
        }
        try {
            PersistableBundle extras = params.getExtras();
            if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                C2WP c2wp = new C2WP(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
                C48442Kl.A00();
                Map map = this.A03;
                synchronized (map) {
                    map.remove(c2wp);
                }
                C1113750b A00 = this.A02.A00(c2wp);
                if (A00 != null) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        i = AbstractC61646RrI.A00(params);
                    } else {
                        i = -512;
                    }
                    this.A00.Eor(A00, i);
                }
                C2MX c2mx = this.A01.A03;
                String str = c2wp.A01;
                synchronized (c2mx.A09) {
                    contains = c2mx.A07.contains(str);
                }
                return !contains;
            }
        } catch (NullPointerException unused) {
        }
        C48442Kl.A00();
        Log.e(A04, "WorkSpec id not found!");
        return false;
    }
}
