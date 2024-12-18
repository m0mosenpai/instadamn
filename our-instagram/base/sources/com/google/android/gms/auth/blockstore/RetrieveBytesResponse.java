package com.google.android.gms.auth.blockstore;

import X.AbstractC128825rw;
import X.AbstractC166987dD;
import X.AbstractC25228BEl;
import X.AbstractC58319PtB;
import X.C63474SlF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public class RetrieveBytesResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(24);
    public final Map A00;

    @Deprecated
    public final Bundle A01;
    public final List A02;

    /* loaded from: classes10.dex */
    public class BlockstoreData extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = C63474SlF.A01(21);
        public final String A00;
        public final byte[] A01;

        public final boolean equals(Object obj) {
            if (!(obj instanceof BlockstoreData)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            return Arrays.equals(this.A01, ((BlockstoreData) obj).A01);
        }

        public final int hashCode() {
            return Arrays.hashCode(AbstractC25228BEl.A1Y(Arrays.hashCode(this.A01)));
        }

        public BlockstoreData(byte[] bArr, String str) {
            this.A01 = bArr;
            this.A00 = str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int A04 = AbstractC58319PtB.A04(parcel);
            AbstractC128825rw.A0F(parcel, this.A01, 1, false);
            AbstractC128825rw.A0B(parcel, this.A00);
            AbstractC128825rw.A06(parcel, A04);
        }
    }

    public RetrieveBytesResponse(List list, Bundle bundle) {
        this.A01 = bundle;
        this.A02 = list;
        HashMap A1G = AbstractC166987dD.A1G();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BlockstoreData blockstoreData = (BlockstoreData) it.next();
            A1G.put(blockstoreData.A00, blockstoreData);
        }
        this.A00 = A1G;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A02(this.A01, parcel, 1);
        AbstractC128825rw.A0E(parcel, this.A02, 2, false);
        AbstractC128825rw.A06(parcel, A04);
    }
}
