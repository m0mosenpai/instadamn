package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC31171DnF;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.C3U5;
import X.C63471SlC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* loaded from: classes10.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63471SlC.A00(2);
    public final List A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzs)) {
            return false;
        }
        List list = this.A00;
        List list2 = ((zzs) obj).A00;
        if (!list.containsAll(list2) || !list2.containsAll(list)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC58322PtE.A08(AbstractC31171DnF.A0k(this.A00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC58322PtE.A1G(parcel, this.A00, 1, AbstractC58319PtB.A04(parcel));
    }

    public zzs(List list) {
        C3U5.A02(list);
        this.A00 = list;
    }
}
