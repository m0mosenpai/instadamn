package com.instagram.opal.impl.data;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.AbstractC25227BEk;
import X.AbstractC25231BEo;
import X.AbstractC25234BEr;
import X.AbstractC81033jX;
import X.C0T6;
import X.C14360o3;
import X.C3OO;
import X.C41856IgA;
import X.C74;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.opal.impl.data.OpalAudienceSelectorRepository;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class OpalProfileData extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C41856IgA(99);
    public final int A00;
    public final C74 A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public OpalProfileData(C74 c74, String str, String str2, String str3, String str4, String str5, String str6, List list, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        AbstractC25234BEr.A0j(2, str, str2, str3, str4);
        AbstractC167007dF.A1J(str6, 8, c74);
        C14360o3.A0B(list, 12);
        this.A09 = z;
        this.A05 = str;
        this.A07 = str2;
        this.A04 = str3;
        this.A06 = str4;
        this.A03 = str5;
        this.A0C = z2;
        this.A02 = str6;
        this.A01 = c74;
        this.A0B = z3;
        this.A00 = i;
        this.A08 = list;
        this.A0A = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OpalProfileData) {
                OpalProfileData opalProfileData = (OpalProfileData) obj;
                if (this.A09 != opalProfileData.A09 || !C14360o3.A0K(this.A05, opalProfileData.A05) || !C14360o3.A0K(this.A07, opalProfileData.A07) || !C14360o3.A0K(this.A04, opalProfileData.A04) || !C14360o3.A0K(this.A06, opalProfileData.A06) || !C14360o3.A0K(this.A03, opalProfileData.A03) || this.A0C != opalProfileData.A0C || !C14360o3.A0K(this.A02, opalProfileData.A02) || this.A01 != opalProfileData.A01 || this.A0B != opalProfileData.A0B || this.A00 != opalProfileData.A00 || !C14360o3.A0K(this.A08, opalProfileData.A08) || this.A0A != opalProfileData.A0A) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeString(this.A05);
        parcel.writeString(this.A07);
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeString(this.A02);
        AbstractC166997dE.A1I(parcel, this.A01);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A00);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A08);
        while (A0u.hasNext()) {
            ((OpalAudienceSelectorRepository.OpalAudience) A0u.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A0A ? 1 : 0);
    }

    public static /* synthetic */ OpalProfileData A00(OpalProfileData opalProfileData, C74 c74, String str, String str2, String str3, String str4, String str5, List list, int i, int i2, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        List list2 = list;
        int i3 = i;
        boolean z5 = z2;
        C74 c742 = c74;
        String str6 = str5;
        boolean z6 = z;
        String str7 = str4;
        String str8 = str3;
        String str9 = str2;
        String str10 = str;
        String str11 = null;
        if ((i2 & 1) != 0) {
            z3 = opalProfileData.A09;
        } else {
            z3 = false;
        }
        if ((i2 & 2) != 0) {
            str10 = opalProfileData.A05;
        }
        if ((i2 & 4) != 0) {
            str9 = opalProfileData.A07;
        }
        if ((i2 & 8) != 0) {
            str8 = opalProfileData.A04;
        }
        if ((i2 & 16) != 0) {
            str11 = opalProfileData.A06;
        }
        if ((i2 & 32) != 0) {
            str7 = opalProfileData.A03;
        }
        if ((i2 & 64) != 0) {
            z6 = opalProfileData.A0C;
        }
        if ((i2 & 128) != 0) {
            str6 = opalProfileData.A02;
        }
        if ((i2 & 256) != 0) {
            c742 = opalProfileData.A01;
        }
        if ((i2 & 512) != 0) {
            z5 = opalProfileData.A0B;
        }
        if ((i2 & 1024) != 0) {
            i3 = opalProfileData.A00;
        }
        if ((i2 & C3OO.FLAG_MOVED) != 0) {
            list2 = opalProfileData.A08;
        }
        if ((i2 & 4096) != 0) {
            z4 = opalProfileData.A0A;
        } else {
            z4 = false;
        }
        AbstractC167027dH.A0a(1, str10, str9, str8, str11);
        AbstractC167007dF.A1I(str6, 7, c742);
        C14360o3.A0B(list2, 11);
        return new OpalProfileData(c742, str10, str9, str8, str11, str7, str6, list2, i3, z3, z6, z5, z4);
    }

    public final ImageUrl A01() {
        boolean z = this.A0C;
        String str = null;
        String str2 = this.A03;
        if (z) {
            if (str2 != null) {
                return AbstractC81033jX.A00(AbstractC25227BEk.A0B(str2), -1, -1);
            }
        } else {
            if (str2 != null) {
                return AbstractC81033jX.A01(new File(str2));
            }
            str = this.A06;
        }
        return AbstractC25225BEi.A0t(str);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A0A, AbstractC166997dE.A0J(this.A08, (AbstractC167007dF.A0D(this.A0B, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0K(this.A02, AbstractC167007dF.A0D(this.A0C, (AbstractC166997dE.A0K(this.A06, AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A07, AbstractC166997dE.A0K(this.A05, AbstractC25225BEi.A08(this.A09))))) + AbstractC167017dG.A0O(this.A03)) * 31)))) + this.A00) * 31));
    }
}
