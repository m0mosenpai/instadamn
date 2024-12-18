package com.instagram.barcelona.creation.voiceclips.model;

import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes11.dex */
public final class VoiceRecordingResult extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70220WId(15);
    public final String A00;
    public final String A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoiceRecordingResult) {
                VoiceRecordingResult voiceRecordingResult = (VoiceRecordingResult) obj;
                if (!C14360o3.A0K(this.A01, voiceRecordingResult.A01) || !C14360o3.A0K(this.A00, voiceRecordingResult.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public VoiceRecordingResult(String str, String str2) {
        AbstractC167017dG.A1P(str, str2);
        this.A01 = str;
        this.A00 = str2;
    }
}
