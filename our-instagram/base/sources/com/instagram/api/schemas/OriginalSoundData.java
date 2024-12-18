package com.instagram.api.schemas;

import X.AbstractC37371GdD;
import X.C0T6;
import X.C14360o3;
import X.C1DV;
import X.C1DY;
import X.C206159Ax;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class OriginalSoundData extends C0T6 implements OriginalSoundDataIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C206159Ax(76);
    public final OriginalAudioSubtype A00;
    public final OriginalSoundConsumptionInfo A01;
    public final XpostOriginalSoundFBCreatorInfo A02;
    public final User A03;
    public final Boolean A04;
    public final Boolean A05;
    public final Boolean A06;
    public final Boolean A07;
    public final Boolean A08;
    public final Boolean A09;
    public final Boolean A0A;
    public final Boolean A0B;
    public final Integer A0C;
    public final Integer A0D;
    public final Integer A0E;
    public final Integer A0F;
    public final Integer A0G;
    public final Integer A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final List A0P;
    public final List A0Q;
    public final List A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;

    public OriginalSoundData(OriginalAudioSubtype originalAudioSubtype, OriginalSoundConsumptionInfo originalSoundConsumptionInfo, XpostOriginalSoundFBCreatorInfo xpostOriginalSoundFBCreatorInfo, User user, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, List list3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C14360o3.A0B(str, 2);
        C14360o3.A0B(list2, 5);
        C14360o3.A0B(originalSoundConsumptionInfo, 9);
        C14360o3.A0B(str2, 10);
        C14360o3.A0B(user, 14);
        C14360o3.A0B(originalAudioSubtype, 24);
        C14360o3.A0B(str5, 25);
        C14360o3.A0B(str6, 26);
        C14360o3.A0B(str7, 29);
        this.A0S = z;
        this.A0I = str;
        this.A0C = num;
        this.A0P = list;
        this.A0Q = list2;
        this.A0R = list3;
        this.A04 = bool;
        this.A05 = bool2;
        this.A01 = originalSoundConsumptionInfo;
        this.A0J = str2;
        this.A0D = num2;
        this.A0K = str3;
        this.A0T = z2;
        this.A03 = user;
        this.A0U = z3;
        this.A06 = bool3;
        this.A07 = bool4;
        this.A0V = z4;
        this.A08 = bool5;
        this.A09 = bool6;
        this.A0A = bool7;
        this.A0L = str4;
        this.A0B = bool8;
        this.A00 = originalAudioSubtype;
        this.A0M = str5;
        this.A0N = str6;
        this.A0E = num3;
        this.A0F = num4;
        this.A0O = str7;
        this.A0W = z5;
        this.A0G = num5;
        this.A0H = num6;
        this.A02 = xpostOriginalSoundFBCreatorInfo;
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final OriginalSoundDataIntf E9V(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final OriginalSoundData Exi(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final OriginalSoundData Exj(C1DV c1dv) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OriginalSoundData) {
                OriginalSoundData originalSoundData = (OriginalSoundData) obj;
                if (this.A0S != originalSoundData.A0S || !C14360o3.A0K(this.A0I, originalSoundData.A0I) || !C14360o3.A0K(this.A0C, originalSoundData.A0C) || !C14360o3.A0K(this.A0P, originalSoundData.A0P) || !C14360o3.A0K(this.A0Q, originalSoundData.A0Q) || !C14360o3.A0K(this.A0R, originalSoundData.A0R) || !C14360o3.A0K(this.A04, originalSoundData.A04) || !C14360o3.A0K(this.A05, originalSoundData.A05) || !C14360o3.A0K(this.A01, originalSoundData.A01) || !C14360o3.A0K(this.A0J, originalSoundData.A0J) || !C14360o3.A0K(this.A0D, originalSoundData.A0D) || !C14360o3.A0K(this.A0K, originalSoundData.A0K) || this.A0T != originalSoundData.A0T || !C14360o3.A0K(this.A03, originalSoundData.A03) || this.A0U != originalSoundData.A0U || !C14360o3.A0K(this.A06, originalSoundData.A06) || !C14360o3.A0K(this.A07, originalSoundData.A07) || this.A0V != originalSoundData.A0V || !C14360o3.A0K(this.A08, originalSoundData.A08) || !C14360o3.A0K(this.A09, originalSoundData.A09) || !C14360o3.A0K(this.A0A, originalSoundData.A0A) || !C14360o3.A0K(this.A0L, originalSoundData.A0L) || !C14360o3.A0K(this.A0B, originalSoundData.A0B) || this.A00 != originalSoundData.A00 || !C14360o3.A0K(this.A0M, originalSoundData.A0M) || !C14360o3.A0K(this.A0N, originalSoundData.A0N) || !C14360o3.A0K(this.A0E, originalSoundData.A0E) || !C14360o3.A0K(this.A0F, originalSoundData.A0F) || !C14360o3.A0K(this.A0O, originalSoundData.A0O) || this.A0W != originalSoundData.A0W || !C14360o3.A0K(this.A0G, originalSoundData.A0G) || !C14360o3.A0K(this.A0H, originalSoundData.A0H) || !C14360o3.A0K(this.A02, originalSoundData.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(this.A0S ? 1 : 0);
        parcel.writeString(this.A0I);
        Integer num = this.A0C;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        List list = this.A0P;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable((Parcelable) it.next(), i);
            }
        }
        List list2 = this.A0Q;
        parcel.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable((Parcelable) it2.next(), i);
        }
        List list3 = this.A0R;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                parcel.writeParcelable((Parcelable) it3.next(), i);
            }
        }
        Boolean bool = this.A04;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.A05;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A0J);
        Integer num2 = this.A0D;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.A0K);
        parcel.writeInt(this.A0T ? 1 : 0);
        parcel.writeParcelable(this.A03, i);
        parcel.writeInt(this.A0U ? 1 : 0);
        Boolean bool3 = this.A06;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Boolean bool4 = this.A07;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.A0V ? 1 : 0);
        Boolean bool5 = this.A08;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        Boolean bool6 = this.A09;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool6.booleanValue() ? 1 : 0);
        }
        Boolean bool7 = this.A0A;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool7.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.A0L);
        Boolean bool8 = this.A0B;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool8.booleanValue() ? 1 : 0);
        }
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A0M);
        parcel.writeString(this.A0N);
        Integer num3 = this.A0E;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.A0F;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        parcel.writeString(this.A0O);
        parcel.writeInt(this.A0W ? 1 : 0);
        Integer num5 = this.A0G;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        Integer num6 = this.A0H;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num6.intValue());
        }
        parcel.writeParcelable(this.A02, i);
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final Integer Adg() {
        return this.A0C;
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final List Ado() {
        return this.A0P;
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final List Adv() {
        return this.A0Q;
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final List Adw() {
        return this.A0R;
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final Boolean Akf() {
        return this.A04;
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final Boolean Akg() {
        return this.A05;
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final /* bridge */ /* synthetic */ OriginalSoundConsumptionInfoIntf AqX() {
        return this.A01;
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final Integer Azi() {
        return this.A0D;
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final User BFU() {
        return this.A03;
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final Boolean BYR() {
        return this.A0B;
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final OriginalAudioSubtype BZj() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final Integer BaR() {
        return this.A0E;
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final Integer Bg7() {
        return this.A0F;
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final Integer C8O() {
        return this.A0G;
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final Integer CAx() {
        return this.A0H;
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final XpostOriginalSoundFBCreatorInfo CIV() {
        return this.A02;
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final Boolean CT1() {
        return this.A06;
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final Boolean CTb() {
        return this.A07;
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final Boolean CZr() {
        return this.A08;
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final Boolean Cc7() {
        return this.A09;
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final Boolean CgF() {
        return this.A0A;
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTOriginalSoundData", AbstractC37371GdD.A00(this));
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final boolean getAllowCreatorToRename() {
        return this.A0S;
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final String getAudioAssetId() {
        return this.A0I;
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final String getDashManifest() {
        return this.A0J;
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final String getFormattedClipsMediaCount() {
        return this.A0K;
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final boolean getHideRemixing() {
        return this.A0T;
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final String getMusicCanonicalId() {
        return this.A0L;
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final String getOriginalAudioTitle() {
        return this.A0M;
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final String getOriginalMediaId() {
        return this.A0N;
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final String getProgressiveDownloadUrl() {
        return this.A0O;
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final boolean getShouldMuteAudio() {
        return this.A0W;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int i = 1237;
        if (this.A0S) {
            i = 1231;
        }
        int hashCode19 = ((i * 31) + this.A0I.hashCode()) * 31;
        Integer num = this.A0C;
        int i2 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i3 = (hashCode19 + hashCode) * 31;
        List list = this.A0P;
        if (list == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list.hashCode();
        }
        int hashCode20 = (((i3 + hashCode2) * 31) + this.A0Q.hashCode()) * 31;
        List list2 = this.A0R;
        if (list2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list2.hashCode();
        }
        int i4 = (hashCode20 + hashCode3) * 31;
        Boolean bool = this.A04;
        if (bool == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bool.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Boolean bool2 = this.A05;
        if (bool2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = bool2.hashCode();
        }
        int hashCode21 = (((((i5 + hashCode5) * 31) + this.A01.hashCode()) * 31) + this.A0J.hashCode()) * 31;
        Integer num2 = this.A0D;
        if (num2 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num2.hashCode();
        }
        int i6 = (hashCode21 + hashCode6) * 31;
        String str = this.A0K;
        if (str == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str.hashCode();
        }
        int i7 = (i6 + hashCode7) * 31;
        int i8 = 1237;
        if (this.A0T) {
            i8 = 1231;
        }
        int hashCode22 = (((i7 + i8) * 31) + this.A03.hashCode()) * 31;
        int i9 = 1237;
        if (this.A0U) {
            i9 = 1231;
        }
        int i10 = (hashCode22 + i9) * 31;
        Boolean bool3 = this.A06;
        if (bool3 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = bool3.hashCode();
        }
        int i11 = (i10 + hashCode8) * 31;
        Boolean bool4 = this.A07;
        if (bool4 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = bool4.hashCode();
        }
        int i12 = (i11 + hashCode9) * 31;
        int i13 = 1237;
        if (this.A0V) {
            i13 = 1231;
        }
        int i14 = (i12 + i13) * 31;
        Boolean bool5 = this.A08;
        if (bool5 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = bool5.hashCode();
        }
        int i15 = (i14 + hashCode10) * 31;
        Boolean bool6 = this.A09;
        if (bool6 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = bool6.hashCode();
        }
        int i16 = (i15 + hashCode11) * 31;
        Boolean bool7 = this.A0A;
        if (bool7 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = bool7.hashCode();
        }
        int i17 = (i16 + hashCode12) * 31;
        String str2 = this.A0L;
        if (str2 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = str2.hashCode();
        }
        int i18 = (i17 + hashCode13) * 31;
        Boolean bool8 = this.A0B;
        if (bool8 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = bool8.hashCode();
        }
        int hashCode23 = (((((((i18 + hashCode14) * 31) + this.A00.hashCode()) * 31) + this.A0M.hashCode()) * 31) + this.A0N.hashCode()) * 31;
        Integer num3 = this.A0E;
        if (num3 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = num3.hashCode();
        }
        int i19 = (hashCode23 + hashCode15) * 31;
        Integer num4 = this.A0F;
        if (num4 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = num4.hashCode();
        }
        int hashCode24 = (((i19 + hashCode16) * 31) + this.A0O.hashCode()) * 31;
        int i20 = 1237;
        if (this.A0W) {
            i20 = 1231;
        }
        int i21 = (hashCode24 + i20) * 31;
        Integer num5 = this.A0G;
        if (num5 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = num5.hashCode();
        }
        int i22 = (i21 + hashCode17) * 31;
        Integer num6 = this.A0H;
        if (num6 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = num6.hashCode();
        }
        int i23 = (i22 + hashCode18) * 31;
        XpostOriginalSoundFBCreatorInfo xpostOriginalSoundFBCreatorInfo = this.A02;
        if (xpostOriginalSoundFBCreatorInfo != null) {
            i2 = xpostOriginalSoundFBCreatorInfo.hashCode();
        }
        return i23 + i2;
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final boolean isAudioAutomaticallyAttributed() {
        return this.A0U;
    }

    @Override // com.instagram.api.schemas.OriginalSoundDataIntf
    public final boolean isExplicit() {
        return this.A0V;
    }
}
