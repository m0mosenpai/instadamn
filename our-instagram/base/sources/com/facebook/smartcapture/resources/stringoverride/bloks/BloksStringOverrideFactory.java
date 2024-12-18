package com.facebook.smartcapture.resources.stringoverride.bloks;

import X.C14360o3;
import X.C63468Sl8;
import X.C64165T1t;
import X.InterfaceC65373Tj5;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.smartcapture.resources.stringoverride.StringOverrideFactory;
import java.util.Map;

/* loaded from: classes10.dex */
public final class BloksStringOverrideFactory implements Parcelable, StringOverrideFactory {
    public static final C63468Sl8 CREATOR = new Object();
    public final Map A00;

    public BloksStringOverrideFactory(Map map) {
        C14360o3.A0B(map, 1);
        this.A00 = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeMap(this.A00);
    }

    @Override // com.facebook.smartcapture.resources.stringoverride.StringOverrideFactory
    public final InterfaceC65373Tj5 ALD() {
        return new C64165T1t(this.A00);
    }
}
