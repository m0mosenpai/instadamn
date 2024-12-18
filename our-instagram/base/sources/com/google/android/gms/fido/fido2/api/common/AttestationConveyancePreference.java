package com.google.android.gms.fido.fido2.api.common;

import X.C63474SlF;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.realtimeclient.RealtimeConstants;

/* loaded from: classes10.dex */
public enum AttestationConveyancePreference implements Parcelable {
    NONE(NetInfoModule.CONNECTION_TYPE_NONE),
    /* JADX INFO: Fake field, exist only in values array */
    INDIRECT("indirect"),
    /* JADX INFO: Fake field, exist only in values array */
    DIRECT(RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING);

    public static final Parcelable.Creator CREATOR = C63474SlF.A01(84);
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }

    AttestationConveyancePreference(String str) {
        this.A00 = str;
    }

    public static AttestationConveyancePreference A00(String str) {
        for (AttestationConveyancePreference attestationConveyancePreference : values()) {
            if (str.equals(attestationConveyancePreference.A00)) {
                return attestationConveyancePreference;
            }
        }
        throw new Exception(String.format("Attestation conveyance preference %s not supported", str));
    }
}
