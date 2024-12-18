package com.facebook.cameracore.mediapipeline.dataproviders.motion.implementation;

import X.BCT;
import X.C90D;
import X.EnumC222959sa;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public class MotionDataSourceWrapper implements BCT {
    public final C90D mDataSource;
    public final HybridData mHybridData = initHybrid();
    public boolean mIsAlive = true;

    private native HybridData initHybrid();

    private native void setData(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, long j);

    private native void setRawSensorResult(int i, float[] fArr, long j);

    public void destroy() {
        this.mIsAlive = false;
        this.mHybridData.resetNative();
    }

    public int getExecutionMode() {
        if (1 - this.mDataSource.B2u().intValue() != 0) {
            return 0;
        }
        return 1;
    }

    public boolean hasRawData() {
        return this.mDataSource.CLa();
    }

    public boolean isSensorAvailable(int i) {
        return this.mDataSource.Ccq(i);
    }

    @Override // X.BCT
    public void onDataChanged(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, long j) {
        if (this.mIsAlive) {
            setData(fArr, fArr2, fArr3, fArr4, j);
        }
    }

    @Override // X.BCT
    public void onRawSensorMeasurementChanged(EnumC222959sa enumC222959sa, float[] fArr, long j) {
        if (this.mIsAlive) {
            setRawSensorResult(enumC222959sa.A00, fArr, j);
        }
    }

    public void start() {
        this.mDataSource.start();
    }

    public void stop() {
        this.mDataSource.stop();
    }

    public MotionDataSourceWrapper(C90D c90d) {
        this.mDataSource = c90d;
        c90d.A8z(this);
    }
}
