package com.instagram.api.schemas;

import X.AbstractC40026HpC;
import X.C0T6;
import X.C14360o3;
import X.C206159Ax;
import X.C41089IHg;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes3.dex */
public final class IceBreakerMessage extends C0T6 implements Parcelable, IceBreakerMessageIntf {
    public static final Parcelable.Creator CREATOR = new C206159Ax(30);
    public final String A00;
    public final String A01;
    public final String A02;

    @Override // com.instagram.api.schemas.IceBreakerMessageIntf
    public final IceBreakerMessage Evc() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IceBreakerMessage) {
                IceBreakerMessage iceBreakerMessage = (IceBreakerMessage) obj;
                if (!C14360o3.A0K(this.A00, iceBreakerMessage.A00) || !C14360o3.A0K(this.A01, iceBreakerMessage.A01) || !C14360o3.A0K(this.A02, iceBreakerMessage.A02)) {
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
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A02;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    @Override // com.instagram.api.schemas.IceBreakerMessageIntf
    public final /* bridge */ /* synthetic */ C41089IHg AKO() {
        return new C41089IHg(this);
    }

    @Override // com.instagram.api.schemas.IceBreakerMessageIntf
    public final String BSz() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.IceBreakerMessageIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIceBreakerMessage", AbstractC40026HpC.A00(this));
    }

    @Override // com.instagram.api.schemas.IceBreakerMessageIntf
    public final String getActionUrl() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.IceBreakerMessageIntf
    public final String getMessage() {
        return this.A01;
    }

    public IceBreakerMessage(String str, String str2, String str3) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }
}
