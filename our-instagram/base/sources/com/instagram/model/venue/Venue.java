package com.instagram.model.venue;

import X.AbstractC111324zv;
import X.AbstractC12990ll;
import X.AbstractC25651Mw;
import X.AbstractC50102Ry;
import X.C05F;
import X.C69668Vt9;
import X.C70709WfY;
import X.C9Ay;
import X.EnumC77213d7;
import X.InterfaceC38391qT;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: classes2.dex */
public class Venue implements InterfaceC38391qT, Parcelable {
    public static final Parcelable.Creator CREATOR = new C9Ay(44);
    public LocationDictIntf A00 = new LocationDict(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Venue venue = (Venue) obj;
            if (!AbstractC50102Ry.A00(this.A00.getName(), venue.A00.getName()) || !AbstractC50102Ry.A00(this.A00.getAddress(), venue.A00.getAddress()) || !AbstractC50102Ry.A00(A00(), venue.A00()) || !AbstractC50102Ry.A00(A01(), venue.A01()) || CcN() != venue.CcN()) {
                return false;
            }
        }
        return true;
    }

    public final Double A00() {
        if (this.A00.BM8() != null) {
            return Double.valueOf(this.A00.BM8().doubleValue());
        }
        return null;
    }

    public final Double A01() {
        if (this.A00.BO9() != null) {
            return Double.valueOf(this.A00.BO9().doubleValue());
        }
        return null;
    }

    public final String A03() {
        String externalSource = this.A00.getExternalSource();
        LocationDictIntf locationDictIntf = this.A00;
        if (externalSource != null) {
            return locationDictIntf.getExternalSource();
        }
        return locationDictIntf.B3b();
    }

    public final String A04() {
        if (this.A00.B41() != null) {
            return this.A00.B41().toString();
        }
        return null;
    }

    public final String A05() {
        if (this.A00.BdZ() != null) {
            return this.A00.BdZ().toString();
        }
        return "";
    }

    public final void A06(String str) {
        Long valueOf;
        C69668Vt9 AKn = this.A00.AKn();
        if (TextUtils.isEmpty(str)) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(Long.parseLong(str));
        }
        AKn.A03 = valueOf;
        this.A00 = AKn.A00();
    }

    @Override // X.InterfaceC38391qT
    public final EnumC77213d7 BqJ() {
        if (this.A00.BCz() != null && this.A00.BCz().booleanValue()) {
            return EnumC77213d7.A04;
        }
        return EnumC77213d7.A03;
    }

    @Override // X.InterfaceC38391qT
    public final Collection BqL() {
        return new ArrayList();
    }

    @Override // X.InterfaceC38391qT
    public final Integer BqO() {
        return C05F.A0C;
    }

    @Override // X.InterfaceC38391qT
    public final boolean CcN() {
        if (this.A00.BCz() != null && this.A00.BCz().booleanValue()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC38391qT
    public final void Ed3(EnumC77213d7 enumC77213d7) {
        C69668Vt9 AKn = this.A00.AKn();
        boolean z = false;
        if (enumC77213d7 == EnumC77213d7.A04) {
            z = true;
        }
        AKn.A00 = Boolean.valueOf(z);
        this.A00 = AKn.A00();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00.getName(), this.A00.getAddress(), A00(), A01(), Boolean.valueOf(CcN())});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
    }

    public final String A02() {
        if (AbstractC111324zv.A00(923).equals(A03()) && this.A00.B41() != null) {
            return this.A00.B41().toString();
        }
        String B8K = this.A00.B8K();
        LocationDictIntf locationDictIntf = this.A00;
        if (B8K != null) {
            return locationDictIntf.B8K();
        }
        if (locationDictIntf.B3a() != null) {
            return this.A00.B3a();
        }
        return "";
    }

    @Override // X.InterfaceC38391qT
    public final void AEH(AbstractC12990ll abstractC12990ll) {
        AbstractC25651Mw.A00(abstractC12990ll).E4s(new C70709WfY(this));
    }

    @Override // X.InterfaceC38391qT
    public final String BqK() {
        return A05();
    }
}
