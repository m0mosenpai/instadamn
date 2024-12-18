package com.instagram.creation.capture.quickcapture.sundial.tts.intf;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public final class VoiceOption extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNM(63);
    public final String A00;
    public final String A01;
    public final String A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoiceOption) {
                VoiceOption voiceOption = (VoiceOption) obj;
                if (!C14360o3.A0K(this.A00, voiceOption.A00) || !C14360o3.A0K(this.A02, voiceOption.A02) || !C14360o3.A0K(this.A01, voiceOption.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0J(this.A00)) + AbstractC167017dG.A0O(this.A01);
    }

    public VoiceOption(String str, String str2, String str3) {
        AbstractC167017dG.A1P(str, str2);
        this.A00 = str;
        this.A02 = str2;
        this.A01 = str3;
    }
}
