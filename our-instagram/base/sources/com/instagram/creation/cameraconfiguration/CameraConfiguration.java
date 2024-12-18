package com.instagram.creation.cameraconfiguration;

import X.AbstractC001800i;
import X.AbstractC16960so;
import X.AbstractC171987lT;
import X.C00O;
import X.C14360o3;
import X.C206139Av;
import X.C55U;
import X.C81W;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class CameraConfiguration implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C206139Av(65);
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final C55U A03;
    public final Set A04;

    public CameraConfiguration(Parcel parcel) {
        this.A00 = true;
        this.A01 = true;
        this.A03 = AbstractC171987lT.A00(parcel.readString());
        int[] createIntArray = parcel.createIntArray();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (createIntArray != null) {
            for (int i : createIntArray) {
                linkedHashSet.add(C81W.values()[i]);
            }
        }
        this.A04 = AbstractC001800i.A0k(linkedHashSet);
        this.A00 = parcel.readInt() == 1;
        this.A02 = parcel.readInt() == 1;
        this.A01 = parcel.readInt() == 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A03.A02);
        Set set = this.A04;
        int[] iArr = new int[set.size()];
        int i2 = 0;
        for (Object obj : set) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            iArr[i2] = ((C81W) obj).ordinal();
            i2 = i3;
        }
        parcel.writeIntArray(iArr);
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public CameraConfiguration(C55U c55u, Set set, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(set, 1);
        C14360o3.A0B(c55u, 2);
        this.A00 = true;
        this.A01 = true;
        this.A04 = AbstractC001800i.A0k(set);
        this.A03 = c55u;
        this.A00 = z;
        this.A02 = z2;
        this.A01 = z3;
    }

    public CameraConfiguration(C55U c55u, Set set) {
        C14360o3.A0B(set, 1);
        this.A00 = true;
        this.A01 = true;
        this.A04 = AbstractC001800i.A0k(set);
        this.A03 = c55u;
    }
}
