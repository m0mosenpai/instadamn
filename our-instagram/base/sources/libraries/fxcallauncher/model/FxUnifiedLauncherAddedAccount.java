package libraries.fxcallauncher.model;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC25226BEj;
import X.AnonymousClass001;
import X.C14360o3;
import X.C55344OhA;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public final class FxUnifiedLauncherAddedAccount implements Parcelable {
    public static final Parcelable.Creator A03 = C55344OhA.A00(93);
    public String A02 = "";
    public String A01 = "";
    public String A00 = "";

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FxUnifiedLauncherAddedAccount) {
                FxUnifiedLauncherAddedAccount fxUnifiedLauncherAddedAccount = (FxUnifiedLauncherAddedAccount) obj;
                if (!C14360o3.A0K(this.A02, fxUnifiedLauncherAddedAccount.A02) || !C14360o3.A0K(this.A01, fxUnifiedLauncherAddedAccount.A01) || !C14360o3.A0K(this.A00, fxUnifiedLauncherAddedAccount.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return AnonymousClass001.A14("FxUnifiedLauncherAddedAccount(userId_DEPRECATED_DO_NOT_USE=", this.A02, ", obId=", this.A01, AbstractC111324zv.A00(52), this.A00, ')');
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
}
