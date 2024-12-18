package com.instagram.clips.model.metadata;

import X.AbstractC37427Ge7;
import X.C0T6;
import X.C14360o3;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ContextualHighlightType;

/* loaded from: classes2.dex */
public final class ClipsContextualHighlightInfo extends C0T6 implements Parcelable, ClipsContextualHighlightInfoIntf {
    public static final Parcelable.Creator CREATOR = new C206139Av(51);
    public final ContextualHighlightType A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public ClipsContextualHighlightInfo(ContextualHighlightType contextualHighlightType, String str, String str2, String str3) {
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(str3, 3);
        C14360o3.A0B(contextualHighlightType, 4);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = contextualHighlightType;
    }

    @Override // com.instagram.clips.model.metadata.ClipsContextualHighlightInfoIntf
    public final ClipsContextualHighlightInfo F4F() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClipsContextualHighlightInfo) {
                ClipsContextualHighlightInfo clipsContextualHighlightInfo = (ClipsContextualHighlightInfo) obj;
                if (!C14360o3.A0K(this.A01, clipsContextualHighlightInfo.A01) || !C14360o3.A0K(this.A02, clipsContextualHighlightInfo.A02) || !C14360o3.A0K(this.A03, clipsContextualHighlightInfo.A03) || this.A00 != clipsContextualHighlightInfo.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A01;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + this.A02.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A00.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A00, i);
    }

    @Override // com.instagram.clips.model.metadata.ClipsContextualHighlightInfoIntf
    public final ContextualHighlightType ArX() {
        return this.A00;
    }

    @Override // com.instagram.clips.model.metadata.ClipsContextualHighlightInfoIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTContextualHighlightInfo", AbstractC37427Ge7.A00(this));
    }

    @Override // com.instagram.clips.model.metadata.ClipsContextualHighlightInfoIntf
    public final String getChainingMediaId() {
        return this.A01;
    }

    @Override // com.instagram.clips.model.metadata.ClipsContextualHighlightInfoIntf
    public final String getContextualHighlightId() {
        return this.A02;
    }

    @Override // com.instagram.clips.model.metadata.ClipsContextualHighlightInfoIntf
    public final String getContextualHighlightTitle() {
        return this.A03;
    }
}
