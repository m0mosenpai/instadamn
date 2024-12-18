package androidx.activity.result;

import X.C14360o3;
import X.C15030pJ;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C15030pJ(0);
    public final int A00;
    public final int A01;
    public final Intent A02;
    public final IntentSender A03;

    public IntentSenderRequest(Intent intent, IntentSender intentSender, int i, int i2) {
        C14360o3.A0B(intentSender, 1);
        this.A03 = intentSender;
        this.A02 = intent;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
