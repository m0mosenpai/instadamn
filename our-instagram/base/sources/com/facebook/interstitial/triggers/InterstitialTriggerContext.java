package com.facebook.interstitial.triggers;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C14360o3;
import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class InterstitialTriggerContext implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(23);
    public final ImmutableMap A00;
    public final boolean A01;

    public InterstitialTriggerContext(Parcel parcel) {
        HashMap readHashMap = parcel.readHashMap(HashMap.class.getClassLoader());
        C14360o3.A0C(readHashMap, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        this.A00 = ImmutableMap.copyOf((Map) readHashMap);
        this.A01 = parcel.readInt() == 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeMap(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        ImmutableMap immutableMap;
        if ((obj instanceof InterstitialTriggerContext) && (immutableMap = this.A00) != null) {
            InterstitialTriggerContext interstitialTriggerContext = (InterstitialTriggerContext) obj;
            if (immutableMap.equals(interstitialTriggerContext.A00) && this.A01 == interstitialTriggerContext.A01) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        ImmutableMap immutableMap = this.A00;
        Boolean valueOf = Boolean.valueOf(this.A01);
        return ((AbstractC167017dG.A0M(immutableMap) + 31) * 31) + AbstractC166997dE.A0I(valueOf);
    }

    public final String toString() {
        return AbstractC166987dD.A19(this.A00);
    }

    public InterstitialTriggerContext() {
        this.A00 = RegularImmutableMap.A02;
        this.A01 = false;
    }
}
