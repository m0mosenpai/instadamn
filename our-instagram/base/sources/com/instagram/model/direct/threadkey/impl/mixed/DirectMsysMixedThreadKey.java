package com.instagram.model.direct.threadkey.impl.mixed;

import X.C0T6;
import X.C14360o3;
import X.C3o9;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import kotlin.Deprecated;

@Deprecated(message = "Replaced by DirectMsysMixedThreadTarget and DirectMsysMixedThreadId")
/* loaded from: classes3.dex */
public final class DirectMsysMixedThreadKey extends C0T6 implements Parcelable, C3o9 {
    public static final Parcelable.Creator CREATOR = new C55343Oh9(77);
    public final DirectThreadKey A00;
    public final MsysThreadId A01;

    public DirectMsysMixedThreadKey(DirectThreadKey directThreadKey, MsysThreadId msysThreadId) {
        C14360o3.A0B(directThreadKey, 1);
        C14360o3.A0B(msysThreadId, 2);
        this.A00 = directThreadKey;
        this.A01 = msysThreadId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DirectMsysMixedThreadKey) {
                DirectMsysMixedThreadKey directMsysMixedThreadKey = (DirectMsysMixedThreadKey) obj;
                if (!C14360o3.A0K(this.A00, directMsysMixedThreadKey.A00) || !C14360o3.A0K(this.A01, directMsysMixedThreadKey.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
    }
}
