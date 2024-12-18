package com.instagram.api.schemas;

import X.AbstractC167017dG;
import X.AbstractC25226BEj;
import X.AbstractC37300Gc1;
import X.AbstractC40422HwD;
import X.C0T6;
import X.C14360o3;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class Topic extends C0T6 implements Parcelable, TopicIntf {
    public static final Parcelable.Creator CREATOR = C41857IgB.A00(70);
    public final String A00;
    public final String A01;

    public Topic(String str, String str2) {
        C14360o3.A0B(str2, 2);
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // com.instagram.api.schemas.TopicIntf
    public final Topic F3O() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Topic) {
                Topic topic = (Topic) obj;
                if (!C14360o3.A0K(this.A00, topic.A00) || !C14360o3.A0K(this.A01, topic.A01)) {
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

    @Override // com.instagram.api.schemas.TopicIntf
    public final String C9c() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.TopicIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTTopic", AbstractC40422HwD.A00(this));
    }

    @Override // com.instagram.api.schemas.TopicIntf
    public final String getStatus() {
        return this.A00;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC167017dG.A0O(this.A00) * 31);
    }
}
