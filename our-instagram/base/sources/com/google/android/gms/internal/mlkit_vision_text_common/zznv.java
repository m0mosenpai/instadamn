package com.google.android.gms.internal.mlkit_vision_text_common;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.C63471SlC;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* loaded from: classes10.dex */
public final class zznv extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(41);
    public final Rect A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final List A04;

    public zznv(Rect rect, String str, String str2, List list, List list2) {
        this.A01 = str;
        this.A00 = rect;
        this.A03 = list;
        this.A02 = str2;
        this.A04 = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        boolean A1Q = AbstractC58319PtB.A1Q(parcel, this.A01);
        AbstractC128825rw.A0A(parcel, this.A00, 2, i, A1Q);
        AbstractC128825rw.A0E(parcel, this.A03, 3, A1Q);
        AbstractC128825rw.A0C(parcel, this.A02, 4, A1Q);
        AbstractC128825rw.A0E(parcel, this.A04, 5, A1Q);
        AbstractC128825rw.A06(parcel, A04);
    }
}
