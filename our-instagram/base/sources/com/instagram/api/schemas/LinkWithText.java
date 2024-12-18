package com.instagram.api.schemas;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25226BEj;
import X.AbstractC33712Ev0;
import X.C0T6;
import X.C14360o3;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes6.dex */
public final class LinkWithText extends C0T6 implements Parcelable, LinkWithTextIntf {
    public static final Parcelable.Creator CREATOR = new C41858IgC(71);
    public final String A00;
    public final String A01;

    @Override // com.instagram.api.schemas.LinkWithTextIntf
    public final LinkWithText Evt() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LinkWithText) {
                LinkWithText linkWithText = (LinkWithText) obj;
                if (!C14360o3.A0K(this.A00, linkWithText.A00) || !C14360o3.A0K(this.A01, linkWithText.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    @Override // com.instagram.api.schemas.LinkWithTextIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTLinkWithText", AbstractC33712Ev0.A00(this));
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166987dD.A0J(this.A00));
    }

    public LinkWithText(String str, String str2) {
        AbstractC167017dG.A1P(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // com.instagram.api.schemas.LinkWithTextIntf
    public final String getText() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.LinkWithTextIntf
    public final String getUrl() {
        return this.A01;
    }
}
