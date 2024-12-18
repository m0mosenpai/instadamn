package com.instagram.creation.genai.contextualbackground.model;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167027dH;
import X.AbstractC25226BEj;
import X.C0T6;
import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes5.dex */
public final class ContextualBackgroundSourceImage extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNM(69);
    public final ImageUrl A00;
    public final String A01;
    public final String A02;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ContextualBackgroundSourceImage) {
                ContextualBackgroundSourceImage contextualBackgroundSourceImage = (ContextualBackgroundSourceImage) obj;
                if (!C14360o3.A0K(this.A01, contextualBackgroundSourceImage.A01) || !C14360o3.A0K(this.A00, contextualBackgroundSourceImage.A00) || !C14360o3.A0K(this.A02, contextualBackgroundSourceImage.A02)) {
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
        parcel.writeString(this.A02);
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0J(this.A01)));
    }

    public ContextualBackgroundSourceImage(ImageUrl imageUrl, String str, String str2) {
        AbstractC167027dH.A13(str, imageUrl, str2);
        this.A01 = str;
        this.A00 = imageUrl;
        this.A02 = str2;
    }
}
