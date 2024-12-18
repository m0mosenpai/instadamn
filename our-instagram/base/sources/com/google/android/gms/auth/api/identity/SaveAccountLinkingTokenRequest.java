package com.google.android.gms.auth.api.identity;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.C63474SlF;
import X.SSI;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* loaded from: classes10.dex */
public class SaveAccountLinkingTokenRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(8);
    public final PendingIntent A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final int A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenRequest)) {
            return false;
        }
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
        List list = this.A03;
        int size = list.size();
        List list2 = saveAccountLinkingTokenRequest.A03;
        if (size != list2.size() || !list.containsAll(list2) || !SSI.A01(this.A00, saveAccountLinkingTokenRequest.A00) || !SSI.A01(this.A01, saveAccountLinkingTokenRequest.A01) || !SSI.A01(this.A02, saveAccountLinkingTokenRequest.A02) || !SSI.A01(this.A05, saveAccountLinkingTokenRequest.A05) || this.A04 != saveAccountLinkingTokenRequest.A04) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC58322PtE.A09(this.A00, this.A01, this.A02, this.A03, this.A05);
    }

    public SaveAccountLinkingTokenRequest(PendingIntent pendingIntent, String str, String str2, String str3, List list, int i) {
        this.A00 = pendingIntent;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = list;
        this.A05 = str3;
        this.A04 = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A0A(parcel, this.A00, 1, i, false);
        AbstractC128825rw.A0B(parcel, this.A01);
        AbstractC128825rw.A0C(parcel, this.A02, 3, false);
        AbstractC128825rw.A0D(parcel, this.A03, 4);
        AbstractC128825rw.A0C(parcel, this.A05, 5, false);
        AbstractC128825rw.A07(parcel, 6, this.A04);
        AbstractC128825rw.A06(parcel, A04);
    }
}
