package com.google.android.gms.signin.internal;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.C61j;
import X.C63471SlC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* loaded from: classes10.dex */
public final class zag extends AbstractSafeParcelable implements C61j {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(83);
    public final String A00;
    public final List A01;

    @Override // X.C61j
    public final Status C0F() {
        if (this.A00 != null) {
            return Status.A08;
        }
        return Status.A04;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.A01;
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A0D(parcel, list, 1);
        AbstractC128825rw.A0B(parcel, this.A00);
        AbstractC128825rw.A06(parcel, A04);
    }

    public zag(List list, String str) {
        this.A01 = list;
        this.A00 = str;
    }
}
