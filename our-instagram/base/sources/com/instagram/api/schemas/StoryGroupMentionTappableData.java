package com.instagram.api.schemas;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC40289Htt;
import X.C0T6;
import X.C14360o3;
import X.C1DV;
import X.C1DY;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class StoryGroupMentionTappableData extends C0T6 implements Parcelable, StoryGroupMentionTappableDataIntf {
    public static final Parcelable.Creator CREATOR = new C41857IgB(16);
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List A04;

    @Override // com.instagram.api.schemas.StoryGroupMentionTappableDataIntf
    public final StoryGroupMentionTappableData F0e(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.api.schemas.StoryGroupMentionTappableDataIntf
    public final StoryGroupMentionTappableData F0f(C1DV c1dv) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StoryGroupMentionTappableData) {
                StoryGroupMentionTappableData storyGroupMentionTappableData = (StoryGroupMentionTappableData) obj;
                if (!C14360o3.A0K(this.A01, storyGroupMentionTappableData.A01) || !C14360o3.A0K(this.A02, storyGroupMentionTappableData.A02) || !C14360o3.A0K(this.A04, storyGroupMentionTappableData.A04) || !C14360o3.A0K(this.A00, storyGroupMentionTappableData.A00) || !C14360o3.A0K(this.A03, storyGroupMentionTappableData.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int intValue;
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        List list = this.A04;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((Parcelable) it.next(), i);
        }
        Integer num = this.A00;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
        parcel.writeString(this.A03);
    }

    @Override // com.instagram.api.schemas.StoryGroupMentionTappableDataIntf
    public final String AvN() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.StoryGroupMentionTappableDataIntf
    public final List BSS() {
        return this.A04;
    }

    @Override // com.instagram.api.schemas.StoryGroupMentionTappableDataIntf
    public final Integer C0i() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.StoryGroupMentionTappableDataIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryGroupMentionTappableData", AbstractC40289Htt.A00(this));
    }

    @Override // com.instagram.api.schemas.StoryGroupMentionTappableDataIntf
    public final String getId() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.StoryGroupMentionTappableDataIntf
    public final String getText() {
        return this.A03;
    }

    public final int hashCode() {
        int i = 0;
        int A0J = (AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0K(this.A02, AbstractC167017dG.A0O(this.A01) * 31)) + AbstractC167017dG.A0M(this.A00)) * 31;
        String str = this.A03;
        if (str != null) {
            i = str.hashCode();
        }
        return A0J + i;
    }

    public StoryGroupMentionTappableData(Integer num, String str, String str2, String str3, List list) {
        AbstractC167017dG.A1R(str2, list);
        this.A01 = str;
        this.A02 = str2;
        this.A04 = list;
        this.A00 = num;
        this.A03 = str3;
    }

    @Override // com.instagram.api.schemas.StoryGroupMentionTappableDataIntf
    public final StoryGroupMentionTappableDataIntf EAF(C1DY c1dy) {
        return this;
    }
}
