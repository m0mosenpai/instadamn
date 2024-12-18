package com.fbpay.hub.paymentmethods.api;

import X.AbstractC25235BEs;
import X.AbstractC58319PtB;
import X.AbstractC58322PtE;
import X.AbstractC63311ShH;
import X.C14360o3;
import X.C1LC;
import X.C63470SlB;
import X.EnumC46187KcP;
import X.EnumC61219RhJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: classes10.dex */
public class FbPayNewCreditCardOption implements Parcelable {
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(35);
    public final ImmutableList A00;
    public final ImmutableList A01;
    public final ImmutableList A02;
    public final String A03;
    public final String A04;

    public FbPayNewCreditCardOption(String str) {
        this.A01 = null;
        this.A03 = null;
        this.A02 = null;
        this.A00 = null;
        this.A04 = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FbPayNewCreditCardOption) {
                FbPayNewCreditCardOption fbPayNewCreditCardOption = (FbPayNewCreditCardOption) obj;
                if (!C14360o3.A0K(this.A01, fbPayNewCreditCardOption.A01) || !C14360o3.A0K(this.A03, fbPayNewCreditCardOption.A03) || !C14360o3.A0K(this.A02, fbPayNewCreditCardOption.A02) || !C14360o3.A0K(this.A00, fbPayNewCreditCardOption.A00) || !C14360o3.A0K(this.A04, fbPayNewCreditCardOption.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((AbstractC63311ShH.A02(this.A01) * 31) + AbstractC25235BEs.A06(this.A03)) * 31) + AbstractC25235BEs.A06(this.A02)) * 31) + AbstractC25235BEs.A06(this.A00)) * 31) + AbstractC25235BEs.A06(this.A04);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ImmutableList immutableList = this.A01;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            C1LC A0d = AbstractC58322PtE.A0d(parcel, immutableList);
            while (A0d.hasNext()) {
                parcel.writeParcelable((FbPayAdditionalField) A0d.next(), i);
            }
        }
        AbstractC58322PtE.A1E(parcel, this.A03, 0, 1);
        ImmutableList immutableList2 = this.A02;
        if (immutableList2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            C1LC A0d2 = AbstractC58322PtE.A0d(parcel, immutableList2);
            while (A0d2.hasNext()) {
                parcel.writeInt(((EnumC46187KcP) A0d2.next()).ordinal());
            }
        }
        ImmutableList immutableList3 = this.A00;
        if (immutableList3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            C1LC A0d3 = AbstractC58322PtE.A0d(parcel, immutableList3);
            while (A0d3.hasNext()) {
                parcel.writeInt(((EnumC61219RhJ) A0d3.next()).ordinal());
            }
        }
        AbstractC58322PtE.A1E(parcel, this.A04, 0, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FbPayNewCreditCardOption(Parcel parcel) {
        ClassLoader A0g = AbstractC58319PtB.A0g(this);
        ImmutableList immutableList = null;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            int readInt = parcel.readInt();
            FbPayAdditionalField[] fbPayAdditionalFieldArr = new FbPayAdditionalField[readInt];
            for (int i = 0; i < readInt; i++) {
                fbPayAdditionalFieldArr[i] = parcel.readParcelable(A0g);
            }
            this.A01 = ImmutableList.copyOf(fbPayAdditionalFieldArr);
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            int readInt2 = parcel.readInt();
            EnumC46187KcP[] enumC46187KcPArr = new EnumC46187KcP[readInt2];
            for (int i2 = 0; i2 < readInt2; i2++) {
                enumC46187KcPArr[i2] = EnumC46187KcP.values()[parcel.readInt()];
            }
            this.A02 = ImmutableList.copyOf(enumC46187KcPArr);
        }
        if (parcel.readInt() != 0) {
            int readInt3 = parcel.readInt();
            EnumC61219RhJ[] enumC61219RhJArr = new EnumC61219RhJ[readInt3];
            for (int i3 = 0; i3 < readInt3; i3++) {
                enumC61219RhJArr[i3] = EnumC61219RhJ.values()[parcel.readInt()];
            }
            immutableList = ImmutableList.copyOf(enumC61219RhJArr);
        }
        this.A00 = immutableList;
        this.A04 = AbstractC58322PtE.A0n(parcel);
    }
}
