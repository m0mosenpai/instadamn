package com.facebook.push.fbns.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.push.fbns.ipc.FbnsAIDLRequest;
import com.facebook.push.fbns.ipc.FbnsAIDLResult;

/* loaded from: classes.dex */
public final class FbnsAIDLRequest extends FbnsAIDLResult {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.0Wn
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, com.facebook.push.fbns.ipc.FbnsAIDLRequest, com.facebook.push.fbns.ipc.FbnsAIDLResult] */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            C14360o3.A0B(parcel, 0);
            ?? fbnsAIDLResult = new FbnsAIDLResult(parcel);
            fbnsAIDLResult.A00 = parcel.readInt();
            return fbnsAIDLResult;
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new FbnsAIDLRequest[i];
        }
    };
    public int A00;

    @Override // com.facebook.push.fbns.ipc.FbnsAIDLResult
    public final void A00(Parcel parcel, int i) {
        super.A00(parcel, i);
        parcel.writeInt(this.A00);
    }
}
