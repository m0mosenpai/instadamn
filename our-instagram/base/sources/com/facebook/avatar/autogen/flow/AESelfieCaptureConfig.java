package com.facebook.avatar.autogen.flow;

import X.AbstractC25235BEs;
import X.AbstractC31179DnN;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.AbstractC58322PtE;
import X.AbstractC58323PtF;
import X.AbstractC63311ShH;
import X.C14360o3;
import X.C63475SlG;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.smartcapture.facetracker.FaceTrackerModelsProvider;
import com.facebook.smartcapture.resources.ResourcesProvider;

/* loaded from: classes10.dex */
public class AESelfieCaptureConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63475SlG.A02(12);
    public final FaceTrackerModelsProvider A00;
    public final Boolean A01;
    public final String A02;
    public final ResourcesProvider A03;

    public AESelfieCaptureConfig(FaceTrackerModelsProvider faceTrackerModelsProvider, Boolean bool, String str) {
        this.A00 = faceTrackerModelsProvider;
        this.A03 = null;
        this.A01 = bool;
        this.A02 = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AESelfieCaptureConfig) {
                AESelfieCaptureConfig aESelfieCaptureConfig = (AESelfieCaptureConfig) obj;
                if (!C14360o3.A0K(this.A00, aESelfieCaptureConfig.A00) || !C14360o3.A0K(this.A03, aESelfieCaptureConfig.A03) || !C14360o3.A0K(this.A01, aESelfieCaptureConfig.A01) || !C14360o3.A0K(this.A02, aESelfieCaptureConfig.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((AbstractC63311ShH.A02(this.A00) * 31) + AbstractC25235BEs.A06(this.A03)) * 31) + AbstractC25235BEs.A06(this.A01)) * 31) + AbstractC25235BEs.A06(this.A02);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC58323PtF.A1A(parcel, this.A00, i);
        AbstractC58323PtF.A1A(parcel, this.A03, i);
        AbstractC31179DnN.A0p(parcel, this.A01);
        AbstractC58322PtE.A1E(parcel, this.A02, 0, 1);
    }

    public AESelfieCaptureConfig(Parcel parcel) {
        ClassLoader A0g = AbstractC58319PtB.A0g(this);
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (FaceTrackerModelsProvider) parcel.readParcelable(A0g);
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = (ResourcesProvider) parcel.readParcelable(A0g);
        }
        this.A01 = parcel.readInt() != 0 ? Boolean.valueOf(AbstractC58320PtC.A1T(parcel)) : null;
        this.A02 = AbstractC58322PtE.A0n(parcel);
    }
}
