package com.instagram.direct.ui.collections;

import X.AbstractC43591JPw;
import X.C14360o3;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.save.model.SavedCollection;

/* loaded from: classes6.dex */
public final class DirectThreadDetailsCollectionViewModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNL(44);
    public final SavedCollection A00;
    public final Integer A01;

    public DirectThreadDetailsCollectionViewModel(SavedCollection savedCollection, Integer num) {
        C14360o3.A0B(num, 1);
        this.A01 = num;
        this.A00 = savedCollection;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String A00;
        C14360o3.A0B(parcel, 0);
        if (this.A01.intValue() != 0) {
            A00 = "LOAD_MORE";
        } else {
            A00 = AbstractC43591JPw.A00(554);
        }
        parcel.writeString(A00);
        parcel.writeParcelable(this.A00, i);
    }
}
