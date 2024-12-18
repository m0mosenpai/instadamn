package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC128825rw;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC58319PtB;
import X.AbstractC58321PtD;
import X.C63474SlF;
import X.RjQ;
import X.RjV;
import X.RjX;
import X.SSI;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes10.dex */
public class AuthenticatorSelectionCriteria extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63474SlF.A01(97);
    public final Attachment A00;
    public final Boolean A01;
    public final ResidentKeyRequirement A02;
    public final UserVerificationRequirement A03;

    public final ResidentKeyRequirement A00() {
        ResidentKeyRequirement residentKeyRequirement = this.A02;
        if (residentKeyRequirement == null) {
            Boolean bool = this.A01;
            if (bool == null || !bool.booleanValue()) {
                return null;
            }
            return ResidentKeyRequirement.RESIDENT_KEY_REQUIRED;
        }
        return residentKeyRequirement;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorSelectionCriteria)) {
            return false;
        }
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) obj;
        if (!SSI.A01(this.A00, authenticatorSelectionCriteria.A00) || !SSI.A01(this.A01, authenticatorSelectionCriteria.A01) || !SSI.A01(this.A03, authenticatorSelectionCriteria.A03)) {
            return false;
        }
        return SSI.A00(A00(), authenticatorSelectionCriteria.A00());
    }

    public final int hashCode() {
        return AbstractC58321PtD.A0C(this.A00, this.A01, this.A03, A00());
    }

    public final String toString() {
        ResidentKeyRequirement residentKeyRequirement = this.A02;
        UserVerificationRequirement userVerificationRequirement = this.A03;
        String valueOf = String.valueOf(this.A00);
        String valueOf2 = String.valueOf(userVerificationRequirement);
        String valueOf3 = String.valueOf(residentKeyRequirement);
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AuthenticatorSelectionCriteria{\n attachment=");
        A1C.append(valueOf);
        A1C.append(", \n requireResidentKey=");
        A1C.append(this.A01);
        A1C.append(", \n requireUserVerification=");
        A1C.append(valueOf2);
        A1C.append(", \n residentKeyRequirement=");
        A1C.append(valueOf3);
        return AbstractC166997dE.A0x("\n }", A1C);
    }

    public AuthenticatorSelectionCriteria(Boolean bool, String str, String str2, String str3) {
        Attachment A00;
        UserVerificationRequirement A002;
        if (str == null) {
            A00 = null;
        } else {
            try {
                A00 = Attachment.A00(str);
            } catch (RjQ | RjV | RjX e) {
                throw new IllegalArgumentException(e);
            }
        }
        this.A00 = A00;
        this.A01 = bool;
        if (str2 == null) {
            A002 = null;
        } else {
            A002 = UserVerificationRequirement.A00(str2);
        }
        this.A03 = A002;
        this.A02 = str3 != null ? ResidentKeyRequirement.A00(str3) : null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String obj;
        String obj2;
        String obj3;
        int A04 = AbstractC58319PtB.A04(parcel);
        Attachment attachment = this.A00;
        if (attachment == null) {
            obj = null;
        } else {
            obj = attachment.toString();
        }
        AbstractC128825rw.A0B(parcel, obj);
        Boolean bool = this.A01;
        if (bool != null) {
            parcel.writeInt(262147);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        UserVerificationRequirement userVerificationRequirement = this.A03;
        if (userVerificationRequirement == null) {
            obj2 = null;
        } else {
            obj2 = userVerificationRequirement.toString();
        }
        AbstractC128825rw.A0C(parcel, obj2, 4, false);
        ResidentKeyRequirement A00 = A00();
        if (A00 == null) {
            obj3 = null;
        } else {
            obj3 = A00.toString();
        }
        AbstractC128825rw.A0C(parcel, obj3, 5, false);
        AbstractC128825rw.A06(parcel, A04);
    }
}
