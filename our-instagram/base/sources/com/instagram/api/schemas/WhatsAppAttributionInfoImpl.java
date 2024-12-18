package com.instagram.api.schemas;

import X.AbstractC40454Hwj;
import X.C0T6;
import X.C14360o3;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes3.dex */
public final class WhatsAppAttributionInfoImpl extends C0T6 implements Parcelable, WhatsAppAttributionInfo {
    public static final Parcelable.Creator CREATOR = new C206139Av(38);
    public final String A00;
    public final String A01;

    @Override // com.instagram.api.schemas.WhatsAppAttributionInfo
    public final WhatsAppAttributionInfoImpl F3v() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WhatsAppAttributionInfoImpl) {
                WhatsAppAttributionInfoImpl whatsAppAttributionInfoImpl = (WhatsAppAttributionInfoImpl) obj;
                if (!C14360o3.A0K(this.A00, whatsAppAttributionInfoImpl.A00) || !C14360o3.A0K(this.A01, whatsAppAttributionInfoImpl.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A00;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A01;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    @Override // com.instagram.api.schemas.WhatsAppAttributionInfo
    public final String AYb() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.WhatsAppAttributionInfo
    public final String AZS() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.WhatsAppAttributionInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTCTTMessagingWhatsAppAttributionLinkInfo", AbstractC40454Hwj.A00(this));
    }

    public WhatsAppAttributionInfoImpl(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
