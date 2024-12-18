package X;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
/* renamed from: X.028, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class AnonymousClass028 extends Service {
    public static final boolean DEBUG = false;
    public static final String NO_LONGER_RUNNING_MESSAGE = "Caller no longer running";
    public static final String TAG = "JobIntentService";
    public AnonymousClass027 mCompatWorkEnqueuer;
    public AnonymousClass024 mCurProcessor;
    public AnonymousClass025 mJobImpl;
    public static final Object sLock = new Object();
    public static final HashMap sClassWorkEnqueuer = new HashMap();
    public boolean mInterruptIfStopped = false;
    public boolean mStopped = false;
    public boolean mDestroyed = false;
    public final ArrayList mCompatQueue = null;

    public abstract void onHandleWork(Intent intent);

    public boolean onStopCurrentWork() {
        return true;
    }

    public static void enqueueWork(Context context, ComponentName componentName, int i, Intent intent) {
        if (intent != null) {
            synchronized (sLock) {
                AnonymousClass027 workEnqueuer = getWorkEnqueuer(context, componentName, true, i);
                workEnqueuer.A00(i);
                C0v0 c0v0 = (C0v0) workEnqueuer;
                c0v0.A01.enqueue(c0v0.A00, new JobWorkItem(intent));
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }

    public static AnonymousClass027 getWorkEnqueuer(Context context, ComponentName componentName, boolean z, int i) {
        HashMap hashMap = sClassWorkEnqueuer;
        AnonymousClass027 anonymousClass027 = (AnonymousClass027) hashMap.get(componentName);
        if (anonymousClass027 == null) {
            if (z) {
                C0v0 c0v0 = new C0v0(componentName, context, i);
                hashMap.put(componentName, c0v0);
                return c0v0;
            }
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        return anonymousClass027;
    }

    public AnonymousClass026 dequeueWork() {
        AnonymousClass025 anonymousClass025 = this.mJobImpl;
        AnonymousClass026 anonymousClass026 = null;
        if (anonymousClass025 != null) {
            try {
                final JobServiceEngineC18170v2 jobServiceEngineC18170v2 = (JobServiceEngineC18170v2) anonymousClass025;
                synchronized (jobServiceEngineC18170v2.A02) {
                    JobParameters jobParameters = jobServiceEngineC18170v2.A00;
                    if (jobParameters == null) {
                        return null;
                    }
                    final JobWorkItem dequeueWork = jobParameters.dequeueWork();
                    if (dequeueWork == null) {
                        return null;
                    }
                    dequeueWork.getIntent().setExtrasClassLoader(jobServiceEngineC18170v2.A01.getClassLoader());
                    return new AnonymousClass026(dequeueWork, jobServiceEngineC18170v2) { // from class: X.0vV
                        public final JobWorkItem A00;
                        public final /* synthetic */ JobServiceEngineC18170v2 A01;

                        {
                            this.A01 = jobServiceEngineC18170v2;
                            this.A00 = dequeueWork;
                        }

                        @Override // X.AnonymousClass026
                        public final void AIk() {
                            JobServiceEngineC18170v2 jobServiceEngineC18170v22 = this.A01;
                            synchronized (jobServiceEngineC18170v22.A02) {
                                JobParameters jobParameters2 = jobServiceEngineC18170v22.A00;
                                if (jobParameters2 != null) {
                                    jobParameters2.completeWork(this.A00);
                                }
                            }
                        }

                        @Override // X.AnonymousClass026
                        public final Intent getIntent() {
                            return this.A00.getIntent();
                        }
                    };
                }
            } catch (SecurityException e) {
                String message = e.getMessage();
                if (message != null) {
                    if (message.contains(NO_LONGER_RUNNING_MESSAGE)) {
                        android.util.Log.e(TAG, "Captured a \"Caller no longer running\"", e);
                        return null;
                    }
                    throw e;
                }
                throw e;
            }
        }
        synchronized (this.mCompatQueue) {
            try {
                ArrayList arrayList = this.mCompatQueue;
                if (arrayList.size() > 0) {
                    anonymousClass026 = (AnonymousClass026) arrayList.remove(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return anonymousClass026;
    }

    public boolean doStopCurrentWork() {
        AnonymousClass024 anonymousClass024 = this.mCurProcessor;
        if (anonymousClass024 != null) {
            anonymousClass024.cancel(this.mInterruptIfStopped);
        }
        this.mStopped = true;
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.024, android.os.AsyncTask] */
    public void ensureProcessorRunningLocked(boolean z) {
        if (this.mCurProcessor == null) {
            ?? r2 = new AsyncTask() { // from class: X.024
                @Override // android.os.AsyncTask
                public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
                    while (true) {
                        AnonymousClass028 anonymousClass028 = AnonymousClass028.this;
                        AnonymousClass026 dequeueWork = anonymousClass028.dequeueWork();
                        if (dequeueWork != null) {
                            anonymousClass028.onHandleWork(dequeueWork.getIntent());
                            try {
                                dequeueWork.AIk();
                            } catch (SecurityException e) {
                                String message = e.getMessage();
                                if (message != null && message.contains(AnonymousClass028.NO_LONGER_RUNNING_MESSAGE)) {
                                    android.util.Log.e(AnonymousClass028.TAG, "Captured a \"Caller no longer running\"", e);
                                } else {
                                    throw e;
                                }
                            }
                        } else {
                            return null;
                        }
                    }
                    throw e;
                }

                @Override // android.os.AsyncTask
                public final /* bridge */ /* synthetic */ void onCancelled(Object obj) {
                    AnonymousClass028.this.processorFinished();
                }

                @Override // android.os.AsyncTask
                public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
                    AnonymousClass028.this.processorFinished();
                }
            };
            this.mCurProcessor = r2;
            r2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public boolean isStopped() {
        return this.mStopped;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Object obj = this.mJobImpl;
        if (obj != null) {
            return ((JobServiceEngine) obj).getBinder();
        }
        return null;
    }

    public void processorFinished() {
        ArrayList arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mCurProcessor = null;
                ArrayList arrayList2 = this.mCompatQueue;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    ensureProcessorRunningLocked(false);
                }
            }
        }
    }

    public void setInterruptIfStopped(boolean z) {
        this.mInterruptIfStopped = z;
    }

    @Override // android.app.Service
    public void onCreate() {
        int A04 = C0f9.A04(-1748091824);
        super.onCreate();
        this.mJobImpl = new JobServiceEngineC18170v2(this);
        this.mCompatWorkEnqueuer = null;
        C0f9.A0B(-53271393, A04);
    }

    @Override // android.app.Service
    public void onDestroy() {
        int A04 = C0f9.A04(773526438);
        super.onDestroy();
        ArrayList arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.mDestroyed = true;
                } catch (Throwable th) {
                    C0f9.A0B(426055373, A04);
                    throw th;
                }
            }
        }
        C0f9.A0B(-2066676103, A04);
    }

    @Override // android.app.Service
    public int onStartCommand(final Intent intent, int i, final int i2) {
        int i3;
        int i4;
        int A04 = C0f9.A04(1529133293);
        if (intent != null) {
            C08770cf.A01.A01(this, intent);
        }
        ArrayList arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    ArrayList arrayList2 = this.mCompatQueue;
                    if (intent == null) {
                        intent = new Intent();
                    }
                    arrayList2.add(new AnonymousClass026(intent, this, i2) { // from class: X.0vW
                        public final int A00;
                        public final Intent A01;
                        public final /* synthetic */ AnonymousClass028 A02;

                        {
                            this.A02 = this;
                            this.A01 = intent;
                            this.A00 = i2;
                        }

                        @Override // X.AnonymousClass026
                        public final void AIk() {
                            this.A02.stopSelf(this.A00);
                        }

                        @Override // X.AnonymousClass026
                        public final Intent getIntent() {
                            return this.A01;
                        }
                    });
                    ensureProcessorRunningLocked(true);
                } catch (Throwable th) {
                    C0f9.A0B(1991930718, A04);
                    throw th;
                }
            }
            i3 = 3;
            i4 = 1390013199;
        } else {
            i3 = 2;
            i4 = 90455849;
        }
        C0f9.A0B(i4, A04);
        return i3;
    }

    public static void enqueueWork(Context context, Class cls, int i, Intent intent) {
        enqueueWork(context, new ComponentName(context, (Class<?>) cls), i, intent);
    }
}
