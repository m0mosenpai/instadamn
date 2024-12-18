package com.facebook.interstitial.triggers;

import X.AnonymousClass001;
import X.C14360o3;
import X.C63473SlE;
import X.XgO;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes12.dex */
public final class InterstitialTrigger implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = new C63473SlE(22);
    public final int A00;
    public final InterstitialTriggerContext A01;
    public final String A02;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C14360o3.A0B(obj, 0);
        return toString().compareTo(obj.toString());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(XgO.A00(this.A00));
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A01, i);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterstitialTrigger) {
            return C14360o3.A0K(toString(), obj.toString());
        }
        return false;
    }

    public final String toString() {
        String str = this.A02;
        int i = this.A00;
        if (str != null) {
            return AnonymousClass001.A0T(XgO.A00(i), str, ':');
        }
        return XgO.A00(i);
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x2644, code lost:
    
        if (r0 == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public InterstitialTrigger(android.os.Parcel r4) {
        /*
            Method dump skipped, instructions count: 13716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.interstitial.triggers.InterstitialTrigger.<init>(android.os.Parcel):void");
    }

    public InterstitialTrigger() {
        this.A02 = null;
        this.A00 = 10000;
        this.A01 = null;
    }
}
