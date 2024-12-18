package com.instagram.direct.fragment.permanentmedia;

import X.C0T6;
import X.C14360o3;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class MediaViewerReplyBarEligibilityCheckerImpl extends C0T6 implements MediaViewerReplyBarEligibilityChecker {
    public static final Parcelable.Creator CREATOR = new C206139Av(73);
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MediaViewerReplyBarEligibilityCheckerImpl) {
                MediaViewerReplyBarEligibilityCheckerImpl mediaViewerReplyBarEligibilityCheckerImpl = (MediaViewerReplyBarEligibilityCheckerImpl) obj;
                if (this.A02 != mediaViewerReplyBarEligibilityCheckerImpl.A02 || this.A01 != mediaViewerReplyBarEligibilityCheckerImpl.A01 || this.A00 != mediaViewerReplyBarEligibilityCheckerImpl.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A00 ? 1 : 0);
    }

    @Override // com.instagram.direct.fragment.permanentmedia.MediaViewerReplyBarEligibilityChecker
    public final boolean Ejg() {
        if (!this.A02 || this.A01 || !this.A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A01) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A00) {
            i5 = 1231;
        }
        return i4 + i5;
    }

    public MediaViewerReplyBarEligibilityCheckerImpl(boolean z, boolean z2, boolean z3) {
        this.A02 = z;
        this.A01 = z2;
        this.A00 = z3;
    }
}
