package com.google.android.gms.auth;

import X.AbstractC58322PtE;
import X.C3U5;
import X.C63474SlF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* loaded from: classes10.dex */
public class AccountChangeEventsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(28);
    public final int A00;
    public final List A01;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC58322PtE.A1G(parcel, this.A01, 2, AbstractC58322PtE.A06(parcel, this.A00));
    }

    public AccountChangeEventsResponse(int i, List list) {
        this.A00 = i;
        C3U5.A02(list);
        this.A01 = list;
    }
}
