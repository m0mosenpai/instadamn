package com.instagram.direct.sharetostory.data;

import X.AbstractC166997dE;
import X.AbstractC25233BEq;
import X.C14360o3;
import X.C2EY;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.capabilities.Capabilities;

/* loaded from: classes6.dex */
public final class MessageShareStickerData extends ShareToStoryStickerData {
    public static final Parcelable.Creator CREATOR = new LNL(42);
    public int A00;
    public int A01;
    public IGAIAgentType A02;
    public ImageUrl A03;
    public ImageUrl A04;
    public Capabilities A05;
    public C2EY A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0E);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A04, i);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeString(this.A0A);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A08);
        C2EY c2ey = this.A06;
        if (c2ey == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            AbstractC166997dE.A1I(parcel, c2ey);
        }
        parcel.writeString(this.A0B);
        parcel.writeString(this.A09);
        parcel.writeParcelable(this.A05, i);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0G);
        parcel.writeParcelable(this.A03, i);
    }

    public MessageShareStickerData(IGAIAgentType iGAIAgentType, ImageUrl imageUrl, ImageUrl imageUrl2, Capabilities capabilities, C2EY c2ey, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C14360o3.A0B(str4, 10);
        AbstractC25233BEq.A0z(15, str6, str7, capabilities);
        super.A00 = imageUrl;
        this.A0D = str;
        this.A0F = str2;
        this.A0E = str3;
        this.A00 = i;
        this.A04 = imageUrl;
        this.A01 = i2;
        this.A0J = z;
        this.A0L = z2;
        this.A0K = z3;
        this.A0A = str4;
        this.A0H = z4;
        this.A02 = iGAIAgentType;
        this.A08 = str5;
        this.A06 = c2ey;
        this.A0B = str6;
        this.A09 = str7;
        this.A05 = capabilities;
        this.A07 = str8;
        this.A0I = z5;
        this.A0C = str9;
        this.A0G = str10;
        this.A03 = imageUrl2;
    }
}
