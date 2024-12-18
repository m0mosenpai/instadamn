package com.instagram.direct.smartsuggestion.model;

import X.C05F;
import X.C0T6;
import X.C14360o3;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* loaded from: classes2.dex */
public final class SmartSuggestionCTA extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C206139Av(88);
    public Integer A00;
    public String A01;

    public SmartSuggestionCTA() {
        Integer num = C05F.A00;
        C14360o3.A0B(num, 1);
        this.A00 = num;
        this.A01 = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SmartSuggestionCTA) {
                SmartSuggestionCTA smartSuggestionCTA = (SmartSuggestionCTA) obj;
                if (this.A00 != smartSuggestionCTA.A00 || !C14360o3.A0K(this.A01, smartSuggestionCTA.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        C14360o3.A0B(parcel, 0);
        switch (this.A00.intValue()) {
            case 1:
                str = "SEND";
                break;
            case 2:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        parcel.writeString(str);
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        String str;
        int hashCode;
        int intValue = this.A00.intValue();
        switch (intValue) {
            case 1:
                str = "SEND";
                break;
            case 2:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        int hashCode2 = (str.hashCode() + intValue) * 31;
        String str2 = this.A01;
        if (str2 == null) {
            hashCode = 0;
        } else {
            hashCode = str2.hashCode();
        }
        return hashCode2 + hashCode;
    }
}
