package com.instagram.igtv.uploadflow.metadata.shopping.model;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC31177DnL;
import X.C00O;
import X.C14360o3;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.shopping.productintfs.TaggingFeedSessionInformation;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class IGTVShoppingMetadata implements Parcelable {
    public static final C55343Oh9 CREATOR = C55343Oh9.A00(6);
    public TaggingFeedSessionInformation A00;
    public String A01;
    public String A02;
    public List A03;
    public Map A04;
    public boolean A05;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this != obj) {
            if (obj != null && AbstractC167017dG.A1Z(this, obj)) {
                IGTVShoppingMetadata iGTVShoppingMetadata = (IGTVShoppingMetadata) obj;
                String str3 = this.A02;
                if (str3 != null && (str2 = iGTVShoppingMetadata.A02) != null) {
                    if (str3.equals(str2)) {
                        List list = this.A03;
                        if (list != null) {
                            HashSet hashSet = new HashSet(list);
                            List list2 = iGTVShoppingMetadata.A03;
                            if (list2 != null) {
                                if (!hashSet.equals(new HashSet(list2)) || !C14360o3.A0K(this.A01, iGTVShoppingMetadata.A01)) {
                                }
                            }
                        }
                        str = "productIds";
                    }
                } else {
                    str = "merchantId";
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        C14360o3.A0B(parcel, 0);
        String str2 = this.A02;
        if (str2 != null) {
            parcel.writeString(str2);
            List<String> list = this.A03;
            if (list != null) {
                parcel.writeStringList(list);
                parcel.writeString(this.A01);
                return;
            }
            str = "productIds";
        } else {
            str = "merchantId";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final int hashCode() {
        String str;
        String str2 = this.A02;
        if (str2 != null) {
            int A0J = AbstractC166987dD.A0J(str2);
            List list = this.A03;
            if (list != null) {
                return AbstractC166997dE.A0J(list, A0J) + AbstractC31177DnL.A04(this.A01);
            }
            str = "productIds";
        } else {
            str = "merchantId";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
