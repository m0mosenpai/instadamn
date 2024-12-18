package com.facebook.location.signalpackage.parcelable;

import X.AbstractC167007dF;
import X.AbstractC58576Pxu;
import X.AbstractC62536SFn;
import X.C63473SlE;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: classes10.dex */
public class ParcelableActivityRecognitionResult extends AbstractC62536SFn implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63473SlE.A01(31);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof AbstractC62536SFn)) {
            AbstractC62536SFn abstractC62536SFn = (AbstractC62536SFn) obj;
            if (this.A01 == abstractC62536SFn.A01 && this.A00 == abstractC62536SFn.A00) {
                List list = this.A02;
                List list2 = abstractC62536SFn.A02;
                if (list != null) {
                    return list.equals(list2);
                }
                return list2 == null;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        long j = this.A01;
        int A07 = AbstractC167007dF.A07(this.A00, ((int) (j ^ (j >>> 32))) * 31);
        List list = this.A02;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        return A07 + i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ImmutableList A01;
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
        List list = this.A02;
        if (list == null) {
            A01 = null;
        } else {
            A01 = AbstractC58576Pxu.A01(AbstractC58576Pxu.A00(list), 8);
        }
        parcel.writeTypedList(A01);
    }
}
