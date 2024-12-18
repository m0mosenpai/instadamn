package com.google.android.gms.internal.mlkit_vision_text_common;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.C63471SlC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* loaded from: classes10.dex */
public final class zznx extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(42);
    public final String A00;
    public final List A01;

    public zznx(String str, List list) {
        this.A00 = str;
        this.A01 = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A0E(parcel, this.A01, 2, AbstractC58319PtB.A1Q(parcel, this.A00));
        AbstractC128825rw.A06(parcel, A04);
    }
}
