package com.instagram.creation.capture.quickcapture.superlativesticker.model;

import X.AbstractC06930Yk;
import X.C09530e4;
import X.C14360o3;
import X.EnumC46183KcL;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes4.dex */
public final class SuperlativeStickerClientModel implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = new LNM(66);
    public final EnumC46183KcL A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final List A04;

    public SuperlativeStickerClientModel(EnumC46183KcL enumC46183KcL, String str, String str2, List list, List list2) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(enumC46183KcL, 4);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = list;
        this.A00 = enumC46183KcL;
        this.A04 = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        List list = this.A03;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((SuperlativeMentionSticker) it.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.A00.name());
        List list2 = this.A04;
        parcel.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ((SuperlativeNotifyToUsers) it2.next()).writeToParcel(parcel, i);
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        SuperlativeStickerClientModel superlativeStickerClientModel = (SuperlativeStickerClientModel) obj;
        C14360o3.A0B(superlativeStickerClientModel, 0);
        LinkedHashMap A06 = AbstractC06930Yk.A06(new C09530e4(EnumC46183KcL.A04, 0), new C09530e4(EnumC46183KcL.A06, 1), new C09530e4(EnumC46183KcL.A07, 2), new C09530e4(EnumC46183KcL.A08, 3), new C09530e4(EnumC46183KcL.A05, 4), new C09530e4(EnumC46183KcL.A09, 5), new C09530e4(EnumC46183KcL.A03, 6));
        EnumC46183KcL enumC46183KcL = this.A00;
        Number number = (Number) A06.get(enumC46183KcL);
        if (number != null) {
            int intValue = number.intValue();
            EnumC46183KcL enumC46183KcL2 = superlativeStickerClientModel.A00;
            Number number2 = (Number) A06.get(enumC46183KcL2);
            if (number2 != null) {
                return C14360o3.A00(intValue, number2.intValue());
            }
            return enumC46183KcL2.compareTo(enumC46183KcL2);
        }
        return enumC46183KcL.compareTo(superlativeStickerClientModel.A00);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SuperlativeStickerClientModel)) {
            return false;
        }
        SuperlativeStickerClientModel superlativeStickerClientModel = (SuperlativeStickerClientModel) obj;
        if (!C14360o3.A0K(this.A01, superlativeStickerClientModel.A01) || !C14360o3.A0K(this.A02, superlativeStickerClientModel.A02) || !C14360o3.A0K(this.A03, superlativeStickerClientModel.A03) || this.A00 != superlativeStickerClientModel.A00 || !C14360o3.A0K(this.A04, superlativeStickerClientModel.A04)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode() + this.A02.hashCode() + this.A03.hashCode() + this.A00.hashCode() + this.A04.hashCode();
    }
}
