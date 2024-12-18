package com.instagram.model.showreelnative;

import X.C0T6;
import X.C14360o3;
import X.C9Ay;
import X.I4P;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class IgShowreelNativeAnimation extends C0T6 implements IgShowreelNativeAnimationIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C9Ay(40);
    public final Integer A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final List A07;

    @Override // com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf
    public final IgShowreelNativeAnimation F6Z() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IgShowreelNativeAnimation) {
                IgShowreelNativeAnimation igShowreelNativeAnimation = (IgShowreelNativeAnimation) obj;
                if (!C14360o3.A0K(this.A02, igShowreelNativeAnimation.A02) || !C14360o3.A0K(this.A06, igShowreelNativeAnimation.A06) || !C14360o3.A0K(this.A07, igShowreelNativeAnimation.A07) || !C14360o3.A0K(this.A03, igShowreelNativeAnimation.A03) || !C14360o3.A0K(this.A04, igShowreelNativeAnimation.A04) || !C14360o3.A0K(this.A00, igShowreelNativeAnimation.A00) || !C14360o3.A0K(this.A05, igShowreelNativeAnimation.A05) || !C14360o3.A0K(this.A01, igShowreelNativeAnimation.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A02;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.A06;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.A07;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.A03;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A04;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.A00;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.A05;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num2 = this.A01;
        return hashCode7 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeStringList(this.A06);
        List list = this.A07;
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
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        Integer num = this.A00;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.A05);
        Integer num2 = this.A01;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    @Override // com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf
    public final String Abu() {
        return this.A02;
    }

    @Override // com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf
    public final List Acx() {
        return this.A06;
    }

    @Override // com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf
    public final List Acz() {
        return this.A07;
    }

    @Override // com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf
    public final String Anz() {
        return this.A03;
    }

    @Override // com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf
    public final String Aqq() {
        return this.A04;
    }

    @Override // com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf
    public final Integer BDS() {
        return this.A00;
    }

    @Override // com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf
    public final String C5i() {
        return this.A05;
    }

    @Override // com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf
    public final Integer CHg() {
        return this.A01;
    }

    @Override // com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTShowReel", I4P.A00(this));
    }

    public IgShowreelNativeAnimation(Integer num, Integer num2, String str, String str2, String str3, String str4, List list, List list2) {
        this.A02 = str;
        this.A06 = list;
        this.A07 = list2;
        this.A03 = str2;
        this.A04 = str3;
        this.A00 = num;
        this.A05 = str4;
        this.A01 = num2;
    }
}
