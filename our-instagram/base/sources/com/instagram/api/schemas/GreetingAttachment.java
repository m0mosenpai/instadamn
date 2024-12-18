package com.instagram.api.schemas;

import X.C0T6;
import X.C14360o3;
import X.C41858IgC;
import X.VOM;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes3.dex */
public final class GreetingAttachment extends C0T6 implements Parcelable, GreetingAttachmentIntf {
    public static final Parcelable.Creator CREATOR = new C41858IgC(1);
    public final Integer A00;
    public final Integer A01;
    public final String A02;

    @Override // com.instagram.api.schemas.GreetingAttachmentIntf
    public final GreetingAttachment Etv() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GreetingAttachment) {
                GreetingAttachment greetingAttachment = (GreetingAttachment) obj;
                if (!C14360o3.A0K(this.A00, greetingAttachment.A00) || !C14360o3.A0K(this.A02, greetingAttachment.A02) || !C14360o3.A0K(this.A01, greetingAttachment.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A00;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.A02;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.A01;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        Integer num = this.A00;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.A02);
        Integer num2 = this.A01;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    @Override // com.instagram.api.schemas.GreetingAttachmentIntf
    public final Integer BDS() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.GreetingAttachmentIntf
    public final Integer CHg() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.GreetingAttachmentIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTGreetingAttachment", VOM.A00(this));
    }

    @Override // com.instagram.api.schemas.GreetingAttachmentIntf
    public final String getUrl() {
        return this.A02;
    }

    public GreetingAttachment(Integer num, Integer num2, String str) {
        this.A00 = num;
        this.A02 = str;
        this.A01 = num2;
    }
}
