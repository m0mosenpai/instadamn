package com.instagram.reels.smb.model;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C37324GcR;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.IGAIAgentType;

/* loaded from: classes4.dex */
public final class ProfileStickerAiAgentData extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C37324GcR(36);
    public final IGAIAgentType A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProfileStickerAiAgentData) {
                ProfileStickerAiAgentData profileStickerAiAgentData = (ProfileStickerAiAgentData) obj;
                if (!C14360o3.A0K(this.A01, profileStickerAiAgentData.A01) || this.A00 != profileStickerAiAgentData.A00 || !C14360o3.A0K(this.A03, profileStickerAiAgentData.A03) || !C14360o3.A0K(this.A02, profileStickerAiAgentData.A02) || !C14360o3.A0K(this.A04, profileStickerAiAgentData.A04) || !C14360o3.A0K(this.A05, profileStickerAiAgentData.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
    }

    public final int hashCode() {
        int i = 0;
        int A0K = AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A02, ((((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31));
        String str = this.A05;
        if (str != null) {
            i = str.hashCode();
        }
        return A0K + i;
    }

    public ProfileStickerAiAgentData(IGAIAgentType iGAIAgentType, String str, String str2, String str3, String str4, String str5) {
        AbstractC167017dG.A1S(str3, str4);
        this.A01 = str;
        this.A00 = iGAIAgentType;
        this.A03 = str2;
        this.A02 = str3;
        this.A04 = str4;
        this.A05 = str5;
    }
}
