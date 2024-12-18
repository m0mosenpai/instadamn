package com.instagram.aistudio.model;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167027dH;
import X.C0T6;
import X.C14360o3;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.api.schemas.IGAIAgentVisibilityStatus;

/* loaded from: classes6.dex */
public final class AiAgentShareModel extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C63469Sl9(22);
    public final IGAIAgentType A00;
    public final String A01;
    public final IGAIAgentVisibilityStatus A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AiAgentShareModel) {
                AiAgentShareModel aiAgentShareModel = (AiAgentShareModel) obj;
                if (!C14360o3.A0K(this.A01, aiAgentShareModel.A01) || this.A00 != aiAgentShareModel.A00 || this.A02 != aiAgentShareModel.A02) {
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
        parcel.writeParcelable(this.A02, i);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0J(this.A01)));
    }

    public AiAgentShareModel(IGAIAgentType iGAIAgentType, IGAIAgentVisibilityStatus iGAIAgentVisibilityStatus, String str) {
        AbstractC167027dH.A13(str, iGAIAgentType, iGAIAgentVisibilityStatus);
        this.A01 = str;
        this.A00 = iGAIAgentType;
        this.A02 = iGAIAgentVisibilityStatus;
    }
}
