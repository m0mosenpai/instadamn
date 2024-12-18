package com.google.android.gms.common.moduleinstall.internal;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.AbstractC58321PtD;
import X.AbstractC58322PtE;
import X.C3U5;
import X.C63474SlF;
import X.SSI;
import X.TSL;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes10.dex */
public class ApiFeatureRequest extends AbstractSafeParcelable {
    public final List A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(44);
    public static final Comparator A04 = TSL.A00;

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ApiFeatureRequest)) {
            return false;
        }
        ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) obj;
        if (this.A03 == apiFeatureRequest.A03 && SSI.A01(this.A00, apiFeatureRequest.A00) && SSI.A01(this.A01, apiFeatureRequest.A01)) {
            return SSI.A00(this.A02, apiFeatureRequest.A02);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC58321PtD.A0C(Boolean.valueOf(this.A03), this.A00, this.A01, this.A02);
    }

    public ApiFeatureRequest(List list, boolean z, String str, String str2) {
        C3U5.A02(list);
        this.A00 = list;
        this.A03 = z;
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A042 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A0E(parcel, this.A00, 1, false);
        AbstractC128825rw.A09(parcel, 2, this.A03);
        AbstractC128825rw.A0C(parcel, this.A01, 3, false);
        AbstractC58322PtE.A1F(parcel, this.A02, A042, false);
    }
}
