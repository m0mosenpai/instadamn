package com.google.android.gms.auth.blockstore;

import X.AbstractC128825rw;
import X.AbstractC166987dD;
import X.AbstractC58319PtB;
import X.C3U5;
import X.C63474SlF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public class RetrieveBytesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(23);
    public final List A00;
    public final boolean A01;

    public RetrieveBytesRequest(List list, boolean z) {
        if (z) {
            boolean z2 = true;
            if (list != null && !list.isEmpty()) {
                z2 = false;
            }
            C3U5.A09(z2, "retrieveAll was set to true but other constraint(s) was also provided: keys");
        }
        this.A01 = z;
        this.A00 = AbstractC166987dD.A1E();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String A1B = AbstractC166987dD.A1B(it);
                C3U5.A06(A1B, "Element in keys cannot be null or empty");
                this.A00.add(A1B);
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A0D(parcel, Collections.unmodifiableList(this.A00), 1);
        AbstractC128825rw.A09(parcel, 2, this.A01);
        AbstractC128825rw.A06(parcel, A04);
    }
}
