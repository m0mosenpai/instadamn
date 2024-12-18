package com.facebook.rsys.audio.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC50523MSb;
import X.C2N9;
import X.C55648OnZ;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public class AudioModel {
    public static C2N9 CONVERTER = C55648OnZ.A00(2);
    public static long sMcfTypeId;
    public final int activeAudioInputRouteIdx;
    public final int activeAudioOutputRouteIdx;
    public final int audioActivationState;
    public final boolean audioBufferingStarted;
    public final ArrayList availableAudioInputRoutes;
    public final ArrayList availableAudioOutputRoutes;
    public final boolean hasUsedBluetoothAudioOutputRoute;
    public final boolean isInitialModel;
    public final boolean micOn;
    public final boolean micOnDesired;
    public final boolean noiseSuppressionOn;
    public final boolean shouldResetNsAecAlgorithms;

    public static native AudioModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioModel)) {
            return false;
        }
        AudioModel audioModel = (AudioModel) obj;
        return this.audioActivationState == audioModel.audioActivationState && this.micOnDesired == audioModel.micOnDesired && this.micOn == audioModel.micOn && this.noiseSuppressionOn == audioModel.noiseSuppressionOn && this.shouldResetNsAecAlgorithms == audioModel.shouldResetNsAecAlgorithms && this.activeAudioInputRouteIdx == audioModel.activeAudioInputRouteIdx && this.availableAudioInputRoutes.equals(audioModel.availableAudioInputRoutes) && this.hasUsedBluetoothAudioOutputRoute == audioModel.hasUsedBluetoothAudioOutputRoute && this.activeAudioOutputRouteIdx == audioModel.activeAudioOutputRouteIdx && this.availableAudioOutputRoutes.equals(audioModel.availableAudioOutputRoutes) && this.audioBufferingStarted == audioModel.audioBufferingStarted && this.isInitialModel == audioModel.isInitialModel;
    }

    public int hashCode() {
        return ((AbstractC166997dE.A0J(this.availableAudioOutputRoutes, (((AbstractC166997dE.A0J(this.availableAudioInputRoutes, (((((((((JQ0.A01(this.audioActivationState) + (this.micOnDesired ? 1 : 0)) * 31) + (this.micOn ? 1 : 0)) * 31) + (this.noiseSuppressionOn ? 1 : 0)) * 31) + (this.shouldResetNsAecAlgorithms ? 1 : 0)) * 31) + this.activeAudioInputRouteIdx) * 31) + (this.hasUsedBluetoothAudioOutputRoute ? 1 : 0)) * 31) + this.activeAudioOutputRouteIdx) * 31) + (this.audioBufferingStarted ? 1 : 0)) * 31) + (this.isInitialModel ? 1 : 0);
    }

    public AudioModel(int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, ArrayList arrayList, boolean z5, int i3, ArrayList arrayList2, boolean z6, boolean z7) {
        arrayList.getClass();
        arrayList2.getClass();
        this.audioActivationState = i;
        this.micOnDesired = z;
        this.micOn = z2;
        this.noiseSuppressionOn = z3;
        this.shouldResetNsAecAlgorithms = z4;
        this.activeAudioInputRouteIdx = i2;
        this.availableAudioInputRoutes = arrayList;
        this.hasUsedBluetoothAudioOutputRoute = z5;
        this.activeAudioOutputRouteIdx = i3;
        this.availableAudioOutputRoutes = arrayList2;
        this.audioBufferingStarted = z6;
        this.isInitialModel = z7;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AudioModel{audioActivationState=");
        A1C.append(this.audioActivationState);
        A1C.append(",micOnDesired=");
        A1C.append(this.micOnDesired);
        A1C.append(",micOn=");
        A1C.append(this.micOn);
        A1C.append(",noiseSuppressionOn=");
        A1C.append(this.noiseSuppressionOn);
        A1C.append(",shouldResetNsAecAlgorithms=");
        A1C.append(this.shouldResetNsAecAlgorithms);
        A1C.append(",activeAudioInputRouteIdx=");
        A1C.append(this.activeAudioInputRouteIdx);
        A1C.append(",availableAudioInputRoutes=");
        A1C.append(this.availableAudioInputRoutes);
        A1C.append(",hasUsedBluetoothAudioOutputRoute=");
        A1C.append(this.hasUsedBluetoothAudioOutputRoute);
        A1C.append(",activeAudioOutputRouteIdx=");
        A1C.append(this.activeAudioOutputRouteIdx);
        A1C.append(",availableAudioOutputRoutes=");
        A1C.append(this.availableAudioOutputRoutes);
        A1C.append(",audioBufferingStarted=");
        A1C.append(this.audioBufferingStarted);
        A1C.append(",isInitialModel=");
        return AbstractC50523MSb.A0X(A1C, this.isInitialModel);
    }
}
