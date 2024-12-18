package com.instagram.model.mediasize;

import X.AbstractC65734Tt9;
import X.C0T6;
import X.C14360o3;
import X.C9Ay;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class SpritesheetInfoImpl extends C0T6 implements SpritesheetInfo, Parcelable {
    public static final Parcelable.Creator CREATOR = new C9Ay(19);
    public final Float A00;
    public final Float A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final Integer A06;
    public final Integer A07;
    public final Integer A08;
    public final Integer A09;
    public final Integer A0A;
    public final List A0B;

    @Override // com.instagram.model.mediasize.SpritesheetInfo
    public final SpritesheetInfoImpl F5D() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SpritesheetInfoImpl) {
                SpritesheetInfoImpl spritesheetInfoImpl = (SpritesheetInfoImpl) obj;
                if (!C14360o3.A0K(this.A02, spritesheetInfoImpl.A02) || !C14360o3.A0K(this.A03, spritesheetInfoImpl.A03) || !C14360o3.A0K(this.A04, spritesheetInfoImpl.A04) || !C14360o3.A0K(this.A05, spritesheetInfoImpl.A05) || !C14360o3.A0K(this.A0B, spritesheetInfoImpl.A0B) || !C14360o3.A0K(this.A06, spritesheetInfoImpl.A06) || !C14360o3.A0K(this.A00, spritesheetInfoImpl.A00) || !C14360o3.A0K(this.A07, spritesheetInfoImpl.A07) || !C14360o3.A0K(this.A08, spritesheetInfoImpl.A08) || !C14360o3.A0K(this.A09, spritesheetInfoImpl.A09) || !C14360o3.A0K(this.A0A, spritesheetInfoImpl.A0A) || !C14360o3.A0K(this.A01, spritesheetInfoImpl.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A02;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.A03;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.A04;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.A05;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        List list = this.A0B;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num5 = this.A06;
        int hashCode6 = (hashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Float f = this.A00;
        int hashCode7 = (hashCode6 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num6 = this.A07;
        int hashCode8 = (hashCode7 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.A08;
        int hashCode9 = (hashCode8 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.A09;
        int hashCode10 = (hashCode9 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.A0A;
        int hashCode11 = (hashCode10 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Float f2 = this.A01;
        return hashCode11 + (f2 != null ? f2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        Integer num = this.A02;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.A03;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.A04;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.A05;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        List list = this.A0B;
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
        Integer num5 = this.A06;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        Float f = this.A00;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        Integer num6 = this.A07;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num6.intValue());
        }
        Integer num7 = this.A08;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num7.intValue());
        }
        Integer num8 = this.A09;
        if (num8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num8.intValue());
        }
        Integer num9 = this.A0A;
        if (num9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num9.intValue());
        }
        Float f2 = this.A01;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f2.floatValue());
        }
    }

    @Override // com.instagram.model.mediasize.SpritesheetInfo
    public final Integer B6H() {
        return this.A02;
    }

    @Override // com.instagram.model.mediasize.SpritesheetInfo
    public final Integer BQ8() {
        return this.A03;
    }

    @Override // com.instagram.model.mediasize.SpritesheetInfo
    public final Integer Bmk() {
        return this.A04;
    }

    @Override // com.instagram.model.mediasize.SpritesheetInfo
    public final Integer BzP() {
        return this.A05;
    }

    @Override // com.instagram.model.mediasize.SpritesheetInfo
    public final List BzQ() {
        return this.A0B;
    }

    @Override // com.instagram.model.mediasize.SpritesheetInfo
    public final Integer BzR() {
        return this.A06;
    }

    @Override // com.instagram.model.mediasize.SpritesheetInfo
    public final Float C80() {
        return this.A00;
    }

    @Override // com.instagram.model.mediasize.SpritesheetInfo
    public final Integer C82() {
        return this.A07;
    }

    @Override // com.instagram.model.mediasize.SpritesheetInfo
    public final Integer C8D() {
        return this.A08;
    }

    @Override // com.instagram.model.mediasize.SpritesheetInfo
    public final Integer C8F() {
        return this.A09;
    }

    @Override // com.instagram.model.mediasize.SpritesheetInfo
    public final Integer C9x() {
        return this.A0A;
    }

    @Override // com.instagram.model.mediasize.SpritesheetInfo
    public final Float CFE() {
        return this.A01;
    }

    @Override // com.instagram.model.mediasize.SpritesheetInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTSpritesheetInfo", AbstractC65734Tt9.A00(this));
    }

    public SpritesheetInfoImpl(Float f, Float f2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, List list) {
        this.A02 = num;
        this.A03 = num2;
        this.A04 = num3;
        this.A05 = num4;
        this.A0B = list;
        this.A06 = num5;
        this.A00 = f;
        this.A07 = num6;
        this.A08 = num7;
        this.A09 = num8;
        this.A0A = num9;
        this.A01 = f2;
    }
}
