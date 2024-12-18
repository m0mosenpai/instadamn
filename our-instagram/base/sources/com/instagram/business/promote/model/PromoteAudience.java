package com.instagram.business.promote.model;

import X.C14360o3;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.AdvantageAudienceData;
import com.instagram.api.schemas.BoostedPostAudienceOption;
import com.instagram.api.schemas.TargetingRelaxationConstants;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class PromoteAudience implements Parcelable {
    public static final PromoteAudience A0E;
    public static final Parcelable.Creator CREATOR = new C70220WId(60);
    public int A00;
    public int A01;
    public AdvantageAudienceData A02;
    public BoostedPostAudienceOption A03;
    public TargetingRelaxationConstants A04;
    public String A05;
    public String A06;
    public String A07;
    public List A09;
    public List A0A;
    public boolean A0C;
    public boolean A0D;
    public List A08 = new ArrayList();
    public List A0B = new ArrayList();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A05);
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A03, i);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeTypedList(this.A08);
        parcel.writeStringList(this.A09);
        parcel.writeStringList(this.A0A);
        parcel.writeParcelable(this.A04, i);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeParcelable(this.A02, i);
    }

    static {
        PromoteAudience promoteAudience = new PromoteAudience();
        promoteAudience.A03 = BoostedPostAudienceOption.A0K;
        promoteAudience.A07 = "Automatic";
        promoteAudience.A00 = 65;
        promoteAudience.A01 = 18;
        A0E = promoteAudience;
    }
}
