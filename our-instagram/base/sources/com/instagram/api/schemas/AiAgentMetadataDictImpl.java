package com.instagram.api.schemas;

import X.AbstractC167017dG;
import X.AbstractC68365VNz;
import X.C0T6;
import X.C14360o3;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes11.dex */
public final class AiAgentMetadataDictImpl extends C0T6 implements Parcelable, AiAgentMetadataDict {
    public static final Parcelable.Creator CREATOR = new C63469Sl9(46);
    public final IGAIAgentType A00;
    public final String A01;
    public final String A02;

    @Override // com.instagram.api.schemas.AiAgentMetadataDict
    public final AiAgentMetadataDictImpl Eqp() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AiAgentMetadataDictImpl) {
                AiAgentMetadataDictImpl aiAgentMetadataDictImpl = (AiAgentMetadataDictImpl) obj;
                if (!C14360o3.A0K(this.A01, aiAgentMetadataDictImpl.A01) || !C14360o3.A0K(this.A02, aiAgentMetadataDictImpl.A02) || this.A00 != aiAgentMetadataDictImpl.A00) {
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
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
    }

    @Override // com.instagram.api.schemas.AiAgentMetadataDict
    public final String AaX() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.AiAgentMetadataDict
    public final String Aad() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.AiAgentMetadataDict
    public final IGAIAgentType Aah() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.AiAgentMetadataDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAiAgentMetadataDict", AbstractC68365VNz.A00(this));
    }

    public final int hashCode() {
        int i = 0;
        int A0O = ((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0O(this.A02)) * 31;
        IGAIAgentType iGAIAgentType = this.A00;
        if (iGAIAgentType != null) {
            i = iGAIAgentType.hashCode();
        }
        return A0O + i;
    }

    public AiAgentMetadataDictImpl(IGAIAgentType iGAIAgentType, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = iGAIAgentType;
    }
}
