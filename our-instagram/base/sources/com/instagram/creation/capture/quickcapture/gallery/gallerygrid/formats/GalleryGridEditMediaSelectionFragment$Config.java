package com.instagram.creation.capture.quickcapture.gallery.gallerygrid.formats;

import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class GalleryGridEditMediaSelectionFragment$Config implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNM(53);
    public final String A00;
    public final List A01;
    public final List A02;

    public GalleryGridEditMediaSelectionFragment$Config(List list, List list2, String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
        this.A02 = list;
        this.A01 = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        List list = this.A02;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((Parcelable) it.next(), i);
        }
        List list2 = this.A01;
        parcel.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable((Parcelable) it2.next(), i);
        }
    }
}
