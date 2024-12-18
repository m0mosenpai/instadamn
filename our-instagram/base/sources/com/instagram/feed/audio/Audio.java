package com.instagram.feed.audio;

import X.AbstractC40637Hzv;
import X.C0T6;
import X.C14360o3;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.DirectAudioFallbackUrl;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class Audio extends C0T6 implements AudioIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C206139Av(92);
    public final DirectAudioFallbackUrl A00;
    public final Integer A01;
    public final Long A02;
    public final Long A03;
    public final String A04;
    public final List A05;

    @Override // com.instagram.feed.audio.AudioIntf
    public final Audio F4S() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Audio) {
                Audio audio = (Audio) obj;
                if (!C14360o3.A0K(this.A04, audio.A04) || !C14360o3.A0K(this.A02, audio.A02) || !C14360o3.A0K(this.A03, audio.A03) || !C14360o3.A0K(this.A00, audio.A00) || !C14360o3.A0K(this.A05, audio.A05) || !C14360o3.A0K(this.A01, audio.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A04;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.A02;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.A03;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        DirectAudioFallbackUrl directAudioFallbackUrl = this.A00;
        int hashCode4 = (hashCode3 + (directAudioFallbackUrl == null ? 0 : directAudioFallbackUrl.hashCode())) * 31;
        List list = this.A05;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.A01;
        return hashCode5 + (num != null ? num.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A04);
        Long l = this.A02;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.A03;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeParcelable(this.A00, i);
        List list = this.A05;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                parcel.writeFloat(((Number) it.next()).floatValue());
            }
        }
        Integer num = this.A01;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    @Override // com.instagram.feed.audio.AudioIntf
    public final String Ae1() {
        return this.A04;
    }

    @Override // com.instagram.feed.audio.AudioIntf
    public final Long Ae2() {
        return this.A02;
    }

    @Override // com.instagram.feed.audio.AudioIntf
    public final Long Azh() {
        return this.A03;
    }

    @Override // com.instagram.feed.audio.AudioIntf
    public final DirectAudioFallbackUrl B4D() {
        return this.A00;
    }

    @Override // com.instagram.feed.audio.AudioIntf
    public final List CHJ() {
        return this.A05;
    }

    @Override // com.instagram.feed.audio.AudioIntf
    public final Integer CHK() {
        return this.A01;
    }

    @Override // com.instagram.feed.audio.AudioIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAudioInfo", AbstractC40637Hzv.A00(this));
    }

    public Audio(DirectAudioFallbackUrl directAudioFallbackUrl, Integer num, Long l, Long l2, String str, List list) {
        this.A04 = str;
        this.A02 = l;
        this.A03 = l2;
        this.A00 = directAudioFallbackUrl;
        this.A05 = list;
        this.A01 = num;
    }
}
