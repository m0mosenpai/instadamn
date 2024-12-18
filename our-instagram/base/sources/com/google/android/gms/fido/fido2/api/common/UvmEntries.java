package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC31171DnF;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.C63474SlF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes10.dex */
public class UvmEntries extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(87);
    public final List A00;

    public final boolean equals(Object obj) {
        if (obj instanceof UvmEntries) {
            List list = this.A00;
            List list2 = ((UvmEntries) obj).A00;
            if (list == null) {
                if (list2 == null) {
                    return true;
                }
            } else if (list2 != null && list.containsAll(list2) && list2.containsAll(list)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        HashSet A0k;
        List list = this.A00;
        if (list == null) {
            A0k = null;
        } else {
            A0k = AbstractC31171DnF.A0k(list);
        }
        return AbstractC58322PtE.A08(A0k);
    }

    public UvmEntries(List list) {
        this.A00 = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC58322PtE.A1G(parcel, this.A00, 1, AbstractC58319PtB.A04(parcel));
    }
}
