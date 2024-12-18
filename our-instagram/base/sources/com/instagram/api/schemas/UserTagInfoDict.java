package com.instagram.api.schemas;

import X.AbstractC37372GdE;
import X.C0T6;
import X.C14360o3;
import X.C1DY;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class UserTagInfoDict extends C0T6 implements UserTagInfoDictIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C206139Av(36);
    public final User A00;
    public final Boolean A01;
    public final Float A02;
    public final Float A03;
    public final List A04;
    public final List A05;

    @Override // com.instagram.api.schemas.UserTagInfoDictIntf
    public final UserTagInfoDictIntf EBA(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.api.schemas.UserTagInfoDictIntf
    public final UserTagInfoDict F3g(C1DY c1dy) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UserTagInfoDict) {
                UserTagInfoDict userTagInfoDict = (UserTagInfoDict) obj;
                if (!C14360o3.A0K(this.A04, userTagInfoDict.A04) || !C14360o3.A0K(this.A02, userTagInfoDict.A02) || !C14360o3.A0K(this.A05, userTagInfoDict.A05) || !C14360o3.A0K(this.A01, userTagInfoDict.A01) || !C14360o3.A0K(this.A03, userTagInfoDict.A03) || !C14360o3.A0K(this.A00, userTagInfoDict.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A04;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Float f = this.A02;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        List list2 = this.A05;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.A01;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Float f2 = this.A03;
        int hashCode5 = (hashCode4 + (f2 == null ? 0 : f2.hashCode())) * 31;
        User user = this.A00;
        return hashCode5 + (user != null ? user.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeStringList(this.A04);
        Float f = this.A02;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        List list = this.A05;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                parcel.writeFloat(((Number) it.next()).floatValue());
            }
        }
        Boolean bool = this.A01;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Float f2 = this.A03;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f2.floatValue());
        }
        parcel.writeParcelable(this.A00, i);
    }

    @Override // com.instagram.api.schemas.UserTagInfoDictIntf
    public final List AmW() {
        return this.A04;
    }

    @Override // com.instagram.api.schemas.UserTagInfoDictIntf
    public final Float Azj() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.UserTagInfoDictIntf
    public final List Bec() {
        return this.A05;
    }

    @Override // com.instagram.api.schemas.UserTagInfoDictIntf
    public final Boolean Bw5() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.UserTagInfoDictIntf
    public final Float Bzn() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.UserTagInfoDictIntf
    public final User CDj() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.UserTagInfoDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTUserTagInfoDict", AbstractC37372GdE.A00(this));
    }

    public UserTagInfoDict(User user, Boolean bool, Float f, Float f2, List list, List list2) {
        this.A04 = list;
        this.A02 = f;
        this.A05 = list2;
        this.A01 = bool;
        this.A03 = f2;
        this.A00 = user;
    }
}
