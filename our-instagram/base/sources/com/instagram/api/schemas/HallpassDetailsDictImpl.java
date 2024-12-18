package com.instagram.api.schemas;

import X.AbstractC33694Eui;
import X.C0T6;
import X.C14360o3;
import X.C1DY;
import X.C206149Aw;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class HallpassDetailsDictImpl extends C0T6 implements Parcelable, HallpassDetailsDict {
    public static final Parcelable.Creator CREATOR = new C206149Aw(97);
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;

    @Override // com.instagram.api.schemas.HallpassDetailsDict
    public final HallpassDetailsDictImpl Eu6(C1DY c1dy) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HallpassDetailsDictImpl) {
                HallpassDetailsDictImpl hallpassDetailsDictImpl = (HallpassDetailsDictImpl) obj;
                if (!C14360o3.A0K(this.A00, hallpassDetailsDictImpl.A00) || !C14360o3.A0K(this.A01, hallpassDetailsDictImpl.A01) || !C14360o3.A0K(this.A02, hallpassDetailsDictImpl.A02) || !C14360o3.A0K(this.A03, hallpassDetailsDictImpl.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A00;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A01;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A02;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.A03;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        List list = this.A03;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((Parcelable) it.next(), i);
        }
    }

    @Override // com.instagram.api.schemas.HallpassDetailsDict
    public final String BAt() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.HallpassDetailsDict
    public final List ByP() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.HallpassDetailsDict
    public final HallpassDetailsDict E99(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.api.schemas.HallpassDetailsDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTHallpassDetailsDict", AbstractC33694Eui.A00(this));
    }

    @Override // com.instagram.api.schemas.HallpassDetailsDict
    public final String getColor() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.HallpassDetailsDict
    public final String getName() {
        return this.A02;
    }

    public HallpassDetailsDictImpl(String str, String str2, String str3, List list) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = list;
    }
}
