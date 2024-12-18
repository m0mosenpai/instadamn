package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC68365VNz;
import X.C14360o3;
import X.C17T;
import X.C39306HXx;
import X.C71803X5h;
import android.os.Parcel;
import com.facebook.pando.TreeParcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes11.dex */
public final class ImmutablePandoAiAgentMetadataDict extends C17T implements AiAgentMetadataDict {
    public static final AbstractC136426Fv CREATOR = new C39306HXx(4);

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        TreeParcelable.A01(parcel, this);
    }

    @Override // com.instagram.api.schemas.AiAgentMetadataDict
    public final IGAIAgentType Aah() {
        return (IGAIAgentType) A0N(-2115714901, C71803X5h.A00);
    }

    @Override // com.instagram.api.schemas.AiAgentMetadataDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(AbstractC68365VNz.A00(this), this);
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.AiAgentMetadataDict
    public final String AaX() {
        return A0j(898037404);
    }

    @Override // com.instagram.api.schemas.AiAgentMetadataDict
    public final String Aad() {
        return A0j(1862787067);
    }

    @Override // com.instagram.api.schemas.AiAgentMetadataDict
    public final AiAgentMetadataDictImpl Eqp() {
        return new AiAgentMetadataDictImpl(Aah(), A0j(898037404), A0j(1862787067));
    }
}
