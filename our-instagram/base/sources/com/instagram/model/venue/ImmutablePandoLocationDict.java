package com.instagram.model.venue;

import X.AbstractC136426Fv;
import X.AbstractC65738TtD;
import X.C14360o3;
import X.C17T;
import X.C39305HXw;
import X.C69668Vt9;
import android.os.Parcel;
import com.facebook.pando.TreeParcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes11.dex */
public final class ImmutablePandoLocationDict extends C17T implements LocationDictIntf {
    public static final AbstractC136426Fv CREATOR = new C39305HXw(79);

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        TreeParcelable.A01(parcel, this);
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final /* synthetic */ C69668Vt9 AKn() {
        return new C69668Vt9(this);
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final Long BdZ() {
        return A0L(3579);
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(AbstractC65738TtD.A00(this), this);
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final Integer AsZ() {
        return getOptionalIntValueByHashCode(1369680106);
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final Integer B23() {
        return getOptionalIntValueByHashCode(1725551537);
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final Integer B2h() {
        return getOptionalIntValueByHashCode(-907032317);
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final String B3a() {
        return A0j(-1153075697);
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final String B3b() {
        return A0i(1241239627);
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final String B40() {
        return A0j(-1376148536);
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final Long B41() {
        return A0L(384633781);
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final String B8K() {
        return A0j(302331970);
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final Boolean BCz() {
        return getOptionalBooleanValueByHashCode(-971305057);
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final Float BM8() {
        return A0K(106911);
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final Float BO9() {
        return A0K(107301);
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final Integer BU7() {
        return getOptionalIntValueByHashCode(1008566606);
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final Integer Bzj() {
        return getOptionalIntValueByHashCode(-1573145462);
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final Integer C8R() {
        return getOptionalIntValueByHashCode(-1650699556);
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final String C8j() {
        return A0i(-2076227591);
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final Boolean CTA() {
        return getOptionalBooleanValueByHashCode(669651456);
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final LocationDict F6g() {
        String A0i = A0i(-1147692044);
        String A0i2 = A0i(50511102);
        String A0i3 = A0i(3053931);
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(1369680106);
        Integer optionalIntValueByHashCode2 = getOptionalIntValueByHashCode(1725551537);
        Integer optionalIntValueByHashCode3 = getOptionalIntValueByHashCode(-907032317);
        String A0j = A0j(-1153075697);
        String A0i4 = A0i(1241239627);
        String A0i5 = A0i(575682319);
        String A0j2 = A0j(-1376148536);
        Long A0L = A0L(384633781);
        String A0j3 = A0j(302331970);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-971305057);
        Boolean optionalBooleanValueByHashCode2 = getOptionalBooleanValueByHashCode(669651456);
        Float A0K = A0K(106911);
        Float A0K2 = A0K(107301);
        Integer optionalIntValueByHashCode4 = getOptionalIntValueByHashCode(1008566606);
        String A0i6 = A0i(3373707);
        return new LocationDict(optionalBooleanValueByHashCode, optionalBooleanValueByHashCode2, A0K, A0K2, optionalIntValueByHashCode, optionalIntValueByHashCode2, optionalIntValueByHashCode3, optionalIntValueByHashCode4, getOptionalIntValueByHashCode(-1573145462), getOptionalIntValueByHashCode(-1650699556), A0L, A0L(3579), A0i, A0i2, A0i3, A0j, A0i4, A0i5, A0j2, A0j3, A0i6, A0i(1782139044), A0i(1565793390), A0i(-2076227591));
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final String getAddress() {
        return A0i(-1147692044);
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final String getCategory() {
        return A0i(50511102);
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final String getCity() {
        return A0i(3053931);
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final String getExternalSource() {
        return A0i(575682319);
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final String getName() {
        return A0W();
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final String getProfilePicUrl() {
        return A0i(1782139044);
    }

    @Override // com.instagram.model.venue.LocationDictIntf
    public final String getShortName() {
        return A0i(1565793390);
    }
}
