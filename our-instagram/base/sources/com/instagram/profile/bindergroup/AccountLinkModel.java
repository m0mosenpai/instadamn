package com.instagram.profile.bindergroup;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25226BEj;
import X.AbstractC25227BEk;
import X.AbstractC25236BEt;
import X.AnonymousClass001;
import X.C14360o3;
import X.C37324GcR;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.R;

/* loaded from: classes6.dex */
public abstract class AccountLinkModel implements Parcelable {
    public final int A00;

    /* loaded from: classes6.dex */
    public final class AddExternalLinkData extends AccountLinkModel {
        public static final Parcelable.Creator CREATOR = new C37324GcR(7);
        public final String A00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddExternalLinkData(String str) {
            super(R.drawable.instagram_add_pano_outline_24);
            C14360o3.A0B(str, 1);
            this.A00 = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || ((obj instanceof AddExternalLinkData) && C14360o3.A0K(this.A00, ((AddExternalLinkData) obj).A00));
        }

        public final int hashCode() {
            return this.A00.hashCode();
        }

        public final String toString() {
            return AnonymousClass001.A0S("AddExternalLinkData(title=", this.A00, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C14360o3.A0B(parcel, 0);
            parcel.writeString(this.A00);
        }
    }

    /* loaded from: classes6.dex */
    public final class AddExternalLinkDataEnhanced extends AccountLinkModel {
        public static final Parcelable.Creator CREATOR = new C37324GcR(8);
        public final String A00;
        public final boolean A01;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddExternalLinkDataEnhanced(String str, boolean z) {
            super(R.drawable.instagram_add_pano_outline_24);
            C14360o3.A0B(str, 1);
            this.A00 = str;
            this.A01 = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof AddExternalLinkDataEnhanced) {
                    AddExternalLinkDataEnhanced addExternalLinkDataEnhanced = (AddExternalLinkDataEnhanced) obj;
                    if (!C14360o3.A0K(this.A00, addExternalLinkDataEnhanced.A00) || this.A01 != addExternalLinkDataEnhanced.A01) {
                    }
                }
                return false;
            }
            return true;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C14360o3.A0B(parcel, 0);
            parcel.writeString(this.A00);
            parcel.writeInt(this.A01 ? 1 : 0);
        }

