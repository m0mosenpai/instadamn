package com.instagram.api.schemas;

import X.C0T6;
import X.C14360o3;
import X.C41854Ig8;
import X.VOE;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes2.dex */
public final class ElectionAddYoursInfoDict extends C0T6 implements Parcelable, ElectionAddYoursInfoDictIntf {
    public static final Parcelable.Creator CREATOR = new C41854Ig8(69);
    public final Boolean A00;
    public final String A01;
    public final List A02;

    @Override // com.instagram.api.schemas.ElectionAddYoursInfoDictIntf
    public final ElectionAddYoursInfoDict EtB() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ElectionAddYoursInfoDict) {
                ElectionAddYoursInfoDict electionAddYoursInfoDict = (ElectionAddYoursInfoDict) obj;
                if (!C14360o3.A0K(this.A00, electionAddYoursInfoDict.A00) || !C14360o3.A0K(this.A02, electionAddYoursInfoDict.A02) || !C14360o3.A0K(this.A01, electionAddYoursInfoDict.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.A00;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List list = this.A02;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.A01;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 0;
        C14360o3.A0B(parcel, 0);
        Boolean bool = this.A00;
        if (bool != null) {
            parcel.writeInt(1);
            i2 = bool.booleanValue();
        }
        parcel.writeInt(i2);
        parcel.writeStringList(this.A02);
        parcel.writeString(this.A01);
    }

    @Override // com.instagram.api.schemas.ElectionAddYoursInfoDictIntf
    public final Boolean Axo() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.ElectionAddYoursInfoDictIntf
    public final List C91() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.ElectionAddYoursInfoDictIntf
    public final String CAs() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.ElectionAddYoursInfoDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTElectionAddYoursInfoDict", VOE.A00(this));
    }

    public ElectionAddYoursInfoDict(Boolean bool, String str, List list) {
        this.A00 = bool;
        this.A02 = list;
        this.A01 = str;
    }
}
