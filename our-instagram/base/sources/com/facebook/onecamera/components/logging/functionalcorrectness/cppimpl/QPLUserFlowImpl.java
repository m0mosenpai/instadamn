package com.facebook.onecamera.components.logging.functionalcorrectness.cppimpl;

import X.C09170dP;
import X.C150366pl;
import X.InterfaceC150356pk;
import X.InterfaceC176667tO;
import android.os.Build;
import android.os.SystemClock;
import com.facebook.jni.HybridData;

/* loaded from: classes3.dex */
public class QPLUserFlowImpl implements InterfaceC150356pk {
    public static final String TAG = "QPLUserFlowImpl";
    public final boolean mEnableLazyLoad;
    public HybridData mHybridData;
    public volatile boolean mIsNativeLibLoadedAndInit = false;

    private native void annotateInternal(long j, String str, String str2, boolean z, String str3);

    private native void endCancelInternal(long j, String str, String str2);

    private native void endFailInternal(long j, String str, int i, String str2, String str3);

    private native void endSuccessInternal(long j, String str);

    public static native HybridData initHybrid();

    private native long instanceIdWithStringInternal(int i, String str);

    private native void markPointInternal(long j, int i, String str);

    private native long startInternal(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7);

    private native void startWithFlowInstanceIdInternal(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7);

    @Override // X.InterfaceC150356pk
    public void annotate(long j, String str, String str2) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        annotateInternal(j, str, str2, false, "");
    }

    public void annotateWithCrucialData(long j, String str, String str2) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        annotateInternal(j, str, str2, true, "");
    }

    private void initNative() {
        if (!this.mIsNativeLibLoadedAndInit) {
            synchronized (this) {
                if (!this.mIsNativeLibLoadedAndInit) {
                    loadSoLibrary();
                    this.mHybridData = initHybrid();
                    this.mIsNativeLibLoadedAndInit = true;
                }
            }
        }
    }

    public static void loadSoLibrary() {
        C09170dP.A0C("spark-qpluserflow-native");
    }

    @Override // X.InterfaceC150356pk
    public void endCancel(long j, String str) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        endCancelInternal(j, str, "");
    }

    @Override // X.InterfaceC150356pk
    public void endFail(long j, String str, int i, String str2, String str3) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        endFailInternal(j, str, i, str2, str3);
    }

    @Override // X.InterfaceC150356pk
    public void endSuccess(long j) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        endSuccessInternal(j, "");
    }

    @Override // X.InterfaceC150356pk
    public long getInstanceIdWithString(int i, String str) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        return instanceIdWithStringInternal(i, str);
    }

    @Override // X.InterfaceC150356pk
    public void markPoint(long j, int i) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        markPointInternal(j, i, "");
    }

    @Override // X.InterfaceC150356pk
    public long start(int i, InterfaceC176667tO interfaceC176667tO, long j) {
        throw new RuntimeException("Not yet implemented");
    }

    @Override // X.InterfaceC150356pk
    public void startWithFlowInstanceId(long j, InterfaceC176667tO interfaceC176667tO, long j2) {
        throw new RuntimeException("Not yet implemented");
    }

    public QPLUserFlowImpl(boolean z) {
        this.mEnableLazyLoad = z;
        C150366pl.A00();
        if (!"robolectric".equals(Build.FINGERPRINT)) {
            if (!z) {
                initNative();
                return;
            }
            return;
        }
        this.mHybridData = null;
    }

    public static long getElapsedRealtimeNanos() {
        return SystemClock.elapsedRealtimeNanos();
    }

    @Override // X.InterfaceC150356pk
    public void annotate(long j, String str, String str2, String str3) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        annotateInternal(j, str, str2, false, str3);
    }

    public void annotateWithCrucialData(long j, String str, String str2, String str3) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        annotateInternal(j, str, str2, true, str3);
    }

    public void endCancel(long j, String str, String str2) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        endCancelInternal(j, str, str2);
    }

    @Override // X.InterfaceC150356pk
    public void endFail(long j, String str, int i, String str2) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        endFailInternal(j, str, i, str2, "");
    }

    @Override // X.InterfaceC150356pk
    public void endSuccess(long j, String str) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        endSuccessInternal(j, str);
    }

    @Override // X.InterfaceC150356pk
    public void markPoint(long j, int i, String str) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        markPointInternal(j, i, str);
    }

    public long start(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        return startInternal(i, str, str2, str3, str4, str5, str6, str7);
    }

    @Override // X.InterfaceC150356pk
    public void startWithFlowInstanceId(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (this.mEnableLazyLoad) {
            initNative();
        }
        startWithFlowInstanceIdInternal(j, str, str2, str3, str4, str5, str6, str7);
    }
}
