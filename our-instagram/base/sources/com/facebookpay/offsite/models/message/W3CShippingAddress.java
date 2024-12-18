package com.facebookpay.offsite.models.message;

import X.C14360o3;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class W3CShippingAddress {

    @SerializedName("addressLine")
    public ArrayList<String> addressLine;

    @SerializedName(ServerW3CShippingAddressConstants.CITY)
    public String city;

    @SerializedName("country")
    public String country;

    @SerializedName("dependentLocality")
    public final String dependentLocality;

    @SerializedName("organization")
    public String organization;

    @SerializedName("phone")
    public String phone;

    @SerializedName("postalCode")
    public String postalCode;

    @SerializedName("recipient")
    public String recipient;

    @SerializedName(ServerW3CShippingAddressConstants.REGION)
    public String region;

    @SerializedName("sortingCode")
    public final String sortingCode;

    public final void setPhone(String str) {
        C14360o3.A0B(str, 0);
        this.phone = str;
    }

    public /* synthetic */ W3CShippingAddress(ArrayList arrayList, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : arrayList, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) == 0 ? str9 : null);
    }

    public final ArrayList getAddressLine() {
        return this.addressLine;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getDependentLocality() {
        return this.dependentLocality;
    }

    public final String getOrganization() {
        return this.organization;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public final String getRecipient() {
        return this.recipient;
    }

    public final String getRegion() {
        return this.region;
    }

    public final String getSortingCode() {
        return this.sortingCode;
    }

    public final void setAddressLine(ArrayList arrayList) {
        this.addressLine = arrayList;
    }

    public final void setCity(String str) {
        this.city = str;
    }

    public final void setCountry(String str) {
        this.country = str;
    }

    public final void setOrganization(String str) {
        this.organization = str;
    }

    public final void setPostalCode(String str) {
        this.postalCode = str;
    }

    public final void setRecipient(String str) {
        this.recipient = str;
    }

    public final void setRegion(String str) {
        this.region = str;
    }

    public W3CShippingAddress(ArrayList arrayList, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        C14360o3.A0B(str5, 6);
        this.addressLine = arrayList;
        this.city = str;
        this.country = str2;
        this.dependentLocality = str3;
        this.organization = str4;
        this.phone = str5;
        this.postalCode = str6;
        this.recipient = str7;
        this.region = str8;
        this.sortingCode = str9;
    }

    public W3CShippingAddress() {
        this(null, null, null, null, null, "", null, null, null, null);
    }
}
