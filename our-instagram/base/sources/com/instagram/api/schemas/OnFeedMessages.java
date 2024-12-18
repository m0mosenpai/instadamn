package com.instagram.api.schemas;

import X.AbstractC40119Hqm;
import X.C0T6;
import X.C14360o3;
import X.C206159Ax;
import X.IKM;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class OnFeedMessages extends C0T6 implements OnFeedMessagesIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C206159Ax(68);
    public final GreetingAttachment A00;
    public final Boolean A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;

    @Override // com.instagram.api.schemas.OnFeedMessagesIntf
    public final OnFeedMessages ExU() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OnFeedMessages) {
                OnFeedMessages onFeedMessages = (OnFeedMessages) obj;
                if (!C14360o3.A0K(this.A02, onFeedMessages.A02) || !C14360o3.A0K(this.A03, onFeedMessages.A03) || !C14360o3.A0K(this.A04, onFeedMessages.A04) || !C14360o3.A0K(this.A05, onFeedMessages.A05) || !C14360o3.A0K(this.A06, onFeedMessages.A06) || !C14360o3.A0K(this.A07, onFeedMessages.A07) || !C14360o3.A0K(this.A08, onFeedMessages.A08) || !C14360o3.A0K(this.A00, onFeedMessages.A00) || !C14360o3.A0K(this.A01, onFeedMessages.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A02;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.A03;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A04;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A05;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A06;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A07;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List list = this.A08;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        GreetingAttachment greetingAttachment = this.A00;
        int hashCode8 = (hashCode7 + (greetingAttachment == null ? 0 : greetingAttachment.hashCode())) * 31;
        Boolean bool = this.A01;
        return hashCode8 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        Integer num = this.A02;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        List list = this.A08;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable((Parcelable) it.next(), i);
            }
        }
        parcel.writeParcelable(this.A00, i);
        Boolean bool = this.A01;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    @Override // com.instagram.api.schemas.OnFeedMessagesIntf
    public final /* bridge */ /* synthetic */ IKM AKR() {
        return new IKM(this);
    }

    @Override // com.instagram.api.schemas.OnFeedMessagesIntf
    public final Integer Ax8() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.OnFeedMessagesIntf
    public final String B9e() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.OnFeedMessagesIntf
    public final String BAJ() {
        return this.A04;
    }

    @Override // com.instagram.api.schemas.OnFeedMessagesIntf
    public final String BDG() {
        return this.A05;
    }

    @Override // com.instagram.api.schemas.OnFeedMessagesIntf
    public final String BEd() {
        return this.A06;
    }

    @Override // com.instagram.api.schemas.OnFeedMessagesIntf
    public final String BEe() {
        return this.A07;
    }

    @Override // com.instagram.api.schemas.OnFeedMessagesIntf
    public final List BEf() {
        return this.A08;
    }

    @Override // com.instagram.api.schemas.OnFeedMessagesIntf
    public final /* bridge */ /* synthetic */ GreetingAttachmentIntf BGY() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.OnFeedMessagesIntf
    public final Boolean BvT() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.OnFeedMessagesIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTOnFeedMessages", AbstractC40119Hqm.A00(this));
    }

    public OnFeedMessages(GreetingAttachment greetingAttachment, Boolean bool, Integer num, String str, String str2, String str3, String str4, String str5, List list) {
        this.A02 = num;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A07 = str5;
        this.A08 = list;
        this.A00 = greetingAttachment;
        this.A01 = bool;
    }
}
