package com.google.android.gms.internal.mlkit_vision_text_common;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.C63471SlC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(44);
    public final String A00;

    public zzp(String str) {
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A0B(parcel, this.A00);
        AbstractC128825rw.A06(parcel, A04);
    }

    public zzp() {
        this.A00 = null;
    }
}
