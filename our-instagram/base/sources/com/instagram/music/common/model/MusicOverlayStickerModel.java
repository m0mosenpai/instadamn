package com.instagram.music.common.model;

import X.AbstractC65735TtA;
import X.C0T6;
import X.C14360o3;
import X.C1DV;
import X.C1DY;
import X.C9Ay;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AudioMutingInfo;
import com.instagram.api.schemas.AudioMutingInfoIntf;
import com.instagram.api.schemas.MusicMuteAudioReason;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class MusicOverlayStickerModel extends C0T6 implements MusicOverlayStickerModelIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C9Ay(50);
    public final AudioMutingInfo A00;
    public final MusicMuteAudioReason A01;
    public final MusicProduct A02;
    public final ImageUrl A03;
    public final ImageUrl A04;
    public final User A05;
    public final Boolean A06;
    public final Boolean A07;
    public final Boolean A08;
    public final Boolean A09;
    public final Boolean A0A;
    public final Boolean A0B;
    public final Boolean A0C;
    public final Boolean A0D;
    public final Boolean A0E;
    public final Boolean A0F;
    public final Boolean A0G;
    public final Boolean A0H;
    public final Boolean A0I;
    public final Boolean A0J;
    public final Integer A0K;
    public final Integer A0L;
    public final Integer A0M;
    public final Integer A0N;
    public final Integer A0O;
    public final Integer A0P;
    public final String A0Q;
    public final String A0R;
    public final String A0S;
    public final String A0T;
    public final String A0U;
    public final String A0V;
    public final String A0W;
    public final String A0X;
    public final String A0Y;
    public final String A0Z;
    public final String A0a;
    public final String A0b;
    public final String A0c;
    public final String A0d;
    public final String A0e;
    public final String A0f;
    public final String A0g;
    public final String A0h;
    public final String A0i;
    public final String A0j;
    public final String A0k;
    public final String A0l;
    public final String A0m;
    public final String A0n;
    public final List A0o;
    public final List A0p;
    public final List A0q;
    public final boolean A0r;
    public final boolean A0s;
    public final boolean A0t;

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final MusicOverlayStickerModelIntf EBy(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final MusicOverlayStickerModel F6j(C1DY c1dy) {
        return this;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final MusicOverlayStickerModel F6k(C1DV c1dv) {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MusicOverlayStickerModel) {
                MusicOverlayStickerModel musicOverlayStickerModel = (MusicOverlayStickerModel) obj;
                if (!C14360o3.A0K(this.A0Q, musicOverlayStickerModel.A0Q) || !C14360o3.A0K(this.A06, musicOverlayStickerModel.A06) || this.A0r != musicOverlayStickerModel.A0r || !C14360o3.A0K(this.A0R, musicOverlayStickerModel.A0R) || !C14360o3.A0K(this.A0S, musicOverlayStickerModel.A0S) || !C14360o3.A0K(this.A0K, musicOverlayStickerModel.A0K) || !C14360o3.A0K(this.A0L, musicOverlayStickerModel.A0L) || !C14360o3.A0K(this.A0T, musicOverlayStickerModel.A0T) || !C14360o3.A0K(this.A0o, musicOverlayStickerModel.A0o) || !C14360o3.A0K(this.A00, musicOverlayStickerModel.A00) || !C14360o3.A0K(this.A0U, musicOverlayStickerModel.A0U) || !C14360o3.A0K(this.A07, musicOverlayStickerModel.A07) || !C14360o3.A0K(this.A03, musicOverlayStickerModel.A03) || !C14360o3.A0K(this.A04, musicOverlayStickerModel.A04) || !C14360o3.A0K(this.A0V, musicOverlayStickerModel.A0V) || !C14360o3.A0K(this.A0W, musicOverlayStickerModel.A0W) || !C14360o3.A0K(this.A0X, musicOverlayStickerModel.A0X) || !C14360o3.A0K(this.A0M, musicOverlayStickerModel.A0M) || !C14360o3.A0K(this.A0Y, musicOverlayStickerModel.A0Y) || !C14360o3.A0K(this.A0p, musicOverlayStickerModel.A0p) || !C14360o3.A0K(this.A0N, musicOverlayStickerModel.A0N) || !C14360o3.A0K(this.A0Z, musicOverlayStickerModel.A0Z) || !C14360o3.A0K(this.A0a, musicOverlayStickerModel.A0a) || !C14360o3.A0K(this.A08, musicOverlayStickerModel.A08) || !C14360o3.A0K(this.A09, musicOverlayStickerModel.A09) || !C14360o3.A0K(this.A0q, musicOverlayStickerModel.A0q) || !C14360o3.A0K(this.A0b, musicOverlayStickerModel.A0b) || !C14360o3.A0K(this.A05, musicOverlayStickerModel.A05) || !C14360o3.A0K(this.A0c, musicOverlayStickerModel.A0c) || !C14360o3.A0K(this.A0A, musicOverlayStickerModel.A0A) || !C14360o3.A0K(this.A0B, musicOverlayStickerModel.A0B) || !C14360o3.A0K(this.A0C, musicOverlayStickerModel.A0C) || this.A0s != musicOverlayStickerModel.A0s || !C14360o3.A0K(this.A0D, musicOverlayStickerModel.A0D) || !C14360o3.A0K(this.A0E, musicOverlayStickerModel.A0E) || !C14360o3.A0K(this.A0F, musicOverlayStickerModel.A0F) || !C14360o3.A0K(this.A0d, musicOverlayStickerModel.A0d) || this.A02 != musicOverlayStickerModel.A02 || !C14360o3.A0K(this.A0e, musicOverlayStickerModel.A0e) || !C14360o3.A0K(this.A0O, musicOverlayStickerModel.A0O) || !C14360o3.A0K(this.A0G, musicOverlayStickerModel.A0G) || !C14360o3.A0K(this.A0f, musicOverlayStickerModel.A0f) || !C14360o3.A0K(this.A0g, musicOverlayStickerModel.A0g) || !C14360o3.A0K(this.A0h, musicOverlayStickerModel.A0h) || !C14360o3.A0K(this.A0i, musicOverlayStickerModel.A0i) || !C14360o3.A0K(this.A0H, musicOverlayStickerModel.A0H) || this.A0t != musicOverlayStickerModel.A0t || !C14360o3.A0K(this.A0j, musicOverlayStickerModel.A0j) || this.A01 != musicOverlayStickerModel.A01 || !C14360o3.A0K(this.A0I, musicOverlayStickerModel.A0I) || !C14360o3.A0K(this.A0J, musicOverlayStickerModel.A0J) || !C14360o3.A0K(this.A0k, musicOverlayStickerModel.A0k) || !C14360o3.A0K(this.A0l, musicOverlayStickerModel.A0l) || !C14360o3.A0K(this.A0m, musicOverlayStickerModel.A0m) || !C14360o3.A0K(this.A0P, musicOverlayStickerModel.A0P) || !C14360o3.A0K(this.A0n, musicOverlayStickerModel.A0n)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A0Q);
        Boolean bool = this.A06;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.A0r ? 1 : 0);
        parcel.writeString(this.A0R);
        parcel.writeString(this.A0S);
        Integer num = this.A0K;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.A0L;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.A0T);
        List list = this.A0o;
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
        parcel.writeString(this.A0U);
        Boolean bool2 = this.A07;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeString(this.A0V);
        parcel.writeString(this.A0W);
        parcel.writeString(this.A0X);
        Integer num3 = this.A0M;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeString(this.A0Y);
        List list2 = this.A0p;
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
        Integer num4 = this.A0N;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        parcel.writeString(this.A0Z);
        parcel.writeString(this.A0a);
        Boolean bool3 = this.A08;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Boolean bool4 = this.A09;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        List list3 = this.A0q;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                parcel.writeInt(((Number) it3.next()).intValue());
            }
        }
        parcel.writeString(this.A0b);
        parcel.writeParcelable(this.A05, i);
        parcel.writeString(this.A0c);
        Boolean bool5 = this.A0A;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        Boolean bool6 = this.A0B;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool6.booleanValue() ? 1 : 0);
        }
        Boolean bool7 = this.A0C;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool7.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.A0s ? 1 : 0);
        Boolean bool8 = this.A0D;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool8.booleanValue() ? 1 : 0);
        }
        Boolean bool9 = this.A0E;
        if (bool9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool9.booleanValue() ? 1 : 0);
        }
        Boolean bool10 = this.A0F;
        if (bool10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool10.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.A0d);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A0e);
        Integer num5 = this.A0O;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        Boolean bool11 = this.A0G;
        if (bool11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool11.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.A0f);
        parcel.writeString(this.A0g);
        parcel.writeString(this.A0h);
        parcel.writeString(this.A0i);
        Boolean bool12 = this.A0H;
        if (bool12 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool12.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.A0t ? 1 : 0);
        parcel.writeString(this.A0j);
        parcel.writeParcelable(this.A01, i);
        Boolean bool13 = this.A0I;
        if (bool13 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool13.booleanValue() ? 1 : 0);
        }
        Boolean bool14 = this.A0J;
        if (bool14 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool14.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.A0k);
        parcel.writeString(this.A0l);
        parcel.writeString(this.A0m);
        Integer num6 = this.A0P;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num6.intValue());
        }
        parcel.writeString(this.A0n);
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String Aal() {
        return this.A0Q;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final Boolean AbG() {
        return this.A06;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final Integer Adg() {
        return this.A0K;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final Integer Adh() {
        return this.A0L;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final List Ado() {
        return this.A0o;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final /* bridge */ /* synthetic */ AudioMutingInfoIntf Adu() {
        return this.A00;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String AiR() {
        return this.A0U;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final Boolean Aql() {
        return this.A07;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final ImageUrl AsE() {
        return this.A03;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final ImageUrl AsF() {
        return this.A04;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String AvV() {
        return this.A0V;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final Integer Awp() {
        return this.A0M;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final List AyW() {
        return this.A0p;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final Integer Azi() {
        return this.A0N;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final Boolean BC4() {
        return this.A08;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final Boolean BDn() {
        return this.A09;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final List BE6() {
        return this.A0q;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final User BFU() {
        return this.A05;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String BOF() {
        return this.A0d;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final MusicProduct BVj() {
        return this.A02;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final Integer BaR() {
        return this.A0O;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final Boolean Bd5() {
        return this.A0G;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String Bkl() {
        return this.A0h;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String BqC() {
        return this.A0i;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final Boolean Buu() {
        return this.A0H;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final MusicMuteAudioReason BvC() {
        return this.A01;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final Boolean BvQ() {
        return this.A0I;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final Boolean Bvn() {
        return this.A0J;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final Integer CAx() {
        return this.A0P;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String CHM() {
        return this.A0n;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final Boolean CQj() {
        return this.A0A;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final Boolean CT1() {
        return this.A0B;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final Boolean CTb() {
        return this.A0C;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final Boolean CXk() {
        return this.A0D;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final Boolean CZu() {
        return this.A0E;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final Boolean Cer() {
        return this.A0F;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTFlattenedMusicInfo", AbstractC65735TtA.A00(this));
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final boolean getAllowsSaving() {
        return this.A0r;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String getArtistId() {
        return this.A0R;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String getAudioAssetId() {
        return this.A0S;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String getAudioClusterId() {
        return this.A0T;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String getDashManifest() {
        return this.A0W;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String getDerivedContentId() {
        return this.A0X;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String getDisplayArtist() {
        return this.A0Y;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String getFastStartProgressiveDownloadUrl() {
        return this.A0Z;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String getFormattedClipsMediaCount() {
        return this.A0a;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String getId() {
        return this.A0b;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String getIgUsername() {
        return this.A0c;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String getOriginalMediaId() {
        return this.A0e;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String getPlaceholderProfilePicUrl() {
        return this.A0f;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String getProgressiveDownloadUrl() {
        return this.A0g;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final boolean getShouldMuteAudio() {
        return this.A0t;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String getShouldMuteAudioReason() {
        return this.A0j;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String getSubtitle() {
        return this.A0k;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String getTag() {
        return this.A0l;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final String getTitle() {
        return this.A0m;
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
        int hashCode19;
        int hashCode20;
        int hashCode21;
        int hashCode22;
        int hashCode23;
        int hashCode24;
        int hashCode25;
        int hashCode26;
        int hashCode27;
        int hashCode28;
        int hashCode29;
        int hashCode30;
        int hashCode31;
        int hashCode32;
        int hashCode33;
        int hashCode34;
        int hashCode35;
        int hashCode36;
        int hashCode37;
        int hashCode38;
        int hashCode39;
        int hashCode40;
        int hashCode41;
        int hashCode42;
        int hashCode43;
        int hashCode44;
        int hashCode45;
        int hashCode46;
        int hashCode47;
        int hashCode48;
        String str = this.A0Q;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        Boolean bool = this.A06;
        if (bool == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        int i4 = 1237;
        if (this.A0r) {
            i4 = 1231;
        }
        int i5 = (i3 + i4) * 31;
        String str2 = this.A0R;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i6 = (i5 + hashCode3) * 31;
        String str3 = this.A0S;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i7 = (i6 + hashCode4) * 31;
        Integer num = this.A0K;
        if (num == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num.hashCode();
        }
        int i8 = (i7 + hashCode5) * 31;
        Integer num2 = this.A0L;
        if (num2 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num2.hashCode();
        }
        int i9 = (i8 + hashCode6) * 31;
        String str4 = this.A0T;
        if (str4 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str4.hashCode();
        }
        int i10 = (i9 + hashCode7) * 31;
        List list = this.A0o;
        if (list == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = list.hashCode();
        }
        int i11 = (i10 + hashCode8) * 31;
        AudioMutingInfo audioMutingInfo = this.A00;
        if (audioMutingInfo == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = audioMutingInfo.hashCode();
        }
        int i12 = (i11 + hashCode9) * 31;
        String str5 = this.A0U;
        if (str5 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str5.hashCode();
        }
        int i13 = (i12 + hashCode10) * 31;
        Boolean bool2 = this.A07;
        if (bool2 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = bool2.hashCode();
        }
        int i14 = (i13 + hashCode11) * 31;
        ImageUrl imageUrl = this.A03;
        if (imageUrl == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = imageUrl.hashCode();
        }
        int hashCode49 = (((i14 + hashCode12) * 31) + this.A04.hashCode()) * 31;
        String str6 = this.A0V;
        if (str6 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = str6.hashCode();
        }
        int i15 = (hashCode49 + hashCode13) * 31;
        String str7 = this.A0W;
        if (str7 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = str7.hashCode();
        }
        int i16 = (i15 + hashCode14) * 31;
        String str8 = this.A0X;
        if (str8 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = str8.hashCode();
        }
        int i17 = (i16 + hashCode15) * 31;
        Integer num3 = this.A0M;
        if (num3 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = num3.hashCode();
        }
        int i18 = (i17 + hashCode16) * 31;
        String str9 = this.A0Y;
        if (str9 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = str9.hashCode();
        }
        int i19 = (i18 + hashCode17) * 31;
        List list2 = this.A0p;
        if (list2 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = list2.hashCode();
        }
        int i20 = (i19 + hashCode18) * 31;
        Integer num4 = this.A0N;
        if (num4 == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = num4.hashCode();
        }
        int i21 = (i20 + hashCode19) * 31;
        String str10 = this.A0Z;
        if (str10 == null) {
            hashCode20 = 0;
        } else {
            hashCode20 = str10.hashCode();
        }
        int i22 = (i21 + hashCode20) * 31;
        String str11 = this.A0a;
        if (str11 == null) {
            hashCode21 = 0;
        } else {
            hashCode21 = str11.hashCode();
        }
        int i23 = (i22 + hashCode21) * 31;
        Boolean bool3 = this.A08;
        if (bool3 == null) {
            hashCode22 = 0;
        } else {
            hashCode22 = bool3.hashCode();
        }
        int i24 = (i23 + hashCode22) * 31;
        Boolean bool4 = this.A09;
        if (bool4 == null) {
            hashCode23 = 0;
        } else {
            hashCode23 = bool4.hashCode();
        }
        int i25 = (i24 + hashCode23) * 31;
        List list3 = this.A0q;
        if (list3 == null) {
            hashCode24 = 0;
        } else {
            hashCode24 = list3.hashCode();
        }
        int hashCode50 = (((i25 + hashCode24) * 31) + this.A0b.hashCode()) * 31;
        User user = this.A05;
        if (user == null) {
            hashCode25 = 0;
        } else {
            hashCode25 = user.hashCode();
        }
        int i26 = (hashCode50 + hashCode25) * 31;
        String str12 = this.A0c;
        if (str12 == null) {
            hashCode26 = 0;
        } else {
            hashCode26 = str12.hashCode();
        }
        int i27 = (i26 + hashCode26) * 31;
        Boolean bool5 = this.A0A;
        if (bool5 == null) {
            hashCode27 = 0;
        } else {
            hashCode27 = bool5.hashCode();
        }
        int i28 = (i27 + hashCode27) * 31;
        Boolean bool6 = this.A0B;
        if (bool6 == null) {
            hashCode28 = 0;
        } else {
            hashCode28 = bool6.hashCode();
        }
        int i29 = (i28 + hashCode28) * 31;
        Boolean bool7 = this.A0C;
        if (bool7 == null) {
            hashCode29 = 0;
        } else {
            hashCode29 = bool7.hashCode();
        }
        int i30 = (i29 + hashCode29) * 31;
        int i31 = 1237;
        if (this.A0s) {
            i31 = 1231;
        }
        int i32 = (i30 + i31) * 31;
        Boolean bool8 = this.A0D;
        if (bool8 == null) {
            hashCode30 = 0;
        } else {
            hashCode30 = bool8.hashCode();
        }
        int i33 = (i32 + hashCode30) * 31;
        Boolean bool9 = this.A0E;
        if (bool9 == null) {
            hashCode31 = 0;
        } else {
            hashCode31 = bool9.hashCode();
        }
        int i34 = (i33 + hashCode31) * 31;
        Boolean bool10 = this.A0F;
        if (bool10 == null) {
            hashCode32 = 0;
        } else {
            hashCode32 = bool10.hashCode();
        }
        int i35 = (i34 + hashCode32) * 31;
        String str13 = this.A0d;
        if (str13 == null) {
            hashCode33 = 0;
        } else {
            hashCode33 = str13.hashCode();
        }
        int i36 = (i35 + hashCode33) * 31;
        MusicProduct musicProduct = this.A02;
        if (musicProduct == null) {
            hashCode34 = 0;
        } else {
            hashCode34 = musicProduct.hashCode();
        }
        int i37 = (i36 + hashCode34) * 31;
        String str14 = this.A0e;
        if (str14 == null) {
            hashCode35 = 0;
        } else {
            hashCode35 = str14.hashCode();
        }
        int i38 = (i37 + hashCode35) * 31;
        Integer num5 = this.A0O;
        if (num5 == null) {
            hashCode36 = 0;
        } else {
            hashCode36 = num5.hashCode();
        }
        int i39 = (i38 + hashCode36) * 31;
        Boolean bool11 = this.A0G;
        if (bool11 == null) {
            hashCode37 = 0;
        } else {
            hashCode37 = bool11.hashCode();
        }
        int hashCode51 = (((i39 + hashCode37) * 31) + this.A0f.hashCode()) * 31;
        String str15 = this.A0g;
        if (str15 == null) {
            hashCode38 = 0;
        } else {
            hashCode38 = str15.hashCode();
        }
        int i40 = (hashCode51 + hashCode38) * 31;
        String str16 = this.A0h;
        if (str16 == null) {
            hashCode39 = 0;
        } else {
            hashCode39 = str16.hashCode();
        }
        int i41 = (i40 + hashCode39) * 31;
        String str17 = this.A0i;
        if (str17 == null) {
            hashCode40 = 0;
        } else {
            hashCode40 = str17.hashCode();
        }
        int i42 = (i41 + hashCode40) * 31;
        Boolean bool12 = this.A0H;
        if (bool12 == null) {
            hashCode41 = 0;
        } else {
            hashCode41 = bool12.hashCode();
        }
        int i43 = (i42 + hashCode41) * 31;
        int i44 = 1237;
        if (this.A0t) {
            i44 = 1231;
        }
        int hashCode52 = (((i43 + i44) * 31) + this.A0j.hashCode()) * 31;
        MusicMuteAudioReason musicMuteAudioReason = this.A01;
        if (musicMuteAudioReason == null) {
            hashCode42 = 0;
        } else {
            hashCode42 = musicMuteAudioReason.hashCode();
        }
        int i45 = (hashCode52 + hashCode42) * 31;
        Boolean bool13 = this.A0I;
        if (bool13 == null) {
            hashCode43 = 0;
        } else {
            hashCode43 = bool13.hashCode();
        }
        int i46 = (i45 + hashCode43) * 31;
        Boolean bool14 = this.A0J;
        if (bool14 == null) {
            hashCode44 = 0;
        } else {
            hashCode44 = bool14.hashCode();
        }
        int i47 = (i46 + hashCode44) * 31;
        String str18 = this.A0k;
        if (str18 == null) {
            hashCode45 = 0;
        } else {
            hashCode45 = str18.hashCode();
        }
        int i48 = (i47 + hashCode45) * 31;
        String str19 = this.A0l;
        if (str19 == null) {
            hashCode46 = 0;
        } else {
            hashCode46 = str19.hashCode();
        }
        int i49 = (i48 + hashCode46) * 31;
        String str20 = this.A0m;
        if (str20 == null) {
            hashCode47 = 0;
        } else {
            hashCode47 = str20.hashCode();
        }
        int i50 = (i49 + hashCode47) * 31;
        Integer num6 = this.A0P;
        if (num6 == null) {
            hashCode48 = 0;
        } else {
            hashCode48 = num6.hashCode();
        }
        int i51 = (i50 + hashCode48) * 31;
        String str21 = this.A0n;
        if (str21 != null) {
            i = str21.hashCode();
        }
        return i51 + i;
    }

    @Override // com.instagram.music.common.model.MusicOverlayStickerModelIntf
    public final boolean isExplicit() {
        return this.A0s;
    }

    public MusicOverlayStickerModel(AudioMutingInfo audioMutingInfo, MusicMuteAudioReason musicMuteAudioReason, MusicProduct musicProduct, ImageUrl imageUrl, ImageUrl imageUrl2, User user, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, List list, List list2, List list3, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(imageUrl2, 14);
        C14360o3.A0B(str12, 27);
        C14360o3.A0B(str16, 42);
        C14360o3.A0B(str20, 48);
        this.A0Q = str;
        this.A06 = bool;
        this.A0r = z;
        this.A0R = str2;
        this.A0S = str3;
        this.A0K = num;
        this.A0L = num2;
        this.A0T = str4;
        this.A0o = list;
        this.A00 = audioMutingInfo;
        this.A0U = str5;
        this.A07 = bool2;
        this.A03 = imageUrl;
        this.A04 = imageUrl2;
        this.A0V = str6;
        this.A0W = str7;
        this.A0X = str8;
        this.A0M = num3;
        this.A0Y = str9;
        this.A0p = list2;
        this.A0N = num4;
        this.A0Z = str10;
        this.A0a = str11;
        this.A08 = bool3;
        this.A09 = bool4;
        this.A0q = list3;
        this.A0b = str12;
        this.A05 = user;
        this.A0c = str13;
        this.A0A = bool5;
        this.A0B = bool6;
        this.A0C = bool7;
        this.A0s = z2;
        this.A0D = bool8;
        this.A0E = bool9;
        this.A0F = bool10;
        this.A0d = str14;
        this.A02 = musicProduct;
        this.A0e = str15;
        this.A0O = num5;
        this.A0G = bool11;
        this.A0f = str16;
        this.A0g = str17;
        this.A0h = str18;
        this.A0i = str19;
        this.A0H = bool12;
        this.A0t = z3;
        this.A0j = str20;
        this.A01 = musicMuteAudioReason;
        this.A0I = bool13;
        this.A0J = bool14;
        this.A0k = str21;
        this.A0l = str22;
        this.A0m = str23;
        this.A0P = num6;
        this.A0n = str24;
    }
}
