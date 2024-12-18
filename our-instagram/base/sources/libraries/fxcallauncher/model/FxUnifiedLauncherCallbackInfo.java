package libraries.fxcallauncher.model;

import X.C14360o3;
import X.C16930sl;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes9.dex */
public final class FxUnifiedLauncherCallbackInfo implements Parcelable {
    public String A00;
    public String A01;
    public String A02;
    public List A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeParcelableArray((Parcelable[]) this.A03.toArray(new FxUnifiedLauncherAddedAccount[0]), i);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
    }

    public FxUnifiedLauncherCallbackInfo() {
        C16930sl c16930sl = C16930sl.A00;
        C14360o3.A0B(c16930sl, 2);
        this.A01 = "";
        this.A03 = c16930sl;
        this.A02 = "";
        this.A00 = "";
    }
}
