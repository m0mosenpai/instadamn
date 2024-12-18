package com.instagram.api.schemas;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC31181DnP;
import X.AbstractC33675EuP;
import X.C0T6;
import X.C14360o3;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes6.dex */
public final class CommentPromptImpl extends C0T6 implements Parcelable, CommentPrompt {
    public static final Parcelable.Creator CREATOR = new C41854Ig8(28);
    public final Integer A00;
    public final String A01;

    @Override // com.instagram.api.schemas.CommentPrompt
    public final CommentPromptImpl EsS() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CommentPromptImpl) {
                CommentPromptImpl commentPromptImpl = (CommentPromptImpl) obj;
                if (!C14360o3.A0K(this.A01, commentPromptImpl.A01) || !C14360o3.A0K(this.A00, commentPromptImpl.A00)) {
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
        parcel.writeInt(AbstractC31181DnP.A01(parcel, this.A00));
    }

    @Override // com.instagram.api.schemas.CommentPrompt
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTCommentPrompt", AbstractC33675EuP.A00(this));
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A01) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public CommentPromptImpl(String str, Integer num) {
        this.A01 = str;
        this.A00 = num;
    }

    @Override // com.instagram.api.schemas.CommentPrompt
    public final String BbH() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.CommentPrompt
    public final Integer BnC() {
        return this.A00;
    }
}
