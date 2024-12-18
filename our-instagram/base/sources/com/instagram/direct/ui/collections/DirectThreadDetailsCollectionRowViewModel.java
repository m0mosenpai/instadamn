package com.instagram.direct.ui.collections;

import X.AbstractC166987dD;
import X.AbstractC25231BEo;
import X.C14360o3;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class DirectThreadDetailsCollectionRowViewModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNL(43);
    public List A01 = AbstractC166987dD.A1E();
    public String A00 = null;
    public boolean A02 = false;
    public boolean A03 = false;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A01);
        while (A0u.hasNext()) {
            ((DirectThreadDetailsCollectionViewModel) A0u.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
    }
}
