package com.instagram.api.schemas;

import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC37300Gc1;
import X.AbstractC46596KjZ;
import X.C0T6;
import X.C14360o3;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class TextAppSearchDiscussionTopicImpl extends C0T6 implements Parcelable, TextAppSearchDiscussionTopic {
    public static final Parcelable.Creator CREATOR = C41857IgB.A00(51);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    @Override // com.instagram.api.schemas.TextAppSearchDiscussionTopic
    public final TextAppSearchDiscussionTopicImpl F2y() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TextAppSearchDiscussionTopicImpl) {
                TextAppSearchDiscussionTopicImpl textAppSearchDiscussionTopicImpl = (TextAppSearchDiscussionTopicImpl) obj;
                if (!C14360o3.A0K(this.A00, textAppSearchDiscussionTopicImpl.A00) || !C14360o3.A0K(this.A01, textAppSearchDiscussionTopicImpl.A01) || !C14360o3.A0K(this.A02, textAppSearchDiscussionTopicImpl.A02) || !C14360o3.A0K(this.A03, textAppSearchDiscussionTopicImpl.A03) || !C14360o3.A0K(this.A04, textAppSearchDiscussionTopicImpl.A04)) {
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
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
    }

    @Override // com.instagram.api.schemas.TextAppSearchDiscussionTopic
    public final String B5E() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.TextAppSearchDiscussionTopic
    public final String BGu() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.TextAppSearchDiscussionTopic
    public final String BTa() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.TextAppSearchDiscussionTopic
    public final String ByO() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.TextAppSearchDiscussionTopic
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTTextAppSearchDiscussionTopic", AbstractC46596KjZ.A00(this));
    }

    @Override // com.instagram.api.schemas.TextAppSearchDiscussionTopic
    public final String getTitle() {
        return this.A04;
    }

    public final int hashCode() {
        return (((((((AbstractC167017dG.A0O(this.A00) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC25227BEk.A07(this.A04);
    }

    public TextAppSearchDiscussionTopicImpl(String str, String str2, String str3, String str4, String str5) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
    }
}
