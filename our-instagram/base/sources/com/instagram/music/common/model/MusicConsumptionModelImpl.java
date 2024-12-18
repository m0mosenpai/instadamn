package com.instagram.music.common.model;

import X.AbstractC65736TtB;
import X.C0T6;
import X.C14360o3;
import X.C1DV;
import X.C1DY;
import X.C69486Vo9;
import X.C9Ay;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AudioMutingInfo;
import com.instagram.api.schemas.AudioMutingInfoIntf;
import com.instagram.api.schemas.MusicMuteAudioReason;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class MusicConsumptionModelImpl extends C0T6 implements MusicConsumptionModel, Parcelable {
    public static final Parcelable.Creator CREATOR = new C9Ay(48);
    public final AudioMutingInfo A00;
    public final MusicMuteAudioReason A01;
    public final User A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Boolean A05;
    public final Boolean A06;
    public final Boolean A07;
    public final Boolean A08;
    public final Integer A09;
    public final Integer A0A;
    public final Integer A0B;
    public final Integer A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final List A0H;
    public final List A0I;
    public final boolean A0J;

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final MusicConsumptionModel EBx(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final MusicConsumptionModelImpl F6h(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final MusicConsumptionModelImpl F6i(C1DV c1dv) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MusicConsumptionModelImpl) {
                MusicConsumptionModelImpl musicConsumptionModelImpl = (MusicConsumptionModelImpl) obj;
                if (!C14360o3.A0K(this.A03, musicConsumptionModelImpl.A03) || !C14360o3.A0K(this.A09, musicConsumptionModelImpl.A09) || !C14360o3.A0K(this.A0H, musicConsumptionModelImpl.A0H) || !C14360o3.A0K(this.A00, musicConsumptionModelImpl.A00) || !C14360o3.A0K(this.A04, musicConsumptionModelImpl.A04) || !C14360o3.A0K(this.A0D, musicConsumptionModelImpl.A0D) || !C14360o3.A0K(this.A0I, musicConsumptionModelImpl.A0I) || !C14360o3.A0K(this.A0E, musicConsumptionModelImpl.A0E) || !C14360o3.A0K(this.A02, musicConsumptionModelImpl.A02) || !C14360o3.A0K(this.A05, musicConsumptionModelImpl.A05) || !C14360o3.A0K(this.A06, musicConsumptionModelImpl.A06) || !C14360o3.A0K(this.A0A, musicConsumptionModelImpl.A0A) || !C14360o3.A0K(this.A0F, musicConsumptionModelImpl.A0F) || !C14360o3.A0K(this.A0B, musicConsumptionModelImpl.A0B) || !C14360o3.A0K(this.A07, musicConsumptionModelImpl.A07) || this.A0J != musicConsumptionModelImpl.A0J || !C14360o3.A0K(this.A0G, musicConsumptionModelImpl.A0G) || this.A01 != musicConsumptionModelImpl.A01 || !C14360o3.A0K(this.A08, musicConsumptionModelImpl.A08) || !C14360o3.A0K(this.A0C, musicConsumptionModelImpl.A0C)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        Boolean bool = this.A03;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num = this.A09;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        List list = this.A0H;
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
        parcel.writeParcelable(this.A00, i);
        Boolean bool2 = this.A04;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.A0D);
        List list2 = this.A0I;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable((Parcelable) it2.next(), i);
            }
        }
        parcel.writeString(this.A0E);
        parcel.writeParcelable(this.A02, i);
        Boolean bool3 = this.A05;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Boolean bool4 = this.A06;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Integer num2 = this.A0A;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.A0F);
        Integer num3 = this.A0B;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Boolean bool5 = this.A07;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeString(this.A0G);
        parcel.writeParcelable(this.A01, i);
        Boolean bool6 = this.A08;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool6.booleanValue() ? 1 : 0);
        }
        Integer num4 = this.A0C;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
    }

    public MusicConsumptionModelImpl(AudioMutingInfo audioMutingInfo, MusicMuteAudioReason musicMuteAudioReason, User user, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, String str4, List list, List list2, boolean z) {
        C14360o3.A0B(str3, 13);
        C14360o3.A0B(str4, 17);
        this.A03 = bool;
        this.A09 = num;
        this.A0H = list;
        this.A00 = audioMutingInfo;
        this.A04 = bool2;
        this.A0D = str;
        this.A0I = list2;
        this.A0E = str2;
        this.A02 = user;
        this.A05 = bool3;
        this.A06 = bool4;
        this.A0A = num2;
        this.A0F = str3;
        this.A0B = num3;
        this.A07 = bool5;
        this.A0J = z;
        this.A0G = str4;
        this.A01 = musicMuteAudioReason;
        this.A08 = bool6;
        this.A0C = num4;
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final /* bridge */ /* synthetic */ C69486Vo9 AKo() {
        return new C69486Vo9(this);
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final Boolean AbG() {
        return this.A03;
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final Integer Adg() {
        return this.A09;
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final List Ado() {
        return this.A0H;
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final /* bridge */ /* synthetic */ AudioMutingInfoIntf Adu() {
        return this.A00;
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final Boolean Aql() {
        return this.A04;
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final List AyW() {
        return this.A0I;
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final User BFU() {
        return this.A02;
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final Integer BaR() {
        return this.A0A;
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final Integer Bg7() {
        return this.A0B;
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final Boolean Buu() {
        return this.A07;
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final MusicMuteAudioReason BvC() {
        return this.A01;
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final Boolean BvQ() {
        return this.A08;
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final Integer CAx() {
        return this.A0C;
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final Boolean CQj() {
        return this.A05;
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final Boolean Cer() {
        return this.A06;
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTMusicConsumptionInfoDict", AbstractC65736TtB.A00(this));
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final String getDerivedContentId() {
        return this.A0D;
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final String getFormattedClipsMediaCount() {
        return this.A0E;
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final String getPlaceholderProfilePicUrl() {
        return this.A0F;
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final boolean getShouldMuteAudio() {
        return this.A0J;
    }

    @Override // com.instagram.music.common.model.MusicConsumptionModel
    public final String getShouldMuteAudioReason() {
        return this.A0G;
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
        Boolean bool = this.A03;
        int i = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i2 = hashCode * 31;
        Integer num = this.A09;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        List list = this.A0H;
        if (list == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        AudioMutingInfo audioMutingInfo = this.A00;
        if (audioMutingInfo == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = audioMutingInfo.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Boolean bool2 = this.A04;
        if (bool2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = bool2.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str = this.A0D;
        if (str == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        List list2 = this.A0I;
        if (list2 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = list2.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        String str2 = this.A0E;
        if (str2 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str2.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        User user = this.A02;
        if (user == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = user.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        Boolean bool3 = this.A05;
        if (bool3 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = bool3.hashCode();
        }
        int i11 = (i10 + hashCode10) * 31;
        Boolean bool4 = this.A06;
        if (bool4 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = bool4.hashCode();
        }
        int i12 = (i11 + hashCode11) * 31;
        Integer num2 = this.A0A;
        if (num2 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = num2.hashCode();
        }
        int hashCode17 = (((i12 + hashCode12) * 31) + this.A0F.hashCode()) * 31;
        Integer num3 = this.A0B;
        if (num3 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = num3.hashCode();
        }
        int i13 = (hashCode17 + hashCode13) * 31;
        Boolean bool5 = this.A07;
        if (bool5 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = bool5.hashCode();
        }
        int i14 = (i13 + hashCode14) * 31;
        int i15 = 1237;
        if (this.A0J) {
            i15 = 1231;
        }
        int hashCode18 = (((i14 + i15) * 31) + this.A0G.hashCode()) * 31;
        MusicMuteAudioReason musicMuteAudioReason = this.A01;
        if (musicMuteAudioReason == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = musicMuteAudioReason.hashCode();
        }
        int i16 = (hashCode18 + hashCode15) * 31;
        Boolean bool6 = this.A08;
        if (bool6 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = bool6.hashCode();
        }
        int i17 = (i16 + hashCode16) * 31;
        Integer num4 = this.A0C;
        if (num4 != null) {
            i = num4.hashCode();
        }
        return i17 + i;
    }
}
