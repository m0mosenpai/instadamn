package com.instagram.aistudio.logging;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.IGAIAgentType;

/* loaded from: classes8.dex */
public final class AiStudioLoggingData extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C63469Sl9(21);
    public final IGAIAgentType A00;
    public final String A01;

    public AiStudioLoggingData(IGAIAgentType iGAIAgentType, String str) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = iGAIAgentType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AiStudioLoggingData) {
                AiStudioLoggingData aiStudioLoggingData = (AiStudioLoggingData) obj;
                if (!C14360o3.A0K(this.A01, aiStudioLoggingData.A01) || this.A00 != aiStudioLoggingData.A00) {
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
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A01) + AbstractC167017dG.A0M(this.A00);
    }
}
