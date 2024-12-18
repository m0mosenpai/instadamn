package com.instagram.feed.media;

import X.C0T6;
import X.C14360o3;
import X.C206139Av;
import X.I02;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CameraTool;

/* loaded from: classes3.dex */
public final class CameraToolInfo extends C0T6 implements Parcelable, CameraToolInfoIntf {
    public static final Parcelable.Creator CREATOR = new C206139Av(93);
    public final CameraTool A00;
    public final Float A01;
    public final Float A02;
    public final Float A03;

    public CameraToolInfo(CameraTool cameraTool, Float f, Float f2, Float f3) {
        C14360o3.A0B(cameraTool, 1);
        this.A00 = cameraTool;
        this.A01 = f;
        this.A02 = f2;
        this.A03 = f3;
    }

    @Override // com.instagram.feed.media.CameraToolInfoIntf
    public final CameraToolInfo F4T() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CameraToolInfo) {
                CameraToolInfo cameraToolInfo = (CameraToolInfo) obj;
                if (this.A00 != cameraToolInfo.A00 || !C14360o3.A0K(this.A01, cameraToolInfo.A01) || !C14360o3.A0K(this.A02, cameraToolInfo.A02) || !C14360o3.A0K(this.A03, cameraToolInfo.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        Float f = this.A01;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.A02;
        int hashCode3 = (hashCode2 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.A03;
        return hashCode3 + (f3 != null ? f3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        Float f = this.A01;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        Float f2 = this.A02;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f2.floatValue());
        }
        Float f3 = this.A03;
        if (f3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f3.floatValue());
        }
    }

    @Override // com.instagram.feed.media.CameraToolInfoIntf
    public final CameraTool Ak6() {
        return this.A00;
    }

    @Override // com.instagram.feed.media.CameraToolInfoIntf
    public final Float Azs() {
        return this.A01;
    }

    @Override // com.instagram.feed.media.CameraToolInfoIntf
    public final Float Bz8() {
        return this.A02;
    }

    @Override // com.instagram.feed.media.CameraToolInfoIntf
    public final Float C8c() {
        return this.A03;
    }

    @Override // com.instagram.feed.media.CameraToolInfoIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTCreationToolInfoDict", I02.A00(this));
    }
}
