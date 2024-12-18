package com.instagram.api.schemas;

import X.AbstractC33765Evr;
import X.C0T6;
import X.C14360o3;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes3.dex */
public final class UntaggableReason extends C0T6 implements Parcelable, UntaggableReasonIntf {
    public static final Parcelable.Creator CREATOR = new C41857IgB(74);
    public final InstagramProductTaggabilityState A00;
    public final LinkWithText A01;
    public final LinkWithText A02;
    public final String A03;
    public final String A04;

    @Override // com.instagram.api.schemas.UntaggableReasonIntf
    public final UntaggableReason F3T() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UntaggableReason) {
                UntaggableReason untaggableReason = (UntaggableReason) obj;
                if (!C14360o3.A0K(this.A01, untaggableReason.A01) || !C14360o3.A0K(this.A03, untaggableReason.A03) || !C14360o3.A0K(this.A02, untaggableReason.A02) || this.A00 != untaggableReason.A00 || !C14360o3.A0K(this.A04, untaggableReason.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        LinkWithText linkWithText = this.A01;
        int hashCode = (linkWithText == null ? 0 : linkWithText.hashCode()) * 31;
        String str = this.A03;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        LinkWithText linkWithText2 = this.A02;
        int hashCode3 = (hashCode2 + (linkWithText2 == null ? 0 : linkWithText2.hashCode())) * 31;
        InstagramProductTaggabilityState instagramProductTaggabilityState = this.A00;
        int hashCode4 = (hashCode3 + (instagramProductTaggabilityState == null ? 0 : instagramProductTaggabilityState.hashCode())) * 31;
        String str2 = this.A04;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A04);
    }

    @Override // com.instagram.api.schemas.UntaggableReasonIntf
    public final /* bridge */ /* synthetic */ LinkWithTextIntf AYM() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.UntaggableReasonIntf
    public final /* bridge */ /* synthetic */ LinkWithTextIntf BDX() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.UntaggableReasonIntf
    public final InstagramProductTaggabilityState C51() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.UntaggableReasonIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTUntaggableReason", AbstractC33765Evr.A00(this));
    }

    @Override // com.instagram.api.schemas.UntaggableReasonIntf
    public final String getDescription() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.UntaggableReasonIntf
    public final String getTitle() {
        return this.A04;
    }

    public UntaggableReason(InstagramProductTaggabilityState instagramProductTaggabilityState, LinkWithText linkWithText, LinkWithText linkWithText2, String str, String str2) {
        this.A01 = linkWithText;
        this.A03 = str;
        this.A02 = linkWithText2;
        this.A00 = instagramProductTaggabilityState;
        this.A04 = str2;
    }
}
