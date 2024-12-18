package com.instagram.api.schemas;

import X.AbstractC06930Yk;
import X.C0T6;
import X.C14360o3;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class SocialProofInfoImpl extends C0T6 implements Parcelable, SocialProofInfo {
    public static final Parcelable.Creator CREATOR = new C206139Av(9);
    public final Integer A00;

    @Override // com.instagram.api.schemas.SocialProofInfo
    public final SocialProofInfoImpl Ezh() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof SocialProofInfoImpl) && C14360o3.A0K(this.A00, ((SocialProofInfoImpl) obj).A00));
    }

    public final int hashCode() {
        Integer num = this.A00;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 0;
        C14360o3.A0B(parcel, 0);
        Integer num = this.A00;
        if (num != null) {
            parcel.writeInt(1);
            i2 = num.intValue();
        }
        parcel.writeInt(i2);
    }

    @Override // com.instagram.api.schemas.SocialProofInfo
    public final Integer BXn() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.SocialProofInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Integer num = this.A00;
        if (num != null) {
            linkedHashMap.put("numOfConversationsStartedWithBusiness", num);
        }
        return new TreeUpdaterJNI("XDTCTMessagingSocialProofInfo", AbstractC06930Yk.A0B(linkedHashMap));
    }

    public SocialProofInfoImpl(Integer num) {
        this.A00 = num;
    }
}
