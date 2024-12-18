package fxcache.model;

import X.AbstractC41441vt;
import X.C05F;
import X.C14360o3;
import X.C16930sl;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class FxCalAccountLinkageInfoForSwitcher implements Parcelable {
    public long A00;
    public Integer A01;
    public List A02;

    public FxCalAccountLinkageInfoForSwitcher(Integer num, List list, long j) {
        C14360o3.A0B(num, 3);
        this.A02 = list;
        this.A00 = j;
        this.A01 = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelableArray((Parcelable[]) this.A02.toArray(new FxCalAccountWithSwitcherInfo[0]), i);
        parcel.writeLong(this.A00);
        parcel.writeString(AbstractC41441vt.A01(this.A01));
    }

    public FxCalAccountLinkageInfoForSwitcher() {
        this(C05F.A00, C16930sl.A00, System.currentTimeMillis());
    }
}