        public final int hashCode() {
            return AbstractC166987dD.A0K(this.A01, AbstractC166987dD.A0J(this.A00));
        }
    }

    /* loaded from: classes6.dex */
    public final class AddExternalLinkDataV2 extends AccountLinkModel {
        public static final Parcelable.Creator CREATOR = new C37324GcR(9);
        public final String A00;
        public final boolean A01;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddExternalLinkDataV2(String str, boolean z) {
            super(R.drawable.instagram_add_pano_outline_24);
            C14360o3.A0B(str, 1);
            this.A00 = str;
            this.A01 = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof AddExternalLinkDataV2) {
                    AddExternalLinkDataV2 addExternalLinkDataV2 = (AddExternalLinkDataV2) obj;
                    if (!C14360o3.A0K(this.A00, addExternalLinkDataV2.A00) || this.A01 != addExternalLinkDataV2.A01) {
                    }
                }
                return false;
            }
            return true;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C14360o3.A0B(parcel, 0);
            parcel.writeString(this.A00);
            parcel.writeInt(this.A01 ? 1 : 0);
        }

        public final int hashCode() {
            return AbstractC166987dD.A0K(this.A01, AbstractC166987dD.A0J(this.A00));
        }
    }

    /* loaded from: classes6.dex */
    public final class AddFacebookLinkData extends AccountLinkModel {
        public static final Parcelable.Creator CREATOR = new C37324GcR(10);
        public final String A00;
        public final boolean A01;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddFacebookLinkData(String str, boolean z) {
            super(R.drawable.instagram_facebook_circle_pano_outline_24);
            C14360o3.A0B(str, 1);
            this.A00 = str;
            this.A01 = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof AddFacebookLinkData) {
                    AddFacebookLinkData addFacebookLinkData = (AddFacebookLinkData) obj;
                    if (!C14360o3.A0K(this.A00, addFacebookLinkData.A00) || this.A01 != addFacebookLinkData.A01) {
                    }
                }
                return false;
            }
            return true;
        }

        public final String toString() {
            return AnonymousClass001.A0m("AddFacebookLinkData(title=", this.A00, AbstractC111324zv.A00(563), ')', this.A01);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C14360o3.A0B(parcel, 0);
            parcel.writeString(this.A00);
            parcel.writeInt(this.A01 ? 1 : 0);
        }

        public final int hashCode() {
            return AbstractC166987dD.A0K(this.A01, AbstractC166987dD.A0J(this.A00));
        }
    }

    /* loaded from: classes6.dex */
    public final class AddFacebookPageLinkData extends AccountLinkModel {
        public static final Parcelable.Creator CREATOR = new C37324GcR(11);
        public final String A00;
        public final boolean A01;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddFacebookPageLinkData(String str, boolean z) {
            super(R.drawable.instagram_facebook_circle_pano_outline_24);
            C14360o3.A0B(str, 1);
            this.A00 = str;
            this.A01 = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof AddFacebookPageLinkData) {
                    AddFacebookPageLinkData addFacebookPageLinkData = (AddFacebookPageLinkData) obj;
                    if (!C14360o3.A0K(this.A00, addFacebookPageLinkData.A00) || this.A01 != addFacebookPageLinkData.A01) {
                    }
                }
                return false;
            }
            return true;
        }

        public final String toString() {
            return AnonymousClass001.A0m("AddFacebookPageLinkData(title=", this.A00, AbstractC111324zv.A00(563), ')', this.A01);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C14360o3.A0B(parcel, 0);
            parcel.writeString(this.A00);
            parcel.writeInt(this.A01 ? 1 : 0);
        }

        public final int hashCode() {
            return AbstractC166987dD.A0K(this.A01, AbstractC166987dD.A0J(this.A00));
        }
    }

    /* loaded from: classes6.dex */
    public final class BottomMessageData extends AccountLinkModel {
        public static final Parcelable.Creator CREATOR = new C37324GcR(12);
        public final CharSequence A00;
        public final String A01;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof BottomMessageData) {
                    BottomMessageData bottomMessageData = (BottomMessageData) obj;
                    if (!C14360o3.A0K(this.A00, bottomMessageData.A00) || !C14360o3.A0K(this.A01, bottomMessageData.A01)) {
                    }
                }
                return false;
            }
            return true;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C14360o3.A0B(parcel, 0);
            TextUtils.writeToParcel(this.A00, parcel, i);
            parcel.writeString(this.A01);
        }

        public final int hashCode() {
            return AbstractC25226BEj.A03(this.A01, AbstractC166987dD.A0G(this.A00));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BottomMessageData(String str, CharSequence charSequence) {
            super(R.drawable.instagram_link_pano_outline_24);
            AbstractC167017dG.A1P(charSequence, str);
            this.A00 = charSequence;
            this.A01 = str;
        }

        public final String toString() {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("BottomMessageData(text=");
            A1C.append((Object) this.A00);
            A1C.append(", title=");
            return AbstractC25236BEt.A0Y(this.A01, A1C);
        }
    }

    /* loaded from: classes6.dex */
    public final class ExternalLinkData extends AccountLinkModel {
        public static final Parcelable.Creator CREATOR = new C37324GcR(13);
        public final String A00;
        public final String A01;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ExternalLinkData) {
                    ExternalLinkData externalLinkData = (ExternalLinkData) obj;
                    if (!C14360o3.A0K(this.A00, externalLinkData.A00) || !C14360o3.A0K(this.A01, externalLinkData.A01)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final String toString() {
            return AnonymousClass001.A0v("ExternalLinkData(title=", this.A00, AbstractC111324zv.A00(579), this.A01, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C14360o3.A0B(parcel, 0);
            parcel.writeString(this.A00);
            parcel.writeString(this.A01);
        }

        public final int hashCode() {
            return AbstractC25226BEj.A03(this.A01, AbstractC166987dD.A0J(this.A00));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExternalLinkData(String str, String str2) {
            super(R.drawable.instagram_link_pano_outline_24);
            AbstractC167017dG.A1P(str, str2);
            this.A00 = str;
            this.A01 = str2;
        }
    }

    /* loaded from: classes6.dex */
    public final class ExternalLinkDataEnhanced extends AccountLinkModel {
        public static final Parcelable.Creator CREATOR = new C37324GcR(14);
        public final String A00;
        public final String A01;
        public final String A02;
        public final String A03;
        public final String A04;
        public final boolean A05;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ExternalLinkDataEnhanced) {
                    ExternalLinkDataEnhanced externalLinkDataEnhanced = (ExternalLinkDataEnhanced) obj;
                    if (!C14360o3.A0K(this.A04, externalLinkDataEnhanced.A04) || !C14360o3.A0K(this.A03, externalLinkDataEnhanced.A03) || !C14360o3.A0K(this.A01, externalLinkDataEnhanced.A01) || !C14360o3.A0K(this.A02, externalLinkDataEnhanced.A02) || !C14360o3.A0K(this.A00, externalLinkDataEnhanced.A00) || this.A05 != externalLinkDataEnhanced.A05) {
                    }
                }
                return false;
            }
            return true;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C14360o3.A0B(parcel, 0);
            parcel.writeString(this.A04);
            parcel.writeString(this.A03);
            parcel.writeString(this.A01);
            parcel.writeString(this.A02);
            parcel.writeString(this.A00);
            parcel.writeInt(this.A05 ? 1 : 0);
        }

        public final int hashCode() {
            return AbstractC166987dD.A0K(this.A05, (((AbstractC166997dE.A0K(this.A01, AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0J(this.A04))) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC25227BEk.A07(this.A00)) * 31);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExternalLinkDataEnhanced(String str, String str2, String str3, String str4, String str5, boolean z) {
            super(R.drawable.instagram_link_pano_outline_24);
            AbstractC167027dH.A13(str, str2, str3);
            this.A04 = str;
            this.A03 = str2;
            this.A01 = str3;
            this.A02 = str4;
            this.A00 = str5;
            this.A05 = z;
        }
    }

    /* loaded from: classes6.dex */
    public final class ExternalLinkDataV2 extends AccountLinkModel {
        public static final Parcelable.Creator CREATOR = new C37324GcR(15);
        public final String A00;
        public final String A01;
        public final String A02;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ExternalLinkDataV2) {
                    ExternalLinkDataV2 externalLinkDataV2 = (ExternalLinkDataV2) obj;
                    if (!C14360o3.A0K(this.A02, externalLinkDataV2.A02) || !C14360o3.A0K(this.A01, externalLinkDataV2.A01) || !C14360o3.A0K(this.A00, externalLinkDataV2.A00)) {
                    }
                }
                return false;
            }
            return true;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C14360o3.A0B(parcel, 0);
            parcel.writeString(this.A02);
            parcel.writeString(this.A01);
            parcel.writeString(this.A00);
        }

        public final int hashCode() {
            return AbstractC25226BEj.A03(this.A00, AbstractC166997dE.A0K(this.A01, AbstractC166987dD.A0J(this.A02)));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExternalLinkDataV2(String str, String str2, String str3) {
            super(R.drawable.instagram_link_pano_outline_24);
            AbstractC167027dH.A13(str, str2, str3);
            this.A02 = str;
            this.A01 = str2;
            this.A00 = str3;
        }
    }

    /* loaded from: classes6.dex */
    public final class FacebookLinkData extends AccountLinkModel {
        public static final Parcelable.Creator CREATOR = new C37324GcR(16);
        public final String A00;
        public final String A01;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FacebookLinkData(String str, String str2) {
            super(R.drawable.instagram_facebook_circle_pano_outline_24);
            C14360o3.A0B(str, 1);
            this.A01 = str;
            this.A00 = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof FacebookLinkData) {
                    FacebookLinkData facebookLinkData = (FacebookLinkData) obj;
                    if (!C14360o3.A0K(this.A01, facebookLinkData.A01) || !C14360o3.A0K(this.A00, facebookLinkData.A00)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final String toString() {
            return AnonymousClass001.A0v("FacebookLinkData(title=", this.A01, ", subTitle=", this.A00, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C14360o3.A0B(parcel, 0);
            parcel.writeString(this.A01);
            parcel.writeString(this.A00);
        }

        public final int hashCode() {
            return AbstractC166987dD.A0J(this.A01) + AbstractC167017dG.A0O(this.A00);
        }
    }

    /* loaded from: classes6.dex */
    public final class FacebookLinkDataV2 extends AccountLinkModel {
        public static final Parcelable.Creator CREATOR = new C37324GcR(17);
        public final String A00;
        public final String A01;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FacebookLinkDataV2(String str, String str2) {
            super(R.drawable.instagram_facebook_circle_pano_outline_24);
            C14360o3.A0B(str, 1);
            this.A01 = str;
            this.A00 = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof FacebookLinkDataV2) {
                    FacebookLinkDataV2 facebookLinkDataV2 = (FacebookLinkDataV2) obj;
                    if (!C14360o3.A0K(this.A01, facebookLinkDataV2.A01) || !C14360o3.A0K(this.A00, facebookLinkDataV2.A00)) {
                    }
                }
                return false;
            }
            return true;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C14360o3.A0B(parcel, 0);
            parcel.writeString(this.A01);
            parcel.writeString(this.A00);
        }

        public final int hashCode() {
            return AbstractC166987dD.A0J(this.A01) + AbstractC167017dG.A0O(this.A00);
        }
    }

    /* loaded from: classes6.dex */
    public final class FacebookPageLinkData extends AccountLinkModel {
        public static final Parcelable.Creator CREATOR = new C37324GcR(18);
        public final String A00;
        public final String A01;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FacebookPageLinkData(String str, String str2) {
            super(R.drawable.instagram_facebook_circle_pano_outline_24);
            C14360o3.A0B(str, 1);
            this.A01 = str;
            this.A00 = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof FacebookPageLinkData) {
                    FacebookPageLinkData facebookPageLinkData = (FacebookPageLinkData) obj;
                    if (!C14360o3.A0K(this.A01, facebookPageLinkData.A01) || !C14360o3.A0K(this.A00, facebookPageLinkData.A00)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final String toString() {
            return AnonymousClass001.A0v("FacebookPageLinkData(title=", this.A01, ", subTitle=", this.A00, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C14360o3.A0B(parcel, 0);
            parcel.writeString(this.A01);
            parcel.writeString(this.A00);
        }

        public final int hashCode() {
            return AbstractC166987dD.A0J(this.A01) + AbstractC167017dG.A0O(this.A00);
        }
    }

    public final boolean A00() {
        if (this instanceof AddFacebookPageLinkData) {
            return ((AddFacebookPageLinkData) this).A01;
        }
        if (this instanceof AddFacebookLinkData) {
            return ((AddFacebookLinkData) this).A01;
        }
        if (this instanceof AddExternalLinkDataV2) {
            return ((AddExternalLinkDataV2) this).A01;
        }
        if (this instanceof AddExternalLinkDataEnhanced) {
            return ((AddExternalLinkDataEnhanced) this).A01;
        }
        return false;
    }

    public AccountLinkModel(int i) {
        this.A00 = i;
    }
}
