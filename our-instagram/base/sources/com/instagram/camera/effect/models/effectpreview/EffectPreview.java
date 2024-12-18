package com.instagram.camera.effect.models.effectpreview;

import X.C37771pE;
import X.C70220WId;
import X.EnumC223179sw;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.camera.effect.models.AttributionUser;
import com.instagram.camera.effect.models.EffectActionSheet;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.shopping.ProductAREffectContainer;

/* loaded from: classes8.dex */
public final class EffectPreview implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70220WId(96);
    public AttributionUser A00;
    public EffectActionSheet A01;
    public ImageUrl A02;
    public ImageUrl A03;
    public EnumC223179sw A04;
    public C37771pE A05;
    public ProductAREffectContainer A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A0A);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A0B);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A06, i);
        parcel.writeString(this.A09);
        parcel.writeSerializable(this.A04);
    }
}
