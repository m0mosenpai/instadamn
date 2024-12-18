package com.google.android.gms.location;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.C63471SlC;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class zzbe extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(65);
    public final PendingIntent A00;
    public final String A01;
    public final List A02;

    public zzbe(PendingIntent pendingIntent, String str, List list) {
        List unmodifiableList;
        if (list == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        this.A02 = unmodifiableList;
        this.A00 = pendingIntent;
        this.A01 = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A0D(parcel, this.A02, 1);
        AbstractC128825rw.A0A(parcel, this.A00, 2, i, false);
        AbstractC58319PtB.A1D(parcel, this.A01, A04, false);
    }
}
