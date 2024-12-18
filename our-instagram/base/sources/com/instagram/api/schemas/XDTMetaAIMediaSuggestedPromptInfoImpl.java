package com.instagram.api.schemas;

import X.AbstractC06930Yk;
import X.AbstractC167017dG;
import X.AbstractC37300Gc1;
import X.C0T6;
import X.C14360o3;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class XDTMetaAIMediaSuggestedPromptInfoImpl extends C0T6 implements Parcelable, XDTMetaAIMediaSuggestedPromptInfo {
    public static final Parcelable.Creator CREATOR = C41857IgB.A00(92);
    public final String A00;

    @Override // com.instagram.api.schemas.XDTMetaAIMediaSuggestedPromptInfo
    public final XDTMetaAIMediaSuggestedPromptInfoImpl F43() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof XDTMetaAIMediaSuggestedPromptInfoImpl) && C14360o3.A0K(this.A00, ((XDTMetaAIMediaSuggestedPromptInfoImpl) obj).A00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
    }

    public final int hashCode() {
        return AbstractC167017dG.A0O(this.A00);
    }

    public XDTMetaAIMediaSuggestedPromptInfoImpl(String str) {
        this.A00 = str;
    }

    @Override // com.instagram.api.schemas.XDTMetaAIMediaSuggestedPromptInfo
    public final TreeUpdaterJNI F7o() {
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        String str = this.A00;
        if (str != null) {
            A0X.put("prompt_text", str);
        }
        return AbstractC37300Gc1.A05("XDTMetaAIMediaSuggestedPromptInfo", AbstractC06930Yk.A0B(A0X));
    }
}
