package com.instagram.api.schemas;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25229BEm;
import X.AbstractC25233BEq;
import X.AbstractC37304Gc5;
import X.C0T6;
import X.C14360o3;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class AudienceValidationResponse extends C0T6 implements Parcelable, AudienceValidationResponseIntf {
    public static final Parcelable.Creator CREATOR = new C63469Sl9(58);
    public final AudienceValidationResponseStatus A00;
    public final BoostedComponentMessageType A01;
    public final String A02;
    public final String A03;
    public final List A04;
    public final List A05;

    public AudienceValidationResponse(AudienceValidationResponseStatus audienceValidationResponseStatus, BoostedComponentMessageType boostedComponentMessageType, String str, String str2, List list, List list2) {
        AbstractC25233BEq.A0x(2, str, boostedComponentMessageType, audienceValidationResponseStatus);
        this.A04 = list;
        this.A02 = str;
        this.A05 = list2;
        this.A01 = boostedComponentMessageType;
        this.A00 = audienceValidationResponseStatus;
        this.A03 = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AudienceValidationResponse) {
                AudienceValidationResponse audienceValidationResponse = (AudienceValidationResponse) obj;
                if (!C14360o3.A0K(this.A04, audienceValidationResponse.A04) || !C14360o3.A0K(this.A02, audienceValidationResponse.A02) || !C14360o3.A0K(this.A05, audienceValidationResponse.A05) || this.A01 != audienceValidationResponse.A01 || this.A00 != audienceValidationResponse.A00 || !C14360o3.A0K(this.A03, audienceValidationResponse.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        List list = this.A04;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator A0l = AbstractC37304Gc5.A0l(parcel, list);
            while (A0l.hasNext()) {
                AbstractC25229BEm.A15(parcel, A0l, i);
            }
        }
        parcel.writeString(this.A02);
        List list2 = this.A05;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator A0l2 = AbstractC37304Gc5.A0l(parcel, list2);
            while (A0l2.hasNext()) {
                AbstractC25229BEm.A15(parcel, A0l2, i);
            }
        }
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A03);
    }

    public final int hashCode() {
        int i = 0;
        int A0J = AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0J(this.A01, (AbstractC166997dE.A0K(this.A02, AbstractC167017dG.A0M(this.A04) * 31) + AbstractC167017dG.A0M(this.A05)) * 31));
        String str = this.A03;
        if (str != null) {
            i = str.hashCode();
        }
        return A0J + i;
    }
}
