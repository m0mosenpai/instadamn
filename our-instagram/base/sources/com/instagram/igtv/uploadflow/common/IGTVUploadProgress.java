package com.instagram.igtv.uploadflow.common;

import X.AbstractC166997dE;
import X.AbstractC50523MSb;
import X.C14360o3;
import X.C54645OBw;
import X.C55343Oh9;
import X.EnumC53259Ngx;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class IGTVUploadProgress implements Parcelable {
    public static final C55343Oh9 CREATOR = C55343Oh9.A00(5);
    public EnumC53259Ngx A00;
    public final C54645OBw A01;

    /* JADX WARN: Multi-variable type inference failed */
    public IGTVUploadProgress() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC166997dE.A1I(parcel, this.A00);
        C54645OBw c54645OBw = this.A01;
        parcel.writeInt(c54645OBw.A02 ? 1 : 0);
        parcel.writeInt(c54645OBw.A01 ? 1 : 0);
        parcel.writeInt(c54645OBw.A00 ? 1 : 0);
        parcel.writeInt(c54645OBw.A03 ? 1 : 0);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.OBw, java.lang.Object] */
    public IGTVUploadProgress(Parcel parcel) {
        String readString = parcel.readString();
        EnumC53259Ngx valueOf = EnumC53259Ngx.valueOf(readString == null ? "START" : readString);
        ?? obj = new Object();
        obj.A02 = false;
        obj.A01 = false;
        obj.A00 = false;
        obj.A03 = false;
        C14360o3.A0B(valueOf, 1);
        this.A00 = valueOf;
        this.A01 = obj;
        obj.A02 = AbstractC50523MSb.A1Y(parcel);
        obj.A01 = AbstractC50523MSb.A1Y(parcel);
        obj.A00 = AbstractC50523MSb.A1Y(parcel);
        obj.A03 = AbstractC50523MSb.A1Y(parcel);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.OBw, java.lang.Object] */
    public /* synthetic */ IGTVUploadProgress(EnumC53259Ngx enumC53259Ngx, C54645OBw c54645OBw, DefaultConstructorMarker defaultConstructorMarker, int i) {
        EnumC53259Ngx enumC53259Ngx2 = EnumC53259Ngx.A0A;
        ?? obj = new Object();
        obj.A02 = false;
        obj.A01 = false;
        obj.A00 = false;
        obj.A03 = false;
        C14360o3.A0B(enumC53259Ngx2, 1);
        this.A00 = enumC53259Ngx2;
        this.A01 = obj;
    }
}
