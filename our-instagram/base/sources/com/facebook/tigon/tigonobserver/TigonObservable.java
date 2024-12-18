package com.facebook.tigon.tigonobserver;

import X.C09170dP;
import X.C0Go;
import X.C0J6;
import X.C0J8;
import X.C0K8;
import X.C0SX;
import X.C1G7;
import X.C1G8;
import X.C1GB;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.jni.HybridData;
import com.facebook.tigon.TigonXplatService;
import com.facebook.tigon.tigonobserver.TigonBodyObservation;
import com.facebook.tigon.tigonobserver.TigonObservable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class TigonObservable {
    public static final String TAG;
    public final C1G8[] mDebugObservers;
    public final Executor mExecutor;
    public final HybridData mHybridData;
    public final C0J6 mObjectPool;
    public final C1G7[] mObservers;

    public TigonObservable(TigonXplatService tigonXplatService, boolean z, boolean z2, Executor executor, C1G7[] c1g7Arr, C1G8[] c1g8Arr) {
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        C0Go c0Go = new C0Go() { // from class: X.1GC
            @Override // X.C0Go
            public final /* bridge */ /* synthetic */ Object A00() {
                return new C1GB(TigonObservable.this);
            }

            @Override // X.C0Go
            public final /* bridge */ /* synthetic */ void A02(Object obj) {
                C1GB c1gb = (C1GB) obj;
                c1gb.A00 = -1;
                c1gb.A02 = null;
                TigonBodyObservation tigonBodyObservation = c1gb.A01;
                if (tigonBodyObservation != null) {
                    tigonBodyObservation.cleanup();
                    c1gb.A01 = null;
                }
            }
        };
        if (awakeTimeSinceBootClock != null) {
            this.mObjectPool = new C0J6(c0Go, awakeTimeSinceBootClock, C1GB.class);
            C0J8.A03(executor, "Executor is required");
            C0J8.A08(tigonXplatService.isObservable(), "Tigon stack is not Observable");
            this.mObservers = c1g7Arr;
            this.mDebugObservers = c1g8Arr;
            this.mExecutor = executor;
            this.mHybridData = initHybrid(tigonXplatService, false, z2);
            return;
        }
        throw new IllegalArgumentException("Must add a clock to the object pool builder");
    }

    private native HybridData initHybrid(TigonXplatService tigonXplatService, boolean z, boolean z2);

    private void onDownloadBody(TigonBodyObservation tigonBodyObservation) {
        C1GB c1gb = (C1GB) this.mObjectPool.A01();
        c1gb.A00 = 7;
        c1gb.A01 = tigonBodyObservation;
        this.mExecutor.execute(C0SX.A00(c1gb, "TigonObservable_runDebugExecutor", 0));
    }

    private void onEOM(TigonObserverData tigonObserverData) {
        runExecutor(3, tigonObserverData);
    }

    private void onError(TigonObserverData tigonObserverData) {
        runExecutor(4, tigonObserverData);
    }

    private void onResponse(TigonObserverData tigonObserverData) {
        runExecutor(2, tigonObserverData);
    }

    private void onStarted(TigonObserverData tigonObserverData) {
        runExecutor(1, tigonObserverData);
    }

    private void onUploadBody(TigonBodyObservation tigonBodyObservation) {
        C1GB c1gb = (C1GB) this.mObjectPool.A01();
        c1gb.A00 = 6;
        c1gb.A01 = tigonBodyObservation;
        this.mExecutor.execute(C0SX.A00(c1gb, "TigonObservable_runDebugExecutor", 0));
    }

    private void onWillRetry(TigonObserverData tigonObserverData) {
        runExecutor(5, tigonObserverData);
    }

    private void runExecutor(int i, TigonObserverData tigonObserverData) {
        C1GB c1gb = (C1GB) this.mObjectPool.A01();
        c1gb.A00 = i;
        c1gb.A02 = tigonObserverData;
        if (tigonObserverData.submittedRequest() == null) {
            C0K8.A0P(c1gb.A03, "SubmittedRequest was null after initStep for id %d", Long.valueOf(tigonObserverData.requestId()));
        }
        this.mExecutor.execute(C0SX.A00(c1gb, "TigonObservable_runExecutor", 0));
    }

    static {
        C09170dP.A0C("tigonobserver");
        TAG = "TigonObservable";
    }

    private void onAdded(TigonObserverData tigonObserverData) {
        if (tigonObserverData.submittedRequest() == null) {
            C0K8.A0P("TigonObservable", "SubmittedRequest was null before Java onAdded for id %d", Long.valueOf(tigonObserverData.requestId()));
        }
        runExecutor(0, tigonObserverData);
    }
}
