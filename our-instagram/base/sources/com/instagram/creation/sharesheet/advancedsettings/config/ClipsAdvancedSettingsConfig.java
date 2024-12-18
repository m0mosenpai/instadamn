package com.instagram.creation.sharesheet.advancedsettings.config;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25229BEm;
import X.AbstractC25231BEo;
import X.AbstractC25236BEt;
import X.AbstractC37304Gc5;
import X.AbstractC43591JPw;
import X.C0T6;
import X.C14360o3;
import X.C16930sl;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.api.schemas.BrandedContentProjectMetadata;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(message = "This class will be removed eventually, please do not add anything to this. New fields should be added to PublishScreenData instead.")
/* loaded from: classes9.dex */
public final class ClipsAdvancedSettingsConfig extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNM(77);
    public BrandedContentGatingInfo A00;
    public List A01;
    public boolean A02;
    public boolean A03;
    public BrandedContentProjectMetadata A04;
    public Boolean A05;
    public String A06;
    public String A07;
    public boolean A08;
    public final boolean A09;

    public ClipsAdvancedSettingsConfig() {
        this(null, null, null, null, null, C16930sl.A00, false, false, false, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClipsAdvancedSettingsConfig) {
                ClipsAdvancedSettingsConfig clipsAdvancedSettingsConfig = (ClipsAdvancedSettingsConfig) obj;
                if (!C14360o3.A0K(this.A06, clipsAdvancedSettingsConfig.A06) || !C14360o3.A0K(this.A07, clipsAdvancedSettingsConfig.A07) || !C14360o3.A0K(this.A05, clipsAdvancedSettingsConfig.A05) || this.A02 != clipsAdvancedSettingsConfig.A02 || !C14360o3.A0K(this.A01, clipsAdvancedSettingsConfig.A01) || !C14360o3.A0K(this.A04, clipsAdvancedSettingsConfig.A04) || !C14360o3.A0K(this.A00, clipsAdvancedSettingsConfig.A00) || this.A09 != clipsAdvancedSettingsConfig.A09 || this.A03 != clipsAdvancedSettingsConfig.A03 || this.A08 != clipsAdvancedSettingsConfig.A08) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeInt(AbstractC37304Gc5.A1Y(parcel, this.A05) ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        Iterator A0u = AbstractC25231BEo.A0u(parcel, this.A01);
        while (A0u.hasNext()) {
            AbstractC25229BEm.A15(parcel, A0u, i);
        }
        parcel.writeParcelable(this.A04, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A08, AbstractC167007dF.A0D(this.A03, AbstractC167007dF.A0D(this.A09, (((AbstractC166997dE.A0J(this.A01, AbstractC167007dF.A0D(this.A02, ((((AbstractC167017dG.A0O(this.A06) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31)) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC166997dE.A0I(this.A00)) * 31)));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ClipsAdvancedSettingsConfig(brandedContentMerchantId=");
        A1C.append(this.A06);
        A1C.append(AbstractC43591JPw.A00(231));
        A1C.append(this.A07);
        A1C.append(", isCapturedVideo=");
        A1C.append(this.A05);
        A1C.append(", isPaidPartnership=");
        A1C.append(this.A02);
        A1C.append(", brandedContentTags=");
        A1C.append(this.A01);
        A1C.append(", brandedContentProjectMetadata=");
        A1C.append(this.A04);
        A1C.append(", mediaGatingInfo=");
        A1C.append(this.A00);
        A1C.append(", isAccountRevshareEligible=");
        A1C.append(this.A09);
        A1C.append(", shouldShowAdsToggledOn=");
        A1C.append(this.A03);
        A1C.append(", isPostEntryPoint=");
        return AbstractC25236BEt.A0a(A1C, this.A08);
    }

    public ClipsAdvancedSettingsConfig(BrandedContentGatingInfo brandedContentGatingInfo, BrandedContentProjectMetadata brandedContentProjectMetadata, Boolean bool, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        C14360o3.A0B(list, 5);
        this.A06 = str;
        this.A07 = str2;
        this.A05 = bool;
        this.A02 = z;
        this.A01 = list;
        this.A04 = brandedContentProjectMetadata;
        this.A00 = brandedContentGatingInfo;
        this.A09 = z2;
        this.A03 = z3;
        this.A08 = z4;
    }
}
