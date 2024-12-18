package androidx.activity.result;

import X.C14360o3;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.ActivityResult;

/* loaded from: classes.dex */
public final class ActivityResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.00S
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            Intent intent;
            C14360o3.A0B(parcel, 0);
            int readInt = parcel.readInt();
            if (parcel.readInt() == 0) {
                intent = null;
            } else {
                intent = (Intent) Intent.CREATOR.createFromParcel(parcel);
            }
            return new ActivityResult(readInt, intent);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ActivityResult[i];
        }
    };
    public final int A00;
    public final Intent A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        Intent intent = this.A01;
        int i2 = 1;
        if (intent == null) {
            i2 = 0;
        }
        parcel.writeInt(i2);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("ActivityResult{resultCode=");
        int i = this.A00;
        if (i != -1) {
            if (i != 0) {
                str = String.valueOf(i);
            } else {
                str = "RESULT_CANCELED";
            }
        } else {
            str = "RESULT_OK";
        }
        sb.append(str);
        sb.append(", data=");
        sb.append(this.A01);
        sb.append('}');
        return sb.toString();
    }

    public ActivityResult(int i, Intent intent) {
        this.A00 = i;
        this.A01 = intent;
    }
}
