package com.instagram.direct.model.mentions;

import X.AbstractC27438C9g;
import X.C14360o3;
import X.C16930sl;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes8.dex */
public final class SendMentionData$MentionData extends AbstractC27438C9g implements Parcelable {
    public static final LNL CREATOR = LNL.A00(25);
    public List A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof SendMentionData$MentionData) && C14360o3.A0K(this.A00, ((SendMentionData$MentionData) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeTypedList(this.A00);
    }

    public SendMentionData$MentionData() {
        C16930sl c16930sl = C16930sl.A00;
        C14360o3.A0B(c16930sl, 1);
        this.A00 = c16930sl;
    }
}
