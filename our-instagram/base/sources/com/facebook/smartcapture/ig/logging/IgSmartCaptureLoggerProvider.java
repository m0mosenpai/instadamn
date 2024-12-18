package com.facebook.smartcapture.ig.logging;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.C023409i;
import X.C14360o3;
import X.C63473SlE;
import X.C64161T1o;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.smartcapture.logging.SmartCaptureLogger;
import com.facebook.smartcapture.logging.SmartCaptureLoggerProvider;

/* loaded from: classes10.dex */
public final class IgSmartCaptureLoggerProvider implements Parcelable, SmartCaptureLoggerProvider {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(66);
    public final AbstractC12990ll A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00.getToken());
    }

    @Override // com.facebook.smartcapture.logging.SmartCaptureLoggerProvider
    public final SmartCaptureLogger get(Context context) {
        return new C64161T1o(this.A00);
    }

    public IgSmartCaptureLoggerProvider(Parcel parcel) {
        String readString = parcel.readString();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("IgSessionManager.SESSION_TOKEN_KEY", readString);
        this.A00 = C023409i.A0A.A04(A0b);
    }

    public IgSmartCaptureLoggerProvider(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 1);
        this.A00 = abstractC12990ll;
    }
}
