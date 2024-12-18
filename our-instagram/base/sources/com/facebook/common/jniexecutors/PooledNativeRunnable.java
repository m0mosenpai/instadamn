package com.facebook.common.jniexecutors;

import X.C0Go;
import X.C0J6;
import android.util.Log;
import com.facebook.common.jniexecutors.NativeRunnable;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.jni.HybridData;

/* loaded from: classes.dex */
public class PooledNativeRunnable extends NativeRunnable {
    public static final C0J6 sPool;

    public PooledNativeRunnable() {
        super(null);
    }

    static {
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        C0Go c0Go = new C0Go() { // from class: X.1Sl
            @Override // X.C0Go
            public final /* bridge */ /* synthetic */ Object A00() {
                return new NativeRunnable(null);
            }

            @Override // X.C0Go
            public final /* bridge */ /* synthetic */ void A01(Object obj) {
                ((NativeRunnable) obj).mNativeExecutor = null;
            }

            @Override // X.C0Go
            public final /* bridge */ /* synthetic */ void A02(Object obj) {
                ((NativeRunnable) obj).mHybridData = null;
            }
        };
        if (awakeTimeSinceBootClock != null) {
            sPool = new C0J6(c0Go, awakeTimeSinceBootClock, PooledNativeRunnable.class);
            return;
        }
        throw new IllegalArgumentException("Must add a clock to the object pool builder");
    }

    public static PooledNativeRunnable allocate(HybridData hybridData) {
        PooledNativeRunnable pooledNativeRunnable = (PooledNativeRunnable) sPool.A01();
        pooledNativeRunnable.mHybridData = hybridData;
        return pooledNativeRunnable;
    }

    @Override // com.facebook.common.jniexecutors.NativeRunnable, java.lang.Runnable
    public void run() {
        try {
            super.run();
        } catch (Exception e) {
            Log.e("PooledNativeRunnable", "run crashed", e);
        }
        sPool.A02(this);
    }
}
