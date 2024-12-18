package com.instagram.creator.agent.suggestedreplies.constants;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.EnumC46279KeB;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public final class SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = LNM.A00(84);
    public final EnumC46279KeB A00;
    public final String A01;
    public final String A02;
    public final String A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext) {
                SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext suggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext = (SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext) obj;
                if (!C14360o3.A0K(this.A03, suggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext.A03) || !C14360o3.A0K(this.A02, suggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext.A02) || !C14360o3.A0K(this.A01, suggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext.A01) || this.A00 != suggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        EnumC46279KeB enumC46279KeB = this.A00;
        if (enumC46279KeB == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            AbstractC166997dE.A1I(parcel, enumC46279KeB);
        }
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0O(this.A03) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext(EnumC46279KeB enumC46279KeB, String str, String str2, String str3) {
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A00 = enumC46279KeB;
    }
}
