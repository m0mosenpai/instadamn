package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25235BEs;
import X.AbstractC37300Gc1;
import X.AbstractC37304Gc5;
import X.C17T;
import X.C39305HXw;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class ImmutablePandoXDTMetaAIMediaSuggestedPromptInfo extends C17T implements XDTMetaAIMediaSuggestedPromptInfo {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(27);

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.XDTMetaAIMediaSuggestedPromptInfo
    public final XDTMetaAIMediaSuggestedPromptInfoImpl F43() {
        return new XDTMetaAIMediaSuggestedPromptInfoImpl(A0i(1634460456));
    }

    @Override // com.instagram.api.schemas.XDTMetaAIMediaSuggestedPromptInfo
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        if (A0i(1634460456) != null) {
            A0X.put("prompt_text", A0i(1634460456));
        }
        return AbstractC37304Gc5.A07(this, A0X);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
